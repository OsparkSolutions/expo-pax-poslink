package expo.modules.paxposlink

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import com.pax.poslink.ManageResponse;

class ManageResponseModule : Module() {

  private val context get() = requireNotNull(appContext.reactContext)
  private val ap get() = requireNotNull(appContext)

  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoPaxPoslink')` in JavaScript.
    Name("ManageResponse")

    //ResultCode
    Function("getResultCode"){
            response:ManageResponseRef->
            response.ref.ResultCode
    }
    Function("ResultTxt") {
        response: ManageResponseRef ->
            response.ref.ResultTxt
    }

    Function("EntryMode") {
        response: ManageResponseRef ->
            response.ref.EntryMode
    }

    Function("Track1Data") {
        response: ManageResponseRef ->
            response.ref.Track1Data
    }

    Function("Track2Data") {
        response: ManageResponseRef ->
            response.ref.Track2Data
    }

    Function("Track3Data") {
        response: ManageResponseRef ->
            response.ref.Track3Data
    }

    Function("PAN") {
        response: ManageResponseRef ->
            response.ref.PAN
    }

    Function("MaskedPAN") {
        response: ManageResponseRef ->
            response.ref.MaskedPAN
    }

    Function("BarcodeType") {
        response: ManageResponseRef ->
            response.ref.BarcodeType
    }

    Function("BarcodeData") {
        response: ManageResponseRef ->
            response.ref.BarcodeData
    }

    Function("KSN") {
        response: ManageResponseRef ->
            response.ref.KSN
    }

    Function("EncryptionTransmissionBlock") {
        response: ManageResponseRef ->
            response.ref.EncryptionTransmissionBlock
    }

    Function("ContactlessTransactionPath") {
        response: ManageResponseRef ->
            response.ref.ContactlessTransactionPath
    }

    Function("AuthorizationResult") {
        response: ManageResponseRef ->
            response.ref.AuthorizationResult
    }

    Function("SignatureFlag") {
        response: ManageResponseRef ->
            response.ref.SignatureFlag
    }

    Function("OnlinePINFlag") {
        response: ManageResponseRef ->
            response.ref.OnlinePINFlag
    }

    Function("EMVData") {
        response: ManageResponseRef ->
            response.ref.EMVData
    }

    Function("EncryptedEMVTLVData") {
        response: ManageResponseRef ->
            response.ref.EncryptedEMVTLVData
    }

    Function("EncryptedSensitiveTLVData") {
        response: ManageResponseRef ->
            response.ref.EncryptedSensitiveTLVData
    }

    Function("ExpiryDate") {
        response: ManageResponseRef ->
            response.ref.ExpiryDate
    }

    Function("CardHolderName") {
        response: ManageResponseRef ->
            response.ref.CardHolderName
    }

    Function("ServiceCode") {
        response: ManageResponseRef ->
            response.ref.ServiceCode
    }

    Function("CVVCode") {
        response: ManageResponseRef ->
            response.ref.CVVCode
    }

    Function("ZipCode") {
        response: ManageResponseRef ->
            response.ref.ZipCode
    }

    Function("Cvm") {
        response: ManageResponseRef ->
            response.ref.Cvm
    }

    Function("PinpadType") {
        response: ManageResponseRef ->
            response.ref.PinpadType
    }

    Function("LuhnValidationResult") {
        response: ManageResponseRef ->
            response.ref.LuhnValidationResult
    }
 

  }
}
