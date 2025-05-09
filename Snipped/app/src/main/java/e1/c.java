package e1;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import d1.d;

/* compiled from: FrameworkSQLiteOpenHelperFactory.kt */
/* loaded from: classes.dex */
public final class c implements d.c {
    @Override // d1.d.c
    public final d1.d create(d.b bVar) {
        boolean z10 = bVar.f20407d;
        return new FrameworkSQLiteOpenHelper(bVar.f20404a, bVar.f20405b, bVar.f20406c, z10);
    }
}
