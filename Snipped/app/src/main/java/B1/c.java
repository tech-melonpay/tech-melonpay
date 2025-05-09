package B1;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.ArrayList;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f223a;

    /* renamed from: b, reason: collision with root package name */
    public final a f224b;

    /* compiled from: DependencyDao_Impl.java */
    public class a extends EntityInsertionAdapter<B1.a> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(d1.g gVar, B1.a aVar) {
            B1.a aVar2 = aVar;
            String str = aVar2.f221a;
            if (str == null) {
                gVar.bindNull(1);
            } else {
                gVar.bindString(1, str);
            }
            String str2 = aVar2.f222b;
            if (str2 == null) {
                gVar.bindNull(2);
            } else {
                gVar.bindString(2, str2);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f223a = roomDatabase;
        this.f224b = new a(roomDatabase);
    }

    public final ArrayList a(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f223a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final boolean b(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f223a;
        roomDatabase.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                z10 = query.getInt(0) != 0;
            }
            return z10;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
