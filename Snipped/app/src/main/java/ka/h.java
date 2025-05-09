package Ka;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* compiled from: BufferedSink.kt */
/* loaded from: classes2.dex */
public interface h extends w, WritableByteChannel {
    h F(String str);

    h L(long j10);

    h X(byte[] bArr);

    h Z(ByteString byteString);

    long c0(y yVar);

    h e0(int i, int i9, byte[] bArr);

    @Override // Ka.w, java.io.Flushable
    void flush();

    f getBuffer();

    h j0(long j10);

    h k();

    h l(int i);

    h o(int i);

    h s(int i);

    h v();
}
