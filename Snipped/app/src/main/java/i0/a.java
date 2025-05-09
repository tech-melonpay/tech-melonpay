package I0;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
public final class a {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
