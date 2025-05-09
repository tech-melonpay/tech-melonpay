package com.sumsub.sns.internal.log.cacher;

import O9.p;
import ca.InterfaceC0650p;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class e<T> implements com.sumsub.sns.internal.log.cacher.b, com.sumsub.sns.internal.log.cacher.c<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f17550d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.log.cacher.a<T> f17551a;

    /* renamed from: b, reason: collision with root package name */
    public File f17552b;

    /* renamed from: c, reason: collision with root package name */
    public String f17553c = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.log.cacher.SinkWrapper$processDir$2", f = "SinkCache.kt", l = {69}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17554a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17555b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17556c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17557d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17558e;

        /* renamed from: f, reason: collision with root package name */
        public int f17559f;

        /* renamed from: g, reason: collision with root package name */
        public int f17560g;

        /* renamed from: h, reason: collision with root package name */
        public int f17561h;
        public final /* synthetic */ e<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, T9.a<? super b> aVar) {
            super(2, aVar);
            this.i = eVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new b(this.i, aVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0240, code lost:
        
            if (r4 != null) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x023b, code lost:
        
            r15.append(r5);
            com.sumsub.sns.internal.log.b.b(r13, r14, r15.toString(), null, 4, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0179 A[Catch: all -> 0x0036, Exception -> 0x0039, TRY_ENTER, TryCatch #1 {Exception -> 0x0039, blocks: (B:7:0x002f, B:9:0x016f, B:12:0x0179, B:16:0x00fa, B:18:0x0106, B:25:0x014f, B:36:0x01b4), top: B:6:0x002f, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00f8 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:7:0x002f, B:9:0x016f, B:12:0x0179, B:13:0x023b, B:15:0x00f8, B:16:0x00fa, B:18:0x0106, B:25:0x014f, B:30:0x0242, B:36:0x01b4, B:38:0x01eb, B:42:0x0227, B:43:0x022b, B:49:0x004c, B:51:0x0054, B:53:0x005c, B:58:0x00b2, B:60:0x00b9, B:61:0x00bc, B:63:0x00c0, B:65:0x00f0), top: B:2:0x000e, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01b4 A[Catch: all -> 0x0036, Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:7:0x002f, B:9:0x016f, B:12:0x0179, B:16:0x00fa, B:18:0x0106, B:25:0x014f, B:36:0x01b4), top: B:6:0x002f, outer: #0 }] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Random, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x016c -> B:9:0x016f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 682
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.log.cacher.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.log.cacher.SinkWrapper", f = "SinkCache.kt", l = {91, 95}, m = "send")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17562a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17563b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17564c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17565d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f17566e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e<T> f17567f;

        /* renamed from: g, reason: collision with root package name */
        public int f17568g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e<T> eVar, T9.a<? super c> aVar) {
            super(aVar);
            this.f17567f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17566e = obj;
            this.f17568g |= Integer.MIN_VALUE;
            return this.f17567f.send(null, this);
        }
    }

    public e(com.sumsub.sns.internal.log.cacher.a<T> aVar, File file) {
        this.f17551a = aVar;
        String valueOf = String.valueOf(aVar.getClass().getName().hashCode());
        try {
            File file2 = new File(file, valueOf);
            file2.mkdirs();
            this.f17552b = file2;
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a.f17535a.e("SinkWrapper" + this.f17553c, "Can't open cache directory " + valueOf, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(10:11|12|13|14|15|16|(1:18)(1:23)|19|20|21)(2:32|33))(1:34))(2:55|(1:57)(1:58))|35|(6:37|38|39|40|41|(1:43)(6:44|14|15|16|(0)(0)|19))|20|21))|65|6|7|(0)(0)|35|(0)|20|21|(2:(1:28)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e0, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d9, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: Exception -> 0x00d9, IOException -> 0x00dc, FileNotFoundException -> 0x00df, TryCatch #6 {FileNotFoundException -> 0x00df, IOException -> 0x00dc, Exception -> 0x00d9, blocks: (B:16:0x00cb, B:18:0x00d4, B:19:0x00e3, B:30:0x00f8, B:31:0x00fb), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T9.a, com.sumsub.sns.internal.log.cacher.e$c] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.sumsub.sns.internal.log.cacher.a<T>, com.sumsub.sns.internal.log.cacher.c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.sumsub.sns.internal.log.cacher.a, com.sumsub.sns.internal.log.cacher.a<T>] */
    @Override // com.sumsub.sns.internal.log.cacher.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object send(T r14, T9.a<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.log.cacher.e.send(java.lang.Object, T9.a):java.lang.Object");
    }

    public final String a() {
        return this.f17553c;
    }

    public final void a(String str) {
        this.f17553c = str;
    }

    @Override // com.sumsub.sns.internal.log.cacher.b
    public Object a(T9.a<? super p> aVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new b(this, null), aVar);
        return withContext == CoroutineSingletons.f23158a ? withContext : p.f3034a;
    }
}
