//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializebroadcastTxResponse")
public inline fun broadcastTxResponse(block: cosmos.tx.v1beta1.BroadcastTxResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse =
  cosmos.tx.v1beta1.BroadcastTxResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse.newBuilder()).apply { block() }._build()
public object BroadcastTxResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse = _builder.build()

    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1;</code>
     */
    public var txResponse: cosmos.base.abci.v1beta1.Abci.TxResponse
      @JvmName("getTxResponse")
      get() = _builder.getTxResponse()
      @JvmName("setTxResponse")
      set(value) {
        _builder.setTxResponse(value)
      }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1;</code>
     */
    public fun clearTxResponse() {
      _builder.clearTxResponse()
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1;</code>
     * @return Whether the txResponse field is set.
     */
    public fun hasTxResponse(): kotlin.Boolean {
      return _builder.hasTxResponse()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse.copy(block: cosmos.tx.v1beta1.BroadcastTxResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponse =
  cosmos.tx.v1beta1.BroadcastTxResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.tx.v1beta1.ServiceOuterClass.BroadcastTxResponseOrBuilder.txResponseOrNull: cosmos.base.abci.v1beta1.Abci.TxResponse?
  get() = if (hasTxResponse()) getTxResponse() else null

