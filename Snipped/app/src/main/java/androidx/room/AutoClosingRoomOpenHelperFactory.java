package androidx.room;

import d1.d;
import kotlin.Metadata;

/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelperFactory;", "Ld1/d$c;", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Ld1/d$c;Landroidx/room/AutoCloser;)V", "Ld1/d$b;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "create", "(Ld1/d$b;)Landroidx/room/AutoClosingRoomOpenHelper;", "Ld1/d$c;", "Landroidx/room/AutoCloser;", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelperFactory implements d.c {
    private final AutoCloser autoCloser;
    private final d.c delegate;

    public AutoClosingRoomOpenHelperFactory(d.c cVar, AutoCloser autoCloser) {
        this.delegate = cVar;
        this.autoCloser = autoCloser;
    }

    @Override // d1.d.c
    public AutoClosingRoomOpenHelper create(d.b configuration) {
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
