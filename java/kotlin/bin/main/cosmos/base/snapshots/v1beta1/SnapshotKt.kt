//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/snapshots/v1beta1/snapshot.proto

package cosmos.base.snapshots.v1beta1;

@kotlin.jvm.JvmName("-initializesnapshot")
public inline fun snapshot(block: cosmos.base.snapshots.v1beta1.SnapshotKt.Dsl.() -> kotlin.Unit): cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot =
  cosmos.base.snapshots.v1beta1.SnapshotKt.Dsl._create(cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot.newBuilder()).apply { block() }._build()
public object SnapshotKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot = _builder.build()

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
     * <code>uint32 chunks = 3;</code>
     */
    public var chunks: kotlin.Int
      @JvmName("getChunks")
      get() = _builder.getChunks()
      @JvmName("setChunks")
      set(value) {
        _builder.setChunks(value)
      }
    /**
     * <code>uint32 chunks = 3;</code>
     */
    public fun clearChunks() {
      _builder.clearChunks()
    }

    /**
     * <code>bytes hash = 4;</code>
     */
    public var hash: com.google.protobuf.ByteString
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <code>bytes hash = 4;</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }

    /**
     * <code>.cosmos.base.snapshots.v1beta1.Metadata metadata = 5 [(.gogoproto.nullable) = false];</code>
     */
    public var metadata: cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Metadata
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <code>.cosmos.base.snapshots.v1beta1.Metadata metadata = 5 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }
    /**
     * <code>.cosmos.base.snapshots.v1beta1.Metadata metadata = 5 [(.gogoproto.nullable) = false];</code>
     * @return Whether the metadata field is set.
     */
    public fun hasMetadata(): kotlin.Boolean {
      return _builder.hasMetadata()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot.copy(block: cosmos.base.snapshots.v1beta1.SnapshotKt.Dsl.() -> kotlin.Unit): cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Snapshot =
  cosmos.base.snapshots.v1beta1.SnapshotKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.base.snapshots.v1beta1.SnapshotOuterClass.SnapshotOrBuilder.metadataOrNull: cosmos.base.snapshots.v1beta1.SnapshotOuterClass.Metadata?
  get() = if (hasMetadata()) getMetadata() else null

