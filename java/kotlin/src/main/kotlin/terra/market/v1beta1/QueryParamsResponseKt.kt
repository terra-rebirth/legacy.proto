//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/market/v1beta1/query.proto

package terra.market.v1beta1;

@kotlin.jvm.JvmName("-initializequeryParamsResponse")
public inline fun queryParamsResponse(block: terra.market.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.QueryOuterClass.QueryParamsResponse =
  terra.market.v1beta1.QueryParamsResponseKt.Dsl._create(terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.newBuilder()).apply { block() }._build()
public object QueryParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.market.v1beta1.QueryOuterClass.QueryParamsResponse = _builder.build()

    /**
     * <pre>
     * params defines the parameters of the module.
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
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.copy(block: terra.market.v1beta1.QueryParamsResponseKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.QueryOuterClass.QueryParamsResponse =
  terra.market.v1beta1.QueryParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val terra.market.v1beta1.QueryOuterClass.QueryParamsResponseOrBuilder.paramsOrNull: terra.market.v1beta1.Market.Params?
  get() = if (hasParams()) getParams() else null

