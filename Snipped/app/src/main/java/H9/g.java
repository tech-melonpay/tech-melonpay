package H9;

import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: SentryId.java */
/* loaded from: classes2.dex */
public final class g implements F {

    /* renamed from: b, reason: collision with root package name */
    public static final g f1604b = new g(new UUID(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final UUID f1605a;

    public g() {
        this((UUID) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f1605a.compareTo(((g) obj).f1605a) == 0;
    }

    public final int hashCode() {
        return this.f1605a.hashCode();
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.H(toString());
    }

    public final String toString() {
        String uuid = this.f1605a.toString();
        Charset charset = J9.e.f2209a;
        if (uuid.equals("0000-0000")) {
            uuid = "00000000-0000-0000-0000-000000000000";
        }
        return uuid.replace("-", "");
    }

    public g(UUID uuid) {
        this.f1605a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public g(String str) {
        Charset charset = J9.e.f2209a;
        str = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.f1605a = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
