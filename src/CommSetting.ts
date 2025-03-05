import { requireNativeModule } from 'expo-modules-core';
import NativeObject from './NativeObject';

// It loads the native module object from the JSI or falls back to
// the bridge module (from NativeModulesProxy) if the remote debugger is on.
const mod = requireNativeModule('CommSetting');

export default class CommSetting extends NativeObject {
    constructor() {
        super(mod);
    }
    get timeOut(): string {
        return mod.getTimeOut(this._nativeRef);
    }
    set timeOut(timeout: string) {
        mod.setTimeOut(this._nativeRef, timeout);
    }
    get deviceName() {
        return mod.getDeviceName(this._nativeRef)
    }
    set deviceName(name: string) {
        mod.setDeviceName(this._nativeRef, name)
    }
    get type() {
        return mod.getType(this._nativeRef)
    }
    set type(t: "AIDL") {
        mod.setType(this._nativeRef, t)
    }

}


