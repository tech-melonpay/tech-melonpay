package androidx.emoji2.text;

import C.y;
import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import g1.C0758a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.j;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements g1.b<Boolean> {

    public static class a extends d.c {
    }

    public static class b implements d.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6543a;

        public b(Context context) {
            this.f6543a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new com.sumsub.sns.internal.ml.core.f("EmojiCompatInitializer", 2));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new y(this, iVar, threadPoolExecutor, 4));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = j.f27405a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.f6548k != null) {
                    d.a().c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i9 = j.f27405a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // g1.b
    public final List<Class<? extends g1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // g1.b
    public final /* bridge */ /* synthetic */ Boolean b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        a aVar = new a(new b(context));
        aVar.f6561b = 1;
        if (d.f6548k == null) {
            synchronized (d.f6547j) {
                try {
                    if (d.f6548k == null) {
                        d.f6548k = new d(aVar);
                    }
                } finally {
                }
            }
        }
        C0758a c2 = C0758a.c(context);
        c2.getClass();
        synchronized (C0758a.f20757e) {
            try {
                obj = c2.f20758a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        Lifecycle lifecycle = ((r) obj).getLifecycle();
        lifecycle.a(new I0.b(this, lifecycle));
    }
}
