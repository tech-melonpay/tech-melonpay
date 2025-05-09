package com.sumsub.sns.internal.ml.facedetector.utils;

import P9.q;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import com.sumsub.sns.internal.ml.facedetector.models.c;
import com.sumsub.sns.internal.ml.facedetector.models.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {
    public static final int b(c cVar, c cVar2) {
        return Float.compare(cVar2.c(), cVar.c());
    }

    public final List<c> a(Size size, f fVar, float[][][] fArr, float[][][] fArr2, List<com.sumsub.sns.internal.ml.facedetector.models.a> list) {
        if (fArr2.length != 1 || fArr2[0].length != fVar.f() || fArr2[0][0].length != fVar.h()) {
            throw new IllegalArgumentException("RawBoxes dimensions is not correct".toString());
        }
        if (fArr.length != 1 || fArr[0].length != fVar.f() || fArr[0][0].length != fVar.g()) {
            throw new IllegalArgumentException("RawScores dimensions is not correct".toString());
        }
        if (fVar.d() == 0 || fVar.d() < -1) {
            throw new IllegalArgumentException("MaxNumberOfFaces must be greater than 0 or -1".toString());
        }
        ArrayList arrayList = new ArrayList(fVar.f());
        int f10 = fVar.f();
        for (int i = 0; i < f10; i++) {
            float f11 = fArr[0][i][0];
            float f12 = Float.MIN_VALUE;
            if (fVar.k() > 0.0d) {
                if (f11 < (-fVar.k())) {
                    f11 = -((float) fVar.k());
                }
                if (f11 > fVar.k()) {
                    f11 = (float) fVar.k();
                }
                float exp = 1.0f / (((float) Math.exp(-f11)) + 1.0f);
                if (exp > Float.MIN_VALUE) {
                    f12 = exp;
                }
            }
            arrayList.add(Float.valueOf(f12));
        }
        List<c> a10 = a(a(fVar, fArr2, arrayList, list), fVar.b());
        if (fVar.d() != -1) {
            a10 = a(a10, fVar.d());
        }
        return a(a10, size);
    }

    public final List<c> a(f fVar, float[][][] fArr, List<Float> list, List<com.sumsub.sns.internal.ml.facedetector.models.a> list2) {
        ArrayList arrayList = new ArrayList();
        int f10 = fVar.f();
        for (int i = 0; i < f10; i++) {
            if (list.get(i).floatValue() >= fVar.e()) {
                arrayList.add(a(a(fArr[0], i, list2, fVar), list.get(i).floatValue()));
            }
        }
        return arrayList;
    }

    public final float[] a(float[][] fArr, int i, List<com.sumsub.sns.internal.ml.facedetector.models.a> list, f fVar) {
        float[] fArr2 = new float[fVar.h()];
        float[] fArr3 = fArr[i];
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float c2 = list.get(i).c() + (list.get(i).b() * (f10 / fVar.m()));
        float d10 = list.get(i).d() + (list.get(i).a() * (f11 / fVar.n()));
        float a10 = list.get(i).a() * (f13 / fVar.a());
        float b9 = list.get(i).b() * (f12 / fVar.l());
        float f14 = 2;
        float f15 = a10 / f14;
        float f16 = b9 / f14;
        fArr2[0] = d10 - f15;
        fArr2[1] = c2 - f16;
        fArr2[2] = d10 + f15;
        fArr2[3] = c2 + f16;
        if (fVar.i() > 0) {
            int i9 = fVar.i();
            for (int i10 = 0; i10 < i9; i10++) {
                int j10 = (fVar.j() * i10) + fVar.c();
                float[] fArr4 = fArr[i];
                float f17 = fArr4[j10];
                float f18 = fArr4[j10 + 1];
                fArr2[(fVar.j() * i10) + 4] = list.get(i).c() + (list.get(i).b() * (f17 / fVar.m()));
                fArr2[(fVar.j() * i10) + 5] = list.get(i).d() + (list.get(i).a() * (f18 / fVar.n()));
            }
        }
        return fArr2;
    }

    public final c a(float[] fArr, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i = 4; i < fArr.length - 1; i += 2) {
            arrayList.add(new PointF(fArr[i], fArr[i + 1]));
        }
        return new c(f10, new RectF(fArr[1], fArr[0], fArr[3], fArr[2]), arrayList);
    }

    public final List<c> a(List<c> list, float f10) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        q.D(list, new B9.a(2));
        while (!list.isEmpty()) {
            int size = list.size();
            arrayList3.clear();
            arrayList2.clear();
            int i = 0;
            c cVar = list.get(0);
            for (c cVar2 : list) {
                if (a(cVar2.a(), cVar.a()) > f10) {
                    arrayList3.add(cVar2);
                } else {
                    arrayList2.add(cVar2);
                }
            }
            if (!arrayList3.isEmpty()) {
                RectF rectF = new RectF();
                ArrayList arrayList4 = new ArrayList(cVar.b().size());
                int size2 = cVar.b().size();
                for (int i9 = 0; i9 < size2; i9++) {
                    arrayList4.add(new PointF());
                }
                Iterator it = arrayList3.iterator();
                float f11 = 0.0f;
                while (it.hasNext()) {
                    c cVar3 = (c) it.next();
                    f11 += cVar3.c();
                    rectF.top = (cVar3.c() * cVar3.a().top) + rectF.top;
                    rectF.bottom = (cVar3.c() * cVar3.a().bottom) + rectF.bottom;
                    rectF.left = (cVar3.c() * cVar3.a().left) + rectF.left;
                    rectF.right = (cVar3.c() * cVar3.a().right) + rectF.right;
                    int size3 = arrayList4.size();
                    int i10 = i;
                    while (i10 < size3) {
                        PointF pointF = (PointF) arrayList4.get(i10);
                        pointF.x = (cVar3.c() * cVar3.b().get(i10).x) + pointF.x;
                        PointF pointF2 = (PointF) arrayList4.get(i10);
                        pointF2.y = (cVar3.c() * cVar3.b().get(i10).y) + pointF2.y;
                        i10++;
                        i = 0;
                    }
                }
                rectF.top /= f11;
                rectF.bottom /= f11;
                rectF.left /= f11;
                rectF.right /= f11;
                int size4 = arrayList4.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    ((PointF) arrayList4.get(i11)).x /= f11;
                    ((PointF) arrayList4.get(i11)).y /= f11;
                }
                cVar = new c(f11 / arrayList3.size(), rectF, arrayList4);
            }
            arrayList.add(cVar);
            if (size == arrayList2.size()) {
                break;
            }
            list.clear();
            list.addAll(arrayList2);
        }
        return arrayList;
    }

    public final float a(RectF rectF, RectF rectF2) {
        float max = Math.max(rectF.left, rectF2.left);
        float max2 = Math.max(rectF.top, rectF2.top);
        float min = Math.min(rectF.right, rectF2.right);
        float max3 = Math.max(0.0f, min - max) * Math.max(0.0f, Math.min(rectF.bottom, rectF2.bottom) - max2);
        return max3 / ((a(rectF2) + a(rectF)) - max3);
    }

    public final float a(RectF rectF) {
        return (rectF.bottom - rectF.top) * (rectF.right - rectF.left);
    }

    public final List<c> a(List<c> list, int i) {
        if (list.size() == 0) {
            return list;
        }
        q.D(list, new B9.a(1));
        return list.subList(0, Math.min(i, list.size()));
    }

    public static final int a(c cVar, c cVar2) {
        return Float.compare(cVar2.c(), cVar.c());
    }

    public final List<c> a(List<c> list, Size size) {
        float width;
        float f10;
        if (size.getWidth() == size.getHeight()) {
            return list;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (size.getWidth() < size.getHeight()) {
            f10 = (1.0f - (size.getWidth() / size.getHeight())) / 2.0f;
            f12 = size.getHeight() / size.getWidth();
            width = 1.0f;
        } else {
            width = size.getWidth() / size.getHeight();
            f11 = (1.0f - (size.getHeight() / size.getWidth())) / 2.0f;
            f10 = 0.0f;
        }
        for (c cVar : list) {
            cVar.a().left -= f10;
            cVar.a().left *= f12;
            cVar.a().right -= f10;
            cVar.a().right *= f12;
            cVar.a().top -= f11;
            cVar.a().top *= width;
            cVar.a().bottom -= f11;
            cVar.a().bottom *= width;
            int size2 = cVar.b().size();
            for (int i = 0; i < size2; i++) {
                cVar.b().get(i).x -= f10;
                cVar.b().get(i).x *= f12;
                cVar.b().get(i).y -= f11;
                cVar.b().get(i).y *= width;
            }
        }
        return list;
    }
}
