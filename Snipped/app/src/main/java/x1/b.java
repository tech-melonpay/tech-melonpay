package X1;

import a2.C0508a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/* compiled from: CacheManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final PriorityQueue<C0508a> f3901a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue<C0508a> f3902b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3903c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3904d = new Object();

    /* compiled from: CacheManager.java */
    public class a implements Comparator<C0508a> {
        @Override // java.util.Comparator
        public final int compare(C0508a c0508a, C0508a c0508a2) {
            int i = c0508a.f4252e;
            int i9 = c0508a2.f4252e;
            if (i == i9) {
                return 0;
            }
            return i > i9 ? 1 : -1;
        }
    }

    public b() {
        a aVar = new a();
        this.f3902b = new PriorityQueue<>(120, aVar);
        this.f3901a = new PriorityQueue<>(120, aVar);
        this.f3903c = new ArrayList();
    }

    public final void a() {
        synchronized (this.f3904d) {
            while (this.f3902b.size() + this.f3901a.size() >= 120 && !this.f3901a.isEmpty()) {
                try {
                    this.f3901a.poll().f4249b.recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (this.f3902b.size() + this.f3901a.size() >= 120 && !this.f3902b.isEmpty()) {
                this.f3902b.poll().f4249b.recycle();
            }
        }
    }
}
