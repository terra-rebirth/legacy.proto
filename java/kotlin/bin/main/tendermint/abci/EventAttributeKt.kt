//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializeeventAttribute")
public inline fun eventAttribute(block: tendermint.abci.EventAttributeKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.EventAttribute =
  tendermint.abci.EventAttributeKt.Dsl._create(tendermint.abci.Types.EventAttribute.newBuilder()).apply { block() }._build()
public object EventAttributeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.EventAttribute.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.EventAttribute.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.EventAttribute = _builder.build()

    /**
     * <code>bytes key = 1;</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2;</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>bool index = 3;</code>
     */
    public var index: kotlin.Boolean
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>bool index = 3;</code>
     */
    public fun clearIndex() {
      _builder.clearIndex()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.EventAttribute.copy(block: tendermint.abci.EventAttributeKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.EventAttribute =
  tendermint.abci.EventAttributeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

