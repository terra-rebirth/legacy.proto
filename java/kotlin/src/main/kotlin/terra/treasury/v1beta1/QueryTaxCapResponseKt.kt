//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/treasury/v1beta1/query.proto

package terra.treasury.v1beta1;

@kotlin.jvm.JvmName("-initializequeryTaxCapResponse")
public inline fun queryTaxCapResponse(block: terra.treasury.v1beta1.QueryTaxCapResponseKt.Dsl.() -> kotlin.Unit): terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse =
  terra.treasury.v1beta1.QueryTaxCapResponseKt.Dsl._create(terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse.newBuilder()).apply { block() }._build()
public object QueryTaxCapResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse = _builder.build()

    /**
     * <code>string tax_cap = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public var taxCap: kotlin.String
      @JvmName("getTaxCap")
      get() = _builder.getTaxCap()
      @JvmName("setTaxCap")
      set(value) {
        _builder.setTaxCap(value)
      }
    /**
     * <code>string tax_cap = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     */
    public fun clearTaxCap() {
      _builder.clearTaxCap()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse.copy(block: terra.treasury.v1beta1.QueryTaxCapResponseKt.Dsl.() -> kotlin.Unit): terra.treasury.v1beta1.QueryOuterClass.QueryTaxCapResponse =
  terra.treasury.v1beta1.QueryTaxCapResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

