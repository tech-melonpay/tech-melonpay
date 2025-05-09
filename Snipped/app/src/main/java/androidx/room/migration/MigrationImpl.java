package androidx.room.migration;

import O9.p;
import ca.InterfaceC0646l;
import d1.c;
import kotlin.Metadata;

/* compiled from: MigrationExt.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/migration/MigrationImpl;", "Landroidx/room/migration/Migration;", "", "startVersion", "endVersion", "Lkotlin/Function1;", "Ld1/c;", "LO9/p;", "migrateCallback", "<init>", "(IILca/l;)V", "db", "migrate", "(Ld1/c;)V", "Lca/l;", "getMigrateCallback", "()Lca/l;", "room-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MigrationImpl extends Migration {
    private final InterfaceC0646l<c, p> migrateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i, int i9, InterfaceC0646l<? super c, p> interfaceC0646l) {
        super(i, i9);
        this.migrateCallback = interfaceC0646l;
    }

    public final InterfaceC0646l<c, p> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(c db2) {
        this.migrateCallback.invoke(db2);
    }
}
