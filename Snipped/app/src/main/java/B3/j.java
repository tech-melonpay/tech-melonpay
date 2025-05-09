package b3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<i> f8299a = new CopyOnWriteArrayList<>();

    public static i a(String str) {
        Iterator<i> it = f8299a.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(s3.b.j("No KMS client does support: ", str));
    }
}
