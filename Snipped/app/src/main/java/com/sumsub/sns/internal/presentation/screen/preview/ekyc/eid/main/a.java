package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main;

import C.v;
import O9.p;
import P9.s;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0652r;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b;
import de.authada.library.api.Can;
import de.authada.library.api.SecretWrong;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.authentication.StartCallback;
import de.authada.library.api.pinChanger.TPin;
import de.authada.library.api.unblock.Puk;
import de.authada.library.api.unblock.UnblockerCallback;
import ia.InterfaceC0840h;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import ka.C0966k;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b> {

    /* renamed from: F, reason: collision with root package name */
    public static final d f18224F;

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18225G;

    /* renamed from: N, reason: collision with root package name */
    public static final n.e f18226N;

    /* renamed from: A, reason: collision with root package name */
    public final q f18227A;

    /* renamed from: B, reason: collision with root package name */
    public final r f18228B;

    /* renamed from: C, reason: collision with root package name */
    public final x f18229C;

    /* renamed from: D, reason: collision with root package name */
    public final y f18230D;

    /* renamed from: E, reason: collision with root package name */
    public final InterfaceC0646l<Throwable, p> f18231E;

    /* renamed from: q, reason: collision with root package name */
    public final String f18232q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18233r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18234s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18235t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18236u;

    /* renamed from: v, reason: collision with root package name */
    public final MutableStateFlow<Integer> f18237v;

    /* renamed from: w, reason: collision with root package name */
    public final MutableStateFlow<String> f18238w;

    /* renamed from: x, reason: collision with root package name */
    public final StateFlow<n> f18239x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18240y;

    /* renamed from: z, reason: collision with root package name */
    public final StateFlow<com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b> f18241z;

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$a, reason: collision with other inner class name */
    public static final class C0301a {

        /* renamed from: a, reason: collision with root package name */
        public final Screen f18242a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f18243b;

        public C0301a(Screen screen, Map<String, ? extends Object> map) {
            this.f18242a = screen;
            this.f18243b = map;
        }

        public final Map<String, Object> c() {
            return this.f18243b;
        }

        public final Screen d() {
            return this.f18242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0301a)) {
                return false;
            }
            C0301a c0301a = (C0301a) obj;
            return this.f18242a == c0301a.f18242a && kotlin.jvm.internal.f.b(this.f18243b, c0301a.f18243b);
        }

        public int hashCode() {
            return this.f18243b.hashCode() + (this.f18242a.hashCode() * 31);
        }

        public String toString() {
            return "AnalyticsWrapper(screen=" + this.f18242a + ", payload=" + this.f18243b + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$setScanningState$1", f = "SNSEidMainViewModel.kt", l = {489, 491}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18244a;

        /* renamed from: b, reason: collision with root package name */
        public int f18245b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18246c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f18247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(boolean z10, a aVar, T9.a<? super a0> aVar2) {
            super(2, aVar2);
            this.f18246c = z10;
            this.f18247d = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((a0) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new a0(this.f18246c, this.f18247d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18245b;
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.f18246c) {
                    MutableStateFlow mutableStateFlow3 = this.f18247d.f18238w;
                    a aVar = this.f18247d;
                    this.f18244a = mutableStateFlow3;
                    this.f18245b = 1;
                    Object a10 = aVar.a("sns_eid_nfcScan_hint_scanning", this);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                    obj = a10;
                    mutableStateFlow2.setValue(obj);
                } else {
                    MutableStateFlow mutableStateFlow4 = this.f18247d.f18238w;
                    a aVar2 = this.f18247d;
                    this.f18244a = mutableStateFlow4;
                    this.f18245b = 2;
                    Object a11 = aVar2.a("sns_eid_nfcScan_hint_searching", this);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableStateFlow = mutableStateFlow4;
                    obj = a11;
                    mutableStateFlow.setValue(obj);
                }
            } else if (i == 1) {
                mutableStateFlow2 = (MutableStateFlow) this.f18244a;
                kotlin.b.b(obj);
                mutableStateFlow2.setValue(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f18244a;
                kotlin.b.b(obj);
                mutableStateFlow.setValue(obj);
            }
            return p.f3034a;
        }
    }

    public static final class b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a f18248a;

        public b(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a aVar) {
            this.f18248a = aVar;
        }

        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a b() {
            return this.f18248a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f18248a, ((b) obj).f18248a);
        }

        public int hashCode() {
            return this.f18248a.hashCode();
        }

        public String toString() {
            return "AuthadaInteractionEvent(interaction=" + this.f18248a + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$showLegalInfoExplain$1", f = "SNSEidMainViewModel.kt", l = {719, 721}, m = "invokeSuspend")
    public static final class b0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18249a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18250b;

        /* renamed from: c, reason: collision with root package name */
        public int f18251c;

        public b0(T9.a<? super b0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((b0) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new b0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            CharSequence charSequence2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18251c;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = a.this;
                this.f18251c = 1;
                obj = aVar.a("sns_eid_serviceInfo_title", this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charSequence2 = (CharSequence) this.f18250b;
                    charSequence = (CharSequence) this.f18249a;
                    kotlin.b.b(obj);
                    a.this.a(new j(charSequence, charSequence2, (CharSequence) obj));
                    return p.f3034a;
                }
                kotlin.b.b(obj);
            }
            charSequence = (CharSequence) obj;
            CharSequence s10 = a.this.s();
            a aVar2 = a.this;
            this.f18249a = charSequence;
            this.f18250b = s10;
            this.f18251c = 2;
            Object a10 = aVar2.a("sns_alert_action_dismiss", this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence2 = s10;
            obj = a10;
            a.this.a(new j(charSequence, charSequence2, (CharSequence) obj));
            return p.f3034a;
        }
    }

    public static final class c implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18253a = new c();
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$showPinExplain$1", f = "SNSEidMainViewModel.kt", l = {711, 712}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18254a;

        /* renamed from: b, reason: collision with root package name */
        public int f18255b;

        public c0(T9.a<? super c0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c0) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new c0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18255b;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = a.this;
                this.f18255b = 1;
                obj = aVar.a("sns_eid_pinInfo_text", this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charSequence = (CharSequence) this.f18254a;
                    kotlin.b.b(obj);
                    a.this.a(new l(charSequence, (CharSequence) obj));
                    return p.f3034a;
                }
                kotlin.b.b(obj);
            }
            CharSequence charSequence2 = (CharSequence) obj;
            a aVar2 = a.this;
            this.f18254a = charSequence2;
            this.f18255b = 2;
            Object a10 = aVar2.a("sns_alert_action_dismiss", this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = charSequence2;
            obj = a10;
            a.this.a(new l(charSequence, (CharSequence) obj));
            return p.f3034a;
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$throwGeneralError$1", f = "SNSEidMainViewModel.kt", l = {830, 830, 830}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18257a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18258b;

        /* renamed from: c, reason: collision with root package name */
        public int f18259c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f18261e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f18262f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f18263g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Throwable f18264h;
        public final /* synthetic */ i i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str, String str2, String str3, Throwable th, i iVar, T9.a<? super d0> aVar) {
            super(2, aVar);
            this.f18261e = str;
            this.f18262f = str2;
            this.f18263g = str3;
            this.f18264h = th;
            this.i = iVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((d0) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new d0(this.f18261e, this.f18262f, this.f18263g, this.f18264h, this.i, aVar);
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
                int r1 = r6.f18259c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r6.f18258b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r6.f18257a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.b.b(r7)
                goto L68
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f18257a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.b.b(r7)
                goto L53
            L2b:
                kotlin.b.b(r7)
                goto L3f
            L2f:
                kotlin.b.b(r7)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a r7 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.this
                java.lang.String r1 = r6.f18261e
                r6.f18259c = r4
                java.lang.Object r7 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(r7, r1, r6)
                if (r7 != r0) goto L3f
                return r0
            L3f:
                java.lang.String r7 = (java.lang.String) r7
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.this
                java.lang.String r4 = r6.f18262f
                r6.f18257a = r7
                r6.f18259c = r3
                java.lang.Object r1 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(r1, r4, r6)
                if (r1 != r0) goto L50
                return r0
            L50:
                r5 = r1
                r1 = r7
                r7 = r5
            L53:
                java.lang.String r7 = (java.lang.String) r7
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a r3 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.this
                java.lang.String r4 = r6.f18263g
                r6.f18257a = r1
                r6.f18258b = r7
                r6.f18259c = r2
                java.lang.Object r2 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.a(r3, r4, r6)
                if (r2 != r0) goto L66
                return r0
            L66:
                r0 = r7
                r7 = r2
            L68:
                java.lang.String r7 = (java.lang.String) r7
                com.sumsub.sns.internal.core.data.model.o$a r2 = new com.sumsub.sns.internal.core.data.model.o$a
                r2.<init>(r1, r0, r7)
                com.sumsub.sns.internal.core.data.model.o$d r7 = new com.sumsub.sns.internal.core.data.model.o$d
                java.lang.Throwable r0 = r6.f18264h
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i r1 = r6.i
                r7.<init>(r0, r1, r2)
                com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a r0 = com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.this
                java.lang.String r1 = r0.f()
                r0.a(r7, r1)
                O9.p r7 = O9.p.f3034a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18265a;

        public e(String str) {
            this.f18265a = str;
        }

        public final String b() {
            return this.f18265a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f18265a, ((e) obj).f18265a);
        }

        public int hashCode() {
            return this.f18265a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("EnterCanEvent(pin="), this.f18265a, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$viewState$1", f = "SNSEidMainViewModel.kt", l = {96, 97}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0652r<n, Integer, String, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18266a;

        /* renamed from: b, reason: collision with root package name */
        public int f18267b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18268c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ int f18269d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18270e;

        public e0(T9.a<? super e0> aVar) {
            super(4, aVar);
        }

        public final Object a(n nVar, int i, String str, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b> aVar) {
            e0 e0Var = a.this.new e0(aVar);
            e0Var.f18268c = nVar;
            e0Var.f18269d = i;
            e0Var.f18270e = str;
            return e0Var.invokeSuspend(p.f3034a);
        }

        @Override // ca.InterfaceC0652r
        public /* bridge */ /* synthetic */ Object invoke(n nVar, Integer num, String str, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b> aVar) {
            return a(nVar, num.intValue(), str, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18272a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18273b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18274c;

        public f(String str, String str2, String str3) {
            this.f18272a = str;
            this.f18273b = str2;
            this.f18274c = str3;
        }

        public final String d() {
            return this.f18274c;
        }

        public final String e() {
            return this.f18273b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.f.b(this.f18272a, fVar.f18272a) && kotlin.jvm.internal.f.b(this.f18273b, fVar.f18273b) && kotlin.jvm.internal.f.b(this.f18274c, fVar.f18274c);
        }

        public final String f() {
            return this.f18272a;
        }

        public int hashCode() {
            int c2 = v.c(this.f18272a.hashCode() * 31, 31, this.f18273b);
            String str = this.f18274c;
            return c2 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("EnterCanForTransportPinEvent(pin=");
            sb2.append(this.f18272a);
            sb2.append(", newPin=");
            sb2.append(this.f18273b);
            sb2.append(", lastPinDigit=");
            return v.q(sb2, this.f18274c, ')');
        }
    }

    public static final class g implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18275a;

        public g(boolean z10) {
            this.f18275a = z10;
        }

        public final boolean b() {
            return this.f18275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f18275a == ((g) obj).f18275a;
        }

        public int hashCode() {
            boolean z10 = this.f18275a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("EnterPinEvent(needCan="), this.f18275a, ')');
        }
    }

    public static final class h implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18276a = new h();
    }

    public static abstract class i implements Parcelable {

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$a, reason: collision with other inner class name */
        public static final class C0302a extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final C0302a f18277a = new C0302a();
            public static final Parcelable.Creator<C0302a> CREATOR = new C0303a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$a$a, reason: collision with other inner class name */
            public static final class C0303a implements Parcelable.Creator<C0302a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0302a createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return C0302a.f18277a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0302a[] newArray(int i) {
                    return new C0302a[i];
                }
            }

            public C0302a() {
                super(null);
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

        public static final class b extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final b f18278a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0304a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$b$a, reason: collision with other inner class name */
            public static final class C0304a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return b.f18278a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i) {
                    return new b[i];
                }
            }

            public b() {
                super(null);
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

        public static final class c extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final c f18279a = new c();
            public static final Parcelable.Creator<c> CREATOR = new C0305a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$c$a, reason: collision with other inner class name */
            public static final class C0305a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return c.f18279a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i) {
                    return new c[i];
                }
            }

            public c() {
                super(null);
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

        public static final class d extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final d f18280a = new d();
            public static final Parcelable.Creator<d> CREATOR = new C0306a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$d$a, reason: collision with other inner class name */
            public static final class C0306a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return d.f18280a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i) {
                    return new d[i];
                }
            }

            public d() {
                super(null);
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

        public static final class e extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final e f18281a = new e();
            public static final Parcelable.Creator<e> CREATOR = new C0307a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$e$a, reason: collision with other inner class name */
            public static final class C0307a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return e.f18281a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i) {
                    return new e[i];
                }
            }

            public e() {
                super(null);
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

        public static final class f extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final f f18282a = new f();
            public static final Parcelable.Creator<f> CREATOR = new C0308a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$f$a, reason: collision with other inner class name */
            public static final class C0308a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return f.f18282a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i) {
                    return new f[i];
                }
            }

            public f() {
                super(null);
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

        public static final class g extends i {
            public static final Parcelable.Creator<g> CREATOR = new C0309a();

            /* renamed from: a, reason: collision with root package name */
            public final String f18283a;

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$g$a, reason: collision with other inner class name */
            public static final class C0309a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    return new g(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i) {
                    return new g[i];
                }
            }

            public g(String str) {
                super(null);
                this.f18283a = str;
            }

            public final String b() {
                return this.f18283a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && kotlin.jvm.internal.f.b(this.f18283a, ((g) obj).f18283a);
            }

            public int hashCode() {
                return this.f18283a.hashCode();
            }

            public String toString() {
                return v.q(new StringBuilder("RequestCan(pin="), this.f18283a, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f18283a);
            }
        }

        public static final class h extends i {
            public static final Parcelable.Creator<h> CREATOR = new C0310a();

            /* renamed from: a, reason: collision with root package name */
            public final String f18284a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18285b;

            /* renamed from: c, reason: collision with root package name */
            public final String f18286c;

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$h$a, reason: collision with other inner class name */
            public static final class C0310a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    return new h(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i) {
                    return new h[i];
                }
            }

            public h(String str, String str2, String str3) {
                super(null);
                this.f18284a = str;
                this.f18285b = str2;
                this.f18286c = str3;
            }

            public final String d() {
                return this.f18286c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f18285b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return kotlin.jvm.internal.f.b(this.f18284a, hVar.f18284a) && kotlin.jvm.internal.f.b(this.f18285b, hVar.f18285b) && kotlin.jvm.internal.f.b(this.f18286c, hVar.f18286c);
            }

            public final String f() {
                return this.f18284a;
            }

            public int hashCode() {
                int c2 = v.c(this.f18284a.hashCode() * 31, 31, this.f18285b);
                String str = this.f18286c;
                return c2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("RequestCanForTransportPin(pin=");
                sb2.append(this.f18284a);
                sb2.append(", newPin=");
                sb2.append(this.f18285b);
                sb2.append(", lastPinDigit=");
                return v.q(sb2, this.f18286c, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f18284a);
                parcel.writeString(this.f18285b);
                parcel.writeString(this.f18286c);
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$i, reason: collision with other inner class name */
        public static final class C0311i extends i {
            public static final Parcelable.Creator<C0311i> CREATOR = new C0312a();

            /* renamed from: a, reason: collision with root package name */
            public final SecretWrong f18287a;

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$i$a, reason: collision with other inner class name */
            public static final class C0312a implements Parcelable.Creator<C0311i> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0311i createFromParcel(Parcel parcel) {
                    return new C0311i(parcel.readInt() == 0 ? null : SecretWrong.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0311i[] newArray(int i) {
                    return new C0311i[i];
                }
            }

            public C0311i(SecretWrong secretWrong) {
                super(null);
                this.f18287a = secretWrong;
            }

            public final SecretWrong b() {
                return this.f18287a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0311i) && this.f18287a == ((C0311i) obj).f18287a;
            }

            public int hashCode() {
                SecretWrong secretWrong = this.f18287a;
                if (secretWrong == null) {
                    return 0;
                }
                return secretWrong.hashCode();
            }

            public String toString() {
                return "RequestPin(triesLeft=" + this.f18287a + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                SecretWrong secretWrong = this.f18287a;
                if (secretWrong == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(secretWrong.name());
                }
            }
        }

        public static final class j extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final j f18288a = new j();
            public static final Parcelable.Creator<j> CREATOR = new C0313a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$j$a, reason: collision with other inner class name */
            public static final class C0313a implements Parcelable.Creator<j> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return j.f18288a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j[] newArray(int i) {
                    return new j[i];
                }
            }

            public j() {
                super(null);
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

        public static final class k extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final k f18289a = new k();
            public static final Parcelable.Creator<k> CREATOR = new C0314a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$k$a, reason: collision with other inner class name */
            public static final class C0314a implements Parcelable.Creator<k> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return k.f18289a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k[] newArray(int i) {
                    return new k[i];
                }
            }

            public k() {
                super(null);
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

        public static final class l extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final l f18290a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0315a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$l$a, reason: collision with other inner class name */
            public static final class C0315a implements Parcelable.Creator<l> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return l.f18290a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i) {
                    return new l[i];
                }
            }

            public l() {
                super(null);
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

        public static final class m extends i {

            /* renamed from: a, reason: collision with root package name */
            public static final m f18291a = new m();
            public static final Parcelable.Creator<m> CREATOR = new C0316a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$i$m$a, reason: collision with other inner class name */
            public static final class C0316a implements Parcelable.Creator<m> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return m.f18291a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m[] newArray(int i) {
                    return new m[i];
                }
            }

            public m() {
                super(null);
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

        public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public i() {
        }
    }

    public static final class j implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18292a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18293b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18294c;

        public j() {
            this(null, null, null, 7, null);
        }

        public final CharSequence d() {
            return this.f18294c;
        }

        public final CharSequence e() {
            return this.f18293b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.f.b(this.f18292a, jVar.f18292a) && kotlin.jvm.internal.f.b(this.f18293b, jVar.f18293b) && kotlin.jvm.internal.f.b(this.f18294c, jVar.f18294c);
        }

        public final CharSequence f() {
            return this.f18292a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f18292a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18293b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18294c;
            return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LegalInfoExplainEvent(title=");
            sb2.append((Object) this.f18292a);
            sb2.append(", text=");
            sb2.append((Object) this.f18293b);
            sb2.append(", buttonText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f18294c, ')');
        }

        public j(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f18292a = charSequence;
            this.f18293b = charSequence2;
            this.f18294c = charSequence3;
        }

        public /* synthetic */ j(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3);
        }
    }

    public static final class k implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18295a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18296b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18297c;

        /* renamed from: d, reason: collision with root package name */
        public final String f18298d;

        public k(String str, String str2, String str3, String str4) {
            this.f18295a = str;
            this.f18296b = str2;
            this.f18297c = str3;
            this.f18298d = str4;
        }

        public final String e() {
            return this.f18298d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.f.b(this.f18295a, kVar.f18295a) && kotlin.jvm.internal.f.b(this.f18296b, kVar.f18296b) && kotlin.jvm.internal.f.b(this.f18297c, kVar.f18297c) && kotlin.jvm.internal.f.b(this.f18298d, kVar.f18298d);
        }

        public final String f() {
            return this.f18296b;
        }

        public final String g() {
            return this.f18297c;
        }

        public final String h() {
            return this.f18295a;
        }

        public int hashCode() {
            String str = this.f18295a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f18296b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f18297c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f18298d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NFCDisabledEvent(title=");
            sb2.append(this.f18295a);
            sb2.append(", message=");
            sb2.append(this.f18296b);
            sb2.append(", okButton=");
            sb2.append(this.f18297c);
            sb2.append(", cancelButton=");
            return v.q(sb2, this.f18298d, ')');
        }
    }

    public static final class l implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18299a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18300b;

        public l() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final CharSequence c() {
            return this.f18300b;
        }

        public final CharSequence d() {
            return this.f18299a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.f.b(this.f18299a, lVar.f18299a) && kotlin.jvm.internal.f.b(this.f18300b, lVar.f18300b);
        }

        public int hashCode() {
            CharSequence charSequence = this.f18299a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f18300b;
            return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PinExplainEvent(text=");
            sb2.append((Object) this.f18299a);
            sb2.append(", buttonText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f18300b, ')');
        }

        public l(CharSequence charSequence, CharSequence charSequence2) {
            this.f18299a = charSequence;
            this.f18300b = charSequence2;
        }

        public /* synthetic */ l(CharSequence charSequence, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2);
        }
    }

    public static final class m extends AbstractC0535a {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.a f18301a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f18302b;

        public m(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
            super(interfaceC0584d, bundle);
            this.f18301a = aVar;
            this.f18302b = bundle;
        }

        @Override // androidx.lifecycle.AbstractC0535a
        public <T extends Q> T create(String str, Class<T> cls, G g10) {
            Bundle bundle = this.f18302b;
            String string = bundle != null ? bundle.getString("eid_mobile_token", null) : null;
            Bundle bundle2 = this.f18302b;
            String string2 = bundle2 != null ? bundle2.getString("eid_url", null) : null;
            Bundle bundle3 = this.f18302b;
            return new a(string, string2, bundle3 != null ? bundle3.getString("eid_hash", null) : null, g10, this.f18301a.n(), this.f18301a.p());
        }
    }

    public static abstract class n implements Parcelable {

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$a, reason: collision with other inner class name */
        public static final class C0317a extends n {
            public static final Parcelable.Creator<C0317a> CREATOR = new C0318a();

            /* renamed from: a, reason: collision with root package name */
            public final i f18303a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f18304b;

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$a$a, reason: collision with other inner class name */
            public static final class C0318a implements Parcelable.Creator<C0317a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0317a createFromParcel(Parcel parcel) {
                    return new C0317a((i) parcel.readParcelable(C0317a.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0317a[] newArray(int i) {
                    return new C0317a[i];
                }
            }

            public C0317a(i iVar, boolean z10) {
                super(null);
                this.f18303a = iVar;
                this.f18304b = z10;
            }

            public final i c() {
                return this.f18303a;
            }

            public final boolean d() {
                return this.f18304b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0317a)) {
                    return false;
                }
                C0317a c0317a = (C0317a) obj;
                return kotlin.jvm.internal.f.b(this.f18303a, c0317a.f18303a) && this.f18304b == c0317a.f18304b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f18303a.hashCode() * 31;
                boolean z10 = this.f18304b;
                int i = z10;
                if (z10 != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CanPrompt(action=");
                sb2.append(this.f18303a);
                sb2.append(", wrongCan=");
                return androidx.camera.core.impl.utils.a.o(sb2, this.f18304b, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f18303a, i);
                parcel.writeInt(this.f18304b ? 1 : 0);
            }

            public /* synthetic */ C0317a(i iVar, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(iVar, (i & 2) != 0 ? false : z10);
            }
        }

        public static final class b extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f18305a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0319a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$b$a, reason: collision with other inner class name */
            public static final class C0319a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return b.f18305a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i) {
                    return new b[i];
                }
            }

            public b() {
                super(null);
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

        public static final class c extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f18306a = new c();
            public static final Parcelable.Creator<c> CREATOR = new C0320a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$c$a, reason: collision with other inner class name */
            public static final class C0320a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return c.f18306a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i) {
                    return new c[i];
                }
            }

            public c() {
                super(null);
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

        public static final class d extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f18307a = new d();
            public static final Parcelable.Creator<d> CREATOR = new C0321a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$d$a, reason: collision with other inner class name */
            public static final class C0321a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return d.f18307a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i) {
                    return new d[i];
                }
            }

            public d() {
                super(null);
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

        public static final class e extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final e f18308a = new e();
            public static final Parcelable.Creator<e> CREATOR = new C0322a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$e$a, reason: collision with other inner class name */
            public static final class C0322a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return e.f18308a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i) {
                    return new e[i];
                }
            }

            public e() {
                super(null);
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

        public static final class f extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final f f18309a = new f();
            public static final Parcelable.Creator<f> CREATOR = new C0323a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$f$a, reason: collision with other inner class name */
            public static final class C0323a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return f.f18309a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i) {
                    return new f[i];
                }
            }

            public f() {
                super(null);
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

        public static final class g extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final g f18310a = new g();
            public static final Parcelable.Creator<g> CREATOR = new C0324a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$g$a, reason: collision with other inner class name */
            public static final class C0324a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return g.f18310a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i) {
                    return new g[i];
                }
            }

            public g() {
                super(null);
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

        public static final class h extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final h f18311a = new h();
            public static final Parcelable.Creator<h> CREATOR = new C0325a();

            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a$n$h$a, reason: collision with other inner class name */
            public static final class C0325a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return h.f18311a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i) {
                    return new h[i];
                }
            }

            public h() {
                super(null);
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

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n() {
        }
    }

    public static final class o implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18312a;

        public final String b() {
            return this.f18312a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && kotlin.jvm.internal.f.b(this.f18312a, ((o) obj).f18312a);
        }

        public int hashCode() {
            return this.f18312a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("SuccessEvent(resultToken="), this.f18312a, ')');
        }
    }

    public static final class q implements StartCallback {
        public q() {
        }
    }

    public static final class r implements com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b {
        public r() {
        }
    }

    public static final class t extends Lambda implements InterfaceC0646l<Throwable, p> {
        public t() {
            super(1);
        }

        public final void a(Throwable th) {
            if (!(th instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.h)) {
                a.a(a.this, th, null, null, null, null, 30, null);
                return;
            }
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.a("SNSEidMain", "Error starting auth. Restarting. " + th.getMessage(), null, 4, null);
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.h hVar = (com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.h) th;
            a.this.a(hVar.e(), hVar.d());
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(Throwable th) {
            a(th);
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.SNSEidMainViewModel$onNfcDisabled$1", f = "SNSEidMainViewModel.kt", l = {795, 796, 797, 798}, m = "invokeSuspend")
    public static final class w extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18316a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18317b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18318c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18319d;

        /* renamed from: e, reason: collision with root package name */
        public int f18320e;

        public w(T9.a<? super w> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((w) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new w(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class x implements com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.c {
        public x() {
        }
    }

    public static final class y implements UnblockerCallback {
        public y() {
        }
    }

    public static final class z implements StartCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f18324a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18326c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18327d;

        public z(String str, String str2) {
            this.f18326c = str;
            this.f18327d = str2;
            this.f18324a = a.this.f18227A;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "legalInfo", "getLegalInfo()Ljava/lang/CharSequence;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(a.class, "step", "getStep()Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/main/SNSEidMainViewModel$Step;", 0);
        iVar.getClass();
        f18225G = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2};
        f18224F = new d(null);
        f18226N = n.e.f18308a;
    }

    public a(String str, String str2, String str3, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f18232q = str;
        this.f18233r = str2;
        this.f18234s = str3;
        this.f18235t = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_LEGAL_INFO", null);
        n.e eVar = f18226N;
        this.f18236u = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_EID_STEP", eVar);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f18237v = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f18238w = MutableStateFlow2;
        StateFlow<n> c2 = g10.c(eVar, "KEY_EID_STEP");
        this.f18239x = c2;
        n t3 = t();
        if (kotlin.jvm.internal.f.b(t3, n.h.f18311a) || kotlin.jvm.internal.f.b(t3, n.d.f18307a) || kotlin.jvm.internal.f.b(t3, n.g.f18310a)) {
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Init state is scanning, aborting scan", null, 4, null);
            a(q.c.f15162b);
        }
        this.f18241z = FlowKt.stateIn(FlowKt.combine(c2, MutableStateFlow, MutableStateFlow2, new e0(null)), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), b.c.f18343b);
        this.f18227A = new q();
        this.f18228B = new r();
        this.f18229C = new x();
        this.f18230D = new y();
        this.f18231E = new t();
    }

    public final void A() {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "On NFC disabled", null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new w(null), 3, null);
    }

    public final Job C() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new b0(null), 3, null);
        return launch$default;
    }

    public final Job D() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new c0(null), 3, null);
        return launch$default;
    }

    public final void E() {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Reset", null, 4, null);
        c(f18226N);
    }

    public final void c(n nVar) {
        this.f18236u.a(this, f18225G[1], nVar);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public String f() {
        return DocumentType.f15255l;
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "ViewModel cleared", null, 4, null);
    }

    public final void p() {
        c(false);
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Cancel pin change", null, 4, null);
        a(a.C0300a.f18184a);
        c(n.e.f18308a);
    }

    public final void q() {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Cancel pin unlocking", null, 4, null);
        a(a.b.f18185a);
        c(n.b.f18305a);
    }

    public final void r() {
        c(false);
        this.f18237v.setValue(0);
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Cancel reading", null, 4, null);
        c(n.b.f18305a);
        a(a.c.f18186a);
    }

    public final CharSequence s() {
        return (CharSequence) this.f18235t.a(this, f18225G[0]);
    }

    public final n t() {
        return (n) this.f18236u.a(this, f18225G[1]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public StateFlow<com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b> j() {
        return this.f18241z;
    }

    public final void b(String str, String str2) {
        Can can = null;
        if (str == null) {
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Start reading, card pin is null. Aborting.", null, 4, null);
            return;
        }
        this.f18237v.setValue(0);
        c(false);
        StringBuilder sb2 = new StringBuilder("Start reading, canIsNull=");
        sb2.append(str2 == null || C0969n.i0(str2));
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", sb2.toString(), null, 4, null);
        c(n.h.f18311a);
        try {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                arrayList.add(Integer.valueOf(j3.e.m(str.charAt(i9))));
            }
            Pin pin = new Pin(s.b0(arrayList));
            if (str2 != null) {
                ArrayList arrayList2 = new ArrayList(str2.length());
                for (int i10 = 0; i10 < str2.length(); i10++) {
                    arrayList2.add(Integer.valueOf(j3.e.m(str2.charAt(i10))));
                }
                can = new Can(s.b0(arrayList2));
            }
            a(new a.d(pin, can, this.f18228B, this.f18231E));
        } catch (Exception e10) {
            com.sumsub.sns.core.presentation.base.a.a(this, e10, f(), (Object) null, 4, (Object) null);
        }
    }

    public final void c(boolean z10) {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Set scanning state: " + z10, null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new a0(z10, this, null), 3, null);
    }

    public final void c(String str) {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "On puk entered", null, 4, null);
        if (str == null || C0969n.i0(str)) {
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "PUK is null or blank", null, 4, null);
            return;
        }
        this.f18237v.setValue(0);
        c(n.g.f18310a);
        try {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                arrayList.add(Integer.valueOf(j3.e.m(str.charAt(i9))));
            }
            a(new a.f(new Puk(s.b0(arrayList)), this.f18230D, this.f18231E));
        } catch (Exception e10) {
            com.sumsub.sns.core.presentation.base.a.a(this, e10, f(), (Object) null, 4, (Object) null);
        }
    }

    public final void a(String str, String str2) {
        this.f18237v.setValue(0);
        a(new z(str, str2));
    }

    public static /* synthetic */ void a(a aVar, StartCallback startCallback, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            startCallback = aVar.f18227A;
        }
        aVar.a(startCallback);
    }

    public final void a(StartCallback startCallback) {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Start", null, 4, null);
        b(true);
        String str = this.f18232q;
        if (str == null) {
            com.sumsub.sns.core.presentation.base.a.a(this, new IllegalStateException("No mobile token"), f(), (Object) null, 4, (Object) null);
            return;
        }
        if (this.f18234s == null) {
            com.sumsub.sns.core.presentation.base.a.a(this, new IllegalStateException("No hash"), f(), (Object) null, 4, (Object) null);
        } else if (this.f18233r == null) {
            com.sumsub.sns.core.presentation.base.a.a(this, new IllegalStateException("No url"), f(), (Object) null, 4, (Object) null);
        } else {
            a(new a.g(str, new URL(this.f18233r), this.f18234s, startCallback, this.f18231E));
        }
    }

    public static /* synthetic */ Screen b(a aVar, n nVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            nVar = aVar.t();
        }
        return aVar.b(nVar);
    }

    public final Screen b(n nVar) {
        if (kotlin.jvm.internal.f.b(nVar, n.e.f18308a)) {
            return Screen.EidPinSelection;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.b.f18305a)) {
            return Screen.EidIdentInfo;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.d.f18307a)) {
            return Screen.EidNfcScan;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.c.f18306a)) {
            return Screen.EidPinChangeSuccess;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.h.f18311a)) {
            return Screen.EidNfcScan;
        }
        if (nVar instanceof n.C0317a) {
            return Screen.EidCanRequired;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.g.f18310a)) {
            return Screen.EidNfcScan;
        }
        if (kotlin.jvm.internal.f.b(nVar, n.f.f18309a)) {
            return Screen.EidUnlockSuccess;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(String str, String str2, String str3, String str4) {
        Can can;
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "On pin change ready", null, 4, null);
        if (str == null || C0969n.i0(str) || str2 == null || C0969n.i0(str2)) {
            return;
        }
        c(false);
        this.f18237v.setValue(0);
        c(n.d.f18307a);
        try {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                arrayList.add(Integer.valueOf(j3.e.m(str.charAt(i9))));
            }
            TPin tPin = new TPin(s.b0(arrayList));
            ArrayList arrayList2 = new ArrayList(str2.length());
            for (int i10 = 0; i10 < str2.length(); i10++) {
                arrayList2.add(Integer.valueOf(j3.e.m(str2.charAt(i10))));
            }
            Pin pin = new Pin(s.b0(arrayList2));
            if (str3 != null) {
                ArrayList arrayList3 = new ArrayList(str3.length());
                for (int i11 = 0; i11 < str3.length(); i11++) {
                    arrayList3.add(Integer.valueOf(j3.e.m(str3.charAt(i11))));
                }
                can = new Can(s.b0(arrayList3));
            } else {
                can = null;
            }
            a(new a.e(tPin, pin, can, str4 != null ? C0966k.S(str4) : null, this.f18229C, this.f18231E));
        } catch (Exception e10) {
            com.sumsub.sns.core.presentation.base.a.a(this, e10, f(), (Object) null, 4, (Object) null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        if (oVar.c() instanceof i) {
            a((i) oVar.c());
        } else {
            super.b(oVar);
        }
    }

    public final void a(String str, boolean z10) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "On pin entered, need can: " + z10, null, 4, null);
        if (str == null) {
            return;
        }
        if (z10) {
            c(new n.C0317a(new i.g(str), false, 2, defaultConstructorMarker));
        } else {
            b(str, null);
        }
    }

    public final void a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a aVar) {
        a(new b(aVar));
    }

    public final void a(SecretWrong secretWrong) {
        boolean z10 = secretWrong == SecretWrong.CAN_WRONG_CAN_PIN_REQUIRED || secretWrong == SecretWrong.PIN_WRONG_ONE_PIN_TRY_LEFT_CAN_PIN_REQUIRED;
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Request pin enter, triesLeft=" + secretWrong + ", needCan=" + z10, null, 4, null);
        a(new g(z10));
    }

    public final void a(i iVar) {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "On action " + iVar, null, 4, null);
        if (iVar == null) {
            return;
        }
        if (iVar instanceof i.l) {
            D();
            return;
        }
        if (iVar instanceof i.k) {
            C();
            return;
        }
        if (iVar instanceof i.m) {
            E();
            return;
        }
        if (iVar instanceof i.f) {
            a(this, (StartCallback) null, 1, (Object) null);
            return;
        }
        if (iVar instanceof i.d) {
            a(c.f18253a);
            return;
        }
        if (iVar instanceof i.C0302a) {
            p();
            return;
        }
        if (iVar instanceof i.c) {
            r();
            return;
        }
        if (iVar instanceof i.j) {
            a(h.f18276a);
            return;
        }
        if (iVar instanceof i.b) {
            q();
            return;
        }
        if (iVar instanceof i.C0311i) {
            a(((i.C0311i) iVar).b());
            return;
        }
        if (iVar instanceof i.g) {
            a(new e(((i.g) iVar).b()));
            return;
        }
        if (iVar instanceof i.h) {
            i.h hVar = (i.h) iVar;
            a(new f(hVar.f(), hVar.e(), hVar.d()));
        } else if (iVar instanceof i.e) {
            this.f18240y = true;
            com.sumsub.sns.core.presentation.base.a.a(this, (com.sumsub.sns.internal.core.common.q) null, (Object) null, (Long) null, 7, (Object) null);
        }
    }

    public final boolean a(com.sumsub.sns.internal.core.common.q qVar) {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidMain", "Try finish, reason=" + qVar, null, 4, null);
        if (!(qVar instanceof q.c) || this.f18240y) {
            return true;
        }
        n t3 = t();
        if (kotlin.jvm.internal.f.b(t3, n.e.f18308a)) {
            return true;
        }
        if (kotlin.jvm.internal.f.b(t3, n.b.f18305a) || (t3 instanceof n.C0317a) || kotlin.jvm.internal.f.b(t3, n.c.f18306a) || kotlin.jvm.internal.f.b(t3, n.f.f18309a)) {
            c(f18226N);
        } else if (kotlin.jvm.internal.f.b(t3, n.h.f18311a)) {
            r();
        } else if (kotlin.jvm.internal.f.b(t3, n.d.f18307a)) {
            p();
        } else if (kotlin.jvm.internal.f.b(t3, n.g.f18310a)) {
            q();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public static /* synthetic */ Map a(a aVar, n nVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            nVar = aVar.t();
        }
        return aVar.a(nVar);
    }

    public final Map<String, Object> a(n nVar) {
        if (nVar instanceof n.C0317a) {
            return com.google.android.gms.measurement.internal.a.n("reason", "eidCanRequired");
        }
        return kotlin.collections.a.p();
    }

    public static /* synthetic */ void a(a aVar, Throwable th, String str, String str2, String str3, i iVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = "sns_eid_error_title";
        }
        String str4 = str;
        String str5 = (i9 & 4) != 0 ? null : str2;
        String str6 = (i9 & 8) != 0 ? null : str3;
        if ((i9 & 16) != 0) {
            iVar = i.m.f18291a;
        }
        aVar.a(th, str4, str5, str6, iVar);
    }

    public final void a(Throwable th, String str, String str2, String str3, i iVar) {
        this.f18237v.setValue(0);
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.a("SNSEidMain", "Error " + th, null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new d0(str, str2, str3, th, iVar, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(com.sumsub.sns.internal.core.data.model.o oVar) {
        if (oVar.b() instanceof com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.f) {
            if (((com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.f) oVar.b()).a()) {
                a(i.e.f18281a);
                return;
            } else {
                E();
                return;
            }
        }
        super.a(oVar);
    }
}
