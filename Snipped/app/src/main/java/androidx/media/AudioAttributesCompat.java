package androidx.media;

import android.util.SparseIntArray;
import m1.c;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7119b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f7120a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f7120a;
        return audioAttributesImpl == null ? audioAttributesCompat.f7120a == null : audioAttributesImpl.equals(audioAttributesCompat.f7120a);
    }

    public final int hashCode() {
        return this.f7120a.hashCode();
    }

    public final String toString() {
        return this.f7120a.toString();
    }
}
