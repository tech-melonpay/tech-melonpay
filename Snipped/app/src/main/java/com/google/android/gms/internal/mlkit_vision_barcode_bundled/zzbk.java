package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzbk extends zzb implements zzbl {
    public zzbk() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i9) {
        if (i == 1) {
            zzc();
            parcel2.writeNoException();
        } else if (i == 2) {
            zzd();
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbu zzbuVar = (zzbu) zzc.zza(parcel, zzbu.CREATOR);
            zzc.zzb(parcel);
            List zzb = zzb(asInterface, zzbuVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(zzb);
        }
        return true;
    }
}
