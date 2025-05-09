package com.sumsub.sns.internal.geo.presentation;

import O9.p;
import android.location.Location;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Action;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.geo.presentation.e;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class c extends com.sumsub.sns.core.presentation.base.a<com.sumsub.sns.internal.geo.presentation.e> implements com.sumsub.sns.internal.core.presentation.form.b {

    /* renamed from: q, reason: collision with root package name */
    public static final b f17407q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f17408r;

    /* renamed from: M, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f17409M;

    /* renamed from: N, reason: collision with root package name */
    public final com.sumsub.sns.internal.geo.domain.b f17410N;

    /* renamed from: O, reason: collision with root package name */
    public final com.sumsub.sns.internal.geo.domain.c f17411O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f17412P;

    /* renamed from: Q, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.b f17413Q;
    public final Document R;
    public final com.sumsub.sns.internal.core.presentation.form.d S;
    public final String[] T;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a U;
    public int V;
    public final MutableStateFlow<b.a> W;

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$1", f = "SNSGeoViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17414a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17415b;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super p> aVar) {
            return ((a) create(eVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = c.this.new a(aVar);
            aVar2.f17415b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17414a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.geo.presentation.e eVar = (com.sumsub.sns.internal.geo.presentation.e) this.f17415b;
            if (eVar instanceof e.d) {
                MutableStateFlow mutableStateFlow = c.this.W;
                CharSequence d10 = eVar.d();
                String obj2 = d10 != null ? d10.toString() : null;
                CharSequence c2 = eVar.c();
                mutableStateFlow.setValue(new b.a(0, Collections.singletonList(new b.C0241b(0, obj2, c2 != null ? c2.toString() : null, ((e.d) eVar).g())), null, new b.c(null, null, 3, null)));
            }
            return p.f3034a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel", f = "SNSGeoViewModel.kt", l = {78, 79, 80, 82, 83}, m = "enableLocationAccessState")
    /* renamed from: com.sumsub.sns.internal.geo.presentation.c$c, reason: collision with other inner class name */
    public static final class C0262c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17417a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17418b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17419c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17420d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17421e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f17422f;

        /* renamed from: h, reason: collision with root package name */
        public int f17424h;

        public C0262c(T9.a<? super C0262c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17422f = obj;
            this.f17424h |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$handlePermissionResults$1", f = "SNSGeoViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17425a;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
            return ((d) create(eVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new d(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17425a;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = c.this;
                this.f17425a = 1;
                obj = cVar.e(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$handlePermissionResults$2", f = "SNSGeoViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17427a;

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
            return ((e) create(eVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new e(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f17427a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return e.C0265e.f17531e;
        }
    }

    public static final class f implements com.sumsub.sns.internal.core.presentation.form.d {
        public f() {
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.d
        public String a(String str, String str2) {
            Object obj;
            Iterator it = c.this.p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                FieldName q10 = ((com.sumsub.sns.internal.geo.model.a) obj).c().q();
                if (kotlin.jvm.internal.f.b(q10 != null ? q10.getValue() : null, str2)) {
                    break;
                }
            }
            com.sumsub.sns.internal.geo.model.a aVar = (com.sumsub.sns.internal.geo.model.a) obj;
            if (aVar != null) {
                return aVar.d();
            }
            return null;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onEnableLocationAccessConfirmed$1", f = "SNSGeoViewModel.kt", l = {441, 442, 443}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17429a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17430b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17431c;

        /* renamed from: d, reason: collision with root package name */
        public int f17432d;

        /* renamed from: e, reason: collision with root package name */
        public int f17433e;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new g(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r8.f17433e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L42
                if (r1 == r4) goto L38
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                int r0 = r8.f17432d
                java.lang.Object r1 = r8.f17431c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r8.f17430b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r8.f17429a
                com.sumsub.sns.internal.geo.presentation.c r3 = (com.sumsub.sns.internal.geo.presentation.c) r3
                kotlin.b.b(r9)
                goto L8d
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                int r1 = r8.f17432d
                java.lang.Object r3 = r8.f17430b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r8.f17429a
                com.sumsub.sns.internal.geo.presentation.c r4 = (com.sumsub.sns.internal.geo.presentation.c) r4
                kotlin.b.b(r9)
                goto L71
            L38:
                int r4 = r8.f17432d
                java.lang.Object r1 = r8.f17429a
                com.sumsub.sns.internal.geo.presentation.c r1 = (com.sumsub.sns.internal.geo.presentation.c) r1
                kotlin.b.b(r9)
                goto L56
            L42:
                kotlin.b.b(r9)
                com.sumsub.sns.internal.geo.presentation.c r1 = com.sumsub.sns.internal.geo.presentation.c.this
                r8.f17429a = r1
                r8.f17432d = r4
                r8.f17433e = r4
                java.lang.String r9 = "sns_alert_lackOfLocationPermissions"
                java.lang.Object r9 = com.sumsub.sns.internal.geo.presentation.c.a(r1, r9, r8)
                if (r9 != r0) goto L56
                return r0
            L56:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                com.sumsub.sns.internal.geo.presentation.c r5 = com.sumsub.sns.internal.geo.presentation.c.this
                r8.f17429a = r1
                r8.f17430b = r9
                r8.f17432d = r4
                r8.f17433e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = com.sumsub.sns.internal.geo.presentation.c.a(r5, r3, r8)
                if (r3 != r0) goto L6b
                return r0
            L6b:
                r6 = r3
                r3 = r9
                r9 = r6
                r7 = r4
                r4 = r1
                r1 = r7
            L71:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                com.sumsub.sns.internal.geo.presentation.c r5 = com.sumsub.sns.internal.geo.presentation.c.this
                r8.f17429a = r4
                r8.f17430b = r3
                r8.f17431c = r9
                r8.f17432d = r1
                r8.f17433e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = com.sumsub.sns.internal.geo.presentation.c.a(r5, r2, r8)
                if (r2 != r0) goto L88
                return r0
            L88:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r3
                r3 = r4
            L8d:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                com.sumsub.sns.core.presentation.base.a$n r4 = new com.sumsub.sns.core.presentation.base.a$n
                r4.<init>(r0, r2, r1, r9)
                com.sumsub.sns.internal.geo.presentation.c.a(r3, r4)
                O9.p r9 = O9.p.f3034a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onLocationDisabled$1", f = "SNSGeoViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17435a;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
            return ((h) create(eVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new h(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17435a;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = c.this;
                this.f17435a = 1;
                obj = cVar.e(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onPrepare$2", f = "SNSGeoViewModel.kt", l = {139}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17437a;

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
            return ((i) create(eVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new i(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17437a;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = c.this;
                this.f17437a = 1;
                obj = cVar.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onRequestLocationAccessConfirmed$1", f = "SNSGeoViewModel.kt", l = {428, 429, 430}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17439a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17440b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17441c;

        /* renamed from: d, reason: collision with root package name */
        public int f17442d;

        /* renamed from: e, reason: collision with root package name */
        public int f17443e;

        public j(T9.a<? super j> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((j) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new j(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r7.f17443e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L42
                if (r1 == r4) goto L38
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                int r0 = r7.f17442d
                java.lang.Object r1 = r7.f17441c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r7.f17440b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r7.f17439a
                com.sumsub.sns.internal.geo.presentation.c r3 = (com.sumsub.sns.internal.geo.presentation.c) r3
                kotlin.b.b(r8)
                goto L8e
            L22:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2a:
                int r1 = r7.f17442d
                java.lang.Object r3 = r7.f17440b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r7.f17439a
                com.sumsub.sns.internal.geo.presentation.c r4 = (com.sumsub.sns.internal.geo.presentation.c) r4
                kotlin.b.b(r8)
                goto L72
            L38:
                int r1 = r7.f17442d
                java.lang.Object r4 = r7.f17439a
                com.sumsub.sns.internal.geo.presentation.c r4 = (com.sumsub.sns.internal.geo.presentation.c) r4
                kotlin.b.b(r8)
                goto L5a
            L42:
                kotlin.b.b(r8)
                com.sumsub.sns.internal.geo.presentation.c r8 = com.sumsub.sns.internal.geo.presentation.c.this
                r7.f17439a = r8
                r1 = 0
                r7.f17442d = r1
                r7.f17443e = r4
                java.lang.String r4 = "sns_alert_lackOfLocationPermissions"
                java.lang.Object r4 = com.sumsub.sns.internal.geo.presentation.c.a(r8, r4, r7)
                if (r4 != r0) goto L57
                return r0
            L57:
                r6 = r4
                r4 = r8
                r8 = r6
            L5a:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.geo.presentation.c r5 = com.sumsub.sns.internal.geo.presentation.c.this
                r7.f17439a = r4
                r7.f17440b = r8
                r7.f17442d = r1
                r7.f17443e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = com.sumsub.sns.internal.geo.presentation.c.a(r5, r3, r7)
                if (r3 != r0) goto L6f
                return r0
            L6f:
                r6 = r3
                r3 = r8
                r8 = r6
            L72:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.internal.geo.presentation.c r5 = com.sumsub.sns.internal.geo.presentation.c.this
                r7.f17439a = r4
                r7.f17440b = r3
                r7.f17441c = r8
                r7.f17442d = r1
                r7.f17443e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = com.sumsub.sns.internal.geo.presentation.c.a(r5, r2, r7)
                if (r2 != r0) goto L89
                return r0
            L89:
                r0 = r1
                r1 = r8
                r8 = r2
                r2 = r3
                r3 = r4
            L8e:
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                com.sumsub.sns.core.presentation.base.a$n r4 = new com.sumsub.sns.core.presentation.base.a$n
                r4.<init>(r0, r2, r1, r8)
                com.sumsub.sns.internal.geo.presentation.c.a(r3, r4)
                O9.p r8 = O9.p.f3034a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onSendAddressDataClick$1", f = "SNSGeoViewModel.kt", l = {CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 218, 221, BERTags.FLAGS, 230, 233, 276}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17445a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17446b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17447c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17448d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17449e;

        /* renamed from: f, reason: collision with root package name */
        public Object f17450f;

        /* renamed from: g, reason: collision with root package name */
        public Object f17451g;

        /* renamed from: h, reason: collision with root package name */
        public Object f17452h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f17453j;

        /* renamed from: k, reason: collision with root package name */
        public Object f17454k;

        /* renamed from: l, reason: collision with root package name */
        public Object f17455l;

        /* renamed from: m, reason: collision with root package name */
        public int f17456m;

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onSendAddressDataClick$1$1", f = "SNSGeoViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17458a;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((a) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f17458a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return e.c.f17527e;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onSendAddressDataClick$1$3", f = "SNSGeoViewModel.kt", l = {247, 248, 255, 256}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17459a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17460b;

            /* renamed from: c, reason: collision with root package name */
            public Object f17461c;

            /* renamed from: d, reason: collision with root package name */
            public Object f17462d;

            /* renamed from: e, reason: collision with root package name */
            public Object f17463e;

            /* renamed from: f, reason: collision with root package name */
            public Object f17464f;

            /* renamed from: g, reason: collision with root package name */
            public int f17465g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ c f17466h;
            public final /* synthetic */ List<FormItem> i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ List<com.sumsub.sns.internal.geo.presentation.a> f17467j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ com.sumsub.sns.internal.core.data.model.e f17468k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(c cVar, List<? extends FormItem> list, List<com.sumsub.sns.internal.geo.presentation.a> list2, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f17466h = cVar;
                this.i = list;
                this.f17467j = list2;
                this.f17468k = eVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((b) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f17466h, this.i, this.f17467j, this.f17468k, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x010b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00eb A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c4 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 287
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$onSendAddressDataClick$1$4", f = "SNSGeoViewModel.kt", l = {281, 282, 284}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.geo.presentation.c$k$c, reason: collision with other inner class name */
        public static final class C0263c extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17469a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17470b;

            /* renamed from: c, reason: collision with root package name */
            public Object f17471c;

            /* renamed from: d, reason: collision with root package name */
            public int f17472d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f17473e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f17474f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0263c(c cVar, Object obj, T9.a<? super C0263c> aVar) {
                super(2, aVar);
                this.f17473e = cVar;
                this.f17474f = obj;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((C0263c) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new C0263c(this.f17473e, this.f17474f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r7.f17472d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L38
                    if (r1 == r4) goto L34
                    if (r1 == r3) goto L2c
                    if (r1 != r2) goto L24
                    java.lang.Object r0 = r7.f17471c
                    com.sumsub.sns.internal.core.data.model.g$a r0 = (com.sumsub.sns.internal.core.data.model.g.a) r0
                    java.lang.Object r1 = r7.f17470b
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.Object r2 = r7.f17469a
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    kotlin.b.b(r8)
                    r3 = r0
                    r6 = r2
                    r2 = r1
                    r1 = r6
                    goto L8d
                L24:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L2c:
                    java.lang.Object r1 = r7.f17469a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.b.b(r8)
                    goto L6c
                L34:
                    kotlin.b.b(r8)
                    goto L58
                L38:
                    kotlin.b.b(r8)
                    com.sumsub.sns.internal.geo.presentation.c r8 = r7.f17473e
                    java.lang.String r1 = r8.f()
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                    java.lang.String r5 = "sns_step_%s_title"
                    java.lang.String r1 = java.lang.String.format(r5, r1)
                    r7.f17472d = r4
                    java.lang.Object r8 = com.sumsub.sns.internal.geo.presentation.c.a(r8, r1, r7)
                    if (r8 != r0) goto L58
                    return r0
                L58:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    com.sumsub.sns.internal.geo.presentation.c r1 = r7.f17473e
                    r7.f17469a = r8
                    r7.f17472d = r3
                    java.lang.String r3 = "sns_geolocation_preview_subtitle"
                    java.lang.Object r1 = com.sumsub.sns.internal.geo.presentation.c.a(r1, r3, r7)
                    if (r1 != r0) goto L69
                    return r0
                L69:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L6c:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    java.lang.Object r3 = r7.f17474f
                    boolean r4 = r3 instanceof kotlin.Result.Failure
                    if (r4 == 0) goto L75
                    r3 = 0
                L75:
                    com.sumsub.sns.internal.core.data.model.g$a r3 = (com.sumsub.sns.internal.core.data.model.g.a) r3
                    com.sumsub.sns.internal.geo.presentation.c r4 = r7.f17473e
                    r7.f17469a = r1
                    r7.f17470b = r8
                    r7.f17471c = r3
                    r7.f17472d = r2
                    java.lang.String r2 = "sns_geolocation_action_continue"
                    java.lang.Object r2 = com.sumsub.sns.internal.geo.presentation.c.a(r4, r2, r7)
                    if (r2 != r0) goto L8a
                    return r0
                L8a:
                    r6 = r2
                    r2 = r8
                    r8 = r6
                L8d:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    com.sumsub.sns.internal.geo.presentation.e$a r8 = new com.sumsub.sns.internal.geo.presentation.e$a
                    r5 = 0
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.k.C0263c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public k(T9.a<? super k> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new k(aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x028e, code lost:
        
            if (r2 != null) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x036d, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x04de, code lost:
        
            if (r10 != null) goto L198;
         */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0524  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x042c  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x043c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x03ed  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0508 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0509  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0189 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x015e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x03ae  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x036f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02fe A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0333 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0510  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0334 -> B:37:0x008d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 1360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel", f = "SNSGeoViewModel.kt", l = {87, 88, 89, 91, 92}, m = "requestLocationAccessState")
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17475a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17476b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17477c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17478d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17479e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f17480f;

        /* renamed from: h, reason: collision with root package name */
        public int f17482h;

        public l(T9.a<? super l> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17480f = obj;
            this.f17482h |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1", f = "SNSGeoViewModel.kt", l = {314, 316, 326, 329, 366, 369}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17483a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17484b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17485c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17486d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17487e;

        /* renamed from: f, reason: collision with root package name */
        public Object f17488f;

        /* renamed from: g, reason: collision with root package name */
        public Object f17489g;

        /* renamed from: h, reason: collision with root package name */
        public Object f17490h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Location f17491j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ c f17492k;

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1$1", f = "SNSGeoViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17493a;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((a) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f17493a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return e.c.f17527e;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1$3", f = "SNSGeoViewModel.kt", l = {343, 344, 346, 347}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17494a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17495b;

            /* renamed from: c, reason: collision with root package name */
            public Object f17496c;

            /* renamed from: d, reason: collision with root package name */
            public Object f17497d;

            /* renamed from: e, reason: collision with root package name */
            public int f17498e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f17499f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f17499f = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((b) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f17499f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 201
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1$4", f = "SNSGeoViewModel.kt", l = {356, 357, 359}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.geo.presentation.c$m$c, reason: collision with other inner class name */
        public static final class C0264c extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17500a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17501b;

            /* renamed from: c, reason: collision with root package name */
            public int f17502c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f17503d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0264c(c cVar, T9.a<? super C0264c> aVar) {
                super(2, aVar);
                this.f17503d = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((C0264c) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new C0264c(this.f17503d, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r7.f17502c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r4) goto L2c
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r0 = r7.f17501b
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    java.lang.Object r1 = r7.f17500a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.b.b(r8)
                    r2 = r0
                    goto L7a
                L1c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L24:
                    java.lang.Object r1 = r7.f17500a
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    kotlin.b.b(r8)
                    goto L64
                L2c:
                    kotlin.b.b(r8)
                    goto L50
                L30:
                    kotlin.b.b(r8)
                    com.sumsub.sns.internal.geo.presentation.c r8 = r7.f17503d
                    java.lang.String r1 = r8.f()
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                    java.lang.String r5 = "sns_step_%s_title"
                    java.lang.String r1 = java.lang.String.format(r5, r1)
                    r7.f17502c = r4
                    java.lang.Object r8 = com.sumsub.sns.internal.geo.presentation.c.a(r8, r1, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    com.sumsub.sns.internal.geo.presentation.c r1 = r7.f17503d
                    r7.f17500a = r8
                    r7.f17502c = r3
                    java.lang.String r3 = "sns_geolocation_preview_subtitle"
                    java.lang.Object r1 = com.sumsub.sns.internal.geo.presentation.c.a(r1, r3, r7)
                    if (r1 != r0) goto L61
                    return r0
                L61:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L64:
                    java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                    com.sumsub.sns.internal.geo.presentation.c r3 = r7.f17503d
                    r7.f17500a = r1
                    r7.f17501b = r8
                    r7.f17502c = r2
                    java.lang.String r2 = "sns_geolocation_action_continue"
                    java.lang.Object r2 = com.sumsub.sns.internal.geo.presentation.c.a(r3, r2, r7)
                    if (r2 != r0) goto L77
                    return r0
                L77:
                    r6 = r2
                    r2 = r8
                    r8 = r6
                L7a:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    com.sumsub.sns.internal.geo.presentation.e$a r8 = new com.sumsub.sns.internal.geo.presentation.e$a
                    r3 = 0
                    r5 = 0
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.m.C0264c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1$5", f = "SNSGeoViewModel.kt", l = {381, 382, 388}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17504a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17505b;

            /* renamed from: c, reason: collision with root package name */
            public Object f17506c;

            /* renamed from: d, reason: collision with root package name */
            public Object f17507d;

            /* renamed from: e, reason: collision with root package name */
            public Object f17508e;

            /* renamed from: f, reason: collision with root package name */
            public int f17509f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ c f17510g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ List<FormItem> f17511h;
            public final /* synthetic */ List<com.sumsub.sns.internal.geo.presentation.a> i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ com.sumsub.sns.internal.core.data.model.e f17512j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(c cVar, List<? extends FormItem> list, List<com.sumsub.sns.internal.geo.presentation.a> list2, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super d> aVar) {
                super(2, aVar);
                this.f17510g = cVar;
                this.f17511h = list;
                this.i = list2;
                this.f17512j = eVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((d) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new d(this.f17510g, this.f17511h, this.i, this.f17512j, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 227
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.m.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.geo.presentation.SNSGeoViewModel$sendLocation$1$6", f = "SNSGeoViewModel.kt", l = {397, 398, 400, 401}, m = "invokeSuspend")
        public static final class e extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.geo.presentation.e, T9.a<? super com.sumsub.sns.internal.geo.presentation.e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f17513a;

            /* renamed from: b, reason: collision with root package name */
            public Object f17514b;

            /* renamed from: c, reason: collision with root package name */
            public Object f17515c;

            /* renamed from: d, reason: collision with root package name */
            public Object f17516d;

            /* renamed from: e, reason: collision with root package name */
            public int f17517e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f17518f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(c cVar, T9.a<? super e> aVar) {
                super(2, aVar);
                this.f17518f = cVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.sumsub.sns.internal.geo.presentation.e eVar, T9.a<? super com.sumsub.sns.internal.geo.presentation.e> aVar) {
                return ((e) create(eVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new e(this.f17518f, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 201
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Location location, c cVar, T9.a<? super m> aVar) {
            super(2, aVar);
            this.f17491j = location;
            this.f17492k = cVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((m) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new m(this.f17491j, this.f17492k, aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x01d5, code lost:
        
            r7 = r0;
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01df, code lost:
        
            if (r4 == null) goto L54;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0116 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
        /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01be -> B:33:0x01c3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 806
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(c.class, "addressDataCache", "getAddressDataCache()Ljava/util/List;", 0);
        kotlin.jvm.internal.h.f23186a.getClass();
        f17408r = new InterfaceC0840h[]{mutablePropertyReference1Impl};
        f17407q = new b(null);
    }

    public c(G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.geo.domain.b bVar2, com.sumsub.sns.internal.geo.domain.c cVar, boolean z10, com.sumsub.sns.internal.core.domain.b bVar3, Document document) {
        super(aVar, bVar);
        this.f17409M = bVar;
        this.f17410N = bVar2;
        this.f17411O = cVar;
        this.f17412P = z10;
        this.f17413Q = bVar3;
        this.R = document;
        this.S = new f();
        this.T = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        EmptyList emptyList = EmptyList.f23104a;
        this.U = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "addressDataCache", emptyList);
        this.W = StateFlowKt.MutableStateFlow(new b.a(0, emptyList, null, new b.c(null, null, 3, null)));
        a(emptyList);
        b0.b(j(), C0552s.b(this), new a(null));
    }

    public final List<com.sumsub.sns.internal.geo.model.a> p() {
        return (List) this.U.a(this, f17408r[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.c e() {
        return e.c.f17527e;
    }

    public final Document r() {
        return this.R;
    }

    public final String[] s() {
        return this.T;
    }

    public final void t() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g(null), 3, null);
    }

    public final void u() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new h(null), 1, null);
    }

    public final void v() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new j(null), 3, null);
    }

    public final void w() {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "sendAddressData: " + p(), null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        this.V++;
        com.sumsub.sns.internal.core.analytics.l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).l().a(new Pair("attempt", new Integer(this.V)), new Pair("isAuthorized", Boolean.FALSE)), false, 1, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new i(null), 1, null);
        return p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.geo.presentation.e.b> r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.d(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public String f() {
        return this.R.getType().c();
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public StateFlow<b.a> b() {
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super com.sumsub.sns.internal.geo.presentation.e.f> r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.geo.presentation.c.e(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public void b(FormItem formItem, String str) {
        ArrayList arrayList = new ArrayList(p());
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                i9 = -1;
                break;
            }
            FieldName q10 = ((com.sumsub.sns.internal.geo.model.a) it.next()).c().q();
            if (kotlin.jvm.internal.f.b(q10 != null ? q10.getValue() : null, formItem.d().p())) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            return;
        }
        h.d c2 = ((com.sumsub.sns.internal.geo.model.a) arrayList.get(i9)).c();
        if (str == null) {
            str = "";
        }
        arrayList.set(i9, new com.sumsub.sns.internal.geo.model.a(c2, str));
        a(arrayList);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.b
    public com.sumsub.sns.internal.core.presentation.form.d a() {
        return this.S;
    }

    public final void a(List<com.sumsub.sns.internal.geo.model.a> list) {
        this.U.a(this, f17408r[0], list);
    }

    public final void a(Map<String, Boolean> map) {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "handlePermissionResults: " + map, null, 4, null);
        Boolean bool = map.get("android.permission.ACCESS_COARSE_LOCATION");
        Boolean bool2 = Boolean.TRUE;
        if (!kotlin.jvm.internal.f.b(bool, bool2) && !kotlin.jvm.internal.f.b(map.get("android.permission.ACCESS_FINE_LOCATION"), bool2)) {
            com.sumsub.sns.internal.core.analytics.l.a(com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).d().a(new Pair("attempt", Integer.valueOf(this.V)), new Pair("isAuthorized", Boolean.FALSE)), false, 1, null);
            com.sumsub.sns.core.presentation.base.a.a(this, false, new d(null), 1, null);
        } else {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new e(null), 1, null);
        }
    }

    public final void a(Location location) {
        String str;
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "sendLocation: " + location, null, 4, null);
        com.sumsub.sns.internal.core.analytics.j e10 = com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(Action.Geolocation).e();
        Pair pair = new Pair("attempt", Integer.valueOf(this.V));
        Pair pair2 = new Pair("isAuthorized", Boolean.TRUE);
        if (location == null || (str = Float.valueOf(location.getAccuracy()).toString()) == null) {
            str = "N/A";
        }
        com.sumsub.sns.internal.core.analytics.l.a(e10.a(pair, pair2, new Pair("accuracy", str), new Pair("is_mock_geo", String.valueOf(location != null ? Boolean.valueOf(com.sumsub.sns.internal.geo.domain.a.a(location)) : null))), false, 1, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new m(location, this, null), 3, null);
    }

    public final void a(int i9) {
        if (i9 == 0) {
            a(a.f.f14084a);
        } else {
            a(a.g.f14085a);
        }
    }
}
