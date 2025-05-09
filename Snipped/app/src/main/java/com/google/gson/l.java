package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import n3.p;

/* compiled from: JsonElement.java */
/* loaded from: classes.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            r3.b bVar = new r3.b(stringWriter);
            bVar.f26173h = Strictness.f10313a;
            n3.p.f24174B.getClass();
            p.t.d(this, bVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
