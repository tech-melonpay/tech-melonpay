package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<t> f7757e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    public static final a f7758f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f7760b;

    /* renamed from: c, reason: collision with root package name */
    public long f7761c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<RecyclerView> f7759a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<c> f7762d = new ArrayList<>();

    /* compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.t.c r7, androidx.recyclerview.widget.t.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.t$c r7 = (androidx.recyclerview.widget.t.c) r7
                androidx.recyclerview.widget.t$c r8 = (androidx.recyclerview.widget.t.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f7770d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f7770d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f7767a
                boolean r3 = r8.f7767a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f7768b
                int r2 = r7.f7768b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f7769c
                int r8 = r8.f7769c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.n.c {

        /* renamed from: a, reason: collision with root package name */
        public int f7763a;

        /* renamed from: b, reason: collision with root package name */
        public int f7764b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f7765c;

        /* renamed from: d, reason: collision with root package name */
        public int f7766d;

        public final void a(int i, int i9) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i10 = this.f7766d;
            int i11 = i10 * 2;
            int[] iArr = this.f7765c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f7765c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[i10 * 4];
                this.f7765c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f7765c;
            iArr4[i11] = i;
            iArr4[i11 + 1] = i9;
            this.f7766d++;
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            this.f7766d = 0;
            int[] iArr = this.f7765c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || nVar == null || !nVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.g()) {
                    nVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                nVar.collectAdjacentPrefetchPositions(this.f7763a, this.f7764b, recyclerView.mState, this);
            }
            int i = this.f7766d;
            if (i > nVar.mPrefetchMaxCountObserved) {
                nVar.mPrefetchMaxCountObserved = i;
                nVar.mPrefetchMaxObservedInInitialPrefetch = z10;
                recyclerView.mRecycler.p();
            }
        }
    }

    /* compiled from: GapWorker.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7767a;

        /* renamed from: b, reason: collision with root package name */
        public int f7768b;

        /* renamed from: c, reason: collision with root package name */
        public int f7769c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f7770d;

        /* renamed from: e, reason: collision with root package name */
        public int f7771e;
    }

    public static RecyclerView.C c(RecyclerView recyclerView, int i, long j10) {
        int h9 = recyclerView.mChildHelper.h();
        for (int i9 = 0; i9 < h9; i9++) {
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i9));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.u uVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C n10 = uVar.n(i, j10);
            if (n10 != null) {
                if (!n10.isBound() || n10.isInvalid()) {
                    uVar.a(n10, false);
                } else {
                    uVar.j(n10.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return n10;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i9) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f7759a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7760b == 0) {
                this.f7760b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f7763a = i;
        bVar.f7764b = i9;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f7759a;
        int size = arrayList.size();
        int i = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView3 = arrayList.get(i9);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f7766d;
            }
        }
        ArrayList<c> arrayList2 = this.f7762d;
        arrayList2.ensureCapacity(i);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView4 = arrayList.get(i11);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.f7764b) + Math.abs(bVar.f7763a);
                for (int i12 = 0; i12 < bVar.f7766d * 2; i12 += 2) {
                    if (i10 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i10);
                    }
                    int[] iArr = bVar.f7765c;
                    int i13 = iArr[i12 + 1];
                    cVar2.f7767a = i13 <= abs;
                    cVar2.f7768b = abs;
                    cVar2.f7769c = i13;
                    cVar2.f7770d = recyclerView4;
                    cVar2.f7771e = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(arrayList2, f7758f);
        for (int i14 = 0; i14 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i14)).f7770d) != null; i14++) {
            RecyclerView.C c2 = c(recyclerView, cVar.f7771e, cVar.f7767a ? Long.MAX_VALUE : j10);
            if (c2 != null && c2.mNestedRecyclerView != null && c2.isBound() && !c2.isInvalid() && (recyclerView2 = c2.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.f7766d != 0) {
                    try {
                        int i15 = t0.j.f27405a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        yVar.f7541d = 1;
                        yVar.f7542e = adapter.getItemCount();
                        yVar.f7544g = false;
                        yVar.f7545h = false;
                        yVar.i = false;
                        for (int i16 = 0; i16 < bVar2.f7766d * 2; i16 += 2) {
                            c(recyclerView2, bVar2.f7765c[i16], j10);
                        }
                        Trace.endSection();
                        cVar.f7767a = false;
                        cVar.f7768b = 0;
                        cVar.f7769c = 0;
                        cVar.f7770d = null;
                        cVar.f7771e = 0;
                    } catch (Throwable th) {
                        int i17 = t0.j.f27405a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f7767a = false;
            cVar.f7768b = 0;
            cVar.f7769c = 0;
            cVar.f7770d = null;
            cVar.f7771e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = t0.j.f27405a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f7759a;
            if (arrayList.isEmpty()) {
                this.f7760b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                RecyclerView recyclerView = arrayList.get(i9);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f7760b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f7761c);
                this.f7760b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f7760b = 0L;
            int i10 = t0.j.f27405a;
            Trace.endSection();
            throw th;
        }
    }
}
