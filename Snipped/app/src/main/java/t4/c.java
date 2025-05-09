package t4;

import androidx.camera.core.n;
import kotlin.jvm.internal.f;

/* compiled from: SignerQRRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("qrcode")
    private final String f27511a;

    public final String a() {
        return this.f27511a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f.b(this.f27511a, ((c) obj).f27511a);
    }

    public final int hashCode() {
        String str = this.f27511a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return n.a("SignerQRRaw(qrcode=", this.f27511a, ")");
    }
}
