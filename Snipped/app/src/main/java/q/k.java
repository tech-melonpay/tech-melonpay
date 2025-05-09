package q;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.Q;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import q.C1126b;
import q.i;

/* compiled from: BiometricViewModel.java */
/* loaded from: classes.dex */
public final class k extends Q {

    /* renamed from: B0, reason: collision with root package name */
    public i.d f25787B0;

    /* renamed from: C0, reason: collision with root package name */
    public i.c f25788C0;

    /* renamed from: D0, reason: collision with root package name */
    public C1126b f25789D0;

    /* renamed from: E0, reason: collision with root package name */
    public l f25790E0;

    /* renamed from: F0, reason: collision with root package name */
    public c f25791F0;

    /* renamed from: G0, reason: collision with root package name */
    public CharSequence f25792G0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f25794I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f25795J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f25796K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f25797L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f25798M0;
    public boolean N0;

    /* renamed from: O0, reason: collision with root package name */
    public C0559z<i.b> f25799O0;

    /* renamed from: P0, reason: collision with root package name */
    public C0559z<d> f25800P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C0559z<CharSequence> f25801Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C0559z<Boolean> f25802R0;

    /* renamed from: S0, reason: collision with root package name */
    public C0559z<Boolean> f25803S0;

    /* renamed from: U0, reason: collision with root package name */
    public C0559z<Boolean> f25805U0;

    /* renamed from: W0, reason: collision with root package name */
    public C0559z<Integer> f25807W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0559z<CharSequence> f25808X0;

    /* renamed from: k, reason: collision with root package name */
    public Executor f25809k;

    /* renamed from: p, reason: collision with root package name */
    public i.a f25810p;

    /* renamed from: H0, reason: collision with root package name */
    public int f25793H0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f25804T0 = true;

    /* renamed from: V0, reason: collision with root package name */
    public int f25806V0 = 0;

    /* compiled from: BiometricViewModel.java */
    public static final class a extends C1126b.c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f25811a;

        public a(k kVar) {
            this.f25811a = new WeakReference<>(kVar);
        }

        @Override // q.C1126b.c
        public final void a(int i, CharSequence charSequence) {
            WeakReference<k> weakReference = this.f25811a;
            if (weakReference.get() == null || weakReference.get().f25796K0 || !weakReference.get().f25795J0) {
                return;
            }
            weakReference.get().m(new d(i, charSequence));
        }

        @Override // q.C1126b.c
        public final void b(i.b bVar) {
            WeakReference<k> weakReference = this.f25811a;
            if (weakReference.get() == null || !weakReference.get().f25795J0) {
                return;
            }
            int i = -1;
            if (bVar.f25774b == -1) {
                int k3 = weakReference.get().k();
                if ((k3 & 32767) != 0 && !C1127c.a(k3)) {
                    i = 2;
                }
                bVar = new i.b(bVar.f25773a, i);
            }
            k kVar = weakReference.get();
            if (kVar.f25799O0 == null) {
                kVar.f25799O0 = new C0559z<>();
            }
            k.q(kVar.f25799O0, bVar);
        }
    }

    /* compiled from: BiometricViewModel.java */
    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f25812a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f25812a.post(runnable);
        }
    }

    /* compiled from: BiometricViewModel.java */
    public static class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<k> f25813a;

        public c(k kVar) {
            this.f25813a = new WeakReference<>(kVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            WeakReference<k> weakReference = this.f25813a;
            if (weakReference.get() != null) {
                weakReference.get().p(true);
            }
        }
    }

    public static <T> void q(C0559z<T> c0559z, T t3) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c0559z.setValue(t3);
        } else {
            c0559z.postValue(t3);
        }
    }

    public final int k() {
        if (this.f25787B0 != null) {
            return this.f25788C0 != null ? 15 : 255;
        }
        return 0;
    }

    public final CharSequence l() {
        CharSequence charSequence = this.f25792G0;
        if (charSequence != null) {
            return charSequence;
        }
        i.d dVar = this.f25787B0;
        if (dVar == null) {
            return null;
        }
        CharSequence charSequence2 = dVar.f25782c;
        return charSequence2 != null ? charSequence2 : "";
    }

    public final void m(d dVar) {
        if (this.f25800P0 == null) {
            this.f25800P0 = new C0559z<>();
        }
        q(this.f25800P0, dVar);
    }

    public final void n(CharSequence charSequence) {
        if (this.f25808X0 == null) {
            this.f25808X0 = new C0559z<>();
        }
        q(this.f25808X0, charSequence);
    }

    public final void o(int i) {
        if (this.f25807W0 == null) {
            this.f25807W0 = new C0559z<>();
        }
        q(this.f25807W0, Integer.valueOf(i));
    }

    public final void p(boolean z10) {
        if (this.f25803S0 == null) {
            this.f25803S0 = new C0559z<>();
        }
        q(this.f25803S0, Boolean.valueOf(z10));
    }
}
