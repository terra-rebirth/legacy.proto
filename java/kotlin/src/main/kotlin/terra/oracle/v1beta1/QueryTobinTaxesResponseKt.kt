//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/query.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializequeryTobinTaxesResponse")
public inline fun queryTobinTaxesResponse(block: terra.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse =
  terra.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl._create(terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.newBuilder()).apply { block() }._build()
public object QueryTobinTaxesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TobinTaxesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     */
     public val tobinTaxes: com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTobinTaxesList()
      )
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param value The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTobinTaxes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.add(value: terra.oracle.v1beta1.Oracle.Denom) {
      _builder.addTobinTaxes(value)
    }
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param value The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTobinTaxes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.plusAssign(value: terra.oracle.v1beta1.Oracle.Denom) {
      add(value)
    }
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param values The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTobinTaxes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.addAll(values: kotlin.collections.Iterable<terra.oracle.v1beta1.Oracle.Denom>) {
      _builder.addAllTobinTaxes(values)
    }
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param values The tobinTaxes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTobinTaxes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.plusAssign(values: kotlin.collections.Iterable<terra.oracle.v1beta1.Oracle.Denom>) {
      addAll(values)
    }
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     * @param index The index to set the value at.
     * @param value The tobinTaxes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTobinTaxes")
    public operator fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.set(index: kotlin.Int, value: terra.oracle.v1beta1.Oracle.Denom) {
      _builder.setTobinTaxes(index, value)
    }
    /**
     * <pre>
     * tobin_taxes defines a list of the tobin tax of all whitelisted denoms
     * </pre>
     *
     * <code>repeated .terra.oracle.v1beta1.Denom tobin_taxes = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"tobin_taxes&#92;"", (.gogoproto.castrepeated) = "DenomList"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTobinTaxes")
    public fun com.google.protobuf.kotlin.DslList<terra.oracle.v1beta1.Oracle.Denom, TobinTaxesProxy>.clear() {
      _builder.clearTobinTaxes()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse.copy(block: terra.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.QueryOuterClass.QueryTobinTaxesResponse =
  terra.oracle.v1beta1.QueryTobinTaxesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

