//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/crypto/ed25519/keys.proto

package cosmos.crypto.ed25519;

@kotlin.jvm.JvmName("-initializepubKey")
public inline fun pubKey(block: cosmos.crypto.ed25519.PubKeyKt.Dsl.() -> kotlin.Unit): cosmos.crypto.ed25519.Keys.PubKey =
  cosmos.crypto.ed25519.PubKeyKt.Dsl._create(cosmos.crypto.ed25519.Keys.PubKey.newBuilder()).apply { block() }._build()
public object PubKeyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.crypto.ed25519.Keys.PubKey.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.crypto.ed25519.Keys.PubKey.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.crypto.ed25519.Keys.PubKey = _builder.build()

    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.crypto.ed25519.Keys.PubKey.copy(block: cosmos.crypto.ed25519.PubKeyKt.Dsl.() -> kotlin.Unit): cosmos.crypto.ed25519.Keys.PubKey =
  cosmos.crypto.ed25519.PubKeyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

