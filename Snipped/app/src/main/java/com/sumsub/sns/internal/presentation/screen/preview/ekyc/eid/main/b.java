package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class b implements a.l {

    /* renamed from: a, reason: collision with root package name */
    public final a.C0301a f18328a;

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18329b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18330c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18331d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f18332e;

        /* renamed from: f, reason: collision with root package name */
        public final SNSIconHandler.SNSEidIcons f18333f;

        /* renamed from: g, reason: collision with root package name */
        public final a.i f18334g;

        /* renamed from: h, reason: collision with root package name */
        public final a.C0301a f18335h;

        public /* synthetic */ a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, SNSIconHandler.SNSEidIcons sNSEidIcons, a.i iVar, a.C0301a c0301a, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? null : sNSEidIcons, (i & 32) != 0 ? null : iVar, c0301a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f18329b, aVar.f18329b) && kotlin.jvm.internal.f.b(this.f18330c, aVar.f18330c) && kotlin.jvm.internal.f.b(this.f18331d, aVar.f18331d) && kotlin.jvm.internal.f.b(this.f18332e, aVar.f18332e) && this.f18333f == aVar.f18333f && kotlin.jvm.internal.f.b(this.f18334g, aVar.f18334g) && kotlin.jvm.internal.f.b(this.f18335h, aVar.f18335h);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18329b;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18330c;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18331d;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f18332e;
            int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            SNSIconHandler.SNSEidIcons sNSEidIcons = this.f18333f;
            int hashCode5 = (hashCode4 + (sNSEidIcons == null ? 0 : sNSEidIcons.hashCode())) * 31;
            a.i iVar = this.f18334g;
            return this.f18335h.hashCode() + ((hashCode5 + (iVar != null ? iVar.hashCode() : 0)) * 31);
        }

        public final a.i j() {
            return this.f18334g;
        }

        public final CharSequence k() {
            return this.f18332e;
        }

        public final SNSIconHandler.SNSEidIcons l() {
            return this.f18333f;
        }

        public final CharSequence n() {
            return this.f18330c;
        }

        public final CharSequence o() {
            return this.f18329b;
        }

        public String toString() {
            return "Info(title=" + ((Object) this.f18329b) + ", subtitle=" + ((Object) this.f18330c) + ", moreInfo=" + ((Object) this.f18331d) + ", buttonText=" + ((Object) this.f18332e) + ", icon=" + this.f18333f + ", buttonAction=" + this.f18334g + ", analyticsWrapper=" + this.f18335h + ')';
        }

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, SNSIconHandler.SNSEidIcons sNSEidIcons, a.i iVar, a.C0301a c0301a) {
            super(c0301a, null);
            this.f18329b = charSequence;
            this.f18330c = charSequence2;
            this.f18331d = charSequence3;
            this.f18332e = charSequence4;
            this.f18333f = sNSEidIcons;
            this.f18334g = iVar;
            this.f18335h = c0301a;
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b$b, reason: collision with other inner class name */
    public static final class C0326b extends b {

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18336b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18337c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18338d;

        /* renamed from: e, reason: collision with root package name */
        public final a.i f18339e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f18340f;

        /* renamed from: g, reason: collision with root package name */
        public final a.i f18341g;

        /* renamed from: h, reason: collision with root package name */
        public final a.C0301a f18342h;

        public C0326b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, a.i iVar, CharSequence charSequence4, a.i iVar2, a.C0301a c0301a) {
            super(c0301a, null);
            this.f18336b = charSequence;
            this.f18337c = charSequence2;
            this.f18338d = charSequence3;
            this.f18339e = iVar;
            this.f18340f = charSequence4;
            this.f18341g = iVar2;
            this.f18342h = c0301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0326b)) {
                return false;
            }
            C0326b c0326b = (C0326b) obj;
            return kotlin.jvm.internal.f.b(this.f18336b, c0326b.f18336b) && kotlin.jvm.internal.f.b(this.f18337c, c0326b.f18337c) && kotlin.jvm.internal.f.b(this.f18338d, c0326b.f18338d) && kotlin.jvm.internal.f.b(this.f18339e, c0326b.f18339e) && kotlin.jvm.internal.f.b(this.f18340f, c0326b.f18340f) && kotlin.jvm.internal.f.b(this.f18341g, c0326b.f18341g) && kotlin.jvm.internal.f.b(this.f18342h, c0326b.f18342h);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18336b;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18337c;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18338d;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            a.i iVar = this.f18339e;
            int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            CharSequence charSequence4 = this.f18340f;
            int hashCode5 = (hashCode4 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            a.i iVar2 = this.f18341g;
            return this.f18342h.hashCode() + ((hashCode5 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31);
        }

        public final a.i j() {
            return this.f18341g;
        }

        public final CharSequence k() {
            return this.f18340f;
        }

        public final a.i l() {
            return this.f18339e;
        }

        public final CharSequence m() {
            return this.f18338d;
        }

        public final CharSequence n() {
            return this.f18337c;
        }

        public final CharSequence o() {
            return this.f18336b;
        }

        public String toString() {
            return "LegalInfo(title=" + ((Object) this.f18336b) + ", subtitle=" + ((Object) this.f18337c) + ", infoButtonText=" + ((Object) this.f18338d) + ", infoButtonAction=" + this.f18339e + ", buttonText=" + ((Object) this.f18340f) + ", buttonAction=" + this.f18341g + ", analyticsWrapper=" + this.f18342h + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18343b = new c();

        public c() {
            super(null, 0 == true ? 1 : 0);
        }
    }

    public static final class d extends b {

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18344b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18345c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18346d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f18347e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f18348f;

        /* renamed from: g, reason: collision with root package name */
        public final a.i f18349g;

        /* renamed from: h, reason: collision with root package name */
        public final a.i f18350h;
        public final a.i i;

        /* renamed from: j, reason: collision with root package name */
        public final a.C0301a f18351j;

        public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, a.i iVar, a.i iVar2, a.i iVar3, a.C0301a c0301a) {
            super(c0301a, null);
            this.f18344b = charSequence;
            this.f18345c = charSequence2;
            this.f18346d = charSequence3;
            this.f18347e = charSequence4;
            this.f18348f = charSequence5;
            this.f18349g = iVar;
            this.f18350h = iVar2;
            this.i = iVar3;
            this.f18351j = c0301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f18344b, dVar.f18344b) && kotlin.jvm.internal.f.b(this.f18345c, dVar.f18345c) && kotlin.jvm.internal.f.b(this.f18346d, dVar.f18346d) && kotlin.jvm.internal.f.b(this.f18347e, dVar.f18347e) && kotlin.jvm.internal.f.b(this.f18348f, dVar.f18348f) && kotlin.jvm.internal.f.b(this.f18349g, dVar.f18349g) && kotlin.jvm.internal.f.b(this.f18350h, dVar.f18350h) && kotlin.jvm.internal.f.b(this.i, dVar.i) && kotlin.jvm.internal.f.b(this.f18351j, dVar.f18351j);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18344b;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18345c;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18346d;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f18347e;
            int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.f18348f;
            int hashCode5 = (hashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            a.i iVar = this.f18349g;
            int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            a.i iVar2 = this.f18350h;
            int hashCode7 = (hashCode6 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
            a.i iVar3 = this.i;
            return this.f18351j.hashCode() + ((hashCode7 + (iVar3 != null ? iVar3.hashCode() : 0)) * 31);
        }

        public final a.i l() {
            return this.f18350h;
        }

        public final CharSequence m() {
            return this.f18348f;
        }

        public final a.i n() {
            return this.i;
        }

        public final CharSequence o() {
            return this.f18346d;
        }

        public final a.i p() {
            return this.f18349g;
        }

        public final CharSequence q() {
            return this.f18347e;
        }

        public final CharSequence r() {
            return this.f18345c;
        }

        public final CharSequence s() {
            return this.f18344b;
        }

        public String toString() {
            return "PinTypeSelection(title=" + ((Object) this.f18344b) + ", subtitle=" + ((Object) this.f18345c) + ", pinTypeText=" + ((Object) this.f18346d) + ", sixDigitPin=" + ((Object) this.f18347e) + ", fiveDigitPin=" + ((Object) this.f18348f) + ", sixDigitAction=" + this.f18349g + ", fiveDigitAction=" + this.f18350h + ", pinTypeAction=" + this.i + ", analyticsWrapper=" + this.f18351j + ')';
        }
    }

    public static final class e extends b {

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18352b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18353c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18354d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f18355e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f18356f;

        /* renamed from: g, reason: collision with root package name */
        public final a.i f18357g;

        /* renamed from: h, reason: collision with root package name */
        public final a.C0301a f18358h;

        public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num, CharSequence charSequence4, a.i iVar, a.C0301a c0301a) {
            super(c0301a, null);
            this.f18352b = charSequence;
            this.f18353c = charSequence2;
            this.f18354d = charSequence3;
            this.f18355e = num;
            this.f18356f = charSequence4;
            this.f18357g = iVar;
            this.f18358h = c0301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f18352b, eVar.f18352b) && kotlin.jvm.internal.f.b(this.f18353c, eVar.f18353c) && kotlin.jvm.internal.f.b(this.f18354d, eVar.f18354d) && kotlin.jvm.internal.f.b(this.f18355e, eVar.f18355e) && kotlin.jvm.internal.f.b(this.f18356f, eVar.f18356f) && kotlin.jvm.internal.f.b(this.f18357g, eVar.f18357g) && kotlin.jvm.internal.f.b(this.f18358h, eVar.f18358h);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18352b;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18353c;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18354d;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            Integer num = this.f18355e;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            CharSequence charSequence4 = this.f18356f;
            int hashCode5 = (hashCode4 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            a.i iVar = this.f18357g;
            return this.f18358h.hashCode() + ((hashCode5 + (iVar != null ? iVar.hashCode() : 0)) * 31);
        }

        public final a.i j() {
            return this.f18357g;
        }

        public final CharSequence k() {
            return this.f18356f;
        }

        public final Integer l() {
            return this.f18355e;
        }

        public final CharSequence m() {
            return this.f18354d;
        }

        public final CharSequence n() {
            return this.f18353c;
        }

        public final CharSequence o() {
            return this.f18352b;
        }

        public String toString() {
            return "Scanning(title=" + ((Object) this.f18352b) + ", subtitle=" + ((Object) this.f18353c) + ", status=" + ((Object) this.f18354d) + ", progress=" + this.f18355e + ", buttonText=" + ((Object) this.f18356f) + ", buttonAction=" + this.f18357g + ", analyticsWrapper=" + this.f18358h + ')';
        }
    }

    public static final class f extends b {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18359b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18360c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18361d;

        /* renamed from: e, reason: collision with root package name */
        public final String f18362e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f18363f;

        /* renamed from: g, reason: collision with root package name */
        public final a.i f18364g;

        /* renamed from: h, reason: collision with root package name */
        public final a.C0301a f18365h;

        public f(boolean z10, CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, a.i iVar, a.C0301a c0301a) {
            super(c0301a, null);
            this.f18359b = z10;
            this.f18360c = charSequence;
            this.f18361d = charSequence2;
            this.f18362e = str;
            this.f18363f = charSequence3;
            this.f18364g = iVar;
            this.f18365h = c0301a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f18359b == fVar.f18359b && kotlin.jvm.internal.f.b(this.f18360c, fVar.f18360c) && kotlin.jvm.internal.f.b(this.f18361d, fVar.f18361d) && kotlin.jvm.internal.f.b(this.f18362e, fVar.f18362e) && kotlin.jvm.internal.f.b(this.f18363f, fVar.f18363f) && kotlin.jvm.internal.f.b(this.f18364g, fVar.f18364g) && kotlin.jvm.internal.f.b(this.f18365h, fVar.f18365h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        public int hashCode() {
            boolean z10 = this.f18359b;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            CharSequence charSequence = this.f18360c;
            int hashCode = (i + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f18361d;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            String str = this.f18362e;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            CharSequence charSequence3 = this.f18363f;
            int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            a.i iVar = this.f18364g;
            return this.f18365h.hashCode() + ((hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31);
        }

        public final a.i j() {
            return this.f18364g;
        }

        public final CharSequence k() {
            return this.f18363f;
        }

        public final String l() {
            return this.f18362e;
        }

        public final boolean m() {
            return this.f18359b;
        }

        public final CharSequence n() {
            return this.f18361d;
        }

        public final CharSequence o() {
            return this.f18360c;
        }

        public String toString() {
            return "Status(success=" + this.f18359b + ", title=" + ((Object) this.f18360c) + ", text=" + ((Object) this.f18361d) + ", icon=" + this.f18362e + ", buttonText=" + ((Object) this.f18363f) + ", buttonAction=" + this.f18364g + ", analyticsWrapper=" + this.f18365h + ')';
        }
    }

    public /* synthetic */ b(a.C0301a c0301a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0301a);
    }

    public final a.C0301a a() {
        return this.f18328a;
    }

    public b(a.C0301a c0301a) {
        this.f18328a = c0301a;
    }
}
