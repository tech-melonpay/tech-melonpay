package j2;

import com.google.android.datatransport.Priority;
import j2.AbstractC0892k;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884c extends AbstractC0892k {

    /* renamed from: a, reason: collision with root package name */
    public final String f22426a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22427b;

    /* renamed from: c, reason: collision with root package name */
    public final Priority f22428c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: j2.c$a */
    public static final class a extends AbstractC0892k.a {

        /* renamed from: a, reason: collision with root package name */
        public String f22429a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f22430b;

        /* renamed from: c, reason: collision with root package name */
        public Priority f22431c;

        public final C0884c a() {
            String str = this.f22429a == null ? " backendName" : "";
            if (this.f22431c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new C0884c(this.f22429a, this.f22430b, this.f22431c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f22429a = str;
            return this;
        }

        public final a c(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f22431c = priority;
            return this;
        }
    }

    public C0884c(String str, byte[] bArr, Priority priority) {
        this.f22426a = str;
        this.f22427b = bArr;
        this.f22428c = priority;
    }

    @Override // j2.AbstractC0892k
    public final String b() {
        return this.f22426a;
    }

    @Override // j2.AbstractC0892k
    public final byte[] c() {
        return this.f22427b;
    }

    @Override // j2.AbstractC0892k
    public final Priority d() {
        return this.f22428c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0892k)) {
            return false;
        }
        AbstractC0892k abstractC0892k = (AbstractC0892k) obj;
        if (this.f22426a.equals(abstractC0892k.b())) {
            if (Arrays.equals(this.f22427b, abstractC0892k instanceof C0884c ? ((C0884c) abstractC0892k).f22427b : abstractC0892k.c()) && this.f22428c.equals(abstractC0892k.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22426a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22427b)) * 1000003) ^ this.f22428c.hashCode();
    }
}
