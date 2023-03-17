//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializeresponseInfo")
public inline fun responseInfo(block: tendermint.abci.ResponseInfoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseInfo =
  tendermint.abci.ResponseInfoKt.Dsl._create(tendermint.abci.Types.ResponseInfo.newBuilder()).apply { block() }._build()
public object ResponseInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseInfo = _builder.build()

    /**
     * <code>string data = 1;</code>
     */
    public var data: kotlin.String
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>string data = 1;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }

    /**
     * <code>string version = 2;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>string version = 2;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <code>uint64 app_version = 3;</code>
     */
    public var appVersion: kotlin.Long
      @JvmName("getAppVersion")
      get() = _builder.getAppVersion()
      @JvmName("setAppVersion")
      set(value) {
        _builder.setAppVersion(value)
      }
    /**
     * <code>uint64 app_version = 3;</code>
     */
    public fun clearAppVersion() {
      _builder.clearAppVersion()
    }

    /**
     * <code>int64 last_block_height = 4;</code>
     */
    public var lastBlockHeight: kotlin.Long
      @JvmName("getLastBlockHeight")
      get() = _builder.getLastBlockHeight()
      @JvmName("setLastBlockHeight")
      set(value) {
        _builder.setLastBlockHeight(value)
      }
    /**
     * <code>int64 last_block_height = 4;</code>
     */
    public fun clearLastBlockHeight() {
      _builder.clearLastBlockHeight()
    }

    /**
     * <code>bytes last_block_app_hash = 5;</code>
     */
    public var lastBlockAppHash: com.google.protobuf.ByteString
      @JvmName("getLastBlockAppHash")
      get() = _builder.getLastBlockAppHash()
      @JvmName("setLastBlockAppHash")
      set(value) {
        _builder.setLastBlockAppHash(value)
      }
    /**
     * <code>bytes last_block_app_hash = 5;</code>
     */
    public fun clearLastBlockAppHash() {
      _builder.clearLastBlockAppHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseInfo.copy(block: tendermint.abci.ResponseInfoKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseInfo =
  tendermint.abci.ResponseInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

