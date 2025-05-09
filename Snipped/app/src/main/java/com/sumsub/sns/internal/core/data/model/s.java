package com.sumsub.sns.internal.core.data.model;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f15785a;

    /* renamed from: b, reason: collision with root package name */
    public final Document f15786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15787c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15788d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15789e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15790f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15791g;

    public s(String str, Document document, String str2, String str3, String str4, String str5, String str6) {
        this.f15785a = str;
        this.f15786b = document;
        this.f15787c = str2;
        this.f15788d = str3;
        this.f15789e = str4;
        this.f15790f = str5;
        this.f15791g = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.f.b(this.f15785a, sVar.f15785a) && kotlin.jvm.internal.f.b(this.f15786b, sVar.f15786b) && kotlin.jvm.internal.f.b(this.f15787c, sVar.f15787c) && kotlin.jvm.internal.f.b(this.f15788d, sVar.f15788d) && kotlin.jvm.internal.f.b(this.f15789e, sVar.f15789e) && kotlin.jvm.internal.f.b(this.f15790f, sVar.f15790f) && kotlin.jvm.internal.f.b(this.f15791g, sVar.f15791g);
    }

    public final String h() {
        return this.f15785a;
    }

    public int hashCode() {
        int hashCode = (this.f15786b.hashCode() + (this.f15785a.hashCode() * 31)) * 31;
        String str = this.f15787c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15788d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15789e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15790f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15791g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f15788d;
    }

    public final Document j() {
        return this.f15786b;
    }

    public final String k() {
        return this.f15787c;
    }

    public final String l() {
        return this.f15791g;
    }

    public final String m() {
        return this.f15790f;
    }

    public final String n() {
        return this.f15789e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MRTDDocument(applicantId=");
        sb2.append(this.f15785a);
        sb2.append(", document=");
        sb2.append(this.f15786b);
        sb2.append(", idDocType=");
        sb2.append(this.f15787c);
        sb2.append(", country=");
        sb2.append(this.f15788d);
        sb2.append(", mrtdSeed=");
        sb2.append(this.f15789e);
        sb2.append(", mrtdDataFilesToRead=");
        sb2.append(this.f15790f);
        sb2.append(", imageId=");
        return C.v.q(sb2, this.f15791g, ')');
    }
}
