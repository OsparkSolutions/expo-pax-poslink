package expo.modules.paxposlink

import expo.modules.kotlin.sharedobjects.SharedRef
import com.pax.poslink.CommSetting;
import expo.modules.kotlin.AppContext


open class CommSettingRef(ref: CommSetting, appContext:AppContext? = null) :
    SharedRef<CommSetting>(ref, appContext)  {
}