package com.sumsub.sns.internal.ml.facedetector.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17766a = new a();

    public final double a(double d10, double d11, int i, int i9) {
        return i9 == 1 ? (d10 + d11) * 0.5d : d10 + ((((d11 - d10) * 1.0d) * i) / (i9 - 1.0f));
    }

    public final List<com.sumsub.sns.internal.ml.facedetector.models.a> a(com.sumsub.sns.internal.ml.facedetector.models.b bVar) {
        double d10;
        int ceil;
        int ceil2;
        int i;
        double doubleValue;
        ArrayList arrayList;
        ArrayList arrayList2;
        double doubleValue2;
        if (bVar.k() <= 0) {
            throw new IllegalArgumentException(("NumLayers must be greater than 0, numLayers: " + bVar.k()).toString());
        }
        int k3 = bVar.k();
        List<Integer> l10 = bVar.l();
        Objects.requireNonNull(l10);
        if (k3 != l10.size()) {
            throw new IllegalArgumentException("Strides size must equal to NumLayers".toString());
        }
        ArrayList arrayList3 = new ArrayList();
        int i9 = 0;
        while (i9 < bVar.k()) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            int i10 = i9;
            while (true) {
                if (i10 >= bVar.l().size() || bVar.l().get(i10).intValue() != bVar.l().get(i9).intValue()) {
                    break;
                }
                double a10 = a(bVar.j(), bVar.i(), i10, bVar.l().size());
                if (i10 == 0 && bVar.n()) {
                    arrayList6.add(Double.valueOf(1.0d));
                    arrayList6.add(Double.valueOf(2.0d));
                    arrayList6.add(Double.valueOf(0.5d));
                    arrayList7.add(Double.valueOf(0.1d));
                    arrayList7.add(Double.valueOf(a10));
                    arrayList7.add(Double.valueOf(a10));
                } else {
                    int size = bVar.c().size();
                    for (int i11 = 0; i11 < size; i11++) {
                        arrayList6.add(bVar.c().get(i11));
                        arrayList7.add(Double.valueOf(a10));
                    }
                    if (bVar.h() > 0.0d) {
                        arrayList7.add(Double.valueOf(Math.sqrt(a10 * (i10 != bVar.l().size() - 1 ? a(bVar.j(), bVar.i(), i10, bVar.l().size()) : 1.0d))));
                        arrayList6.add(Double.valueOf(bVar.h()));
                    }
                }
                i10++;
            }
            int size2 = arrayList6.size();
            for (int i12 = 0; i12 < size2; i12++) {
                double sqrt = Math.sqrt(((Number) arrayList6.get(i12)).doubleValue());
                arrayList4.add(Double.valueOf(((Number) arrayList7.get(i12)).doubleValue() / sqrt));
                arrayList5.add(Double.valueOf(((Number) arrayList7.get(i12)).doubleValue() * sqrt));
            }
            if (!bVar.d().isEmpty()) {
                ceil = bVar.d().get(i9).intValue();
                ceil2 = bVar.e().get(i9).intValue();
            } else {
                double intValue = bVar.l().get(i9).intValue();
                ceil = (int) Math.ceil((bVar.f() * 1.0d) / intValue);
                ceil2 = (int) Math.ceil((bVar.g() * 1.0d) / intValue);
            }
            int i13 = 0;
            while (i13 < ceil) {
                int i14 = 0;
                while (i14 < ceil2) {
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        double a11 = ((bVar.a() + i14) * d10) / ceil2;
                        double b9 = ((bVar.b() + i13) * d10) / ceil;
                        if (bVar.m()) {
                            i = ceil2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            doubleValue = d10;
                            doubleValue2 = doubleValue;
                        } else {
                            i = ceil2;
                            doubleValue = ((Number) arrayList5.get(i15)).doubleValue();
                            arrayList = arrayList4;
                            arrayList2 = arrayList5;
                            doubleValue2 = ((Number) arrayList4.get(i15)).doubleValue();
                        }
                        arrayList3.add(new com.sumsub.sns.internal.ml.facedetector.models.a((float) a11, (float) b9, (float) doubleValue, (float) doubleValue2));
                        i15++;
                        arrayList4 = arrayList;
                        arrayList5 = arrayList2;
                        ceil2 = i;
                        d10 = 1.0d;
                    }
                    i14++;
                    d10 = 1.0d;
                }
                i13++;
                d10 = 1.0d;
            }
            i9 = i10;
        }
        return arrayList3;
    }
}
