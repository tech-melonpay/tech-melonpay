package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "Lla/c;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m155WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j10, long j11) {
        return new StartedWhileSubscribed(la.c.e(j10), la.c.e(j11));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static SharingStarted m156WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j10, long j11, int i, Object obj) {
        if ((i & 1) != 0) {
            la.c.f23587b.getClass();
            j10 = 0;
        }
        if ((i & 2) != 0) {
            la.c.f23587b.getClass();
            j11 = la.c.f23588c;
        }
        return m155WhileSubscribed5qebJ5I(companion, j10, j11);
    }
}
