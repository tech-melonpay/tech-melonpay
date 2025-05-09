package va;

import okhttp3.p;

/* compiled from: Interceptor.kt */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: Interceptor.kt */
    public interface a {
        p a(okhttp3.k kVar);

        okhttp3.internal.connection.a b();

        okhttp3.k request();
    }

    p intercept(a aVar);
}
