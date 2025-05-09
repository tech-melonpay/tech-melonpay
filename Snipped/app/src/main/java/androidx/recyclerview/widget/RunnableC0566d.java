package androidx.recyclerview.widget;

import androidx.recyclerview.widget.q;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: AsyncListDiffer.java */
/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0566d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f7621d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0567e f7622e;

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a extends q.b {
        public a() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public final boolean areContentsTheSame(int i, int i9) {
            RunnableC0566d runnableC0566d = RunnableC0566d.this;
            Object obj = runnableC0566d.f7618a.get(i);
            Object obj2 = runnableC0566d.f7619b.get(i9);
            if (obj != null && obj2 != null) {
                return runnableC0566d.f7622e.f7628b.f7615c.areContentsTheSame(obj, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        @Override // androidx.recyclerview.widget.q.b
        public final boolean areItemsTheSame(int i, int i9) {
            RunnableC0566d runnableC0566d = RunnableC0566d.this;
            Object obj = runnableC0566d.f7618a.get(i);
            Object obj2 = runnableC0566d.f7619b.get(i9);
            return (obj == null || obj2 == null) ? obj == null && obj2 == null : runnableC0566d.f7622e.f7628b.f7615c.areItemsTheSame(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public final Object getChangePayload(int i, int i9) {
            RunnableC0566d runnableC0566d = RunnableC0566d.this;
            Object obj = runnableC0566d.f7618a.get(i);
            Object obj2 = runnableC0566d.f7619b.get(i9);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            return runnableC0566d.f7622e.f7628b.f7615c.getChangePayload(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public final int getNewListSize() {
            return RunnableC0566d.this.f7619b.size();
        }

        @Override // androidx.recyclerview.widget.q.b
        public final int getOldListSize() {
            return RunnableC0566d.this.f7618a.size();
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q.d f7624a;

        public b(q.d dVar) {
            this.f7624a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC0566d runnableC0566d = RunnableC0566d.this;
            C0567e c0567e = runnableC0566d.f7622e;
            if (c0567e.f7633g == runnableC0566d.f7620c) {
                List<T> list = runnableC0566d.f7619b;
                Runnable runnable = runnableC0566d.f7621d;
                Collection collection = c0567e.f7632f;
                c0567e.f7631e = list;
                c0567e.f7632f = Collections.unmodifiableList(list);
                this.f7624a.a(c0567e.f7627a);
                c0567e.a(collection, runnable);
            }
        }
    }

    public RunnableC0566d(C0567e c0567e, List list, List list2, int i) {
        this.f7622e = c0567e;
        this.f7618a = list;
        this.f7619b = list2;
        this.f7620c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7622e.f7629c.execute(new b(q.a(new a())));
    }
}
