package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import ca.InterfaceC0646l;
import com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class g extends v<List<? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17037b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final v.a f17038c = new v.a(StabilityLevel.OPTIMAL);

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f17039a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v.a a() {
            return g.f17038c;
        }

        public a() {
        }
    }

    public g(List<String> list) {
        super(null);
        this.f17039a = list;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.v
    public Map<String, String> d() {
        return com.google.android.gms.measurement.internal.a.n("available_locales", P9.s.P(f(), null, null, null, b.f17040a, 31));
    }

    public List<String> f() {
        return this.f17039a;
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17040a = new b();

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
