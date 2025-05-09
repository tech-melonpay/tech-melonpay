package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import pa.C1124b;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f6547j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile d f6548k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f6549a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.collection.b f6550b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6551c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6552d;

    /* renamed from: e, reason: collision with root package name */
    public final a f6553e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6554f;

    /* renamed from: g, reason: collision with root package name */
    public final C0074d f6555g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6556h;
    public final androidx.emoji2.text.b i;

    /* compiled from: EmojiCompat.java */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f6557b;

        /* renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f6558c;
    }

    /* compiled from: EmojiCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final d f6559a;

        public b(d dVar) {
            this.f6559a = dVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f6560a;

        /* renamed from: b, reason: collision with root package name */
        public int f6561b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.emoji2.text.b f6562c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.f6560a = hVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0074d implements j {
    }

    /* compiled from: EmojiCompat.java */
    public interface e {
    }

    /* compiled from: EmojiCompat.java */
    public static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6563a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6564b;

        public g(List list, int i, Throwable th) {
            C1124b.p(list, "initCallbacks cannot be null");
            this.f6563a = new ArrayList(list);
            this.f6564b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f6563a;
            int size = arrayList.size();
            int i = 0;
            if (this.f6564b != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).getClass();
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface h {
        void a(i iVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    /* compiled from: EmojiCompat.java */
    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6549a = reentrantReadWriteLock;
        this.f6551c = 3;
        h hVar = aVar.f6560a;
        this.f6554f = hVar;
        int i9 = aVar.f6561b;
        this.f6556h = i9;
        this.i = aVar.f6562c;
        this.f6552d = new Handler(Looper.getMainLooper());
        this.f6550b = new androidx.collection.b(0);
        this.f6555g = new C0074d();
        a aVar2 = new a(this);
        this.f6553e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i9 == 0) {
            try {
                this.f6551c = 0;
            } catch (Throwable th) {
                this.f6549a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (f6547j) {
            dVar = f6548k;
            C1124b.q(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public final int b() {
        this.f6549a.readLock().lock();
        try {
            return this.f6551c;
        } finally {
            this.f6549a.readLock().unlock();
        }
    }

    public final void c() {
        C1124b.q(this.f6556h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (b() == 1) {
            return;
        }
        this.f6549a.writeLock().lock();
        try {
            if (this.f6551c == 0) {
                return;
            }
            this.f6551c = 0;
            this.f6549a.writeLock().unlock();
            a aVar = this.f6553e;
            d dVar = aVar.f6559a;
            try {
                dVar.f6554f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th) {
                dVar.d(th);
            }
        } finally {
            this.f6549a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6549a.writeLock().lock();
        try {
            this.f6551c = 2;
            arrayList.addAll(this.f6550b);
            this.f6550b.clear();
            this.f6549a.writeLock().unlock();
            this.f6552d.post(new g(arrayList, this.f6551c, th));
        } catch (Throwable th2) {
            this.f6549a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f6549a.writeLock().lock();
        try {
            this.f6551c = 1;
            arrayList.addAll(this.f6550b);
            this.f6550b.clear();
            this.f6549a.writeLock().unlock();
            this.f6552d.post(new g(arrayList, this.f6551c, null));
        } catch (Throwable th) {
            this.f6549a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:67:0x005c, B:70:0x0061, B:72:0x0065, B:74:0x0072, B:29:0x008e, B:31:0x0098, B:33:0x009b, B:35:0x009e, B:37:0x00ae, B:39:0x00b1, B:44:0x00c0, B:47:0x00c7, B:49:0x00db, B:27:0x0084), top: B:66:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:67:0x005c, B:70:0x0061, B:72:0x0065, B:74:0x0072, B:29:0x008e, B:31:0x0098, B:33:0x009b, B:35:0x009e, B:37:0x00ae, B:39:0x00b1, B:44:0x00c0, B:47:0x00c7, B:49:0x00db, B:27:0x0084), top: B:66:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.f(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void g(f fVar) {
        C1124b.p(fVar, "initCallback cannot be null");
        this.f6549a.writeLock().lock();
        try {
            if (this.f6551c != 1 && this.f6551c != 2) {
                this.f6550b.add(fVar);
                this.f6549a.writeLock().unlock();
            }
            this.f6552d.post(new g(Arrays.asList(fVar), this.f6551c, null));
            this.f6549a.writeLock().unlock();
        } catch (Throwable th) {
            this.f6549a.writeLock().unlock();
            throw th;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class f {
        public void a() {
        }
    }
}
