package io.sentry;

import java.io.Writer;

/* compiled from: JsonObjectWriter.java */
/* loaded from: classes2.dex */
public final class E extends M9.a {
    public final C.N i;

    public E(Writer writer, int i) {
        super(writer);
        this.i = new C.N(i);
    }

    public final void P(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f2735f != null) {
            throw new IllegalStateException();
        }
        if (this.f2732c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f2735f = str;
    }

    public final void Q(InterfaceC0859q interfaceC0859q, Object obj) {
        this.i.o(this, interfaceC0859q, obj);
    }
}
