package C9;

import java.util.Objects;

/* compiled from: ClientReportKey.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f693b;

    public c(String str, String str2) {
        this.f692a = str;
        this.f693b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f692a, cVar.f692a) && Objects.equals(this.f693b, cVar.f693b);
    }

    public final int hashCode() {
        return Objects.hash(this.f692a, this.f693b);
    }
}
