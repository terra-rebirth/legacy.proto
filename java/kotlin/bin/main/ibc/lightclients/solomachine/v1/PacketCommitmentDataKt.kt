//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package ibc.lightclients.solomachine.v1;

@kotlin.jvm.JvmName("-initializepacketCommitmentData")
public inline fun packetCommitmentData(block: ibc.lightclients.solomachine.v1.PacketCommitmentDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData =
  ibc.lightclients.solomachine.v1.PacketCommitmentDataKt.Dsl._create(ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData.newBuilder()).apply { block() }._build()
public object PacketCommitmentDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData = _builder.build()

    /**
     * <code>bytes path = 1;</code>
     */
    public var path: com.google.protobuf.ByteString
      @JvmName("getPath")
      get() = _builder.getPath()
      @JvmName("setPath")
      set(value) {
        _builder.setPath(value)
      }
    /**
     * <code>bytes path = 1;</code>
     */
    public fun clearPath() {
      _builder.clearPath()
    }

    /**
     * <code>bytes commitment = 2;</code>
     */
    public var commitment: com.google.protobuf.ByteString
      @JvmName("getCommitment")
      get() = _builder.getCommitment()
      @JvmName("setCommitment")
      set(value) {
        _builder.setCommitment(value)
      }
    /**
     * <code>bytes commitment = 2;</code>
     */
    public fun clearCommitment() {
      _builder.clearCommitment()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData.copy(block: ibc.lightclients.solomachine.v1.PacketCommitmentDataKt.Dsl.() -> kotlin.Unit): ibc.lightclients.solomachine.v1.Solomachine.PacketCommitmentData =
  ibc.lightclients.solomachine.v1.PacketCommitmentDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

