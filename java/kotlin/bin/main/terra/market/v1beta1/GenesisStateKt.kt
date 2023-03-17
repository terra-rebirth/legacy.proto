//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/market/v1beta1/genesis.proto

package terra.market.v1beta1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: terra.market.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.Genesis.GenesisState =
  terra.market.v1beta1.GenesisStateKt.Dsl._create(terra.market.v1beta1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.market.v1beta1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.market.v1beta1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.market.v1beta1.Genesis.GenesisState = _builder.build()

    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var params: terra.market.v1beta1.Market.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }

    /**
     * <pre>
     * the gap between the TerraPool and the BasePool
     * </pre>
     *
     * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public var terraPoolDelta: com.google.protobuf.ByteString
      @JvmName("getTerraPoolDelta")
      get() = _builder.getTerraPoolDelta()
      @JvmName("setTerraPoolDelta")
      set(value) {
        _builder.setTerraPoolDelta(value)
      }
    /**
     * <pre>
     * the gap between the TerraPool and the BasePool
     * </pre>
     *
     * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
     */
    public fun clearTerraPoolDelta() {
      _builder.clearTerraPoolDelta()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.market.v1beta1.Genesis.GenesisState.copy(block: terra.market.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.Genesis.GenesisState =
  terra.market.v1beta1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val terra.market.v1beta1.Genesis.GenesisStateOrBuilder.paramsOrNull: terra.market.v1beta1.Market.Params?
  get() = if (hasParams()) getParams() else null

