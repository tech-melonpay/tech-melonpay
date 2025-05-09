package B1;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.ArrayList;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f272a;

    /* renamed from: b, reason: collision with root package name */
    public final a f273b;

    /* compiled from: WorkTagDao_Impl.java */
    public class a extends EntityInsertionAdapter<s> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(d1.g gVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.f270a;
            if (str == null) {
                gVar.bindNull(1);
            } else {
                gVar.bindString(1, str);
            }
            String str2 = sVar2.f271b;
            if (str2 == null) {
                gVar.bindNull(2);
            } else {
                gVar.bindString(2, str2);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.f272a = roomDatabase;
        this.f273b = new a(roomDatabase);
    }

    public final ArrayList a(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f272a;
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
}
