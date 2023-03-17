//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializequeryConsensusStateResponse")
public inline fun queryConsensusStateResponse(block: ibc.core.client.v1.QueryConsensusStateResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse =
  ibc.core.client.v1.QueryConsensusStateResponseKt.Dsl._create(ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.newBuilder()).apply { block() }._build()
public object QueryConsensusStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse = _builder.build()

    /**
     * <pre>
     * consensus state associated with the client identifier at the given height
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 1;</code>
     */
    public var consensusState: com.google.protobuf.Any
      @JvmName("getConsensusState")
      get() = _builder.getConsensusState()
      @JvmName("setConsensusState")
      set(value) {
        _builder.setConsensusState(value)
      }
    /**
     * <pre>
     * consensus state associated with the client identifier at the given height
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 1;</code>
     */
    public fun clearConsensusState() {
      _builder.clearConsensusState()
    }
    /**
     * <pre>
     * consensus state associated with the client identifier at the given height
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 1;</code>
     * @return Whether the consensusState field is set.
     */
    public fun hasConsensusState(): kotlin.Boolean {
      return _builder.hasConsensusState()
    }

    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    public var proof: com.google.protobuf.ByteString
      @JvmName("getProof")
      get() = _builder.getProof()
      @JvmName("setProof")
      set(value) {
        _builder.setProof(value)
      }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    public fun clearProof() {
      _builder.clearProof()
    }

    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    public var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    public fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.copy(block: ibc.core.client.v1.QueryConsensusStateResponseKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse =
  ibc.core.client.v1.QueryConsensusStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponseOrBuilder.consensusStateOrNull: com.google.protobuf.Any?
  get() = if (hasConsensusState()) getConsensusState() else null

public val ibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponseOrBuilder.proofHeightOrNull: ibc.core.client.v1.Client.Height?
  get() = if (hasProofHeight()) getProofHeight() else null

