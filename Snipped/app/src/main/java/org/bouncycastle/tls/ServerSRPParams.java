package org.bouncycastle.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ServerSRPParams {

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f25480B;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f25481N;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f25482g;

    /* renamed from: s, reason: collision with root package name */
    protected byte[] f25483s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f25481N = bigInteger;
        this.f25482g = bigInteger2;
        this.f25483s = Arrays.clone(bArr);
        this.f25480B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream, 1), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) {
        TlsSRPUtils.writeSRPParameter(this.f25481N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f25482g, outputStream);
        TlsUtils.writeOpaque8(this.f25483s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f25480B, outputStream);
    }

    public BigInteger getB() {
        return this.f25480B;
    }

    public BigInteger getG() {
        return this.f25482g;
    }

    public BigInteger getN() {
        return this.f25481N;
    }

    public byte[] getS() {
        return this.f25483s;
    }
}
