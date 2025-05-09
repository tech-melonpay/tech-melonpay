package h;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.b;
import h.ServiceC0786m;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: AppCompatDelegate.java */
/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0777d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20849a = new c(new ExecutorC0403d());

    /* renamed from: b, reason: collision with root package name */
    public static final int f20850b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static t0.g f20851c = null;

    /* renamed from: d, reason: collision with root package name */
    public static t0.g f20852d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20853e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f20854f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.collection.b<WeakReference<AbstractC0777d>> f20855g = new androidx.collection.b<>(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20856h = new Object();
    public static final Object i = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.d$a */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.d$b */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.d$c */
    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20857a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque f20858b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public final Executor f20859c;

        /* renamed from: d, reason: collision with root package name */
        public Runnable f20860d;

        public c(ExecutorC0403d executorC0403d) {
            this.f20859c = executorC0403d;
        }

        public final void a() {
            synchronized (this.f20857a) {
                try {
                    Runnable runnable = (Runnable) this.f20858b.poll();
                    this.f20860d = runnable;
                    if (runnable != null) {
                        this.f20859c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f20857a) {
                try {
                    this.f20858b.add(new com.sumsub.sns.camera.photo.presentation.document.c(2, this, runnable));
                    if (this.f20860d == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* renamed from: h.d$d, reason: collision with other inner class name */
    public static class ExecutorC0403d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean l(Context context) {
        if (f20853e == null) {
            try {
                int i9 = ServiceC0786m.f20959a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0786m.class), ServiceC0786m.a.a() | 128).metaData;
                if (bundle != null) {
                    f20853e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20853e = Boolean.FALSE;
            }
        }
        return f20853e.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(AbstractC0777d abstractC0777d) {
        synchronized (f20856h) {
            try {
                androidx.collection.b<WeakReference<AbstractC0777d>> bVar = f20855g;
                bVar.getClass();
                b.a aVar = new b.a();
                while (aVar.hasNext()) {
                    AbstractC0777d abstractC0777d2 = (AbstractC0777d) ((WeakReference) aVar.next()).get();
                    if (abstractC0777d2 == abstractC0777d || abstractC0777d2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T e(int i9);

    public Context f() {
        return null;
    }

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract AbstractC0774a i();

    public abstract void j();

    public abstract void k();

    public abstract void m(Configuration configuration);

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i9);

    public abstract void v(int i9);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public Context d(Context context) {
        return context;
    }

    public void z(int i9) {
    }
}
