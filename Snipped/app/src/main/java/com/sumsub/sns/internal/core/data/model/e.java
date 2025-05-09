package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f15414a;

    /* renamed from: b, reason: collision with root package name */
    public final FlowType f15415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15416c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f15417d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f15418e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, Object> f15419f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> f15420g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<String, String> f15421h;
    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.o> i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Map<String, String>> f15422j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, List<j>> f15423k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, Map<String, String>> f15424l;

    /* renamed from: m, reason: collision with root package name */
    public final Map<String, w> f15425m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15426n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15427o;

    /* renamed from: p, reason: collision with root package name */
    public a f15428p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f15429a;

        /* renamed from: b, reason: collision with root package name */
        public final FlowActionType f15430b;

        public a(String str, FlowActionType flowActionType) {
            this.f15429a = str;
            this.f15430b = flowActionType;
        }

        public final String c() {
            return this.f15429a;
        }

        public final FlowActionType d() {
            return this.f15430b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f15429a, aVar.f15429a) && kotlin.jvm.internal.f.b(this.f15430b, aVar.f15430b);
        }

        public int hashCode() {
            return this.f15430b.hashCode() + (this.f15429a.hashCode() * 31);
        }

        public String toString() {
            return "Action(id=" + this.f15429a + ", type=" + this.f15430b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, FlowType flowType, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map4, Map<String, String> map5, Map<String, com.sumsub.sns.internal.core.data.model.remote.o> map6, Map<String, ? extends Map<String, String>> map7, Map<String, ? extends List<j>> map8, Map<String, ? extends Map<String, String>> map9, Map<String, w> map10, String str3, String str4, a aVar) {
        this.f15414a = str;
        this.f15415b = flowType;
        this.f15416c = str2;
        this.f15417d = map;
        this.f15418e = map2;
        this.f15419f = map3;
        this.f15420g = map4;
        this.f15421h = map5;
        this.i = map6;
        this.f15422j = map7;
        this.f15423k = map8;
        this.f15424l = map9;
        this.f15425m = map10;
        this.f15426n = str3;
        this.f15427o = str4;
        this.f15428p = aVar;
    }

    public final Map<String, String> A() {
        return this.f15421h;
    }

    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> B() {
        return this.f15420g;
    }

    public final Map<String, Object> C() {
        return this.f15417d;
    }

    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.o> D() {
        return this.i;
    }

    public final Map<String, Object> E() {
        return this.f15419f;
    }

    public final String F() {
        return this.f15426n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f15414a, eVar.f15414a) && this.f15415b == eVar.f15415b && kotlin.jvm.internal.f.b(this.f15416c, eVar.f15416c) && kotlin.jvm.internal.f.b(this.f15417d, eVar.f15417d) && kotlin.jvm.internal.f.b(this.f15418e, eVar.f15418e) && kotlin.jvm.internal.f.b(this.f15419f, eVar.f15419f) && kotlin.jvm.internal.f.b(this.f15420g, eVar.f15420g) && kotlin.jvm.internal.f.b(this.f15421h, eVar.f15421h) && kotlin.jvm.internal.f.b(this.i, eVar.i) && kotlin.jvm.internal.f.b(this.f15422j, eVar.f15422j) && kotlin.jvm.internal.f.b(this.f15423k, eVar.f15423k) && kotlin.jvm.internal.f.b(this.f15424l, eVar.f15424l) && kotlin.jvm.internal.f.b(this.f15425m, eVar.f15425m) && kotlin.jvm.internal.f.b(this.f15426n, eVar.f15426n) && kotlin.jvm.internal.f.b(this.f15427o, eVar.f15427o) && kotlin.jvm.internal.f.b(this.f15428p, eVar.f15428p);
    }

    public int hashCode() {
        int hashCode = (this.f15415b.hashCode() + (this.f15414a.hashCode() * 31)) * 31;
        String str = this.f15416c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.f15417d;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.f15418e;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.f15419f;
        int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map4 = this.f15420g;
        int hashCode6 = (hashCode5 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, String> map5 = this.f15421h;
        int hashCode7 = (hashCode6 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map<String, com.sumsub.sns.internal.core.data.model.remote.o> map6 = this.i;
        int hashCode8 = (hashCode7 + (map6 == null ? 0 : map6.hashCode())) * 31;
        Map<String, Map<String, String>> map7 = this.f15422j;
        int hashCode9 = (hashCode8 + (map7 == null ? 0 : map7.hashCode())) * 31;
        Map<String, List<j>> map8 = this.f15423k;
        int hashCode10 = (hashCode9 + (map8 == null ? 0 : map8.hashCode())) * 31;
        Map<String, Map<String, String>> map9 = this.f15424l;
        int hashCode11 = (hashCode10 + (map9 == null ? 0 : map9.hashCode())) * 31;
        Map<String, w> map10 = this.f15425m;
        int hashCode12 = (hashCode11 + (map10 == null ? 0 : map10.hashCode())) * 31;
        String str2 = this.f15426n;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15427o;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.f15428p;
        return hashCode14 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String q() {
        return this.f15427o;
    }

    public final a r() {
        return this.f15428p;
    }

    public final String s() {
        return this.f15414a;
    }

    public final Map<String, Map<String, String>> t() {
        return this.f15424l;
    }

    public String toString() {
        return "AppConfig(applicantId=" + this.f15414a + ", flowType=" + this.f15415b + ", idDocSetType=" + this.f15416c + ", sdkDict=" + this.f15417d + ", documentsByCountries=" + this.f15418e + ", uiConf=" + this.f15419f + ", phoneCountryCodeWithMasks=" + this.f15420g + ", initMetadata=" + this.f15421h + ", tinCountryInfo=" + this.i + ", countryStates=" + this.f15422j + ", eKycConfig=" + this.f15423k + ", countryDependingFields=" + this.f15424l + ", ekycSources=" + this.f15425m + ", verificationUrl=" + this.f15426n + ", accessToken=" + this.f15427o + ", action=" + this.f15428p + ')';
    }

    public final Map<String, Map<String, String>> u() {
        return this.f15422j;
    }

    public final Map<String, Object> v() {
        return this.f15418e;
    }

    public final Map<String, List<j>> w() {
        return this.f15423k;
    }

    public final Map<String, w> x() {
        return this.f15425m;
    }

    public final FlowType y() {
        return this.f15415b;
    }

    public final String z() {
        return this.f15416c;
    }
}
