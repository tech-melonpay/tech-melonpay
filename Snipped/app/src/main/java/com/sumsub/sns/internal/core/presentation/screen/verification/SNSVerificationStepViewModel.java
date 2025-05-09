package com.sumsub.sns.internal.core.presentation.screen.verification;

import C.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.s;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.source.applicant.remote.b0;
import ia.InterfaceC0840h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class SNSVerificationStepViewModel extends com.sumsub.sns.core.presentation.base.a<e> {

    /* renamed from: q, reason: collision with root package name */
    public static final a f16645q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f16646r;
    public final ValidationIdentifierType R;
    public final com.sumsub.sns.internal.core.domain.b S;
    public final com.sumsub.sns.internal.core.domain.l T;
    public final com.sumsub.sns.internal.core.domain.a U;
    public final com.sumsub.sns.internal.core.data.source.dynamic.b V;
    public final G W;
    public Job X;
    public final CoroutineScope Y;

    /* renamed from: Z, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f16647Z;

    /* renamed from: a0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f16648a0;

    /* renamed from: b0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f16649b0;

    /* renamed from: c0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f16650c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f16651d0;

    /* renamed from: e0, reason: collision with root package name */
    public final StateFlow<e> f16652e0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$Step;", "", "(Ljava/lang/String;I)V", "INIT", "VERIFY_CODE", "STATUS", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Step {
        INIT,
        VERIFY_CODE,
        STATUS
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f16653a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f16654b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f16655c;

        /* renamed from: d, reason: collision with root package name */
        public final String f16656d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16657e;

        /* renamed from: f, reason: collision with root package name */
        public final Long f16658f;

        /* renamed from: g, reason: collision with root package name */
        public final long f16659g;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new b((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, Long l10, long j10) {
            this.f16653a = charSequence;
            this.f16654b = charSequence2;
            this.f16655c = num;
            this.f16656d = str;
            this.f16657e = str2;
            this.f16658f = l10;
            this.f16659g = j10;
        }

        public final b a(CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, Long l10, long j10) {
            return new b(charSequence, charSequence2, num, str, str2, l10, j10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f16653a, bVar.f16653a) && kotlin.jvm.internal.f.b(this.f16654b, bVar.f16654b) && kotlin.jvm.internal.f.b(this.f16655c, bVar.f16655c) && kotlin.jvm.internal.f.b(this.f16656d, bVar.f16656d) && kotlin.jvm.internal.f.b(this.f16657e, bVar.f16657e) && kotlin.jvm.internal.f.b(this.f16658f, bVar.f16658f) && this.f16659g == bVar.f16659g;
        }

        public final Long h() {
            return this.f16658f;
        }

        public int hashCode() {
            CharSequence charSequence = this.f16653a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f16654b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            Integer num = this.f16655c;
            int c2 = v.c(v.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f16656d), 31, this.f16657e);
            Long l10 = this.f16658f;
            return Long.hashCode(this.f16659g) + ((c2 + (l10 != null ? l10.hashCode() : 0)) * 31);
        }

        public final String i() {
            return this.f16657e;
        }

        public final String j() {
            return this.f16656d;
        }

        public final long k() {
            return this.f16659g;
        }

        public final CharSequence l() {
            return this.f16654b;
        }

        public final CharSequence m() {
            return this.f16653a;
        }

        public final Integer n() {
            return this.f16655c;
        }

        public String toString() {
            return "CountdownData(title=" + ((Object) this.f16653a) + ", subtitle=" + ((Object) this.f16654b) + ", verificationCodeLength=" + this.f16655c + ", identifier=" + this.f16656d + ", id=" + this.f16657e + ", endTime=" + this.f16658f + ", secondsRemaining=" + this.f16659g + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.f16653a, parcel, i);
            TextUtils.writeToParcel(this.f16654b, parcel, i);
            Integer num = this.f16655c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.f16656d);
            parcel.writeString(this.f16657e);
            Long l10 = this.f16658f;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            parcel.writeLong(this.f16659g);
        }

        public static /* synthetic */ b a(b bVar, CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, Long l10, long j10, int i, Object obj) {
            return bVar.a((i & 1) != 0 ? bVar.f16653a : charSequence, (i & 2) != 0 ? bVar.f16654b : charSequence2, (i & 4) != 0 ? bVar.f16655c : num, (i & 8) != 0 ? bVar.f16656d : str, (i & 16) != 0 ? bVar.f16657e : str2, (i & 32) != 0 ? bVar.f16658f : l10, (i & 64) != 0 ? bVar.f16659g : j10);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ b(java.lang.CharSequence r13, java.lang.CharSequence r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.Long r18, long r19, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
            /*
                r12 = this;
                r0 = r21 & 64
                if (r0 == 0) goto L1f
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1 = 0
                if (r18 == 0) goto L14
                long r3 = r18.longValue()
                long r5 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r5
                goto L15
            L14:
                r3 = r1
            L15:
                long r3 = r0.toSeconds(r3)
                long r0 = ha.h.P(r3, r1)
                r10 = r0
                goto L21
            L1f:
                r10 = r19
            L21:
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r8 = r17
                r9 = r18
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.b.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public static abstract class c implements a.j {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f16660a = new a();

            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f16661a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public static final class d extends AbstractC0535a {

        /* renamed from: a, reason: collision with root package name */
        public final ValidationIdentifierType f16662a;

        /* renamed from: b, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.a f16663b;

        public d(InterfaceC0584d interfaceC0584d, ValidationIdentifierType validationIdentifierType, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
            super(interfaceC0584d, bundle);
            this.f16662a = validationIdentifierType;
            this.f16663b = aVar;
        }

        @Override // androidx.lifecycle.AbstractC0535a
        public <T extends Q> T create(String str, Class<T> cls, G g10) {
            return new SNSVerificationStepViewModel(this.f16662a, new com.sumsub.sns.internal.core.domain.b(this.f16663b.n(), this.f16663b.p()), new com.sumsub.sns.internal.core.domain.l(this.f16663b.g()), new com.sumsub.sns.internal.core.domain.a(this.f16663b.g()), this.f16663b.n(), this.f16663b.p(), g10);
        }
    }

    public static abstract class e implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f16664a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f16665b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f16666c;

        public static final class a extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final a f16667d = new a();

            public a() {
                super(null, null, null, 7, null);
            }
        }

        public static final class b extends e {

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f16668d;

            /* renamed from: e, reason: collision with root package name */
            public final CharSequence f16669e;

            /* renamed from: f, reason: collision with root package name */
            public final String f16670f;

            /* renamed from: g, reason: collision with root package name */
            public final CharSequence f16671g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f16672h;

            public b(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, boolean z10) {
                super(charSequence, charSequence2, null, 4, null);
                this.f16668d = charSequence;
                this.f16669e = charSequence2;
                this.f16670f = str;
                this.f16671g = charSequence3;
                this.f16672h = z10;
            }

            public CharSequence c() {
                return this.f16668d;
            }

            public final String d() {
                return this.f16670f;
            }

            public final CharSequence e() {
                return this.f16671g;
            }

            public final boolean f() {
                return this.f16672h;
            }
        }

        public static final class c extends e {

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f16673d;

            /* renamed from: e, reason: collision with root package name */
            public final CharSequence f16674e;

            /* renamed from: f, reason: collision with root package name */
            public final CharSequence f16675f;

            /* renamed from: g, reason: collision with root package name */
            public final CharSequence f16676g;

            /* renamed from: h, reason: collision with root package name */
            public final Integer f16677h;
            public final CharSequence i;

            /* renamed from: j, reason: collision with root package name */
            public final String f16678j;

            /* renamed from: k, reason: collision with root package name */
            public final String f16679k;

            public c() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            public CharSequence b() {
                return this.f16674e;
            }

            public CharSequence c() {
                return this.f16673d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.f.b(c(), cVar.c()) && kotlin.jvm.internal.f.b(b(), cVar.b()) && kotlin.jvm.internal.f.b(this.f16675f, cVar.f16675f) && kotlin.jvm.internal.f.b(this.f16676g, cVar.f16676g) && kotlin.jvm.internal.f.b(this.f16677h, cVar.f16677h) && kotlin.jvm.internal.f.b(this.i, cVar.i) && kotlin.jvm.internal.f.b(this.f16678j, cVar.f16678j) && kotlin.jvm.internal.f.b(this.f16679k, cVar.f16679k);
            }

            public int hashCode() {
                int hashCode = (((c() == null ? 0 : c().hashCode()) * 31) + (b() == null ? 0 : b().hashCode())) * 31;
                CharSequence charSequence = this.f16675f;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.f16676g;
                int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                Integer num = this.f16677h;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                CharSequence charSequence3 = this.i;
                return this.f16679k.hashCode() + v.c((hashCode4 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.f16678j);
            }

            public final CharSequence l() {
                return this.i;
            }

            public final String m() {
                return this.f16679k;
            }

            public final String n() {
                return this.f16678j;
            }

            public final CharSequence o() {
                return this.f16676g;
            }

            public final CharSequence p() {
                return this.f16675f;
            }

            public final Integer q() {
                return this.f16677h;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyCode(title=");
                sb2.append((Object) c());
                sb2.append(", subtitle=");
                sb2.append((Object) b());
                sb2.append(", timer=");
                sb2.append((Object) this.f16675f);
                sb2.append(", resendButton=");
                sb2.append((Object) this.f16676g);
                sb2.append(", verificationCodeLength=");
                sb2.append(this.f16677h);
                sb2.append(", error=");
                sb2.append((Object) this.i);
                sb2.append(", identifier=");
                sb2.append(this.f16678j);
                sb2.append(", id=");
                return v.q(sb2, this.f16679k, ')');
            }

            public /* synthetic */ c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num, CharSequence charSequence5, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? null : num, (i & 32) == 0 ? charSequence5 : null, (i & 64) != 0 ? "" : str, (i & 128) == 0 ? str2 : "");
            }

            public c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num, CharSequence charSequence5, String str, String str2) {
                super(charSequence, charSequence2, null, 4, null);
                this.f16673d = charSequence;
                this.f16674e = charSequence2;
                this.f16675f = charSequence3;
                this.f16676g = charSequence4;
                this.f16677h = num;
                this.i = charSequence5;
                this.f16678j = str;
                this.f16679k = str2;
            }
        }

        public static final class d extends e {

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f16680d;

            /* renamed from: e, reason: collision with root package name */
            public final CharSequence f16681e;

            /* renamed from: f, reason: collision with root package name */
            public final CharSequence f16682f;

            /* renamed from: g, reason: collision with root package name */
            public final CharSequence f16683g;

            /* renamed from: h, reason: collision with root package name */
            public final CharSequence f16684h;
            public final CharSequence i;

            public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6) {
                super(charSequence, charSequence2, charSequence3, null);
                this.f16680d = charSequence;
                this.f16681e = charSequence2;
                this.f16682f = charSequence3;
                this.f16683g = charSequence4;
                this.f16684h = charSequence5;
                this.i = charSequence6;
            }

            public CharSequence a() {
                return this.f16682f;
            }

            public CharSequence b() {
                return this.f16681e;
            }

            public CharSequence c() {
                return this.f16680d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.f.b(c(), dVar.c()) && kotlin.jvm.internal.f.b(b(), dVar.b()) && kotlin.jvm.internal.f.b(a(), dVar.a()) && kotlin.jvm.internal.f.b(this.f16683g, dVar.f16683g) && kotlin.jvm.internal.f.b(this.f16684h, dVar.f16684h) && kotlin.jvm.internal.f.b(this.i, dVar.i);
            }

            public int hashCode() {
                int hashCode = (((((c() == null ? 0 : c().hashCode()) * 31) + (b() == null ? 0 : b().hashCode())) * 31) + (a() == null ? 0 : a().hashCode())) * 31;
                CharSequence charSequence = this.f16683g;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.f16684h;
                int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.i;
                return hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            public final CharSequence j() {
                return this.f16684h;
            }

            public final CharSequence k() {
                return this.f16683g;
            }

            public final CharSequence l() {
                return this.i;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyEmail(title=");
                sb2.append((Object) c());
                sb2.append(", subtitle=");
                sb2.append((Object) b());
                sb2.append(", initialValue=");
                sb2.append((Object) a());
                sb2.append(", hint=");
                sb2.append((Object) this.f16683g);
                sb2.append(", error=");
                sb2.append((Object) this.f16684h);
                sb2.append(", primaryButton=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.i, ')');
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$e$e, reason: collision with other inner class name */
        public static final class C0249e extends e {

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f16685d;

            /* renamed from: e, reason: collision with root package name */
            public final CharSequence f16686e;

            /* renamed from: f, reason: collision with root package name */
            public final CharSequence f16687f;

            /* renamed from: g, reason: collision with root package name */
            public final com.sumsub.sns.internal.core.domain.c f16688g;

            /* renamed from: h, reason: collision with root package name */
            public final CharSequence f16689h;
            public final CharSequence i;

            public C0249e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, com.sumsub.sns.internal.core.domain.c cVar, CharSequence charSequence4, CharSequence charSequence5) {
                super(charSequence, charSequence2, charSequence3, null);
                this.f16685d = charSequence;
                this.f16686e = charSequence2;
                this.f16687f = charSequence3;
                this.f16688g = cVar;
                this.f16689h = charSequence4;
                this.i = charSequence5;
            }

            public CharSequence a() {
                return this.f16687f;
            }

            public CharSequence b() {
                return this.f16686e;
            }

            public CharSequence c() {
                return this.f16685d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0249e)) {
                    return false;
                }
                C0249e c0249e = (C0249e) obj;
                return kotlin.jvm.internal.f.b(c(), c0249e.c()) && kotlin.jvm.internal.f.b(b(), c0249e.b()) && kotlin.jvm.internal.f.b(a(), c0249e.a()) && kotlin.jvm.internal.f.b(this.f16688g, c0249e.f16688g) && kotlin.jvm.internal.f.b(this.f16689h, c0249e.f16689h) && kotlin.jvm.internal.f.b(this.i, c0249e.i);
            }

            public int hashCode() {
                int hashCode = (this.f16688g.hashCode() + ((((((c() == null ? 0 : c().hashCode()) * 31) + (b() == null ? 0 : b().hashCode())) * 31) + (a() == null ? 0 : a().hashCode())) * 31)) * 31;
                CharSequence charSequence = this.f16689h;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.i;
                return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
            }

            public final com.sumsub.sns.internal.core.domain.c j() {
                return this.f16688g;
            }

            public final CharSequence k() {
                return this.f16689h;
            }

            public final CharSequence l() {
                return this.i;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyPhone(title=");
                sb2.append((Object) c());
                sb2.append(", subtitle=");
                sb2.append((Object) b());
                sb2.append(", initialValue=");
                sb2.append((Object) a());
                sb2.append(", countryResultData=");
                sb2.append(this.f16688g);
                sb2.append(", error=");
                sb2.append((Object) this.f16689h);
                sb2.append(", primaryButton=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.i, ')');
            }
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, charSequence2, charSequence3);
        }

        public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f16664a = charSequence;
            this.f16665b = charSequence2;
            this.f16666c = charSequence3;
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, null);
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16690a;

        static {
            int[] iArr = new int[ValidationIdentifierType.values().length];
            iArr[ValidationIdentifierType.EMAIL.ordinal()] = 1;
            iArr[ValidationIdentifierType.PHONE.ordinal()] = 2;
            iArr[ValidationIdentifierType.UNKNOWN.ordinal()] = 3;
            f16690a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel", f = "SNSVerificationStepViewModel.kt", l = {235, 237, 241, 245}, m = "buildCountDownData")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16691a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16692b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16693c;

        /* renamed from: e, reason: collision with root package name */
        public int f16695e;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16693c = obj;
            this.f16695e |= Integer.MIN_VALUE;
            return SNSVerificationStepViewModel.this.a((b0) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel", f = "SNSVerificationStepViewModel.kt", l = {89, 94, 95, 97, 99, 104, 107, 108, 111, 120, 124}, m = "buildInitState")
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16696a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16697b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16698c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16699d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16700e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f16701f;

        /* renamed from: h, reason: collision with root package name */
        public int f16703h;

        public h(T9.a<? super h> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16701f = obj;
            this.f16703h |= Integer.MIN_VALUE;
            return SNSVerificationStepViewModel.this.a((CharSequence) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel", f = "SNSVerificationStepViewModel.kt", l = {168, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256}, m = "buildStatusState")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16704a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16705b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16706c;

        /* renamed from: e, reason: collision with root package name */
        public int f16708e;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16706c = obj;
            this.f16708e |= Integer.MIN_VALUE;
            return SNSVerificationStepViewModel.this.b((b0) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel", f = "SNSVerificationStepViewModel.kt", l = {142, 151}, m = "buildVerifyCodeState")
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16709a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16710b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16711c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16712d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16713e;

        /* renamed from: f, reason: collision with root package name */
        public long f16714f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f16715g;
        public int i;

        public j(T9.a<? super j> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16715g = obj;
            this.i |= Integer.MIN_VALUE;
            return SNSVerificationStepViewModel.this.a((b) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$checkCode$$inlined$launchOnViewModelScope$1", f = "SNSVerificationStepViewModel.kt", l = {446, 448, 454}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16717a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16718b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f16719c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f16720d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SNSVerificationStepViewModel f16721e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f16722f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f16723g;

        /* renamed from: h, reason: collision with root package name */
        public Object f16724h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f16725j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, SNSVerificationStepViewModel sNSVerificationStepViewModel, String str2, String str3) {
            super(2, aVar2);
            this.f16719c = aVar;
            this.f16720d = str;
            this.f16721e = sNSVerificationStepViewModel;
            this.f16722f = str2;
            this.f16723g = str3;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            k kVar = new k(this.f16719c, this.f16720d, aVar, this.f16721e, this.f16722f, this.f16723g);
            kVar.f16718b = obj;
            return kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: Exception -> 0x0021, CancellationException -> 0x0091, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0091, blocks: (B:23:0x008b, B:24:0x0093, B:26:0x0099, B:38:0x0074, B:40:0x0079, B:47:0x0054), top: B:46:0x0054 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$onPrepare$3$1", f = "SNSVerificationStepViewModel.kt", l = {198}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16726a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f16728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b0 b0Var, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f16728c = b0Var;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSVerificationStepViewModel.this.new l(this.f16728c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16726a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSVerificationStepViewModel sNSVerificationStepViewModel = SNSVerificationStepViewModel.this;
                b0 b0Var = this.f16728c;
                this.f16726a = 1;
                if (sNSVerificationStepViewModel.c(b0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$requestCode$$inlined$launchOnViewModelScope$1", f = "SNSVerificationStepViewModel.kt", l = {450, 460, 462, 468}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16729a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16730b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f16731c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f16732d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SNSVerificationStepViewModel f16733e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f16734f;

        /* renamed from: g, reason: collision with root package name */
        public Object f16735g;

        /* renamed from: h, reason: collision with root package name */
        public Object f16736h;
        public Object i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, SNSVerificationStepViewModel sNSVerificationStepViewModel, String str2) {
            super(2, aVar2);
            this.f16731c = aVar;
            this.f16732d = str;
            this.f16733e = sNSVerificationStepViewModel;
            this.f16734f = str2;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((m) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            m mVar = new m(this.f16731c, this.f16732d, aVar, this.f16733e, this.f16734f);
            mVar.f16730b = obj;
            return mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x010b A[Catch: Exception -> 0x0026, CancellationException -> 0x014b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x014b, blocks: (B:21:0x0105, B:23:0x010b, B:36:0x00de, B:38:0x00e3), top: B:35:0x00de }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[Catch: Exception -> 0x0026, CancellationException -> 0x014b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x014b, blocks: (B:21:0x0105, B:23:0x010b, B:36:0x00de, B:38:0x00e3), top: B:35:0x00de }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 362
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$startCountdownTimer$1", f = "SNSVerificationStepViewModel.kt", l = {273}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16737a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f16739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(b bVar, T9.a<? super n> aVar) {
            super(2, aVar);
            this.f16739c = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((n) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSVerificationStepViewModel.this.new n(this.f16739c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Long h9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16737a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSVerificationStepViewModel.this.a(this.f16739c);
                SNSVerificationStepViewModel.this.a(Step.VERIFY_CODE);
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            while (this.f16739c.h() != null && System.currentTimeMillis() < this.f16739c.h().longValue()) {
                SNSVerificationStepViewModel sNSVerificationStepViewModel = SNSVerificationStepViewModel.this;
                b r8 = sNSVerificationStepViewModel.r();
                if (r8 != null) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    b r10 = SNSVerificationStepViewModel.this.r();
                    bVar = b.a(r8, null, null, null, null, null, null, ha.h.P(timeUnit.toSeconds((r10 == null || (h9 = r10.h()) == null) ? 0L : h9.longValue() - System.currentTimeMillis()), 0L), 63, null);
                } else {
                    bVar = null;
                }
                sNSVerificationStepViewModel.a(bVar);
                this.f16737a = 1;
                if (DelayKt.delay(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            SNSVerificationStepViewModel.this.a(b.a(this.f16739c, null, null, null, null, null, null, 0L, 31, null));
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel", f = "SNSVerificationStepViewModel.kt", l = {320, 321, 323}, m = "verifyCheckCodeResponse")
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16740a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16741b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16742c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f16743d;

        /* renamed from: f, reason: collision with root package name */
        public int f16745f;

        public o(T9.a<? super o> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16743d = obj;
            this.f16745f |= Integer.MIN_VALUE;
            return SNSVerificationStepViewModel.this.c(null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$verifyCheckCodeResponse$2", f = "SNSVerificationStepViewModel.kt", l = {305}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16746a;

        public p(T9.a<? super p> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((p) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSVerificationStepViewModel.this.new p(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16746a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.f16746a = 1;
                if (DelayKt.delay(2000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            SNSVerificationStepViewModel.this.a(c.a.f16660a);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$viewState$1", f = "SNSVerificationStepViewModel.kt", l = {75, 76, 77}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements s<Step, CharSequence, b, b0, T9.a<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16748a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16749b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16750c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f16751d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f16752e;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16754a;

            static {
                int[] iArr = new int[Step.values().length];
                iArr[Step.INIT.ordinal()] = 1;
                iArr[Step.VERIFY_CODE.ordinal()] = 2;
                iArr[Step.STATUS.ordinal()] = 3;
                f16754a = iArr;
            }
        }

        public q(T9.a<? super q> aVar) {
            super(5, aVar);
        }

        @Override // ca.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Step step, CharSequence charSequence, b bVar, b0 b0Var, T9.a<? super e> aVar) {
            q qVar = SNSVerificationStepViewModel.this.new q(aVar);
            qVar.f16749b = step;
            qVar.f16750c = charSequence;
            qVar.f16751d = bVar;
            qVar.f16752e = b0Var;
            return qVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16748a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return (e) obj;
                }
                if (i == 2) {
                    kotlin.b.b(obj);
                    return (e) obj;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return (e) obj;
            }
            kotlin.b.b(obj);
            Step step = (Step) this.f16749b;
            CharSequence charSequence = (CharSequence) this.f16750c;
            b bVar = (b) this.f16751d;
            b0 b0Var = (b0) this.f16752e;
            int i9 = a.f16754a[step.ordinal()];
            if (i9 == 1) {
                SNSVerificationStepViewModel sNSVerificationStepViewModel = SNSVerificationStepViewModel.this;
                this.f16749b = null;
                this.f16750c = null;
                this.f16751d = null;
                this.f16748a = 1;
                obj = sNSVerificationStepViewModel.a(charSequence, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (e) obj;
            }
            if (i9 == 2) {
                SNSVerificationStepViewModel sNSVerificationStepViewModel2 = SNSVerificationStepViewModel.this;
                this.f16749b = null;
                this.f16750c = null;
                this.f16751d = null;
                this.f16748a = 2;
                obj = sNSVerificationStepViewModel2.a(bVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (e) obj;
            }
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            SNSVerificationStepViewModel sNSVerificationStepViewModel3 = SNSVerificationStepViewModel.this;
            this.f16749b = null;
            this.f16750c = null;
            this.f16751d = null;
            this.f16748a = 3;
            obj = sNSVerificationStepViewModel3.b(b0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            return (e) obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$viewState$2", f = "SNSVerificationStepViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super e>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16755a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16756b;

        public r(T9.a<? super r> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super e> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            r rVar = SNSVerificationStepViewModel.this.new r(aVar);
            rVar.f16756b = th;
            return rVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16755a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            Throwable th = (Throwable) this.f16756b;
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(SNSVerificationStepViewModel.this), "Error building state: " + th.getMessage(), th);
            return O9.p.f3034a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SNSVerificationStepViewModel.class, "step", "getStep()Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$Step;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SNSVerificationStepViewModel.class, "currentError", "getCurrentError()Ljava/lang/CharSequence;", 0);
        iVar.getClass();
        f16646r = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, v.t(SNSVerificationStepViewModel.class, "countdown", "getCountdown()Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$CountdownData;", 0, iVar), v.t(SNSVerificationStepViewModel.class, "codeResponse", "getCodeResponse()Lcom/sumsub/sns/internal/core/data/source/applicant/remote/RequestCodeResponse;", 0, iVar)};
        f16645q = new a(null);
    }

    public SNSVerificationStepViewModel(ValidationIdentifierType validationIdentifierType, com.sumsub.sns.internal.core.domain.b bVar, com.sumsub.sns.internal.core.domain.l lVar, com.sumsub.sns.internal.core.domain.a aVar, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2, G g10) {
        super(aVar2, bVar2);
        this.R = validationIdentifierType;
        this.S = bVar;
        this.T = lVar;
        this.U = aVar;
        this.V = bVar2;
        this.W = g10;
        this.Y = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));
        Step step = Step.INIT;
        this.f16647Z = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "sns_verification_step", step);
        this.f16648a0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "sns_verification_error", null);
        this.f16649b0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "sns_verification_countdown", null);
        this.f16650c0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "sns_verification_response", null);
        this.f16652e0 = FlowKt.stateIn(FlowKt.m142catch(FlowKt.combine(g10.c(step, "sns_verification_step"), g10.c(null, "sns_verification_error"), g10.c(null, "sns_verification_countdown"), g10.c(null, "sns_verification_response"), new q(null)), new r(null)), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), e.a.f16667d);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public String f() {
        int i9 = f.f16690a[this.R.ordinal()];
        if (i9 == 1) {
            return DocumentType.f15251g;
        }
        if (i9 == 2) {
            return DocumentType.f15252h;
        }
        if (i9 == 3) {
            return DocumentType.f15253j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void p() {
        a((CharSequence) null);
    }

    public final b0 q() {
        return (b0) this.f16650c0.a(this, f16646r[3]);
    }

    public final b r() {
        return (b) this.f16649b0.a(this, f16646r[2]);
    }

    public final CharSequence s() {
        return (CharSequence) this.f16648a0.a(this, f16646r[1]);
    }

    public final String t() {
        int i9 = f.f16690a[this.R.ordinal()];
        if (i9 == 1) {
            return DocumentType.f15251g;
        }
        if (i9 == 2) {
            return DocumentType.f15252h;
        }
        if (i9 == 3) {
            return DocumentType.f15253j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public StateFlow<e> j() {
        return this.f16652e0;
    }

    public final void w() {
        a(Step.INIT);
        Job job = this.X;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.X = null;
        a((b0) null);
        a((b) null);
        a((CharSequence) null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super O9.p> aVar) {
        b r8 = r();
        if (r8 != null) {
            b(r8);
        }
        b0 q10 = q();
        if (q10 != null) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new l(q10, null), 3, null);
        }
        return O9.p.f3034a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r18, T9.a<? super com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.e> r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.b(com.sumsub.sns.internal.core.data.source.applicant.remote.b0, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r23, T9.a<? super O9.p> r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.c(com.sumsub.sns.internal.core.data.source.applicant.remote.b0, T9.a):java.lang.Object");
    }

    public final void a(Step step) {
        this.f16647Z.a(this, f16646r[0], step);
    }

    public final void a(CharSequence charSequence) {
        this.f16648a0.a(this, f16646r[1], charSequence);
    }

    public final void a(b bVar) {
        this.f16649b0.a(this, f16646r[2], bVar);
    }

    public final void a(b0 b0Var) {
        this.f16650c0.a(this, f16646r[3], b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.CharSequence r18, T9.a<? super com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.e> r19) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.a(java.lang.CharSequence, T9.a):java.lang.Object");
    }

    public final void b(String str) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new m(this, t(), null, this, str), 3, null);
    }

    public final void b(b bVar) {
        Job launch$default;
        Job job = this.X;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.Y, null, null, new n(bVar, null), 3, null);
        this.X = launch$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.b r18, T9.a<? super com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.e> r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.a(com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel$b, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.source.applicant.remote.b0 r25, T9.a<? super com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.b> r26) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel.a(com.sumsub.sns.internal.core.data.source.applicant.remote.b0, T9.a):java.lang.Object");
    }

    public final void a(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k(this, t(), null, this, str, str2), 3, null);
    }
}
