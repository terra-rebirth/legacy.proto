//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/oracle.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializeaggregateExchangeRatePrevote")
public inline fun aggregateExchangeRatePrevote(block: terra.oracle.v1beta1.AggregateExchangeRatePrevoteKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote =
  terra.oracle.v1beta1.AggregateExchangeRatePrevoteKt.Dsl._create(terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote.newBuilder()).apply { block() }._build()
public object AggregateExchangeRatePrevoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote = _builder.build()

    /**
     * <code>string hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"hash&#92;""];</code>
     */
    public var hash: kotlin.String
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>string hash = 1 [(.gogoproto.moretags) = "yaml:&#92;"hash&#92;""];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <code>string voter = 2 [(.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     */
    public var voter: kotlin.String
      @JvmName("getVoter")
      get() = _builder.getVoter()
      @JvmName("setVoter")
      set(value) {
        _builder.setVoter(value)
      }
    /**
     * <code>string voter = 2 [(.gogoproto.moretags) = "yaml:&#92;"voter&#92;""];</code>
     */
    public fun clearVoter() {
      _builder.clearVoter()
    }

    /**
     * <code>uint64 submit_block = 3 [(.gogoproto.moretags) = "yaml:&#92;"submit_block&#92;""];</code>
     */
    public var submitBlock: kotlin.Long
      @JvmName("getSubmitBlock")
      get() = _builder.getSubmitBlock()
      @JvmName("setSubmitBlock")
      set(value) {
        _builder.setSubmitBlock(value)
      }
    /**
     * <code>uint64 submit_block = 3 [(.gogoproto.moretags) = "yaml:&#92;"submit_block&#92;""];</code>
     */
    public fun clearSubmitBlock() {
      _builder.clearSubmitBlock()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote.copy(block: terra.oracle.v1beta1.AggregateExchangeRatePrevoteKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote =
  terra.oracle.v1beta1.AggregateExchangeRatePrevoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()

