//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/oracle/v1beta1/tx.proto

package terra.oracle.v1beta1;

@kotlin.jvm.JvmName("-initializemsgDelegateFeedConsentResponse")
public inline fun msgDelegateFeedConsentResponse(block: terra.oracle.v1beta1.MsgDelegateFeedConsentResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse =
  terra.oracle.v1beta1.MsgDelegateFeedConsentResponseKt.Dsl._create(terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse.newBuilder()).apply { block() }._build()
public object MsgDelegateFeedConsentResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse.copy(block: terra.oracle.v1beta1.MsgDelegateFeedConsentResponseKt.Dsl.() -> kotlin.Unit): terra.oracle.v1beta1.Tx.MsgDelegateFeedConsentResponse =
  terra.oracle.v1beta1.MsgDelegateFeedConsentResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

