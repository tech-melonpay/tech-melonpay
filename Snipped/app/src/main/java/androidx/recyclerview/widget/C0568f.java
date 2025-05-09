package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568f implements D {

    /* renamed from: a, reason: collision with root package name */
    public final D f7635a;

    /* renamed from: b, reason: collision with root package name */
    public int f7636b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7637c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7638d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f7639e = null;

    public C0568f(D d10) {
        this.f7635a = d10;
    }

    public final void a() {
        int i = this.f7636b;
        if (i == 0) {
            return;
        }
        D d10 = this.f7635a;
        if (i == 1) {
            d10.onInserted(this.f7637c, this.f7638d);
        } else if (i == 2) {
            d10.onRemoved(this.f7637c, this.f7638d);
        } else if (i == 3) {
            d10.onChanged(this.f7637c, this.f7638d, this.f7639e);
        }
        this.f7639e = null;
        this.f7636b = 0;
    }

    @Override // androidx.recyclerview.widget.D
    @SuppressLint({"UnknownNullness"})
    public final void onChanged(int i, int i9, Object obj) {
        int i10;
        if (this.f7636b == 3) {
            int i11 = this.f7637c;
            int i12 = this.f7638d;
            if (i <= i11 + i12 && (i10 = i + i9) >= i11 && this.f7639e == obj) {
                this.f7637c = Math.min(i, i11);
                this.f7638d = Math.max(i12 + i11, i10) - this.f7637c;
                return;
            }
        }
        a();
        this.f7637c = i;
        this.f7638d = i9;
        this.f7639e = obj;
        this.f7636b = 3;
    }

    @Override // androidx.recyclerview.widget.D
    public final void onInserted(int i, int i9) {
        int i10;
        if (this.f7636b == 1 && i >= (i10 = this.f7637c)) {
            int i11 = this.f7638d;
            if (i <= i10 + i11) {
                this.f7638d = i11 + i9;
                this.f7637c = Math.min(i, i10);
                return;
            }
        }
        a();
        this.f7637c = i;
        this.f7638d = i9;
        this.f7636b = 1;
    }

    @Override // androidx.recyclerview.widget.D
    public final void onMoved(int i, int i9) {
        a();
        this.f7635a.onMoved(i, i9);
    }

    @Override // androidx.recyclerview.widget.D
    public final void onRemoved(int i, int i9) {
        int i10;
        if (this.f7636b == 2 && (i10 = this.f7637c) >= i && i10 <= i + i9) {
            this.f7638d += i9;
            this.f7637c = i;
        } else {
            a();
            this.f7637c = i;
            this.f7638d = i9;
            this.f7636b = 2;
        }
    }
}
