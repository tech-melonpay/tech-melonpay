package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Encodable;

/* loaded from: classes3.dex */
public class Composer {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private Composer() {
    }

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z10) {
        this.bos.write(z10 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public Composer bytes(Encodable encodable) {
        try {
            this.bos.write(encodable.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer pad(int i, int i9) {
        while (i9 >= 0) {
            try {
                this.bos.write(i);
                i9--;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return this;
    }

    public Composer padUntil(int i, int i9) {
        while (this.bos.size() < i9) {
            this.bos.write(i);
        }
        return this;
    }

    public Composer u16str(int i) {
        int i9 = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.bos.write((byte) (i9 >>> 8));
        this.bos.write((byte) i9);
        return this;
    }

    public Composer u32str(int i) {
        this.bos.write((byte) (i >>> 24));
        this.bos.write((byte) (i >>> 16));
        this.bos.write((byte) (i >>> 8));
        this.bos.write((byte) i);
        return this;
    }

    public Composer u64str(long j10) {
        u32str((int) (j10 >>> 32));
        u32str((int) j10);
        return this;
    }

    public Composer bytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[] bArr, int i, int i9) {
        try {
            this.bos.write(bArr, i, i9);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(Encodable[] encodableArr) {
        try {
            for (Encodable encodable : encodableArr) {
                this.bos.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[][] bArr, int i, int i9) {
        while (i != i9) {
            try {
                this.bos.write(bArr[i]);
                i++;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return this;
    }
}
