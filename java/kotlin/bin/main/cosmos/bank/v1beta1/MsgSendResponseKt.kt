//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/tx.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializemsgSendResponse")
public inline fun msgSendResponse(block: cosmos.bank.v1beta1.MsgSendResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.Tx.MsgSendResponse =
  cosmos.bank.v1beta1.MsgSendResponseKt.Dsl._create(cosmos.bank.v1beta1.Tx.MsgSendResponse.newBuilder()).apply { block() }._build()
public object MsgSendResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.Tx.MsgSendResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.Tx.MsgSendResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.Tx.MsgSendResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.Tx.MsgSendResponse.copy(block: cosmos.bank.v1beta1.MsgSendResponseKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.Tx.MsgSendResponse =
  cosmos.bank.v1beta1.MsgSendResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

