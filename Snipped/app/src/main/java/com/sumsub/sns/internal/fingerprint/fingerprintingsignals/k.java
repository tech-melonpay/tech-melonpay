package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import ca.InterfaceC0646l;
import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends v<List<? extends com.sumsub.sns.internal.fingerprint.infoproviders.y>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17059b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17060c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final List<com.sumsub.sns.internal.fingerprint.infoproviders.y> f17061a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return k.f17060c;
        }

        public a() {
        }
    }

    public k(List<com.sumsub.sns.internal.fingerprint.infoproviders.y> list) {
        super(null);
        this.f17061a = list;
    }

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
            com.sumsub.sns.internal.fingerprint.infoproviders.y yVar = (com.sumsub.sns.internal.fingerprint.infoproviders.y) obj;
            linkedHashMap.put(s3.b.i("codec_info.", i, ".name"), yVar.d());
            linkedHashMap.put("codec_info." + i + ".capabilities", P9.s.P(yVar.c(), null, null, null, b.f17062a, 31));
            i = i9;
        }
        return linkedHashMap;
    }

    public List<com.sumsub.sns.internal.fingerprint.infoproviders.y> f() {
        return this.f17061a;
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17062a = new b();

        public b() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            return str;
        }
    }
}
