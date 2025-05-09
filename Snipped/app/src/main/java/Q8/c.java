package Q8;

import P9.w;
import ha.C0805d;
import ha.C0806e;
import ha.h;
import java.util.Iterator;

/* compiled from: OnPageChangeListenerHelper.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f3204a;

    /* renamed from: b, reason: collision with root package name */
    public int f3205b;

    public abstract int a();

    public final void b(int i, float f10) {
        float f11 = i + f10;
        float a10 = a() - 1;
        if (f11 == a10) {
            f11 = a10 - 1.0E-4f;
        }
        int i9 = (int) f11;
        int i10 = i9 + 1;
        if (i10 > a10 || i9 < 0) {
            return;
        }
        c(i9, f11 % 1, i10);
        int i11 = this.f3204a;
        if (i11 != -1) {
            if (i9 > i11) {
                Iterator<Integer> it = h.V(i11, i9).iterator();
                while (((C0805d) it).f21231c) {
                    d(((w) it).a());
                }
            }
            int i12 = this.f3205b;
            if (i10 < i12) {
                d(i12);
                Iterator<Integer> it2 = new C0806e(i9 + 2, this.f3205b, 1).iterator();
                while (((C0805d) it2).f21231c) {
                    d(((w) it2).a());
                }
            }
        }
        this.f3204a = i9;
        this.f3205b = i10;
    }

    public abstract void c(int i, float f10, int i9);

    public abstract void d(int i);
}
