package C1;

import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f613a;

    public f(WorkDatabase workDatabase) {
        this.f613a = workDatabase;
    }

    public final int a(String str) {
        WorkDatabase workDatabase = this.f613a;
        workDatabase.beginTransaction();
        try {
            Long o10 = workDatabase.b().o(str);
            int i = 0;
            int intValue = o10 != null ? o10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            workDatabase.b().q(new B1.d(str, i));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return intValue;
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
