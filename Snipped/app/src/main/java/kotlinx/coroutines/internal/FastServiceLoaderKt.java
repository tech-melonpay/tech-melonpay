package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;

/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object failure;
        try {
            failure = Class.forName("android.os.Build");
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z10 = failure instanceof Result.Failure;
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
