package z1;

import android.content.Context;
import android.util.SparseArray;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import s3.InterfaceC1204a;
import v3.C1543a;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static g f31251e;

    /* renamed from: a, reason: collision with root package name */
    public Object f31252a = new androidx.collection.a();

    /* renamed from: b, reason: collision with root package name */
    public Object f31253b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public Object f31254c = new androidx.collection.d();

    /* renamed from: d, reason: collision with root package name */
    public Object f31255d = new androidx.collection.a();

    public static synchronized g a(Context context, D1.a aVar) {
        g gVar;
        synchronized (g.class) {
            try {
                if (f31251e == null) {
                    g gVar2 = new g();
                    Context applicationContext = context.getApplicationContext();
                    gVar2.f31252a = new a(applicationContext, aVar);
                    gVar2.f31253b = new b(applicationContext, aVar);
                    gVar2.f31254c = new e(applicationContext, aVar);
                    gVar2.f31255d = new f(applicationContext, aVar);
                    f31251e = gVar2;
                }
                gVar = f31251e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public w3.e b(String str) {
        if (!((ConcurrentHashMap) this.f31255d).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.f31255d).containsKey(str)) {
                        try {
                            Iterator it = ((v3.b) this.f31253b).a(((C1543a) ((InterfaceC1204a) this.f31252a)).a(str)).iterator();
                            while (it.hasNext()) {
                                ((w3.e) this.f31254c).a((Phonemetadata$PhoneMetadata) it.next());
                            }
                            ((ConcurrentHashMap) this.f31255d).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e10) {
                            throw new IllegalStateException("Failed to read file " + str, e10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (w3.e) this.f31254c;
    }
}
