package ha;

import P9.w;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* renamed from: ha.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0805d extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f21229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21230b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21231c;

    /* renamed from: d, reason: collision with root package name */
    public int f21232d;

    public C0805d(int i, int i9, int i10) {
        this.f21229a = i10;
        this.f21230b = i9;
        boolean z10 = false;
        if (i10 <= 0 ? i >= i9 : i <= i9) {
            z10 = true;
        }
        this.f21231c = z10;
        this.f21232d = z10 ? i : i9;
    }

    @Override // P9.w
    public final int a() {
        int i = this.f21232d;
        if (i != this.f21230b) {
            this.f21232d = this.f21229a + i;
        } else {
            if (!this.f21231c) {
                throw new NoSuchElementException();
            }
            this.f21231c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21231c;
    }
}
