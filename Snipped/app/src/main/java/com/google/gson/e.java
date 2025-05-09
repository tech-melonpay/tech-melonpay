package com.google.gson;

import com.google.gson.stream.JsonToken;
import r3.C1149a;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class e extends r<Number> {
    @Override // com.google.gson.r
    public final Number a(C1149a c1149a) {
        if (c1149a.k0() != JsonToken.i) {
            return Long.valueOf(c1149a.T());
        }
        c1149a.Y();
        return null;
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.E();
        } else {
            bVar.W(number2.toString());
        }
    }
}
