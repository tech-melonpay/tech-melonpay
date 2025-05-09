package com.sumsub.sns.internal.core.common;

import P9.s;
import ca.InterfaceC0646l;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetector;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes2.dex */
public final class d0 implements o0 {

    @V9.d(c = "com.sumsub.sns.internal.core.common.MLKitDocumentRotationDetector", f = "DocumentRotationUtils.kt", l = {75}, m = "detectRotation")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15066a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15067b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15068c;

        /* renamed from: e, reason: collision with root package name */
        public int f15070e;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15068c = obj;
            this.f15070e |= Integer.MIN_VALUE;
            return d0.this.a(null, this);
        }
    }

    public static final class b implements OnCanceledListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FaceDetector f15071a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Integer> f15072b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(FaceDetector faceDetector, CancellableContinuation<? super Integer> cancellableContinuation) {
            this.f15071a = faceDetector;
            this.f15072b = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f15071a.close();
            this.f15072b.resume((CancellableContinuation<Integer>) 0, (InterfaceC0646l<? super Throwable, O9.p>) null);
        }
    }

    public static final class c implements OnFailureListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FaceDetector f15073a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Integer> f15074b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(FaceDetector faceDetector, CancellableContinuation<? super Integer> cancellableContinuation) {
            this.f15073a = faceDetector;
            this.f15074b = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.f15073a.close();
            this.f15074b.resumeWith(kotlin.b.a(exc));
        }
    }

    public static final class d<TResult> implements OnSuccessListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FaceDetector f15075a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Integer> f15076b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(FaceDetector faceDetector, CancellableContinuation<? super Integer> cancellableContinuation) {
            this.f15075a = faceDetector;
            this.f15076b = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onSuccess(List<Face> list) {
            Face face = (Face) s.L(list);
            this.f15075a.close();
            if (face != null) {
                this.f15076b.resume((CancellableContinuation<Integer>) Integer.valueOf((int) face.getHeadEulerAngleZ()), (InterfaceC0646l<? super Throwable, O9.p>) null);
            } else {
                this.f15076b.resume((CancellableContinuation<Integer>) 0, (InterfaceC0646l<? super Throwable, O9.p>) null);
                this.f15075a.close();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.sumsub.sns.internal.core.common.o0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.graphics.Bitmap r5, T9.a<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.internal.core.common.d0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.internal.core.common.d0$a r0 = (com.sumsub.sns.internal.core.common.d0.a) r0
            int r1 = r0.f15070e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15070e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.common.d0$a r0 = new com.sumsub.sns.internal.core.common.d0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15068c
            U4.b.i()
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f15070e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f15067b
            com.google.mlkit.vision.common.InputImage r5 = (com.google.mlkit.vision.common.InputImage) r5
            java.lang.Object r5 = r0.f15066a
            com.google.mlkit.vision.face.FaceDetector r5 = (com.google.mlkit.vision.face.FaceDetector) r5
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L9c
            goto L95
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.b.b(r6)
            com.google.mlkit.vision.face.FaceDetectorOptions$Builder r6 = new com.google.mlkit.vision.face.FaceDetectorOptions$Builder     // Catch: java.lang.Throwable -> L9c
            r6.<init>()     // Catch: java.lang.Throwable -> L9c
            r2 = 2
            com.google.mlkit.vision.face.FaceDetectorOptions$Builder r6 = r6.setPerformanceMode(r2)     // Catch: java.lang.Throwable -> L9c
            com.google.mlkit.vision.face.FaceDetectorOptions$Builder r6 = r6.setLandmarkMode(r2)     // Catch: java.lang.Throwable -> L9c
            com.google.mlkit.vision.face.FaceDetectorOptions$Builder r6 = r6.setClassificationMode(r2)     // Catch: java.lang.Throwable -> L9c
            com.google.mlkit.vision.face.FaceDetectorOptions r6 = r6.build()     // Catch: java.lang.Throwable -> L9c
            com.google.mlkit.vision.face.FaceDetector r6 = com.google.mlkit.vision.face.FaceDetection.getClient(r6)     // Catch: java.lang.Throwable -> L9c
            com.google.mlkit.vision.common.InputImage r5 = com.google.mlkit.vision.common.InputImage.a(r5)     // Catch: java.lang.Throwable -> L9c
            r0.f15066a = r6     // Catch: java.lang.Throwable -> L9c
            r0.f15067b = r5     // Catch: java.lang.Throwable -> L9c
            r0.f15070e = r3     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L9c
            T9.a r0 = U4.b.p(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L9c
            r2.initCancellability()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.tasks.Task r5 = r6.process(r5)     // Catch: java.lang.Throwable -> L9c
            com.sumsub.sns.internal.core.common.d0$b r0 = new com.sumsub.sns.internal.core.common.d0$b     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.tasks.Task r5 = r5.addOnCanceledListener(r0)     // Catch: java.lang.Throwable -> L9c
            com.sumsub.sns.internal.core.common.d0$c r0 = new com.sumsub.sns.internal.core.common.d0$c     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.tasks.Task r5 = r5.addOnFailureListener(r0)     // Catch: java.lang.Throwable -> L9c
            com.sumsub.sns.internal.core.common.d0$d r0 = new com.sumsub.sns.internal.core.common.d0$d     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L9c
            r5.addOnSuccessListener(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r6 = r2.getResult()     // Catch: java.lang.Throwable -> L9c
            U4.b.i()     // Catch: java.lang.Throwable -> L9c
            if (r6 != r1) goto L95
            return r1
        L95:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L9c
            int r5 = r6.intValue()     // Catch: java.lang.Throwable -> L9c
            goto L9d
        L9c:
            r5 = 0
        L9d:
            java.lang.Integer r5 = V9.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.d0.a(android.graphics.Bitmap, T9.a):java.lang.Object");
    }
}
