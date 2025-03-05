package expo.modules.paxposlink

import expo.modules.kotlin.sharedobjects.SharedRef
import com.pax.poslink.PosLink;
import expo.modules.kotlin.AppContext


open class PosLinkRef(ref: PosLink, appContext:AppContext? = null) :
    SharedRef<PosLink>(ref, appContext)  {
}