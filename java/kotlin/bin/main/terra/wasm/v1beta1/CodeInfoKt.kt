//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/wasm.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmName("-initializecodeInfo")
public inline fun codeInfo(block: terra.wasm.v1beta1.CodeInfoKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.Wasm.CodeInfo =
  terra.wasm.v1beta1.CodeInfoKt.Dsl._create(terra.wasm.v1beta1.Wasm.CodeInfo.newBuilder()).apply { block() }._build()
public object CodeInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.wasm.v1beta1.Wasm.CodeInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.Wasm.CodeInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.Wasm.CodeInfo = _builder.build()

    /**
     * <pre>
     * CodeID is the sequentially increasing unique identifier
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    public var codeId: kotlin.Long
      @JvmName("getCodeId")
      get() = _builder.getCodeId()
      @JvmName("setCodeId")
      set(value) {
        _builder.setCodeId(value)
      }
    /**
     * <pre>
     * CodeID is the sequentially increasing unique identifier
     * </pre>
     *
     * <code>uint64 code_id = 1 [(.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
     */
    public fun clearCodeId() {
      _builder.clearCodeId()
    }

    /**
     * <pre>
     * CodeHash is the unique identifier created by wasmvm
     * </pre>
     *
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     */
    public var codeHash: com.google.protobuf.ByteString
      @JvmName("getCodeHash")
      get() = _builder.getCodeHash()
      @JvmName("setCodeHash")
      set(value) {
        _builder.setCodeHash(value)
      }
    /**
     * <pre>
     * CodeHash is the unique identifier created by wasmvm
     * </pre>
     *
     * <code>bytes code_hash = 2 [(.gogoproto.moretags) = "yaml:&#92;"code_hash&#92;""];</code>
     */
    public fun clearCodeHash() {
      _builder.clearCodeHash()
    }

    /**
     * <pre>
     * Creator address who initially stored the code
     * </pre>
     *
     * <code>string creator = 3 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
     */
    public var creator: kotlin.String
      @JvmName("getCreator")
      get() = _builder.getCreator()
      @JvmName("setCreator")
      set(value) {
        _builder.setCreator(value)
      }
    /**
     * <pre>
     * Creator address who initially stored the code
     * </pre>
     *
     * <code>string creator = 3 [(.gogoproto.moretags) = "yaml:&#92;"creator&#92;""];</code>
     */
    public fun clearCreator() {
      _builder.clearCreator()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.wasm.v1beta1.Wasm.CodeInfo.copy(block: terra.wasm.v1beta1.CodeInfoKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.Wasm.CodeInfo =
  terra.wasm.v1beta1.CodeInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

