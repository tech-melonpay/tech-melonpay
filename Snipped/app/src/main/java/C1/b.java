package C1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.k f606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f608d = false;

    public b(t1.k kVar, String str) {
        this.f606b = kVar;
        this.f607c = str;
    }

    @Override // C1.c
    public final void b() {
        t1.k kVar = this.f606b;
        WorkDatabase workDatabase = kVar.f27440c;
        workDatabase.beginTransaction();
        try {
            Iterator it = ((B1.r) workDatabase.f()).g(this.f607c).iterator();
            while (it.hasNext()) {
                c.a(kVar, (String) it.next());
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (this.f608d) {
                t1.f.a(kVar.f27439b, kVar.f27440c, kVar.f27442e);
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
