package A3;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.UUID;
import z3.AbstractC1643b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    @KeepForSdk
    public static final Component<?> f69b = Component.builder(j.class).add(Dependency.required(g.class)).add(Dependency.required(Context.class)).factory(p.f80a).build();

    /* renamed from: a, reason: collision with root package name */
    public final Context f70a;

    public j(Context context) {
        this.f70a = context;
    }

    @KeepForSdk
    public final synchronized String a() {
        String string = c().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        c().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    @KeepForSdk
    public final synchronized long b(AbstractC1643b abstractC1643b) {
        SharedPreferences c2;
        c2 = c();
        abstractC1643b.getClass();
        return c2.getLong("downloading_begin_time_" + AbstractC1643b.a(), 0L);
    }

    public final SharedPreferences c() {
        Context context = this.f70a;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            return context.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
        if (storageEncryptionStatus != 3 && storageEncryptionStatus != 5) {
            return context.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.google.mlkit.internal");
        return createDeviceProtectedStorageContext.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
