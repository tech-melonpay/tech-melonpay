package u4;

import androidx.camera.core.n;
import kotlin.jvm.internal.f;

/* compiled from: StatementsDownloadRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("file_body")
    private final String f30207a;

    public final String a() {
        return this.f30207a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f.b(this.f30207a, ((c) obj).f30207a);
    }

    public final int hashCode() {
        String str = this.f30207a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return n.a("StatementsDownloadRaw(fileBody=", this.f30207a, ")");
    }
}
