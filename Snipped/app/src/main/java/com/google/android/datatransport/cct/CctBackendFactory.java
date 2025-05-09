package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import h2.b;
import k2.c;
import k2.f;
import k2.j;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements c {
    @Override // k2.c
    public j create(f fVar) {
        return new b(fVar.a(), fVar.d(), fVar.c());
    }
}
