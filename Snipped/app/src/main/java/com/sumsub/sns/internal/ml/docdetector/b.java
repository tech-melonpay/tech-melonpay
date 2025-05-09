package com.sumsub.sns.internal.ml.docdetector;

import O9.f;
import P9.s;
import V9.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import ca.InterfaceC0635a;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.ml.autocapture.a;
import com.sumsub.sns.internal.ml.core.a;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import va.h;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.internal.ml.core.b<Bitmap, com.sumsub.sns.internal.ml.docdetector.a> {

    /* renamed from: h, reason: collision with root package name */
    public final Context f17699h;
    public final a.C0270a i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f17700j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f17701k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f17702l;

    /* renamed from: m, reason: collision with root package name */
    public final f f17703m;

    /* renamed from: n, reason: collision with root package name */
    public int f17704n;

    /* renamed from: o, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.core.a f17705o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17706p;

    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17707a;

        public a(int i) {
            this.f17707a = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return R9.a.a(Float.valueOf(((float[]) t10)[this.f17707a]), Float.valueOf(((float[]) t3)[this.f17707a]));
        }
    }

    @d(c = "com.sumsub.sns.internal.ml.docdetector.DocDetector", f = "DocDetector.kt", l = {151}, m = "detect")
    /* renamed from: com.sumsub.sns.internal.ml.docdetector.b$b, reason: collision with other inner class name */
    public static final class C0279b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f17708a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17709b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17710c;

        /* renamed from: e, reason: collision with root package name */
        public int f17712e;

        public C0279b(T9.a<? super C0279b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17710c = obj;
            this.f17712e |= Integer.MIN_VALUE;
            return b.this.a((Bitmap) null, false, (T9.a<? super com.sumsub.sns.internal.ml.docdetector.a>) this);
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<float[][][]> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[][][] invoke() {
            int i = b.this.f17704n;
            float[][] fArr = new float[i][];
            for (int i9 = 0; i9 < i; i9++) {
                fArr[i9] = new float[5];
            }
            return new float[][][]{fArr};
        }
    }

    public b(Context context, h hVar, String str, a.C0270a c0270a) {
        super("MlSolution.DocCapture");
        this.f17699h = context;
        this.i = c0270a;
        this.f17700j = new int[0];
        this.f17701k = ByteBuffer.allocateDirect(0);
        this.f17702l = ByteBuffer.allocateDirect(0);
        this.f17703m = kotlin.a.a(new c());
        this.f17706p = "Doc bounds detector";
        this.f17705o = new a.b(context, hVar, str, c0270a.a(), "MlSolution.DocCapture");
        this.f17700j = new int[l().getHeight() * l().getWidth()];
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(l().getHeight() * l().getWidth() * 12);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f17701k = allocateDirect;
        int j10 = c0270a.j();
        this.f17704n = j10;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(j10 * 20);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f17702l = allocateDirect2;
    }

    public final void b(Bitmap bitmap) {
        File externalFilesDir = this.f17699h.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return;
        }
        File file = new File(externalFilesDir, "scaled_frame_" + System.currentTimeMillis() + ".jpg");
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        Logger.v$default(aVar, "MlSolution.DocCapture", "saving to " + file.getAbsolutePath(), null, 4, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (compress) {
            Logger.v$default(aVar, "MlSolution.DocCapture", "saved!", null, 4, null);
        }
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public com.sumsub.sns.internal.ml.core.a e() {
        return this.f17705o;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Map<Integer, Object> g() {
        HashMap hashMap = new HashMap();
        this.f17702l.rewind();
        hashMap.put(0, this.f17702l);
        return hashMap;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public String h() {
        return this.f17706p;
    }

    public final Size l() {
        return this.i.i();
    }

    public final float[][][] n() {
        return (float[][][]) this.f17703m.getValue();
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Object[] a(Bitmap bitmap) {
        bitmap.getPixels(this.f17700j, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f17701k.rewind();
        int height = l().getHeight();
        for (int i = 0; i < height; i++) {
            int width = l().getWidth();
            for (int i9 = 0; i9 < width; i9++) {
                int i10 = this.f17700j[(l().getWidth() * i) + i9];
                this.f17701k.putFloat((((i10 >> 16) & 255) - 0.0f) / 255.0f);
                this.f17701k.putFloat((((i10 >> 8) & 255) - 0.0f) / 255.0f);
                this.f17701k.putFloat(((i10 & 255) - 0.0f) / 255.0f);
            }
        }
        return new Object[]{this.f17701k};
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public com.sumsub.sns.internal.ml.docdetector.a a(Bitmap bitmap, long j10) {
        this.f17702l.rewind();
        for (int i = 0; i < 5; i++) {
            int i9 = this.f17704n;
            for (int i10 = 0; i10 < i9; i10++) {
                n()[0][i10][i] = this.f17702l.getFloat();
            }
            int i11 = this.f17704n;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i < 4) {
                    if (i % 2 == 0) {
                        float[] fArr = n()[0][i12];
                        fArr[i] = fArr[i] * l().getWidth();
                    } else {
                        float[] fArr2 = n()[0][i12];
                        fArr2[i] = fArr2[i] * l().getHeight();
                    }
                }
            }
        }
        float[][] fArr3 = n()[0];
        ArrayList arrayList = new ArrayList();
        for (float[] fArr4 : fArr3) {
            if (fArr4[4] > this.i.c()) {
                arrayList.add(fArr4);
            }
        }
        List X = s.X(arrayList, new a(4));
        if (X.isEmpty()) {
            return null;
        }
        float[] fArr5 = (float[]) s.J(X);
        return new com.sumsub.sns.internal.ml.docdetector.a((int) fArr5[0], (int) fArr5[1], (int) fArr5[2], (int) fArr5[3], fArr5[4], j10, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r13, boolean r14, T9.a<? super com.sumsub.sns.internal.ml.docdetector.a> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.sumsub.sns.internal.ml.docdetector.b.C0279b
            if (r0 == 0) goto L13
            r0 = r15
            com.sumsub.sns.internal.ml.docdetector.b$b r0 = (com.sumsub.sns.internal.ml.docdetector.b.C0279b) r0
            int r1 = r0.f17712e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17712e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.ml.docdetector.b$b r0 = new com.sumsub.sns.internal.ml.docdetector.b$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f17710c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17712e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r13 = r0.f17708a
            java.lang.Object r0 = r0.f17709b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            kotlin.b.b(r15)
            goto L65
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.b.b(r15)
            long r4 = java.lang.System.currentTimeMillis()
            android.util.Size r15 = r12.l()
            int r15 = r15.getWidth()
            android.util.Size r2 = r12.l()
            int r2 = r2.getHeight()
            r6 = 0
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r13, r15, r2, r6)
            if (r14 == 0) goto L56
            r12.b(r13)
        L56:
            r0.f17709b = r13
            r0.f17708a = r4
            r0.f17712e = r3
            java.lang.Object r15 = r12.a(r13, r0)
            if (r15 != r1) goto L63
            return r1
        L63:
            r0 = r13
            r13 = r4
        L65:
            com.sumsub.sns.internal.ml.core.e$a r15 = (com.sumsub.sns.internal.ml.core.e.a) r15
            r0.recycle()
            boolean r0 = r15 instanceof com.sumsub.sns.internal.ml.core.e.a.d
            if (r0 == 0) goto L8e
            com.sumsub.sns.internal.ml.core.e$a$d r15 = (com.sumsub.sns.internal.ml.core.e.a.d) r15
            java.lang.Object r15 = r15.c()
            r0 = r15
            com.sumsub.sns.internal.ml.docdetector.a r0 = (com.sumsub.sns.internal.ml.docdetector.a) r0
            if (r0 == 0) goto L8e
            long r1 = java.lang.System.currentTimeMillis()
            long r8 = r1 - r13
            r10 = 63
            r11 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.sumsub.sns.internal.ml.docdetector.a r13 = com.sumsub.sns.internal.ml.docdetector.a.a(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11)
            goto L8f
        L8e:
            r13 = 0
        L8f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.ml.docdetector.b.a(android.graphics.Bitmap, boolean, T9.a):java.lang.Object");
    }
}
