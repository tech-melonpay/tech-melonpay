package E5;

import kotlin.jvm.internal.f;

/* compiled from: SignerQRDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1053a;

    public b(String str) {
        this.f1053a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f1053a, ((b) obj).f1053a);
    }

    public final int hashCode() {
        String str = this.f1053a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("SignerQRDomain(qrCode="), this.f1053a, ")");
    }
}
