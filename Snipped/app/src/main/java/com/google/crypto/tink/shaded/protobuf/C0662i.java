package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662i implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0661h f10242a;

    /* renamed from: b, reason: collision with root package name */
    public int f10243b;

    /* renamed from: c, reason: collision with root package name */
    public int f10244c;

    /* renamed from: d, reason: collision with root package name */
    public int f10245d = 0;

    public C0662i(AbstractC0661h abstractC0661h) {
        C0673u.a(abstractC0661h, "input");
        this.f10242a = abstractC0661h;
        abstractC0661h.f10226c = this;
    }

    public static void S(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void T(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void A(List<String> list) {
        P(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void B(List<String> list) {
        P(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final ByteString C() {
        R(2);
        return this.f10242a.i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void D(List<Float> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof r;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 2) {
                int x9 = abstractC0661h.x();
                S(x9);
                int d10 = abstractC0661h.d() + x9;
                do {
                    list.add(Float.valueOf(abstractC0661h.n()));
                } while (abstractC0661h.d() < d10);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Float.valueOf(abstractC0661h.n()));
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w2 = abstractC0661h.w();
                }
            } while (w2 == this.f10243b);
            this.f10245d = w2;
            return;
        }
        r rVar = (r) list;
        int i9 = this.f10243b & 7;
        if (i9 == 2) {
            int x10 = abstractC0661h.x();
            S(x10);
            int d11 = abstractC0661h.d() + x10;
            do {
                rVar.b(abstractC0661h.n());
            } while (abstractC0661h.d() < d11);
            return;
        }
        if (i9 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            rVar.b(abstractC0661h.n());
            if (abstractC0661h.e()) {
                return;
            } else {
                w10 = abstractC0661h.w();
            }
        } while (w10 == this.f10243b);
        this.f10245d = w10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int E() {
        R(0);
        return this.f10242a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final boolean F() {
        int i;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (abstractC0661h.e() || (i = this.f10243b) == this.f10244c) {
            return false;
        }
        return abstractC0661h.z(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int G() {
        R(5);
        return this.f10242a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void H(List<ByteString> list) {
        int w2;
        if ((this.f10243b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(C());
            AbstractC0661h abstractC0661h = this.f10242a;
            if (abstractC0661h.e()) {
                return;
            } else {
                w2 = abstractC0661h.w();
            }
        } while (w2 == this.f10243b);
        this.f10245d = w2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void I(List<Double> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0664k;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC0661h.j()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int x9 = abstractC0661h.x();
            T(x9);
            int d10 = abstractC0661h.d() + x9;
            do {
                list.add(Double.valueOf(abstractC0661h.j()));
            } while (abstractC0661h.d() < d10);
            return;
        }
        C0664k c0664k = (C0664k) list;
        int i9 = this.f10243b & 7;
        if (i9 == 1) {
            do {
                c0664k.b(abstractC0661h.j());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int x10 = abstractC0661h.x();
        T(x10);
        int d11 = abstractC0661h.d() + x10;
        do {
            c0664k.b(abstractC0661h.j());
        } while (abstractC0661h.d() < d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final <T> void J(List<T> list, X<T> x9, C0666m c0666m) {
        int w2;
        int i = this.f10243b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(N(x9, c0666m));
            AbstractC0661h abstractC0661h = this.f10242a;
            if (abstractC0661h.e() || this.f10245d != 0) {
                return;
            } else {
                w2 = abstractC0661h.w();
            }
        } while (w2 == i);
        this.f10245d = w2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final long K() {
        R(0);
        return this.f10242a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final String L() {
        R(2);
        return this.f10242a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void M(List<Long> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof A;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0661h.m()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int x9 = abstractC0661h.x();
            T(x9);
            int d10 = abstractC0661h.d() + x9;
            do {
                list.add(Long.valueOf(abstractC0661h.m()));
            } while (abstractC0661h.d() < d10);
            return;
        }
        A a10 = (A) list;
        int i9 = this.f10243b & 7;
        if (i9 == 1) {
            do {
                a10.b(abstractC0661h.m());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int x10 = abstractC0661h.x();
        T(x10);
        int d11 = abstractC0661h.d() + x10;
        do {
            a10.b(abstractC0661h.m());
        } while (abstractC0661h.d() < d11);
    }

    public final <T> T N(X<T> x9, C0666m c0666m) {
        int i = this.f10244c;
        this.f10244c = ((this.f10243b >>> 3) << 3) | 4;
        try {
            T newInstance = x9.newInstance();
            x9.f(newInstance, this, c0666m);
            x9.b(newInstance);
            if (this.f10243b == this.f10244c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.e();
        } finally {
            this.f10244c = i;
        }
    }

    public final <T> T O(X<T> x9, C0666m c0666m) {
        AbstractC0661h abstractC0661h = this.f10242a;
        int x10 = abstractC0661h.x();
        if (abstractC0661h.f10224a >= abstractC0661h.f10225b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int g10 = abstractC0661h.g(x10);
        T newInstance = x9.newInstance();
        abstractC0661h.f10224a++;
        x9.f(newInstance, this, c0666m);
        x9.b(newInstance);
        abstractC0661h.a(0);
        abstractC0661h.f10224a--;
        abstractC0661h.f(g10);
        return newInstance;
    }

    public final void P(List<String> list, boolean z10) {
        int w2;
        int w10;
        if ((this.f10243b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z11 = list instanceof InterfaceC0677y;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? L() : y());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w2 = abstractC0661h.w();
                }
            } while (w2 == this.f10243b);
            this.f10245d = w2;
            return;
        }
        InterfaceC0677y interfaceC0677y = (InterfaceC0677y) list;
        do {
            interfaceC0677y.V(C());
            if (abstractC0661h.e()) {
                return;
            } else {
                w10 = abstractC0661h.w();
            }
        } while (w10 == this.f10243b);
        this.f10245d = w10;
    }

    public final void Q(int i) {
        if (this.f10242a.d() != i) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void R(int i) {
        if ((this.f10243b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void a(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0661h.s()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Integer.valueOf(abstractC0661h.s()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                c0672t.b(abstractC0661h.s());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            c0672t.b(abstractC0661h.s());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final long b() {
        R(0);
        return this.f10242a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final long c() {
        R(1);
        return this.f10242a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void d(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 2) {
                int x9 = abstractC0661h.x();
                S(x9);
                int d10 = abstractC0661h.d() + x9;
                do {
                    list.add(Integer.valueOf(abstractC0661h.q()));
                } while (abstractC0661h.d() < d10);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(abstractC0661h.q()));
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w2 = abstractC0661h.w();
                }
            } while (w2 == this.f10243b);
            this.f10245d = w2;
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 2) {
            int x10 = abstractC0661h.x();
            S(x10);
            int d11 = abstractC0661h.d() + x10;
            do {
                c0672t.b(abstractC0661h.q());
            } while (abstractC0661h.d() < d11);
            return;
        }
        if (i9 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c0672t.b(abstractC0661h.q());
            if (abstractC0661h.e()) {
                return;
            } else {
                w10 = abstractC0661h.w();
            }
        } while (w10 == this.f10243b);
        this.f10245d = w10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void e(List<Long> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof A;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0661h.t()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Long.valueOf(abstractC0661h.t()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        A a10 = (A) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                a10.b(abstractC0661h.t());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            a10.b(abstractC0661h.t());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void f(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0661h.x()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Integer.valueOf(abstractC0661h.x()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                c0672t.b(abstractC0661h.x());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            c0672t.b(abstractC0661h.x());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final <T> void g(List<T> list, X<T> x9, C0666m c0666m) {
        int w2;
        int i = this.f10243b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(O(x9, c0666m));
            AbstractC0661h abstractC0661h = this.f10242a;
            if (abstractC0661h.e() || this.f10245d != 0) {
                return;
            } else {
                w2 = abstractC0661h.w();
            }
        } while (w2 == i);
        this.f10245d = w2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int getTag() {
        return this.f10243b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int h() {
        R(5);
        return this.f10242a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final boolean i() {
        R(0);
        return this.f10242a.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final long j() {
        R(1);
        return this.f10242a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void k(List<Long> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof A;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0661h.y()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Long.valueOf(abstractC0661h.y()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        A a10 = (A) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                a10.b(abstractC0661h.y());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            a10.b(abstractC0661h.y());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int l() {
        R(0);
        return this.f10242a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void m() {
        R(2);
        AbstractC0661h abstractC0661h = this.f10242a;
        abstractC0661h.g(abstractC0661h.x());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void n(List<Long> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof A;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC0661h.p()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Long.valueOf(abstractC0661h.p()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        A a10 = (A) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                a10.b(abstractC0661h.p());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            a10.b(abstractC0661h.p());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void o(List<Long> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof A;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC0661h.r()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int x9 = abstractC0661h.x();
            T(x9);
            int d10 = abstractC0661h.d() + x9;
            do {
                list.add(Long.valueOf(abstractC0661h.r()));
            } while (abstractC0661h.d() < d10);
            return;
        }
        A a10 = (A) list;
        int i9 = this.f10243b & 7;
        if (i9 == 1) {
            do {
                a10.b(abstractC0661h.r());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int x10 = abstractC0661h.x();
        T(x10);
        int d11 = abstractC0661h.d() + x10;
        do {
            a10.b(abstractC0661h.r());
        } while (abstractC0661h.d() < d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void p(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0661h.o()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Integer.valueOf(abstractC0661h.o()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                c0672t.b(abstractC0661h.o());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            c0672t.b(abstractC0661h.o());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void q(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0661h.k()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Integer.valueOf(abstractC0661h.k()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                c0672t.b(abstractC0661h.k());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            c0672t.b(abstractC0661h.k());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final <T> T r(X<T> x9, C0666m c0666m) {
        R(3);
        return (T) N(x9, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final double readDouble() {
        R(1);
        return this.f10242a.j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final float readFloat() {
        R(5);
        return this.f10242a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int s() {
        R(0);
        return this.f10242a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final <T> T t(X<T> x9, C0666m c0666m) {
        R(2);
        return (T) O(x9, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void u(List<Integer> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0672t;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 2) {
                int x9 = abstractC0661h.x();
                S(x9);
                int d10 = abstractC0661h.d() + x9;
                do {
                    list.add(Integer.valueOf(abstractC0661h.l()));
                } while (abstractC0661h.d() < d10);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(abstractC0661h.l()));
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w2 = abstractC0661h.w();
                }
            } while (w2 == this.f10243b);
            this.f10245d = w2;
            return;
        }
        C0672t c0672t = (C0672t) list;
        int i9 = this.f10243b & 7;
        if (i9 == 2) {
            int x10 = abstractC0661h.x();
            S(x10);
            int d11 = abstractC0661h.d() + x10;
            do {
                c0672t.b(abstractC0661h.l());
            } while (abstractC0661h.d() < d11);
            return;
        }
        if (i9 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c0672t.b(abstractC0661h.l());
            if (abstractC0661h.e()) {
                return;
            } else {
                w10 = abstractC0661h.w();
            }
        } while (w10 == this.f10243b);
        this.f10245d = w10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int v() {
        R(0);
        return this.f10242a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final long w() {
        R(0);
        return this.f10242a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final void x(List<Boolean> list) {
        int w2;
        int w10;
        boolean z10 = list instanceof C0659f;
        AbstractC0661h abstractC0661h = this.f10242a;
        if (!z10) {
            int i = this.f10243b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0661h.h()));
                    if (abstractC0661h.e()) {
                        return;
                    } else {
                        w2 = abstractC0661h.w();
                    }
                } while (w2 == this.f10243b);
                this.f10245d = w2;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int d10 = abstractC0661h.d() + abstractC0661h.x();
            do {
                list.add(Boolean.valueOf(abstractC0661h.h()));
            } while (abstractC0661h.d() < d10);
            Q(d10);
            return;
        }
        C0659f c0659f = (C0659f) list;
        int i9 = this.f10243b & 7;
        if (i9 == 0) {
            do {
                c0659f.b(abstractC0661h.h());
                if (abstractC0661h.e()) {
                    return;
                } else {
                    w10 = abstractC0661h.w();
                }
            } while (w10 == this.f10243b);
            this.f10245d = w10;
            return;
        }
        if (i9 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int d11 = abstractC0661h.d() + abstractC0661h.x();
        do {
            c0659f.b(abstractC0661h.h());
        } while (abstractC0661h.d() < d11);
        Q(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final String y() {
        R(2);
        return this.f10242a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.W
    public final int z() {
        int i = this.f10245d;
        if (i != 0) {
            this.f10243b = i;
            this.f10245d = 0;
        } else {
            this.f10243b = this.f10242a.w();
        }
        int i9 = this.f10243b;
        if (i9 == 0 || i9 == this.f10244c) {
            return Integer.MAX_VALUE;
        }
        return i9 >>> 3;
    }
}
