package org.tensorflow.lite;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface Delegate extends Closeable {
    long getNativeHandle();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
