package com.google.android.gms.internal.gtm;

import androidx.camera.core.impl.utils.a;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzyc extends IllegalArgumentException {
    public zzyc(int i, int i9) {
        super(a.f(54, "Unpaired surrogate at index ", i, " of ", i9));
    }
}
