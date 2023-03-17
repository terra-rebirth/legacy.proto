//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializequeryValidatorDelegationsResponse")
public inline fun queryValidatorDelegationsResponse(block: cosmos.staking.v1beta1.QueryValidatorDelegationsResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse =
  cosmos.staking.v1beta1.QueryValidatorDelegationsResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse.newBuilder()).apply { block() }._build()
public object QueryValidatorDelegationsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DelegationResponsesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     */
     public val delegationResponses: com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDelegationResponsesList()
      )
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     * @param value The delegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDelegationResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.add(value: cosmos.staking.v1beta1.Staking.DelegationResponse) {
      _builder.addDelegationResponses(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     * @param value The delegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDelegationResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.plusAssign(value: cosmos.staking.v1beta1.Staking.DelegationResponse) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     * @param values The delegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDelegationResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.DelegationResponse>) {
      _builder.addAllDelegationResponses(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     * @param values The delegationResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDelegationResponses")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.DelegationResponse>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     * @param index The index to set the value at.
     * @param value The delegationResponses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDelegationResponses")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.set(index: kotlin.Int, value: cosmos.staking.v1beta1.Staking.DelegationResponse) {
      _builder.setDelegationResponses(index, value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDelegationResponses")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.DelegationResponse, DelegationResponsesProxy>.clear() {
      _builder.clearDelegationResponses()
    }


    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse.copy(block: cosmos.staking.v1beta1.QueryValidatorDelegationsResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponse =
  cosmos.staking.v1beta1.QueryValidatorDelegationsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorDelegationsResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null

