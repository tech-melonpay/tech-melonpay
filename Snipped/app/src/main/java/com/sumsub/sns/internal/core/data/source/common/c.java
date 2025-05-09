package com.sumsub.sns.internal.core.data.source.common;

import V9.d;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.model.g;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class c implements com.sumsub.sns.internal.core.data.source.common.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.b f16098a;

    /* renamed from: b, reason: collision with root package name */
    public String f16099b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableStateFlow<SNSSDKState> f16100c;

    /* renamed from: d, reason: collision with root package name */
    public final StateFlow<SNSSDKState> f16101d;

    /* renamed from: e, reason: collision with root package name */
    public g f16102e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, ? extends Object> f16103f;

    @d(c = "com.sumsub.sns.internal.core.data.source.common.RealCommonRepository", f = "RealCommonRepository.kt", l = {24}, m = "getActionById")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16104a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16105b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16106c;

        /* renamed from: e, reason: collision with root package name */
        public int f16108e;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16106c = obj;
            this.f16108e |= Integer.MIN_VALUE;
            return c.this.a(null, false, this);
        }
    }

    @d(c = "com.sumsub.sns.internal.core.data.source.common.RealCommonRepository", f = "RealCommonRepository.kt", l = {50}, m = "getClientIntegrationSettings")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16109a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16110b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16111c;

        /* renamed from: e, reason: collision with root package name */
        public int f16113e;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16111c = obj;
            this.f16113e |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(com.sumsub.sns.internal.core.data.source.common.b bVar) {
        this.f16098a = bVar;
        MutableStateFlow<SNSSDKState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f16100c = MutableStateFlow;
        this.f16101d = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.sumsub.sns.internal.core.data.source.common.a
    public String a() {
        return this.f16099b;
    }

    @Override // com.sumsub.sns.internal.core.data.source.common.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public StateFlow<SNSSDKState> b() {
        return this.f16101d;
    }

    @Override // com.sumsub.sns.internal.core.data.source.common.a
    public void a(String str) {
        this.f16099b = str;
    }

    @Override // com.sumsub.sns.internal.core.data.source.common.a
    public Object c(T9.a<? super Locale> aVar) {
        return e0.f15081a.getLocale();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.common.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r11, boolean r12, T9.a<? super com.sumsub.sns.internal.core.data.model.g> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.core.data.source.common.c.a
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.core.data.source.common.c$a r0 = (com.sumsub.sns.internal.core.data.source.common.c.a) r0
            int r1 = r0.f16108e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16108e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.common.c$a r0 = new com.sumsub.sns.internal.core.data.source.common.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f16106c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16108e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.f16105b
            com.sumsub.sns.internal.core.data.source.common.c r11 = (com.sumsub.sns.internal.core.data.source.common.c) r11
            java.lang.Object r12 = r0.f16104a
            com.sumsub.sns.internal.core.data.source.common.c r12 = (com.sumsub.sns.internal.core.data.source.common.c) r12
            kotlin.b.b(r13)
            goto L76
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.b.b(r13)
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to get an action("
            r13.<init>(r2)
            r13.append(r11)
            java.lang.String r2 = "). Force flag is "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r6 = r13.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            com.sumsub.log.logger.Logger.d$default(r4, r5, r6, r7, r8, r9)
            com.sumsub.sns.internal.core.data.model.g r13 = r10.f16102e
            if (r13 == 0) goto L65
            if (r12 == 0) goto L63
            goto L65
        L63:
            r12 = r10
            goto L7e
        L65:
            com.sumsub.sns.internal.core.data.source.common.b r12 = r10.f16098a
            r0.f16104a = r10
            r0.f16105b = r10
            r0.f16108e = r3
            java.lang.Object r13 = r12.a(r11, r0)
            if (r13 != r1) goto L74
            return r1
        L74:
            r11 = r10
            r12 = r11
        L76:
            com.sumsub.sns.internal.core.data.model.remote.response.d$c$d r13 = (com.sumsub.sns.internal.core.data.model.remote.response.d.c.C0219d) r13
            com.sumsub.sns.internal.core.data.model.g r13 = com.sumsub.sns.internal.core.data.model.remote.response.e.b(r13)
            r11.f16102e = r13
        L7e:
            com.sumsub.sns.internal.core.data.model.g r11 = r12.f16102e
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.common.c.a(java.lang.String, boolean, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.data.source.common.a
    public void a(SNSSDKState sNSSDKState) {
        SNSSDKState value = this.f16100c.getValue();
        if (f.b(value, sNSSDKState)) {
            return;
        }
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "The SDK state was changed: " + value + " -> " + sNSSDKState, null, 4, null);
        if (value != null) {
            try {
                SNSStateChangedHandler stateChangedHandler = e0.f15081a.getStateChangedHandler();
                if (stateChangedHandler != null) {
                    stateChangedHandler.onStateChanged(value, sNSSDKState);
                }
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a10 = com.sumsub.sns.internal.log.c.a(this);
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(a10, message, e10);
            }
        }
        e0.f15081a.a(sNSSDKState);
        this.f16100c.setValue(sNSSDKState);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.core.data.source.common.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T9.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.core.data.source.common.c.b
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.core.data.source.common.c$b r0 = (com.sumsub.sns.internal.core.data.source.common.c.b) r0
            int r1 = r0.f16113e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16113e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.common.c$b r0 = new com.sumsub.sns.internal.core.data.source.common.c$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16111c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16113e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f16110b
            com.sumsub.sns.internal.core.data.source.common.c r1 = (com.sumsub.sns.internal.core.data.source.common.c) r1
            java.lang.Object r0 = r0.f16109a
            com.sumsub.sns.internal.core.data.source.common.c r0 = (com.sumsub.sns.internal.core.data.source.common.c) r0
            kotlin.b.b(r5)
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.b.b(r5)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r5 = r4.f16103f
            if (r5 != 0) goto L54
            com.sumsub.sns.internal.core.data.source.common.b r5 = r4.f16098a
            r0.f16109a = r4
            r0.f16110b = r4
            r0.f16113e = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
            r1 = r0
        L4f:
            java.util.Map r5 = (java.util.Map) r5
            r1.f16103f = r5
            goto L55
        L54:
            r0 = r4
        L55:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r5 = r0.f16103f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.common.c.a(T9.a):java.lang.Object");
    }
}
