import { requireNativeModule } from 'expo-modules-core';

interface ExpoPaxPoslink {
    /**
     * This is for the POSLink Lib initialization. Please use it when your application start. 
     * This is a call to the native POSLinkAndroid.init()
     */
    init(): void
}

// It loads the native module object from the JSI or falls back to
// the bridge module (from NativeModulesProxy) if the remote debugger is on.
export const mod =  requireNativeModule<ExpoPaxPoslink>('ExpoPaxPoslink');
export default mod;
export const POSLinkAndroid = {
    init:()=>{
        mod.init();
    }
}