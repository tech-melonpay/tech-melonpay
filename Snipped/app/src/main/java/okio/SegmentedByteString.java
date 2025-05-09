package okio;

import Ka.f;
import Ka.u;
import La.b;
import java.security.MessageDigest;
import kotlin.Metadata;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "okio"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SegmentedByteString extends ByteString {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f24700e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f24701f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f24696d.data);
        this.f24700e = bArr;
        this.f24701f = iArr;
    }

    private final Object writeReplace() {
        return new ByteString(m());
    }

    @Override // okio.ByteString
    public final String a() {
        throw null;
    }

    @Override // okio.ByteString
    public final ByteString c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f24700e;
        int length = bArr.length;
        int i = 0;
        int i9 = 0;
        while (i < length) {
            int[] iArr = this.f24701f;
            int i10 = iArr[length + i];
            int i11 = iArr[i];
            messageDigest.update(bArr[i], i10, i11 - i9);
            i++;
            i9 = i11;
        }
        return new ByteString(messageDigest.digest());
    }

    @Override // okio.ByteString
    public final int d() {
        return this.f24701f[this.f24700e.length - 1];
    }

    @Override // okio.ByteString
    public final String e() {
        return new ByteString(m()).e();
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.d() == d() && h(d(), byteString)) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    /* renamed from: f */
    public final byte[] getData() {
        return m();
    }

    @Override // okio.ByteString
    public final byte g(int i) {
        byte[][] bArr = this.f24700e;
        int length = bArr.length - 1;
        int[] iArr = this.f24701f;
        Ka.a.a(iArr[length], i, 1L);
        int b9 = b.b(this, i);
        return bArr[b9][(i - (b9 == 0 ? 0 : iArr[b9 - 1])) + iArr[bArr.length + b9]];
    }

    @Override // okio.ByteString
    public final boolean h(int i, ByteString byteString) {
        if (d() - i < 0) {
            return false;
        }
        int b9 = b.b(this, 0);
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            int[] iArr = this.f24701f;
            int i11 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i12 = iArr[b9] - i11;
            byte[][] bArr = this.f24700e;
            int i13 = iArr[bArr.length + b9];
            int min = Math.min(i, i12 + i11) - i9;
            if (!byteString.i(i10, bArr[b9], (i9 - i11) + i13, min)) {
                return false;
            }
            i10 += min;
            i9 += min;
            b9++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.f24698b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f24700e;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            int[] iArr = this.f24701f;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            byte[] bArr2 = bArr[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr2[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        this.f24698b = i10;
        return i10;
    }

    @Override // okio.ByteString
    public final boolean i(int i, byte[] bArr, int i9, int i10) {
        if (i >= 0 && i <= d() - i10 && i9 >= 0 && i9 <= bArr.length - i10) {
            int i11 = i10 + i;
            int b9 = b.b(this, i);
            while (i < i11) {
                int[] iArr = this.f24701f;
                int i12 = b9 == 0 ? 0 : iArr[b9 - 1];
                int i13 = iArr[b9] - i12;
                byte[][] bArr2 = this.f24700e;
                int i14 = iArr[bArr2.length + b9];
                int min = Math.min(i11, i13 + i12) - i;
                int i15 = (i - i12) + i14;
                byte[] bArr3 = bArr2[b9];
                f.a aVar = Ka.a.f2278a;
                for (int i16 = 0; i16 < min; i16++) {
                    if (bArr3[i16 + i15] == bArr[i16 + i9]) {
                    }
                }
                i9 += min;
                i += min;
                b9++;
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final ByteString j() {
        return new ByteString(m()).j();
    }

    @Override // okio.ByteString
    public final void l(f fVar, int i) {
        int b9 = b.b(this, 0);
        int i9 = 0;
        while (i9 < i) {
            int[] iArr = this.f24701f;
            int i10 = b9 == 0 ? 0 : iArr[b9 - 1];
            int i11 = iArr[b9] - i10;
            byte[][] bArr = this.f24700e;
            int i12 = iArr[bArr.length + b9];
            int min = Math.min(i, i11 + i10) - i9;
            int i13 = (i9 - i10) + i12;
            u uVar = new u(bArr[b9], i13, i13 + min, true, false);
            u uVar2 = fVar.f2293a;
            if (uVar2 == null) {
                uVar.f2341g = uVar;
                uVar.f2340f = uVar;
                fVar.f2293a = uVar;
            } else {
                uVar2.f2341g.b(uVar);
            }
            i9 += min;
            b9++;
        }
        fVar.f2294b += i;
    }

    public final byte[] m() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f24700e;
        int length = bArr2.length;
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (i < length) {
            int[] iArr = this.f24701f;
            int i11 = iArr[length + i];
            int i12 = iArr[i];
            int i13 = i12 - i9;
            System.arraycopy(bArr2[i], i11, bArr, i10, (i11 + i13) - i11);
            i10 += i13;
            i++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final String toString() {
        return new ByteString(m()).toString();
    }
}
