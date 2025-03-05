package expo.modules.paxposlink

import expo.modules.kotlin.sharedobjects.SharedRef
import com.pax.poslink.ManageRequest;
import expo.modules.kotlin.AppContext


open class ManageRequestRef(ref: ManageRequest, appContext:AppContext? = null) :
    SharedRef<ManageRequest>(ref, appContext)  {
}