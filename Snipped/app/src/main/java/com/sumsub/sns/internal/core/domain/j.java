package com.sumsub.sns.internal.core.domain;

import O9.p;
import P9.s;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import ca.InterfaceC0646l;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.sumsub.sns.internal.core.domain.m;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class j implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16405c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public FaceDetector f16406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16407b = "MLKit";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    @SuppressLint({"UnsafeOptInUsageError"})
    public void a(Bitmap bitmap, RectF rectF, InterfaceC0646l<? super m.a, p> interfaceC0646l) {
        Task process;
        Task addOnSuccessListener;
        g gVar = g.f16396a;
        g.a(gVar, "MLKitFaceDetector", "@processImage()", null, 4, null);
        if (this.f16406a == null) {
            g.a(gVar, "MLKitFaceDetector", "@processImage(), detector is null", null, 4, null);
            interfaceC0646l.invoke(new m.a.c(bitmap));
            return;
        }
        g.a(gVar, "MLKitFaceDetector", "@processImage(), creating InputImage from Bitmap", null, 4, null);
        InputImage a10 = InputImage.a(bitmap);
        g.a(gVar, "MLKitFaceDetector", "@processImage(), InputImage created", null, 4, null);
        g.a(gVar, "MLKitFaceDetector", "@processImage(), starting analyzing frame", null, 4, null);
        FaceDetector faceDetector = this.f16406a;
        if (faceDetector == null || (process = faceDetector.process(a10)) == null || (addOnSuccessListener = process.addOnSuccessListener(new h(interfaceC0646l, bitmap, this, rectF))) == null) {
            return;
        }
        addOnSuccessListener.addOnFailureListener(new B.e(4, interfaceC0646l, bitmap));
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public String getName() {
        return this.f16407b;
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void start() {
        g gVar = g.f16396a;
        g.a(gVar, "MLKitFaceDetector", "@start()", null, 4, null);
        stop();
        this.f16406a = FaceDetection.getClient(new FaceDetectorOptions.Builder().setPerformanceMode(1).setLandmarkMode(1).setClassificationMode(1).setMinFaceSize(0.4f).build());
        g.a(gVar, "MLKitFaceDetector", "@start(), started", null, 4, null);
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void stop() {
        g gVar = g.f16396a;
        g.a(gVar, "MLKitFaceDetector", "@stop()", null, 4, null);
        FaceDetector faceDetector = this.f16406a;
        if (faceDetector != null) {
            faceDetector.close();
        }
        this.f16406a = null;
        g.a(gVar, "MLKitFaceDetector", "@stop(), stopped", null, 4, null);
    }

    public static final void a(InterfaceC0646l interfaceC0646l, Bitmap bitmap, j jVar, RectF rectF, List list) {
        m.a a10;
        g gVar = g.f16396a;
        g.a(gVar, "MLKitFaceDetector", "@processImage(), success", null, 4, null);
        if (list.isEmpty()) {
            g.a(gVar, "MLKitFaceDetector", "@processImage(), no faces found", null, 4, null);
            a10 = new m.a.c(bitmap);
        } else if (list.size() > 1) {
            g.a(gVar, "MLKitFaceDetector", "@processImage(), more than 1 faces found", null, 4, null);
            a10 = new m.a.e(bitmap);
        } else {
            a10 = jVar.a(rectF, (Face) s.J(list), bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()));
        }
        interfaceC0646l.invoke(a10);
    }

    public static final void a(InterfaceC0646l interfaceC0646l, Bitmap bitmap, Exception exc) {
        g.f16396a.a("MLKitFaceDetector", "@processImage(), failed to analyze", exc);
        interfaceC0646l.invoke(new m.a.C0239a(bitmap, exc));
    }

    public final m.a a(RectF rectF, Face face, Bitmap bitmap, Size size) {
        g gVar = g.f16396a;
        g.a(gVar, "MLKitFaceDetector", "@processFace(), got " + bitmap.getWidth() + 'x' + bitmap.getHeight() + " frame", null, 4, null);
        Rect boundingBox = face.getBoundingBox();
        RectF rectF2 = new RectF((((float) size.getWidth()) - ((float) boundingBox.right)) / ((float) size.getWidth()), ((float) boundingBox.top) / ((float) size.getHeight()), (((float) size.getWidth()) - ((float) boundingBox.left)) / ((float) size.getWidth()), ((float) boundingBox.bottom) / ((float) size.getHeight()));
        if (rectF.contains(rectF2)) {
            g.a(gVar, "MLKitFaceDetector", "@processFace(), face is in capture box", null, 4, null);
            return new m.a.b(bitmap, size, rectF2);
        }
        g.a(gVar, "MLKitFaceDetector", "@processFace(), face is NOT in capture box", null, 4, null);
        return new m.a.d(bitmap, rectF2);
    }
}
