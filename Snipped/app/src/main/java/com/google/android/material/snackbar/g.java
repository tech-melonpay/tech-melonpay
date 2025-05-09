package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static g f9790e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9791a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9792b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    public c f9793c;

    /* renamed from: d, reason: collision with root package name */
    public c f9794d;

    /* compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f9791a) {
                try {
                    if (gVar.f9793c != cVar) {
                        if (gVar.f9794d == cVar) {
                        }
                    }
                    gVar.a(cVar, 2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    public interface b {
        void a();

        void b(int i);
    }

    /* compiled from: SnackbarManager.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<b> f9796a;

        /* renamed from: b, reason: collision with root package name */
        public int f9797b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9798c;

        public c(int i, BaseTransientBottomBar.c cVar) {
            this.f9796a = new WeakReference<>(cVar);
            this.f9797b = i;
        }
    }

    public static g b() {
        if (f9790e == null) {
            f9790e = new g();
        }
        return f9790e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.f9796a.get();
        if (bVar == null) {
            return false;
        }
        this.f9792b.removeCallbacksAndMessages(cVar);
        bVar.b(i);
        return true;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        c cVar2 = this.f9793c;
        return (cVar2 == null || cVar == null || cVar2.f9796a.get() != cVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.f9791a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f9793c;
                    if (!cVar2.f9798c) {
                        cVar2.f9798c = true;
                        this.f9792b.removeCallbacksAndMessages(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.f9791a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f9793c;
                    if (cVar2.f9798c) {
                        cVar2.f9798c = false;
                        f(cVar2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(c cVar) {
        int i = cVar.f9797b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = this.f9792b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }
}
