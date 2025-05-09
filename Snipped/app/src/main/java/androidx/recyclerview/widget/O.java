package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final b f7463a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7464b;

    /* compiled from: ViewBoundsCheck.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f7465a;

        /* renamed from: b, reason: collision with root package name */
        public int f7466b;

        /* renamed from: c, reason: collision with root package name */
        public int f7467c;

        /* renamed from: d, reason: collision with root package name */
        public int f7468d;

        /* renamed from: e, reason: collision with root package name */
        public int f7469e;

        public final boolean a() {
            int i = this.f7465a;
            int i9 = 2;
            if ((i & 7) != 0) {
                int i10 = this.f7468d;
                int i11 = this.f7466b;
                if (((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i12 = this.f7468d;
                int i13 = this.f7467c;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i14 = this.f7469e;
                int i15 = this.f7466b;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i16 = this.f7469e;
                int i17 = this.f7467c;
                if (i16 > i17) {
                    i9 = 1;
                } else if (i16 != i17) {
                    i9 = 4;
                }
                if ((i & (i9 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i);

        int e(View view);
    }

    public O(b bVar) {
        this.f7463a = bVar;
        a aVar = new a();
        aVar.f7465a = 0;
        this.f7464b = aVar;
    }

    public final View a(int i, int i9, int i10, int i11) {
        b bVar = this.f7463a;
        int b9 = bVar.b();
        int c2 = bVar.c();
        int i12 = i9 > i ? 1 : -1;
        View view = null;
        while (i != i9) {
            View d10 = bVar.d(i);
            int a10 = bVar.a(d10);
            int e10 = bVar.e(d10);
            a aVar = this.f7464b;
            aVar.f7466b = b9;
            aVar.f7467c = c2;
            aVar.f7468d = a10;
            aVar.f7469e = e10;
            if (i10 != 0) {
                aVar.f7465a = i10;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i11 != 0) {
                aVar.f7465a = i11;
                if (aVar.a()) {
                    view = d10;
                }
            }
            i += i12;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f7463a;
        int b9 = bVar.b();
        int c2 = bVar.c();
        int a10 = bVar.a(view);
        int e10 = bVar.e(view);
        a aVar = this.f7464b;
        aVar.f7466b = b9;
        aVar.f7467c = c2;
        aVar.f7468d = a10;
        aVar.f7469e = e10;
        aVar.f7465a = 24579;
        return aVar.a();
    }
}
