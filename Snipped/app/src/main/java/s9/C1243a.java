package s9;

import io.reactivex.internal.util.ExceptionHelper;
import j9.h;
import java.util.concurrent.Callable;

/* compiled from: RxJavaPlugins.java */
/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1243a {
    public static h a(Callable<h> callable) {
        try {
            h call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }
}
