//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package cosmos.evidence.v1beta1;

@kotlin.jvm.JvmName("-initializequeryEvidenceRequest")
public inline fun queryEvidenceRequest(block: cosmos.evidence.v1beta1.QueryEvidenceRequestKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest =
  cosmos.evidence.v1beta1.QueryEvidenceRequestKt.Dsl._create(cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest.newBuilder()).apply { block() }._build()
public object QueryEvidenceRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest = _builder.build()

    /**
     * <pre>
     * evidence_hash defines the hash of the requested evidence.
     * </pre>
     *
     * <code>bytes evidence_hash = 1 [(.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
     */
    public var evidenceHash: com.google.protobuf.ByteString
      @JvmName("getEvidenceHash")
      get() = _builder.getEvidenceHash()
      @JvmName("setEvidenceHash")
      set(value) {
        _builder.setEvidenceHash(value)
      }
    /**
     * <pre>
     * evidence_hash defines the hash of the requested evidence.
     * </pre>
     *
     * <code>bytes evidence_hash = 1 [(.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
     */
    public fun clearEvidenceHash() {
      _builder.clearEvidenceHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest.copy(block: cosmos.evidence.v1beta1.QueryEvidenceRequestKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryEvidenceRequest =
  cosmos.evidence.v1beta1.QueryEvidenceRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

