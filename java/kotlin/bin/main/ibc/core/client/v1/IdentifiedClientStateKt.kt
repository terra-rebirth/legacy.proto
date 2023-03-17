//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package ibc.core.client.v1;

@kotlin.jvm.JvmName("-initializeidentifiedClientState")
public inline fun identifiedClientState(block: ibc.core.client.v1.IdentifiedClientStateKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.IdentifiedClientState =
  ibc.core.client.v1.IdentifiedClientStateKt.Dsl._create(ibc.core.client.v1.Client.IdentifiedClientState.newBuilder()).apply { block() }._build()
public object IdentifiedClientStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.client.v1.Client.IdentifiedClientState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.client.v1.Client.IdentifiedClientState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.client.v1.Client.IdentifiedClientState = _builder.build()

    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     */
    public fun clearClientId() {
      _builder.clearClientId()
    }

    /**
     * <pre>
     * client state
     * </pre>
     *
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     */
    public var clientState: com.google.protobuf.Any
      @JvmName("getClientState")
      get() = _builder.getClientState()
      @JvmName("setClientState")
      set(value) {
        _builder.setClientState(value)
      }
    /**
     * <pre>
     * client state
     * </pre>
     *
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     */
    public fun clearClientState() {
      _builder.clearClientState()
    }
    /**
     * <pre>
     * client state
     * </pre>
     *
     * <code>.google.protobuf.Any client_state = 2 [(.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
     * @return Whether the clientState field is set.
     */
    public fun hasClientState(): kotlin.Boolean {
      return _builder.hasClientState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.client.v1.Client.IdentifiedClientState.copy(block: ibc.core.client.v1.IdentifiedClientStateKt.Dsl.() -> kotlin.Unit): ibc.core.client.v1.Client.IdentifiedClientState =
  ibc.core.client.v1.IdentifiedClientStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.client.v1.Client.IdentifiedClientStateOrBuilder.clientStateOrNull: com.google.protobuf.Any?
  get() = if (hasClientState()) getClientState() else null

