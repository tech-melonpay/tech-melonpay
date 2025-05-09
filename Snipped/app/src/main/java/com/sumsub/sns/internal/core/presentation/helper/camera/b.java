package com.sumsub.sns.internal.core.presentation.helper.camera;

import C.v;
import com.sumsub.sns.internal.core.presentation.intro.f;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f16593a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f16594b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f16595c;

        /* renamed from: d, reason: collision with root package name */
        public final f f16596d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16597e;

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, f fVar, String str) {
            super(null);
            this.f16593a = charSequence;
            this.f16594b = charSequence2;
            this.f16595c = charSequence3;
            this.f16596d = fVar;
            this.f16597e = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f16593a, aVar.f16593a) && kotlin.jvm.internal.f.b(this.f16594b, aVar.f16594b) && kotlin.jvm.internal.f.b(this.f16595c, aVar.f16595c) && kotlin.jvm.internal.f.b(this.f16596d, aVar.f16596d) && kotlin.jvm.internal.f.b(this.f16597e, aVar.f16597e);
        }

        public final CharSequence f() {
            return this.f16594b;
        }

        public final String g() {
            return this.f16597e;
        }

        public final CharSequence h() {
            return this.f16595c;
        }

        public int hashCode() {
            int hashCode = (this.f16596d.hashCode() + ((this.f16595c.hashCode() + ((this.f16594b.hashCode() + (this.f16593a.hashCode() * 31)) * 31)) * 31)) * 31;
            String str = this.f16597e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final f i() {
            return this.f16596d;
        }

        public final CharSequence j() {
            return this.f16593a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BriefDetails(title=");
            sb2.append((Object) this.f16593a);
            sb2.append(", brief=");
            sb2.append((Object) this.f16594b);
            sb2.append(", details=");
            sb2.append((Object) this.f16595c);
            sb2.append(", stepInfo=");
            sb2.append(this.f16596d);
            sb2.append(", countryCode=");
            return v.q(sb2, this.f16597e, ')');
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.b$b, reason: collision with other inner class name */
    public static final class C0246b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final f f16598a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f16599b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16600c;

        public C0246b(f fVar, Map<String, ? extends Object> map, String str) {
            super(null);
            this.f16598a = fVar;
            this.f16599b = map;
            this.f16600c = str;
        }

        public final String d() {
            return this.f16600c;
        }

        public final Map<String, Object> e() {
            return this.f16599b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0246b)) {
                return false;
            }
            C0246b c0246b = (C0246b) obj;
            return kotlin.jvm.internal.f.b(this.f16598a, c0246b.f16598a) && kotlin.jvm.internal.f.b(this.f16599b, c0246b.f16599b) && kotlin.jvm.internal.f.b(this.f16600c, c0246b.f16600c);
        }

        public final f f() {
            return this.f16598a;
        }

        public int hashCode() {
            int hashCode = (this.f16599b.hashCode() + (this.f16598a.hashCode() * 31)) * 31;
            String str = this.f16600c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Intro(stepInfo=");
            sb2.append(this.f16598a);
            sb2.append(", instuctionsData=");
            sb2.append(this.f16599b);
            sb2.append(", countryCode=");
            return v.q(sb2, this.f16600c, ')');
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f16601a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public b() {
    }
}
