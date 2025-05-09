package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: b, reason: collision with root package name */
    public int f6920b;

    /* renamed from: c, reason: collision with root package name */
    public int f6921c;

    /* renamed from: d, reason: collision with root package name */
    public int f6922d;

    /* renamed from: e, reason: collision with root package name */
    public int f6923e;

    /* renamed from: f, reason: collision with root package name */
    public int f6924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6925g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f6927j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6928k;

    /* renamed from: l, reason: collision with root package name */
    public int f6929l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6930m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f6931n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<String> f6932o;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<Runnable> f6934q;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f6919a = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f6926h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6933p = false;

    /* compiled from: FragmentTransaction.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6935a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f6936b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6937c;

        /* renamed from: d, reason: collision with root package name */
        public int f6938d;

        /* renamed from: e, reason: collision with root package name */
        public int f6939e;

        /* renamed from: f, reason: collision with root package name */
        public int f6940f;

        /* renamed from: g, reason: collision with root package name */
        public int f6941g;

        /* renamed from: h, reason: collision with root package name */
        public Lifecycle.State f6942h;
        public Lifecycle.State i;

        public a() {
        }

        public a(Fragment fragment, int i) {
            this.f6935a = i;
            this.f6936b = fragment;
            this.f6937c = false;
            Lifecycle.State state = Lifecycle.State.f6979e;
            this.f6942h = state;
            this.i = state;
        }

        public a(Fragment fragment, int i, int i9) {
            this.f6935a = i;
            this.f6936b = fragment;
            this.f6937c = true;
            Lifecycle.State state = Lifecycle.State.f6979e;
            this.f6942h = state;
            this.i = state;
        }
    }

    public final void b(a aVar) {
        this.f6919a.add(aVar);
        aVar.f6938d = this.f6920b;
        aVar.f6939e = this.f6921c;
        aVar.f6940f = this.f6922d;
        aVar.f6941g = this.f6923e;
    }

    public final void c(String str) {
        if (!this.f6926h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f6925g = true;
        this.i = str;
    }

    public abstract void d(int i, Fragment fragment, String str, int i9);

    public final void e(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i, fragment, str, 2);
    }
}
