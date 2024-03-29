# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: terra/tx/v1beta1/service.proto
# plugin: python-betterproto
import warnings
from dataclasses import dataclass
from typing import (
    TYPE_CHECKING,
    Dict,
    List,
    Optional,
)

import betterproto
import grpclib
from betterproto.grpc.grpclib_server import ServiceBase

from ....cosmos.base import v1beta1 as ___cosmos_base_v1_beta1__
from ....cosmos.tx import v1beta1 as ___cosmos_tx_v1_beta1__


if TYPE_CHECKING:
    import grpclib.server
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


@dataclass(eq=False, repr=False)
class ComputeTaxRequest(betterproto.Message):
    """
    ComputeTaxRequest is the request type for the Service.ComputeTax RPC
    method.
    """

    tx: "___cosmos_tx_v1_beta1__.Tx" = betterproto.message_field(1)
    """
    tx is the transaction to simulate. Deprecated. Send raw tx bytes instead.
    """

    tx_bytes: bytes = betterproto.bytes_field(2)
    """tx_bytes is the raw transaction."""

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("tx"):
            warnings.warn("ComputeTaxRequest.tx is deprecated", DeprecationWarning)


@dataclass(eq=False, repr=False)
class ComputeTaxResponse(betterproto.Message):
    """
    ComputeTaxResponse is the response type for the Service.ComputeTax RPC
    method.
    """

    tax_amount: List["___cosmos_base_v1_beta1__.Coin"] = betterproto.message_field(1)
    """amount is the amount of coins to be paid as a fee"""


class ServiceStub(betterproto.ServiceStub):
    async def compute_tax(
        self,
        compute_tax_request: "ComputeTaxRequest",
        *,
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["MetadataLike"] = None
    ) -> "ComputeTaxResponse":
        return await self._unary_unary(
            "/terra.tx.v1beta1.Service/ComputeTax",
            compute_tax_request,
            ComputeTaxResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class ServiceBase(ServiceBase):
    async def compute_tax(
        self, compute_tax_request: "ComputeTaxRequest"
    ) -> "ComputeTaxResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_compute_tax(
        self, stream: "grpclib.server.Stream[ComputeTaxRequest, ComputeTaxResponse]"
    ) -> None:
        request = await stream.recv_message()
        response = await self.compute_tax(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/terra.tx.v1beta1.Service/ComputeTax": grpclib.const.Handler(
                self.__rpc_compute_tax,
                grpclib.const.Cardinality.UNARY_UNARY,
                ComputeTaxRequest,
                ComputeTaxResponse,
            ),
        }
