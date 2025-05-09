package com.google.mlkit.vision.common.internal;

import F3.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzp.zzi(Component.builder(a.class).add(Dependency.setOf(a.C0112a.class)).factory(c.f1163a).build());
    }
}
