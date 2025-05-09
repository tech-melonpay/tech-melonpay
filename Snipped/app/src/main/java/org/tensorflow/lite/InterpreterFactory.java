package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;

@Deprecated
/* loaded from: classes3.dex */
public class InterpreterFactory {
    public InterpreterApi create(File file, InterpreterApi.Options options) {
        return InterpreterApi.create(file, options);
    }

    public InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return InterpreterApi.create(byteBuffer, options);
    }
}
