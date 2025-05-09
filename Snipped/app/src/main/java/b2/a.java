package B2;

/* compiled from: Arrangement.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f274a;

    /* renamed from: b, reason: collision with root package name */
    public final float f275b;

    /* renamed from: c, reason: collision with root package name */
    public int f276c;

    /* renamed from: d, reason: collision with root package name */
    public int f277d;

    /* renamed from: e, reason: collision with root package name */
    public final float f278e;

    /* renamed from: f, reason: collision with root package name */
    public final float f279f;

    /* renamed from: g, reason: collision with root package name */
    public final int f280g;

    /* renamed from: h, reason: collision with root package name */
    public final float f281h;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r6 > r3.f275b) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r3.f279f <= r3.f275b) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static a a(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i = 1;
        for (int i9 : iArr3) {
            int length = iArr2.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr2[i10];
                int length2 = iArr.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12;
                    int i14 = length2;
                    int i15 = i10;
                    int i16 = length;
                    a aVar2 = new a(i, f11, f12, f13, iArr[i12], f14, i11, f15, i9, f10);
                    float f16 = aVar2.f281h;
                    if (aVar == null || f16 < aVar.f281h) {
                        if (f16 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i++;
                    i12 = i13 + 1;
                    length2 = i14;
                    i10 = i15;
                    length = i16;
                }
                i10++;
            }
        }
        return aVar;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f274a + ", smallCount=" + this.f276c + ", smallSize=" + this.f275b + ", mediumCount=" + this.f277d + ", mediumSize=" + this.f278e + ", largeCount=" + this.f280g + ", largeSize=" + this.f279f + ", cost=" + this.f281h + "]";
    }
}
