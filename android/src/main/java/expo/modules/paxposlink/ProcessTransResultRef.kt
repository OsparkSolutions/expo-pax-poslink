package expo.modules.paxposlink

import expo.modules.kotlin.sharedobjects.SharedRef
import com.pax.poslink.ProcessTransResult;
import expo.modules.kotlin.AppContext


open class ProcessTransResultRef(ref: ProcessTransResult, appContext:AppContext? = null) :
    SharedRef<ProcessTransResult>(ref, appContext)  {
}