//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/slashing/v1beta1/genesis.proto

package cosmos.slashing.v1beta1;

@kotlin.jvm.JvmName("-initializesigningInfo")
public inline fun signingInfo(block: cosmos.slashing.v1beta1.SigningInfoKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.SigningInfo =
  cosmos.slashing.v1beta1.SigningInfoKt.Dsl._create(cosmos.slashing.v1beta1.Genesis.SigningInfo.newBuilder()).apply { block() }._build()
public object SigningInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.slashing.v1beta1.Genesis.SigningInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.slashing.v1beta1.Genesis.SigningInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.slashing.v1beta1.Genesis.SigningInfo = _builder.build()

    /**
     * <pre>
     * address is the validator address.
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public var address: kotlin.String
      @JvmName("getAddress")
      get() = _builder.getAddress()
      @JvmName("setAddress")
      set(value) {
        _builder.setAddress(value)
      }
    /**
     * <pre>
     * address is the validator address.
     * </pre>
     *
     * <code>string address = 1;</code>
     */
    public fun clearAddress() {
      _builder.clearAddress()
    }

    /**
     * <pre>
     * validator_signing_info represents the signing info of this validator.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo validator_signing_info = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"validator_signing_info&#92;""];</code>
     */
    public var validatorSigningInfo: cosmos.slashing.v1beta1.Slashing.ValidatorSigningInfo
      @JvmName("getValidatorSigningInfo")
      get() = _builder.getValidatorSigningInfo()
      @JvmName("setValidatorSigningInfo")
      set(value) {
        _builder.setValidatorSigningInfo(value)
      }
    /**
     * <pre>
     * validator_signing_info represents the signing info of this validator.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo validator_signing_info = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"validator_signing_info&#92;""];</code>
     */
    public fun clearValidatorSigningInfo() {
      _builder.clearValidatorSigningInfo()
    }
    /**
     * <pre>
     * validator_signing_info represents the signing info of this validator.
     * </pre>
     *
     * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo validator_signing_info = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"validator_signing_info&#92;""];</code>
     * @return Whether the validatorSigningInfo field is set.
     */
    public fun hasValidatorSigningInfo(): kotlin.Boolean {
      return _builder.hasValidatorSigningInfo()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.slashing.v1beta1.Genesis.SigningInfo.copy(block: cosmos.slashing.v1beta1.SigningInfoKt.Dsl.() -> kotlin.Unit): cosmos.slashing.v1beta1.Genesis.SigningInfo =
  cosmos.slashing.v1beta1.SigningInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.slashing.v1beta1.Genesis.SigningInfoOrBuilder.validatorSigningInfoOrNull: cosmos.slashing.v1beta1.Slashing.ValidatorSigningInfo?
  get() = if (hasValidatorSigningInfo()) getValidatorSigningInfo() else null

