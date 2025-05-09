package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.n implements RecyclerView.x.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7551a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f7552b;

    /* renamed from: c, reason: collision with root package name */
    public final H f7553c;

    /* renamed from: d, reason: collision with root package name */
    public final H f7554d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7555e;

    /* renamed from: f, reason: collision with root package name */
    public int f7556f;

    /* renamed from: g, reason: collision with root package name */
    public final z f7557g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7558h;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f7559j;

    /* renamed from: m, reason: collision with root package name */
    public final LazySpanLookup f7562m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7563n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7564o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7565p;

    /* renamed from: q, reason: collision with root package name */
    public SavedState f7566q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f7567r;

    /* renamed from: s, reason: collision with root package name */
    public final b f7568s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7569t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f7570u;

    /* renamed from: v, reason: collision with root package name */
    public final a f7571v;
    public boolean i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f7560k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f7561l = Integer.MIN_VALUE;

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f7572a;

        /* renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f7573b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public int f7574a;

            /* renamed from: b, reason: collision with root package name */
            public int f7575b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f7576c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f7577d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.f7574a = parcel.readInt();
                    fullSpanItem.f7575b = parcel.readInt();
                    fullSpanItem.f7577d = parcel.readInt() == 1;
                    int readInt = parcel.readInt();
                    if (readInt > 0) {
                        int[] iArr = new int[readInt];
                        fullSpanItem.f7576c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f7574a + ", mGapDir=" + this.f7575b + ", mHasUnwantedGapAfter=" + this.f7577d + ", mGapPerSpan=" + Arrays.toString(this.f7576c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f7574a);
                parcel.writeInt(this.f7575b);
                parcel.writeInt(this.f7577d ? 1 : 0);
                int[] iArr = this.f7576c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f7576c);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f7572a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f7573b = null;
        }

        public final void b(int i) {
            int[] iArr = this.f7572a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f7572a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f7572a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f7572a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f7572a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f7573b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L5f
            L10:
                r2 = 0
                if (r0 != 0) goto L14
                goto L2d
            L14:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L1a:
                if (r0 < 0) goto L2d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f7573b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.f7574a
                if (r4 != r6) goto L2a
                r2 = r3
                goto L2d
            L2a:
                int r0 = r0 + (-1)
                goto L1a
            L2d:
                if (r2 == 0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f7573b
                r0.remove(r2)
            L34:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f7573b
                int r0 = r0.size()
                r2 = 0
            L3b:
                if (r2 >= r0) goto L4d
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f7573b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f7574a
                if (r3 < r6) goto L4a
                goto L4e
            L4a:
                int r2 = r2 + 1
                goto L3b
            L4d:
                r2 = r1
            L4e:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f7573b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f7573b
                r3.remove(r2)
                int r0 = r0.f7574a
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f7572a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f7572a
                int r6 = r6.length
                return r6
            L6b:
                int r0 = r0 + 1
                int[] r2 = r5.f7572a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f7572a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.c(int):int");
        }

        public final void d(int i, int i9) {
            int[] iArr = this.f7572a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i10 = i + i9;
            b(i10);
            int[] iArr2 = this.f7572a;
            System.arraycopy(iArr2, i, iArr2, i10, (iArr2.length - i) - i9);
            Arrays.fill(this.f7572a, i, i10, -1);
            List<FullSpanItem> list = this.f7573b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f7573b.get(size);
                int i11 = fullSpanItem.f7574a;
                if (i11 >= i) {
                    fullSpanItem.f7574a = i11 + i9;
                }
            }
        }

        public final void e(int i, int i9) {
            int[] iArr = this.f7572a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i10 = i + i9;
            b(i10);
            int[] iArr2 = this.f7572a;
            System.arraycopy(iArr2, i10, iArr2, i, (iArr2.length - i) - i9);
            int[] iArr3 = this.f7572a;
            Arrays.fill(iArr3, iArr3.length - i9, iArr3.length, -1);
            List<FullSpanItem> list = this.f7573b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f7573b.get(size);
                int i11 = fullSpanItem.f7574a;
                if (i11 >= i) {
                    if (i11 < i10) {
                        this.f7573b.remove(size);
                    } else {
                        fullSpanItem.f7574a = i11 - i9;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f7578a;

        /* renamed from: b, reason: collision with root package name */
        public int f7579b;

        /* renamed from: c, reason: collision with root package name */
        public int f7580c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f7581d;

        /* renamed from: e, reason: collision with root package name */
        public int f7582e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f7583f;

        /* renamed from: g, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f7584g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7585h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f7586j;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f7578a = parcel.readInt();
                savedState.f7579b = parcel.readInt();
                int readInt = parcel.readInt();
                savedState.f7580c = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    savedState.f7581d = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                savedState.f7582e = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    savedState.f7583f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.f7585h = parcel.readInt() == 1;
                savedState.i = parcel.readInt() == 1;
                savedState.f7586j = parcel.readInt() == 1;
                savedState.f7584g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7578a);
            parcel.writeInt(this.f7579b);
            parcel.writeInt(this.f7580c);
            if (this.f7580c > 0) {
                parcel.writeIntArray(this.f7581d);
            }
            parcel.writeInt(this.f7582e);
            if (this.f7582e > 0) {
                parcel.writeIntArray(this.f7583f);
            }
            parcel.writeInt(this.f7585h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.f7586j ? 1 : 0);
            parcel.writeList(this.f7584g);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.b();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7588a;

        /* renamed from: b, reason: collision with root package name */
        public int f7589b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7590c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7591d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7592e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f7593f;

        public b() {
            a();
        }

        public final void a() {
            this.f7588a = -1;
            this.f7589b = Integer.MIN_VALUE;
            this.f7590c = false;
            this.f7591d = false;
            this.f7592e = false;
            int[] iArr = this.f7593f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e, reason: collision with root package name */
        public d f7595e;
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f7596a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f7597b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f7598c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f7599d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f7600e;

        public d(int i) {
            this.f7600e = i;
        }

        public final void a() {
            View view = (View) com.google.android.gms.measurement.internal.a.f(1, this.f7596a);
            c cVar = (c) view.getLayoutParams();
            this.f7598c = StaggeredGridLayoutManager.this.f7553c.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.f7596a.clear();
            this.f7597b = Integer.MIN_VALUE;
            this.f7598c = Integer.MIN_VALUE;
            this.f7599d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.f7558h ? e(r1.size() - 1, -1) : e(0, this.f7596a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.f7558h ? e(0, this.f7596a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i, int i9) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k3 = staggeredGridLayoutManager.f7553c.k();
            int g10 = staggeredGridLayoutManager.f7553c.g();
            int i10 = i9 > i ? 1 : -1;
            while (i != i9) {
                View view = this.f7596a.get(i);
                int e10 = staggeredGridLayoutManager.f7553c.e(view);
                int b9 = staggeredGridLayoutManager.f7553c.b(view);
                boolean z10 = e10 <= g10;
                boolean z11 = b9 >= k3;
                if (z10 && z11 && (e10 < k3 || b9 > g10)) {
                    return staggeredGridLayoutManager.getPosition(view);
                }
                i += i10;
            }
            return -1;
        }

        public final int f(int i) {
            int i9 = this.f7598c;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f7596a.size() == 0) {
                return i;
            }
            a();
            return this.f7598c;
        }

        public final View g(int i, int i9) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f7596a;
            View view = null;
            if (i9 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f7558h && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.f7558h && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    View view3 = arrayList.get(i10);
                    if ((staggeredGridLayoutManager.f7558h && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.f7558h && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i10++;
                    view = view3;
                }
            }
            return view;
        }

        public final int h(int i) {
            int i9 = this.f7597b;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f7596a.size() == 0) {
                return i;
            }
            View view = this.f7596a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f7597b = StaggeredGridLayoutManager.this.f7553c.e(view);
            cVar.getClass();
            return this.f7597b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i9) {
        this.f7551a = -1;
        this.f7558h = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.f7562m = lazySpanLookup;
        this.f7563n = 2;
        this.f7567r = new Rect();
        this.f7568s = new b();
        this.f7569t = true;
        this.f7571v = new a();
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i, i9);
        int i10 = properties.f7502a;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f7555e) {
            this.f7555e = i10;
            H h9 = this.f7553c;
            this.f7553c = this.f7554d;
            this.f7554d = h9;
            requestLayout();
        }
        int i11 = properties.f7503b;
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f7551a) {
            lazySpanLookup.a();
            requestLayout();
            this.f7551a = i11;
            this.f7559j = new BitSet(this.f7551a);
            this.f7552b = new d[this.f7551a];
            for (int i12 = 0; i12 < this.f7551a; i12++) {
                this.f7552b[i12] = new d(i12);
            }
            requestLayout();
        }
        boolean z10 = properties.f7504c;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f7566q;
        if (savedState != null && savedState.f7585h != z10) {
            savedState.f7585h = z10;
        }
        this.f7558h = z10;
        requestLayout();
        z zVar = new z();
        zVar.f7823a = true;
        zVar.f7828f = 0;
        zVar.f7829g = 0;
        this.f7557g = zVar;
        this.f7553c = H.a(this, this.f7555e);
        this.f7554d = H.a(this, 1 - this.f7555e);
    }

    public static int x(int i, int i9, int i10) {
        if (i9 == 0 && i10 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i9) - i10), mode) : i;
    }

    public final int a(int i) {
        if (getChildCount() == 0) {
            return this.i ? 1 : -1;
        }
        return (i < h()) != this.i ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f7566q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final boolean b() {
        int h9;
        if (getChildCount() != 0 && this.f7563n != 0 && isAttachedToWindow()) {
            if (this.i) {
                h9 = i();
                h();
            } else {
                h9 = h();
                i();
            }
            LazySpanLookup lazySpanLookup = this.f7562m;
            if (h9 == 0 && m() != null) {
                lazySpanLookup.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public final int c(RecyclerView.u uVar, z zVar, RecyclerView.y yVar) {
        d dVar;
        ?? r12;
        int i;
        int c2;
        int k3;
        int c10;
        View view;
        int i9;
        int i10;
        int i11;
        RecyclerView.u uVar2 = uVar;
        int i12 = 0;
        int i13 = 1;
        this.f7559j.set(0, this.f7551a, true);
        z zVar2 = this.f7557g;
        int i14 = zVar2.i ? zVar.f7827e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : zVar.f7827e == 1 ? zVar.f7829g + zVar.f7824b : zVar.f7828f - zVar.f7824b;
        int i15 = zVar.f7827e;
        for (int i16 = 0; i16 < this.f7551a; i16++) {
            if (!this.f7552b[i16].f7596a.isEmpty()) {
                w(this.f7552b[i16], i15, i14);
            }
        }
        int g10 = this.i ? this.f7553c.g() : this.f7553c.k();
        boolean z10 = false;
        while (true) {
            int i17 = zVar.f7825c;
            int i18 = -1;
            if (((i17 < 0 || i17 >= yVar.b()) ? i12 : i13) == 0 || (!zVar2.i && this.f7559j.isEmpty())) {
                break;
            }
            View e10 = uVar2.e(zVar.f7825c);
            zVar.f7825c += zVar.f7826d;
            c cVar = (c) e10.getLayoutParams();
            int layoutPosition = cVar.f7506a.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.f7562m;
            int[] iArr = lazySpanLookup.f7572a;
            int i19 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i19 == -1) {
                if (p(zVar.f7827e)) {
                    i10 = this.f7551a - i13;
                    i11 = -1;
                } else {
                    i18 = this.f7551a;
                    i10 = i12;
                    i11 = i13;
                }
                d dVar2 = null;
                if (zVar.f7827e == i13) {
                    int k10 = this.f7553c.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i10 != i18) {
                        d dVar3 = this.f7552b[i10];
                        int f10 = dVar3.f(k10);
                        if (f10 < i20) {
                            i20 = f10;
                            dVar2 = dVar3;
                        }
                        i10 += i11;
                    }
                } else {
                    int g11 = this.f7553c.g();
                    int i21 = Integer.MIN_VALUE;
                    while (i10 != i18) {
                        d dVar4 = this.f7552b[i10];
                        int h9 = dVar4.h(g11);
                        if (h9 > i21) {
                            dVar2 = dVar4;
                            i21 = h9;
                        }
                        i10 += i11;
                    }
                }
                dVar = dVar2;
                lazySpanLookup.b(layoutPosition);
                lazySpanLookup.f7572a[layoutPosition] = dVar.f7600e;
            } else {
                dVar = this.f7552b[i19];
            }
            d dVar5 = dVar;
            cVar.f7595e = dVar5;
            if (zVar.f7827e == 1) {
                addView(e10);
                r12 = 0;
            } else {
                r12 = 0;
                addView(e10, 0);
            }
            if (this.f7555e == 1) {
                n(e10, RecyclerView.n.getChildMeasureSpec(this.f7556f, getWidthMode(), r12, ((ViewGroup.MarginLayoutParams) cVar).width, r12), RecyclerView.n.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true));
            } else {
                n(e10, RecyclerView.n.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.n.getChildMeasureSpec(this.f7556f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false));
            }
            if (zVar.f7827e == 1) {
                int f11 = dVar5.f(g10);
                c2 = f11;
                i = this.f7553c.c(e10) + f11;
            } else {
                int h10 = dVar5.h(g10);
                i = h10;
                c2 = h10 - this.f7553c.c(e10);
            }
            if (zVar.f7827e == 1) {
                d dVar6 = cVar.f7595e;
                dVar6.getClass();
                c cVar2 = (c) e10.getLayoutParams();
                cVar2.f7595e = dVar6;
                ArrayList<View> arrayList = dVar6.f7596a;
                arrayList.add(e10);
                dVar6.f7598c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    dVar6.f7597b = Integer.MIN_VALUE;
                }
                if (cVar2.f7506a.isRemoved() || cVar2.f7506a.isUpdated()) {
                    dVar6.f7599d = StaggeredGridLayoutManager.this.f7553c.c(e10) + dVar6.f7599d;
                }
            } else {
                d dVar7 = cVar.f7595e;
                dVar7.getClass();
                c cVar3 = (c) e10.getLayoutParams();
                cVar3.f7595e = dVar7;
                ArrayList<View> arrayList2 = dVar7.f7596a;
                arrayList2.add(0, e10);
                dVar7.f7597b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    dVar7.f7598c = Integer.MIN_VALUE;
                }
                if (cVar3.f7506a.isRemoved() || cVar3.f7506a.isUpdated()) {
                    dVar7.f7599d = StaggeredGridLayoutManager.this.f7553c.c(e10) + dVar7.f7599d;
                }
            }
            if (isLayoutRTL() && this.f7555e == 1) {
                c10 = this.f7554d.g() - (((this.f7551a - 1) - dVar5.f7600e) * this.f7556f);
                k3 = c10 - this.f7554d.c(e10);
            } else {
                k3 = this.f7554d.k() + (dVar5.f7600e * this.f7556f);
                c10 = this.f7554d.c(e10) + k3;
            }
            int i22 = c10;
            int i23 = k3;
            if (this.f7555e == 1) {
                view = e10;
                layoutDecoratedWithMargins(e10, i23, c2, i22, i);
            } else {
                view = e10;
                layoutDecoratedWithMargins(view, c2, i23, i, i22);
            }
            w(dVar5, zVar2.f7827e, i14);
            r(uVar, zVar2);
            if (zVar2.f7830h && view.hasFocusable()) {
                i9 = 0;
                this.f7559j.set(dVar5.f7600e, false);
            } else {
                i9 = 0;
            }
            uVar2 = uVar;
            i12 = i9;
            z10 = true;
            i13 = 1;
        }
        RecyclerView.u uVar3 = uVar2;
        int i24 = i12;
        if (!z10) {
            r(uVar3, zVar2);
        }
        int k11 = zVar2.f7827e == -1 ? this.f7553c.k() - k(this.f7553c.k()) : j(this.f7553c.g()) - this.f7553c.g();
        return k11 > 0 ? Math.min(zVar.f7824b, k11) : i24;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean canScrollHorizontally() {
        return this.f7555e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean canScrollVertically() {
        return this.f7555e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void collectAdjacentPrefetchPositions(int i, int i9, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        z zVar;
        int f10;
        int i10;
        if (this.f7555e != 0) {
            i = i9;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        q(i, yVar);
        int[] iArr = this.f7570u;
        if (iArr == null || iArr.length < this.f7551a) {
            this.f7570u = new int[this.f7551a];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f7551a;
            zVar = this.f7557g;
            if (i11 >= i13) {
                break;
            }
            if (zVar.f7826d == -1) {
                f10 = zVar.f7828f;
                i10 = this.f7552b[i11].h(f10);
            } else {
                f10 = this.f7552b[i11].f(zVar.f7829g);
                i10 = zVar.f7829g;
            }
            int i14 = f10 - i10;
            if (i14 >= 0) {
                this.f7570u[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.f7570u, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = zVar.f7825c;
            if (i16 < 0 || i16 >= yVar.b()) {
                return;
            }
            ((t.b) cVar).a(zVar.f7825c, this.f7570u[i15]);
            zVar.f7825c += zVar.f7826d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public final int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        H h9 = this.f7553c;
        boolean z10 = this.f7569t;
        return K.a(yVar, h9, e(!z10), d(!z10), this, this.f7569t);
    }

    public final int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        H h9 = this.f7553c;
        boolean z10 = this.f7569t;
        return K.b(yVar, h9, e(!z10), d(!z10), this, this.f7569t, this.i);
    }

    public final int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        H h9 = this.f7553c;
        boolean z10 = this.f7569t;
        return K.c(yVar, h9, e(!z10), d(!z10), this, this.f7569t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF computeScrollVectorForPosition(int i) {
        int a10 = a(i);
        PointF pointF = new PointF();
        if (a10 == 0) {
            return null;
        }
        if (this.f7555e == 0) {
            pointF.x = a10;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = a10;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public final View d(boolean z10) {
        int k3 = this.f7553c.k();
        int g10 = this.f7553c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e10 = this.f7553c.e(childAt);
            int b9 = this.f7553c.b(childAt);
            if (b9 > k3 && e10 < g10) {
                if (b9 <= g10 || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View e(boolean z10) {
        int k3 = this.f7553c.k();
        int g10 = this.f7553c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int e10 = this.f7553c.e(childAt);
            if (this.f7553c.b(childAt) > k3 && e10 < g10) {
                if (e10 >= k3 || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void f(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int j10 = j(Integer.MIN_VALUE);
        if (j10 != Integer.MIN_VALUE && (g10 = this.f7553c.g() - j10) > 0) {
            int i = g10 - (-scrollBy(-g10, uVar, yVar));
            if (!z10 || i <= 0) {
                return;
            }
            this.f7553c.p(i);
        }
    }

    public final void g(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int k3;
        int k10 = k(Integer.MAX_VALUE);
        if (k10 != Integer.MAX_VALUE && (k3 = k10 - this.f7553c.k()) > 0) {
            int scrollBy = k3 - scrollBy(k3, uVar, yVar);
            if (!z10 || scrollBy <= 0) {
                return;
            }
            this.f7553c.p(-scrollBy);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateDefaultLayoutParams() {
        return this.f7555e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final int h() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int i() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean isAutoMeasureEnabled() {
        return this.f7563n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int j(int i) {
        int f10 = this.f7552b[0].f(i);
        for (int i9 = 1; i9 < this.f7551a; i9++) {
            int f11 = this.f7552b[i9].f(i);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final int k(int i) {
        int h9 = this.f7552b[0].h(i);
        for (int i9 = 1; i9 < this.f7551a; i9++) {
            int h10 = this.f7552b[i9].h(i);
            if (h10 < h9) {
                h9 = h10;
            }
        }
        return h9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.i
            if (r0 == 0) goto L9
            int r0 = r7.i()
            goto Ld
        L9:
            int r0 = r7.h()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r7.f7562m
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L3a
        L33:
            r4.e(r8, r9)
            goto L3a
        L37:
            r4.d(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.i
            if (r8 == 0) goto L46
            int r8 = r7.h()
            goto L4a
        L46:
            int r8 = r7.i()
        L4a:
            if (r3 > r8) goto L4f
            r7.requestLayout()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m():android.view.View");
    }

    public final void n(View view, int i, int i9) {
        Rect rect = this.f7567r;
        calculateItemDecorationsForChild(view, rect);
        c cVar = (c) view.getLayoutParams();
        int x9 = x(i, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int x10 = x(i9, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, x9, x10, cVar)) {
            view.measure(x9, x10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x03fe, code lost:
    
        if (b() != false) goto L244;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.y r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i9 = 0; i9 < this.f7551a; i9++) {
            d dVar = this.f7552b[i9];
            int i10 = dVar.f7597b;
            if (i10 != Integer.MIN_VALUE) {
                dVar.f7597b = i10 + i;
            }
            int i11 = dVar.f7598c;
            if (i11 != Integer.MIN_VALUE) {
                dVar.f7598c = i11 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i9 = 0; i9 < this.f7551a; i9++) {
            d dVar = this.f7552b[i9];
            int i10 = dVar.f7597b;
            if (i10 != Integer.MIN_VALUE) {
                dVar.f7597b = i10 + i;
            }
            int i11 = dVar.f7598c;
            if (i11 != Integer.MIN_VALUE) {
                dVar.f7598c = i11 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f7562m.a();
        for (int i = 0; i < this.f7551a; i++) {
            this.f7552b[i].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        removeCallbacks(this.f7571v);
        for (int i = 0; i < this.f7551a; i++) {
            this.f7552b[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0039, code lost:
    
        if (r8.f7555e == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003e, code lost:
    
        if (r8.f7555e == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004b, code lost:
    
        if (isLayoutRTL() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (isLayoutRTL() == false) goto L38;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.u r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View e10 = e(false);
            View d10 = d(false);
            if (e10 == null || d10 == null) {
                return;
            }
            int position = getPosition(e10);
            int position2 = getPosition(d10);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i9) {
        l(i, i9, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f7562m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i9, int i10) {
        l(i, i9, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i9) {
        l(i, i9, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i9, Object obj) {
        l(i, i9, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        o(uVar, yVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.f7560k = -1;
        this.f7561l = Integer.MIN_VALUE;
        this.f7566q = null;
        this.f7568s.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7566q = savedState;
            if (this.f7560k != -1) {
                savedState.f7581d = null;
                savedState.f7580c = 0;
                savedState.f7578a = -1;
                savedState.f7579b = -1;
                savedState.f7581d = null;
                savedState.f7580c = 0;
                savedState.f7582e = 0;
                savedState.f7583f = null;
                savedState.f7584g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final Parcelable onSaveInstanceState() {
        int h9;
        int k3;
        int[] iArr;
        SavedState savedState = this.f7566q;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f7580c = savedState.f7580c;
            savedState2.f7578a = savedState.f7578a;
            savedState2.f7579b = savedState.f7579b;
            savedState2.f7581d = savedState.f7581d;
            savedState2.f7582e = savedState.f7582e;
            savedState2.f7583f = savedState.f7583f;
            savedState2.f7585h = savedState.f7585h;
            savedState2.i = savedState.i;
            savedState2.f7586j = savedState.f7586j;
            savedState2.f7584g = savedState.f7584g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f7585h = this.f7558h;
        savedState3.i = this.f7564o;
        savedState3.f7586j = this.f7565p;
        LazySpanLookup lazySpanLookup = this.f7562m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f7572a) == null) {
            savedState3.f7582e = 0;
        } else {
            savedState3.f7583f = iArr;
            savedState3.f7582e = iArr.length;
            savedState3.f7584g = lazySpanLookup.f7573b;
        }
        if (getChildCount() > 0) {
            savedState3.f7578a = this.f7564o ? i() : h();
            View d10 = this.i ? d(true) : e(true);
            savedState3.f7579b = d10 != null ? getPosition(d10) : -1;
            int i = this.f7551a;
            savedState3.f7580c = i;
            savedState3.f7581d = new int[i];
            for (int i9 = 0; i9 < this.f7551a; i9++) {
                if (this.f7564o) {
                    h9 = this.f7552b[i9].f(Integer.MIN_VALUE);
                    if (h9 != Integer.MIN_VALUE) {
                        k3 = this.f7553c.g();
                        h9 -= k3;
                        savedState3.f7581d[i9] = h9;
                    } else {
                        savedState3.f7581d[i9] = h9;
                    }
                } else {
                    h9 = this.f7552b[i9].h(Integer.MIN_VALUE);
                    if (h9 != Integer.MIN_VALUE) {
                        k3 = this.f7553c.k();
                        h9 -= k3;
                        savedState3.f7581d[i9] = h9;
                    } else {
                        savedState3.f7581d[i9] = h9;
                    }
                }
            }
        } else {
            savedState3.f7578a = -1;
            savedState3.f7579b = -1;
            savedState3.f7580c = 0;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            b();
        }
    }

    public final boolean p(int i) {
        if (this.f7555e == 0) {
            return (i == -1) != this.i;
        }
        return ((i == -1) == this.i) == isLayoutRTL();
    }

    public final void q(int i, RecyclerView.y yVar) {
        int h9;
        int i9;
        if (i > 0) {
            h9 = i();
            i9 = 1;
        } else {
            h9 = h();
            i9 = -1;
        }
        z zVar = this.f7557g;
        zVar.f7823a = true;
        v(h9, yVar);
        u(i9);
        zVar.f7825c = h9 + zVar.f7826d;
        zVar.f7824b = Math.abs(i);
    }

    public final void r(RecyclerView.u uVar, z zVar) {
        if (!zVar.f7823a || zVar.i) {
            return;
        }
        if (zVar.f7824b == 0) {
            if (zVar.f7827e == -1) {
                s(uVar, zVar.f7829g);
                return;
            } else {
                t(uVar, zVar.f7828f);
                return;
            }
        }
        int i = 1;
        if (zVar.f7827e == -1) {
            int i9 = zVar.f7828f;
            int h9 = this.f7552b[0].h(i9);
            while (i < this.f7551a) {
                int h10 = this.f7552b[i].h(i9);
                if (h10 > h9) {
                    h9 = h10;
                }
                i++;
            }
            int i10 = i9 - h9;
            s(uVar, i10 < 0 ? zVar.f7829g : zVar.f7829g - Math.min(i10, zVar.f7824b));
            return;
        }
        int i11 = zVar.f7829g;
        int f10 = this.f7552b[0].f(i11);
        while (i < this.f7551a) {
            int f11 = this.f7552b[i].f(i11);
            if (f11 < f10) {
                f10 = f11;
            }
            i++;
        }
        int i12 = f10 - zVar.f7829g;
        t(uVar, i12 < 0 ? zVar.f7828f : Math.min(i12, zVar.f7824b) + zVar.f7828f);
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f7555e == 1 || !isLayoutRTL()) {
            this.i = this.f7558h;
        } else {
            this.i = !this.f7558h;
        }
    }

    public final void s(RecyclerView.u uVar, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f7553c.e(childAt) < i || this.f7553c.o(childAt) < i) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f7595e.f7596a.size() == 1) {
                return;
            }
            d dVar = cVar.f7595e;
            ArrayList<View> arrayList = dVar.f7596a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            c cVar2 = (c) remove.getLayoutParams();
            cVar2.f7595e = null;
            if (cVar2.f7506a.isRemoved() || cVar2.f7506a.isUpdated()) {
                dVar.f7599d -= StaggeredGridLayoutManager.this.f7553c.c(remove);
            }
            if (size == 1) {
                dVar.f7597b = Integer.MIN_VALUE;
            }
            dVar.f7598c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final int scrollBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        q(i, yVar);
        z zVar = this.f7557g;
        int c2 = c(uVar, zVar, yVar);
        if (zVar.f7824b >= c2) {
            i = i < 0 ? -c2 : c2;
        }
        this.f7553c.p(-i);
        this.f7564o = this.i;
        zVar.f7824b = 0;
        r(uVar, zVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void scrollToPosition(int i) {
        SavedState savedState = this.f7566q;
        if (savedState != null && savedState.f7578a != i) {
            savedState.f7581d = null;
            savedState.f7580c = 0;
            savedState.f7578a = -1;
            savedState.f7579b = -1;
        }
        this.f7560k = i;
        this.f7561l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void setMeasuredDimension(Rect rect, int i, int i9) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7555e == 1) {
            chooseSize2 = RecyclerView.n.chooseSize(i9, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.n.chooseSize(i, (this.f7556f * this.f7551a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.n.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.n.chooseSize(i9, (this.f7556f * this.f7551a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        A a10 = new A(recyclerView.getContext());
        a10.f7523a = i;
        startSmoothScroll(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean supportsPredictiveItemAnimations() {
        return this.f7566q == null;
    }

    public final void t(RecyclerView.u uVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f7553c.b(childAt) > i || this.f7553c.n(childAt) > i) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            cVar.getClass();
            if (cVar.f7595e.f7596a.size() == 1) {
                return;
            }
            d dVar = cVar.f7595e;
            ArrayList<View> arrayList = dVar.f7596a;
            View remove = arrayList.remove(0);
            c cVar2 = (c) remove.getLayoutParams();
            cVar2.f7595e = null;
            if (arrayList.size() == 0) {
                dVar.f7598c = Integer.MIN_VALUE;
            }
            if (cVar2.f7506a.isRemoved() || cVar2.f7506a.isUpdated()) {
                dVar.f7599d -= StaggeredGridLayoutManager.this.f7553c.c(remove);
            }
            dVar.f7597b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void u(int i) {
        z zVar = this.f7557g;
        zVar.f7827e = i;
        zVar.f7826d = this.i != (i == -1) ? -1 : 1;
    }

    public final void v(int i, RecyclerView.y yVar) {
        int i9;
        int i10;
        int i11;
        z zVar = this.f7557g;
        boolean z10 = false;
        zVar.f7824b = 0;
        zVar.f7825c = i;
        if (!isSmoothScrolling() || (i11 = yVar.f7538a) == -1) {
            i9 = 0;
            i10 = 0;
        } else {
            if (this.i == (i11 < i)) {
                i9 = this.f7553c.l();
                i10 = 0;
            } else {
                i10 = this.f7553c.l();
                i9 = 0;
            }
        }
        if (getClipToPadding()) {
            zVar.f7828f = this.f7553c.k() - i10;
            zVar.f7829g = this.f7553c.g() + i9;
        } else {
            zVar.f7829g = this.f7553c.f() + i9;
            zVar.f7828f = -i10;
        }
        zVar.f7830h = false;
        zVar.f7823a = true;
        if (this.f7553c.i() == 0 && this.f7553c.f() == 0) {
            z10 = true;
        }
        zVar.i = z10;
    }

    public final void w(d dVar, int i, int i9) {
        int i10 = dVar.f7599d;
        int i11 = dVar.f7600e;
        if (i != -1) {
            int i12 = dVar.f7598c;
            if (i12 == Integer.MIN_VALUE) {
                dVar.a();
                i12 = dVar.f7598c;
            }
            if (i12 - i10 >= i9) {
                this.f7559j.set(i11, false);
                return;
            }
            return;
        }
        int i13 = dVar.f7597b;
        if (i13 == Integer.MIN_VALUE) {
            View view = dVar.f7596a.get(0);
            c cVar = (c) view.getLayoutParams();
            dVar.f7597b = StaggeredGridLayoutManager.this.f7553c.e(view);
            cVar.getClass();
            i13 = dVar.f7597b;
        }
        if (i13 + i10 <= i9) {
            this.f7559j.set(i11, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }
}
