//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/store/v1beta1/commit_info.proto

package cosmos.base.store.v1beta1;

@kotlin.jvm.JvmName("-initializestoreInfo")
public inline fun storeInfo(block: cosmos.base.store.v1beta1.StoreInfoKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo =
  cosmos.base.store.v1beta1.StoreInfoKt.Dsl._create(cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo.newBuilder()).apply { block() }._build()
public object StoreInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo = _builder.build()

    /**
     * <code>string name = 1;</code>
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <code>string name = 1;</code>
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * <code>.cosmos.base.store.v1beta1.CommitID commit_id = 2 [(.gogoproto.nullable) = false];</code>
     */
    public var commitId: cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID
      @JvmName("getCommitId")
      get() = _builder.getCommitId()
      @JvmName("setCommitId")
      set(value) {
        _builder.setCommitId(value)
      }
    /**
     * <code>.cosmos.base.store.v1beta1.CommitID commit_id = 2 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearCommitId() {
      _builder.clearCommitId()
    }
    /**
     * <code>.cosmos.base.store.v1beta1.CommitID commit_id = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the commitId field is set.
     */
    public fun hasCommitId(): kotlin.Boolean {
      return _builder.hasCommitId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo.copy(block: cosmos.base.store.v1beta1.StoreInfoKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfo =
  cosmos.base.store.v1beta1.StoreInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.base.store.v1beta1.CommitInfoOuterClass.StoreInfoOrBuilder.commitIdOrNull: cosmos.base.store.v1beta1.CommitInfoOuterClass.CommitID?
  get() = if (hasCommitId()) getCommitId() else null

