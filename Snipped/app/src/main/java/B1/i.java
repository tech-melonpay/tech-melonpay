package B1;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f233a;

    /* renamed from: b, reason: collision with root package name */
    public final a f234b;

    /* renamed from: c, reason: collision with root package name */
    public final b f235c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    public class a extends EntityInsertionAdapter<g> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(d1.g gVar, g gVar2) {
            String str = gVar2.f231a;
            if (str == null) {
                gVar.bindNull(1);
            } else {
                gVar.bindString(1, str);
            }
            gVar.bindLong(2, r4.f232b);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.f233a = roomDatabase;
        this.f234b = new a(roomDatabase);
        this.f235c = new b(roomDatabase);
    }

    public final g a(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f233a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            return query.moveToFirst() ? new g(query.getString(CursorUtil.getColumnIndexOrThrow(query, "work_spec_id")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "system_id"))) : null;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final void b(g gVar) {
        RoomDatabase roomDatabase = this.f233a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f234b.insert((a) gVar);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    public final void c(String str) {
        RoomDatabase roomDatabase = this.f233a;
        roomDatabase.assertNotSuspendingTransaction();
        b bVar = this.f235c;
        d1.g acquire = bVar.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            bVar.release(acquire);
        }
    }
}
