package J;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: EncodedData.java */
/* loaded from: classes.dex */
public interface h extends AutoCloseable {
    long U();

    ByteBuffer c();

    long size();

    MediaCodec.BufferInfo w();
}
