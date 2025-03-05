package expo.modules.paxposlink

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import com.pax.poslink.CommSetting;

class CommSettingModule : Module() {

  private val context get() = requireNotNull(appContext.reactContext)
  private val ap get() = requireNotNull(appContext)

  // Each module class must implement the definition function. The definition consists of components
  // that describes the module's functionality and behavior.
  // See https://docs.expo.dev/modules/module-api for more details about available components.
  override fun definition() = ModuleDefinition {
    // Sets the name of the module that JavaScript code will use to refer to the module. Takes a string as an argument.
    // Can be inferred from module's class name, but it's recommended to set it explicitly for clarity.
    // The module will be accessible from `requireNativeModule('ExpoPaxPoslink')` in JavaScript.
    Name("CommSetting")


    Function("create") {
      CommSettingRef(CommSetting());
    }

    Function("setTimeOut"){
        settings:CommSettingRef,
        timeout:String->
            settings.ref.setTimeOut(timeout)
    }
    Function("getTimeOut"){
        settings:CommSettingRef->
            settings.ref.getTimeOut()
    }
    Function("setType"){
        settings:CommSettingRef,
        t:String
        -> settings.ref.setType(t)
            
    }
    Function("getType"){
        settings:CommSettingRef->
            settings.ref.getType()
    }
    // Defines a JavaScript synchronous function that runs the native code on the JavaScript thread.
    Function("hello") {
      val cs = CommSetting();
      cs.setTimeOut("3000")
      cs.setType("AIDL")
      return@Function "Hello Settings! 👋"
    }

    
    

  }
}
