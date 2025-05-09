package com.luminary.business.domain.entity.templates;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;

/* compiled from: CheckRequisitesDomain.kt */
/* loaded from: classes.dex */
public final class CheckRequisitesDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11132a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11133b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f11134c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain> f11135d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f11136e;

    public CheckRequisitesDomain(String str, String str2, Boolean bool, LinkedHashMap linkedHashMap, Boolean bool2) {
        this.f11132a = str;
        this.f11133b = str2;
        this.f11134c = bool;
        this.f11135d = linkedHashMap;
        this.f11136e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckRequisitesDomain)) {
            return false;
        }
        CheckRequisitesDomain checkRequisitesDomain = (CheckRequisitesDomain) obj;
        return f.b(this.f11132a, checkRequisitesDomain.f11132a) && f.b(this.f11133b, checkRequisitesDomain.f11133b) && f.b(this.f11134c, checkRequisitesDomain.f11134c) && f.b(this.f11135d, checkRequisitesDomain.f11135d) && f.b(this.f11136e, checkRequisitesDomain.f11136e);
    }

    public final int hashCode() {
        String str = this.f11132a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11133b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f11134c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain> map = this.f11135d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.f11136e;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "CheckRequisitesDomain(country=" + this.f11132a + ", currency=" + this.f11133b + ", allowOutgoingPayment=" + this.f11134c + ", paymentRequisites=" + this.f11135d + ", allowIncomingPayment=" + this.f11136e + ")";
    }
}
