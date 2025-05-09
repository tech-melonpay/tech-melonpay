package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: ExtensionRegistryLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666m {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0666m f10250b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0666m f10251c = new C0666m(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f10252a;

    /* compiled from: ExtensionRegistryLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10253a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10254b;

        public a(Object obj, int i) {
            this.f10253a = obj;
            this.f10254b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10253a == aVar.f10253a && this.f10254b == aVar.f10254b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10253a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f10254b;
        }
    }

    public C0666m() {
        this.f10252a = new HashMap();
    }

    public static C0666m a() {
        C0666m c0666m = f10250b;
        if (c0666m == null) {
            synchronized (C0666m.class) {
                try {
                    c0666m = f10250b;
                    if (c0666m == null) {
                        Class<?> cls = C0665l.f10249a;
                        C0666m c0666m2 = null;
                        if (cls != null) {
                            try {
                                c0666m2 = (C0666m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0666m2 == null) {
                            c0666m2 = f10251c;
                        }
                        f10250b = c0666m2;
                        c0666m = c0666m2;
                    }
                } finally {
                }
            }
        }
        return c0666m;
    }

    public C0666m(int i) {
        this.f10252a = Collections.emptyMap();
    }
}
