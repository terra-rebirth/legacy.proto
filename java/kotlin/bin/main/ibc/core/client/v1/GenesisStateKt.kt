//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/genesis.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializegenesisState")
public inline fun genesisState(block: ibc.core.client.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Genesis.GenesisState =
  ibc.core.client.v1.GenesisStateKt.Dsl._create(ibc.core.client.v1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Genesis.GenesisState = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ClientsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
     public val clients: com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getClientsList()
      )
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     * @param value The clients to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addClients")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.add(value: ibc.core.client.v1.Client.IdentifiedClientState) {
      _builder.addClients(value)
    }
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     * @param value The clients to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignClients")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.plusAssign(value: ibc.core.client.v1.Client.IdentifiedClientState) {
      add(value)
    }
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     * @param values The clients to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllClients")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.addAll(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.IdentifiedClientState>) {
      _builder.addAllClients(values)
    }
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     * @param values The clients to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllClients")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.IdentifiedClientState>) {
      addAll(values)
    }
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     * @param index The index to set the value at.
     * @param value The clients to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setClients")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.set(index: kotlin.Int, value: ibc.core.client.v1.Client.IdentifiedClientState) {
      _builder.setClients(index, value)
    }
    /**
     * <pre>
     * client states with their corresponding identifiers
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedClientState clients = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "IdentifiedClientStates"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearClients")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.IdentifiedClientState, ClientsProxy>.clear() {
      _builder.clearClients()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ClientsConsensusProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     */
     public val clientsConsensus: com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getClientsConsensusList()
      )
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     * @param value The clientsConsensus to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addClientsConsensus")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.add(value: ibc.core.client.v1.Client.ClientConsensusStates) {
      _builder.addClientsConsensus(value)
    }
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     * @param value The clientsConsensus to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignClientsConsensus")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.plusAssign(value: ibc.core.client.v1.Client.ClientConsensusStates) {
      add(value)
    }
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     * @param values The clientsConsensus to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllClientsConsensus")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.addAll(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.ClientConsensusStates>) {
      _builder.addAllClientsConsensus(values)
    }
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     * @param values The clientsConsensus to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllClientsConsensus")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.core.client.v1.Client.ClientConsensusStates>) {
      addAll(values)
    }
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     * @param index The index to set the value at.
     * @param value The clientsConsensus to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setClientsConsensus")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.set(index: kotlin.Int, value: ibc.core.client.v1.Client.ClientConsensusStates) {
      _builder.setClientsConsensus(index, value)
    }
    /**
     * <pre>
     * consensus states from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.ClientConsensusStates clients_consensus = 2 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_consensus&#92;"", (.gogoproto.castrepeated) = "ClientsConsensusStates"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearClientsConsensus")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Client.ClientConsensusStates, ClientsConsensusProxy>.clear() {
      _builder.clearClientsConsensus()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ClientsMetadataProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     */
     public val clientsMetadata: com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getClientsMetadataList()
      )
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     * @param value The clientsMetadata to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addClientsMetadata")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.add(value: ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata) {
      _builder.addClientsMetadata(value)
    }
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     * @param value The clientsMetadata to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignClientsMetadata")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.plusAssign(value: ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata) {
      add(value)
    }
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     * @param values The clientsMetadata to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllClientsMetadata")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.addAll(values: kotlin.collections.Iterable<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata>) {
      _builder.addAllClientsMetadata(values)
    }
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     * @param values The clientsMetadata to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllClientsMetadata")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.plusAssign(values: kotlin.collections.Iterable<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata>) {
      addAll(values)
    }
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The clientsMetadata to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setClientsMetadata")
    public operator fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.set(index: kotlin.Int, value: ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata) {
      _builder.setClientsMetadata(index, value)
    }
    /**
     * <pre>
     * metadata from each client
     * </pre>
     *
     * <code>repeated .ibc.core.client.v1.IdentifiedGenesisMetadata clients_metadata = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"clients_metadata&#92;""];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearClientsMetadata")
    public fun com.google.protobuf.kotlin.DslList<ibc.core.client.v1.Genesis.IdentifiedGenesisMetadata, ClientsMetadataProxy>.clear() {
      _builder.clearClientsMetadata()
    }


    /**
     * <code>.ibc.core.client.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     */
    public var params: ibc.core.client.v1.Client.Params
      @JvmName("getParams")
      get() = _builder.getParams()
      @JvmName("setParams")
      set(value) {
        _builder.setParams(value)
      }
    /**
     * <code>.ibc.core.client.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearParams() {
      _builder.clearParams()
    }
    /**
     * <code>.ibc.core.client.v1.Params params = 4 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public fun hasParams(): kotlin.Boolean {
      return _builder.hasParams()
    }

    /**
     * <pre>
     * create localhost on initialization
     * </pre>
     *
     * <code>bool create_localhost = 5 [(.gogoproto.moretags) = "yaml:&#92;"create_localhost&#92;""];</code>
     */
    public var createLocalhost: kotlin.Boolean
      @JvmName("getCreateLocalhost")
      get() = _builder.getCreateLocalhost()
      @JvmName("setCreateLocalhost")
      set(value) {
        _builder.setCreateLocalhost(value)
      }
    /**
     * <pre>
     * create localhost on initialization
     * </pre>
     *
     * <code>bool create_localhost = 5 [(.gogoproto.moretags) = "yaml:&#92;"create_localhost&#92;""];</code>
     */
    public fun clearCreateLocalhost() {
      _builder.clearCreateLocalhost()
    }

    /**
     * <pre>
     * the sequence for the next generated client identifier
     * </pre>
     *
     * <code>uint64 next_client_sequence = 6 [(.gogoproto.moretags) = "yaml:&#92;"next_client_sequence&#92;""];</code>
     */
    public var nextClientSequence: kotlin.Long
      @JvmName("getNextClientSequence")
      get() = _builder.getNextClientSequence()
      @JvmName("setNextClientSequence")
      set(value) {
        _builder.setNextClientSequence(value)
      }
    /**
     * <pre>
     * the sequence for the next generated client identifier
     * </pre>
     *
     * <code>uint64 next_client_sequence = 6 [(.gogoproto.moretags) = "yaml:&#92;"next_client_sequence&#92;""];</code>
     */
    public fun clearNextClientSequence() {
      _builder.clearNextClientSequence()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Genesis.GenesisState.copy(block: ibc.core.client.v1.GenesisStateKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Genesis.GenesisState =
  ibc.core.client.v1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.Genesis.GenesisStateOrBuilder.paramsOrNull: ibc.core.client.v1.Client.Params?
  get() = if (hasParams()) getParams() else null

