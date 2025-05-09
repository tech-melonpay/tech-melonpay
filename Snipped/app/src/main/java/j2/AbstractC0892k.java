package j2;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import j2.C0884c;

/* compiled from: TransportContext.java */
/* renamed from: j2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0892k {

    /* compiled from: TransportContext.java */
    /* renamed from: j2.k$a */
    public static abstract class a {
    }

    public static C0884c.a a() {
        C0884c.a aVar = new C0884c.a();
        aVar.c(Priority.f8901a);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public final String toString() {
        String b9 = b();
        Priority d10 = d();
        String encodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(b9);
        sb2.append(", ");
        sb2.append(d10);
        sb2.append(", ");
        return androidx.camera.core.impl.utils.a.n(sb2, encodeToString, ")");
    }
}
