package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.internal.core.data.model.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f15431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15432b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15433c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15434d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15435e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15436f;

    /* renamed from: g, reason: collision with root package name */
    public final c f15437g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15438h;
    public final com.sumsub.sns.internal.core.data.model.b i;

    /* renamed from: j, reason: collision with root package name */
    public d f15439j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15440k;

    /* renamed from: l, reason: collision with root package name */
    public final a f15441l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15442m;

    /* renamed from: n, reason: collision with root package name */
    public final List<b> f15443n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15444o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15445p;

    /* renamed from: q, reason: collision with root package name */
    public final List<com.sumsub.sns.internal.core.data.source.applicant.remote.u> f15446q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f15447a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15448b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15449c;

        /* renamed from: d, reason: collision with root package name */
        public final String f15450d;

        /* renamed from: e, reason: collision with root package name */
        public final String f15451e;

        /* renamed from: f, reason: collision with root package name */
        public final String f15452f;

        /* renamed from: g, reason: collision with root package name */
        public final String f15453g;

        /* renamed from: h, reason: collision with root package name */
        public final String f15454h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final String f15455j;

        /* renamed from: k, reason: collision with root package name */
        public final String f15456k;

        /* renamed from: l, reason: collision with root package name */
        public final List<Map<String, String>> f15457l;

        /* renamed from: m, reason: collision with root package name */
        public final String f15458m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<? extends Map<String, String>> list, String str12) {
            this.f15447a = str;
            this.f15448b = str2;
            this.f15449c = str3;
            this.f15450d = str4;
            this.f15451e = str5;
            this.f15452f = str6;
            this.f15453g = str7;
            this.f15454h = str8;
            this.i = str9;
            this.f15455j = str10;
            this.f15456k = str11;
            this.f15457l = list;
            this.f15458m = str12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f15447a, aVar.f15447a) && kotlin.jvm.internal.f.b(this.f15448b, aVar.f15448b) && kotlin.jvm.internal.f.b(this.f15449c, aVar.f15449c) && kotlin.jvm.internal.f.b(this.f15450d, aVar.f15450d) && kotlin.jvm.internal.f.b(this.f15451e, aVar.f15451e) && kotlin.jvm.internal.f.b(this.f15452f, aVar.f15452f) && kotlin.jvm.internal.f.b(this.f15453g, aVar.f15453g) && kotlin.jvm.internal.f.b(this.f15454h, aVar.f15454h) && kotlin.jvm.internal.f.b(this.i, aVar.i) && kotlin.jvm.internal.f.b(this.f15455j, aVar.f15455j) && kotlin.jvm.internal.f.b(this.f15456k, aVar.f15456k) && kotlin.jvm.internal.f.b(this.f15457l, aVar.f15457l) && kotlin.jvm.internal.f.b(this.f15458m, aVar.f15458m);
        }

        public int hashCode() {
            String str = this.f15447a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f15448b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f15449c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f15450d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f15451e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f15452f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f15453g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f15454h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f15455j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f15456k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            List<Map<String, String>> list = this.f15457l;
            int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
            String str12 = this.f15458m;
            return hashCode12 + (str12 != null ? str12.hashCode() : 0);
        }

        public final List<Map<String, String>> n() {
            return this.f15457l;
        }

        public final String o() {
            return this.f15447a;
        }

        public final String p() {
            return this.i;
        }

        public final String q() {
            return this.f15453g;
        }

        public final String r() {
            return this.f15448b;
        }

        public final String s() {
            return this.f15452f;
        }

        public final String t() {
            return this.f15449c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Info(country=");
            sb2.append(this.f15447a);
            sb2.append(", firstName=");
            sb2.append(this.f15448b);
            sb2.append(", lastName=");
            sb2.append(this.f15449c);
            sb2.append(", middleName=");
            sb2.append(this.f15450d);
            sb2.append(", legalName=");
            sb2.append(this.f15451e);
            sb2.append(", gender=");
            sb2.append(this.f15452f);
            sb2.append(", dob=");
            sb2.append(this.f15453g);
            sb2.append(", placeOfBirth=");
            sb2.append(this.f15454h);
            sb2.append(", countryOfBirth=");
            sb2.append(this.i);
            sb2.append(", stateOfBirth=");
            sb2.append(this.f15455j);
            sb2.append(", nationality=");
            sb2.append(this.f15456k);
            sb2.append(", addresses=");
            sb2.append(this.f15457l);
            sb2.append(", tin=");
            return C.v.q(sb2, this.f15458m, ')');
        }

        public final String u() {
            return this.f15451e;
        }

        public final String v() {
            return this.f15450d;
        }

        public final String w() {
            return this.f15456k;
        }

        public final String x() {
            return this.f15454h;
        }

        public final String y() {
            return this.f15455j;
        }

        public final String z() {
            return this.f15458m;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f15459a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15460b;

        public b(String str, String str2) {
            this.f15459a = str;
            this.f15460b = str2;
        }

        public final String c() {
            return this.f15459a;
        }

        public final String d() {
            return this.f15460b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f15459a, bVar.f15459a) && kotlin.jvm.internal.f.b(this.f15460b, bVar.f15460b);
        }

        public int hashCode() {
            return this.f15460b.hashCode() + (this.f15459a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MetaValue(key=");
            sb2.append(this.f15459a);
            sb2.append(", value=");
            return C.v.q(sb2, this.f15460b, ')');
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f15461a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15462b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f15463c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f15464d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f15465e;

        /* renamed from: f, reason: collision with root package name */
        public final List<String> f15466f;

        public static final class a {

            /* renamed from: j, reason: collision with root package name */
            public static final C0206a f15467j = new C0206a(null);

            /* renamed from: a, reason: collision with root package name */
            public final DocumentType f15468a;

            /* renamed from: b, reason: collision with root package name */
            public final List<String> f15469b;

            /* renamed from: c, reason: collision with root package name */
            public final List<IdentitySide> f15470c;

            /* renamed from: d, reason: collision with root package name */
            public final String f15471d;

            /* renamed from: e, reason: collision with root package name */
            public final List<h.d> f15472e;

            /* renamed from: f, reason: collision with root package name */
            public final List<h.c> f15473f;

            /* renamed from: g, reason: collision with root package name */
            public final String f15474g;

            /* renamed from: h, reason: collision with root package name */
            public final String f15475h;
            public final String i;

            /* renamed from: com.sumsub.sns.internal.core.data.model.g$c$a$a, reason: collision with other inner class name */
            public static final class C0206a {
                public /* synthetic */ C0206a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public C0206a() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(DocumentType documentType, List<String> list, List<? extends IdentitySide> list2, String str, List<h.d> list3, List<h.c> list4, String str2, String str3, String str4) {
                this.f15468a = documentType;
                this.f15469b = list;
                this.f15470c = list2;
                this.f15471d = str;
                this.f15472e = list3;
                this.f15473f = list4;
                this.f15474g = str2;
                this.f15475h = str3;
                this.i = str4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f15468a, aVar.f15468a) && kotlin.jvm.internal.f.b(this.f15469b, aVar.f15469b) && kotlin.jvm.internal.f.b(this.f15470c, aVar.f15470c) && kotlin.jvm.internal.f.b(this.f15471d, aVar.f15471d) && kotlin.jvm.internal.f.b(this.f15472e, aVar.f15472e) && kotlin.jvm.internal.f.b(this.f15473f, aVar.f15473f) && kotlin.jvm.internal.f.b(this.f15474g, aVar.f15474g) && kotlin.jvm.internal.f.b(this.f15475h, aVar.f15475h) && kotlin.jvm.internal.f.b(this.i, aVar.i);
            }

            public int hashCode() {
                int f10 = C.v.f(this.f15470c, C.v.f(this.f15469b, this.f15468a.hashCode() * 31, 31), 31);
                String str = this.f15471d;
                int hashCode = (f10 + (str == null ? 0 : str.hashCode())) * 31;
                List<h.d> list = this.f15472e;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                List<h.c> list2 = this.f15473f;
                int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str2 = this.f15474g;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f15475h;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.i;
                return hashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            public final List<h.c> k() {
                return this.f15473f;
            }

            public final List<h.d> l() {
                return this.f15472e;
            }

            public final DocumentType m() {
                return this.f15468a;
            }

            public final String n() {
                return this.f15475h;
            }

            public final String o() {
                return this.f15474g;
            }

            public final List<String> q() {
                return this.f15469b;
            }

            public final String r() {
                return this.f15471d;
            }

            public final boolean s() {
                return !kotlin.jvm.internal.f.b(this.i != null ? r0.toLowerCase(Locale.ROOT) : null, "manualonly");
            }

            public final boolean t() {
                String str = this.i;
                return kotlin.jvm.internal.f.b(str != null ? str.toLowerCase(Locale.ROOT) : null, "manualandauto");
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("DocSetsItem(idDocSetType=");
                sb2.append(this.f15468a);
                sb2.append(", types=");
                sb2.append(this.f15469b);
                sb2.append(", sides=");
                sb2.append(this.f15470c);
                sb2.append(", videoRequired=");
                sb2.append(this.f15471d);
                sb2.append(", fields=");
                sb2.append(this.f15472e);
                sb2.append(", customField=");
                sb2.append(this.f15473f);
                sb2.append(", questionnaireId=");
                sb2.append(this.f15474g);
                sb2.append(", questionnaireDefId=");
                sb2.append(this.f15475h);
                sb2.append(", captureMode=");
                return C.v.q(sb2, this.i, ')');
            }

            public final boolean u() {
                String str = this.i;
                return kotlin.jvm.internal.f.b(str != null ? str.toLowerCase(Locale.ROOT) : null, "seamless") && kotlin.jvm.internal.f.b(this.f15471d, VideoRequiredType.DocCapture.getValue());
            }

            public final boolean v() {
                return this.f15468a.k() && kotlin.jvm.internal.f.b(this.f15471d, VideoRequiredType.PhotoRequired.getValue());
            }

            public final boolean w() {
                return this.f15468a.k() && kotlin.jvm.internal.f.b(this.f15471d, VideoRequiredType.Disabled.getValue());
            }
        }

        public c(List<a> list, boolean z10, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f15461a = list;
            this.f15462b = z10;
            this.f15463c = list2;
            this.f15464d = list3;
            this.f15465e = list4;
            this.f15466f = list5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f15461a, cVar.f15461a) && this.f15462b == cVar.f15462b && kotlin.jvm.internal.f.b(this.f15463c, cVar.f15463c) && kotlin.jvm.internal.f.b(this.f15464d, cVar.f15464d) && kotlin.jvm.internal.f.b(this.f15465e, cVar.f15465e) && kotlin.jvm.internal.f.b(this.f15466f, cVar.f15466f);
        }

        public final List<a> g() {
            return this.f15461a;
        }

        public final List<String> h() {
            return this.f15466f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f15461a.hashCode() * 31;
            boolean z10 = this.f15462b;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode + i) * 31;
            List<String> list = this.f15463c;
            int hashCode2 = (i9 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f15464d;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.f15465e;
            int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.f15466f;
            return hashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        public final List<String> i() {
            return this.f15465e;
        }

        public final List<String> j() {
            return this.f15464d;
        }

        public final boolean k() {
            return this.f15462b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequiredIdDocs(docSets=");
            sb2.append(this.f15461a);
            sb2.append(", videoIdent=");
            sb2.append(this.f15462b);
            sb2.append(", videoIdentUploadTypes=");
            sb2.append(this.f15463c);
            sb2.append(", stepsOutsideVideoId=");
            sb2.append(this.f15464d);
            sb2.append(", includedCountries=");
            sb2.append(this.f15465e);
            sb2.append(", excludedCountries=");
            return C.v.r(sb2, this.f15466f, ')');
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f15476a;

        /* renamed from: b, reason: collision with root package name */
        public final ReviewStatusType f15477b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f15478c;

        /* renamed from: d, reason: collision with root package name */
        public final String f15479d;

        /* renamed from: e, reason: collision with root package name */
        public final a f15480e;

        /* renamed from: f, reason: collision with root package name */
        public final Long f15481f;

        /* renamed from: g, reason: collision with root package name */
        public final Long f15482g;

        /* renamed from: h, reason: collision with root package name */
        public final String f15483h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f15484a;

            /* renamed from: b, reason: collision with root package name */
            public final String f15485b;

            /* renamed from: c, reason: collision with root package name */
            public final ReviewAnswerType f15486c;

            /* renamed from: d, reason: collision with root package name */
            public final List<String> f15487d;

            /* renamed from: e, reason: collision with root package name */
            public final ReviewRejectType f15488e;

            public a(String str, String str2, ReviewAnswerType reviewAnswerType, List<String> list, ReviewRejectType reviewRejectType) {
                this.f15484a = str;
                this.f15485b = str2;
                this.f15486c = reviewAnswerType;
                this.f15487d = list;
                this.f15488e = reviewRejectType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f15484a, aVar.f15484a) && kotlin.jvm.internal.f.b(this.f15485b, aVar.f15485b) && this.f15486c == aVar.f15486c && kotlin.jvm.internal.f.b(this.f15487d, aVar.f15487d) && this.f15488e == aVar.f15488e;
            }

            public final String g() {
                return this.f15484a;
            }

            public int hashCode() {
                String str = this.f15484a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f15485b;
                return this.f15488e.hashCode() + C.v.f(this.f15487d, (this.f15486c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31);
            }

            public final ReviewAnswerType i() {
                return this.f15486c;
            }

            public final ReviewRejectType j() {
                return this.f15488e;
            }

            public String toString() {
                return "Result(moderationComment=" + this.f15484a + ", clientComment=" + this.f15485b + ", reviewAnswer=" + this.f15486c + ", rejectLabels=" + this.f15487d + ", reviewRejectType=" + this.f15488e + ')';
            }
        }

        public d(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, a aVar, Long l10, Long l11, String str2) {
            this.f15476a = num;
            this.f15477b = reviewStatusType;
            this.f15478c = num2;
            this.f15479d = str;
            this.f15480e = aVar;
            this.f15481f = l10;
            this.f15482g = l11;
            this.f15483h = str2;
        }

        public final d a(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, a aVar, Long l10, Long l11, String str2) {
            return new d(num, reviewStatusType, num2, str, aVar, l10, l11, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f15476a, dVar.f15476a) && this.f15477b == dVar.f15477b && kotlin.jvm.internal.f.b(this.f15478c, dVar.f15478c) && kotlin.jvm.internal.f.b(this.f15479d, dVar.f15479d) && kotlin.jvm.internal.f.b(this.f15480e, dVar.f15480e) && kotlin.jvm.internal.f.b(this.f15481f, dVar.f15481f) && kotlin.jvm.internal.f.b(this.f15482g, dVar.f15482g) && kotlin.jvm.internal.f.b(this.f15483h, dVar.f15483h);
        }

        public int hashCode() {
            Integer num = this.f15476a;
            int hashCode = (this.f15477b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
            Integer num2 = this.f15478c;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.f15479d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f15480e;
            int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Long l10 = this.f15481f;
            int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.f15482g;
            int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.f15483h;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String l() {
            return this.f15483h;
        }

        public final a o() {
            return this.f15480e;
        }

        public final ReviewStatusType p() {
            return this.f15477b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Review(notificationFailureCnt=");
            sb2.append(this.f15476a);
            sb2.append(", status=");
            sb2.append(this.f15477b);
            sb2.append(", priority=");
            sb2.append(this.f15478c);
            sb2.append(", createDate=");
            sb2.append(this.f15479d);
            sb2.append(", result=");
            sb2.append(this.f15480e);
            sb2.append(", elapsedSinceQueuedMs=");
            sb2.append(this.f15481f);
            sb2.append(", elapsedSincePendingMs=");
            sb2.append(this.f15482g);
            sb2.append(", levelName=");
            return C.v.q(sb2, this.f15483h, ')');
        }
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6, c cVar, String str7, com.sumsub.sns.internal.core.data.model.b bVar, d dVar, String str8, a aVar, String str9, List<b> list, String str10, String str11, List<com.sumsub.sns.internal.core.data.source.applicant.remote.u> list2) {
        this.f15431a = str;
        this.f15432b = str2;
        this.f15433c = str3;
        this.f15434d = str4;
        this.f15435e = str5;
        this.f15436f = str6;
        this.f15437g = cVar;
        this.f15438h = str7;
        this.i = bVar;
        this.f15439j = dVar;
        this.f15440k = str8;
        this.f15441l = aVar;
        this.f15442m = str9;
        this.f15443n = list;
        this.f15444o = str10;
        this.f15445p = str11;
        this.f15446q = list2;
    }

    public final boolean A() {
        List<String> j10;
        return this.f15437g.k() && ((j10 = this.f15437g.j()) == null || j10.isEmpty());
    }

    public final String B() {
        return this.f15431a;
    }

    public final a C() {
        return this.f15441l;
    }

    public final String E() {
        return this.f15442m;
    }

    public final List<b> F() {
        return this.f15443n;
    }

    public final String G() {
        return this.f15445p;
    }

    public final List<com.sumsub.sns.internal.core.data.source.applicant.remote.u> H() {
        return this.f15446q;
    }

    public final c I() {
        return this.f15437g;
    }

    public final d J() {
        return this.f15439j;
    }

    public final ReviewStatusType K() {
        return this.f15439j.p();
    }

    public final String L() {
        return this.f15433c;
    }

    public final boolean M() {
        d.a o10 = this.f15439j.o();
        return (o10 != null ? o10.i() : null) == ReviewAnswerType.Green;
    }

    public final boolean O() {
        d.a o10 = this.f15439j.o();
        if ((o10 != null ? o10.i() : null) == ReviewAnswerType.Red && this.f15439j.p() == ReviewStatusType.Completed) {
            d.a o11 = this.f15439j.o();
            if ((o11 != null ? o11.j() : null) != ReviewRejectType.Final) {
                d.a o12 = this.f15439j.o();
                if ((o12 != null ? o12.j() : null) == ReviewRejectType.External) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean P() {
        d.a o10 = this.f15439j.o();
        if ((o10 != null ? o10.i() : null) == ReviewAnswerType.Red && this.f15439j.p() == ReviewStatusType.Completed) {
            d.a o11 = this.f15439j.o();
            if ((o11 != null ? o11.j() : null) == ReviewRejectType.Retry) {
                return true;
            }
        }
        return false;
    }

    public final void a(d dVar) {
        this.f15439j = dVar;
    }

    public final List<q> b(DocumentType documentType) {
        List<String> q10;
        c.a a10 = a(documentType);
        if (a10 == null || (q10 = a10.q()) == null) {
            return EmptyList.f23104a;
        }
        ArrayList arrayList = new ArrayList(P9.n.u(q10, 10));
        Iterator<T> it = q10.iterator();
        while (it.hasNext()) {
            arrayList.add(q.f15559c.a((String) it.next()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f15431a, gVar.f15431a) && kotlin.jvm.internal.f.b(this.f15432b, gVar.f15432b) && kotlin.jvm.internal.f.b(this.f15433c, gVar.f15433c) && kotlin.jvm.internal.f.b(this.f15434d, gVar.f15434d) && kotlin.jvm.internal.f.b(this.f15435e, gVar.f15435e) && kotlin.jvm.internal.f.b(this.f15436f, gVar.f15436f) && kotlin.jvm.internal.f.b(this.f15437g, gVar.f15437g) && kotlin.jvm.internal.f.b(this.f15438h, gVar.f15438h) && kotlin.jvm.internal.f.b(this.i, gVar.i) && kotlin.jvm.internal.f.b(this.f15439j, gVar.f15439j) && kotlin.jvm.internal.f.b(this.f15440k, gVar.f15440k) && kotlin.jvm.internal.f.b(this.f15441l, gVar.f15441l) && kotlin.jvm.internal.f.b(this.f15442m, gVar.f15442m) && kotlin.jvm.internal.f.b(this.f15443n, gVar.f15443n) && kotlin.jvm.internal.f.b(this.f15444o, gVar.f15444o) && kotlin.jvm.internal.f.b(this.f15445p, gVar.f15445p) && kotlin.jvm.internal.f.b(this.f15446q, gVar.f15446q);
    }

    public int hashCode() {
        int hashCode = this.f15431a.hashCode() * 31;
        String str = this.f15432b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15433c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15434d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15435e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15436f;
        int hashCode6 = (this.f15437g.hashCode() + ((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.f15438h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        com.sumsub.sns.internal.core.data.model.b bVar = this.i;
        int hashCode8 = (this.f15439j.hashCode() + ((hashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        String str7 = this.f15440k;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        a aVar = this.f15441l;
        int hashCode10 = (hashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str8 = this.f15442m;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<b> list = this.f15443n;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.f15444o;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f15445p;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<com.sumsub.sns.internal.core.data.source.applicant.remote.u> list2 = this.f15446q;
        return hashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final com.sumsub.sns.internal.core.data.model.b r() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Applicant(id=");
        sb2.append(this.f15431a);
        sb2.append(", applicantId=");
        sb2.append(this.f15432b);
        sb2.append(", type=");
        sb2.append(this.f15433c);
        sb2.append(", clientId=");
        sb2.append(this.f15434d);
        sb2.append(", createdAt=");
        sb2.append(this.f15435e);
        sb2.append(", inspectionId=");
        sb2.append(this.f15436f);
        sb2.append(", requiredIdDocs=");
        sb2.append(this.f15437g);
        sb2.append(", externalUserId=");
        sb2.append(this.f15438h);
        sb2.append(", agreement=");
        sb2.append(this.i);
        sb2.append(", review=");
        sb2.append(this.f15439j);
        sb2.append(", env=");
        sb2.append(this.f15440k);
        sb2.append(", info=");
        sb2.append(this.f15441l);
        sb2.append(", lang=");
        sb2.append(this.f15442m);
        sb2.append(", metadata=");
        sb2.append(this.f15443n);
        sb2.append(", email=");
        sb2.append(this.f15444o);
        sb2.append(", phone=");
        sb2.append(this.f15445p);
        sb2.append(", questionnaires=");
        return C.v.r(sb2, this.f15446q, ')');
    }

    public final String u() {
        a aVar = this.f15441l;
        if (aVar != null) {
            return aVar.o();
        }
        return null;
    }

    public final String x() {
        return this.f15444o;
    }

    public final String z() {
        return this.f15438h;
    }

    public final c.a a(DocumentType documentType) {
        Object obj;
        Iterator<T> it = this.f15437g.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.f.b(((c.a) obj).m(), documentType)) {
                break;
            }
        }
        return (c.a) obj;
    }

    public final boolean a(String str) {
        List<String> j10;
        return this.f15437g.k() && ((j10 = this.f15437g.j()) == null || !j10.contains(str));
    }
}
