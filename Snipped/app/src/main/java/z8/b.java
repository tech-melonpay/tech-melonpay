package Z8;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: Attributes.java */
/* loaded from: classes2.dex */
public final class b implements Iterable<Z8.a>, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4237d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public int f4238a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String[] f4239b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f4240c;

    /* compiled from: Attributes.java */
    public class a implements Iterator<Z8.a> {

        /* renamed from: a, reason: collision with root package name */
        public int f4241a = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4241a < b.this.f4238a;
        }

        @Override // java.util.Iterator
        public final Z8.a next() {
            b bVar = b.this;
            String[] strArr = bVar.f4240c;
            int i = this.f4241a;
            String str = strArr[i];
            String str2 = bVar.f4239b[i];
            if (str == null) {
                str = "";
            }
            Z8.a aVar = new Z8.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.f4234a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.f4235b = str;
            aVar.f4236c = bVar;
            this.f4241a++;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.f4241a;
            int i9 = i - 1;
            this.f4241a = i9;
            b bVar = b.this;
            int i10 = bVar.f4238a;
            if (i9 >= i10) {
                throw new IllegalArgumentException("Must be false");
            }
            int i11 = (i10 - i9) - 1;
            if (i11 > 0) {
                String[] strArr = bVar.f4239b;
                System.arraycopy(strArr, i, strArr, i9, i11);
                String[] strArr2 = bVar.f4240c;
                System.arraycopy(strArr2, i, strArr2, i9, i11);
            }
            int i12 = bVar.f4238a - 1;
            bVar.f4238a = i12;
            bVar.f4239b[i12] = null;
            bVar.f4240c[i12] = null;
        }
    }

    public b() {
        String[] strArr = f4237d;
        this.f4239b = strArr;
        this.f4240c = strArr;
    }

    public final int a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.f4238a; i++) {
            if (str.equals(this.f4239b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f4238a = this.f4238a;
            String[] strArr = this.f4239b;
            int i = this.f4238a;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f4239b = strArr2;
            String[] strArr3 = this.f4240c;
            int i9 = this.f4238a;
            String[] strArr4 = new String[i9];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i9));
            this.f4240c = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4238a == bVar.f4238a && Arrays.equals(this.f4239b, bVar.f4239b)) {
            return Arrays.equals(this.f4240c, bVar.f4240c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f4238a * 31) + Arrays.hashCode(this.f4239b)) * 31) + Arrays.hashCode(this.f4240c);
    }

    @Override // java.lang.Iterable
    public final Iterator<Z8.a> iterator() {
        return new a();
    }
}
