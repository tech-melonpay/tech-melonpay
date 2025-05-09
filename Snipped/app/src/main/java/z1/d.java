package z1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import s1.AbstractC1197g;
import x1.InterfaceC1580a;
import y1.AbstractC1610b;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f31240f = AbstractC1197g.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final D1.a f31241a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31242b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31243c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f31244d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public T f31245e;

    /* compiled from: ConstraintTracker.java */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f31246a;

        public a(ArrayList arrayList) {
            this.f31246a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f31246a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1580a) it.next()).a(d.this.f31245e);
            }
        }
    }

    public d(Context context, D1.a aVar) {
        this.f31242b = context.getApplicationContext();
        this.f31241a = aVar;
    }

    public abstract T a();

    public final void b(AbstractC1610b abstractC1610b) {
        synchronized (this.f31243c) {
            try {
                if (this.f31244d.remove(abstractC1610b) && this.f31244d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(T t3) {
        synchronized (this.f31243c) {
            try {
                T t10 = this.f31245e;
                if (t10 != t3 && (t10 == null || !t10.equals(t3))) {
                    this.f31245e = t3;
                    ((D1.b) this.f31241a).f860c.execute(new a(new ArrayList(this.f31244d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
