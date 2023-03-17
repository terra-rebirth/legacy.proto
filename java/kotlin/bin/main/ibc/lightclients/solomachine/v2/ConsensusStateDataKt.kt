//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package ibc.lightclients.solomachine.v2;

@kotlin.jvm.JvmName("-initializeconsensusStateData")
public inline fun consensusStateData(block: ibc.lightclients.solomachine.v2.ConsensusStateDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData =
  ibc.lightclients.solomachine.v2.ConsensusStateDataKt.Dsl._create(ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData.newBuilder()).apply { block() }._build()
public object ConsensusStateDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData = _builder.build()

    /**
     * <code>bytes path = 1;</code>
     */
    public var path: com.google.protobuf.ByteString
      @JvmName("getPath")
      get() = _builder.getPath()
      @JvmName("setPath")
      set(value) {
        _builder.setPath(value)
      }
    /**
     * <code>bytes path = 1;</code>
     */
    public fun clearPath() {
      _builder.clearPath()
    }

    /**
     * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public var consensusState: com.google.protobuf.Any
      @JvmName("getConsensusState")
      get() = _builder.getConsensusState()
      @JvmName("setConsensusState")
      set(value) {
        _builder.setConsensusState(value)
      }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public fun clearConsensusState() {
      _builder.clearConsensusState()
    }
    /**
     * <code>.google.protobuf.Any consensus_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     * @return Whether the consensusState field is set.
     */
    public fun hasConsensusState(): kotlin.Boolean {
      return _builder.hasConsensusState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData.copy(block: ibc.lightclients.solomachine.v2.ConsensusStateDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateData =
  ibc.lightclients.solomachine.v2.ConsensusStateDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.lightclients.solomachine.v2.Solomachine.ConsensusStateDataOrBuilder.consensusStateOrNull: com.google.protobuf.Any?
  get() = if (hasConsensusState()) getConsensusState() else null

