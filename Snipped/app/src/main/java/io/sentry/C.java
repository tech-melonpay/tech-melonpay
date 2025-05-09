package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: JsonObjectDeserializer.java */
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<c> f21789a = new ArrayList<>();

    /* compiled from: JsonObjectDeserializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21790a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f21790a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21790a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21790a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21790a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21790a[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21790a[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21790a[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21790a[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21790a[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21790a[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    public interface b {
        Object a();
    }

    /* compiled from: JsonObjectDeserializer.java */
    public interface c {
        Object getValue();
    }

    /* compiled from: JsonObjectDeserializer.java */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<Object> f21791a = new ArrayList<>();

        @Override // io.sentry.C.c
        public final Object getValue() {
            return this.f21791a;
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<String, Object> f21792a = new HashMap<>();

        @Override // io.sentry.C.c
        public final Object getValue() {
            return this.f21792a;
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f21793a;

        public f(String str) {
            this.f21793a = str;
        }

        @Override // io.sentry.C.c
        public final Object getValue() {
            return this.f21793a;
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    public static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21794a;

        public g(Object obj) {
            this.f21794a = obj;
        }

        @Override // io.sentry.C.c
        public final Object getValue() {
            return this.f21794a;
        }
    }

    public final c a() {
        ArrayList<c> arrayList = this.f21789a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (c) com.google.android.gms.measurement.internal.a.f(1, arrayList);
    }

    public final boolean b() {
        if (this.f21789a.size() == 1) {
            return true;
        }
        c a10 = a();
        e();
        if (!(a() instanceof f)) {
            if (!(a() instanceof d)) {
                return false;
            }
            d dVar = (d) a();
            if (a10 == null || dVar == null) {
                return false;
            }
            dVar.f21791a.add(a10.getValue());
            return false;
        }
        f fVar = (f) a();
        e();
        e eVar = (e) a();
        if (fVar == null || a10 == null || eVar == null) {
            return false;
        }
        eVar.f21792a.put(fVar.f21793a, a10.getValue());
        return false;
    }

    public final boolean c(b bVar) {
        Object a10 = bVar.a();
        if (a() == null && a10 != null) {
            this.f21789a.add(new g(a10));
            return true;
        }
        if (a() instanceof f) {
            f fVar = (f) a();
            e();
            ((e) a()).f21792a.put(fVar.f21793a, a10);
            return false;
        }
        if (!(a() instanceof d)) {
            return false;
        }
        ((d) a()).f21791a.add(a10);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d(final D d10) {
        boolean b9;
        int i = a.f21790a[d10.v0().ordinal()];
        ArrayList<c> arrayList = this.f21789a;
        switch (i) {
            case 1:
                d10.d();
                arrayList.add(new d());
                d(d10);
            case 2:
                d10.y();
                b9 = b();
                break;
            case 3:
                d10.i();
                arrayList.add(new e());
                d(d10);
            case 4:
                d10.A();
                b9 = b();
                break;
            case 5:
                arrayList.add(new f(d10.g0()));
                d(d10);
            case 6:
                final int i9 = 0;
                b9 = c(new b() { // from class: io.sentry.B
                    @Override // io.sentry.C.b
                    public final Object a() {
                        switch (i9) {
                            case 0:
                                return d10.r0();
                            default:
                                return Boolean.valueOf(d10.G());
                        }
                    }
                });
                break;
            case 7:
                b9 = c(new B.e(5, this, d10));
                break;
            case 8:
                final int i10 = 1;
                b9 = c(new b() { // from class: io.sentry.B
                    @Override // io.sentry.C.b
                    public final Object a() {
                        switch (i10) {
                            case 0:
                                return d10.r0();
                            default:
                                return Boolean.valueOf(d10.G());
                        }
                    }
                });
                break;
            case 9:
                d10.n0();
                b9 = c(new com.google.android.gms.measurement.internal.a(17));
                break;
            case 10:
                return;
            default:
                d(d10);
        }
        if (b9) {
            return;
        }
        d(d10);
    }

    public final void e() {
        ArrayList<c> arrayList = this.f21789a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
