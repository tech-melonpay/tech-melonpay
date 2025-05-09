package ra;

import ca.InterfaceC0650p;

/* compiled from: ElementMarker.kt */
/* renamed from: ra.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1187w {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f26444e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final pa.f f26445a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0650p<pa.f, Integer, Boolean> f26446b;

    /* renamed from: c, reason: collision with root package name */
    public long f26447c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f26448d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1187w(pa.f fVar, InterfaceC0650p<? super pa.f, ? super Integer, Boolean> interfaceC0650p) {
        this.f26445a = fVar;
        this.f26446b = interfaceC0650p;
        int f10 = fVar.f();
        if (f10 <= 64) {
            this.f26447c = f10 != 64 ? (-1) << f10 : 0L;
            this.f26448d = f26444e;
            return;
        }
        this.f26447c = 0L;
        int i = (f10 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f10 & 63) != 0) {
            jArr[i - 1] = (-1) << f10;
        }
        this.f26448d = jArr;
    }
}
