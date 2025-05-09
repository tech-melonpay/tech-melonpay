package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class o0 extends v<List<? extends Pair<? extends String, ? extends String>>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17087b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17088c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final List<Pair<String, String>> f17089a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return o0.f17088c;
        }

        public a() {
        }
    }

    public o0(List<Pair<String, String>> list) {
        super(null);
        this.f17089a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : f()) {
            int i9 = i + 1;
            if (i < 0) {
                P9.m.t();
                throw null;
            }
            Pair pair = (Pair) obj;
            linkedHashMap.put("security_provider." + i + '.' + ((String) pair.f23089a), pair.f23090b);
            i = i9;
        }
        return linkedHashMap;
    }

    public List<Pair<String, String>> f() {
        return this.f17089a;
    }
}
