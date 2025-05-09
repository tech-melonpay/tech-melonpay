package H0;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<a> f1373f = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public d f1377d;

    /* renamed from: a, reason: collision with root package name */
    public final g<b, Long> f1374a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f1375b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final C0018a f1376c = new C0018a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1378e = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: H0.a$a, reason: collision with other inner class name */
    public class C0018a {
        public C0018a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    public interface b {
        boolean a(long j10);
    }

    /* compiled from: AnimationHandler.java */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C0018a f1380a;

        public c(C0018a c0018a) {
            this.f1380a = c0018a;
        }
    }

    /* compiled from: AnimationHandler.java */
    public static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final Choreographer f1381b;

        /* renamed from: c, reason: collision with root package name */
        public final ChoreographerFrameCallbackC0019a f1382c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: H0.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0019a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0019a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                ArrayList<b> arrayList;
                C0018a c0018a = d.this.f1380a;
                c0018a.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                aVar.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    arrayList = aVar.f1375b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i);
                    if (bVar != null) {
                        g<b, Long> gVar = aVar.f1374a;
                        Long l10 = gVar.get(bVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                gVar.remove(bVar);
                            }
                        }
                        bVar.a(uptimeMillis);
                    }
                    i++;
                }
                if (aVar.f1378e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f1378e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.f1377d == null) {
                        aVar.f1377d = new d(aVar.f1376c);
                    }
                    d dVar = aVar.f1377d;
                    dVar.f1381b.postFrameCallback(dVar.f1382c);
                }
            }
        }

        public d(C0018a c0018a) {
            super(c0018a);
            this.f1381b = Choreographer.getInstance();
            this.f1382c = new ChoreographerFrameCallbackC0019a();
        }
    }
}
