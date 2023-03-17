//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package cosmos.evidence.v1beta1;

@kotlin.jvm.JvmName("-initializequeryAllEvidenceRequest")
public inline fun queryAllEvidenceRequest(block: cosmos.evidence.v1beta1.QueryAllEvidenceRequestKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest =
  cosmos.evidence.v1beta1.QueryAllEvidenceRequestKt.Dsl._create(cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest.newBuilder()).apply { block() }._build()
public object QueryAllEvidenceRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest = _builder.build()

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
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
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
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
public inline fun cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest.copy(block: cosmos.evidence.v1beta1.QueryAllEvidenceRequestKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequest =
  cosmos.evidence.v1beta1.QueryAllEvidenceRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val cosmos.evidence.v1beta1.QueryOuterClass.QueryAllEvidenceRequestOrBuilder.paginationOrNull: cosmos.base.query.v1beta1.Pagination.PageRequest?
  get() = if (hasPagination()) getPagination() else null

