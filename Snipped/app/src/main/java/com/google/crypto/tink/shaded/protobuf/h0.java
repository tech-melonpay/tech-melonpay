package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f10233a = Logger.getLogger(h0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f10234b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f10235c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f10236d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f10237e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f10238f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f10239g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f10240h;

    /* compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class b extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final boolean c(long j10, Object obj) {
            return h0.f10240h ? h0.g(j10, obj) != 0 : h0.h(j10, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final byte d(long j10, Object obj) {
            return h0.f10240h ? h0.g(j10, obj) : h0.h(j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final double e(long j10, Object obj) {
            return Double.longBitsToDouble(h(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final float f(long j10, Object obj) {
            return Float.intBitsToFloat(g(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void k(Object obj, long j10, boolean z10) {
            if (h0.f10240h) {
                h0.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                h0.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void l(Object obj, long j10, byte b9) {
            if (h0.f10240h) {
                h0.o(obj, j10, b9);
            } else {
                h0.p(obj, j10, b9);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void n(Object obj, long j10, float f10) {
            o(j10, Float.floatToIntBits(f10), obj);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final boolean c(long j10, Object obj) {
            return h0.f10240h ? h0.g(j10, obj) != 0 : h0.h(j10, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final byte d(long j10, Object obj) {
            return h0.f10240h ? h0.g(j10, obj) : h0.h(j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final double e(long j10, Object obj) {
            return Double.longBitsToDouble(h(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final float f(long j10, Object obj) {
            return Float.intBitsToFloat(g(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void k(Object obj, long j10, boolean z10) {
            if (h0.f10240h) {
                h0.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                h0.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void l(Object obj, long j10, byte b9) {
            if (h0.f10240h) {
                h0.o(obj, j10, b9);
            } else {
                h0.p(obj, j10, b9);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void n(Object obj, long j10, float f10) {
            o(j10, Float.floatToIntBits(f10), obj);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final boolean c(long j10, Object obj) {
            return this.f10241a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final byte d(long j10, Object obj) {
            return this.f10241a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final double e(long j10, Object obj) {
            return this.f10241a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final float f(long j10, Object obj) {
            return this.f10241a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void k(Object obj, long j10, boolean z10) {
            this.f10241a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void l(Object obj, long j10, byte b9) {
            this.f10241a.putByte(obj, j10, b9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void m(Object obj, long j10, double d10) {
            this.f10241a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h0.e
        public final void n(Object obj, long j10, float f10) {
            this.f10241a.putFloat(obj, j10, f10);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f10241a;

        public e(Unsafe unsafe) {
            this.f10241a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f10241a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f10241a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j10, Object obj);

        public abstract byte d(long j10, Object obj);

        public abstract double e(long j10, Object obj);

        public abstract float f(long j10, Object obj);

        public final int g(long j10, Object obj) {
            return this.f10241a.getInt(obj, j10);
        }

        public final long h(long j10, Object obj) {
            return this.f10241a.getLong(obj, j10);
        }

        public final Object i(long j10, Object obj) {
            return this.f10241a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f10241a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b9);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(long j10, int i, Object obj) {
            this.f10241a.putInt(obj, j10, i);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f10241a.putLong(obj, j10, j11);
        }

        public final void q(long j10, Object obj, Object obj2) {
            this.f10241a.putObject(obj, j10, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.h0.<clinit>():void");
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) f10234b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class<?> cls) {
        if (f10238f) {
            return f10236d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f10238f) {
            f10236d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (C0657d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class<?> cls) {
        if (!C0657d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f10235c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(byte[] bArr, long j10) {
        return f10236d.d(f10239g + j10, bArr);
    }

    public static byte g(long j10, Object obj) {
        return (byte) ((f10236d.g((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((f10236d.g((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int i(long j10, Object obj) {
        return f10236d.g(j10, obj);
    }

    public static long j(long j10, Object obj) {
        return f10236d.h(j10, obj);
    }

    public static Object k(long j10, Object obj) {
        return f10236d.i(j10, obj);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z10) {
        f10236d.k(obj, j10, z10);
    }

    public static void n(byte[] bArr, long j10, byte b9) {
        f10236d.l(bArr, f10239g + j10, b9);
    }

    public static void o(Object obj, long j10, byte b9) {
        long j11 = (-4) & j10;
        int g10 = f10236d.g(j11, obj);
        int i = ((~((int) j10)) & 3) << 3;
        s(j11, ((255 & b9) << i) | (g10 & (~(255 << i))), obj);
    }

    public static void p(Object obj, long j10, byte b9) {
        long j11 = (-4) & j10;
        int i = (((int) j10) & 3) << 3;
        s(j11, ((255 & b9) << i) | (f10236d.g(j11, obj) & (~(255 << i))), obj);
    }

    public static void q(Object obj, long j10, double d10) {
        f10236d.m(obj, j10, d10);
    }

    public static void r(Object obj, long j10, float f10) {
        f10236d.n(obj, j10, f10);
    }

    public static void s(long j10, int i, Object obj) {
        f10236d.o(j10, i, obj);
    }

    public static void t(Object obj, long j10, long j11) {
        f10236d.p(obj, j10, j11);
    }

    public static void u(long j10, Object obj, Object obj2) {
        f10236d.q(j10, obj, obj2);
    }
}
