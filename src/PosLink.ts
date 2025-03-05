import { requireNativeModule } from "expo-modules-core";
import NativeObject from "./NativeObject";
import ManageRequest from "./ManageRequest";
import ProcessTransResult from "./ProcessTransResult";
import ManageResponse from "./ManageResponse";
import CommSetting from "./CommSetting";
const mod = requireNativeModule('PosLink');

export default class PosLink extends NativeObject {
    constructor() {
        super(mod);
    }
    get manageRequest(): ManageRequest | null {
        const r = mod.getManageRequest(this._nativeRef);
        return r !== null ? new ManageRequest(r) : r;
    }
    set manageRequest(v: ManageRequest) {
        const r = mod.setManageRequest(this._nativeRef, v.getNativeRef());
    }
    processTrans(): ProcessTransResult | null {
        var r = mod.processTrans(this._nativeRef);
        return r ? new ProcessTransResult(r) : r;
    }
    get manageResponse(): ManageResponse | null {
        const r = mod.getManageResponse(this._nativeRef)
        return r ? new ManageResponse(r) : r;
    }

    setCommSetting(setting: CommSetting) {
        mod.setCommSetting(this._nativeRef, setting.getNativeRef());
    }
}
