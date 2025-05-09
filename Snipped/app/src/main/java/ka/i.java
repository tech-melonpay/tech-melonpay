package Ka;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: BufferedSource.kt */
/* loaded from: classes2.dex */
public interface i extends y, ReadableByteChannel {
    String I(Charset charset);

    void J(f fVar, long j10);

    boolean O(long j10);

    String R();

    int S(q qVar);

    f getBuffer();

    ByteString h(long j10);

    void h0(long j10);

    long l0();

    InputStream m0();

    long n(f fVar);

    t peek();

    byte[] q();

    boolean r();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    String x(long j10);
}
