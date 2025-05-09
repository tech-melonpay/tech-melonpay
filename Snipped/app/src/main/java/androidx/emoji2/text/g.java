package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pa.C1124b;
import u0.C1499c;
import u0.C1500d;
import u0.C1506j;
import u0.C1507k;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class g extends d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6581d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class b implements d.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f6582a;

        /* renamed from: b, reason: collision with root package name */
        public final C1500d f6583b;

        /* renamed from: c, reason: collision with root package name */
        public final a f6584c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f6585d;

        /* renamed from: e, reason: collision with root package name */
        public Handler f6586e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f6587f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f6588g;

        /* renamed from: h, reason: collision with root package name */
        public d.i f6589h;

        public b(Context context, C1500d c1500d) {
            a aVar = g.f6581d;
            this.f6585d = new Object();
            C1124b.p(context, "Context cannot be null");
            this.f6582a = context.getApplicationContext();
            this.f6583b = c1500d;
            this.f6584c = aVar;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.f6585d) {
                this.f6589h = iVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f6585d) {
                try {
                    this.f6589h = null;
                    Handler handler = this.f6586e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f6586e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f6588g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f6587f = null;
                    this.f6588g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            synchronized (this.f6585d) {
                try {
                    if (this.f6589h == null) {
                        return;
                    }
                    if (this.f6587f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new com.sumsub.sns.internal.ml.core.f("emojiCompat", 2));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f6588g = threadPoolExecutor;
                        this.f6587f = threadPoolExecutor;
                    }
                    this.f6587f.execute(new B2.d(this, 8));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C1507k d() {
            try {
                a aVar = this.f6584c;
                Context context = this.f6582a;
                C1500d c1500d = this.f6583b;
                aVar.getClass();
                Object[] objArr = {c1500d};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                C1506j a10 = C1499c.a(context, Collections.unmodifiableList(arrayList));
                int i = a10.f30114a;
                if (i != 0) {
                    throw new RuntimeException(s3.b.i("fetchFonts failed (", i, ")"));
                }
                C1507k[] c1507kArr = a10.f30115b.get(0);
                if (c1507kArr == null || c1507kArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return c1507kArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }
}
