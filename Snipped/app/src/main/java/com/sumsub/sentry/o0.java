package com.sumsub.sentry;

import java.util.UUID;
import ka.C0967l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1165D;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0002\n\rB\u0014\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0012B\u0014\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/sumsub/sentry/o0;", "", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)I", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "value", "Ljava/util/UUID;", "uuid", "(Ljava/util/UUID;)Ljava/lang/String;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final String f13744b = a(new UUID(0, 0));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String value;

    public static final class a implements InterfaceC1162A<o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13746a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13747b;

        static {
            a aVar = new a();
            f13746a = aVar;
            C1165D c1165d = new C1165D("com.sumsub.sentry.SpanId", aVar);
            c1165d.k("value", true);
            f13747b = c1165d;
        }

        public String a(InterfaceC1144d interfaceC1144d) {
            return o0.b(interfaceC1144d.o(getDescriptor()).p());
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{ra.m0.f26414a};
        }

        @Override // na.InterfaceC1077a
        public /* bridge */ /* synthetic */ Object deserialize(InterfaceC1144d interfaceC1144d) {
            return o0.a(a(interfaceC1144d));
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13747b;
        }

        @Override // na.InterfaceC1081e
        public /* bridge */ /* synthetic */ void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
            a(interfaceC1145e, ((o0) obj).c());
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        public void a(InterfaceC1145e interfaceC1145e, String str) {
            InterfaceC1145e z10 = interfaceC1145e.z(getDescriptor());
            if (z10 == null) {
                return;
            }
            z10.F(str);
        }
    }

    /* renamed from: com.sumsub.sentry.o0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<o0> serializer() {
            return a.f13746a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ o0(String str) {
        this.value = str;
    }

    public static final /* synthetic */ o0 a(String str) {
        return new o0(str);
    }

    public static String b(String str) {
        return str;
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return C.v.o("SpanId(value=", str, ')');
    }

    public boolean equals(Object obj) {
        return a(this.value, obj);
    }

    public int hashCode() {
        return c(this.value);
    }

    public String toString() {
        return d(this.value);
    }

    public static boolean a(String str, Object obj) {
        return (obj instanceof o0) && kotlin.jvm.internal.f.b(str, ((o0) obj).c());
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final /* synthetic */ String c() {
        return this.value;
    }

    public static final boolean a(String str, String str2) {
        return kotlin.jvm.internal.f.b(str, str2);
    }

    public static /* synthetic */ String a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = C0967l.X(UUID.randomUUID().toString(), "-", "", false).substring(0, 16);
        }
        return b(str);
    }

    public static String a(UUID uuid) {
        return b(C0967l.X(uuid.toString(), "-", "", false).substring(0, 16));
    }
}
