//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmName("-initializeresponseFlush")
public inline fun responseFlush(block: tendermint.abci.ResponseFlushKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseFlush =
  tendermint.abci.ResponseFlushKt.Dsl._create(tendermint.abci.Types.ResponseFlush.newBuilder()).apply { block() }._build()
public object ResponseFlushKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseFlush.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseFlush.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseFlush = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseFlush.copy(block: tendermint.abci.ResponseFlushKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseFlush =
  tendermint.abci.ResponseFlushKt.Dsl._create(this.toBuilder()).apply { block() }._build()

