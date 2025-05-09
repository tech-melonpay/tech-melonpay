package com.chuckerteam.chucker.internal.support;

import O9.p;
import V9.d;
import Y0.b;
import Y0.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.SparseBooleanArray;
import ca.InterfaceC0650p;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BitmapUtils.kt */
@d(c = "com.chuckerteam.chucker.internal.support.BitmapUtilsKt$calculateLuminance$2", f = "BitmapUtils.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapUtilsKt$calculateLuminance$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Double>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Bitmap f8625u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8626v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapUtilsKt$calculateLuminance$2(Bitmap bitmap, int i, T9.a<? super BitmapUtilsKt$calculateLuminance$2> aVar) {
        super(2, aVar);
        this.f8625u = bitmap;
        this.f8626v = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new BitmapUtilsKt$calculateLuminance$2(this.f8625u, this.f8626v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Double> aVar) {
        return ((BitmapUtilsKt$calculateLuminance$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        boolean z10;
        int i9;
        int i10 = 1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        Paint paint = BitmapUtilsKt.f8624a;
        Bitmap bitmap = this.f8625u;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        final int i11 = this.f8626v;
        createBitmap.eraseColor(i11);
        new Canvas(createBitmap).drawBitmap(bitmap, new Matrix(), BitmapUtilsKt.f8624a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (createBitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList3.add(Y0.b.f4079a);
        arrayList2.add(c.f4088e);
        arrayList2.add(c.f4089f);
        arrayList2.add(c.f4090g);
        arrayList2.add(c.f4091h);
        arrayList2.add(c.i);
        arrayList2.add(c.f4092j);
        arrayList3.clear();
        arrayList3.add(new b.InterfaceC0050b() { // from class: S1.a
            @Override // Y0.b.InterfaceC0050b
            public final boolean a(float[] fArr, int i12) {
                return i12 != i11;
            }
        });
        int height = createBitmap.getHeight() * createBitmap.getWidth();
        double sqrt = height > 12544 ? Math.sqrt(12544 / height) : -1.0d;
        int i12 = 0;
        Bitmap createScaledBitmap = sqrt <= 0.0d ? createBitmap : Bitmap.createScaledBitmap(createBitmap, (int) Math.ceil(createBitmap.getWidth() * sqrt), (int) Math.ceil(createBitmap.getHeight() * sqrt), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        Y0.a aVar = new Y0.a(iArr, 16, arrayList3.isEmpty() ? null : (b.InterfaceC0050b[]) arrayList3.toArray(new b.InterfaceC0050b[arrayList3.size()]));
        if (createScaledBitmap != createBitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList4 = aVar.f4067c;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        androidx.collection.a aVar2 = new androidx.collection.a();
        int size = arrayList4.size();
        int i13 = Integer.MIN_VALUE;
        b.c cVar = null;
        for (int i14 = 0; i14 < size; i14++) {
            b.c cVar2 = (b.c) arrayList4.get(i14);
            int i15 = cVar2.f4084e;
            if (i15 > i13) {
                cVar = cVar2;
                i13 = i15;
            }
        }
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            c cVar3 = (c) arrayList2.get(i16);
            float[] fArr = cVar3.f4095c;
            int length = fArr.length;
            boolean z11 = false;
            float f10 = 0.0f;
            for (int i17 = i12; i17 < length; i17 += i10) {
                float f11 = fArr[i17];
                if (f11 > 0.0f) {
                    f10 += f11;
                }
            }
            if (f10 != 0.0f) {
                int length2 = fArr.length;
                for (int i18 = i12; i18 < length2; i18 += i10) {
                    float f12 = fArr[i18];
                    if (f12 > 0.0f) {
                        fArr[i18] = f12 / f10;
                    }
                }
            }
            int size3 = arrayList4.size();
            int i19 = i12;
            float f13 = 0.0f;
            b.c cVar4 = null;
            while (i19 < size3) {
                b.c cVar5 = (b.c) arrayList4.get(i19);
                float[] b9 = cVar5.b();
                float f14 = b9[i10];
                float[] fArr2 = cVar3.f4093a;
                if (f14 < fArr2[i12] || f14 > fArr2[2]) {
                    arrayList = arrayList2;
                    i = i12;
                    z10 = z11;
                } else {
                    float f15 = b9[2];
                    float[] fArr3 = cVar3.f4094b;
                    if (f15 < fArr3[i12] || f15 > fArr3[2]) {
                        arrayList = arrayList2;
                        i = i12;
                    } else if (sparseBooleanArray.get(cVar5.f4083d)) {
                        arrayList = arrayList2;
                        i = 0;
                    } else {
                        float[] b10 = cVar5.b();
                        if (cVar != null) {
                            i9 = cVar.f4084e;
                            arrayList = arrayList2;
                        } else {
                            arrayList = arrayList2;
                            i9 = 1;
                        }
                        float[] fArr4 = cVar3.f4095c;
                        i = 0;
                        float f16 = fArr4[0];
                        float abs = f16 > 0.0f ? (1.0f - Math.abs(b10[1] - fArr2[1])) * f16 : 0.0f;
                        float f17 = fArr4[1];
                        float abs2 = f17 > 0.0f ? (1.0f - Math.abs(b10[2] - fArr3[1])) * f17 : 0.0f;
                        float f18 = fArr4[2];
                        z10 = false;
                        float f19 = abs + abs2 + (f18 > 0.0f ? (cVar5.f4084e / i9) * f18 : 0.0f);
                        if (cVar4 == null || f19 > f13) {
                            f13 = f19;
                            cVar4 = cVar5;
                        }
                    }
                    z10 = false;
                }
                i19++;
                i10 = 1;
                i12 = i;
                z11 = z10;
                arrayList2 = arrayList;
            }
            boolean z12 = i10;
            ArrayList arrayList5 = arrayList2;
            int i20 = i12;
            if (cVar4 != null && cVar3.f4096d) {
                sparseBooleanArray.append(cVar4.f4083d, z12);
            }
            aVar2.put(cVar3, cVar4);
            i16 += z12 ? 1 : 0;
            i10 = z12 ? 1 : 0;
            i12 = i20;
            arrayList2 = arrayList5;
        }
        sparseBooleanArray.clear();
        if (cVar != null) {
            return Double.valueOf(n0.a.d(cVar.f4083d));
        }
        return null;
    }
}
