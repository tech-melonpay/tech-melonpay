package e1;

import android.database.sqlite.SQLiteStatement;
import d1.g;

/* compiled from: FrameworkSQLiteStatement.kt */
/* loaded from: classes.dex */
public final class e extends d implements g {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f20504b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f20504b = sQLiteStatement;
    }

    @Override // d1.g
    public final void execute() {
        this.f20504b.execute();
    }

    @Override // d1.g
    public final long executeInsert() {
        return this.f20504b.executeInsert();
    }

    @Override // d1.g
    public final int executeUpdateDelete() {
        return this.f20504b.executeUpdateDelete();
    }

    @Override // d1.g
    public final long simpleQueryForLong() {
        return this.f20504b.simpleQueryForLong();
    }

    @Override // d1.g
    public final String simpleQueryForString() {
        return this.f20504b.simpleQueryForString();
    }
}
