package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class j extends v<List<? extends com.sumsub.sns.internal.fingerprint.infoproviders.d>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17053b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17054c = new v.a(StabilityLevel.STABLE);

    /* renamed from: a, reason: collision with root package name */
    public final List<com.sumsub.sns.internal.fingerprint.infoproviders.d> f17055a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return j.f17054c;
        }

        public a() {
        }
    }

    public j(List<com.sumsub.sns.internal.fingerprint.infoproviders.d> list) {
        super(null);
        this.f17055a = list;
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
            com.sumsub.sns.internal.fingerprint.infoproviders.d dVar = (com.sumsub.sns.internal.fingerprint.infoproviders.d) obj;
            linkedHashMap.put(com.google.android.gms.measurement.internal.a.g(i, "camera_name."), dVar.d());
            linkedHashMap.put("camera_type." + i, dVar.f());
            linkedHashMap.put("camera_orientation." + i, dVar.e());
            i = i9;
        }
        return linkedHashMap;
    }

    public List<com.sumsub.sns.internal.fingerprint.infoproviders.d> f() {
        return this.f17055a;
    }
}
