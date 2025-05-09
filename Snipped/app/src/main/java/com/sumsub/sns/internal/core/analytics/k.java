package com.sumsub.sns.internal.core.analytics;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.common.x;
import ia.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ka.C0956a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1174i;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class k implements com.sumsub.sns.internal.log.cacher.a<List<? extends SNSTrackEvents>> {

    /* renamed from: d, reason: collision with root package name */
    public static final b f14991d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.analythic.b f14992a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0635a<UUID> f14993b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1244a f14994c = x.a(false, 1, null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/sumsub/sns/internal/core/analytics/k$a;", "", "", "sessionId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;[B)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;[BLra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/analytics/k$a;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getSessionId$annotations", "()V", "b", "[B", "()[B", "getData$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final class a {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String sessionId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final byte[] data;

        /* renamed from: com.sumsub.sns.internal.core.analytics.k$a$a, reason: collision with other inner class name */
        public static final class C0191a implements InterfaceC1162A<a> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0191a f14997a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f14998b;

            static {
                C0191a c0191a = new C0191a();
                f14997a = c0191a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.analytics.SNSAnalyticSink.CacheItem", c0191a, 2);
                pluginGeneratedSerialDescriptor.k("sessionId", false);
                pluginGeneratedSerialDescriptor.k(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, false);
                f14998b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
                boolean z10 = true;
                int i = 0;
                String str = null;
                Object obj = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else if (q10 == 0) {
                        str = c2.y(descriptor, 0);
                        i |= 1;
                    } else {
                        if (q10 != 1) {
                            throw new UnknownFieldException(q10);
                        }
                        obj = c2.C(descriptor, 1, C1174i.f26404c, obj);
                        i |= 2;
                    }
                }
                c2.b(descriptor);
                return new a(i, str, (byte[]) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{m0.f26414a, C1174i.f26404c};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f14998b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                a.a(aVar, c2, descriptor);
                c2.b(descriptor);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.analytics.k$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<a> serializer() {
                return C0191a.f14997a;
            }

            public Companion() {
            }
        }

        public /* synthetic */ a(int i, String str, byte[] bArr, i0 i0Var) {
            if (3 != (i & 3)) {
                a0.h(i, 3, C0191a.f14997a.getDescriptor());
                throw null;
            }
            this.sessionId = str;
            this.data = bArr;
        }

        public static final void a(a self, InterfaceC1143c output, pa.f serialDesc) {
            output.x(serialDesc, 0, self.sessionId);
            output.C(serialDesc, 1, C1174i.f26404c, self.data);
        }

        /* renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public a(String str, byte[] bArr) {
            this.sessionId = str;
            this.data = bArr;
        }

        /* renamed from: a, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void d() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.analytics.SNSAnalyticSink$prepareForCache$2", f = "SNSAnalyticSink.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14999a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<SNSTrackEvents> f15001c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OutputStream f15002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<SNSTrackEvents> list, OutputStream outputStream, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f15001c = list;
            this.f15002d = outputStream;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return k.this.new c(this.f15001c, this.f15002d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String uuid;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14999a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            AbstractC1244a abstractC1244a = k.this.f14994c;
            List<SNSTrackEvents> list = this.f15001c;
            Y8.a aVar = abstractC1244a.f27066b;
            int i = ia.l.f21515c;
            ia.l a10 = l.a.a(kotlin.jvm.internal.h.d(SNSTrackEvents.class));
            kotlin.jvm.internal.b a11 = kotlin.jvm.internal.h.a(List.class);
            List singletonList = Collections.singletonList(a10);
            kotlin.jvm.internal.h.f23186a.getClass();
            String b9 = abstractC1244a.b(j3.e.B(aVar, new kotlin.jvm.internal.k(a11, singletonList, null, 0)), list);
            UUID uuid2 = (UUID) k.this.f14993b.invoke();
            if (uuid2 == null || (uuid = uuid2.toString()) == null) {
                return p.f3034a;
            }
            byte[] a12 = k.this.a();
            if (a12 == null) {
                return p.f3034a;
            }
            a aVar2 = new a(uuid, com.sumsub.sns.internal.core.common.k.b(b9.getBytes(C0956a.f23054b), a12));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f15002d);
            try {
                AbstractC1244a abstractC1244a2 = k.this.f14994c;
                outputStreamWriter.write(abstractC1244a2.b(j3.e.B(abstractC1244a2.f27066b, kotlin.jvm.internal.h.d(a.class)), aVar2));
                p pVar = p.f3034a;
                U4.b.d(outputStreamWriter, null);
                return p.f3034a;
            } finally {
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.analytics.SNSAnalyticSink", f = "SNSAnalyticSink.kt", l = {83}, m = "resendFromCache")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15003a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15004b;

        /* renamed from: d, reason: collision with root package name */
        public int f15006d;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15004b = obj;
            this.f15006d |= Integer.MIN_VALUE;
            return k.this.a((InputStream) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.analytics.SNSAnalyticSink", f = "SNSAnalyticSink.kt", l = {43}, m = "send")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15007a;

        /* renamed from: c, reason: collision with root package name */
        public int f15009c;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15007a = obj;
            this.f15009c |= Integer.MIN_VALUE;
            return k.this.a((List<SNSTrackEvents>) null, this);
        }
    }

    public k(com.sumsub.sns.internal.core.data.source.analythic.b bVar, InterfaceC0635a<UUID> interfaceC0635a) {
        this.f14992a = bVar;
        this.f14993b = interfaceC0635a;
    }

    @Override // com.sumsub.sns.internal.log.cacher.c
    public /* bridge */ /* synthetic */ Object send(Object obj, T9.a aVar) {
        return a((List<SNSTrackEvents>) obj, (T9.a<? super Boolean>) aVar);
    }

    @Override // com.sumsub.sns.internal.log.cacher.a
    public /* bridge */ /* synthetic */ Object a(List<? extends SNSTrackEvents> list, OutputStream outputStream, T9.a aVar) {
        return a2((List<SNSTrackEvents>) list, outputStream, (T9.a<? super p>) aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(4:23|(1:25)(1:34)|26|(2:32|33)(2:29|(1:31)))|11|(1:13)(2:17|(1:19))|14|15))|37|6|7|(0)(0)|11|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0029, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        com.sumsub.sns.internal.log.a.f17535a.w("RealAnalyticsRepository", "send failed ", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0024, B:11:0x00a1, B:17:0x00aa, B:29:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.util.List<com.sumsub.sns.core.data.model.SNSTrackEvents> r12, T9.a<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.core.analytics.k.e
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.core.analytics.k$e r0 = (com.sumsub.sns.internal.core.analytics.k.e) r0
            int r1 = r0.f15009c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15009c = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.analytics.k$e r0 = new com.sumsub.sns.internal.core.analytics.k$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f15007a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15009c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L29
            goto La1
        L29:
            r12 = move-exception
            goto Lb2
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            kotlin.b.b(r13)
            ca.a<java.util.UUID> r13 = r11.f14993b
            java.lang.Object r13 = r13.invoke()
            java.util.UUID r13 = (java.util.UUID) r13
            r2 = 0
            if (r13 == 0) goto L47
            java.lang.String r13 = r13.toString()
            goto L48
        L47:
            r13 = r2
        L48:
            byte[] r5 = r11.a()
            if (r13 == 0) goto Lc0
            if (r5 != 0) goto L51
            goto Lc0
        L51:
            sa.a r6 = r11.f14994c     // Catch: java.lang.Throwable -> L29
            Y8.a r7 = r6.f27066b     // Catch: java.lang.Throwable -> L29
            int r8 = ia.l.f21515c     // Catch: java.lang.Throwable -> L29
            java.lang.Class<com.sumsub.sns.core.data.model.SNSTrackEvents> r8 = com.sumsub.sns.core.data.model.SNSTrackEvents.class
            kotlin.jvm.internal.k r8 = kotlin.jvm.internal.h.d(r8)     // Catch: java.lang.Throwable -> L29
            ia.l r8 = ia.l.a.a(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.Class<java.util.List> r9 = java.util.List.class
            kotlin.jvm.internal.b r9 = kotlin.jvm.internal.h.a(r9)     // Catch: java.lang.Throwable -> L29
            java.util.List r8 = java.util.Collections.singletonList(r8)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.i r10 = kotlin.jvm.internal.h.f23186a     // Catch: java.lang.Throwable -> L29
            r10.getClass()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.k r10 = new kotlin.jvm.internal.k     // Catch: java.lang.Throwable -> L29
            r10.<init>(r9, r8, r2, r3)     // Catch: java.lang.Throwable -> L29
            na.b r2 = j3.e.B(r7, r10)     // Catch: java.lang.Throwable -> L29
            java.lang.String r12 = r6.b(r2, r12)     // Catch: java.lang.Throwable -> L29
            java.nio.charset.Charset r2 = ka.C0956a.f23054b     // Catch: java.lang.Throwable -> L29
            byte[] r12 = r12.getBytes(r2)     // Catch: java.lang.Throwable -> L29
            byte[] r12 = com.sumsub.sns.internal.core.common.k.b(r12, r5)     // Catch: java.lang.Throwable -> L29
            okhttp3.o$a r2 = okhttp3.o.Companion     // Catch: java.lang.Throwable -> L29
            java.util.regex.Pattern r5 = okhttp3.i.f24542d     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "application/octet-stream"
            okhttp3.i r5 = okhttp3.i.a.a(r5)     // Catch: java.lang.Throwable -> L29
            r6 = 6
            okhttp3.n r12 = okhttp3.o.a.b(r2, r12, r5, r6)     // Catch: java.lang.Throwable -> L29
            com.sumsub.sns.internal.core.data.source.analythic.b r2 = r11.f14992a     // Catch: java.lang.Throwable -> L29
            r0.f15009c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r13 = r2.a(r13, r12, r0)     // Catch: java.lang.Throwable -> L29
            if (r13 != r1) goto La1
            return r1
        La1:
            com.sumsub.sns.internal.core.data.source.applicant.remote.g r13 = (com.sumsub.sns.internal.core.data.source.applicant.remote.g) r13     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r12 = r13.k()     // Catch: java.lang.Throwable -> L29
            if (r12 != 0) goto Laa
            goto Lbb
        Laa:
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L29
            if (r12 != r4) goto Lbb
            r3 = r4
            goto Lbb
        Lb2:
            com.sumsub.sns.internal.log.a r13 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r0 = "RealAnalyticsRepository"
            java.lang.String r1 = "send failed "
            r13.w(r0, r1, r12)
        Lbb:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        Lc0:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.analytics.k.a(java.util.List, T9.a):java.lang.Object");
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(List<SNSTrackEvents> list, OutputStream outputStream, T9.a<? super p> aVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new c(list, outputStream, null), aVar);
        return withContext == CoroutineSingletons.f23158a ? withContext : p.f3034a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r15.intValue() == 1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[Catch: all -> 0x0030, Exception -> 0x0033, Api -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0088, B:17:0x00dd, B:22:0x0091, B:37:0x00a8, B:26:0x00ae, B:28:0x00b4, B:30:0x00bc, B:32:0x00c2, B:34:0x00ca, B:35:0x00d7), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.io.Closeable, java.io.InputStreamReader, java.io.Reader, java.lang.Object] */
    @Override // com.sumsub.sns.internal.log.cacher.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.io.InputStream r14, T9.a<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.analytics.k.a(java.io.InputStream, T9.a):java.lang.Object");
    }

    public final byte[] a() {
        UUID invoke = this.f14993b.invoke();
        String uuid = invoke != null ? invoke.toString() : null;
        if (uuid != null && uuid.length() != 0) {
            byte[] copyOf = Arrays.copyOf(uuid.getBytes(C0956a.f23054b), 16);
            if (copyOf.length == 0) {
                return copyOf;
            }
            byte[] bArr = new byte[copyOf.length];
            int length = copyOf.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    bArr[length - i] = copyOf[i];
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return bArr;
        }
        com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "RealAnalyticsRepository", "Got empty session id", null, 4, null);
        return null;
    }
}
