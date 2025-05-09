package A3;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class e<K, V> {
    private final Map zza = new HashMap();

    @KeepForSdk
    public abstract V create(K k3);

    @KeepForSdk
    public V get(K k3) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k3)) {
                    return (V) this.zza.get(k3);
                }
                V create = create(k3);
                this.zza.put(k3, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
