# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: terra/vesting/v1beta1/vesting.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import List

import betterproto

from ....cosmos.vesting import v1beta1 as ___cosmos_vesting_v1_beta1__


@dataclass(eq=False, repr=False)
class LazyGradedVestingAccount(betterproto.Message):
    """
    LazyGradedVestingAccount implements the LazyGradedVestingAccount interface.
    It vests all coins according to a predefined schedule.
    """

    base_vesting_account: "___cosmos_vesting_v1_beta1__.BaseVestingAccount" = (
        betterproto.message_field(1)
    )
    vesting_schedules: List["VestingSchedule"] = betterproto.message_field(2)


@dataclass(eq=False, repr=False)
class Schedule(betterproto.Message):
    """Schedule - represent single schedule data for a vesting schedule"""

    start_time: int = betterproto.int64_field(1)
    end_time: int = betterproto.int64_field(2)
    ratio: str = betterproto.string_field(3)


@dataclass(eq=False, repr=False)
class VestingSchedule(betterproto.Message):
    """VestingSchedule defines vesting schedule for a denom"""

    denom: str = betterproto.string_field(1)
    schedules: List["Schedule"] = betterproto.message_field(2)