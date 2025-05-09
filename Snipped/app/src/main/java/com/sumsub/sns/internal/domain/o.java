package com.sumsub.sns.internal.domain;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a;
import com.sumsub.sns.internal.domain.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class o extends n<a> {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0646l<? super Integer, p> f16896e;

    /* renamed from: f, reason: collision with root package name */
    public Map<com.sumsub.sns.internal.core.data.model.n, Integer> f16897f;

    public static final class a extends n.a {

        /* renamed from: d, reason: collision with root package name */
        public final List<com.sumsub.sns.internal.core.data.model.n> f16898d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f16899e;

        public /* synthetic */ a(Document document, String str, List list, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(document, str, list, (i & 8) != 0 ? false : z10, (i & 16) != 0 ? false : z11);
        }

        public final List<com.sumsub.sns.internal.core.data.model.n> d() {
            return this.f16898d;
        }

        public final boolean e() {
            return this.f16899e;
        }

        public a(Document document, String str, List<com.sumsub.sns.internal.core.data.model.n> list, boolean z10, boolean z11) {
            super(document, str, z10);
            this.f16898d = list;
            this.f16899e = z11;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadDocumentImagesUseCase", f = "UploadDocumentImagesUseCase.kt", l = {93}, m = "syncUpload")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16902a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16903b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16904c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16905d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16906e;

        /* renamed from: f, reason: collision with root package name */
        public Object f16907f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f16908g;
        public int i;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16908g = obj;
            this.i |= Integer.MIN_VALUE;
            return o.this.a2((a) null, (com.sumsub.sns.internal.core.data.model.g) null, (String) null, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadDocumentImagesUseCase$upload$3", f = "UploadDocumentImagesUseCase.kt", l = {79}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super List<? extends com.sumsub.sns.internal.core.data.model.remote.k>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16910a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16911b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f16912c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f16913d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f16914e;

        @V9.d(c = "com.sumsub.sns.internal.domain.UploadDocumentImagesUseCase$upload$3$2$1", f = "UploadDocumentImagesUseCase.kt", l = {65}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16915a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f16916b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f16917c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.sumsub.sns.internal.core.data.model.n f16918d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f16919e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, String str, com.sumsub.sns.internal.core.data.model.n nVar, a aVar, T9.a<? super a> aVar2) {
                super(2, aVar2);
                this.f16916b = oVar;
                this.f16917c = str;
                this.f16918d = nVar;
                this.f16919e = aVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super com.sumsub.sns.internal.core.data.model.remote.k> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f16916b, this.f16917c, this.f16918d, this.f16919e, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f16915a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.data.source.applicant.b b9 = this.f16916b.b();
                    String str = this.f16917c;
                    File m2 = this.f16918d.m();
                    String p10 = this.f16918d.p();
                    IdentitySide o10 = this.f16918d.o();
                    DocumentType type = this.f16919e.b().getType();
                    b a10 = this.f16916b.a(this.f16918d);
                    this.f16915a = 1;
                    obj = com.sumsub.sns.internal.core.data.source.applicant.b.a(b9, str, m2, p10, o10, null, type, a10, this, 16, null);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                com.sumsub.sns.internal.core.data.model.n nVar = this.f16918d;
                com.sumsub.sns.internal.core.data.model.remote.k kVar = (com.sumsub.sns.internal.core.data.model.remote.k) obj;
                if (kVar != null && kVar.l()) {
                    com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
                    com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", "Fast-fail for " + nVar, null, 4, null);
                    com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", "response: " + kVar, null, 4, null);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, o oVar, String str, T9.a<? super d> aVar2) {
            super(2, aVar2);
            this.f16912c = aVar;
            this.f16913d = oVar;
            this.f16914e = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            d dVar = new d(this.f16912c, this.f16913d, this.f16914e, aVar);
            dVar.f16911b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16910a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f16911b;
            List<com.sumsub.sns.internal.core.data.model.n> d10 = this.f16912c.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d10) {
                if (!((com.sumsub.sns.internal.core.data.model.n) obj2).n()) {
                    arrayList.add(obj2);
                }
            }
            o oVar = this.f16913d;
            String str = this.f16914e;
            a aVar = this.f16912c;
            ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.sumsub.sns.internal.core.data.model.n nVar = (com.sumsub.sns.internal.core.data.model.n) it.next();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar2 = new a(oVar, str, nVar, aVar, null);
                ArrayList arrayList3 = arrayList2;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, io2, null, aVar2, 2, null);
                arrayList3.add(async$default);
                aVar = aVar;
                arrayList2 = arrayList3;
            }
            this.f16910a = 1;
            Object awaitAll = AwaitKt.awaitAll(arrayList2, this);
            return awaitAll == coroutineSingletons ? coroutineSingletons : awaitAll;
        }
    }

    public o(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar, com.sumsub.sns.internal.core.data.source.settings.b bVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar3) {
        super(aVar, bVar, bVar2, bVar3);
        this.f16897f = new LinkedHashMap();
    }

    @Override // com.sumsub.sns.internal.domain.n
    public /* bridge */ /* synthetic */ Object b(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a aVar2) {
        return b2(aVar, gVar, str, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) aVar2);
    }

    public static final class b implements a.InterfaceC0229a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.n f16900a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f16901b;

        public b(com.sumsub.sns.internal.core.data.model.n nVar, o oVar) {
            this.f16900a = nVar;
            this.f16901b = oVar;
        }

        @Override // com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a.InterfaceC0229a
        public void a(int i) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", b() + ", uploaded progress=" + i, null, 4, null);
            this.f16901b.a(this.f16900a, i);
        }

        public final String b() {
            return this.f16900a.p() + ", side=" + this.f16900a.o();
        }

        @Override // com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a.InterfaceC0229a
        public void a() {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", b() + ", upload finished", null, 4, null);
            this.f16901b.a(this.f16900a, 100);
        }
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    public Object b2(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>> aVar2) {
        this.f16897f.clear();
        Iterator<T> it = aVar.d().iterator();
        while (it.hasNext()) {
            this.f16897f.put((com.sumsub.sns.internal.core.data.model.n) it.next(), new Integer(0));
        }
        return CoroutineScopeKt.coroutineScope(new d(aVar, this, str, null), aVar2);
    }

    public o(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.n(), aVar.g(), aVar.F(), aVar.p());
    }

    @Override // com.sumsub.sns.internal.domain.n
    public /* bridge */ /* synthetic */ Object a(List list, a aVar, T9.a aVar2) {
        return a2((List<Document>) list, aVar, (T9.a<? super p>) aVar2);
    }

    @Override // com.sumsub.sns.internal.domain.n
    public /* bridge */ /* synthetic */ Object a(a aVar, com.sumsub.sns.internal.core.data.model.g gVar, String str, T9.a aVar2) {
        return a2(aVar, gVar, str, (T9.a<? super List<com.sumsub.sns.internal.core.data.model.remote.k>>) aVar2);
    }

    public final void a(InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.f16896e = interfaceC0646l;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Object a2(List<Document> list, a aVar, T9.a<? super p> aVar2) {
        if (!aVar.e()) {
            Object a10 = super.a(list, (List<Document>) aVar, aVar2);
            return a10 == CoroutineSingletons.f23158a ? a10 : p.f3034a;
        }
        return p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0151 -> B:10:0x015b). Please report as a decompilation issue!!! */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a2(com.sumsub.sns.internal.domain.o.a r25, com.sumsub.sns.internal.core.data.model.g r26, java.lang.String r27, T9.a<? super java.util.List<com.sumsub.sns.internal.core.data.model.remote.k>> r28) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.o.a2(com.sumsub.sns.internal.domain.o$a, com.sumsub.sns.internal.core.data.model.g, java.lang.String, T9.a):java.lang.Object");
    }

    public final b a(com.sumsub.sns.internal.core.data.model.n nVar) {
        return new b(nVar, this);
    }

    public final void a(com.sumsub.sns.internal.core.data.model.n nVar, int i) {
        this.f16897f.put(nVar, Integer.valueOf(i));
        Iterator<T> it = this.f16897f.values().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 += ((Number) it.next()).intValue();
        }
        int size = (int) ((i9 / (this.f16897f.size() * 100)) * 100.0f);
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", com.google.android.gms.measurement.internal.a.g(size, "total upload progress="), null, 4, null);
        InterfaceC0646l<? super Integer, p> interfaceC0646l = this.f16896e;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(size));
        }
    }
}
