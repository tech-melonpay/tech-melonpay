package com.sumsub.sns.internal.presentation.screen.preview;

import O9.p;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.presentation.screen.preview.a.d;
import ia.InterfaceC0840h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public abstract class a<S extends d> extends com.sumsub.sns.core.presentation.base.a<S> {

    /* renamed from: y, reason: collision with root package name */
    public static final C0290a f17900y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f17901z;

    /* renamed from: q, reason: collision with root package name */
    public final Document f17902q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f17903r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f17904s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.b f17905t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f17906u;

    /* renamed from: v, reason: collision with root package name */
    public Map<String, String> f17907v;

    /* renamed from: w, reason: collision with root package name */
    public Map<String, String> f17908w;

    /* renamed from: x, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f17909x;

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.a$a, reason: collision with other inner class name */
    public static final class C0290a {
        public /* synthetic */ C0290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0290a() {
        }
    }

    public static final class b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final Document f17910a;

        public b(Document document) {
            this.f17910a = document;
        }

        public final Document b() {
            return this.f17910a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f17910a, ((b) obj).f17910a);
        }

        public int hashCode() {
            return this.f17910a.hashCode();
        }

        public String toString() {
            return "DocumentUploaded(document=" + this.f17910a + ')';
        }
    }

    public static class c {
    }

    public static class d implements a.l {
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.SNSBaseDocumentPreviewViewModel$launchIOWithProgress$1", f = "SNSBaseDocumentPreviewViewModel.kt", l = {80}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17911a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<S> f17912b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l<T9.a<? super p>, Object> f17913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(a<S> aVar, InterfaceC0646l<? super T9.a<? super p>, ? extends Object> interfaceC0646l, T9.a<? super e> aVar2) {
            super(2, aVar2);
            this.f17912b = aVar;
            this.f17913c = interfaceC0646l;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((e) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new e(this.f17912b, this.f17913c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17911a;
            if (i == 0) {
                kotlin.b.b(obj);
                a<S> aVar = this.f17912b;
                InterfaceC0646l<T9.a<? super p>, Object> interfaceC0646l = this.f17913c;
                this.f17911a = 1;
                if (aVar.a(interfaceC0646l, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.SNSBaseDocumentPreviewViewModel$onLoad$1", f = "SNSBaseDocumentPreviewViewModel.kt", l = {42, 45, 53}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17914a;

        /* renamed from: b, reason: collision with root package name */
        public int f17915b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17916c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<S> f17917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a<S> aVar, T9.a<? super f> aVar2) {
            super(2, aVar2);
            this.f17917d = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((f) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            f fVar = new f(this.f17917d, aVar);
            fVar.f17916c = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00a3 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0011, B:14:0x0029, B:15:0x009f, B:17:0x00a3, B:22:0x00ad, B:26:0x00cf, B:29:0x00e3, B:30:0x00eb, B:32:0x0036, B:33:0x005f, B:35:0x007d, B:37:0x0085, B:43:0x0041), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.SNSBaseDocumentPreviewViewModel", f = "SNSBaseDocumentPreviewViewModel.kt", l = {74}, m = "withProgress")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17918a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17919b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<S> f17920c;

        /* renamed from: d, reason: collision with root package name */
        public int f17921d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<S> aVar, T9.a<? super g> aVar2) {
            super(aVar2);
            this.f17920c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17919b = obj;
            this.f17921d |= Integer.MIN_VALUE;
            return this.f17920c.a((InterfaceC0646l<? super T9.a<? super p>, ? extends Object>) null, this);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "country", "getCountry()Ljava/lang/String;", 0);
        i iVar = h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(a.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0);
        iVar.getClass();
        f17901z = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2};
        f17900y = new C0290a(null);
    }

    public a(Document document, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(aVar, bVar);
        this.f17902q = document;
        this.f17903r = aVar;
        this.f17904s = bVar;
        this.f17905t = bVar2;
        this.f17906u = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_COUNTRY", null);
        this.f17909x = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_ID_DOC_TYPE", "OTHER");
    }

    public Object a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super p> aVar) {
        return a(this, gVar, eVar, aVar);
    }

    public final void c(String str) {
        this.f17909x.a(this, f17901z[1], str);
    }

    public abstract void c(boolean z10);

    @Override // com.sumsub.sns.core.presentation.base.a
    public void m() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new f(this, null), 3, null);
    }

    public final Map<String, String> r() {
        return this.f17907v;
    }

    public final String s() {
        return (String) this.f17906u.a(this, f17901z[0]);
    }

    public final com.sumsub.sns.internal.core.data.source.dynamic.b t() {
        return this.f17904s;
    }

    public final Document u() {
        return this.f17902q;
    }

    public final String v() {
        return (String) this.f17909x.a(this, f17901z[1]);
    }

    public final Map<String, String> w() {
        return this.f17908w;
    }

    public final void b(String str) {
        this.f17906u.a(this, f17901z[0], str);
    }

    public final void a(Map<String, String> map) {
        this.f17907v = map;
    }

    public final void a(Document document) {
        a(new b(document));
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ca.InterfaceC0646l<? super T9.a<? super O9.p>, ? extends java.lang.Object> r6, T9.a<? super O9.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.presentation.screen.preview.a.g
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.presentation.screen.preview.a$g r0 = (com.sumsub.sns.internal.presentation.screen.preview.a.g) r0
            int r1 = r0.f17921d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17921d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.a$g r0 = new com.sumsub.sns.internal.presentation.screen.preview.a$g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17919b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17921d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.f17918a
            com.sumsub.sns.internal.presentation.screen.preview.a r6 = (com.sumsub.sns.internal.presentation.screen.preview.a) r6
            kotlin.b.b(r7)
            goto L49
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.b.b(r7)
            r5.b(r4)
            r5.c(r3)
            r0.f17918a = r5
            r0.f17921d = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            r6.b(r3)
            r6.c(r4)
            O9.p r6 = O9.p.f3034a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.a.a(ca.l, T9.a):java.lang.Object");
    }

    public final void a(InterfaceC0646l<? super T9.a<? super p>, ? extends Object> interfaceC0646l) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), Dispatchers.getIO(), null, new e(this, interfaceC0646l, null), 2, null);
    }

    public void a(com.sumsub.sns.internal.core.domain.c cVar) {
        b(cVar.i());
        this.f17907v = cVar.l();
        this.f17908w = cVar.j();
    }

    public void p() {
    }

    public static /* synthetic */ Object a(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a aVar2) {
        return p.f3034a;
    }

    public static /* synthetic */ void a(a aVar, Throwable th, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDataError");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        aVar.a(th, obj);
    }

    public final void a(Throwable th, Object obj) {
        com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Exception while getting a data", th);
        b(false);
        a(th, this.f17902q.getType().c(), obj);
    }
}
