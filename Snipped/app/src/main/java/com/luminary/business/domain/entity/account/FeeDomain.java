package com.luminary.business.domain.entity.account;

import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.f;

/* compiled from: FeeDomain.kt */
/* loaded from: classes.dex */
public final class FeeDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f10737a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10738b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f10739c;

    /* renamed from: d, reason: collision with root package name */
    public String f10740d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10741e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10742f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10743g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f10744h;

    public FeeDomain(String str, String str2, Double d10, String str3, String str4, String str5, String str6, Date date) {
        this.f10737a = str;
        this.f10738b = str2;
        this.f10739c = d10;
        this.f10740d = str3;
        this.f10741e = str4;
        this.f10742f = str5;
        this.f10743g = str6;
        this.f10744h = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeeDomain)) {
            return false;
        }
        FeeDomain feeDomain = (FeeDomain) obj;
        return f.b(this.f10737a, feeDomain.f10737a) && f.b(this.f10738b, feeDomain.f10738b) && f.b(this.f10739c, feeDomain.f10739c) && f.b(this.f10740d, feeDomain.f10740d) && f.b(this.f10741e, feeDomain.f10741e) && f.b(this.f10742f, feeDomain.f10742f) && f.b(this.f10743g, feeDomain.f10743g) && f.b(this.f10744h, feeDomain.f10744h);
    }

    public final int hashCode() {
        String str = this.f10737a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10738b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f10739c;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str3 = this.f10740d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10741e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10742f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10743g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.f10744h;
        return hashCode7 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        return "FeeDomain(method=" + this.f10737a + ", currency=" + this.f10738b + ", amount=" + this.f10739c + ", remmitance=" + this.f10740d + ", frequency=" + this.f10741e + ", each=" + this.f10742f + ", nextPayment=" + this.f10743g + ", dateCreate=" + this.f10744h + ")";
    }
}
