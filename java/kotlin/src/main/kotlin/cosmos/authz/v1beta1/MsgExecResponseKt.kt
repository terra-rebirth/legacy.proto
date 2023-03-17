//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/tx.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmName("-initializemsgExecResponse")
public inline fun msgExecResponse(block: cosmos.authz.v1beta1.MsgExecResponseKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Tx.MsgExecResponse =
  cosmos.authz.v1beta1.MsgExecResponseKt.Dsl._create(cosmos.authz.v1beta1.Tx.MsgExecResponse.newBuilder()).apply { block() }._build()
public object MsgExecResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Tx.MsgExecResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Tx.MsgExecResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Tx.MsgExecResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ResultsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated bytes results = 1;</code>
     */
     public val results: com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getResultsList()
      )
    /**
     * <code>repeated bytes results = 1;</code>
     * @param value The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addResults")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.add(value: com.google.protobuf.ByteString) {
      _builder.addResults(value)
    }/**
     * <code>repeated bytes results = 1;</code>
     * @param value The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignResults")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.plusAssign(value: com.google.protobuf.ByteString) {
      add(value)
    }/**
     * <code>repeated bytes results = 1;</code>
     * @param values The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllResults")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      _builder.addAllResults(values)
    }/**
     * <code>repeated bytes results = 1;</code>
     * @param values The results to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllResults")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.ByteString>) {
      addAll(values)
    }/**
     * <code>repeated bytes results = 1;</code>
     * @param index The index to set the value at.
     * @param value The results to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setResults")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.set(index: kotlin.Int, value: com.google.protobuf.ByteString) {
      _builder.setResults(index, value)
    }/**
     * <code>repeated bytes results = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearResults")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.ByteString, ResultsProxy>.clear() {
      _builder.clearResults()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Tx.MsgExecResponse.copy(block: cosmos.authz.v1beta1.MsgExecResponseKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Tx.MsgExecResponse =
  cosmos.authz.v1beta1.MsgExecResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

