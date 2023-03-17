//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: confio/proofs.proto

package ics23;

@kotlin.jvm.JvmName("-initializecompressedExistenceProof")
public inline fun compressedExistenceProof(block: ics23.CompressedExistenceProofKt.Dsl.() -> kotlin.Unit): ics23.Proofs.CompressedExistenceProof =
  ics23.CompressedExistenceProofKt.Dsl._create(ics23.Proofs.CompressedExistenceProof.newBuilder()).apply { block() }._build()
public object CompressedExistenceProofKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ics23.Proofs.CompressedExistenceProof.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ics23.Proofs.CompressedExistenceProof.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ics23.Proofs.CompressedExistenceProof = _builder.build()

    /**
     * <code>bytes key = 1;</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1;</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2;</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2;</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     */
    public var leaf: ics23.Proofs.LeafOp
      @JvmName("getLeaf")
      get() = _builder.getLeaf()
      @JvmName("setLeaf")
      set(value) {
        _builder.setLeaf(value)
      }
    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     */
    public fun clearLeaf() {
      _builder.clearLeaf()
    }
    /**
     * <code>.ics23.LeafOp leaf = 3;</code>
     * @return Whether the leaf field is set.
     */
    public fun hasLeaf(): kotlin.Boolean {
      return _builder.hasLeaf()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PathProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     */
     public val path: com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPathList()
      )
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.add(value: kotlin.Int) {
      _builder.addPath(value)
    }/**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     * @param value The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllPath(values)
    }/**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     * @param values The path to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPath")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     * @param index The index to set the value at.
     * @param value The path to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPath")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setPath(index, value)
    }/**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPath")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, PathProxy>.clear() {
      _builder.clearPath()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun ics23.Proofs.CompressedExistenceProof.copy(block: ics23.CompressedExistenceProofKt.Dsl.() -> kotlin.Unit): ics23.Proofs.CompressedExistenceProof =
  ics23.CompressedExistenceProofKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ics23.Proofs.CompressedExistenceProofOrBuilder.leafOrNull: ics23.Proofs.LeafOp?
  get() = if (hasLeaf()) getLeaf() else null

