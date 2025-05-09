package z3;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzaa;
import com.google.android.gms.internal.mlkit_common.zzz;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1643b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumMap f31275a;

    static {
        new EnumMap(BaseModel.class);
        f31275a = new EnumMap(BaseModel.class);
    }

    @KeepForSdk
    public static String a() {
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f31275a.get(null)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1643b)) {
            return false;
        }
        ((AbstractC1643b) obj).getClass();
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, null);
    }

    public final String toString() {
        zzz zzb = zzaa.zzb("RemoteModel");
        zzb.zza("modelName", null);
        zzb.zza("baseModel", null);
        zzb.zza("modelType", null);
        return zzb.toString();
    }
}
