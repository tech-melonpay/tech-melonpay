package T2;

import T2.f;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l[] f3515a = new l[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f3516b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f3517c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f3518d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f3519e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f3520f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final l f3521g = new l();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3522h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f3523j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f3524k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3525l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f3526a = new j();
    }

    public j() {
        for (int i = 0; i < 4; i++) {
            this.f3515a[i] = new l();
            this.f3516b[i] = new Matrix();
            this.f3517c[i] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        Path path2;
        Path path3;
        j jVar = this;
        i iVar2 = iVar;
        f.a aVar2 = aVar;
        path.rewind();
        Path path4 = jVar.f3519e;
        path4.rewind();
        Path path5 = jVar.f3520f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            matrixArr = jVar.f3517c;
            fArr = jVar.f3522h;
            matrixArr2 = jVar.f3516b;
            lVarArr = jVar.f3515a;
            if (i9 >= 4) {
                break;
            }
            c cVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? iVar2.f3498f : iVar2.f3497e : iVar2.f3500h : iVar2.f3499g;
            Ja.a aVar3 = i9 != 1 ? i9 != 2 ? i9 != 3 ? iVar2.f3494b : iVar2.f3493a : iVar2.f3496d : iVar2.f3495c;
            l lVar = lVarArr[i9];
            aVar3.getClass();
            aVar3.k(lVar, f10, cVar.a(rectF));
            int i10 = i9 + 1;
            float f11 = (i10 % 4) * 90;
            matrixArr2[i9].reset();
            PointF pointF = jVar.f3518d;
            if (i9 == 1) {
                path3 = path4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i9 == 2) {
                path3 = path4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i9 != 3) {
                path3 = path4;
                pointF.set(rectF.right, rectF.top);
            } else {
                path3 = path4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i9].setTranslate(pointF.x, pointF.y);
            matrixArr2[i9].preRotate(f11);
            l lVar2 = lVarArr[i9];
            fArr[0] = lVar2.f3531c;
            fArr[1] = lVar2.f3532d;
            matrixArr2[i9].mapPoints(fArr);
            matrixArr[i9].reset();
            matrixArr[i9].setTranslate(fArr[0], fArr[1]);
            matrixArr[i9].preRotate(f11);
            i9 = i10;
            path4 = path3;
        }
        Path path6 = path4;
        int i11 = 0;
        for (i = 4; i11 < i; i = 4) {
            l lVar3 = lVarArr[i11];
            fArr[0] = lVar3.f3529a;
            fArr[1] = lVar3.f3530b;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            lVarArr[i11].c(matrixArr2[i11], path);
            if (aVar2 != null) {
                l lVar4 = lVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                f fVar = f.this;
                BitSet bitSet = fVar.f3451d;
                lVar4.getClass();
                bitSet.set(i11, false);
                lVar4.b(lVar4.f3534f);
                fVar.f3449b[i11] = new k(new ArrayList(lVar4.f3536h), new Matrix(matrix));
            }
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            l lVar5 = lVarArr[i11];
            fArr[0] = lVar5.f3531c;
            fArr[1] = lVar5.f3532d;
            matrixArr2[i11].mapPoints(fArr);
            l lVar6 = lVarArr[i13];
            float f12 = lVar6.f3529a;
            float[] fArr2 = jVar.i;
            fArr2[0] = f12;
            fArr2[1] = lVar6.f3530b;
            matrixArr2[i13].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i11];
            fArr[0] = lVar7.f3531c;
            fArr[1] = lVar7.f3532d;
            matrixArr2[i11].mapPoints(fArr);
            float abs = (i11 == 1 || i11 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            l lVar8 = jVar.f3521g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            (i11 != 1 ? i11 != 2 ? i11 != 3 ? iVar2.f3501j : iVar2.i : iVar2.f3503l : iVar2.f3502k).a(max, abs, f10, lVar8);
            Path path7 = jVar.f3523j;
            path7.reset();
            lVar8.c(matrixArr[i11], path7);
            if (jVar.f3525l && (jVar.b(path7, i11) || jVar.b(path7, i13))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f3529a;
                fArr[1] = lVar8.f3530b;
                matrixArr[i11].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i11], path2);
            } else {
                path2 = path6;
                lVar8.c(matrixArr[i11], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i11];
                f fVar2 = f.this;
                fVar2.f3451d.set(i11 + 4, false);
                lVar8.b(lVar8.f3534f);
                fVar2.f3450c[i11] = new k(new ArrayList(lVar8.f3536h), new Matrix(matrix2));
            }
            jVar = this;
            iVar2 = iVar;
            aVar2 = aVar;
            path6 = path2;
            i11 = i12;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path.op(path8, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f3524k;
        path2.reset();
        this.f3515a[i].c(this.f3516b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
