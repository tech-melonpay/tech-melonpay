package com.google.crypto.tink.shaded.protobuf;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
public abstract class d0<T, B> {
    public abstract void a(int i, int i9, Object obj);

    public abstract void b(long j10, int i, Object obj);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b9, int i, ByteString byteString);

    public abstract void e(long j10, int i, Object obj);

    public abstract e0 f(Object obj);

    public abstract e0 g(Object obj);

    public abstract int h(T t3);

    public abstract int i(T t3);

    public abstract void j(Object obj);

    public abstract e0 k(Object obj, Object obj2);

    public final boolean l(B b9, W w2) {
        int tag = w2.getTag();
        int i = tag >>> 3;
        int i9 = tag & 7;
        if (i9 == 0) {
            e(w2.K(), i, b9);
            return true;
        }
        if (i9 == 1) {
            b(w2.c(), i, b9);
            return true;
        }
        if (i9 == 2) {
            d(b9, i, w2.C());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            a(i, w2.h(), b9);
            return true;
        }
        e0 m2 = m();
        int i10 = (i << 3) | 4;
        while (w2.z() != Integer.MAX_VALUE && l(m2, w2)) {
        }
        if (i10 != w2.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(i, b9, p(m2));
        return true;
    }

    public abstract e0 m();

    public abstract void n(Object obj, B b9);

    public abstract void o(Object obj, T t3);

    public abstract e0 p(Object obj);

    public abstract void q(Object obj, C0663j c0663j);

    public abstract void r(Object obj, C0663j c0663j);
}
