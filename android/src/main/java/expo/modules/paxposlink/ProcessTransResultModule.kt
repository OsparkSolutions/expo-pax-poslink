package expo.modules.paxposlink

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import com.pax.poslink.ProcessTransResult;

class ProcessTransResultModule : Module() {

  private val context get() = requireNotNull(appContext.reactContext)
  private val ap get() = requireNotNull(appContext)

  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoPaxPoslink')` in JavaScript.
    Name("ProcessTransResult")

    Function("getCode"){
        result:ProcessTransResultRef->
            result.ref.Code.name
    }
    Function("getMessage"){
        result:ProcessTransResultRef->
            result.ref.Msg
    }

    Function("getResponse"){
        result:ProcessTransResultRef->result.ref.Response
          
    }
    


  }
}
