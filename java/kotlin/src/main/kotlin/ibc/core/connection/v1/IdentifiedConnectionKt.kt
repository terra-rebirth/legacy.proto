//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmName("-initializeidentifiedConnection")
public inline fun identifiedConnection(block: ibc.core.connection.v1.IdentifiedConnectionKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.Connection.IdentifiedConnection =
  ibc.core.connection.v1.IdentifiedConnectionKt.Dsl._create(ibc.core.connection.v1.Connection.IdentifiedConnection.newBuilder()).apply { block() }._build()
public object IdentifiedConnectionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.connection.v1.Connection.IdentifiedConnection.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.Connection.IdentifiedConnection.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.Connection.IdentifiedConnection = _builder.build()

    /**
     * <pre>
     * connection identifier.
     * </pre>
     *
     * <code>string id = 1 [(.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * connection identifier.
     * </pre>
     *
     * <code>string id = 1 [(.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * client associated with this connection.
     * </pre>
     *
     * <code>string client_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public var clientId: kotlin.String
      @JvmName("getClientId")
      get() = _builder.getClientId()
      @JvmName("setClientId")
      set(value) {
        _builder.setClientId(value)
      }
    /**
     * <pre>
     * client associated with this connection.
     * </pre>
     *
     * <code>string client_id = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public fun clearClientId() {
      _builder.clearClientId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class VersionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     */
     public val versions: com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getVersionsList()
      )
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     * @param value The versions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addVersions")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.add(value: ibc.core.connection.v1.Connection.Version) {
      _builder.addVersions(value)
    }
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     * @param value The versions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignVersions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.plusAssign(value: ibc.core.connection.v1.Connection.Version) {
      add(value)
    }
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     * @param values The versions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllVersions")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.addAll(values: kotlin.collections.Iterable<ibc.core.connection.v1.Connection.Version>) {
      _builder.addAllVersions(values)
    }
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     * @param values The versions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllVersions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.core.connection.v1.Connection.Version>) {
      addAll(values)
    }
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     * @param index The index to set the value at.
     * @param value The versions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setVersions")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.set(index: kotlin.Int, value: ibc.core.connection.v1.Connection.Version) {
      _builder.setVersions(index, value)
    }
    /**
     * <pre>
     * IBC version which can be utilised to determine encodings or protocols for
     * channels or packets utilising this connection
     * </pre>
     *
     * <code>repeated .ibc.core.connection.v1.Version versions = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearVersions")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.connection.v1.Connection.Version, VersionsProxy>.clear() {
      _builder.clearVersions()
    }


    /**
     * <pre>
     * current state of the connection end.
     * </pre>
     *
     * <code>.ibc.core.connection.v1.State state = 4;</code>
     */
    public var state: ibc.core.connection.v1.Connection.State
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * <pre>
     * current state of the connection end.
     * </pre>
     *
     * <code>.ibc.core.connection.v1.State state = 4;</code>
     */
    public fun clearState() {
      _builder.clearState()
    }

    /**
     * <pre>
     * counterparty chain associated with this connection.
     * </pre>
     *
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 5 [(.gogoproto.nullable) = false];</code>
     */
    public var counterparty: ibc.core.connection.v1.Connection.Counterparty
      @JvmName("getCounterparty")
      get() = _builder.getCounterparty()
      @JvmName("setCounterparty")
      set(value) {
        _builder.setCounterparty(value)
      }
    /**
     * <pre>
     * counterparty chain associated with this connection.
     * </pre>
     *
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 5 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearCounterparty() {
      _builder.clearCounterparty()
    }
    /**
     * <pre>
     * counterparty chain associated with this connection.
     * </pre>
     *
     * <code>.ibc.core.connection.v1.Counterparty counterparty = 5 [(.gogoproto.nullable) = false];</code>
     * @return Whether the counterparty field is set.
     */
    public fun hasCounterparty(): kotlin.Boolean {
      return _builder.hasCounterparty()
    }

    /**
     * <pre>
     * delay period associated with this connection.
     * </pre>
     *
     * <code>uint64 delay_period = 6 [(.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
     */
    public var delayPeriod: kotlin.Long
      @JvmName("getDelayPeriod")
      get() = _builder.getDelayPeriod()
      @JvmName("setDelayPeriod")
      set(value) {
        _builder.setDelayPeriod(value)
      }
    /**
     * <pre>
     * delay period associated with this connection.
     * </pre>
     *
     * <code>uint64 delay_period = 6 [(.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
     */
    public fun clearDelayPeriod() {
      _builder.clearDelayPeriod()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.connection.v1.Connection.IdentifiedConnection.copy(block: ibc.core.connection.v1.IdentifiedConnectionKt.Dsl.() -> kotlin.Unit): ibc.core.connection.v1.Connection.IdentifiedConnection =
  ibc.core.connection.v1.IdentifiedConnectionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.connection.v1.Connection.IdentifiedConnectionOrBuilder.counterpartyOrNull: ibc.core.connection.v1.Connection.Counterparty?
  get() = if (hasCounterparty()) getCounterparty() else null

