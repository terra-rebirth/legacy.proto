//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package ibc.lightclients.solomachine.v2;

@kotlin.jvm.JvmName("-initializeclientState")
public inline fun clientState(block: ibc.lightclients.solomachine.v2.ClientStateKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.ClientState =
  ibc.lightclients.solomachine.v2.ClientStateKt.Dsl._create(ibc.lightclients.solomachine.v2.Solomachine.ClientState.newBuilder()).apply { block() }._build()
public object ClientStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v2.Solomachine.ClientState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v2.Solomachine.ClientState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v2.Solomachine.ClientState = _builder.build()

    /**
     * <pre>
     * latest sequence of the client state
     * </pre>
     *
     * <code>uint64 sequence = 1;</code>
     */
    public var sequence: kotlin.Long
      @JvmName("getSequence")
      get() = _builder.getSequence()
      @JvmName("setSequence")
      set(value) {
        _builder.setSequence(value)
      }
    /**
     * <pre>
     * latest sequence of the client state
     * </pre>
     *
     * <code>uint64 sequence = 1;</code>
     */
    public fun clearSequence() {
      _builder.clearSequence()
    }

    /**
     * <pre>
     * frozen sequence of the solo machine
     * </pre>
     *
     * <code>bool is_frozen = 2 [(.gogoproto.moretags) = "yaml:&#92;"is_frozen&#92;""];</code>
     */
    public var isFrozen: kotlin.Boolean
      @JvmName("getIsFrozen")
      get() = _builder.getIsFrozen()
      @JvmName("setIsFrozen")
      set(value) {
        _builder.setIsFrozen(value)
      }
    /**
     * <pre>
     * frozen sequence of the solo machine
     * </pre>
     *
     * <code>bool is_frozen = 2 [(.gogoproto.moretags) = "yaml:&#92;"is_frozen&#92;""];</code>
     */
    public fun clearIsFrozen() {
      _builder.clearIsFrozen()
    }

    /**
     * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public var consensusState: ibc.lightclients.solomachine.v2.Solomachine.ConsensusState
      @JvmName("getConsensusState")
      get() = _builder.getConsensusState()
      @JvmName("setConsensusState")
      set(value) {
        _builder.setConsensusState(value)
      }
    /**
     * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public fun clearConsensusState() {
      _builder.clearConsensusState()
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.ConsensusState consensus_state = 3 [(.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     * @return Whether the consensusState field is set.
     */
    public fun hasConsensusState(): kotlin.Boolean {
      return _builder.hasConsensusState()
    }

    /**
     * <pre>
     * when set to true, will allow governance to update a solo machine client.
     * The client will be unfrozen if it is frozen.
     * </pre>
     *
     * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
     */
    public var allowUpdateAfterProposal: kotlin.Boolean
      @JvmName("getAllowUpdateAfterProposal")
      get() = _builder.getAllowUpdateAfterProposal()
      @JvmName("setAllowUpdateAfterProposal")
      set(value) {
        _builder.setAllowUpdateAfterProposal(value)
      }
    /**
     * <pre>
     * when set to true, will allow governance to update a solo machine client.
     * The client will be unfrozen if it is frozen.
     * </pre>
     *
     * <code>bool allow_update_after_proposal = 4 [(.gogoproto.moretags) = "yaml:&#92;"allow_update_after_proposal&#92;""];</code>
     */
    public fun clearAllowUpdateAfterProposal() {
      _builder.clearAllowUpdateAfterProposal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v2.Solomachine.ClientState.copy(block: ibc.lightclients.solomachine.v2.ClientStateKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v2.Solomachine.ClientState =
  ibc.lightclients.solomachine.v2.ClientStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.lightclients.solomachine.v2.Solomachine.ClientStateOrBuilder.consensusStateOrNull: ibc.lightclients.solomachine.v2.Solomachine.ConsensusState?
  get() = if (hasConsensusState()) getConsensusState() else null

