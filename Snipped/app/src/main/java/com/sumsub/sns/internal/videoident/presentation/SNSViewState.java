package com.sumsub.sns.internal.videoident.presentation;

import C.v;
import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.source.applicant.remote.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState;", "Lcom/sumsub/sns/core/presentation/base/a$l;", "", "getHasVideo", "()Z", "hasVideo", "isError", "isVideoCall", "isPreview", "isWaiting", "isReconnecting", "isLoading", "<init>", "()V", "a", "ErrorState", "b", "c", "d", "e", "VideoStepState", "Lcom/sumsub/sns/internal/videoident/presentation/a$c;", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$b;", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$c;", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$d;", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$e;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SNSViewState implements a.l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$ErrorState;", "", "(Ljava/lang/String;I)V", "GENERAL", "UPLOAD_ERROR", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ErrorState {
        GENERAL,
        UPLOAD_ERROR
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$VideoStepState;", "", "(Ljava/lang/String;I)V", "PREVIEW", "WAITING", "VIDEO_CALL", "RECONNECTING", "ERROR", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum VideoStepState {
        PREVIEW,
        WAITING,
        VIDEO_CALL,
        RECONNECTING,
        ERROR
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f19159a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f19160b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f19161c;

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f19159a = charSequence;
            this.f19160b = charSequence2;
            this.f19161c = charSequence3;
        }

        public final CharSequence d() {
            return this.f19161c;
        }

        public final CharSequence e() {
            return this.f19160b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f19159a, aVar.f19159a) && kotlin.jvm.internal.f.b(this.f19160b, aVar.f19160b) && kotlin.jvm.internal.f.b(this.f19161c, aVar.f19161c);
        }

        public final CharSequence f() {
            return this.f19159a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f19159a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f19160b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f19161c;
            return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmExitDialog(message=");
            sb2.append((Object) this.f19159a);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.f19160b);
            sb2.append(", buttonNegative=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f19161c, ')');
        }
    }

    public static final class b extends SNSViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f19162a;

        /* renamed from: b, reason: collision with root package name */
        public final List<n> f19163b;

        public b(String str, List<n> list) {
            super(null);
            this.f19162a = str;
            this.f19163b = list;
        }

        public final List<n> c() {
            return this.f19163b;
        }

        public final String d() {
            return this.f19162a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f19162a, bVar.f19162a) && kotlin.jvm.internal.f.b(this.f19163b, bVar.f19163b);
        }

        public int hashCode() {
            String str = this.f19162a;
            return this.f19163b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LanguageSelection(selectedLanguage=");
            sb2.append(this.f19162a);
            sb2.append(", languages=");
            return v.r(sb2, this.f19163b, ')');
        }
    }

    public static final class c extends SNSViewState {

        /* renamed from: a, reason: collision with root package name */
        public static final c f19164a = new c();

        public c() {
            super(null);
        }
    }

    public static final class d extends SNSViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19165a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19166b;

        /* renamed from: c, reason: collision with root package name */
        public final f f19167c;

        public d() {
            this(false, false, null, 7, null);
        }

        public final f d() {
            return this.f19167c;
        }

        public final boolean e() {
            return this.f19165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19165a == dVar.f19165a && this.f19166b == dVar.f19166b && kotlin.jvm.internal.f.b(this.f19167c, dVar.f19167c);
        }

        public final boolean f() {
            return this.f19166b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z10 = this.f19165a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            boolean z11 = this.f19166b;
            int i9 = (i + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            f fVar = this.f19167c;
            return i9 + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Permissions(showCameraExplanation=" + this.f19165a + ", showMicrophoneExplanation=" + this.f19166b + ", explanationDialog=" + this.f19167c + ')';
        }

        public /* synthetic */ d(boolean z10, boolean z11, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z10, (i & 2) != 0 ? false : z11, (i & 4) != 0 ? null : fVar);
        }

        public d(boolean z10, boolean z11, f fVar) {
            super(null);
            this.f19165a = z10;
            this.f19166b = z11;
            this.f19167c = fVar;
        }
    }

    public static final class e extends SNSViewState {

        /* renamed from: y, reason: collision with root package name */
        public static final a f19168y = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final VideoStepState f19169a;

        /* renamed from: b, reason: collision with root package name */
        public final ErrorState f19170b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19171c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f19172d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f19173e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f19174f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f19175g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f19176h;
        public CharSequence i;

        /* renamed from: j, reason: collision with root package name */
        public final CharSequence f19177j;

        /* renamed from: k, reason: collision with root package name */
        public final ButtonAction f19178k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f19179l;

        /* renamed from: m, reason: collision with root package name */
        public CharSequence f19180m;

        /* renamed from: n, reason: collision with root package name */
        public final k f19181n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f19182o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f19183p;

        /* renamed from: q, reason: collision with root package name */
        public com.sumsub.sns.internal.videoident.presentation.e f19184q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f19185r;

        /* renamed from: s, reason: collision with root package name */
        public List<SNSStepViewItem> f19186s;

        /* renamed from: t, reason: collision with root package name */
        public Bitmap f19187t;

        /* renamed from: u, reason: collision with root package name */
        public final e f19188u;

        /* renamed from: v, reason: collision with root package name */
        public AnalyticsCallState f19189v;

        /* renamed from: w, reason: collision with root package name */
        public a f19190w;

        /* renamed from: x, reason: collision with root package name */
        public a.C0358a f19191x;

        public static final class a {

            /* renamed from: com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a$a, reason: collision with other inner class name */
            public static final class C0358a {

                /* renamed from: a, reason: collision with root package name */
                public final String f19192a;

                /* renamed from: b, reason: collision with root package name */
                public final String f19193b;

                /* renamed from: c, reason: collision with root package name */
                public final String f19194c;

                public C0358a(String str, String str2, String str3) {
                    this.f19192a = str;
                    this.f19193b = str2;
                    this.f19194c = str3;
                }

                public final String d() {
                    return this.f19194c;
                }

                public final String e() {
                    return this.f19193b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0358a)) {
                        return false;
                    }
                    C0358a c0358a = (C0358a) obj;
                    return kotlin.jvm.internal.f.b(this.f19192a, c0358a.f19192a) && kotlin.jvm.internal.f.b(this.f19193b, c0358a.f19193b) && kotlin.jvm.internal.f.b(this.f19194c, c0358a.f19194c);
                }

                public final String f() {
                    return this.f19192a;
                }

                public int hashCode() {
                    String str = this.f19192a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f19193b;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f19194c;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("LanguageState(title=");
                    sb2.append(this.f19192a);
                    sb2.append(", language=");
                    sb2.append(this.f19193b);
                    sb2.append(", change=");
                    return v.q(sb2, this.f19194c, ')');
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ e a(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C0358a c0358a, boolean z10, int i, Object obj) {
                if ((i & 8) != 0) {
                    c0358a = null;
                }
                return aVar.a(charSequence, charSequence2, charSequence3, c0358a, z10);
            }

            public a() {
            }

            public final e a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C0358a c0358a, boolean z10) {
                return new e(VideoStepState.PREVIEW, null, false, true, true, z10, true, charSequence2, charSequence3, charSequence, ButtonAction.START_CALL, null, null, null, true, false, null, null, null, null, null, AnalyticsCallState.PREPARING, null, c0358a, 1839106, null);
            }

            public final e a(CharSequence charSequence, CharSequence charSequence2, List<SNSStepViewItem> list, a aVar) {
                return new e(VideoStepState.WAITING, null, false, true, false, false, true, null, charSequence2, null, null, null, null, null, true, false, null, charSequence, list, null, null, AnalyticsCallState.WAITING_FOR_OPERATOR, aVar, null, 9965570, null);
            }

            public final e a(CharSequence charSequence, com.sumsub.sns.internal.videoident.presentation.e eVar, List<SNSStepViewItem> list, a aVar) {
                return new e(VideoStepState.VIDEO_CALL, null, false, true, false, false, true, null, charSequence, null, null, null, null, null, true, true, eVar, null, list, null, null, AnalyticsCallState.IN_PROGRESS, aVar, null, 9965570, null);
            }

            public final e a(CharSequence charSequence, CharSequence charSequence2, a aVar) {
                return new e(VideoStepState.VIDEO_CALL, null, false, true, false, false, true, charSequence, charSequence2, null, null, null, null, null, true, true, null, null, EmptyList.f23104a, null, null, AnalyticsCallState.IN_PROGRESS, aVar, null, 9965570, null);
            }

            public static /* synthetic */ e a(a aVar, ErrorState errorState, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, a aVar2, int i, Object obj) {
                if ((i & 1) != 0) {
                    errorState = ErrorState.GENERAL;
                }
                return aVar.a(errorState, charSequence, charSequence2, charSequence3, buttonAction, aVar2);
            }

            public final e a(ErrorState errorState, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, a aVar) {
                return new e(VideoStepState.ERROR, errorState, false, true, true, true, true, null, null, charSequence3, buttonAction, null, null, new k(charSequence, charSequence2), true, false, null, null, EmptyList.f23104a, null, null, null, aVar, null, 12062720, null);
            }

            public final e a(CharSequence charSequence, ButtonAction buttonAction, CharSequence charSequence2, Bitmap bitmap, a aVar) {
                return new e(VideoStepState.VIDEO_CALL, null, false, true, true, true, true, null, null, charSequence, buttonAction, charSequence2, null, null, true, true, null, null, EmptyList.f23104a, bitmap, null, AnalyticsCallState.IN_PROGRESS, aVar, null, 8392706, null);
            }
        }

        public e(VideoStepState videoStepState, ErrorState errorState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, CharSequence charSequence4, CharSequence charSequence5, k kVar, boolean z15, boolean z16, com.sumsub.sns.internal.videoident.presentation.e eVar, CharSequence charSequence6, List<SNSStepViewItem> list, Bitmap bitmap, e eVar2, AnalyticsCallState analyticsCallState, a aVar, a.C0358a c0358a) {
            super(null);
            this.f19169a = videoStepState;
            this.f19170b = errorState;
            this.f19171c = z10;
            this.f19172d = z11;
            this.f19173e = z12;
            this.f19174f = z13;
            this.f19175g = z14;
            this.f19176h = charSequence;
            this.i = charSequence2;
            this.f19177j = charSequence3;
            this.f19178k = buttonAction;
            this.f19179l = charSequence4;
            this.f19180m = charSequence5;
            this.f19181n = kVar;
            this.f19182o = z15;
            this.f19183p = z16;
            this.f19184q = eVar;
            this.f19185r = charSequence6;
            this.f19186s = list;
            this.f19187t = bitmap;
            this.f19188u = eVar2;
            this.f19189v = analyticsCallState;
            this.f19190w = aVar;
            this.f19191x = c0358a;
        }

        public final boolean A() {
            return this.f19174f;
        }

        public final CharSequence B() {
            return this.f19177j;
        }

        public final CharSequence C() {
            return this.f19179l;
        }

        public final CharSequence D() {
            return this.i;
        }

        public final CharSequence E() {
            return this.f19176h;
        }

        public final CharSequence F() {
            return this.f19180m;
        }

        public final k G() {
            return this.f19181n;
        }

        public final a H() {
            return this.f19190w;
        }

        public final List<SNSStepViewItem> I() {
            return this.f19186s;
        }

        public final ErrorState J() {
            return this.f19170b;
        }

        public final a.C0358a K() {
            return this.f19191x;
        }

        public final CharSequence L() {
            return this.f19185r;
        }

        public final Bitmap M() {
            return this.f19187t;
        }

        public final e N() {
            return this.f19188u;
        }

        public final com.sumsub.sns.internal.videoident.presentation.e O() {
            return this.f19184q;
        }

        public final boolean P() {
            return this.f19173e;
        }

        public final boolean Q() {
            return this.f19182o;
        }

        public final boolean R() {
            return this.f19172d;
        }

        public final boolean S() {
            return this.f19171c;
        }

        public final boolean T() {
            return this.f19183p;
        }

        public final boolean U() {
            return this.f19175g;
        }

        public final VideoStepState V() {
            return this.f19169a;
        }

        public final e a(VideoStepState videoStepState, ErrorState errorState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, CharSequence charSequence4, CharSequence charSequence5, k kVar, boolean z15, boolean z16, com.sumsub.sns.internal.videoident.presentation.e eVar, CharSequence charSequence6, List<SNSStepViewItem> list, Bitmap bitmap, e eVar2, AnalyticsCallState analyticsCallState, a aVar, a.C0358a c0358a) {
            return new e(videoStepState, errorState, z10, z11, z12, z13, z14, charSequence, charSequence2, charSequence3, buttonAction, charSequence4, charSequence5, kVar, z15, z16, eVar, charSequence6, list, bitmap, eVar2, analyticsCallState, aVar, c0358a);
        }

        public final void b(CharSequence charSequence) {
            this.i = charSequence;
        }

        public final void c(CharSequence charSequence) {
            this.f19176h = charSequence;
        }

        public final void d(CharSequence charSequence) {
            this.f19180m = charSequence;
        }

        public final void e(CharSequence charSequence) {
            this.f19185r = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f19169a == eVar.f19169a && this.f19170b == eVar.f19170b && this.f19171c == eVar.f19171c && this.f19172d == eVar.f19172d && this.f19173e == eVar.f19173e && this.f19174f == eVar.f19174f && this.f19175g == eVar.f19175g && kotlin.jvm.internal.f.b(this.f19176h, eVar.f19176h) && kotlin.jvm.internal.f.b(this.i, eVar.i) && kotlin.jvm.internal.f.b(this.f19177j, eVar.f19177j) && this.f19178k == eVar.f19178k && kotlin.jvm.internal.f.b(this.f19179l, eVar.f19179l) && kotlin.jvm.internal.f.b(this.f19180m, eVar.f19180m) && kotlin.jvm.internal.f.b(this.f19181n, eVar.f19181n) && this.f19182o == eVar.f19182o && this.f19183p == eVar.f19183p && kotlin.jvm.internal.f.b(this.f19184q, eVar.f19184q) && kotlin.jvm.internal.f.b(this.f19185r, eVar.f19185r) && kotlin.jvm.internal.f.b(this.f19186s, eVar.f19186s) && kotlin.jvm.internal.f.b(this.f19187t, eVar.f19187t) && kotlin.jvm.internal.f.b(this.f19188u, eVar.f19188u) && this.f19189v == eVar.f19189v && kotlin.jvm.internal.f.b(this.f19190w, eVar.f19190w) && kotlin.jvm.internal.f.b(this.f19191x, eVar.f19191x);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f19169a.hashCode() * 31;
            ErrorState errorState = this.f19170b;
            int hashCode2 = (hashCode + (errorState == null ? 0 : errorState.hashCode())) * 31;
            boolean z10 = this.f19171c;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode2 + i) * 31;
            boolean z11 = this.f19172d;
            int i10 = z11;
            if (z11 != 0) {
                i10 = 1;
            }
            int i11 = (i9 + i10) * 31;
            boolean z12 = this.f19173e;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (i11 + i12) * 31;
            boolean z13 = this.f19174f;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.f19175g;
            int i16 = z14;
            if (z14 != 0) {
                i16 = 1;
            }
            int i17 = (i15 + i16) * 31;
            CharSequence charSequence = this.f19176h;
            int hashCode3 = (i17 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.i;
            int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f19177j;
            int hashCode5 = (hashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            ButtonAction buttonAction = this.f19178k;
            int hashCode6 = (hashCode5 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            CharSequence charSequence4 = this.f19179l;
            int hashCode7 = (hashCode6 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.f19180m;
            int hashCode8 = (hashCode7 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            k kVar = this.f19181n;
            int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            boolean z15 = this.f19182o;
            int i18 = z15;
            if (z15 != 0) {
                i18 = 1;
            }
            int i19 = (hashCode9 + i18) * 31;
            boolean z16 = this.f19183p;
            int i20 = (i19 + (z16 ? 1 : z16 ? 1 : 0)) * 31;
            com.sumsub.sns.internal.videoident.presentation.e eVar = this.f19184q;
            int hashCode10 = (i20 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            CharSequence charSequence6 = this.f19185r;
            int f10 = v.f(this.f19186s, (hashCode10 + (charSequence6 == null ? 0 : charSequence6.hashCode())) * 31, 31);
            Bitmap bitmap = this.f19187t;
            int hashCode11 = (f10 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            e eVar2 = this.f19188u;
            int hashCode12 = (hashCode11 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
            AnalyticsCallState analyticsCallState = this.f19189v;
            int hashCode13 = (hashCode12 + (analyticsCallState == null ? 0 : analyticsCallState.hashCode())) * 31;
            a aVar = this.f19190w;
            int hashCode14 = (hashCode13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a.C0358a c0358a = this.f19191x;
            return hashCode14 + (c0358a != null ? c0358a.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.sumsub.sns.internal.core.common.i.a(this));
            sb2.append(" (");
            sb2.append(this.f19169a);
            sb2.append(", progress=");
            sb2.append(this.f19171c);
            sb2.append(", title=");
            sb2.append((Object) this.f19176h);
            sb2.append(", docs=");
            sb2.append(this.f19186s);
            sb2.append(", preview=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f19187t != null, ')');
        }

        public final AnalyticsCallState y() {
            return this.f19189v;
        }

        public final ButtonAction z() {
            return this.f19178k;
        }

        public final void a(CharSequence charSequence) {
            this.f19179l = charSequence;
        }

        public final void a(List<SNSStepViewItem> list) {
            this.f19186s = list;
        }

        public final void a(Bitmap bitmap) {
            this.f19187t = bitmap;
        }

        public final void a(AnalyticsCallState analyticsCallState) {
            this.f19189v = analyticsCallState;
        }

        public e(VideoStepState videoStepState, ErrorState errorState, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ButtonAction buttonAction, CharSequence charSequence4, CharSequence charSequence5, k kVar, boolean z15, boolean z16, com.sumsub.sns.internal.videoident.presentation.e eVar, CharSequence charSequence6, List list, Bitmap bitmap, e eVar2, AnalyticsCallState analyticsCallState, a aVar, a.C0358a c0358a, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoStepState, (i & 2) != 0 ? null : errorState, (i & 4) != 0 ? false : z10, z11, z12, z13, z14, charSequence, charSequence2, charSequence3, buttonAction, charSequence4, (i & 4096) != 0 ? null : charSequence5, kVar, z15, z16, eVar, charSequence6, (262144 & i) != 0 ? EmptyList.f23104a : list, (524288 & i) != 0 ? null : bitmap, (1048576 & i) != 0 ? null : eVar2, (2097152 & i) != 0 ? null : analyticsCallState, (4194304 & i) != 0 ? null : aVar, (i & 8388608) != 0 ? null : c0358a);
        }
    }

    public /* synthetic */ SNSViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean getHasVideo() {
        return isPreview() || isVideoCall() || isWaiting();
    }

    public final boolean isError() {
        return (this instanceof e) && ((e) this).V() == VideoStepState.ERROR;
    }

    public final boolean isLoading() {
        if (!kotlin.jvm.internal.f.b(this, c.f19164a)) {
            SNSViewState sNSViewState = this instanceof e ? this : null;
            if (sNSViewState == null || !((e) sNSViewState).S()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isPreview() {
        return (this instanceof e) && ((e) this).V() == VideoStepState.PREVIEW;
    }

    public final boolean isReconnecting() {
        return (this instanceof e) && ((e) this).V() == VideoStepState.RECONNECTING;
    }

    public final boolean isVideoCall() {
        return (this instanceof e) && ((e) this).V() == VideoStepState.VIDEO_CALL;
    }

    public final boolean isWaiting() {
        return (this instanceof e) && ((e) this).V() == VideoStepState.WAITING;
    }

    private SNSViewState() {
    }
}
