package j8;

import C.v;
import android.os.Bundle;

/* compiled from: PaymentsFragmentArgs.kt */
/* renamed from: j8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0904c implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22549a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22550b;

    public C0904c() {
        this(false, false);
    }

    public static final C0904c fromBundle(Bundle bundle) {
        return new C0904c(v.y(bundle, C0904c.class, "isSend") ? bundle.getBoolean("isSend") : false, bundle.containsKey("isAll") ? bundle.getBoolean("isAll") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0904c)) {
            return false;
        }
        C0904c c0904c = (C0904c) obj;
        return this.f22549a == c0904c.f22549a && this.f22550b == c0904c.f22550b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22550b) + (Boolean.hashCode(this.f22549a) * 31);
    }

    public final String toString() {
        return "PaymentsFragmentArgs(isSend=" + this.f22549a + ", isAll=" + this.f22550b + ")";
    }

    public C0904c(boolean z10, boolean z11) {
        this.f22549a = z10;
        this.f22550b = z11;
    }
}
