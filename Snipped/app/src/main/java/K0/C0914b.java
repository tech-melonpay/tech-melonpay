package k0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: LocusIdCompat.java */
/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22667a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f22668b;

    /* compiled from: LocusIdCompat.java */
    /* renamed from: k0.b$a */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public C0914b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f22667a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f22668b = a.a(str);
        } else {
            this.f22668b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0914b.class != obj.getClass()) {
            return false;
        }
        String str = ((C0914b) obj).f22667a;
        String str2 = this.f22667a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f22667a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f22667a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
