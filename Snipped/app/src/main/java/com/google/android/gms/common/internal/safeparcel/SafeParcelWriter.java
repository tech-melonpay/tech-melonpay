package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i) {
        zzb(parcel, i);
    }

    public static void writeBigDecimal(Parcel parcel, int i, BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, zza);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i, BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i9 = 0; i9 < length; i9++) {
            parcel.writeByteArray(bigDecimalArr[i9].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i9].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(Parcel parcel, int i, BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, zza);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i, BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(Parcel parcel, int i, boolean z10) {
        zzc(parcel, i, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i, boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, zza);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i, List<Boolean> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(list.get(i9).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(Parcel parcel, int i, Boolean bool, boolean z10) {
        if (bool != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeBundle(bundle);
            zzb(parcel, zza);
        }
    }

    public static void writeByte(Parcel parcel, int i, byte b9) {
        zzc(parcel, i, 4);
        parcel.writeInt(b9);
    }

    public static void writeByteArray(Parcel parcel, int i, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeByteArray(bArr);
            zzb(parcel, zza);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i, SparseArray<byte[]> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeByteArray(sparseArray.valueAt(i9));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(Parcel parcel, int i, char c2) {
        zzc(parcel, i, 4);
        parcel.writeInt(c2);
    }

    public static void writeCharArray(Parcel parcel, int i, char[] cArr, boolean z10) {
        if (cArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeCharArray(cArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDouble(Parcel parcel, int i, double d10) {
        zzc(parcel, i, 8);
        parcel.writeDouble(d10);
    }

    public static void writeDoubleArray(Parcel parcel, int i, double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, zza);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i, List<Double> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeDouble(list.get(i9).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(Parcel parcel, int i, Double d10, boolean z10) {
        if (d10 != null) {
            zzc(parcel, i, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i, SparseArray<Double> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeDouble(sparseArray.valueAt(i9).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(Parcel parcel, int i, float f10) {
        zzc(parcel, i, 4);
        parcel.writeFloat(f10);
    }

    public static void writeFloatArray(Parcel parcel, int i, float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeFloatArray(fArr);
            zzb(parcel, zza);
        }
    }

    public static void writeFloatList(Parcel parcel, int i, List<Float> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeFloat(list.get(i9).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(Parcel parcel, int i, Float f10, boolean z10) {
        if (f10 != null) {
            zzc(parcel, i, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i, SparseArray<Float> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeFloat(sparseArray.valueAt(i9).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(Parcel parcel, int i, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i, IBinder[] iBinderArr, boolean z10) {
        if (iBinderArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i, List<IBinder> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeBinderList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i, SparseArray<IBinder> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeStrongBinder(sparseArray.valueAt(i9));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(Parcel parcel, int i, int i9) {
        zzc(parcel, i, 4);
        parcel.writeInt(i9);
    }

    public static void writeIntArray(Parcel parcel, int i, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeIntArray(iArr);
            zzb(parcel, zza);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i, List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(list.get(i9).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(Parcel parcel, int i, Integer num, boolean z10) {
        if (num != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeList(Parcel parcel, int i, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeLong(Parcel parcel, int i, long j10) {
        zzc(parcel, i, 8);
        parcel.writeLong(j10);
    }

    public static void writeLongArray(Parcel parcel, int i, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeLongArray(jArr);
            zzb(parcel, zza);
        }
    }

    public static void writeLongList(Parcel parcel, int i, List<Long> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeLong(list.get(i9).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(Parcel parcel, int i, Long l10, boolean z10) {
        if (l10 != null) {
            zzc(parcel, i, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i, Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, zza);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i, Parcel[] parcelArr, boolean z10) {
        if (parcelArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(Parcel parcel, int i, List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            Parcel parcel2 = list.get(i9);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i, SparseArray<Parcel> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            Parcel valueAt = sparseArray.valueAt(i9);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int i9, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcelable.writeToParcel(parcel, i9);
            zzb(parcel, zza);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i, PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, zza);
        }
    }

    public static void writeShort(Parcel parcel, int i, short s10) {
        zzc(parcel, i, 4);
        parcel.writeInt(s10);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i, SparseBooleanArray sparseBooleanArray, boolean z10) {
        if (sparseBooleanArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, zza);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i, SparseIntArray sparseIntArray, boolean z10) {
        if (sparseIntArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseIntArray.keyAt(i9));
            parcel.writeInt(sparseIntArray.valueAt(i9));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(Parcel parcel, int i, SparseLongArray sparseLongArray, boolean z10) {
        if (sparseLongArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseLongArray.keyAt(i9));
            parcel.writeLong(sparseLongArray.valueAt(i9));
        }
        zzb(parcel, zza);
    }

    public static void writeString(Parcel parcel, int i, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeString(str);
            zzb(parcel, zza);
        }
    }

    public static void writeStringArray(Parcel parcel, int i, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeStringArray(strArr);
            zzb(parcel, zza);
        }
    }

    public static void writeStringList(Parcel parcel, int i, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
            }
        } else {
            int zza = zza(parcel, i);
            parcel.writeStringList(list);
            zzb(parcel, zza);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i, SparseArray<String> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            parcel.writeString(sparseArray.valueAt(i9));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i, T[] tArr, int i9, boolean z10) {
        if (tArr == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t3 : tArr) {
            if (t3 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t3, i9);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            T t3 = list.get(i9);
            if (t3 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t3, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i, SparseArray<T> sparseArray, boolean z10) {
        if (sparseArray == null) {
            if (z10) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(sparseArray.keyAt(i9));
            T valueAt = sparseArray.valueAt(i9);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i, int i9) {
        parcel.writeInt(i | (i9 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
