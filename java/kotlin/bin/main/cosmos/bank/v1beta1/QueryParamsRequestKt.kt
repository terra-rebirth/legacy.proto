//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmName("-initializequeryParamsRequest")
public inline fun queryParamsRequest(block: cosmos.bank.v1beta1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest =
  cosmos.bank.v1beta1.QueryParamsRequestKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.newBuilder()).apply { block() }._build()
public object QueryParamsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.copy(block: cosmos.bank.v1beta1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest =
  cosmos.bank.v1beta1.QueryParamsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

