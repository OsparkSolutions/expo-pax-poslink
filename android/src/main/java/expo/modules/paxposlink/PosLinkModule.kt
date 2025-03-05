package expo.modules.paxposlink

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import com.pax.poslink.PosLink;

class PosLinkModule : Module() {

  private val context get() = requireNotNull(appContext.reactContext)
  private val ap get() = requireNotNull(appContext)

  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoPaxPoslink')` in JavaScript.
    Name("PosLink")


    Function("create") {
      PosLinkRef(PosLink(context));
    }

    Function("setManageRequest"){
        posLink:PosLinkRef,
        request:ManageRequestRef->
            posLink.ref.ManageRequest = request.ref
    }
    Function("getManageRequest"){
        posLink:PosLinkRef->
            if(posLink.ref.ManageRequest != null) ManageRequestRef(posLink.ref.ManageRequest) else null
    }

    Function("processTrans"){
        posLink:PosLinkRef->
            val result =  posLink.ref.ProcessTrans()
            return@Function if(result != null)  ProcessTransResultRef(result)else null
        
    }
    Function("getManageResponse"){
        posLink:PosLinkRef->
            if(posLink.ref.ManageResponse != null) ManageResponseRef(posLink.ref.ManageResponse) else null
    }
    Function("setCommSetting"){
        posLink:PosLinkRef,s:CommSettingRef->
            posLink.ref.SetCommSetting(s.ref)
            
        
    }
    


  }
}
