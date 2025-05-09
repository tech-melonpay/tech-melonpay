package b3;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PrimitiveSet.java */
/* loaded from: classes.dex */
public final class l<P> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8300a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public a<P> f8301b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<P> f8302c;

    /* compiled from: PrimitiveSet.java */
    public static final class a<P> {

        /* renamed from: a, reason: collision with root package name */
        public final P f8303a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f8304b;

        /* renamed from: c, reason: collision with root package name */
        public final KeyStatusType f8305c;

        /* renamed from: d, reason: collision with root package name */
        public final OutputPrefixType f8306d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType) {
            this.f8303a = obj;
            this.f8304b = Arrays.copyOf(bArr, bArr.length);
            this.f8305c = keyStatusType;
            this.f8306d = outputPrefixType;
        }

        public final byte[] a() {
            byte[] bArr = this.f8304b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* compiled from: PrimitiveSet.java */
    public static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f8307a;

        public b(byte[] bArr) {
            this.f8307a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            byte[] bArr = this.f8307a;
            int length = bArr.length;
            byte[] bArr2 = bVar2.f8307a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b9 = bArr[i];
                byte b10 = bVar2.f8307a[i];
                if (b9 != b10) {
                    return b9 - b10;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Arrays.equals(this.f8307a, ((b) obj).f8307a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8307a);
        }

        public final String toString() {
            return j3.e.n(this.f8307a);
        }
    }

    public l(Class<P> cls) {
        this.f8302c = cls;
    }

    public final List<a<P>> a(byte[] bArr) {
        List<a<P>> list = (List) this.f8300a.get(new b(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
