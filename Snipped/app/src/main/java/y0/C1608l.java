package y0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* renamed from: y0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608l {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f31080a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f31081b;

    /* renamed from: c, reason: collision with root package name */
    public final View f31082c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31083d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f31084e;

    public C1608l(View view) {
        this.f31082c = view;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent f12;
        if (!this.f31083d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedFling(this.f31082c, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f31083d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedPreFling(this.f31082c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent f10;
        int i11;
        int i12;
        int[] iArr3;
        if (!this.f31083d || (f10 = f(i10)) == null) {
            return false;
        }
        if (i == 0 && i9 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f31082c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            if (this.f31084e == null) {
                this.f31084e = new int[2];
            }
            iArr3 = this.f31084e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z10 = f10 instanceof m;
        View view2 = this.f31082c;
        if (z10) {
            ((m) f10).onNestedPreScroll(view2, i, i9, iArr3, i10);
        } else if (i10 == 0) {
            try {
                f10.onNestedPreScroll(view2, i, i9, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        e(i, i9, i10, i11, iArr, i12, iArr2);
    }

    public final boolean e(int i, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f31083d || (f10 = f(i12)) == null) {
            return false;
        }
        if (i == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f31082c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i13 = iArr[0];
            i14 = iArr[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            if (this.f31084e == null) {
                this.f31084e = new int[2];
            }
            int[] iArr4 = this.f31084e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z10 = f10 instanceof n;
        View view2 = this.f31082c;
        if (z10) {
            ((n) f10).onNestedScroll(view2, i, i9, i10, i11, i12, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i10;
            iArr3[1] = iArr3[1] + i11;
            if (f10 instanceof m) {
                ((m) f10).onNestedScroll(view2, i, i9, i10, i11, i12);
            } else if (i12 == 0) {
                try {
                    f10.onNestedScroll(view2, i, i9, i10, i11);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.f31080a;
        }
        if (i != 1) {
            return null;
        }
        return this.f31081b;
    }

    public final boolean g(int i) {
        return f(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.f31083d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f31082c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof y0.m
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            y0.m r7 = (y0.m) r7
            boolean r7 = r7.onStartNestedScroll(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = r2.onStartNestedScroll(r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f31081b = r2
            goto L37
        L35:
            r8.f31080a = r2
        L37:
            if (r4 == 0) goto L3f
            y0.m r2 = (y0.m) r2
            r2.onNestedScrollAccepted(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            r2.onNestedScrollAccepted(r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C1608l.h(int, int):boolean");
    }

    public final void i(int i) {
        ViewParent f10 = f(i);
        if (f10 != null) {
            boolean z10 = f10 instanceof m;
            View view = this.f31082c;
            if (z10) {
                ((m) f10).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    f10.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i == 0) {
                this.f31080a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f31081b = null;
            }
        }
    }
}
