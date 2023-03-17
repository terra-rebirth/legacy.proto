//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/query.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAggregateVotesResponse")
public inline fun queryAggregateVotesResponse(block: terra.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse =
  terra.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl._create(terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.newBuilder()).apply { block() }._build()
public object QueryAggregateVotesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AggregateVotesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     */
     public val aggregateVotes: com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getAggregateVotesList()
      )
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAggregateVotes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.add(value: terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      _builder.addAggregateVotes(value)
    }
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAggregateVotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.plusAssign(value: terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      add(value)
    }
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllAggregateVotes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.addAll(values: kotlin.collections.Iterable<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote>) {
      _builder.addAllAggregateVotes(values)
    }
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The aggregateVotes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllAggregateVotes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.plusAssign(values: kotlin.collections.Iterable<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote>) {
      addAll(values)
    }
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The aggregateVotes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setAggregateVotes")
    public operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.set(index: kotlin.Int, value: terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote) {
      _builder.setAggregateVotes(index, value)
    }
    /**
     * <pre>
     * aggregate_votes defines all oracle aggregate votes submitted in the current vote period
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.AggregateExchangeRateVote aggregate_votes = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearAggregateVotes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.AggregateExchangeRateVote, AggregateVotesProxy>.clear() {
      _builder.clearAggregateVotes()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse.copy(block: terra.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVotesResponse =
  terra.oracle.v1beta1.QueryAggregateVotesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

