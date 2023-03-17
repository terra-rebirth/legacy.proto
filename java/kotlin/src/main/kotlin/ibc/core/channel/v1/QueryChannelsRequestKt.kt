//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializequeryChannelsRequest")
public inline fun queryChannelsRequest(block: ibc.core.channel.v1.QueryChannelsRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest =
  ibc.core.channel.v1.QueryChannelsRequestKt.Dsl._create(ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest.newBuilder()).apply { block() }._build()
public object QueryChannelsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest = _builder.build()

    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest.copy(block: ibc.core.channel.v1.QueryChannelsRequestKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequest =
  ibc.core.channel.v1.QueryChannelsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.channel.v1.QueryOuterClass.QueryChannelsRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null

