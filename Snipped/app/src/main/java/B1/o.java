package B1;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f240a;

    /* renamed from: b, reason: collision with root package name */
    public final b f241b;

    /* renamed from: c, reason: collision with root package name */
    public final c f242c;

    /* compiled from: WorkProgressDao_Impl.java */
    public class a extends EntityInsertionAdapter<m> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(d1.g gVar, m mVar) {
            mVar.getClass();
            gVar.bindNull(1);
            byte[] b9 = androidx.work.b.b(null);
            if (b9 == null) {
                gVar.bindNull(2);
            } else {
                gVar.bindBlob(2, b9);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f240a = roomDatabase;
        new a(roomDatabase);
        this.f241b = new b(roomDatabase);
        this.f242c = new c(roomDatabase);
    }
}
