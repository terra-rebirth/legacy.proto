//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializequeryClientParamsResponse")
public inline fun queryClientParamsResponse(block: ibc.core.client.v1.QueryClientParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse =
  ibc.core.client.v1.QueryClientParamsResponseKt.Dsl._create(ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse.newBuilder()).apply { block() }._build()
public object QueryClientParamsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse = _builder.build()

    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public var params: ibc.core.client.v1.Client.Params
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
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1;</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse.copy(block: ibc.core.client.v1.QueryClientParamsResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponse =
  ibc.core.client.v1.QueryClientParamsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.QueryOuterClass.QueryClientParamsResponseOrBuilder.paramsOrNull: ibc.core.client.v1.Client.Params?
  get() = if (hasParams()) getParams() else null

