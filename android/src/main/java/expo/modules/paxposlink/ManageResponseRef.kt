package expo.modules.paxposlink

import expo.modules.kotlin.sharedobjects.SharedRef
import com.pax.poslink.ManageResponse;
import expo.modules.kotlin.AppContext


open class ManageResponseRef(ref: ManageResponse, appContext:AppContext? = null) :
    SharedRef<ManageResponse>(ref, appContext)  {
}