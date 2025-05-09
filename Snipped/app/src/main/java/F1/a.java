package F1;

import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

/* compiled from: CircularProgressIndicator.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CircularProgressIndicator f1157c;

    public a(CircularProgressIndicator circularProgressIndicator, int i, int i9) {
        this.f1157c = circularProgressIndicator;
        this.f1155a = i;
        this.f1156b = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator r0 = r13.f1157c
            int r1 = r0.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r2 = r3 / r2
            android.graphics.Paint r3 = r0.f8251a
            int r9 = r3.getColor()
            r3 = 1
            int r4 = r13.f1155a
            int r10 = r13.f1156b
            if (r4 == r3) goto L41
            r3 = 2
            if (r4 == r3) goto L31
            r3 = 3
            r5 = 0
            if (r4 == r3) goto L26
            goto L56
        L26:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r4 = new int[]{r9, r10}
            r3.<init>(r1, r2, r4, r5)
        L2f:
            r5 = r3
            goto L56
        L31:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.MIRROR
            r3 = r11
            r4 = r1
            r5 = r2
            r6 = r1
            r7 = r9
            r8 = r10
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r5 = r11
            goto L56
        L41:
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int r4 = r0.getWidth()
            float r7 = (float) r4
            int r4 = r0.getHeight()
            float r8 = (float) r4
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r5 = 0
            r6 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L2f
        L56:
            if (r5 == 0) goto L66
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r4 = r0.f8255e
            float r4 = (float) r4
            r3.postRotate(r4, r1, r2)
            r5.setLocalMatrix(r3)
        L66:
            android.graphics.Paint r1 = r0.f8251a
            r1.setShader(r5)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.a.run():void");
    }
}
