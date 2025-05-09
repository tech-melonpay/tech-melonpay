package com.google.mlkit.vision.barcode.internal;

import A3.g;
import E3.b;
import E3.c;
import E3.d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcd;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzcd.zzh(Component.builder(d.class).add(Dependency.required(g.class)).factory(b.f1045b).build(), Component.builder(c.class).add(Dependency.required(d.class)).add(Dependency.required(A3.d.class)).factory(b.f1046c).build());
    }
}
