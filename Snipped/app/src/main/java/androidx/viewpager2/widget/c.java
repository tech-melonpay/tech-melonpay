package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    public ViewPager2.e f8049a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f8050b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f8051c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f8052d;

    /* renamed from: e, reason: collision with root package name */
    public int f8053e;

    /* renamed from: f, reason: collision with root package name */
    public int f8054f;

    /* renamed from: g, reason: collision with root package name */
    public final a f8055g;

    /* renamed from: h, reason: collision with root package name */
    public int f8056h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8057j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8058k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8059l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8060m;

    /* compiled from: ScrollEventAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8061a;

        /* renamed from: b, reason: collision with root package name */
        public float f8062b;

        /* renamed from: c, reason: collision with root package name */
        public int f8063c;
    }

    public c(ViewPager2 viewPager2) {
        this.f8050b = viewPager2;
        ViewPager2.i iVar = viewPager2.f8020j;
        this.f8051c = iVar;
        this.f8052d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f8055g = new a();
        b();
    }

    public final void a(int i) {
        if ((this.f8053e == 3 && this.f8054f == 0) || this.f8054f == i) {
            return;
        }
        this.f8054f = i;
        ViewPager2.e eVar = this.f8049a;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
    }

    public final void b() {
        this.f8053e = 0;
        this.f8054f = 0;
        a aVar = this.f8055g;
        aVar.f8061a = -1;
        aVar.f8062b = 0.0f;
        aVar.f8063c = 0;
        this.f8056h = -1;
        this.i = -1;
        this.f8057j = false;
        this.f8058k = false;
        this.f8060m = false;
        this.f8059l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        r1 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
    
        if (r1.C1147a.a(r0.getChildAt(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        throw new java.lang.IllegalStateException(com.google.android.gms.measurement.internal.a.g(r2.f8063c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.c():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ViewPager2.e eVar;
        ViewPager2.e eVar2;
        int i9 = this.f8053e;
        boolean z10 = true;
        if (!(i9 == 1 && this.f8054f == 1) && i == 1) {
            this.f8060m = false;
            this.f8053e = 1;
            int i10 = this.i;
            if (i10 != -1) {
                this.f8056h = i10;
                this.i = -1;
            } else if (this.f8056h == -1) {
                this.f8056h = this.f8052d.findFirstVisibleItemPosition();
            }
            a(1);
            return;
        }
        if ((i9 == 1 || i9 == 4) && i == 2) {
            if (this.f8058k) {
                a(2);
                this.f8057j = true;
                return;
            }
            return;
        }
        if (i9 != 1 && i9 != 4) {
            z10 = false;
        }
        a aVar = this.f8055g;
        if (z10 && i == 0) {
            c();
            if (!this.f8058k) {
                int i11 = aVar.f8061a;
                if (i11 != -1 && (eVar2 = this.f8049a) != null) {
                    eVar2.onPageScrolled(i11, 0.0f, 0);
                }
            } else if (aVar.f8063c == 0) {
                int i12 = this.f8056h;
                int i13 = aVar.f8061a;
                if (i12 != i13 && (eVar = this.f8049a) != null) {
                    eVar.onPageSelected(i13);
                }
            }
            a(0);
            b();
        }
        if (this.f8053e == 2 && i == 0 && this.f8059l) {
            c();
            if (aVar.f8063c == 0) {
                int i14 = this.i;
                int i15 = aVar.f8061a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    ViewPager2.e eVar3 = this.f8049a;
                    if (eVar3 != null) {
                        eVar3.onPageSelected(i15);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.f8050b.f8018g.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f8058k = r6
            r5.c()
            boolean r0 = r5.f8057j
            androidx.viewpager2.widget.c$a r1 = r5.f8055g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L40
            r5.f8057j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f8050b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.f8018g
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f8063c
            if (r7 == 0) goto L30
            int r7 = r1.f8061a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f8061a
        L32:
            r5.i = r7
            int r8 = r5.f8056h
            if (r8 == r7) goto L50
            androidx.viewpager2.widget.ViewPager2$e r8 = r5.f8049a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
            goto L50
        L40:
            int r7 = r5.f8053e
            if (r7 != 0) goto L50
            int r7 = r1.f8061a
            if (r7 != r2) goto L49
            r7 = r3
        L49:
            androidx.viewpager2.widget.ViewPager2$e r8 = r5.f8049a
            if (r8 == 0) goto L50
            r8.onPageSelected(r7)
        L50:
            int r7 = r1.f8061a
            if (r7 != r2) goto L55
            r7 = r3
        L55:
            float r8 = r1.f8062b
            int r0 = r1.f8063c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f8049a
            if (r4 == 0) goto L60
            r4.onPageScrolled(r7, r8, r0)
        L60:
            int r7 = r1.f8061a
            int r8 = r5.i
            if (r7 == r8) goto L68
            if (r8 != r2) goto L76
        L68:
            int r7 = r1.f8063c
            if (r7 != 0) goto L76
            int r7 = r5.f8054f
            if (r7 == r6) goto L76
            r5.a(r3)
            r5.b()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
