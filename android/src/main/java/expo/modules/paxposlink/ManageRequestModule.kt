package expo.modules.paxposlink

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import com.pax.poslink.ManageRequest;

class ManageRequestModule : Module() {

  private val context get() = requireNotNull(appContext.reactContext)
  private val ap get() = requireNotNull(appContext)

  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoPaxPoslink')` in JavaScript.
    Name("ManageRequest")


    Function("create") {
      ManageRequestRef(ManageRequest());
    }

    Function("setTransType"){
        request:ManageRequestRef,
        type:Int->
            request.ref.TransType = type
    }
    Function("getTransType"){
        request:ManageRequestRef->
          request.ref.TransType  
    }
    
    Function("getEdcType"){
        request:ManageRequestRef->
          request.ref.EDCType  
    }

    Function("setEdcType"){
        request:ManageRequestRef,
        t:Int->
            request.ref.EDCType = t
    }
    Function("getEdcType"){
        request:ManageRequestRef->
          request.ref.EDCType  
    }

    Function("setTrans"){
        request:ManageRequestRef,
        trans:Int->
            request.ref.TransType = trans
    }
    Function("getTrans"){
        request:ManageRequestRef->
          request.ref.Trans
    }

    Function("setAmount"){
        request:ManageRequestRef,
        amount:String->
            request.ref.Amount = amount
    }
    Function("getAmount"){
        request:ManageRequestRef->
          request.ref.Amount
    }

    Function("setCashBackAmt"){
        request:ManageRequestRef,
        amount:String->
            request.ref.CashBackAmt = amount
    }
    Function("getCashBackAmt"){
        request:ManageRequestRef->
          request.ref.CashBackAmt
    }


    Function("setMagneticSwipeEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.MagneticSwipeEntryFlag = flag
    }
    Function("getMagneticSwipeEntryFlag"){
        request:ManageRequestRef->
          request.ref.MagneticSwipeEntryFlag
    }

    Function("setManualEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ManualEntryFlag = flag
    }
    Function("getManualEntryFlag"){
        request:ManageRequestRef->
          request.ref.ManualEntryFlag
    }
    
    Function("setContactlessEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ContactlessEntryFlag = flag
    }
    Function("getContactlessEntryFlag"){
        request:ManageRequestRef->
          request.ref.ContactlessEntryFlag
    }
  
    Function("setContactEMVEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ContactEMVEntryFlag = flag
    }
    Function("getContactEMVEntryFlag"){
        request:ManageRequestRef->
          request.ref.ContactEMVEntryFlag
    }
 
 
    Function("setFallbackSwipeEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.FallbackSwipeEntryFlag = flag
    }
    Function("getFallbackSwipeEntryFlag"){
        request:ManageRequestRef->
          request.ref.FallbackSwipeEntryFlag
    }


    Function("setFallbackInsertEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.FallbackInsertEntryFlag = flag
    }
    Function("getFallbackInsertEntryFlag"){
        request:ManageRequestRef->
          request.ref.FallbackInsertEntryFlag
    }
    
    Function("setScannerEntryFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ScannerEntryFlag = flag
    }
    Function("getScannerEntryFlag"){
        request:ManageRequestRef->
          request.ref.ScannerEntryFlag
    }
 
    Function("setExpiryDatePrompt"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ExpiryDatePrompt = flag
    }
    Function("getExpiryDatePrompt"){
        request:ManageRequestRef->
          request.ref.ExpiryDatePrompt
    }

    Function("setZipCodePrompt"){
        request:ManageRequestRef,
        flag:String->
            request.ref.ZipCodePrompt = flag
    }
    Function("getZipCodePrompt"){
        request:ManageRequestRef->
          request.ref.ZipCodePrompt
    }
    
    Function("setCvvPrompt"){
        request:ManageRequestRef,
        flag:String->
            request.ref.CVVPrompt = flag
    }
    Function("getCvvPrompt"){
        request:ManageRequestRef->
          request.ref.CVVPrompt
    }

    Function("setEncryptionFlag"){
        request:ManageRequestRef,
        flag:String->
            request.ref.EncryptionFlag = flag
    }
    Function("getEncryptionFlag"){
        request:ManageRequestRef->
          request.ref.EncryptionFlag
    }


    Function("setKeySlot"){
        request:ManageRequestRef,
        slot:String->
            request.ref.KeySlot = slot
    }
    Function("getKeySlot"){
        request:ManageRequestRef->
          request.ref.KeySlot
    }


    Function("setEmvKernelConfigurationSelection"){
        request:ManageRequestRef,
        s:String->
            request.ref.EmvKernelConfigurationSelection = s
    }
    Function("getEmvKernelConfigurationSelection"){
        request:ManageRequestRef->
          request.ref.EmvKernelConfigurationSelection
    }

    Function("setTransactionTime"){
        request:ManageRequestRef,
        s:String->
            request.ref.TransactionTime = s
    }
    Function("getTransactionTime"){
        request:ManageRequestRef->
          request.ref.TransactionTime
    }


    Function("setTransactionDate"){
        request:ManageRequestRef,
        s:String->
            request.ref.TransactionDate = s
    }
    Function("getTransactionDate"){
        request:ManageRequestRef->
          request.ref.TransactionDate
    }


    Function("setCurrencyCode"){
        request:ManageRequestRef,
        s:String->
            request.ref.CurrencyCode = s
    }
    Function("getCurrencyCode"){
        request:ManageRequestRef->
          request.ref.CurrencyCode
    }


    Function("setCurrencyExponent"){
        request:ManageRequestRef,
        s:String->
            request.ref.CurrencyExponent = s
    }
    Function("getCurrencyExponent"){
        request:ManageRequestRef->
          request.ref.CurrencyExponent
    }

    Function("setMaxAccountLength"){
        request:ManageRequestRef,
        s:String->
            request.ref.MAXAccountLength = s
    }
    Function("getMaxAccountLength"){
        request:ManageRequestRef->
          request.ref.MAXAccountLength
    }

    Function("setMinAccountLength"){
        request:ManageRequestRef,
        s:String->
            request.ref.MINAccountLength = s
    }
    Function("getMinAccountLength"){
        request:ManageRequestRef->
          request.ref.MINAccountLength
    }

    Function("setMerchantCategoryCode"){
        request:ManageRequestRef,
        s:String->
            request.ref.MerchantCategoryCode = s
    }
    Function("getMerchantCategoryCode"){
        request:ManageRequestRef->
          request.ref.MerchantCategoryCode
    }
    Function("setTagList"){
        request:ManageRequestRef,
        s:String->
            request.ref.TagList = s
    }
    Function("getTagList"){
        request:ManageRequestRef->
          request.ref.TagList
    }


    Function("setTimeOut"){
        request:ManageRequestRef,
        timeout:String->
            request.ref.TimeOut = timeout
    }
    Function("getTimeOut"){
        request:ManageRequestRef->
          request.ref.TimeOut  
    }
    
    Function("setExtData"){
        request:ManageRequestRef,
        s:String->
            request.ref.ExtData = s
    }
    Function("getExtData"){
        request:ManageRequestRef->
          request.ref.ExtData
    }
    Function("setTransactionCvmLimit"){
        request:ManageRequestRef,
        s:String->
            request.ref.TransactionCVMLimit = s
    }
    Function("getTransactionCvmLimit"){
        request:ManageRequestRef->
          request.ref.TransactionCVMLimit
    }
 
    Function("setContinuousScreen"){
        request:ManageRequestRef,
        s:String->
            request.ref.ContinuousScreen = s
    }
    Function("getContinuousScreen"){
        request:ManageRequestRef->
          request.ref.ContinuousScreen
    }
 
 
    Function("setKsnFlag"){
        request:ManageRequestRef,
        s:String->
            request.ref.KSNFlag = s
    }
    Function("getKsnFlag"){
        request:ManageRequestRef->
          request.ref.KSNFlag
    }
  
    Function("setFallbackToManualEntryFlag"){
        request:ManageRequestRef,
        s:String->
            request.ref.FallbackToManualEntryFlag = s
    }
    Function("getFallbackToManualEntryFlag"){
        request:ManageRequestRef->
          request.ref.FallbackToManualEntryFlag
    }

    

  }
}
