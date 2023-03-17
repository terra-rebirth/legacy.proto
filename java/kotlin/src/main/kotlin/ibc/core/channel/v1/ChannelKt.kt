//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializechannel")
public inline fun channel(block: ibc.core.channel.v1.ChannelKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.ChannelOuterClass.Channel =
  ibc.core.channel.v1.ChannelKt.Dsl._create(ibc.core.channel.v1.ChannelOuterClass.Channel.newBuilder()).apply { block() }._build()
public object ChannelKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.ChannelOuterClass.Channel.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.ChannelOuterClass.Channel.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.ChannelOuterClass.Channel = _builder.build()

    /**
     * <pre>
     * current state of the channel end
     * </pre>
     *
     * <code>.ibc.core.channel.v1.State state = 1;</code>
     */
    public var state: ibc.core.channel.v1.ChannelOuterClass.State
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <pre>
     * current state of the channel end
     * </pre>
     *
     * <code>.ibc.core.channel.v1.State state = 1;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }

    /**
     * <pre>
     * whether the channel is ordered or unordered
     * </pre>
     *
     * <code>.ibc.core.channel.v1.Order ordering = 2;</code>
     */
    public var ordering: ibc.core.channel.v1.ChannelOuterClass.Order
      @JvmName("getOrdering")
      get() = _builder.getOrdering()
      @JvmName("setOrdering")
      set(value) {
        _builder.setOrdering(value)
      }
    /**
     * <pre>
     * whether the channel is ordered or unordered
     * </pre>
     *
     * <code>.ibc.core.channel.v1.Order ordering = 2;</code>
     */
    public fun clearOrdering() {
      _builder.clearOrdering()
    }

    /**
     * <pre>
     * counterparty channel end
     * </pre>
     *
     * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [(.gogoproto.nullable) = false];</code>
     */
    public var counterparty: ibc.core.channel.v1.ChannelOuterClass.Counterparty
      @JvmName("getCounterparty")
      get() = _builder.getCounterparty()
      @JvmName("setCounterparty")
      set(value) {
        _builder.setCounterparty(value)
      }
    /**
     * <pre>
     * counterparty channel end
     * </pre>
     *
     * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearCounterparty() {
      _builder.clearCounterparty()
    }
    /**
     * <pre>
     * counterparty channel end
     * </pre>
     *
     * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the counterparty field is set.
     */
    public fun hasCounterparty(): kotlin.Boolean {
      return _builder.hasCounterparty()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ConnectionHopsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @return A list containing the connectionHops.
     */
    public val connectionHops: com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getConnectionHopsList()
      )
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @param value The connectionHops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addConnectionHops")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.add(value: kotlin.String) {
      _builder.addConnectionHops(value)
    }
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @param value The connectionHops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignConnectionHops")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @param values The connectionHops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllConnectionHops")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllConnectionHops(values)
    }
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @param values The connectionHops to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllConnectionHops")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The connectionHops to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setConnectionHops")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setConnectionHops(index, value)
    }/**
     * <pre>
     * list of connection identifiers, in order, along which packets sent on
     * this channel will travel
     * </pre>
     *
     * <code>repeated string connection_hops = 4 [(.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearConnectionHops")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, ConnectionHopsProxy>.clear() {
      _builder.clearConnectionHops()
    }
    /**
     * <pre>
     * opaque channel version, which is agreed upon during the handshake
     * </pre>
     *
     * <code>string version = 5;</code>
     */
    public var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * opaque channel version, which is agreed upon during the handshake
     * </pre>
     *
     * <code>string version = 5;</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.ChannelOuterClass.Channel.copy(block: ibc.core.channel.v1.ChannelKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.ChannelOuterClass.Channel =
  ibc.core.channel.v1.ChannelKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.channel.v1.ChannelOuterClass.ChannelOrBuilder.counterpartyOrNull: ibc.core.channel.v1.ChannelOuterClass.Counterparty?
  get() = if (hasCounterparty()) getCounterparty() else null

