//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmName("-initializeattribute")
public inline fun attribute(block: cosmos.base.abci.v1beta1.AttributeKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.Attribute =
  cosmos.base.abci.v1beta1.AttributeKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.Attribute.newBuilder()).apply { block() }._build()
public object AttributeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.abci.v1beta1.Abci.Attribute.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.Attribute.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.Attribute = _builder.build()

    /**
     * <code>string key = 1;</code>
     */
    public var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>string key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>string value = 2;</code>
     */
    public var value: kotlin.String
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>string value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.abci.v1beta1.Abci.Attribute.copy(block: cosmos.base.abci.v1beta1.AttributeKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.Attribute =
  cosmos.base.abci.v1beta1.AttributeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

