package C;

import android.net.Uri;

/* compiled from: AutoValue_OutputResults.java */
/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489e extends AbstractC0498n {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f549a;

    public C0489e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f549a = uri;
    }

    @Override // C.AbstractC0498n
    public final Uri a() {
        return this.f549a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0498n) {
            return this.f549a.equals(((AbstractC0498n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f549a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f549a + "}";
    }
}
