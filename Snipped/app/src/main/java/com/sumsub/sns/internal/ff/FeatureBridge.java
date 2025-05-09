package com.sumsub.sns.internal.ff;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sumsub/sns/internal/ff/FeatureBridge;", "", "<init>", "()V", "", "Lcom/sumsub/sns/internal/ff/core/a;", "Landroid/os/Bundle;", "serialize", "(Ljava/util/Collection;)Landroid/os/Bundle;", "getLocalFeatures", "()Landroid/os/Bundle;", "getRemoteFeatures", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isEnabled", "value", "LO9/p;", "overrideFeature", "(Ljava/lang/String;ZLjava/lang/String;)V", "clearOverride", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FeatureBridge {
    public static final FeatureBridge INSTANCE = new FeatureBridge();

    private FeatureBridge() {
    }

    private final Bundle serialize(Collection<com.sumsub.sns.internal.ff.core.a> collection) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (com.sumsub.sns.internal.ff.core.a aVar : collection) {
            Bundle bundle = new Bundle();
            bundle.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, aVar.e());
            bundle.putBoolean("local_only", aVar.d());
            bundle.putCharSequence("human_readable_description", aVar.c());
            bundle.putBoolean("default_enabled", aVar.b().d());
            if (aVar.b().c() != null) {
                bundle.putCharSequence("default_value", aVar.b().c());
            }
            arrayList.add(bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("features", arrayList);
        return bundle2;
    }

    public final void clearOverride(String name) {
        a.f16930a.a(name);
    }

    public final Bundle getLocalFeatures() {
        return serialize(a.f16930a.q().a());
    }

    public final Bundle getRemoteFeatures() {
        return serialize(a.f16930a.q().b());
    }

    public final void overrideFeature(String name, boolean isEnabled, String value) {
        a.f16930a.a(name, isEnabled, value);
    }
}
