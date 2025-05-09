package va;

import okhttp3.p;

/* compiled from: Call.kt */
/* loaded from: classes2.dex */
public interface b extends Cloneable {

    /* compiled from: Call.kt */
    public interface a {
        za.e a(okhttp3.k kVar);
    }

    void cancel();

    p execute();

    boolean isCanceled();

    okhttp3.k request();

    void y(c cVar);
}
