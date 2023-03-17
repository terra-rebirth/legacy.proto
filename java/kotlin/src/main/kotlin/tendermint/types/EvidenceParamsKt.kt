//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

@kotlin.jvm.JvmName("-initializeevidenceParams")
public inline fun evidenceParams(block: tendermint.types.EvidenceParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.EvidenceParams =
  tendermint.types.EvidenceParamsKt.Dsl._create(tendermint.types.Params.EvidenceParams.newBuilder()).apply { block() }._build()
public object EvidenceParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Params.EvidenceParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Params.EvidenceParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Params.EvidenceParams = _builder.build()

    /**
     * <pre>
     * Max age of evidence, in blocks.
     * The basic formula for calculating this is: MaxAgeDuration / {average block
     * time}.
     * </pre>
     *
     * <code>int64 max_age_num_blocks = 1;</code>
     */
    public var maxAgeNumBlocks: kotlin.Long
      @JvmName("getMaxAgeNumBlocks")
      get() = _builder.getMaxAgeNumBlocks()
      @JvmName("setMaxAgeNumBlocks")
      set(value) {
        _builder.setMaxAgeNumBlocks(value)
      }
    /**
     * <pre>
     * Max age of evidence, in blocks.
     * The basic formula for calculating this is: MaxAgeDuration / {average block
     * time}.
     * </pre>
     *
     * <code>int64 max_age_num_blocks = 1;</code>
     */
    public fun clearMaxAgeNumBlocks() {
      _builder.clearMaxAgeNumBlocks()
    }

    /**
     * <pre>
     * Max age of evidence, in time.
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public var maxAgeDuration: com.google.protobuf.Duration
      @JvmName("getMaxAgeDuration")
      get() = _builder.getMaxAgeDuration()
      @JvmName("setMaxAgeDuration")
      set(value) {
        _builder.setMaxAgeDuration(value)
      }
    /**
     * <pre>
     * Max age of evidence, in time.
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     */
    public fun clearMaxAgeDuration() {
      _builder.clearMaxAgeDuration()
    }
    /**
     * <pre>
     * Max age of evidence, in time.
     * It should correspond with an app's "unbonding period" or other similar
     * mechanism for handling [Nothing-At-Stake
     * attacks](https://github.com/ethereum/wiki/wiki/Proof-of-Stake-FAQ#what-is-the-nothing-at-stake-problem-and-how-can-it-be-fixed).
     * </pre>
     *
     * <code>.google.protobuf.Duration max_age_duration = 2 [(.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
     * @return Whether the maxAgeDuration field is set.
     */
    public fun hasMaxAgeDuration(): kotlin.Boolean {
      return _builder.hasMaxAgeDuration()
    }

    /**
     * <pre>
     * This sets the maximum size of total evidence in bytes that can be committed in a single block.
     * and should fall comfortably under the max block bytes.
     * Default is 1048576 or 1MB
     * </pre>
     *
     * <code>int64 max_bytes = 3;</code>
     */
    public var maxBytes: kotlin.Long
      @JvmName("getMaxBytes")
      get() = _builder.getMaxBytes()
      @JvmName("setMaxBytes")
      set(value) {
        _builder.setMaxBytes(value)
      }
    /**
     * <pre>
     * This sets the maximum size of total evidence in bytes that can be committed in a single block.
     * and should fall comfortably under the max block bytes.
     * Default is 1048576 or 1MB
     * </pre>
     *
     * <code>int64 max_bytes = 3;</code>
     */
    public fun clearMaxBytes() {
      _builder.clearMaxBytes()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Params.EvidenceParams.copy(block: tendermint.types.EvidenceParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.EvidenceParams =
  tendermint.types.EvidenceParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val tendermint.types.Params.EvidenceParamsOrBuilder.maxAgeDurationOrNull: com.google.protobuf.Duration?
  get() = if (hasMaxAgeDuration()) getMaxAgeDuration() else null

