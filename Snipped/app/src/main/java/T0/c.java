package t0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
public final class c {
    public static final Bundle a() {
        return new Bundle(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle b(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = pair.f23089a;
            B b9 = pair.f23090b;
            if (b9 == 0) {
                bundle.putString(str, null);
            } else if (b9 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b9).booleanValue());
            } else if (b9 instanceof Byte) {
                bundle.putByte(str, ((Number) b9).byteValue());
            } else if (b9 instanceof Character) {
                bundle.putChar(str, ((Character) b9).charValue());
            } else if (b9 instanceof Double) {
                bundle.putDouble(str, ((Number) b9).doubleValue());
            } else if (b9 instanceof Float) {
                bundle.putFloat(str, ((Number) b9).floatValue());
            } else if (b9 instanceof Integer) {
                bundle.putInt(str, ((Number) b9).intValue());
            } else if (b9 instanceof Long) {
                bundle.putLong(str, ((Number) b9).longValue());
            } else if (b9 instanceof Short) {
                bundle.putShort(str, ((Number) b9).shortValue());
            } else if (b9 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b9);
            } else if (b9 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b9);
            } else if (b9 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b9);
            } else if (b9 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b9);
            } else if (b9 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b9);
            } else if (b9 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b9);
            } else if (b9 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b9);
            } else if (b9 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b9);
            } else if (b9 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b9);
            } else if (b9 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b9);
            } else if (b9 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b9);
            } else if (b9 instanceof Object[]) {
                Class<?> componentType = b9.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b9);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b9);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b9);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b9);
                }
            } else if (b9 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b9);
            } else if (b9 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b9);
            } else if (b9 instanceof Size) {
                bundle.putSize(str, (Size) b9);
            } else {
                if (!(b9 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b9.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) b9);
            }
        }
        return bundle;
    }
}
