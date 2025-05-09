package com.sumsub.sns.internal.core.domain;

import O9.p;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.media.FaceDetector;
import android.util.Size;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.core.domain.m;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16408f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public FaceDetector f16409a;

    /* renamed from: b, reason: collision with root package name */
    public int f16410b;

    /* renamed from: c, reason: collision with root package name */
    public int f16411c;

    /* renamed from: d, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.common.e f16412d = new com.sumsub.sns.internal.core.common.e(Bitmap.Config.RGB_565);

    /* renamed from: e, reason: collision with root package name */
    public final String f16413e = "Native";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final Pair<Bitmap, FaceDetector> a(Bitmap bitmap) {
        g gVar = g.f16396a;
        g.a(gVar, "NativeFaceDetector", "@prepareDetector()", null, 4, null);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        g.a(gVar, "NativeFaceDetector", "@prepareDetector(), got bitmap of size " + width + 'x' + height, null, 4, null);
        FaceDetector faceDetector = this.f16409a;
        if (faceDetector != null && this.f16410b == width && this.f16411c == height) {
            g.a(gVar, "NativeFaceDetector", "@prepareDetector(), reuse old FaceDetector", null, 4, null);
        } else {
            g.a(gVar, "NativeFaceDetector", "@prepareDetector(), create FaceDetector", null, 4, null);
            this.f16410b = width;
            this.f16411c = height;
            faceDetector = new FaceDetector(width, height, 1);
        }
        this.f16409a = faceDetector;
        g.a(gVar, "NativeFaceDetector", "@prepareDetector(), making RGB565 copy of Bitmap", null, 4, null);
        Bitmap a10 = this.f16412d.a(width, height);
        new Canvas(a10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        g.a(gVar, "NativeFaceDetector", "@prepareDetector(), RGB565 copy made", null, 4, null);
        return new Pair<>(a10, faceDetector);
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public String getName() {
        return this.f16413e;
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void start() {
        g.a(g.f16396a, "NativeFaceDetector", "@start()", null, 4, null);
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    public void stop() {
        g.a(g.f16396a, "NativeFaceDetector", "@stop()", null, 4, null);
        this.f16409a = null;
        this.f16410b = 0;
        this.f16411c = 0;
        this.f16412d.a();
    }

    @Override // com.sumsub.sns.internal.core.domain.m
    @SuppressLint({"UnsafeOptInUsageError"})
    public void a(Bitmap bitmap, RectF rectF, InterfaceC0646l<? super m.a, p> interfaceC0646l) {
        m.a cVar;
        try {
            g gVar = g.f16396a;
            g.a(gVar, "NativeFaceDetector", "@processImage(), got " + bitmap.getWidth() + 'x' + bitmap.getHeight() + " frame", null, 4, null);
            FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
            Pair<Bitmap, FaceDetector> a10 = a(bitmap);
            g.a(gVar, "NativeFaceDetector", "@processImage(), detector prepared, trying to find faces", null, 4, null);
            a10.f23090b.findFaces(a10.f23089a, faceArr);
            int size = P9.l.o(faceArr).size();
            g.a(gVar, "NativeFaceDetector", "@processImage(), " + size + " found", null, 4, null);
            if (size == 0) {
                cVar = new m.a.c(bitmap);
            } else if (size != 1) {
                cVar = new m.a.e(bitmap);
            } else {
                FaceDetector.Face face = faceArr[0];
                if (face != null) {
                    cVar = a(rectF, face, bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()));
                } else {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        } catch (Exception e10) {
            g gVar2 = g.f16396a;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            gVar2.a("NativeFaceDetector", message, e10);
            cVar = new m.a.c(bitmap);
        }
        interfaceC0646l.invoke(cVar);
    }

    public final m.a a(RectF rectF, FaceDetector.Face face, Bitmap bitmap, Size size) {
        if (face.confidence() < 0.3f) {
            g.a(g.f16396a, "NativeFaceDetector", "@processFace(), face confidence is too low (" + face.confidence() + ')', null, 4, null);
            return new m.a.c(bitmap);
        }
        PointF pointF = new PointF();
        face.getMidPoint(pointF);
        RectF rectF2 = new RectF(pointF.x - face.eyesDistance(), ((int) pointF.y) - (face.eyesDistance() * 1.5f), face.eyesDistance() + ((int) pointF.x), (face.eyesDistance() * 1.5f) + ((int) pointF.y));
        RectF rectF3 = new RectF((size.getWidth() - rectF2.right) / size.getWidth(), rectF2.top / size.getHeight(), (size.getWidth() - rectF2.left) / size.getWidth(), rectF2.bottom / size.getHeight());
        if (rectF.contains(rectF3)) {
            g.a(g.f16396a, "NativeFaceDetector", "@processFace(), face is in capture box", null, 4, null);
            return new m.a.b(bitmap, size, rectF3);
        }
        g.a(g.f16396a, "NativeFaceDetector", "@processFace(), face is NOT in capture box", null, 4, null);
        return new m.a.d(bitmap, rectF3);
    }
}
