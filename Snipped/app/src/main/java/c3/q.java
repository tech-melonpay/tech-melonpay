package c3;

import b3.InterfaceC0586a;
import b3.f;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import i3.x;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: KmsEnvelopeAead.java */
/* loaded from: classes.dex */
public final class q implements InterfaceC0586a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f8519c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final x f8520a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0586a f8521b;

    public q(x xVar, InterfaceC0586a interfaceC0586a) {
        this.f8520a = xVar;
        this.f8521b = interfaceC0586a;
    }

    @Override // b3.InterfaceC0586a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        I i;
        x xVar = this.f8520a;
        Logger logger = b3.p.f8309a;
        synchronized (b3.p.class) {
            try {
                b3.d b9 = b3.p.b(xVar.y()).b();
                if (!((Boolean) b3.p.f8312d.get(xVar.y())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + xVar.y());
                }
                ByteString z10 = xVar.z();
                try {
                    f.a c2 = b9.f8289a.c();
                    I b10 = c2.b(z10);
                    c2.c(b10);
                    i = (I) c2.a(b10);
                } catch (InvalidProtocolBufferException e10) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(b9.f8289a.c().f8295a.getName()), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] byteArray = i.toByteArray();
        byte[] a10 = this.f8521b.a(byteArray, f8519c);
        byte[] a11 = ((InterfaceC0586a) b3.p.c(this.f8520a.y(), byteArray)).a(bArr, bArr2);
        return ByteBuffer.allocate(a10.length + 4 + a11.length).putInt(a10.length).put(a10).put(a11).array();
    }

    @Override // b3.InterfaceC0586a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((InterfaceC0586a) b3.p.c(this.f8520a.y(), this.f8521b.decrypt(bArr3, f8519c))).decrypt(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
