//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializeresponseLoadSnapshotChunk")
public inline fun responseLoadSnapshotChunk(block: tendermint.abci.ResponseLoadSnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseLoadSnapshotChunk =
  tendermint.abci.ResponseLoadSnapshotChunkKt.Dsl._create(tendermint.abci.Types.ResponseLoadSnapshotChunk.newBuilder()).apply { block() }._build()
public object ResponseLoadSnapshotChunkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseLoadSnapshotChunk.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseLoadSnapshotChunk.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseLoadSnapshotChunk = _builder.build()

    /**
     * <code>bytes chunk = 1;</code>
     */
    public var chunk: com.google.protobuf.ByteString
      @JvmName("getChunk")
      get() = _builder.getChunk()
      @JvmName("setChunk")
      set(value) {
        _builder.setChunk(value)
      }
    /**
     * <code>bytes chunk = 1;</code>
     */
    public fun clearChunk() {
      _builder.clearChunk()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseLoadSnapshotChunk.copy(block: tendermint.abci.ResponseLoadSnapshotChunkKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseLoadSnapshotChunk =
  tendermint.abci.ResponseLoadSnapshotChunkKt.Dsl._create(this.toBuilder()).apply { block() }._build()

