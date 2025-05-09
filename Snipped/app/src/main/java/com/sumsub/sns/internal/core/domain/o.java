package com.sumsub.sns.internal.core.domain;

import O9.p;
import P9.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Size;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.core.domain.m;
import com.sumsub.sns.internal.ml.core.e;
import com.sumsub.sns.internal.ml.facedetector.models.d;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class o implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final a f16438d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f16439a;

    /* renamed from: b, reason: collision with root package name */
    public com.sumsub.sns.internal.ml.facedetector.a f16440b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16441c = "TensorFlow";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.domain.TensorflowFaceDetector$processImage$detectResult$1", f = "TensorflowFaceDetector.kt", l = {54}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super e.a<com.sumsub.sns.internal.ml.facedetector.models.e>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16442a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f16444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f16444c = bitmap;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super e.a<com.sumsub.sns.internal.ml.facedetector.models.e>> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return o.this.new b(this.f16444c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16442a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.ml.facedetector.a aVar = o.this.f16440b;
                if (aVar == null) {
                    return null;
                }
                Bitmap bitmap = this.f16444c;
                this.f16442a = 1;
                obj = aVar.a((com.sumsub.sns.internal.ml.facedetector.a) bitmap, (T9.a) this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return (e.a) obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.domain.TensorflowFaceDetector$stop$1", f = "TensorflowFaceDetector.kt", l = {40}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16445a;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return o.this.new c(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16445a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.ml.facedetector.a aVar = o.this.f16440b;
                if (aVar == null) {
                    return null;
                }
                this.f16445a = 1;
                if (aVar.a((T9.a<? super p>) this) == coroutineSingletons) {
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

    public o(Context context) {
        this.f16439a = context;
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public String getName() {
        return this.f16441c;
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void start() {
        com.sumsub.sns.internal.ml.facedetector.c cVar = com.sumsub.sns.internal.ml.facedetector.c.f17722a;
        com.sumsub.sns.internal.ml.facedetector.c.a(cVar, "TensorflowFaceDetector", "TensorflowFaceDetector@start()", null, 4, null);
        this.f16440b = new com.sumsub.sns.internal.ml.facedetector.a(this.f16439a, new d.a().a(1).a(0.4f).a());
        com.sumsub.sns.internal.ml.facedetector.c.a(cVar, "TensorflowFaceDetector", "TensorflowFaceDetector@start(), detector created", null, 4, null);
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void stop() {
        com.sumsub.sns.internal.ml.facedetector.c cVar = com.sumsub.sns.internal.ml.facedetector.c.f17722a;
        com.sumsub.sns.internal.ml.facedetector.c.a(cVar, "TensorflowFaceDetector", "TensorflowFaceDetector@stop()", null, 4, null);
        BuildersKt__BuildersKt.runBlocking$default(null, new c(null), 1, null);
        this.f16440b = null;
        com.sumsub.sns.internal.ml.facedetector.c.a(cVar, "TensorflowFaceDetector", "TensorflowFaceDetector@stop(), detector destroyed", null, 4, null);
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void a(Bitmap bitmap, RectF rectF, InterfaceC0646l<? super m.a, p> interfaceC0646l) {
        Object runBlocking$default;
        m.a cVar;
        com.sumsub.sns.internal.ml.facedetector.models.e eVar;
        List<com.sumsub.sns.internal.ml.facedetector.models.c> b9;
        com.sumsub.sns.internal.ml.facedetector.models.c cVar2;
        com.sumsub.sns.internal.ml.facedetector.models.e eVar2;
        List<com.sumsub.sns.internal.ml.facedetector.models.c> b10;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new b(bitmap, null), 1, null);
            e.a aVar = (e.a) runBlocking$default;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            int i = 0;
            if (aVar instanceof e.a.d) {
                int size = ((com.sumsub.sns.internal.ml.facedetector.models.e) ((e.a.d) aVar).c()).b().size();
                cVar = size != 0 ? size != 1 ? new m.a.e(bitmap) : a(rectF, ((com.sumsub.sns.internal.ml.facedetector.models.e) ((e.a.d) aVar).c()).b().get(0), bitmap, new Size(bitmap.getWidth(), bitmap.getHeight())) : new m.a.c(bitmap);
            } else if (aVar instanceof e.a.b) {
                com.sumsub.sns.internal.ml.facedetector.c.f17722a.a("TensorflowFaceDetector", "TensorflowFaceDetector@processImage(), result error", ((e.a.b) aVar).c());
                cVar = new m.a.C0239a(bitmap, ((e.a.b) aVar).c());
            } else {
                cVar = aVar instanceof e.a.c ? new m.a.c(bitmap) : aVar instanceof e.a.C0276e ? new m.a.c(bitmap) : new m.a.c(bitmap);
            }
            e.a.d dVar = aVar instanceof e.a.d ? (e.a.d) aVar : null;
            if (dVar != null && (eVar2 = (com.sumsub.sns.internal.ml.facedetector.models.e) dVar.c()) != null && (b10 = eVar2.b()) != null) {
                i = b10.size();
            }
            e.a.d dVar2 = aVar instanceof e.a.d ? (e.a.d) aVar : null;
            float c2 = (dVar2 == null || (eVar = (com.sumsub.sns.internal.ml.facedetector.models.e) dVar2.c()) == null || (b9 = eVar.b()) == null || (cVar2 = (com.sumsub.sns.internal.ml.facedetector.models.c) s.L(b9)) == null) ? 0.0f : cVar2.c();
            com.sumsub.sns.internal.ml.facedetector.c.a(com.sumsub.sns.internal.ml.facedetector.c.f17722a, "TensorflowFaceDetector", "processImage(), frame=" + bitmap.getWidth() + 'x' + bitmap.getHeight() + ", time=" + elapsedRealtime2 + " ms, faces=" + i + ", faceScore=" + c2 + ", result=" + com.sumsub.sns.internal.core.common.i.a(cVar), null, 4, null);
            interfaceC0646l.invoke(cVar);
        } catch (Exception e10) {
            com.sumsub.sns.internal.ml.facedetector.c.f17722a.a("TensorflowFaceDetector", "TensorflowFaceDetector@processImage(), error", e10);
            interfaceC0646l.invoke(new m.a.C0239a(bitmap, e10));
        }
    }

    public final m.a a(RectF rectF, com.sumsub.sns.internal.ml.facedetector.models.c cVar, Bitmap bitmap, Size size) {
        if (cVar.c() < 0.3f) {
            return new m.a.c(bitmap);
        }
        if (rectF.contains(cVar.a())) {
            return new m.a.b(bitmap, size, cVar.a());
        }
        return new m.a.d(bitmap, cVar.a());
    }
}
