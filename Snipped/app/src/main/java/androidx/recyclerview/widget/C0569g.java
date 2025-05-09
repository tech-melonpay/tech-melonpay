package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569g {

    /* renamed from: a, reason: collision with root package name */
    public final b f7640a;

    /* renamed from: e, reason: collision with root package name */
    public View f7644e;

    /* renamed from: d, reason: collision with root package name */
    public int f7643d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f7641b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7642c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f7645a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f7646b;

        public final void a(int i) {
            if (i < 64) {
                this.f7645a &= ~(1 << i);
                return;
            }
            a aVar = this.f7646b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.f7646b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f7645a) : Long.bitCount(this.f7645a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f7645a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f7645a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.f7646b == null) {
                this.f7646b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.f7645a & (1 << i)) != 0;
            }
            c();
            return this.f7646b.d(i - 64);
        }

        public final void e(int i, boolean z10) {
            if (i >= 64) {
                c();
                this.f7646b.e(i - 64, z10);
                return;
            }
            long j10 = this.f7645a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i) - 1;
            this.f7645a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i);
            } else {
                a(i);
            }
            if (z11 || this.f7646b != null) {
                c();
                this.f7646b.e(0, z11);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f7646b.f(i - 64);
            }
            long j10 = 1 << i;
            long j11 = this.f7645a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f7645a = j12;
            long j13 = j10 - 1;
            this.f7645a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f7646b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f7646b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f7645a = 0L;
            a aVar = this.f7646b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.f7645a |= 1 << i;
            } else {
                c();
                this.f7646b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.f7646b == null) {
                return Long.toBinaryString(this.f7645a);
            }
            return this.f7646b.toString() + "xx" + Long.toBinaryString(this.f7645a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.g$b */
    public interface b {
    }

    public C0569g(RecyclerView.e eVar) {
        this.f7640a = eVar;
    }

    public final void a(View view, int i, boolean z10) {
        b bVar = this.f7640a;
        int childCount = i < 0 ? RecyclerView.this.getChildCount() : f(i);
        this.f7641b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b bVar = this.f7640a;
        int childCount = i < 0 ? RecyclerView.this.getChildCount() : f(i);
        this.f7641b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) bVar;
        eVar.getClass();
        RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = RecyclerView.this;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f10 = f(i);
        this.f7641b.f(f10);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(f10);
        if (childAt != null) {
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(f10);
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i) {
        return RecyclerView.this.getChildAt(f(i));
    }

    public final int e() {
        return RecyclerView.this.getChildCount() - this.f7642c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i9 = i;
        while (i9 < childCount) {
            a aVar = this.f7641b;
            int b9 = i - (i9 - aVar.b(i9));
            if (b9 == 0) {
                while (aVar.d(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += b9;
        }
        return -1;
    }

    public final View g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int h() {
        return RecyclerView.this.getChildCount();
    }

    public final void i(View view) {
        this.f7642c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.f7640a;
        eVar.getClass();
        RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final int j(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        a aVar = this.f7641b;
        if (aVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - aVar.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f7642c.contains(view);
    }

    public final void l(int i) {
        b bVar = this.f7640a;
        int i9 = this.f7643d;
        if (i9 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i9 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int f10 = f(i);
            View childAt = RecyclerView.this.getChildAt(f10);
            if (childAt == null) {
                this.f7643d = 0;
                this.f7644e = null;
                return;
            }
            this.f7643d = 1;
            this.f7644e = childAt;
            if (this.f7641b.f(f10)) {
                m(childAt);
            }
            ((RecyclerView.e) bVar).a(f10);
            this.f7643d = 0;
            this.f7644e = null;
        } catch (Throwable th) {
            this.f7643d = 0;
            this.f7644e = null;
            throw th;
        }
    }

    public final void m(View view) {
        if (this.f7642c.remove(view)) {
            RecyclerView.e eVar = (RecyclerView.e) this.f7640a;
            eVar.getClass();
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f7641b.toString() + ", hidden list:" + this.f7642c.size();
    }
}
