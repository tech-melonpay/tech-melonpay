package C1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.k f604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f605c;

    public a(t1.k kVar, UUID uuid) {
        this.f604b = kVar;
        this.f605c = uuid;
    }

    @Override // C1.c
    public final void b() {
        t1.k kVar = this.f604b;
        WorkDatabase workDatabase = kVar.f27440c;
        workDatabase.beginTransaction();
        try {
            c.a(kVar, this.f605c.toString());
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            t1.f.a(kVar.f27439b, kVar.f27440c, kVar.f27442e);
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
