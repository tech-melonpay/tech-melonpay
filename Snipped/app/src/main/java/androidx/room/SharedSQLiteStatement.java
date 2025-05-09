package androidx.room;

import ca.InterfaceC0635a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: SharedSQLiteStatement.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "Ld1/g;", "createNewStatement", "()Ld1/g;", "", "canUseCached", "getStmt", "(Z)Ld1/g;", "", "createQuery", "()Ljava/lang/String;", "LO9/p;", "assertNotMainThread", "()V", "acquire", "statement", "release", "(Ld1/g;)V", "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "LO9/f;", "stmt", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock = new AtomicBoolean(false);

    /* renamed from: stmt$delegate, reason: from kotlin metadata */
    private final O9.f stmt = kotlin.a.a(new InterfaceC0635a<d1.g>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ca.InterfaceC0635a
        public final d1.g invoke() {
            d1.g createNewStatement;
            createNewStatement = SharedSQLiteStatement.this.createNewStatement();
            return createNewStatement;
        }
    });

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        this.database = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d1.g createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final d1.g getStmt() {
        return (d1.g) this.stmt.getValue();
    }

    public d1.g acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(d1.g statement) {
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final d1.g getStmt(boolean canUseCached) {
        return canUseCached ? getStmt() : createNewStatement();
    }
}
