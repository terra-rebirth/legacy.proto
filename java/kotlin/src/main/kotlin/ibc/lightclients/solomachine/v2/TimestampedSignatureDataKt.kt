//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package ibc.lightclients.solomachine.v2;

@kotlin.jvm.JvmName("-initializetimestampedSignatureData")
public inline fun timestampedSignatureData(block: ibc.lightclients.solomachine.v2.TimestampedSignatureDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData =
  ibc.lightclients.solomachine.v2.TimestampedSignatureDataKt.Dsl._create(ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData.newBuilder()).apply { block() }._build()
public object TimestampedSignatureDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData = _builder.build()

    /**
     * <code>bytes signature_data = 1 [(.gogoproto.moretags) = "yaml:&#92;"signature_data&#92;""];</code>
     */
    public var signatureData: com.google.protobuf.ByteString
      @JvmName("getSignatureData")
      get() = _builder.getSignatureData()
      @JvmName("setSignatureData")
      set(value) {
        _builder.setSignatureData(value)
      }
    /**
     * <code>bytes signature_data = 1 [(.gogoproto.moretags) = "yaml:&#92;"signature_data&#92;""];</code>
     */
    public fun clearSignatureData() {
      _builder.clearSignatureData()
    }

    /**
     * <code>uint64 timestamp = 2;</code>
     */
    public var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.getTimestamp()
      @JvmName("setTimestamp")
      set(value) {
        _builder.setTimestamp(value)
      }
    /**
     * <code>uint64 timestamp = 2;</code>
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData.copy(block: ibc.lightclients.solomachine.v2.TimestampedSignatureDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.TimestampedSignatureData =
  ibc.lightclients.solomachine.v2.TimestampedSignatureDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

