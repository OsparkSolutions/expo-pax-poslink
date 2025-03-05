export default class NativeObject {
    protected _nativeRef: any;
    constructor(protected mod: any, existingRef?: any) {
        this._nativeRef = existingRef || mod.create();
    }
    getNativeRef(){
        return this._nativeRef; 
    }
}
