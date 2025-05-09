package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;

/* compiled from: ISerializer.java */
/* renamed from: io.sentry.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0862u {
    <T> T a(Reader reader, Class<T> cls);

    B1.f b(BufferedInputStream bufferedInputStream);

    String e(Map<String, Object> map);

    void k(B1.f fVar, OutputStream outputStream);

    void m(Object obj, BufferedWriter bufferedWriter);
}
