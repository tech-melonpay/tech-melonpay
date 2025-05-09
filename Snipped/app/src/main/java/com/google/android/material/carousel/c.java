package com.google.android.material.carousel;

import B2.h;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u2.C1512a;

/* compiled from: KeylineStateList.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f9255a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f9256b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f9257c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f9258d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f9259e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9260f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9261g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f9255a = bVar;
        this.f9256b = Collections.unmodifiableList(arrayList);
        this.f9257c = Collections.unmodifiableList(arrayList2);
        float f10 = ((b) com.google.android.gms.measurement.internal.a.f(1, arrayList)).b().f9247a - bVar.b().f9247a;
        this.f9260f = f10;
        float f11 = bVar.d().f9247a - ((b) com.google.android.gms.measurement.internal.a.f(1, arrayList2)).d().f9247a;
        this.f9261g = f11;
        this.f9258d = d(f10, arrayList, true);
        this.f9259e = d(f11, arrayList2, false);
    }

    public static float[] d(float f10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i9 = i - 1;
            b bVar = (b) arrayList.get(i9);
            b bVar2 = (b) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i9] + ((z10 ? bVar2.b().f9247a - bVar.b().f9247a : bVar.d().f9247a - bVar2.d().f9247a) / f10);
            i++;
        }
        return fArr;
    }

    public static b e(b bVar, int i, int i9, float f10, int i10, int i11, float f11) {
        ArrayList arrayList = new ArrayList(bVar.f9236b);
        arrayList.add(i9, (b.C0102b) arrayList.remove(i));
        b.a aVar = new b.a(bVar.f9235a, f11);
        float f12 = f10;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            b.C0102b c0102b = (b.C0102b) arrayList.get(i12);
            float f13 = c0102b.f9250d;
            aVar.b((f13 / 2.0f) + f12, c0102b.f9249c, f13, i12 >= i10 && i12 <= i11, c0102b.f9251e, c0102b.f9252f, 0.0f, 0.0f);
            f12 += c0102b.f9250d;
            i12++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f10, float f11, boolean z10, float f12) {
        int i;
        List<b.C0102b> list = bVar.f9236b;
        ArrayList arrayList = new ArrayList(list);
        float f13 = bVar.f9235a;
        b.a aVar = new b.a(f13, f11);
        Iterator<b.C0102b> it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (it.next().f9251e) {
                i9++;
            }
        }
        float size = f10 / (list.size() - i9);
        float f14 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            b.C0102b c0102b = (b.C0102b) arrayList.get(i10);
            if (c0102b.f9251e) {
                i = i10;
                aVar.b(c0102b.f9248b, c0102b.f9249c, c0102b.f9250d, false, true, c0102b.f9252f, 0.0f, 0.0f);
            } else {
                i = i10;
                boolean z11 = i >= bVar.f9237c && i <= bVar.f9238d;
                float f15 = c0102b.f9250d - size;
                float a10 = h.a(f15, f13, f12);
                float f16 = (f15 / 2.0f) + f14;
                float f17 = f16 - c0102b.f9248b;
                aVar.b(f16, a10, f15, z11, false, c0102b.f9252f, z10 ? f17 : 0.0f, z10 ? 0.0f : f17);
                f14 += f15;
            }
            i10 = i + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return this.f9257c.get(r0.size() - 1);
    }

    public final b b(float f10, float f11, float f12) {
        float b9;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f9260f;
        float f14 = f11 + f13;
        float f15 = this.f9261g;
        float f16 = f12 - f15;
        float f17 = c().a().f9253g;
        float f18 = a().c().f9254h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f10 < f14) {
            b9 = C1512a.b(1.0f, 0.0f, f11, f14, f10);
            list = this.f9256b;
            fArr = this.f9258d;
        } else {
            if (f10 <= f16) {
                return this.f9255a;
            }
            b9 = C1512a.b(0.0f, 1.0f, f16, f12, f10);
            list = this.f9257c;
            fArr = this.f9259e;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f20 = fArr[i];
            if (b9 <= f20) {
                fArr2 = new float[]{C1512a.b(0.0f, 1.0f, f19, f20, b9), i - 1, i};
                break;
            }
            i++;
            f19 = f20;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        if (bVar.f9235a != bVar2.f9235a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0102b> list2 = bVar.f9236b;
        int size2 = list2.size();
        List<b.C0102b> list3 = bVar2.f9236b;
        if (size2 != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list2.size(); i9++) {
            b.C0102b c0102b = list2.get(i9);
            b.C0102b c0102b2 = list3.get(i9);
            arrayList.add(new b.C0102b(C1512a.a(c0102b.f9247a, c0102b2.f9247a, f21), C1512a.a(c0102b.f9248b, c0102b2.f9248b, f21), C1512a.a(c0102b.f9249c, c0102b2.f9249c, f21), C1512a.a(c0102b.f9250d, c0102b2.f9250d, f21), false, 0.0f, 0.0f, 0.0f));
        }
        return new b(bVar.f9235a, arrayList, C1512a.c(bVar.f9237c, f21, bVar2.f9237c), C1512a.c(bVar.f9238d, f21, bVar2.f9238d));
    }

    public final b c() {
        return this.f9256b.get(r0.size() - 1);
    }
}
