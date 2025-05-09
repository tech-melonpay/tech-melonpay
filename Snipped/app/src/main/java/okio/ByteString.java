package okio;

import Ka.f;
import La.b;
import P9.i;
import com.google.firebase.messaging.Constants;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import ka.C0956a;
import kotlin.Metadata;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.PassportService;

/* compiled from: ByteString.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "LO9/p;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "a", "[B", "getData$okio", "()[B", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "okio"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: d, reason: collision with root package name */
    public static final ByteString f24696d = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] data;

    /* renamed from: b, reason: collision with root package name */
    public transient int f24698b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f24699c;

    /* compiled from: ByteString.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
        
            r11 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okio.ByteString a(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.a.a(java.lang.String):okio.ByteString");
        }

        public static ByteString b(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i9 = i * 2;
                bArr[i] = (byte) (b.a(str.charAt(i9 + 1)) + (b.a(str.charAt(i9)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString c(String str) {
            ByteString byteString = new ByteString(str.getBytes(C0956a.f23054b));
            byteString.f24699c = str;
            return byteString;
        }

        public static ByteString d(byte[] bArr) {
            f.a aVar = Ka.a.f2278a;
            int length = bArr.length;
            Ka.a.a(bArr.length, 0, length);
            i.i(length, bArr.length);
            return new ByteString(Arrays.copyOfRange(bArr, 0, length));
        }
    }

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    private final void readObject(ObjectInputStream in) {
        int readInt = in.readInt();
        if (readInt < 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(readInt, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = in.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream out) {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    public String a() {
        byte[] bArr = this.data;
        byte[] bArr2 = okio.a.f24702a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i9 = 0;
        while (i < length) {
            byte b9 = bArr[i];
            int i10 = i + 2;
            byte b10 = bArr[i + 1];
            i += 3;
            byte b11 = bArr[i10];
            bArr3[i9] = bArr2[(b9 & 255) >> 2];
            bArr3[i9 + 1] = bArr2[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr3[i9 + 2] = bArr2[((b10 & PassportService.SFI_DG15) << 2) | ((b11 & 255) >> 6)];
            i9 += 4;
            bArr3[i11] = bArr2[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i];
            bArr3[i9] = bArr2[(b12 & 255) >> 2];
            bArr3[i9 + 1] = bArr2[(b12 & 3) << 4];
            bArr3[i9 + 2] = 61;
            bArr3[i9 + 3] = 61;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b13 = bArr[i];
            byte b14 = bArr[i12];
            bArr3[i9] = bArr2[(b13 & 255) >> 2];
            bArr3[i9 + 1] = bArr2[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr3[i9 + 2] = bArr2[(b14 & PassportService.SFI_DG15) << 2];
            bArr3[i9 + 3] = 61;
        }
        return new String(bArr3, C0956a.f23054b);
    }

    public ByteString c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, d());
        return new ByteString(messageDigest.digest());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            okio.ByteString r10 = (okio.ByteString) r10
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L2b
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = r6
            goto L31
        L29:
            r3 = r5
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    public int d() {
        return this.data.length;
    }

    public String e() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b9 : bArr) {
            int i9 = i + 1;
            char[] cArr2 = b.f2501a;
            cArr[i] = cArr2[(b9 >> 4) & 15];
            i += 2;
            cArr[i9] = cArr2[b9 & PassportService.SFI_DG15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int d10 = byteString.d();
            byte[] bArr = this.data;
            if (d10 == bArr.length && byteString.i(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte g(int i) {
        return this.data[i];
    }

    public boolean h(int i, ByteString byteString) {
        return byteString.i(0, this.data, 0, i);
    }

    public int hashCode() {
        int i = this.f24698b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.f24698b = hashCode;
        return hashCode;
    }

    public boolean i(int i, byte[] bArr, int i9, int i10) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i10 && i9 >= 0 && i9 <= bArr.length - i10) {
                f.a aVar = Ka.a.f2278a;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (bArr2[i11 + i] == bArr[i11 + i9]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public ByteString j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i];
            if (b9 >= 65 && b9 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b9 + ISO7816.INS_VERIFY);
                for (int i9 = i + 1; i9 < copyOf.length; i9++) {
                    byte b10 = copyOf[i9];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i9] = (byte) (b10 + ISO7816.INS_VERIFY);
                    }
                }
                return new ByteString(copyOf);
            }
            i++;
        }
    }

    public final String k() {
        String str = this.f24699c;
        if (str != null) {
            return str;
        }
        String str2 = new String(getData(), C0956a.f23054b);
        this.f24699c = str2;
        return str2;
    }

    public void l(f fVar, int i) {
        fVar.V(this.data, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x016e, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0175, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0167, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01aa, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ad, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b0, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x013a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b3, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x008a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00b9, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0079, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012a, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012e, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00cc, code lost:
    
        if (r8 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }
}
