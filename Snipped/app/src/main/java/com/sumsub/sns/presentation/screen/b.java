package com.sumsub.sns.presentation.screen;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class b implements a.j {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19688a;

        /* renamed from: b, reason: collision with root package name */
        public final Parcelable f19689b;

        public a(boolean z10, Parcelable parcelable) {
            this.f19688a = z10;
            this.f19689b = parcelable;
        }

        public final Parcelable c() {
            return this.f19689b;
        }

        public final boolean d() {
            return this.f19688a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19688a == aVar.f19688a && kotlin.jvm.internal.f.b(this.f19689b, aVar.f19689b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public int hashCode() {
            boolean z10 = this.f19688a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return this.f19689b.hashCode() + (r02 * 31);
        }

        public String toString() {
            return "AfterInstructionsEvent(success=" + this.f19688a + ", payload=" + this.f19689b + ')';
        }
    }

    /* renamed from: com.sumsub.sns.presentation.screen.b$b, reason: collision with other inner class name */
    public static final class C0367b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final SNSCompletionResult f19690a;

        public C0367b(SNSCompletionResult sNSCompletionResult) {
            this.f19690a = sNSCompletionResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0367b) && kotlin.jvm.internal.f.b(this.f19690a, ((C0367b) obj).f19690a);
        }

        public int hashCode() {
            return this.f19690a.hashCode();
        }

        public String toString() {
            return "Cancel(result=" + this.f19690a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final o f19691a;

        public c(o oVar) {
            this.f19691a = oVar;
        }

        public final o b() {
            return this.f19691a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f19691a, ((c) obj).f19691a);
        }

        public int hashCode() {
            return this.f19691a.hashCode();
        }

        public String toString() {
            return "HandleError(error=" + this.f19691a + ')';
        }
    }

    public static abstract class d extends b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public com.sumsub.sns.internal.core.domain.model.c f19692a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19693b;

        public static final class a extends d {

            /* renamed from: c, reason: collision with root package name */
            public static final a f19694c = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0368a();

            /* renamed from: com.sumsub.sns.presentation.screen.b$d$a$a, reason: collision with other inner class name */
            public static final class C0368a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return a.f19694c;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
                super(null, false, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* renamed from: com.sumsub.sns.presentation.screen.b$d$b, reason: collision with other inner class name */
        public static final class C0369b extends d {
            public static final Parcelable.Creator<C0369b> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19695c;

            /* renamed from: com.sumsub.sns.presentation.screen.b$d$b$a */
            public static final class a implements Parcelable.Creator<C0369b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0369b createFromParcel(Parcel parcel) {
                    return new C0369b(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0369b[] newArray(int i) {
                    return new C0369b[i];
                }
            }

            public C0369b(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.DATA.getSceneName(), null, false, 12, null), false, 2, null);
                this.f19695c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19695c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0369b) && kotlin.jvm.internal.f.b(this.f19695c, ((C0369b) obj).f19695c);
            }

            public int hashCode() {
                return this.f19695c.hashCode();
            }

            public String toString() {
                return "ApplicantData(doc=" + this.f19695c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19695c.writeToParcel(parcel, i);
            }
        }

        public static final class c extends d {

            /* renamed from: c, reason: collision with root package name */
            public static final c f19696c = new c();
            public static final Parcelable.Creator<c> CREATOR = new a();

            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return c.f19696c;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i) {
                    return new c[i];
                }
            }

            public c() {
                super(null, false, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* renamed from: com.sumsub.sns.presentation.screen.b$d$d, reason: collision with other inner class name */
        public static final class C0370d extends d {
            public static final Parcelable.Creator<C0370d> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19697c;

            /* renamed from: com.sumsub.sns.presentation.screen.b$d$d$a */
            public static final class a implements Parcelable.Creator<C0370d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0370d createFromParcel(Parcel parcel) {
                    return new C0370d(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0370d[] newArray(int i) {
                    return new C0370d[i];
                }
            }

            public C0370d(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.CONFIRMATION.getSceneName(), null, false, 12, null), true, null);
                this.f19697c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0370d) && kotlin.jvm.internal.f.b(this.f19697c, ((C0370d) obj).f19697c);
            }

            public int hashCode() {
                return this.f19697c.hashCode();
            }

            public String toString() {
                return "ConfirmEmail(doc=" + this.f19697c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19697c.writeToParcel(parcel, i);
            }
        }

        public static final class e extends d {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19698c;

            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    return new e(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i) {
                    return new e[i];
                }
            }

            public e(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.CONFIRMATION.getSceneName(), null, false, 12, null), true, null);
                this.f19698c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f19698c, ((e) obj).f19698c);
            }

            public int hashCode() {
                return this.f19698c.hashCode();
            }

            public String toString() {
                return "ConfirmPhone(doc=" + this.f19698c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19698c.writeToParcel(parcel, i);
            }
        }

        public static final class f extends d {
            public static final Parcelable.Creator<f> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19699c;

            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    return new f(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i) {
                    return new f[i];
                }
            }

            public f(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.EKYC.getSceneName(), null, false, 12, null), false, 2, null);
                this.f19699c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19699c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && kotlin.jvm.internal.f.b(this.f19699c, ((f) obj).f19699c);
            }

            public int hashCode() {
                return this.f19699c.hashCode();
            }

            public String toString() {
                return "Ekyc(doc=" + this.f19699c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19699c.writeToParcel(parcel, i);
            }
        }

        public static final class g extends d {
            public static final Parcelable.Creator<g> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19700c;

            public static final class a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    return new g(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i) {
                    return new g[i];
                }
            }

            public g(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.GEO.getSceneName(), null, false, 12, null), false, 2, null);
                this.f19700c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19700c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && kotlin.jvm.internal.f.b(this.f19700c, ((g) obj).f19700c);
            }

            public int hashCode() {
                return this.f19700c.hashCode();
            }

            public String toString() {
                return "Geolocation(doc=" + this.f19700c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19700c.writeToParcel(parcel, i);
            }
        }

        public static final class h extends d {
            public static final Parcelable.Creator<h> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19701c;

            public static final class a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    return new h(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i) {
                    return new h[i];
                }
            }

            public h(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.FACESCAN.getSceneName(), null, false, 12, null), true, null);
                this.f19701c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19701c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && kotlin.jvm.internal.f.b(this.f19701c, ((h) obj).f19701c);
            }

            public int hashCode() {
                return this.f19701c.hashCode();
            }

            public String toString() {
                return "Liveness(doc=" + this.f19701c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19701c.writeToParcel(parcel, i);
            }
        }

        public static final class i extends d {
            public static final Parcelable.Creator<i> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19702c;

            public static final class a implements Parcelable.Creator<i> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    return new i(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i[] newArray(int i) {
                    return new i[i];
                }
            }

            public i(Document document) {
                super(null, false, 3, 0 == true ? 1 : 0);
                this.f19702c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19702c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && kotlin.jvm.internal.f.b(this.f19702c, ((i) obj).f19702c);
            }

            public int hashCode() {
                return this.f19702c.hashCode();
            }

            public String toString() {
                return "PreviewIdentity(doc=" + this.f19702c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19702c.writeToParcel(parcel, i);
            }
        }

        public static final class j extends d {
            public static final Parcelable.Creator<j> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19703c;

            public static final class a implements Parcelable.Creator<j> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j createFromParcel(Parcel parcel) {
                    return new j(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j[] newArray(int i) {
                    return new j[i];
                }
            }

            public j(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.PORTRAIT_SELFIE.getSceneName(), null, false, 12, null), true, null);
                this.f19703c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19703c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && kotlin.jvm.internal.f.b(this.f19703c, ((j) obj).f19703c);
            }

            public int hashCode() {
                return this.f19703c.hashCode();
            }

            public String toString() {
                return "PreviewPhotoSelfie(doc=" + this.f19703c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19703c.writeToParcel(parcel, i);
            }
        }

        public static final class k extends d {
            public static final Parcelable.Creator<k> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19704c;

            public static final class a implements Parcelable.Creator<k> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    return new k(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k[] newArray(int i) {
                    return new k[i];
                }
            }

            public k(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.PHOTOSELFIE.getSceneName(), null, false, 12, null), true, null);
                this.f19704c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19704c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && kotlin.jvm.internal.f.b(this.f19704c, ((k) obj).f19704c);
            }

            public int hashCode() {
                return this.f19704c.hashCode();
            }

            public String toString() {
                return "PreviewSelfieWithDocument(doc=" + this.f19704c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19704c.writeToParcel(parcel, i);
            }
        }

        public static final class l extends d {
            public static final Parcelable.Creator<l> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19705c;

            public static final class a implements Parcelable.Creator<l> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    return new l(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i) {
                    return new l[i];
                }
            }

            public l(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.VIDEOSELFIE.getSceneName(), null, false, 12, null), true, null);
                this.f19705c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19705c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && kotlin.jvm.internal.f.b(this.f19705c, ((l) obj).f19705c);
            }

            public int hashCode() {
                return this.f19705c.hashCode();
            }

            public String toString() {
                return "PreviewVideoSelfie(doc=" + this.f19705c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19705c.writeToParcel(parcel, i);
            }
        }

        public static final class m extends d {
            public static final Parcelable.Creator<m> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19706c;

            public static final class a implements Parcelable.Creator<m> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    return new m(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m[] newArray(int i) {
                    return new m[i];
                }
            }

            public m(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.SCAN_FRONTSIDE.getSceneName(), null, false, 12, null), false, 2, null);
                this.f19706c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19706c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && kotlin.jvm.internal.f.b(this.f19706c, ((m) obj).f19706c);
            }

            public int hashCode() {
                return this.f19706c.hashCode();
            }

            public String toString() {
                return "ProofOfAddress(doc=" + this.f19706c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19706c.writeToParcel(parcel, i);
            }
        }

        public static final class n extends d {
            public static final Parcelable.Creator<n> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final Document f19707c;

            public static final class a implements Parcelable.Creator<n> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n createFromParcel(Parcel parcel) {
                    return new n(Document.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n[] newArray(int i) {
                    return new n[i];
                }
            }

            public n(Document document) {
                super(new com.sumsub.sns.internal.core.domain.model.c(document.getType().c(), IntroScene.QUESTIONNAIRE.getSceneName(), null, false, 12, null), true, null);
                this.f19707c = document;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Document e() {
                return this.f19707c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && kotlin.jvm.internal.f.b(this.f19707c, ((n) obj).f19707c);
            }

            public int hashCode() {
                return this.f19707c.hashCode();
            }

            public String toString() {
                return "Questionnaire(doc=" + this.f19707c + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.f19707c.writeToParcel(parcel, i);
            }
        }

        public static final class o extends d {
            public static final Parcelable.Creator<o> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public final List<Document> f19708c;

            public static final class a implements Parcelable.Creator<o> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final o createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(Document.CREATOR.createFromParcel(parcel));
                    }
                    return new o(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final o[] newArray(int i) {
                    return new o[i];
                }
            }

            public o(List<Document> list) {
                super(new com.sumsub.sns.internal.core.domain.model.c(DocumentType.f15254k, IntroScene.VIDEO_IDENT.getSceneName(), null, false, 12, null), false, 2, null);
                this.f19708c = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final List<Document> e() {
                return this.f19708c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && kotlin.jvm.internal.f.b(this.f19708c, ((o) obj).f19708c);
            }

            public int hashCode() {
                return this.f19708c.hashCode();
            }

            public String toString() {
                return v.r(new StringBuilder("VideoIdent(docs="), this.f19708c, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                List<Document> list = this.f19708c;
                parcel.writeInt(list.size());
                Iterator<Document> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
        }

        public /* synthetic */ d(com.sumsub.sns.internal.core.domain.model.c cVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, z10);
        }

        public void a(com.sumsub.sns.internal.core.domain.model.c cVar) {
            this.f19692a = cVar;
        }

        public com.sumsub.sns.internal.core.domain.model.c b() {
            return this.f19692a;
        }

        public final boolean c() {
            return this instanceof h;
        }

        public /* synthetic */ d(com.sumsub.sns.internal.core.domain.model.c cVar, boolean z10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : cVar, (i9 & 2) != 0 ? false : z10, null);
        }

        public boolean a() {
            return this.f19693b;
        }

        public d(com.sumsub.sns.internal.core.domain.model.c cVar, boolean z10) {
            this.f19692a = cVar;
            this.f19693b = z10;
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.presentation.intro.f f19709a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19710b;

        /* renamed from: c, reason: collision with root package name */
        public final String f19711c;

        public e(com.sumsub.sns.internal.core.presentation.intro.f fVar, boolean z10, String str) {
            this.f19709a = fVar;
            this.f19710b = z10;
            this.f19711c = str;
        }

        public final boolean d() {
            return this.f19710b;
        }

        public final String e() {
            return this.f19711c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f19709a, eVar.f19709a) && this.f19710b == eVar.f19710b && kotlin.jvm.internal.f.b(this.f19711c, eVar.f19711c);
        }

        public final com.sumsub.sns.internal.core.presentation.intro.f f() {
            return this.f19709a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f19709a.hashCode() * 31;
            boolean z10 = this.f19710b;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode + i) * 31;
            String str = this.f19711c;
            return i9 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowInstructions(stepInfo=");
            sb2.append(this.f19709a);
            sb2.append(", cancelOnBackPressed=");
            sb2.append(this.f19710b);
            sb2.append(", countryCode=");
            return v.q(sb2, this.f19711c, ')');
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f19712a = new f();
    }
}
