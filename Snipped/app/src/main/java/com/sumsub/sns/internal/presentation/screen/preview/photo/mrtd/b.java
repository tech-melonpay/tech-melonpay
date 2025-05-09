package com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd;

import O9.p;
import android.nfc.tech.IsoDep;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Action;
import com.sumsub.sns.internal.core.analytics.l;
import com.sumsub.sns.internal.core.common.v0;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.domain.h;
import ia.InterfaceC0840h;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.base.a<a.AbstractC0338a> {

    /* renamed from: q, reason: collision with root package name */
    public final h f18698q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18699r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18700s;

    /* renamed from: t, reason: collision with root package name */
    public int f18701t;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18697v = {new PropertyReference1Impl(b.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0), com.google.android.gms.measurement.internal.a.p(kotlin.jvm.internal.h.f23186a, b.class, "idDocSetType", "getIdDocSetType()Ljava/lang/String;", 0)};

    /* renamed from: u, reason: collision with root package name */
    public static final a f18696u = new a(null);

    public static final class a {

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0338a implements a.l {

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$a, reason: collision with other inner class name */
            public static final class C0339a extends AbstractC0338a {

                /* renamed from: a, reason: collision with root package name */
                public final CharSequence f18702a;

                public C0339a(CharSequence charSequence) {
                    super(null);
                    this.f18702a = charSequence;
                }

                public final CharSequence b() {
                    return this.f18702a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0339a) && f.b(this.f18702a, ((C0339a) obj).f18702a);
                }

                public int hashCode() {
                    CharSequence charSequence = this.f18702a;
                    if (charSequence == null) {
                        return 0;
                    }
                    return charSequence.hashCode();
                }

                public String toString() {
                    return com.google.android.gms.measurement.internal.a.j(new StringBuilder("Complete(message="), this.f18702a, ')');
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$b, reason: collision with other inner class name */
            public static final class C0340b extends AbstractC0338a {

                /* renamed from: a, reason: collision with root package name */
                public final CharSequence f18703a;

                /* renamed from: b, reason: collision with root package name */
                public final CharSequence f18704b;

                /* renamed from: c, reason: collision with root package name */
                public final CharSequence f18705c;

                public C0340b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
                    super(null);
                    this.f18703a = charSequence;
                    this.f18704b = charSequence2;
                    this.f18705c = charSequence3;
                }

                public final CharSequence d() {
                    return this.f18703a;
                }

                public final CharSequence e() {
                    return this.f18704b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0340b)) {
                        return false;
                    }
                    C0340b c0340b = (C0340b) obj;
                    return f.b(this.f18703a, c0340b.f18703a) && f.b(this.f18704b, c0340b.f18704b) && f.b(this.f18705c, c0340b.f18705c);
                }

                public final CharSequence f() {
                    return this.f18705c;
                }

                public int hashCode() {
                    CharSequence charSequence = this.f18703a;
                    int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                    CharSequence charSequence2 = this.f18704b;
                    int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                    CharSequence charSequence3 = this.f18705c;
                    return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Error(message=");
                    sb2.append((Object) this.f18703a);
                    sb2.append(", primaryButton=");
                    sb2.append((Object) this.f18704b);
                    sb2.append(", secondaryButton=");
                    return com.google.android.gms.measurement.internal.a.j(sb2, this.f18705c, ')');
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$c */
            public static final class c extends AbstractC0338a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f18706a = new c();

                public c() {
                    super(null);
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$d */
            public static final class d extends AbstractC0338a {

                /* renamed from: a, reason: collision with root package name */
                public final CharSequence f18707a;

                /* renamed from: b, reason: collision with root package name */
                public final CharSequence f18708b;

                /* renamed from: c, reason: collision with root package name */
                public final CharSequence f18709c;

                /* renamed from: d, reason: collision with root package name */
                public final CharSequence f18710d;

                /* renamed from: e, reason: collision with root package name */
                public final CharSequence f18711e;

                public d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
                    super(null);
                    this.f18707a = charSequence;
                    this.f18708b = charSequence2;
                    this.f18709c = charSequence3;
                    this.f18710d = charSequence4;
                    this.f18711e = charSequence5;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return f.b(this.f18707a, dVar.f18707a) && f.b(this.f18708b, dVar.f18708b) && f.b(this.f18709c, dVar.f18709c) && f.b(this.f18710d, dVar.f18710d) && f.b(this.f18711e, dVar.f18711e);
                }

                public final CharSequence f() {
                    return this.f18709c;
                }

                public final CharSequence h() {
                    return this.f18711e;
                }

                public int hashCode() {
                    CharSequence charSequence = this.f18707a;
                    int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                    CharSequence charSequence2 = this.f18708b;
                    int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                    CharSequence charSequence3 = this.f18709c;
                    int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                    CharSequence charSequence4 = this.f18710d;
                    int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
                    CharSequence charSequence5 = this.f18711e;
                    return hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0);
                }

                public final CharSequence i() {
                    return this.f18708b;
                }

                public final CharSequence j() {
                    return this.f18707a;
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Listening(title=");
                    sb2.append((Object) this.f18707a);
                    sb2.append(", subtitle=");
                    sb2.append((Object) this.f18708b);
                    sb2.append(", hint=");
                    sb2.append((Object) this.f18709c);
                    sb2.append(", primaryButton=");
                    sb2.append((Object) this.f18710d);
                    sb2.append(", secondaryButton=");
                    return com.google.android.gms.measurement.internal.a.j(sb2, this.f18711e, ')');
                }
            }

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$e */
            public static final class e extends AbstractC0338a {

                /* renamed from: a, reason: collision with root package name */
                public final CharSequence f18712a;

                /* renamed from: b, reason: collision with root package name */
                public final CharSequence f18713b;

                /* renamed from: c, reason: collision with root package name */
                public final CharSequence f18714c;

                /* renamed from: d, reason: collision with root package name */
                public final CharSequence f18715d;

                /* renamed from: e, reason: collision with root package name */
                public final CharSequence f18716e;

                /* renamed from: f, reason: collision with root package name */
                public final int f18717f;

                public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i) {
                    super(null);
                    this.f18712a = charSequence;
                    this.f18713b = charSequence2;
                    this.f18714c = charSequence3;
                    this.f18715d = charSequence4;
                    this.f18716e = charSequence5;
                    this.f18717f = i;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return f.b(this.f18712a, eVar.f18712a) && f.b(this.f18713b, eVar.f18713b) && f.b(this.f18714c, eVar.f18714c) && f.b(this.f18715d, eVar.f18715d) && f.b(this.f18716e, eVar.f18716e) && this.f18717f == eVar.f18717f;
                }

                public final CharSequence g() {
                    return this.f18714c;
                }

                public int hashCode() {
                    CharSequence charSequence = this.f18712a;
                    int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                    CharSequence charSequence2 = this.f18713b;
                    int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                    CharSequence charSequence3 = this.f18714c;
                    int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                    CharSequence charSequence4 = this.f18715d;
                    int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
                    CharSequence charSequence5 = this.f18716e;
                    return Integer.hashCode(this.f18717f) + ((hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31);
                }

                public final int i() {
                    return this.f18717f;
                }

                public final CharSequence j() {
                    return this.f18716e;
                }

                public final CharSequence k() {
                    return this.f18713b;
                }

                public final CharSequence l() {
                    return this.f18712a;
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Reading(title=");
                    sb2.append((Object) this.f18712a);
                    sb2.append(", subtitle=");
                    sb2.append((Object) this.f18713b);
                    sb2.append(", hint=");
                    sb2.append((Object) this.f18714c);
                    sb2.append(", primaryButton=");
                    sb2.append((Object) this.f18715d);
                    sb2.append(", secondaryButton=");
                    sb2.append((Object) this.f18716e);
                    sb2.append(", progress=");
                    return androidx.camera.core.impl.utils.a.m(sb2, this.f18717f, ')');
                }
            }

            public /* synthetic */ AbstractC0338a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public AbstractC0338a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel", f = "SNSMRTDReadViewModel.kt", l = {41, 41}, m = "getStringValue")
    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$b, reason: collision with other inner class name */
    public static final class C0341b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18718a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18719b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18720c;

        /* renamed from: e, reason: collision with root package name */
        public int f18722e;

        public C0341b(T9.a<? super C0341b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18720c = obj;
            this.f18722e |= Integer.MIN_VALUE;
            return b.this.a((String) null, (String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startListening$1", f = "SNSMRTDReadViewModel.kt", l = {47, 48, 49, 51}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<a.AbstractC0338a, T9.a<? super a.AbstractC0338a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18723a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18724b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18725c;

        /* renamed from: d, reason: collision with root package name */
        public int f18726d;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.AbstractC0338a abstractC0338a, T9.a<? super a.AbstractC0338a> aVar) {
            return ((c) create(abstractC0338a, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new c(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r7.f18726d
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L47
                if (r1 == r5) goto L43
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L2f
                if (r1 != r2) goto L27
                java.lang.Object r0 = r7.f18725c
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r7.f18724b
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r7.f18723a
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                kotlin.b.b(r8)
                r3 = r0
                r6 = r2
            L23:
                r2 = r1
                r1 = r6
                goto L9f
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2f:
                java.lang.Object r1 = r7.f18724b
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r3 = r7.f18723a
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                kotlin.b.b(r8)
                goto L86
            L3b:
                java.lang.Object r1 = r7.f18723a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                kotlin.b.b(r8)
                goto L6d
            L43:
                kotlin.b.b(r8)
                goto L59
            L47:
                kotlin.b.b(r8)
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r8 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r7.f18726d = r5
                java.lang.String r1 = "sns_mrtdscan_title::%s"
                java.lang.String r5 = "sns_mrtdscan_title"
                java.lang.Object r8 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r8, r1, r5, r7)
                if (r8 != r0) goto L59
                return r0
            L59:
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r8 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r7.f18723a = r1
                r7.f18726d = r4
                java.lang.String r4 = "sns_mrtdscan_subtitle::%s"
                java.lang.String r5 = "sns_mrtdscan_subtitle"
                java.lang.Object r8 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r8, r4, r5, r7)
                if (r8 != r0) goto L6d
                return r0
            L6d:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r4 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r7.f18723a = r1
                r7.f18724b = r8
                r7.f18726d = r3
                java.lang.String r3 = "sns_mrtdscan_hint_prepare::%s"
                java.lang.String r5 = "sns_mrtdscan_hint_prepare"
                java.lang.Object r3 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r4, r3, r5, r7)
                if (r3 != r0) goto L82
                return r0
            L82:
                r6 = r1
                r1 = r8
                r8 = r3
                r3 = r6
            L86:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r4 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r7.f18723a = r3
                r7.f18724b = r1
                r7.f18725c = r8
                r7.f18726d = r2
                java.lang.String r2 = "sns_mrtdscan_action_skip"
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r4, r2, r7)
                if (r2 != r0) goto L9b
                return r0
            L9b:
                r6 = r3
                r3 = r8
                r8 = r2
                goto L23
            L9f:
                r5 = r8
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$d r8 = new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$d
                r4 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startRead$1", f = "SNSMRTDReadViewModel.kt", l = {74, 76, 78}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<a.AbstractC0338a, T9.a<? super a.AbstractC0338a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18728a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18729b;

        /* renamed from: c, reason: collision with root package name */
        public int f18730c;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.AbstractC0338a abstractC0338a, T9.a<? super a.AbstractC0338a> aVar) {
            return ((d) create(abstractC0338a, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new d(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r8.f18730c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r8.f18729b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r8.f18728a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                kotlin.b.b(r9)
                r3 = r0
                goto L69
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r1 = r8.f18728a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                kotlin.b.b(r9)
                goto L54
            L2c:
                kotlin.b.b(r9)
                goto L40
            L30:
                kotlin.b.b(r9)
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r9 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r8.f18730c = r4
                java.lang.String r1 = "sns_mrtdscan_hint_scanning"
                java.lang.Object r9 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r9, r1, r8)
                if (r9 != r0) goto L40
                return r0
            L40:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r8.f18728a = r9
                r8.f18730c = r3
                java.lang.String r3 = "sns_mrtdscan_reader_prompt"
                java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r1, r3, r8)
                if (r1 != r0) goto L51
                return r0
            L51:
                r7 = r1
                r1 = r9
                r9 = r7
            L54:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r3 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.this
                r8.f18728a = r1
                r8.f18729b = r9
                r8.f18730c = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r3, r2, r8)
                if (r2 != r0) goto L67
                return r0
            L67:
                r3 = r9
                r9 = r2
            L69:
                r5 = r9
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$e r9 = new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$e
                r4 = 0
                r6 = 0
                r2 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startRead$2", f = "SNSMRTDReadViewModel.kt", l = {84}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18732a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18734c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18735d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f18736e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ IsoDep f18737f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f18738g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f18739h;
        public final /* synthetic */ String i;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startRead$2$1", f = "SNSMRTDReadViewModel.kt", l = {115}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<a.AbstractC0338a, T9.a<? super a.AbstractC0338a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18740a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18741b = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a.AbstractC0338a abstractC0338a, T9.a<? super a.AbstractC0338a> aVar) {
                return ((a) create(abstractC0338a, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18741b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18740a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    b bVar = this.f18741b;
                    this.f18740a = 1;
                    obj = bVar.a("sns_general_dataSubmited", this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return new a.AbstractC0338a.C0339a((CharSequence) obj);
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startRead$2$2", f = "SNSMRTDReadViewModel.kt", l = {133, 134, 135}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$e$b, reason: collision with other inner class name */
        public static final class C0342b extends SuspendLambda implements InterfaceC0650p<a.AbstractC0338a, T9.a<? super a.AbstractC0338a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18742a;

            /* renamed from: b, reason: collision with root package name */
            public Object f18743b;

            /* renamed from: c, reason: collision with root package name */
            public int f18744c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f18745d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0342b(b bVar, T9.a<? super C0342b> aVar) {
                super(2, aVar);
                this.f18745d = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a.AbstractC0338a abstractC0338a, T9.a<? super a.AbstractC0338a> aVar) {
                return ((C0342b) create(abstractC0338a, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new C0342b(this.f18745d, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r6.f18744c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L2b
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r6.f18743b
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    java.lang.Object r1 = r6.f18742a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.b.b(r7)
                    goto L68
                L1b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L23:
                    java.lang.Object r1 = r6.f18742a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.b.b(r7)
                    goto L53
                L2b:
                    kotlin.b.b(r7)
                    goto L3f
                L2f:
                    kotlin.b.b(r7)
                    com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r7 = r6.f18745d
                    r6.f18744c = r4
                    java.lang.String r1 = "sns_mrtdscan_reader_error"
                    java.lang.Object r7 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r7, r1, r6)
                    if (r7 != r0) goto L3f
                    return r0
                L3f:
                    java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                    com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r1 = r6.f18745d
                    r6.f18742a = r7
                    r6.f18744c = r3
                    java.lang.String r3 = "sns_mrtdscan_action_retry"
                    java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r1, r3, r6)
                    if (r1 != r0) goto L50
                    return r0
                L50:
                    r5 = r1
                    r1 = r7
                    r7 = r5
                L53:
                    java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                    com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r3 = r6.f18745d
                    r6.f18742a = r1
                    r6.f18743b = r7
                    r6.f18744c = r2
                    java.lang.String r2 = "sns_mrtdscan_action_skip"
                    java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r3, r2, r6)
                    if (r2 != r0) goto L66
                    return r0
                L66:
                    r0 = r7
                    r7 = r2
                L68:
                    java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                    com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$b r2 = new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$b
                    r2.<init>(r1, r0, r7)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.e.C0342b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class c extends Lambda implements InterfaceC0646l<Integer, p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f18746a;

            @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.SNSMRTDReadViewModel$startRead$2$readingResult$1$1", f = "SNSMRTDReadViewModel.kt", l = {95, 97, 99}, m = "invokeSuspend")
            public static final class a extends SuspendLambda implements InterfaceC0650p<a.AbstractC0338a, T9.a<? super a.AbstractC0338a>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f18747a;

                /* renamed from: b, reason: collision with root package name */
                public Object f18748b;

                /* renamed from: c, reason: collision with root package name */
                public int f18749c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b f18750d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f18751e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(b bVar, int i, T9.a<? super a> aVar) {
                    super(2, aVar);
                    this.f18750d = bVar;
                    this.f18751e = i;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(a.AbstractC0338a abstractC0338a, T9.a<? super a.AbstractC0338a> aVar) {
                    return ((a) create(abstractC0338a, aVar)).invokeSuspend(p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                    return new a(this.f18750d, this.f18751e, aVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                        int r1 = r8.f18749c
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L30
                        if (r1 == r4) goto L2c
                        if (r1 == r3) goto L24
                        if (r1 != r2) goto L1c
                        java.lang.Object r0 = r8.f18748b
                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                        java.lang.Object r1 = r8.f18747a
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        kotlin.b.b(r9)
                        r3 = r0
                        goto L69
                    L1c:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L24:
                        java.lang.Object r1 = r8.f18747a
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        kotlin.b.b(r9)
                        goto L54
                    L2c:
                        kotlin.b.b(r9)
                        goto L40
                    L30:
                        kotlin.b.b(r9)
                        com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r9 = r8.f18750d
                        r8.f18749c = r4
                        java.lang.String r1 = "sns_mrtdscan_hint_scanning"
                        java.lang.Object r9 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r9, r1, r8)
                        if (r9 != r0) goto L40
                        return r0
                    L40:
                        java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                        com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r1 = r8.f18750d
                        r8.f18747a = r9
                        r8.f18749c = r3
                        java.lang.String r3 = "sns_mrtdscan_reader_prompt"
                        java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r1, r3, r8)
                        if (r1 != r0) goto L51
                        return r0
                    L51:
                        r7 = r1
                        r1 = r9
                        r9 = r7
                    L54:
                        java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                        com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r3 = r8.f18750d
                        r8.f18747a = r1
                        r8.f18748b = r9
                        r8.f18749c = r2
                        java.lang.String r2 = "sns_alert_action_cancel"
                        java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(r3, r2, r8)
                        if (r2 != r0) goto L67
                        return r0
                    L67:
                        r3 = r9
                        r9 = r2
                    L69:
                        r5 = r9
                        java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                        int r6 = r8.f18751e
                        com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$e r9 = new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$a$a$e
                        r2 = 0
                        r4 = 0
                        r0 = r9
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.e.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar) {
                super(1);
                this.f18746a = bVar;
            }

            public final void a(int i) {
                b bVar = this.f18746a;
                com.sumsub.sns.core.presentation.base.a.a(bVar, false, new a(bVar, i, null), 1, null);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                a(num.intValue());
                return p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, IsoDep isoDep, String str4, String str5, String str6, T9.a<? super e> aVar) {
            super(2, aVar);
            this.f18734c = str;
            this.f18735d = str2;
            this.f18736e = str3;
            this.f18737f = isoDep;
            this.f18738g = str4;
            this.f18739h = str5;
            this.i = str6;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((e) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return b.this.new e(this.f18734c, this.f18735d, this.f18736e, this.f18737f, this.f18738g, this.f18739h, this.i, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18732a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = b.this.f18698q;
                String str = this.f18734c;
                String str2 = this.f18735d;
                String str3 = this.f18736e;
                IsoDep isoDep = this.f18737f;
                String str4 = this.f18738g;
                String str5 = this.f18739h;
                String str6 = this.i;
                c cVar = new c(b.this);
                this.f18732a = 1;
                obj = hVar.a(str, str2, str3, isoDep, str4, str5, str6, cVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            h.b bVar = (h.b) obj;
            if (f.b(bVar, h.b.C0251b.f16834a)) {
                l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.NfcScan).e().a(new Pair("numberOfAttempts", new Integer(b.this.f18701t))), false, 1, null);
                b bVar2 = b.this;
                com.sumsub.sns.core.presentation.base.a.a(bVar2, false, new a(bVar2, null), 1, null);
            } else if (bVar instanceof h.b.a) {
                h.b.a aVar = (h.b.a) bVar;
                l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.NfcScan).d().a(new Pair("attempt", new Integer(b.this.f18701t)), new Pair(Constants.IPC_BUNDLE_KEY_SEND_ERROR, String.valueOf(aVar.b().getMessage()))), false, 1, null);
                if (aVar.b() instanceof SNSException) {
                    com.sumsub.sns.core.presentation.base.a.a(b.this, aVar.b(), b.this.q(), (Object) null, 4, (Object) null);
                } else {
                    b bVar3 = b.this;
                    com.sumsub.sns.core.presentation.base.a.a(bVar3, false, new C0342b(bVar3, null), 1, null);
                }
            }
            return p.f3034a;
        }
    }

    public b(G g10, h hVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f18698q = hVar;
        this.f18699r = v0.a(g10, "ARGS_IDDOCTYPE");
        this.f18700s = v0.a(g10, "ARGS_IDDOCSETTYPE");
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a.AbstractC0338a.c e() {
        return a.AbstractC0338a.c.f18706a;
    }

    public final String q() {
        return (String) this.f18700s.a(this, f18697v[1]);
    }

    public final String r() {
        return (String) this.f18699r.a(this, f18697v[0]);
    }

    public final void s() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new c(null), 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(o oVar) {
        super.b(oVar);
        s();
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        s();
        return p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, T9.a<? super java.lang.CharSequence> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.C0341b
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$b r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.C0341b) r0
            int r1 = r0.f18722e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18722e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$b r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18720c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18722e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f18719b
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f18718a
            com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b r6 = (com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b) r6
            kotlin.b.b(r8)
            goto L60
        L3f:
            kotlin.b.b(r8)
            java.lang.String r8 = r5.r()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r0.f18718a = r5
            r0.f18719b = r7
            r0.f18722e = r4
            java.lang.Object r8 = r5.a(r6, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r6 = r5
        L60:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L65
            goto L75
        L65:
            r8 = 0
            r0.f18718a = r8
            r0.f18719b = r8
            r0.f18722e = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.mrtd.b.a(java.lang.String, java.lang.String, T9.a):java.lang.Object");
    }

    public final void a(String str, String str2, String str3, IsoDep isoDep, String str4, String str5, String str6) {
        this.f18701t++;
        l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.NfcScan).l().a(new Pair("attempt", Integer.valueOf(this.f18701t))), false, 1, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new d(null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new e(str, str2, str3, isoDep, str4, str5, str6, null), 3, null);
    }
}
