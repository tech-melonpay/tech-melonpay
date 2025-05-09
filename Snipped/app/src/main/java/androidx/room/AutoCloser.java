package androidx.room;

import O9.p;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ca.InterfaceC0646l;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: AutoCloser.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u000eR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010&R\u0014\u0010E\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010&R\u0011\u0010F\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u0002008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u00104¨\u0006K"}, d2 = {"Landroidx/room/AutoCloser;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Ld1/d;", "delegateOpenHelper", "LO9/p;", "init", "(Ld1/d;)V", "V", "Lkotlin/Function1;", "Ld1/c;", "block", "executeRefCountingFunction", "(Lca/l;)Ljava/lang/Object;", "incrementCountAndEnsureDbIsOpen", "()Ld1/c;", "decrementCountAndScheduleClose", "()V", "closeDatabaseIfOpen", "Ljava/lang/Runnable;", "onAutoClose", "setAutoCloseCallback", "(Ljava/lang/Runnable;)V", "Ld1/d;", "getDelegateOpenHelper", "()Ld1/d;", "setDelegateOpenHelper", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "onAutoCloseCallback", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "lock", "Ljava/lang/Object;", "autoCloseTimeoutInMs", "J", "executor", "Ljava/util/concurrent/Executor;", "", "refCount", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "lastDecrementRefCountTimeStamp", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "delegateDatabase", "Ld1/c;", "getDelegateDatabase$room_runtime_release", "setDelegateDatabase$room_runtime_release", "(Ld1/c;)V", "", "manuallyClosed", "Z", "executeAutoCloser", "autoCloser", "isActive", "()Z", "getRefCountForTest$room_runtime_release", "refCountForTest", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AutoCloser {
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;
    private final Runnable autoCloser;
    private d1.c delegateDatabase;
    public d1.d delegateOpenHelper;
    private final Runnable executeAutoCloser;
    private final Executor executor;
    private boolean manuallyClosed;
    private Runnable onAutoCloseCallback;
    private int refCount;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Object lock = new Object();
    private long lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();

    public AutoCloser(long j10, TimeUnit timeUnit, Executor executor) {
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j10);
        this.executor = executor;
        final int i = 0;
        this.executeAutoCloser = new Runnable(this) { // from class: androidx.room.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCloser f7832b;

            {
                this.f7832b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        AutoCloser.executeAutoCloser$lambda$0(this.f7832b);
                        break;
                    default:
                        AutoCloser.autoCloser$lambda$3(this.f7832b);
                        break;
                }
            }
        };
        final int i9 = 1;
        this.autoCloser = new Runnable(this) { // from class: androidx.room.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCloser f7832b;

            {
                this.f7832b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        AutoCloser.executeAutoCloser$lambda$0(this.f7832b);
                        break;
                    default:
                        AutoCloser.autoCloser$lambda$3(this.f7832b);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(AutoCloser autoCloser) {
        p pVar;
        synchronized (autoCloser.lock) {
            try {
                if (SystemClock.uptimeMillis() - autoCloser.lastDecrementRefCountTimeStamp < autoCloser.autoCloseTimeoutInMs) {
                    return;
                }
                if (autoCloser.refCount != 0) {
                    return;
                }
                Runnable runnable = autoCloser.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    pVar = p.f3034a;
                } else {
                    pVar = null;
                }
                if (pVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
                d1.c cVar = autoCloser.delegateDatabase;
                if (cVar != null && cVar.isOpen()) {
                    cVar.close();
                }
                autoCloser.delegateDatabase = null;
                p pVar2 = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(AutoCloser autoCloser) {
        autoCloser.executor.execute(autoCloser.autoCloser);
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                d1.c cVar = this.delegateDatabase;
                if (cVar != null) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.lock) {
            try {
                int i = this.refCount;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
                }
                int i9 = i - 1;
                this.refCount = i9;
                if (i9 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V executeRefCountingFunction(InterfaceC0646l<? super d1.c, ? extends V> block) {
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    /* renamed from: getDelegateDatabase$room_runtime_release, reason: from getter */
    public final d1.c getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final d1.d getDelegateOpenHelper() {
        d1.d dVar = this.delegateOpenHelper;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    /* renamed from: getLastDecrementRefCountTimeStamp$room_runtime_release, reason: from getter */
    public final long getLastDecrementRefCountTimeStamp() {
        return this.lastDecrementRefCountTimeStamp;
    }

    /* renamed from: getOnAutoCloseCallback$room_runtime_release, reason: from getter */
    public final Runnable getOnAutoCloseCallback() {
        return this.onAutoCloseCallback;
    }

    /* renamed from: getRefCount$room_runtime_release, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    public final int getRefCountForTest$room_runtime_release() {
        int i;
        synchronized (this.lock) {
            i = this.refCount;
        }
        return i;
    }

    public final d1.c incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!(!this.manuallyClosed)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            d1.c cVar = this.delegateDatabase;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            d1.c writableDatabase = getDelegateOpenHelper().getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void init(d1.d delegateOpenHelper) {
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(Runnable onAutoClose) {
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(d1.c cVar) {
        this.delegateDatabase = cVar;
    }

    public final void setDelegateOpenHelper(d1.d dVar) {
        this.delegateOpenHelper = dVar;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j10) {
        this.lastDecrementRefCountTimeStamp = j10;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i) {
        this.refCount = i;
    }
}
