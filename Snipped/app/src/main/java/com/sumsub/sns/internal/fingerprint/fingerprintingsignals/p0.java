package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class p0 extends v<List<? extends com.sumsub.sns.internal.fingerprint.infoproviders.g0>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17093b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17094c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final List<com.sumsub.sns.internal.fingerprint.infoproviders.g0> f17095a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return p0.f17094c;
        }

        public a() {
        }
    }

    public p0(List<com.sumsub.sns.internal.fingerprint.infoproviders.g0> list) {
        super(null);
        this.f17095a = list;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        String b9;
        List<com.sumsub.sns.internal.fingerprint.infoproviders.g0> f10 = f();
        ArrayList arrayList = new ArrayList(P9.n.u(f10, 10));
        int i = 0;
        for (Object obj : f10) {
            int i9 = i + 1;
            if (i < 0) {
                P9.m.t();
                throw null;
            }
            com.sumsub.sns.internal.fingerprint.infoproviders.g0 g0Var = (com.sumsub.sns.internal.fingerprint.infoproviders.g0) obj;
            StringBuilder sb2 = new StringBuilder("sensor.");
            sb2.append(i);
            sb2.append('.');
            b9 = w.b(g0Var.a());
            sb2.append(b9);
            arrayList.add(new Pair(sb2.toString(), g0Var.b()));
            i = i9;
        }
        return kotlin.collections.a.v(arrayList);
    }

    public List<com.sumsub.sns.internal.fingerprint.infoproviders.g0> f() {
        return this.f17095a;
    }
}
