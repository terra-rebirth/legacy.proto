//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmSynthetic
inline fun queryConnectionClientStateResponse(block: ibc.core.connection.v1.QueryConnectionClientStateResponseKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse =
  ibc.core.connection.v1.QueryConnectionClientStateResponseKt.Dsl._create(ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse.newBuilder()).apply { block() }._build()
object QueryConnectionClientStateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse = _builder.build()

    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    var identifiedClientState: ibc.core.client.v1.Client.IdentifiedClientState
      @JvmName("getIdentifiedClientState")
      get() = _builder.getIdentifiedClientState()
      @JvmName("setIdentifiedClientState")
      set(value) {
        _builder.setIdentifiedClientState(value)
      }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     */
    fun clearIdentifiedClientState() {
      _builder.clearIdentifiedClientState()
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1;</code>
     * @return Whether the identifiedClientState field is set.
     */
    fun hasIdentifiedClientState(): kotlin.Boolean {
      return _builder.hasIdentifiedClientState()
    }

    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2;</code>
     */
    var proof: com.google.protobuf.ByteString
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
    fun clearProof() {
      _builder.clearProof()
    }

    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false];</code>
     */
    var proofHeight: ibc.core.client.v1.Client.Height
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
    fun clearProofHeight() {
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
    fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse.copy(block: ibc.core.connection.v1.QueryConnectionClientStateResponseKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryConnectionClientStateResponse =
  ibc.core.connection.v1.QueryConnectionClientStateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()