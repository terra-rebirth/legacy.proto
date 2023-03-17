//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

@kotlin.jvm.JvmName("-initializecompressedBatchEntry")
public inline fun compressedBatchEntry(block: ics23.CompressedBatchEntryKt.Dsl.() -> kotlin.Unit): ics23.Proofs.CompressedBatchEntry =
  ics23.CompressedBatchEntryKt.Dsl._create(ics23.Proofs.CompressedBatchEntry.newBuilder()).apply { block() }._build()
public object CompressedBatchEntryKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ics23.Proofs.CompressedBatchEntry.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ics23.Proofs.CompressedBatchEntry.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ics23.Proofs.CompressedBatchEntry = _builder.build()

    /**
     * <code>.ics23.CompressedExistenceProof exist = 1;</code>
     */
    public var exist: ics23.Proofs.CompressedExistenceProof
      @JvmName("getExist")
      get() = _builder.getExist()
      @JvmName("setExist")
      set(value) {
        _builder.setExist(value)
      }
    /**
     * <code>.ics23.CompressedExistenceProof exist = 1;</code>
     */
    public fun clearExist() {
      _builder.clearExist()
    }
    /**
     * <code>.ics23.CompressedExistenceProof exist = 1;</code>
     * @return Whether the exist field is set.
     */
    public fun hasExist(): kotlin.Boolean {
      return _builder.hasExist()
    }

    /**
     * <code>.ics23.CompressedNonExistenceProof nonexist = 2;</code>
     */
    public var nonexist: ics23.Proofs.CompressedNonExistenceProof
      @JvmName("getNonexist")
      get() = _builder.getNonexist()
      @JvmName("setNonexist")
      set(value) {
        _builder.setNonexist(value)
      }
    /**
     * <code>.ics23.CompressedNonExistenceProof nonexist = 2;</code>
     */
    public fun clearNonexist() {
      _builder.clearNonexist()
    }
    /**
     * <code>.ics23.CompressedNonExistenceProof nonexist = 2;</code>
     * @return Whether the nonexist field is set.
     */
    public fun hasNonexist(): kotlin.Boolean {
      return _builder.hasNonexist()
    }
    public val proofCase: ics23.Proofs.CompressedBatchEntry.ProofCase
      @JvmName("getProofCase")
      get() = _builder.getProofCase()

    public fun clearProof() {
      _builder.clearProof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ics23.Proofs.CompressedBatchEntry.copy(block: ics23.CompressedBatchEntryKt.Dsl.() -> kotlin.Unit): ics23.Proofs.CompressedBatchEntry =
  ics23.CompressedBatchEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ics23.Proofs.CompressedBatchEntryOrBuilder.existOrNull: ics23.Proofs.CompressedExistenceProof?
  get() = if (hasExist()) getExist() else null

public val ics23.Proofs.CompressedBatchEntryOrBuilder.nonexistOrNull: ics23.Proofs.CompressedNonExistenceProof?
  get() = if (hasNonexist()) getNonexist() else null

