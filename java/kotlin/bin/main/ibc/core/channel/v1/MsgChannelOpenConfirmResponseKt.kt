//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializemsgChannelOpenConfirmResponse")
public inline fun msgChannelOpenConfirmResponse(block: ibc.core.channel.v1.MsgChannelOpenConfirmResponseKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse =
  ibc.core.channel.v1.MsgChannelOpenConfirmResponseKt.Dsl._create(ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse.newBuilder()).apply { block() }._build()
public object MsgChannelOpenConfirmResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse.copy(block: ibc.core.channel.v1.MsgChannelOpenConfirmResponseKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgChannelOpenConfirmResponse =
  ibc.core.channel.v1.MsgChannelOpenConfirmResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

