//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package ibc.core.connection.v1;

@kotlin.jvm.JvmSynthetic
inline fun queryClientConnectionsRequest(block: ibc.core.connection.v1.QueryClientConnectionsRequestKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest =
  ibc.core.connection.v1.QueryClientConnectionsRequestKt.Dsl._create(ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest.newBuilder()).apply { block() }._build()
object QueryClientConnectionsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest = _builder.build()

    /**
     * <pre>
     * client identifier associated with a connection
     * </pre>
     *
     * <code>string client_id = 1;</code>
     */
    var clientId: kotlin.String
      @JvmName("getClientId")
      get() = _builder.getClientId()
      @JvmName("setClientId")
      set(value) {
        _builder.setClientId(value)
      }
    /**
     * <pre>
     * client identifier associated with a connection
     * </pre>
     *
     * <code>string client_id = 1;</code>
     */
    fun clearClientId() {
      _builder.clearClientId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest.copy(block: ibc.core.connection.v1.QueryClientConnectionsRequestKt.Dsl.() -> Unit): ibc.core.connection.v1.QueryOuterClass.QueryClientConnectionsRequest =
  ibc.core.connection.v1.QueryClientConnectionsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()