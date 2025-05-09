package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class h0 extends v<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17047b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17048c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f17049a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return h0.f17048c;
        }

        public a() {
        }
    }

    public h0(Map<String, String> map) {
        super(null);
        this.f17049a = map;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        String b9;
        Map<String, String> f10 = f();
        ArrayList arrayList = new ArrayList(f10.size());
        for (Map.Entry<String, String> entry : f10.entrySet()) {
            StringBuilder sb2 = new StringBuilder("proc_info.");
            b9 = w.b(entry.getKey());
            sb2.append(b9);
            arrayList.add(new Pair(sb2.toString(), entry.getValue()));
        }
        return kotlin.collections.a.v(arrayList);
    }

    public Map<String, String> f() {
        return this.f17049a;
    }
}
