//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmName("-initializevalidatorSlashEventRecord")
public inline fun validatorSlashEventRecord(block: cosmos.distribution.v1beta1.ValidatorSlashEventRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord =
  cosmos.distribution.v1beta1.ValidatorSlashEventRecordKt.Dsl._create(cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord.newBuilder()).apply { block() }._build()
public object ValidatorSlashEventRecordKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord = _builder.build()

    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [(.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <pre>
     * height defines the block height at which the slash event occured.
     * </pre>
     *
     * <code>uint64 height = 2;</code>
     */
    public var height: kotlin.Long
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <pre>
     * height defines the block height at which the slash event occured.
     * </pre>
     *
     * <code>uint64 height = 2;</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }

    /**
     * <pre>
     * period is the period of the slash event.
     * </pre>
     *
     * <code>uint64 period = 3;</code>
     */
    public var period: kotlin.Long
      @JvmName("getPeriod")
      get() = _builder.getPeriod()
      @JvmName("setPeriod")
      set(value) {
        _builder.setPeriod(value)
      }
    /**
     * <pre>
     * period is the period of the slash event.
     * </pre>
     *
     * <code>uint64 period = 3;</code>
     */
    public fun clearPeriod() {
      _builder.clearPeriod()
    }

    /**
     * <pre>
     * validator_slash_event describes the slash event.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorSlashEvent validator_slash_event = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"event&#92;""];</code>
     */
    public var validatorSlashEvent: cosmos.distribution.v1beta1.Distribution.ValidatorSlashEvent
      @JvmName("getValidatorSlashEvent")
      get() = _builder.getValidatorSlashEvent()
      @JvmName("setValidatorSlashEvent")
      set(value) {
        _builder.setValidatorSlashEvent(value)
      }
    /**
     * <pre>
     * validator_slash_event describes the slash event.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorSlashEvent validator_slash_event = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"event&#92;""];</code>
     */
    public fun clearValidatorSlashEvent() {
      _builder.clearValidatorSlashEvent()
    }
    /**
     * <pre>
     * validator_slash_event describes the slash event.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorSlashEvent validator_slash_event = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"event&#92;""];</code>
     * @return Whether the validatorSlashEvent field is set.
     */
    public fun hasValidatorSlashEvent(): kotlin.Boolean {
      return _builder.hasValidatorSlashEvent()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord.copy(block: cosmos.distribution.v1beta1.ValidatorSlashEventRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecord =
  cosmos.distribution.v1beta1.ValidatorSlashEventRecordKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.distribution.v1beta1.Genesis.ValidatorSlashEventRecordOrBuilder.validatorSlashEventOrNull: cosmos.distribution.v1beta1.Distribution.ValidatorSlashEvent?
  get() = if (hasValidatorSlashEvent()) getValidatorSlashEvent() else null

