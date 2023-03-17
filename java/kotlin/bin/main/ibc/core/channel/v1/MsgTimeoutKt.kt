//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package ibc.core.channel.v1;

@kotlin.jvm.JvmName("-initializemsgTimeout")
public inline fun msgTimeout(block: ibc.core.channel.v1.MsgTimeoutKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgTimeout =
  ibc.core.channel.v1.MsgTimeoutKt.Dsl._create(ibc.core.channel.v1.Tx.MsgTimeout.newBuilder()).apply { block() }._build()
public object MsgTimeoutKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: ibc.core.channel.v1.Tx.MsgTimeout.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.core.channel.v1.Tx.MsgTimeout.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.core.channel.v1.Tx.MsgTimeout = _builder.build()

    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public var packet: ibc.core.channel.v1.ChannelOuterClass.Packet
      @JvmName("getPacket")
      get() = _builder.getPacket()
      @JvmName("setPacket")
      set(value) {
        _builder.setPacket(value)
      }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     */
    public fun clearPacket() {
      _builder.clearPacket()
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the packet field is set.
     */
    public fun hasPacket(): kotlin.Boolean {
      return _builder.hasPacket()
    }

    /**
     * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
     */
    public var proofUnreceived: com.google.protobuf.ByteString
      @JvmName("getProofUnreceived")
      get() = _builder.getProofUnreceived()
      @JvmName("setProofUnreceived")
      set(value) {
        _builder.setProofUnreceived(value)
      }
    /**
     * <code>bytes proof_unreceived = 2 [(.gogoproto.moretags) = "yaml:&#92;"proof_unreceived&#92;""];</code>
     */
    public fun clearProofUnreceived() {
      _builder.clearProofUnreceived()
    }

    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public var proofHeight: ibc.core.client.v1.Client.Height
      @JvmName("getProofHeight")
      get() = _builder.getProofHeight()
      @JvmName("setProofHeight")
      set(value) {
        _builder.setProofHeight(value)
      }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public fun clearProofHeight() {
      _builder.clearProofHeight()
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 3 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     * @return Whether the proofHeight field is set.
     */
    public fun hasProofHeight(): kotlin.Boolean {
      return _builder.hasProofHeight()
    }

    /**
     * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
     */
    public var nextSequenceRecv: kotlin.Long
      @JvmName("getNextSequenceRecv")
      get() = _builder.getNextSequenceRecv()
      @JvmName("setNextSequenceRecv")
      set(value) {
        _builder.setNextSequenceRecv(value)
      }
    /**
     * <code>uint64 next_sequence_recv = 4 [(.gogoproto.moretags) = "yaml:&#92;"next_sequence_recv&#92;""];</code>
     */
    public fun clearNextSequenceRecv() {
      _builder.clearNextSequenceRecv()
    }

    /**
     * <code>string signer = 5;</code>
     */
    public var signer: kotlin.String
      @JvmName("getSigner")
      get() = _builder.getSigner()
      @JvmName("setSigner")
      set(value) {
        _builder.setSigner(value)
      }
    /**
     * <code>string signer = 5;</code>
     */
    public fun clearSigner() {
      _builder.clearSigner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun ibc.core.channel.v1.Tx.MsgTimeout.copy(block: ibc.core.channel.v1.MsgTimeoutKt.Dsl.() -> kotlin.Unit): ibc.core.channel.v1.Tx.MsgTimeout =
  ibc.core.channel.v1.MsgTimeoutKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val ibc.core.channel.v1.Tx.MsgTimeoutOrBuilder.packetOrNull: ibc.core.channel.v1.ChannelOuterClass.Packet?
  get() = if (hasPacket()) getPacket() else null

public val ibc.core.channel.v1.Tx.MsgTimeoutOrBuilder.proofHeightOrNull: ibc.core.client.v1.Client.Height?
  get() = if (hasProofHeight()) getProofHeight() else null

