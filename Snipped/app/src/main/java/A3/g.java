package A3;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.ComponentRuntime;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f64b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static g f65c;

    /* renamed from: a, reason: collision with root package name */
    public ComponentRuntime f66a;

    @KeepForSdk
    public static g c() {
        g gVar;
        synchronized (f64b) {
            Preconditions.checkState(f65c != null, "MlKitContext has not been initialized");
            gVar = (g) Preconditions.checkNotNull(f65c);
        }
        return gVar;
    }

    @KeepForSdk
    public final <T> T a(Class<T> cls) {
        Preconditions.checkState(f65c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f66a);
        return (T) this.f66a.get(cls);
    }

    @KeepForSdk
    public final Context b() {
        return (Context) a(Context.class);
    }
}
