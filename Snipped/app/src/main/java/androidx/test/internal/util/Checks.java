package androidx.test.internal.util;

import android.os.StrictMode;
import androidx.camera.core.n;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class Checks {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadChecker f7951a;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(ThreadChecker.class).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (arrayList.isEmpty()) {
            new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else {
            if (arrayList.size() != 1) {
                throw new IllegalStateException(n.a("Found more than one ", ThreadChecker.class.getName(), " implementations."));
            }
            f7951a = (ThreadChecker) arrayList.get(0);
        }
    }
}
