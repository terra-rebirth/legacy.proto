//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/genesis.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializemissCounter")
public inline fun missCounter(block: terra.oracle.v1beta1.MissCounterKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Genesis.MissCounter =
  terra.oracle.v1beta1.MissCounterKt.Dsl._create(terra.oracle.v1beta1.Genesis.MissCounter.newBuilder()).apply { block() }._build()
public object MissCounterKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.Genesis.MissCounter.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.Genesis.MissCounter.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.Genesis.MissCounter = _builder.build()

    /**
     * <code>string validator_address = 1;</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <code>string validator_address = 1;</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <code>uint64 miss_counter = 2;</code>
     */
    public var missCounter: kotlin.Long
      @JvmName("getMissCounter")
      get() = _builder.getMissCounter()
      @JvmName("setMissCounter")
      set(value) {
        _builder.setMissCounter(value)
      }
    /**
     * <code>uint64 miss_counter = 2;</code>
     */
    public fun clearMissCounter() {
      _builder.clearMissCounter()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.Genesis.MissCounter.copy(block: terra.oracle.v1beta1.MissCounterKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Genesis.MissCounter =
  terra.oracle.v1beta1.MissCounterKt.Dsl._create(this.toBuilder()).apply { block() }._build()

