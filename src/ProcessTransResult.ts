import { requireNativeModule } from "expo-modules-core";
import NativeObject from "./NativeObject";

const mod = requireNativeModule('ProcessTransResult');


export default class ProcessTransResult extends NativeObject {
    constructor(resultRef: any) {
        super(mod, resultRef)
    }

    get code(): "ERROR" | "OK" | "TimeOut" {
        return mod.getCode(this._nativeRef);
    }

    get message(): string {
        return mod.getMessage(this._nativeRef);
    }

    get response(): string {
        return mod.getResponse(this._nativeRef);
    }
}