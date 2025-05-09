package t1;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class i extends RoomDatabase.Callback {
    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(d1.c cVar) {
        super.onOpen(cVar);
        cVar.beginTransaction();
        try {
            int i = WorkDatabase.f8134b;
            cVar.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f8133a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.setTransactionSuccessful();
        } finally {
            cVar.endTransaction();
        }
    }
}
