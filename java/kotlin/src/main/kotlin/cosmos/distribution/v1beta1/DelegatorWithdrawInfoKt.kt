//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializedelegatorWithdrawInfo")
public inline fun delegatorWithdrawInfo(block: cosmos.distribution.v1beta1.DelegatorWithdrawInfoKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo =
  cosmos.distribution.v1beta1.DelegatorWithdrawInfoKt.Dsl._create(cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo.newBuilder()).apply { block() }._build()
public object DelegatorWithdrawInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo = _builder.build()

    /**
     * <pre>
     * delegator_address is the address of the delegator.
     * </pre>
     *
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <pre>
     * delegator_address is the address of the delegator.
     * </pre>
     *
     * <code>string delegator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <pre>
     * withdraw_address is the address to withdraw the delegation rewards to.
     * </pre>
     *
     * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     */
    public var withdrawAddress: kotlin.String
      @JvmName("getWithdrawAddress")
      get() = _builder.getWithdrawAddress()
      @JvmName("setWithdrawAddress")
      set(value) {
        _builder.setWithdrawAddress(value)
      }
    /**
     * <pre>
     * withdraw_address is the address to withdraw the delegation rewards to.
     * </pre>
     *
     * <code>string withdraw_address = 2 [(.gogoproto.moretags) = "yaml:&#92;"withdraw_address&#92;""];</code>
     */
    public fun clearWithdrawAddress() {
      _builder.clearWithdrawAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo.copy(block: cosmos.distribution.v1beta1.DelegatorWithdrawInfoKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.DelegatorWithdrawInfo =
  cosmos.distribution.v1beta1.DelegatorWithdrawInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

