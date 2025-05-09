package t1;

import android.content.Context;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import d1.d;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class h implements d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27432a;

    public h(Context context) {
        this.f27432a = context;
    }

    @Override // d1.d.c
    public final d1.d create(d.b bVar) {
        String str = bVar.f20405b;
        d.a aVar = bVar.f20406c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        return new FrameworkSQLiteOpenHelper(this.f27432a, str, aVar, true);
    }
}
