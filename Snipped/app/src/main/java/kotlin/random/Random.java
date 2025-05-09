package kotlin.random;

import X9.b;
import Z9.a;
import fa.AbstractC0754a;
import fa.C0755b;
import ga.C0773a;
import java.io.Serializable;

/* compiled from: Random.kt */
/* loaded from: classes2.dex */
public abstract class Random {

    /* renamed from: a, reason: collision with root package name */
    public static final Default f23193a = new Default(0);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0754a f23194b;

    /* compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* compiled from: Random.kt */
        public static final class Serialized implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public static final Serialized f23195a = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f23193a;
            }
        }

        public /* synthetic */ Default(int i) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f23195a;
        }

        @Override // kotlin.random.Random
        public final int a(int i) {
            return Random.f23194b.a(i);
        }

        @Override // kotlin.random.Random
        public final int b() {
            return Random.f23194b.b();
        }

        @Override // kotlin.random.Random
        public final int c(int i, int i9) {
            return Random.f23194b.c(i, i9);
        }

        private Default() {
        }
    }

    static {
        b.f4063a.getClass();
        Integer num = a.C0054a.f4244a;
        f23194b = (num == null || num.intValue() >= 34) ? new C0773a() : new C0755b();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i9) {
        int b9;
        int i10;
        int i11;
        if (i9 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i9) + ").").toString());
        }
        int i12 = i9 - i;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                i11 = a(31 - Integer.numberOfLeadingZeros(i12));
            } else {
                do {
                    b9 = b() >>> 1;
                    i10 = b9 % i12;
                } while ((i12 - 1) + (b9 - i10) < 0);
                i11 = i10;
            }
            return i + i11;
        }
        while (true) {
            int b10 = b();
            if (i <= b10 && b10 < i9) {
                return b10;
            }
        }
    }
}
