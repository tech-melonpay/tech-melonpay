package z3;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31276a = new HashMap();

    /* compiled from: com.google.mlkit:common@@18.7.0 */
    @KeepForSdk
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f31277a = C1642a.class;

        /* renamed from: b, reason: collision with root package name */
        public final Provider f31278b;

        @KeepForSdk
        public a(Provider provider) {
            this.f31278b = provider;
        }
    }

    @KeepForSdk
    public c(Set<a> set) {
        for (a aVar : set) {
            this.f31276a.put(aVar.f31277a, aVar.f31278b);
        }
    }
}
