//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/query.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAggregateVoteRequest")
public inline fun queryAggregateVoteRequest(block: terra.oracle.v1beta1.QueryAggregateVoteRequestKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest =
  terra.oracle.v1beta1.QueryAggregateVoteRequestKt.Dsl._create(terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest.newBuilder()).apply { block() }._build()
public object QueryAggregateVoteRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest = _builder.build()

    /**
     * <pre>
     * validator defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    public var validatorAddr: kotlin.String
      @JvmName("getValidatorAddr")
      get() = _builder.getValidatorAddr()
      @JvmName("setValidatorAddr")
      set(value) {
        _builder.setValidatorAddr(value)
      }
    /**
     * <pre>
     * validator defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_addr = 1;</code>
     */
    public fun clearValidatorAddr() {
      _builder.clearValidatorAddr()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest.copy(block: terra.oracle.v1beta1.QueryAggregateVoteRequestKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryAggregateVoteRequest =
  terra.oracle.v1beta1.QueryAggregateVoteRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

