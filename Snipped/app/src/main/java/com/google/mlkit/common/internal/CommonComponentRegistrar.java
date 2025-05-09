package com.google.mlkit.common.internal;

import A3.b;
import A3.d;
import A3.g;
import A3.h;
import A3.j;
import B3.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.List;
import x3.C1588a;
import y3.C1612a;
import z3.c;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzar.zzi(j.f69b, Component.builder(a.class).add(Dependency.required(g.class)).factory(C1588a.f30930b).build(), Component.builder(h.class).factory(C1588a.f30931c).build(), Component.builder(c.class).add(Dependency.setOf(c.a.class)).factory(C1588a.f30932d).build(), Component.builder(d.class).add(Dependency.requiredProvider(h.class)).factory(C1588a.f30933e).build(), Component.builder(A3.a.class).factory(C1588a.f30934f).build(), Component.builder(b.class).add(Dependency.required(A3.a.class)).factory(C1588a.f30935g).build(), Component.builder(C1612a.class).add(Dependency.required(g.class)).factory(C1588a.f30936h).build(), Component.intoSetBuilder(c.a.class).add(Dependency.requiredProvider(C1612a.class)).factory(C1588a.i).build());
    }
}
