package com.sumsub.sns.internal.core.common;

import V9.d;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class e1 {

    @d(c = "com.sumsub.sns.internal.core.common.WebSocketFlowKt$webSocketFlow$1", f = "WebSocketFlow.kt", l = {109, 96}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<ProducerScope<? super String>, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15105a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15106b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15107c;

        /* renamed from: d, reason: collision with root package name */
        public int f15108d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15109e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f15110f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ va.h f15111g;

        /* renamed from: com.sumsub.sns.internal.core.common.e1$a$a, reason: collision with other inner class name */
        public static final class C0195a extends va.m {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<State> f15112a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<T9.a<O9.p>> f15113b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<String> f15114c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0195a(Ref$ObjectRef<State> ref$ObjectRef, Ref$ObjectRef<T9.a<O9.p>> ref$ObjectRef2, ProducerScope<? super String> producerScope) {
                this.f15112a = ref$ObjectRef;
                this.f15113b = ref$ObjectRef2;
                this.f15114c = producerScope;
            }

            @Override // va.m
            public void onClosed(va.l lVar, int i, String str) {
                c.b(c.f14016a, "webSocketFlow", "WebSocketListener.onClosed: code=" + i + " reason=" + str, null, 4, null);
                SendChannel.DefaultImpls.close$default(this.f15114c.getChannel(), null, 1, null);
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
            
                if (kotlinx.coroutines.JobKt.isActive(r8) == true) goto L10;
             */
            /* JADX WARN: Type inference failed for: r9v6, types: [T, com.sumsub.sns.internal.core.common.State] */
            @Override // va.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onFailure(va.l r8, java.lang.Throwable r9, okhttp3.p r10) {
                /*
                    r7 = this;
                    com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.a.f17535a
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r1 = "WebSocketListener.onFailure: \n"
                    r8.<init>(r1)
                    r8.append(r9)
                    r1 = 10
                    r8.append(r1)
                    r8.append(r10)
                    java.lang.String r2 = r8.toString()
                    r4 = 4
                    r5 = 0
                    java.lang.String r1 = "webSocketFlow"
                    r3 = 0
                    com.sumsub.log.logger.Logger.e$default(r0, r1, r2, r3, r4, r5)
                    kotlin.jvm.internal.Ref$ObjectRef<T9.a<O9.p>> r8 = r7.f15113b
                    T r8 = r8.f23179a
                    T9.a r8 = (T9.a) r8
                    if (r8 == 0) goto L36
                    kotlin.coroutines.d r8 = r8.getContext()
                    if (r8 == 0) goto L36
                    boolean r8 = kotlinx.coroutines.JobKt.isActive(r8)
                    r0 = 1
                    if (r8 != r0) goto L36
                    goto L37
                L36:
                    r0 = 0
                L37:
                    kotlin.jvm.internal.Ref$ObjectRef<com.sumsub.sns.internal.core.common.State> r8 = r7.f15112a
                    T r8 = r8.f23179a
                    com.sumsub.sns.internal.core.common.State r8 = (com.sumsub.sns.internal.core.common.State) r8
                    boolean r8 = r8.isDisconnected()
                    if (r8 != 0) goto L71
                    com.sumsub.sns.core.c r1 = com.sumsub.sns.core.c.f14016a
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r2 = "WebSocketListener.onFailure: n"
                    r8.<init>(r2)
                    r8.append(r9)
                    java.lang.String r9 = "\n isActive="
                    r8.append(r9)
                    r8.append(r0)
                    java.lang.String r9 = ",  "
                    r8.append(r9)
                    r8.append(r10)
                    java.lang.String r3 = r8.toString()
                    r5 = 4
                    r6 = 0
                    java.lang.String r2 = "webSocketFlow"
                    r4 = 0
                    com.sumsub.sns.core.c.b(r1, r2, r3, r4, r5, r6)
                    kotlin.jvm.internal.Ref$ObjectRef<com.sumsub.sns.internal.core.common.State> r8 = r7.f15112a
                    com.sumsub.sns.internal.core.common.State r9 = com.sumsub.sns.internal.core.common.State.DISCONNECTING
                    r8.f23179a = r9
                L71:
                    if (r0 == 0) goto L92
                    kotlin.jvm.internal.Ref$ObjectRef<T9.a<O9.p>> r8 = r7.f15113b     // Catch: java.lang.Exception -> L81
                    T r8 = r8.f23179a     // Catch: java.lang.Exception -> L81
                    T9.a r8 = (T9.a) r8     // Catch: java.lang.Exception -> L81
                    if (r8 == 0) goto L8b
                    O9.p r9 = O9.p.f3034a     // Catch: java.lang.Exception -> L81
                    r8.resumeWith(r9)     // Catch: java.lang.Exception -> L81
                    goto L8b
                L81:
                    r8 = move-exception
                    com.sumsub.sns.internal.log.a r9 = com.sumsub.sns.internal.log.a.f17535a
                    java.lang.String r10 = "webSocketFlow"
                    java.lang.String r0 = "Failed to resume"
                    com.sumsub.sns.internal.log.b.b(r9, r10, r0, r8)
                L8b:
                    kotlinx.coroutines.channels.ProducerScope<java.lang.String> r8 = r7.f15114c
                    java.lang.String r9 = ""
                    r8.mo110trySendJP2dKIU(r9)
                L92:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.e1.a.C0195a.onFailure(va.l, java.lang.Throwable, okhttp3.p):void");
            }

            @Override // va.m
            public void onMessage(va.l lVar, String str) {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "webSocketFlow", s3.b.j("WebSocketListener.onMessage: text=", str), null, 4, null);
                c.b(c.f14016a, "webSocketFlow", "onMessage: size=" + str.length(), null, 4, null);
                this.f15114c.mo110trySendJP2dKIU(str);
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [T, com.sumsub.sns.internal.core.common.State] */
            @Override // va.m
            public void onOpen(va.l lVar, okhttp3.p pVar) {
                c.b(c.f14016a, "webSocketFlow", "WebSocketListener.onOpen: " + pVar, null, 4, null);
                this.f15112a.f23179a = State.CONNECTED;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, va.h hVar, T9.a<? super a> aVar) {
            super(2, aVar);
            this.f15110f = str;
            this.f15111g = hVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super String> producerScope, T9.a<? super O9.p> aVar) {
            return ((a) create(producerScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = new a(this.f15110f, this.f15111g, aVar);
            aVar2.f15109e = obj;
            return aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:10:0x006a, B:12:0x0074, B:13:0x0085, B:15:0x008b, B:16:0x008f), top: B:9:0x006a }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:10:0x006a, B:12:0x0074, B:13:0x0085, B:15:0x008b, B:16:0x008f), top: B:9:0x006a }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d1 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:7:0x001c, B:21:0x00c7, B:23:0x00d1, B:24:0x00dd, B:39:0x003e), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v2, types: [T, com.sumsub.sns.internal.core.common.State] */
        /* JADX WARN: Type inference failed for: r6v10, types: [T, kotlinx.coroutines.CancellableContinuationImpl] */
        /* JADX WARN: Type inference failed for: r6v13, types: [T, com.sumsub.sns.internal.core.common.State] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ed -> B:8:0x001f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.e1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Flow<String> a(va.h hVar, String str) {
        return FlowKt.callbackFlow(new a(str, hVar, null));
    }
}
