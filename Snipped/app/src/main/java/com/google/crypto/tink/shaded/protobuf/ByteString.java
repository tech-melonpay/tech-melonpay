package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0661h;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f10084b = new LiteralByteString(C0673u.f10267b);

    /* renamed from: c, reason: collision with root package name */
    public static final c f10085c;

    /* renamed from: a, reason: collision with root package name */
    public int f10086a = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final int f10087e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10088f;

        public BoundedByteString(byte[] bArr, int i, int i9) {
            super(bArr);
            ByteString.b(i, i + i9, bArr.length);
            this.f10087e = i;
            this.f10088f = i9;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte a(int i) {
            int i9 = this.f10088f;
            if (((i9 - (i + 1)) | i) >= 0) {
                return this.f10089d[this.f10087e + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(com.google.android.gms.measurement.internal.a.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(C.v.k(i, i9, "Index > length: ", ", "));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final void e(int i, byte[] bArr) {
            System.arraycopy(this.f10089d, this.f10087e, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte f(int i) {
            return this.f10089d[this.f10087e + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        public final int o() {
            return this.f10087e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.f10088f;
        }

        public Object writeReplace() {
            return new LiteralByteString(l());
        }
    }

    public static abstract class LeafByteString extends ByteString {
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f10089d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f10089d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte a(int i) {
            return this.f10089d[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void e(int i, byte[] bArr) {
            System.arraycopy(this.f10089d, 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.f10086a;
            int i9 = literalByteString.f10086a;
            if (i != 0 && i9 != 0 && i != i9) {
                return false;
            }
            int size = size();
            if (size > literalByteString.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > literalByteString.size()) {
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Ran off end of other: 0, ", size, ", ");
                l10.append(literalByteString.size());
                throw new IllegalArgumentException(l10.toString());
            }
            int o10 = o() + size;
            int o11 = o();
            int o12 = literalByteString.o();
            while (o11 < o10) {
                if (this.f10089d[o11] != literalByteString.f10089d[o12]) {
                    return false;
                }
                o11++;
                o12++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte f(int i) {
            return this.f10089d[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean g() {
            int o10 = o();
            return Utf8.f10164a.c(o10, size() + o10, this.f10089d);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final AbstractC0661h.a h() {
            int o10 = o();
            int size = size();
            AbstractC0661h.a aVar = new AbstractC0661h.a(this.f10089d, o10, size, true);
            try {
                aVar.g(size);
                return aVar;
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int i(int i, int i9) {
            int o10 = o();
            Charset charset = C0673u.f10266a;
            for (int i10 = o10; i10 < o10 + i9; i10++) {
                i = (i * 31) + this.f10089d[i10];
            }
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString k(int i) {
            int b9 = ByteString.b(0, i, size());
            if (b9 == 0) {
                return ByteString.f10084b;
            }
            return new BoundedByteString(this.f10089d, o(), b9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String m(Charset charset) {
            return new String(this.f10089d, o(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void n(Ha.c cVar) {
            cVar.M(o(), size(), this.f10089d);
        }

        public int o() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.f10089d.length;
        }
    }

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C0660g c0660g = (C0660g) this;
            int i = c0660g.f10218a;
            if (i >= c0660g.f10219b) {
                throw new NoSuchElementException();
            }
            c0660g.f10218a = i + 1;
            return Byte.valueOf(c0660g.f10220c.f(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.c
        public final byte[] a(int i, int i9, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i9 + i);
        }
    }

    public interface c {
        byte[] a(int i, int i9, byte[] bArr);
    }

    public static final class d implements c {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.c
        public final byte[] a(int i, int i9, byte[] bArr) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i, bArr2, 0, i9);
            return bArr2;
        }
    }

    static {
        f10085c = C0657d.a() ? new d() : new b();
    }

    public static int b(int i, int i9, int i10) {
        int i11 = i9 - i;
        if ((i | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(s3.b.i("Beginning index: ", i, " < 0"));
        }
        if (i9 < i) {
            throw new IndexOutOfBoundsException(C.v.k(i, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(C.v.k(i9, i10, "End index: ", " >= "));
    }

    public static ByteString c(int i, int i9, byte[] bArr) {
        b(i, i + i9, bArr.length);
        return new LiteralByteString(f10085c.a(i, i9, bArr));
    }

    public abstract byte a(int i);

    public abstract void e(int i, byte[] bArr);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public abstract boolean g();

    public abstract AbstractC0661h.a h();

    public final int hashCode() {
        int i = this.f10086a;
        if (i == 0) {
            int size = size();
            i = i(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f10086a = i;
        }
        return i;
    }

    public abstract int i(int i, int i9);

    @Override // java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new C0660g(this);
    }

    public abstract ByteString k(int i);

    public final byte[] l() {
        int size = size();
        if (size == 0) {
            return C0673u.f10267b;
        }
        byte[] bArr = new byte[size];
        e(size, bArr);
        return bArr;
    }

    public abstract String m(Charset charset);

    public abstract void n(Ha.c cVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = c0.a(this);
        } else {
            str = c0.a(k(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return androidx.camera.core.impl.utils.a.n(sb2, str, "\">");
    }
}
