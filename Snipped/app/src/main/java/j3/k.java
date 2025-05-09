package j3;

import com.google.android.gms.security.ProviderInstaller;
import j3.l;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineFactory.java */
/* loaded from: classes.dex */
public final class k<T_WRAPPER extends l<T_ENGINE>, T_ENGINE> {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f22492c = Logger.getLogger(k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f22493d;

    /* renamed from: e, reason: collision with root package name */
    public static final k<l.a, Cipher> f22494e;

    /* renamed from: f, reason: collision with root package name */
    public static final k<l.b, Mac> f22495f;

    /* renamed from: a, reason: collision with root package name */
    public final T_WRAPPER f22496a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Provider> f22497b = f22493d;

    static {
        if (e.t()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f22492c.info(androidx.camera.core.n.a("Provider ", str, " not available"));
                }
            }
            f22493d = arrayList;
        } else {
            f22493d = new ArrayList();
        }
        f22494e = new k<>(new l.a());
        f22495f = new k<>(new l.b());
    }

    public k(T_WRAPPER t_wrapper) {
        this.f22496a = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        Iterator<Provider> it = this.f22497b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            T_WRAPPER t_wrapper = this.f22496a;
            if (!hasNext) {
                return (T_ENGINE) t_wrapper.a(str, null);
            }
            try {
                return (T_ENGINE) t_wrapper.a(str, it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
    }
}
