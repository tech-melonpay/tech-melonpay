package a0;

import x0.d;

/* compiled from: Pools.java */
/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0506b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4245a;

    /* renamed from: b, reason: collision with root package name */
    public int f4246b;

    public C0506b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f4245a = new Object[i];
    }

    public void a(Object obj) {
        int i = this.f4246b;
        Object[] objArr = this.f4245a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f4246b = i + 1;
        }
    }

    @Override // x0.d
    public Object acquire() {
        int i = this.f4246b;
        if (i <= 0) {
            return null;
        }
        int i9 = i - 1;
        Object[] objArr = this.f4245a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f4246b = i - 1;
        return obj;
    }

    @Override // x0.d
    public boolean release(Object obj) {
        Object[] objArr;
        boolean z10;
        int i = this.f4246b;
        int i9 = 0;
        while (true) {
            objArr = this.f4245a;
            if (i9 >= i) {
                z10 = false;
                break;
            }
            if (objArr[i9] == obj) {
                z10 = true;
                break;
            }
            i9++;
        }
        if (!(!z10)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i10 = this.f4246b;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f4246b = i10 + 1;
        return true;
    }

    public C0506b() {
        this.f4245a = new Object[256];
    }
}
