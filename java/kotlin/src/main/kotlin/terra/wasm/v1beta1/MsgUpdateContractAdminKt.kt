//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/wasm/v1beta1/tx.proto

package terra.wasm.v1beta1;

@kotlin.jvm.JvmName("-initializemsgUpdateContractAdmin")
public inline fun msgUpdateContractAdmin(block: terra.wasm.v1beta1.MsgUpdateContractAdminKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin =
  terra.wasm.v1beta1.MsgUpdateContractAdminKt.Dsl._create(terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin.newBuilder()).apply { block() }._build()
public object MsgUpdateContractAdminKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin = _builder.build()

    /**
     * <pre>
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    public var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * Admin is the current contract admin
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     */
    public fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * NewAdmin is the new contract admin
     * </pre>
     *
     * <code>string new_admin = 2 [(.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
     */
    public var newAdmin: kotlin.String
      @JvmName("getNewAdmin")
      get() = _builder.getNewAdmin()
      @JvmName("setNewAdmin")
      set(value) {
        _builder.setNewAdmin(value)
      }
    /**
     * <pre>
     * NewAdmin is the new contract admin
     * </pre>
     *
     * <code>string new_admin = 2 [(.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
     */
    public fun clearNewAdmin() {
      _builder.clearNewAdmin()
    }

    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    public var contract: kotlin.String
      @JvmName("getContract")
      get() = _builder.getContract()
      @JvmName("setContract")
      set(value) {
        _builder.setContract(value)
      }
    /**
     * <pre>
     * Contract is the address of the smart contract
     * </pre>
     *
     * <code>string contract = 3 [(.gogoproto.moretags) = "yaml:&#92;"contract&#92;""];</code>
     */
    public fun clearContract() {
      _builder.clearContract()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin.copy(block: terra.wasm.v1beta1.MsgUpdateContractAdminKt.Dsl.() -> kotlin.Unit): terra.wasm.v1beta1.Tx.MsgUpdateContractAdmin =
  terra.wasm.v1beta1.MsgUpdateContractAdminKt.Dsl._create(this.toBuilder()).apply { block() }._build()

