//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializerequestLoadSnapshotChunk")
public inline fun requestLoadSnapshotChunk(block: tendermint.abci.RequestLoadSnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestLoadSnapshotChunk =
  tendermint.abci.RequestLoadSnapshotChunkKt.Dsl._create(tendermint.abci.Types.RequestLoadSnapshotChunk.newBuilder()).apply { block() }._build()
public object RequestLoadSnapshotChunkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.RequestLoadSnapshotChunk.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.RequestLoadSnapshotChunk.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.RequestLoadSnapshotChunk = _builder.build()

    /**
     * <code>uint64 height = 1;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>uint64 height = 1;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <code>uint32 format = 2;</code>
     */
    public var format: kotlin.Int
      @JvmName("getFormat")
      get() = _builder.getFormat()
      @JvmName("setFormat")
      set(value) {
        _builder.setFormat(value)
      }
    /**
     * <code>uint32 format = 2;</code>
     */
    public fun clearFormat() {
      _builder.clearFormat()
    }

    /**
     * <code>uint32 chunk = 3;</code>
     */
    public var chunk: kotlin.Int
      @JvmName("getChunk")
      get() = _builder.getChunk()
      @JvmName("setChunk")
      set(value) {
        _builder.setChunk(value)
      }
    /**
     * <code>uint32 chunk = 3;</code>
     */
    public fun clearChunk() {
      _builder.clearChunk()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.RequestLoadSnapshotChunk.copy(block: tendermint.abci.RequestLoadSnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.RequestLoadSnapshotChunk =
  tendermint.abci.RequestLoadSnapshotChunkKt.Dsl._create(this.toBuilder()).apply { block() }._build()

