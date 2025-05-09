package B1;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f238a;

    /* renamed from: b, reason: collision with root package name */
    public final a f239b;

    /* compiled from: WorkNameDao_Impl.java */
    public class a extends EntityInsertionAdapter<j> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(d1.g gVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f236a;
            if (str == null) {
                gVar.bindNull(1);
            } else {
                gVar.bindString(1, str);
            }
            String str2 = jVar2.f237b;
            if (str2 == null) {
                gVar.bindNull(2);
            } else {
                gVar.bindString(2, str2);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.f238a = roomDatabase;
        this.f239b = new a(roomDatabase);
    }
}
