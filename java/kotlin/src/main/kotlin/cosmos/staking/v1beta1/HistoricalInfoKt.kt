//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmName("-initializehistoricalInfo")
public inline fun historicalInfo(block: cosmos.staking.v1beta1.HistoricalInfoKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.HistoricalInfo =
  cosmos.staking.v1beta1.HistoricalInfoKt.Dsl._create(cosmos.staking.v1beta1.Staking.HistoricalInfo.newBuilder()).apply { block() }._build()
public object HistoricalInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Staking.HistoricalInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Staking.HistoricalInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Staking.HistoricalInfo = _builder.build()

    /**
     * <code>.tendermint.types.Header header = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var header: tendermint.types.Types.Header
      @JvmName("getHeader")
      get() = _builder.getHeader()
      @JvmName("setHeader")
      set(value) {
        _builder.setHeader(value)
      }
    /**
     * <code>.tendermint.types.Header header = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearHeader() {
      _builder.clearHeader()
    }
    /**
     * <code>.tendermint.types.Header header = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the header field is set.
     */
    public fun hasHeader(): kotlin.Boolean {
      return _builder.hasHeader()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValsetProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     */
     public val valset: com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValsetList()
      )
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     * @param value The valset to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValset")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.add(value: cosmos.staking.v1beta1.Staking.Validator) {
      _builder.addValset(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     * @param value The valset to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValset")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.plusAssign(value: cosmos.staking.v1beta1.Staking.Validator) {
      add(value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     * @param values The valset to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValset")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.addAll(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.Validator>) {
      _builder.addAllValset(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     * @param values The valset to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValset")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.staking.v1beta1.Staking.Validator>) {
      addAll(values)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The valset to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValset")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.set(index: kotlin.Int, value: cosmos.staking.v1beta1.Staking.Validator) {
      _builder.setValset(index, value)
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.Validator valset = 2 [(.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValset")
    public fun com.google.protobuf.kotlin.DslList<cosmos.staking.v1beta1.Staking.Validator, ValsetProxy>.clear() {
      _builder.clearValset()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Staking.HistoricalInfo.copy(block: cosmos.staking.v1beta1.HistoricalInfoKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.HistoricalInfo =
  cosmos.staking.v1beta1.HistoricalInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.staking.v1beta1.Staking.HistoricalInfoOrBuilder.headerOrNull: tendermint.types.Types.Header?
  get() = if (hasHeader()) getHeader() else null

