package x1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import s1.AbstractC1197g;
import y1.AbstractC1610b;
import y1.C1609a;
import z1.e;
import z1.f;
import z1.g;

/* compiled from: WorkConstraintsTracker.java */
/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583d implements AbstractC1610b.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f30912d = AbstractC1197g.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1582c f30913a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1610b<?>[] f30914b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30915c;

    public C1583d(Context context, D1.a aVar, InterfaceC1582c interfaceC1582c) {
        Context applicationContext = context.getApplicationContext();
        this.f30913a = interfaceC1582c;
        this.f30914b = new AbstractC1610b[]{new C1609a((z1.a) g.a(applicationContext, aVar).f31252a, 0), new C1609a((z1.b) g.a(applicationContext, aVar).f31253b, 1), new C1609a((f) g.a(applicationContext, aVar).f31255d, 2), new y1.c((e) g.a(applicationContext, aVar).f31254c), new y1.f((e) g.a(applicationContext, aVar).f31254c), new y1.e((e) g.a(applicationContext, aVar).f31254c), new y1.d((e) g.a(applicationContext, aVar).f31254c)};
        this.f30915c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f30915c) {
            try {
                for (AbstractC1610b<?> abstractC1610b : this.f30914b) {
                    Object obj = abstractC1610b.f31106b;
                    if (obj != null && abstractC1610b.c(obj) && abstractC1610b.f31105a.contains(str)) {
                        AbstractC1197g.c().a(f30912d, "Work " + str + " constrained by " + abstractC1610b.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f30915c) {
            try {
                for (AbstractC1610b<?> abstractC1610b : this.f30914b) {
                    if (abstractC1610b.f31108d != null) {
                        abstractC1610b.f31108d = null;
                        abstractC1610b.e(null, abstractC1610b.f31106b);
                    }
                }
                for (AbstractC1610b<?> abstractC1610b2 : this.f30914b) {
                    abstractC1610b2.d(collection);
                }
                for (AbstractC1610b<?> abstractC1610b3 : this.f30914b) {
                    if (abstractC1610b3.f31108d != this) {
                        abstractC1610b3.f31108d = this;
                        abstractC1610b3.e(this, abstractC1610b3.f31106b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f30915c) {
            try {
                for (AbstractC1610b<?> abstractC1610b : this.f30914b) {
                    ArrayList arrayList = abstractC1610b.f31105a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC1610b.f31107c.b(abstractC1610b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
