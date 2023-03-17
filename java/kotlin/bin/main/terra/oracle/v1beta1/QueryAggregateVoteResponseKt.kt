//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/query.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAggregateVoteResponse")
public inline fun queryAggregateVoteResponse(block: terra.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse =
  terra.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl._create(terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.newBuilder()).apply { block() }._build()
public object QueryAggregateVoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse = _builder.build()

    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var aggregateVote: terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote
      @JvmName("getAggregateVote")
      get() = _builder.getAggregateVote()
      @JvmName("setAggregateVote")
      set(value) {
        _builder.setAggregateVote(value)
      }
    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearAggregateVote() {
      _builder.clearAggregateVote()
    }
    /**
     * <pre>
     * aggregate_vote defines oracle aggregate vote submitted by a validator in the current vote period
     * </pre>
     *
     * <code>.terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_vote = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the aggregateVote field is set.
     */
    public fun hasAggregateVote(): kotlin.Boolean {
      return _builder.hasAggregateVote()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse.copy(block: terra.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponse =
  terra.oracle.v1beta1.QueryAggregateVoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteResponseOrBuilder.aggregateVoteOrNull: terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote?
  get() = if (hasAggregateVote()) getAggregateVote() else null

