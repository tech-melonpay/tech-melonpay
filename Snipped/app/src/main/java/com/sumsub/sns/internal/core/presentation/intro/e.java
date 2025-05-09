package com.sumsub.sns.internal.core.presentation.intro;

import C.v;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f16610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16611b;

    /* renamed from: c, reason: collision with root package name */
    public final c f16612c;

    /* renamed from: d, reason: collision with root package name */
    public final c f16613d;

    /* renamed from: e, reason: collision with root package name */
    public final c f16614e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16615f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16616g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16617h;
    public final String i;

    public e(String str, String str2, c cVar, c cVar2, c cVar3, String str3, String str4, String str5, String str6) {
        this.f16610a = str;
        this.f16611b = str2;
        this.f16612c = cVar;
        this.f16613d = cVar2;
        this.f16614e = cVar3;
        this.f16615f = str3;
        this.f16616g = str4;
        this.f16617h = str5;
        this.i = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f16610a, eVar.f16610a) && kotlin.jvm.internal.f.b(this.f16611b, eVar.f16611b) && kotlin.jvm.internal.f.b(this.f16612c, eVar.f16612c) && kotlin.jvm.internal.f.b(this.f16613d, eVar.f16613d) && kotlin.jvm.internal.f.b(this.f16614e, eVar.f16614e) && kotlin.jvm.internal.f.b(this.f16615f, eVar.f16615f) && kotlin.jvm.internal.f.b(this.f16616g, eVar.f16616g) && kotlin.jvm.internal.f.b(this.f16617h, eVar.f16617h) && kotlin.jvm.internal.f.b(this.i, eVar.i);
    }

    public int hashCode() {
        String str = this.f16610a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16611b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f16612c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f16613d;
        int hashCode4 = (hashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f16614e;
        int hashCode5 = (hashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        String str3 = this.f16615f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16616g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16617h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String j() {
        return this.i;
    }

    public final c k() {
        return this.f16613d;
    }

    public final c l() {
        return this.f16614e;
    }

    public final String m() {
        return this.f16616g;
    }

    public final String n() {
        return this.f16615f;
    }

    public final c o() {
        return this.f16612c;
    }

    public final String p() {
        return this.f16611b;
    }

    public final String q() {
        return this.f16617h;
    }

    public final String r() {
        return this.f16610a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSIntroScreenInfo(title=");
        sb2.append(this.f16610a);
        sb2.append(", subTitle=");
        sb2.append(this.f16611b);
        sb2.append(", singleIntro=");
        sb2.append(this.f16612c);
        sb2.append(", doIntro=");
        sb2.append(this.f16613d);
        sb2.append(", doNotIntro=");
        sb2.append(this.f16614e);
        sb2.append(", image=");
        sb2.append(this.f16615f);
        sb2.append(", header=");
        sb2.append(this.f16616g);
        sb2.append(", text=");
        sb2.append(this.f16617h);
        sb2.append(", buttonText=");
        return v.q(sb2, this.i, ')');
    }
}
