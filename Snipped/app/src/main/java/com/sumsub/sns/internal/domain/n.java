package com.sumsub.sns.internal.domain;

import O9.p;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.n.a;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class n<P extends a> extends com.sumsub.sns.internal.core.domain.base.b<List<? extends com.sumsub.sns.internal.core.data.model.remote.k>, P> {

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f16878b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f16879c;

    /* renamed from: d, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16880d;

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadBaseDocumentDataUseCase", f = "UploadBaseDocumentDataUseCase.kt", l = {54}, m = "preProcessDocuments$suspendImpl")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16884a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16885b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16886c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n<P> f16887d;

        /* renamed from: e, reason: collision with root package name */
        public int f16888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n<P> nVar, T9.a<? super b> aVar) {
            super(aVar);
            this.f16887d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16886c = obj;
            this.f16888e |= Integer.MIN_VALUE;
            return n.a(this.f16887d, (List) null, (a) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadBaseDocumentDataUseCase", f = "UploadBaseDocumentDataUseCase.kt", l = {26, 27, 33, 35, 37, 45}, m = "run$suspendImpl")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16889a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16890b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16891c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16892d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f16893e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n<P> f16894f;

        /* renamed from: g, reason: collision with root package name */
        public int f16895g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n<P> nVar, T9.a<? super c> aVar) {
            super(aVar);
            this.f16894f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16893e = obj;
            this.f16895g |= Integer.MIN_VALUE;
            return n.a((n) this.f16894f, (a) null, (T9.a) this);
        }
    }

    public n(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar, com.sumsub.sns.internal.core.data.source.settings.b bVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar3) {
        super(aVar);
        this.f16878b = bVar;
        this.f16879c = bVar2;
        this.f16880d = bVar3;
    }

    public abstract Object a(P p10, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>> aVar);

    public Object a(List<Document> list, P p10, T9.a<? super p> aVar) {
        return a(this, list, p10, aVar);
    }

    public abstract Object b(P p10, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>> aVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(Object obj, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends List<? extends com.sumsub.sns.internal.core.data.model.remote.k>>> aVar) {
        return a((n<P>) obj, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends List<com.sumsub.sns.internal.core.data.model.remote.k>>>) aVar);
    }

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Document f16881a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16882b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16883c;

        public a(Document document, String str, boolean z10) {
            this.f16881a = document;
            this.f16882b = str;
            this.f16883c = z10;
        }

        public final String a() {
            return this.f16882b;
        }

        public final Document b() {
            return this.f16881a;
        }

        public final boolean c() {
            return this.f16883c;
        }

        public /* synthetic */ a(Document document, String str, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(document, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z10);
        }
    }

    public Object a(P p10, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends List<com.sumsub.sns.internal.core.data.model.remote.k>>> aVar) {
        return a((n) this, (a) p10, (T9.a) aVar);
    }

    public final com.sumsub.sns.internal.core.data.source.applicant.b b() {
        return this.f16878b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x005d, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        r0.f16889a = null;
        r0.f16890b = null;
        r0.f16891c = null;
        r0.f16892d = null;
        r0.f16895g = 6;
        r13 = r2.a(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0152, code lost:
    
        if (r13 == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0154, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0039, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0141, code lost:
    
        r2 = r11;
        r11 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:16:0x0034, B:17:0x0139, B:18:0x013b, B:22:0x0040, B:23:0x0124, B:27:0x010c, B:29:0x0112, B:32:0x0127, B:38:0x00b0, B:40:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d9, B:49:0x00e3, B:53:0x00e8, B:55:0x00ec, B:57:0x00f2, B:64:0x00fa, B:68:0x007d, B:69:0x0098, B:74:0x0084), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:16:0x0034, B:17:0x0139, B:18:0x013b, B:22:0x0040, B:23:0x0124, B:27:0x010c, B:29:0x0112, B:32:0x0127, B:38:0x00b0, B:40:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d9, B:49:0x00e3, B:53:0x00e8, B:55:0x00ec, B:57:0x00f2, B:64:0x00fa, B:68:0x007d, B:69:0x0098, B:74:0x0084), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:16:0x0034, B:17:0x0139, B:18:0x013b, B:22:0x0040, B:23:0x0124, B:27:0x010c, B:29:0x0112, B:32:0x0127, B:38:0x00b0, B:40:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d9, B:49:0x00e3, B:53:0x00e8, B:55:0x00ec, B:57:0x00f2, B:64:0x00fa, B:68:0x007d, B:69:0x0098, B:74:0x0084), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:41:0x00c6->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.sumsub.sns.internal.domain.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.sumsub.sns.internal.domain.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.sumsub.sns.internal.core.domain.base.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.domain.n r11, com.sumsub.sns.internal.domain.n.a r12, T9.a r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.n.a(com.sumsub.sns.internal.domain.n, com.sumsub.sns.internal.domain.n$a, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:11:0x002b, B:13:0x007a, B:15:0x0080), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.domain.n r6, java.util.List r7, com.sumsub.sns.internal.domain.n.a r8, T9.a r9) {
        /*
            boolean r0 = r9 instanceof com.sumsub.sns.internal.domain.n.b
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.domain.n$b r0 = (com.sumsub.sns.internal.domain.n.b) r0
            int r1 = r0.f16888e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16888e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.domain.n$b r0 = new com.sumsub.sns.internal.domain.n$b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f16886c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16888e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f16885b
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.f16884a
            com.sumsub.sns.internal.domain.n r7 = (com.sumsub.sns.internal.domain.n) r7
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L7a
        L2f:
            r6 = move-exception
            goto L99
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.b.b(r9)
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
        L40:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L60
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L9d
            r2 = r9
            com.sumsub.sns.internal.core.data.model.Document r2 = (com.sumsub.sns.internal.core.data.model.Document) r2     // Catch: java.lang.Throwable -> L9d
            com.sumsub.sns.internal.core.data.model.DocumentType r2 = r2.getType()     // Catch: java.lang.Throwable -> L9d
            com.sumsub.sns.internal.core.data.model.Document r4 = r8.b()     // Catch: java.lang.Throwable -> L9d
            com.sumsub.sns.internal.core.data.model.DocumentType r4 = r4.getType()     // Catch: java.lang.Throwable -> L9d
            boolean r2 = kotlin.jvm.internal.f.b(r2, r4)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L40
            goto L61
        L60:
            r9 = 0
        L61:
            com.sumsub.sns.internal.core.data.model.Document r9 = (com.sumsub.sns.internal.core.data.model.Document) r9     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L71
            com.sumsub.sns.internal.core.data.model.Document$b r7 = r9.getResult()     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L71
            java.util.List r7 = r7.h()     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto L73
        L71:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.f23104a     // Catch: java.lang.Throwable -> L9d
        L73:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L9d
            r5 = r7
            r7 = r6
            r6 = r5
        L7a:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto La9
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L2f
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L2f
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L2f
            com.sumsub.sns.internal.core.data.source.applicant.b r9 = r7.f16878b     // Catch: java.lang.Throwable -> L2f
            r0.f16884a = r7     // Catch: java.lang.Throwable -> L2f
            r0.f16885b = r6     // Catch: java.lang.Throwable -> L2f
            r0.f16888e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L7a
            return r1
        L99:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L9e
        L9d:
            r7 = move-exception
        L9e:
            com.sumsub.sns.internal.log.a r8 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r6 = com.sumsub.sns.internal.log.c.a(r6)
            java.lang.String r9 = "Pre process error"
            r8.e(r6, r9, r7)
        La9:
            O9.p r6 = O9.p.f3034a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.n.a(com.sumsub.sns.internal.domain.n, java.util.List, com.sumsub.sns.internal.domain.n$a, T9.a):java.lang.Object");
    }
}
