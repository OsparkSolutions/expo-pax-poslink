import { requireNativeModule } from "expo-modules-core";
import NativeObject from "./NativeObject";
const mod = requireNativeModule('ManageResponse');


export default class ManageResponse extends NativeObject {
    constructor(responseRef: any) {
        super(mod, responseRef)
    }
    // ResultCode
    get resultCode(): string {
        return mod.getResultCode(this._nativeRef);
    }

    // ResultTxt
    get resultTxt(): string {
        return mod.getResultTxt(this._nativeRef);
    }

    // EntryMode
    get entryMode(): string {
        return mod.getEntryMode(this._nativeRef);
    }

    // Track1Data
    get track1Data(): string {
        return mod.getTrack1Data(this._nativeRef);
    }

    // Track2Data
    get track2Data(): string {
        return mod.getTrack2Data(this._nativeRef);
    }

    // Track3Data
    get track3Data(): string {
        return mod.getTrack3Data(this._nativeRef);
    }

    // PAN
    get pan(): string {
        return mod.getPAN(this._nativeRef);
    }

    // MaskedPAN
    get maskedPAN(): string {
        return mod.getMaskedPAN(this._nativeRef);
    }

    // BarcodeType
    get barcodeType(): string {
        return mod.getBarcodeType(this._nativeRef);
    }

    // BarcodeData
    get barcodeData(): string {
        return mod.getBarcodeData(this._nativeRef);
    }

    // KSN
    get ksn(): string {
        return mod.getKSN(this._nativeRef);
    }

    // Encryption Transmission Block
    get encryptionTransmissionBlock(): string {
        return mod.getEncryptionTransmissionBlock(this._nativeRef);
    }

    // Contactless Transaction Path
    get contactlessTransactionPath(): string {
        return mod.getContactlessTransactionPath(this._nativeRef);
    }

    // AuthorizationResult
    get authorizationResult(): string {
        return mod.getAuthorizationResult(this._nativeRef);
    }

    // SignatureFlag
    get signatureFlag(): boolean {
        return mod.getSignatureFlag(this._nativeRef);
    }

    // OnlinePINFlag
    get onlinePINFlag(): boolean {
        return mod.getOnlinePINFlag(this._nativeRef);
    }

    // EMVData
    get emvData(): string {
        return mod.getEMVData(this._nativeRef);
    }

    // EncryptedEMVTLVData
    get encryptedEMVTLVData(): string {
        return mod.getEncryptedEMVTLVData(this._nativeRef);
    }

    // EncryptedSensitiveTLVData
    get encryptedSensitiveTLVData(): string {
        return mod.getEncryptedSensitiveTLVData(this._nativeRef);
    }

    // ExpiryDate
    get expiryDate(): string {
        return mod.getExpiryDate(this._nativeRef);
    }

    // CardHolderName
    get cardHolderName(): string {
        return mod.getCardHolderName(this._nativeRef);
    }

    // ServiceCode
    get serviceCode(): string {
        return mod.getServiceCode(this._nativeRef);
    }

    // CVVCode
    get cvvCode(): string {
        return mod.getCVVCode(this._nativeRef);
    }

    // ZipCode
    get zipCode(): string {
        return mod.getZipCode(this._nativeRef);
    }

    // Cvm
    get cvm(): string {
        return mod.getCvm(this._nativeRef);
    }

    // PinpadType
    get pinpadType(): string {
        return mod.getPinpadType(this._nativeRef);
    }

    // LuhnValidationResult
    get luhnValidationResult(): boolean {
        return mod.getLuhnValidationResult(this._nativeRef);
    }

}