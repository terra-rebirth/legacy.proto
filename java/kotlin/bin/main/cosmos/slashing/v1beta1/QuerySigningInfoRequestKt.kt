//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/v1beta1/query.proto

package cosmos.slashing.v1beta1;

@kotlin.jvm.JvmName("-initializequerySigningInfoRequest")
public inline fun querySigningInfoRequest(block: cosmos.slashing.v1beta1.QuerySigningInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest =
  cosmos.slashing.v1beta1.QuerySigningInfoRequestKt.Dsl._create(cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest.newBuilder()).apply { block() }._build()
public object QuerySigningInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest = _builder.build()

    /**
     * <pre>
     * cons_address is the address to query signing info of
     * </pre>
     *
     * <code>string cons_address = 1;</code>
     */
    public var consAddress: kotlin.String
      @JvmName("getConsAddress")
      get() = _builder.getConsAddress()
      @JvmName("setConsAddress")
      set(value) {
        _builder.setConsAddress(value)
      }
    /**
     * <pre>
     * cons_address is the address to query signing info of
     * </pre>
     *
     * <code>string cons_address = 1;</code>
     */
    public fun clearConsAddress() {
      _builder.clearConsAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest.copy(block: cosmos.slashing.v1beta1.QuerySigningInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.QueryOuterClass.QuerySigningInfoRequest =
  cosmos.slashing.v1beta1.QuerySigningInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

