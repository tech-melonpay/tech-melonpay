package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i9) {
            switch (i) {
                case 2:
                    IObjectWrapper zzg = zzg();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzg);
                    return true;
                case 3:
                    Bundle zzd = zzd();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, zzd);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zze);
                    return true;
                case 6:
                    IObjectWrapper zzh = zzh();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzh);
                    return true;
                case 7:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i10 = zzc.zza;
                    parcel2.writeInt(zzs ? 1 : 0);
                    return true;
                case 8:
                    String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    IFragmentWrapper zzf = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzf);
                    return true;
                case 10:
                    int zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzc);
                    return true;
                case 11:
                    boolean zzt = zzt();
                    parcel2.writeNoException();
                    int i11 = zzc.zza;
                    parcel2.writeInt(zzt ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper zzi = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzi);
                    return true;
                case 13:
                    boolean zzu = zzu();
                    parcel2.writeNoException();
                    int i12 = zzc.zza;
                    parcel2.writeInt(zzu ? 1 : 0);
                    return true;
                case 14:
                    boolean zzv = zzv();
                    parcel2.writeNoException();
                    int i13 = zzc.zza;
                    parcel2.writeInt(zzv ? 1 : 0);
                    return true;
                case 15:
                    boolean zzw = zzw();
                    parcel2.writeNoException();
                    int i14 = zzc.zza;
                    parcel2.writeInt(zzw ? 1 : 0);
                    return true;
                case 16:
                    boolean zzx = zzx();
                    parcel2.writeNoException();
                    int i15 = zzc.zza;
                    parcel2.writeInt(zzx ? 1 : 0);
                    return true;
                case 17:
                    boolean zzy = zzy();
                    parcel2.writeNoException();
                    int i16 = zzc.zza;
                    parcel2.writeInt(zzy ? 1 : 0);
                    return true;
                case 18:
                    boolean zzz = zzz();
                    parcel2.writeNoException();
                    int i17 = zzc.zza;
                    parcel2.writeInt(zzz ? 1 : 0);
                    return true;
                case 19:
                    boolean zzA = zzA();
                    parcel2.writeNoException();
                    int i18 = zzc.zza;
                    parcel2.writeInt(zzA ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzk(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zzf2 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzl(zzf2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zzf3 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzm(zzf3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zzf4 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzn(zzf4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zzf5 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzo(zzf5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    zzc.zzb(parcel);
                    zzp(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    zzc.zzb(parcel);
                    zzq(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzr(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA();

    int zzb();

    int zzc();

    Bundle zzd();

    IFragmentWrapper zze();

    IFragmentWrapper zzf();

    IObjectWrapper zzg();

    IObjectWrapper zzh();

    IObjectWrapper zzi();

    String zzj();

    void zzk(IObjectWrapper iObjectWrapper);

    void zzl(boolean z10);

    void zzm(boolean z10);

    void zzn(boolean z10);

    void zzo(boolean z10);

    void zzp(Intent intent);

    void zzq(Intent intent, int i);

    void zzr(IObjectWrapper iObjectWrapper);

    boolean zzs();

    boolean zzt();

    boolean zzu();

    boolean zzv();

    boolean zzw();

    boolean zzx();

    boolean zzy();

    boolean zzz();
}
