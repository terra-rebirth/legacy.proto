//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmName("-initializesimulateRequest")
public inline fun simulateRequest(block: cosmos.tx.v1beta1.SimulateRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest =
  cosmos.tx.v1beta1.SimulateRequestKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest.newBuilder()).apply { block() }._build()
public object SimulateRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest = _builder.build()

    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field tx is deprecated") public var tx: cosmos.tx.v1beta1.TxOuterClass.Tx
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.SimulateRequest.tx is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=104
     */
    public fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     * @deprecated cosmos.tx.v1beta1.SimulateRequest.tx is deprecated.
     *     See cosmos/tx/v1beta1/service.proto;l=104
     * @return Whether the tx field is set.
     */
    public fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }

    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bytes tx_bytes = 2;</code>
     */
    public var txBytes: com.google.protobuf.ByteString
      @JvmName("getTxBytes")
      get() = _builder.getTxBytes()
      @JvmName("setTxBytes")
      set(value) {
        _builder.setTxBytes(value)
      }
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bytes tx_bytes = 2;</code>
     */
    public fun clearTxBytes() {
      _builder.clearTxBytes()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest.copy(block: cosmos.tx.v1beta1.SimulateRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequest =
  cosmos.tx.v1beta1.SimulateRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.tx.v1beta1.ServiceOuterClass.SimulateRequestOrBuilder.txOrNull: cosmos.tx.v1beta1.TxOuterClass.Tx?
  get() = if (hasTx()) getTx() else null

