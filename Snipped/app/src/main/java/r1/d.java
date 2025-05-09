package R1;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

/* compiled from: HttpTransactionDao_Impl.java */
/* loaded from: classes.dex */
public final class d extends SharedSQLiteStatement {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RoomDatabase roomDatabase, int i) {
        super(roomDatabase);
        this.f3254a = i;
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        switch (this.f3254a) {
            case 0:
                return "DELETE FROM transactions";
            default:
                return "DELETE FROM transactions WHERE requestDate <= ?";
        }
    }
}
