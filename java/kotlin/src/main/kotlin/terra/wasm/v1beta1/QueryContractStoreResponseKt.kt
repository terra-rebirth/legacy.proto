//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/query.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmName("-initializequeryContractStoreResponse")
public inline fun queryContractStoreResponse(block: terra.wasm.v1beta1.QueryContractStoreResponseKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse =
  terra.wasm.v1beta1.QueryContractStoreResponseKt.Dsl._create(terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.newBuilder()).apply { block() }._build()
public object QueryContractStoreResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse = _builder.build()

    /**
     * <code>bytes query_result = 1 [(.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    public var queryResult: com.google.protobuf.ByteString
      @JvmName("getQueryResult")
      get() = _builder.getQueryResult()
      @JvmName("setQueryResult")
      set(value) {
        _builder.setQueryResult(value)
      }
    /**
     * <code>bytes query_result = 1 [(.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     */
    public fun clearQueryResult() {
      _builder.clearQueryResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse.copy(block: terra.wasm.v1beta1.QueryContractStoreResponseKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.QueryOuterClass.QueryContractStoreResponse =
  terra.wasm.v1beta1.QueryContractStoreResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

