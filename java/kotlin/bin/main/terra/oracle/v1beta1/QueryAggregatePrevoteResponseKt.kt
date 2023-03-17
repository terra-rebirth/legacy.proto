//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/query.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAggregatePrevoteResponse")
public inline fun queryAggregatePrevoteResponse(block: terra.oracle.v1beta1.QueryAggregatePrevoteResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse =
  terra.oracle.v1beta1.QueryAggregatePrevoteResponseKt.Dsl._create(terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse.newBuilder()).apply { block() }._build()
public object QueryAggregatePrevoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse = _builder.build()

    /**
     * <pre>
     * aggregate_prevote defines oracle aggregate prevote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevote = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var aggregatePrevote: terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote
      @JvmName("getAggregatePrevote")
      get() = _builder.getAggregatePrevote()
      @JvmName("setAggregatePrevote")
      set(value) {
        _builder.setAggregatePrevote(value)
      }
    /**
     * <pre>
     * aggregate_prevote defines oracle aggregate prevote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevote = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearAggregatePrevote() {
      _builder.clearAggregatePrevote()
    }
    /**
     * <pre>
     * aggregate_prevote defines oracle aggregate prevote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRatePrevote aggregate_prevote = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the aggregatePrevote field is set.
     */
    public fun hasAggregatePrevote(): kotlin.Boolean {
      return _builder.hasAggregatePrevote()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse.copy(block: terra.oracle.v1beta1.QueryAggregatePrevoteResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponse =
  terra.oracle.v1beta1.QueryAggregatePrevoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val terra.oracle.v1beta1.QueryOuterClass.QueryAggregatePrevoteResponseOrBuilder.aggregatePrevoteOrNull: terra.oracle.v1beta1.Oracle.AggregateExchangeRatePrevote?
  get() = if (hasAggregatePrevote()) getAggregatePrevote() else null

