//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmName("-initializequeryDepositsResponse")
public inline fun queryDepositsResponse(block: cosmos.gov.v1beta1.QueryDepositsResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse =
  cosmos.gov.v1beta1.QueryDepositsResponseKt.Dsl._create(cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse.newBuilder()).apply { block() }._build()
public object QueryDepositsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DepositsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     */
     public val deposits: com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDepositsList()
      )
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.add(value: cosmos.gov.v1beta1.Gov.Deposit) {
      _builder.addDeposits(value)
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     * @param value The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDeposits")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.plusAssign(value: cosmos.gov.v1beta1.Gov.Deposit) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1beta1.Gov.Deposit>) {
      _builder.addAllDeposits(values)
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     * @param values The deposits to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDeposits")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1beta1.Gov.Deposit>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The deposits to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDeposits")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.set(index: kotlin.Int, value: cosmos.gov.v1beta1.Gov.Deposit) {
      _builder.setDeposits(index, value)
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDeposits")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.Deposit, DepositsProxy>.clear() {
      _builder.clearDeposits()
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
public inline fun cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse.copy(block: cosmos.gov.v1beta1.QueryDepositsResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponse =
  cosmos.gov.v1beta1.QueryDepositsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.gov.v1beta1.QueryOuterClass.QueryDepositsResponseOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageResponse?
  get() = if (hasPagination()) getPagination() else null

