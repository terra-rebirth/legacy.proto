//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/treasury/v1beta1/treasury.proto

package terra.treasury.v1beta1;

@kotlin.jvm.JvmName("-initializepolicyConstraints")
public inline fun policyConstraints(block: terra.treasury.v1beta1.PolicyConstraintsKt.Dsl.() -> kotlin.Unit): terra.treasury.v1beta1.Treasury.PolicyConstraints =
  terra.treasury.v1beta1.PolicyConstraintsKt.Dsl._create(terra.treasury.v1beta1.Treasury.PolicyConstraints.newBuilder()).apply { block() }._build()
public object PolicyConstraintsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.treasury.v1beta1.Treasury.PolicyConstraints.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.treasury.v1beta1.Treasury.PolicyConstraints.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.treasury.v1beta1.Treasury.PolicyConstraints = _builder.build()

    /**
     * <code>string rate_min = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"rate_min&#92;""];</code>
     */
    public var rateMin: kotlin.String
      @JvmName("getRateMin")
      get() = _builder.getRateMin()
      @JvmName("setRateMin")
      set(value) {
        _builder.setRateMin(value)
      }
    /**
     * <code>string rate_min = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"rate_min&#92;""];</code>
     */
    public fun clearRateMin() {
      _builder.clearRateMin()
    }

    /**
     * <code>string rate_max = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"rate_max&#92;""];</code>
     */
    public var rateMax: kotlin.String
      @JvmName("getRateMax")
      get() = _builder.getRateMax()
      @JvmName("setRateMax")
      set(value) {
        _builder.setRateMax(value)
      }
    /**
     * <code>string rate_max = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"rate_max&#92;""];</code>
     */
    public fun clearRateMax() {
      _builder.clearRateMax()
    }

    /**
     * <code>.cosmos.base.v1beta1.Coin cap = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"cap&#92;""];</code>
     */
    public var cap: cosmos.base.v1beta1.CoinOuterClass.Coin
      @JvmName("getCap")
      get() = _builder.getCap()
      @JvmName("setCap")
      set(value) {
        _builder.setCap(value)
      }
    /**
     * <code>.cosmos.base.v1beta1.Coin cap = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"cap&#92;""];</code>
     */
    public fun clearCap() {
      _builder.clearCap()
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin cap = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"cap&#92;""];</code>
     * @return Whether the cap field is set.
     */
    public fun hasCap(): kotlin.Boolean {
      return _builder.hasCap()
    }

    /**
     * <code>string change_rate_max = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"change_rate_max&#92;""];</code>
     */
    public var changeRateMax: kotlin.String
      @JvmName("getChangeRateMax")
      get() = _builder.getChangeRateMax()
      @JvmName("setChangeRateMax")
      set(value) {
        _builder.setChangeRateMax(value)
      }
    /**
     * <code>string change_rate_max = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"change_rate_max&#92;""];</code>
     */
    public fun clearChangeRateMax() {
      _builder.clearChangeRateMax()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.treasury.v1beta1.Treasury.PolicyConstraints.copy(block: terra.treasury.v1beta1.PolicyConstraintsKt.Dsl.() -> kotlin.Unit): terra.treasury.v1beta1.Treasury.PolicyConstraints =
  terra.treasury.v1beta1.PolicyConstraintsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val terra.treasury.v1beta1.Treasury.PolicyConstraintsOrBuilder.capOrNull: cosmos.base.v1beta1.CoinOuterClass.Coin?
  get() = if (hasCap()) getCap() else null

