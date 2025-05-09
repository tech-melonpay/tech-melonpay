package androidx.room;

import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends FunctionReferenceImpl implements InterfaceC0646l<d1.c, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, d1.c.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // ca.InterfaceC0646l
    public final Boolean invoke(d1.c cVar) {
        return Boolean.valueOf(cVar.inTransaction());
    }
}
