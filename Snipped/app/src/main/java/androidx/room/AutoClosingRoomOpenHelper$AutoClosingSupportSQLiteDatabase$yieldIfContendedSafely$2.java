package androidx.room;

import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 extends FunctionReferenceImpl implements InterfaceC0646l<d1.c, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2();

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2() {
        super(1, d1.c.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // ca.InterfaceC0646l
    public final Boolean invoke(d1.c cVar) {
        return Boolean.valueOf(cVar.yieldIfContendedSafely());
    }
}
