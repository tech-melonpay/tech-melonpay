package s4;

import kotlin.jvm.internal.f;

/* compiled from: SecurityInfoResponseRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("limits")
    private d f26534a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("3d_secure_settings")
    private a f26535b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("is_card_3d_secure_activated")
    private Boolean f26536c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("security")
    private b f26537d;

    public c() {
        b bVar = new b(0);
        this.f26534a = null;
        this.f26535b = null;
        this.f26536c = null;
        this.f26537d = bVar;
    }

    public final d a() {
        return this.f26534a;
    }

    public final b b() {
        return this.f26537d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f26534a, cVar.f26534a) && f.b(this.f26535b, cVar.f26535b) && f.b(this.f26536c, cVar.f26536c) && f.b(this.f26537d, cVar.f26537d);
    }

    public final int hashCode() {
        d dVar = this.f26534a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        a aVar = this.f26535b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f26536c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.f26537d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "SecurityInfoResponseRaw(limits=" + this.f26534a + ", secureSettings=" + this.f26535b + ", isCard3dSecureActivated=" + this.f26536c + ", security=" + this.f26537d + ")";
    }
}
