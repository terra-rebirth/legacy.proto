//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmName("-initializeweightedVoteOption")
public inline fun weightedVoteOption(block: cosmos.gov.v1beta1.WeightedVoteOptionKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.WeightedVoteOption =
  cosmos.gov.v1beta1.WeightedVoteOptionKt.Dsl._create(cosmos.gov.v1beta1.Gov.WeightedVoteOption.newBuilder()).apply { block() }._build()
public object WeightedVoteOptionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.Gov.WeightedVoteOption.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Gov.WeightedVoteOption.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Gov.WeightedVoteOption = _builder.build()

    /**
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1;</code>
     */
    public var option: cosmos.gov.v1beta1.Gov.VoteOption
      @JvmName("getOption")
      get() = _builder.getOption()
      @JvmName("setOption")
      set(value) {
        _builder.setOption(value)
      }
    /**
     * <code>.cosmos.gov.v1beta1.VoteOption option = 1;</code>
     */
    public fun clearOption() {
      _builder.clearOption()
    }

    /**
     * <code>string weight = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weight&#92;""];</code>
     */
    public var weight: kotlin.String
      @JvmName("getWeight")
      get() = _builder.getWeight()
      @JvmName("setWeight")
      set(value) {
        _builder.setWeight(value)
      }
    /**
     * <code>string weight = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weight&#92;""];</code>
     */
    public fun clearWeight() {
      _builder.clearWeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta1.Gov.WeightedVoteOption.copy(block: cosmos.gov.v1beta1.WeightedVoteOptionKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Gov.WeightedVoteOption =
  cosmos.gov.v1beta1.WeightedVoteOptionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

