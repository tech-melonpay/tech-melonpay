package com.sumsub.sns.internal.ml.facedetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.sumsub.sns.internal.ml.core.a;
import com.sumsub.sns.internal.ml.core.b;
import com.sumsub.sns.internal.ml.facedetector.models.d;
import com.sumsub.sns.internal.ml.facedetector.models.e;
import com.sumsub.sns.internal.ml.facedetector.models.f;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes2.dex */
public final class a extends b<Bitmap, e> {

    /* renamed from: p, reason: collision with root package name */
    public static final C0280a f17714p = new C0280a(null);

    /* renamed from: h, reason: collision with root package name */
    public final d f17715h;
    public float[][][] i;

    /* renamed from: j, reason: collision with root package name */
    public float[][][] f17716j;

    /* renamed from: k, reason: collision with root package name */
    public List<com.sumsub.sns.internal.ml.facedetector.models.a> f17717k;

    /* renamed from: l, reason: collision with root package name */
    public f f17718l;

    /* renamed from: m, reason: collision with root package name */
    public com.sumsub.sns.internal.ml.facedetector.utils.b f17719m;

    /* renamed from: n, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.core.a f17720n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17721o;

    /* renamed from: com.sumsub.sns.internal.ml.facedetector.a$a, reason: collision with other inner class name */
    public static final class C0280a {
        public /* synthetic */ C0280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0280a() {
        }
    }

    public a(Context context, d dVar) {
        super("MlSolution.TfFaceDetection");
        this.f17715h = dVar;
        this.f17720n = new a.C0272a(context, "face_detection_short_range.tflite", "MlSolution.TfFaceDetection");
        this.f17721o = "Face detector";
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public com.sumsub.sns.internal.ml.core.a e() {
        return this.f17720n;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Map<Integer, Object> g() {
        float[][][] fArr = this.i;
        if (fArr == null) {
            fArr = null;
        }
        Pair pair = new Pair(0, fArr);
        float[][][] fArr2 = this.f17716j;
        return kotlin.collections.a.s(pair, new Pair(1, fArr2 != null ? fArr2 : null));
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public String h() {
        return this.f17721o;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public void a(InterpreterApi interpreterApi) {
        int[] shape = interpreterApi.getOutputTensor(0).shape();
        int i = shape[0];
        float[][][] fArr = new float[i][][];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = shape[1];
            float[][] fArr2 = new float[i10][];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = new float[shape[2]];
            }
            fArr[i9] = fArr2;
        }
        this.i = fArr;
        int[] shape2 = interpreterApi.getOutputTensor(1).shape();
        int i12 = shape2[0];
        float[][][] fArr3 = new float[i12][][];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = shape2[1];
            float[][] fArr4 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                fArr4[i15] = new float[shape2[2]];
            }
            fArr3[i13] = fArr4;
        }
        this.f17716j = fArr3;
        this.f17717k = com.sumsub.sns.internal.ml.facedetector.utils.a.f17766a.a(com.sumsub.sns.internal.ml.facedetector.models.b.f17727o.a());
        this.f17718l = f.f17751o.a(this.f17715h.b(), this.f17715h.a());
        this.f17719m = new com.sumsub.sns.internal.ml.facedetector.utils.b();
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Object[] a(Bitmap bitmap) {
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        return new Object[]{((com.sumsub.sns.internal.ml.core.buffer.a) new com.sumsub.sns.internal.ml.core.pipeline.core.a(new com.sumsub.sns.internal.ml.core.pipeline.b(max, max)).a((com.sumsub.sns.internal.ml.core.pipeline.core.b) new com.sumsub.sns.internal.ml.core.pipeline.c(128, 128, false, false)).a((com.sumsub.sns.internal.ml.core.pipeline.core.b) new com.sumsub.sns.internal.ml.facedetector.pipeline.a()).a((com.sumsub.sns.internal.ml.core.pipeline.core.a) bitmap)).a()};
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public e a(Bitmap bitmap, long j10) {
        com.sumsub.sns.internal.ml.facedetector.utils.b bVar = this.f17719m;
        com.sumsub.sns.internal.ml.facedetector.utils.b bVar2 = bVar == null ? null : bVar;
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        f fVar = this.f17718l;
        f fVar2 = fVar == null ? null : fVar;
        float[][][] fArr = this.f17716j;
        float[][][] fArr2 = fArr == null ? null : fArr;
        float[][][] fArr3 = this.i;
        float[][][] fArr4 = fArr3 == null ? null : fArr3;
        List<com.sumsub.sns.internal.ml.facedetector.models.a> list = this.f17717k;
        return new e(bVar2.a(size, fVar2, fArr2, fArr4, list == null ? null : list), j10);
    }
}
