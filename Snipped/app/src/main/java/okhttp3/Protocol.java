package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Protocol;", "", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    public final String f24425a;

    /* compiled from: Protocol.kt */
    public static final class a {
        public static Protocol a(String str) {
            if (kotlin.jvm.internal.f.b(str, "http/1.0")) {
                return Protocol.HTTP_1_0;
            }
            if (kotlin.jvm.internal.f.b(str, "http/1.1")) {
                return Protocol.HTTP_1_1;
            }
            if (kotlin.jvm.internal.f.b(str, "h2_prior_knowledge")) {
                return Protocol.H2_PRIOR_KNOWLEDGE;
            }
            if (kotlin.jvm.internal.f.b(str, "h2")) {
                return Protocol.HTTP_2;
            }
            if (kotlin.jvm.internal.f.b(str, "spdy/3.1")) {
                return Protocol.SPDY_3;
            }
            if (kotlin.jvm.internal.f.b(str, "quic")) {
                return Protocol.QUIC;
            }
            throw new IOException("Unexpected protocol: ".concat(str));
        }
    }

    Protocol(String str) {
        this.f24425a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f24425a;
    }
}
