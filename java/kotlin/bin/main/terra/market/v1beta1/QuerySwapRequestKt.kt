//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/market/v1beta1/query.proto

package terra.market.v1beta1;

@kotlin.jvm.JvmName("-initializequerySwapRequest")
public inline fun querySwapRequest(block: terra.market.v1beta1.QuerySwapRequestKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.QueryOuterClass.QuerySwapRequest =
  terra.market.v1beta1.QuerySwapRequestKt.Dsl._create(terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.newBuilder()).apply { block() }._build()
public object QuerySwapRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.market.v1beta1.QueryOuterClass.QuerySwapRequest = _builder.build()

    /**
     * <pre>
     * offer_coin defines the coin being offered (i.e. 1000000uluna)
     * </pre>
     *
     * <code>string offer_coin = 1;</code>
     */
    public var offerCoin: kotlin.String
      @JvmName("getOfferCoin")
      get() = _builder.getOfferCoin()
      @JvmName("setOfferCoin")
      set(value) {
        _builder.setOfferCoin(value)
      }
    /**
     * <pre>
     * offer_coin defines the coin being offered (i.e. 1000000uluna)
     * </pre>
     *
     * <code>string offer_coin = 1;</code>
     */
    public fun clearOfferCoin() {
      _builder.clearOfferCoin()
    }

    /**
     * <pre>
     * ask_denom defines the denom of the coin to swap to
     * </pre>
     *
     * <code>string ask_denom = 2;</code>
     */
    public var askDenom: kotlin.String
      @JvmName("getAskDenom")
      get() = _builder.getAskDenom()
      @JvmName("setAskDenom")
      set(value) {
        _builder.setAskDenom(value)
      }
    /**
     * <pre>
     * ask_denom defines the denom of the coin to swap to
     * </pre>
     *
     * <code>string ask_denom = 2;</code>
     */
    public fun clearAskDenom() {
      _builder.clearAskDenom()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.copy(block: terra.market.v1beta1.QuerySwapRequestKt.Dsl.() -> kotlin.Unit): terra.market.v1beta1.QueryOuterClass.QuerySwapRequest =
  terra.market.v1beta1.QuerySwapRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

