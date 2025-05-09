package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0658e;
import com.google.crypto.tink.shaded.protobuf.C0670q;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
public final class M<T> implements X<T> {

    /* renamed from: a, reason: collision with root package name */
    public final I f10147a;

    /* renamed from: b, reason: collision with root package name */
    public final d0<?, ?> f10148b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10149c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0667n<?> f10150d;

    public M(d0<?, ?> d0Var, AbstractC0667n<?> abstractC0667n, I i) {
        this.f10148b = d0Var;
        this.f10149c = abstractC0667n.e(i);
        this.f10150d = abstractC0667n;
        this.f10147a = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void a(T t3, T t10) {
        Class<?> cls = Y.f10182a;
        d0<?, ?> d0Var = this.f10148b;
        d0Var.o(t3, d0Var.k(d0Var.g(t3), d0Var.g(t10)));
        if (this.f10149c) {
            Y.B(this.f10150d, t3, t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void b(T t3) {
        this.f10148b.j(t3);
        this.f10150d.f(t3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final boolean c(T t3) {
        return this.f10150d.c(t3).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void d(Object obj, C0663j c0663j) {
        Iterator<Map.Entry<?, Object>> j10 = this.f10150d.c(obj).j();
        if (j10.hasNext()) {
            ((C0670q.a) j10.next().getKey()).b();
            throw null;
        }
        d0<?, ?> d0Var = this.f10148b;
        d0Var.q(d0Var.g(obj), c0663j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void e(T t3, byte[] bArr, int i, int i9, C0658e.a aVar) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
        e0 e0Var = generatedMessageLite.unknownFields;
        if (e0Var == e0.f10210f) {
            e0Var = new e0();
            generatedMessageLite.unknownFields = e0Var;
        }
        e0 e0Var2 = e0Var;
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) t3;
        C0670q<GeneratedMessageLite.d> c0670q = cVar.extensions;
        if (c0670q.f10259b) {
            cVar.extensions = c0670q.clone();
        }
        Throwable th = null;
        int i10 = i;
        GeneratedMessageLite.e eVar = null;
        while (i10 < i9) {
            int H10 = C0658e.H(bArr, i10, aVar);
            int i11 = aVar.f10206a;
            I i12 = this.f10147a;
            AbstractC0667n<?> abstractC0667n = this.f10150d;
            int i13 = 2;
            C0666m c0666m = aVar.f10209d;
            if (i11 == 11) {
                int i14 = 0;
                Object obj = th;
                while (H10 < i9) {
                    H10 = C0658e.H(bArr, H10, aVar);
                    int i15 = aVar.f10206a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 != i13) {
                        if (i16 == 3) {
                            if (eVar != null) {
                                T t10 = T.f10158c;
                                throw null;
                            }
                            if (i17 == 2) {
                                H10 = C0658e.b(bArr, H10, aVar);
                                obj = (ByteString) aVar.f10208c;
                                th = null;
                                i13 = 2;
                            }
                        }
                        th = null;
                    } else {
                        th = null;
                        if (i17 == 0) {
                            H10 = C0658e.H(bArr, H10, aVar);
                            i14 = aVar.f10206a;
                            eVar = abstractC0667n.b(c0666m, i12, i14);
                            i13 = 2;
                        }
                    }
                    if (i15 == 12) {
                        break;
                    }
                    H10 = C0658e.L(i15, bArr, H10, i9, aVar);
                    i13 = 2;
                }
                if (obj != null) {
                    e0Var2.b((i14 << 3) | 2, obj);
                }
                i10 = H10;
            } else if ((i11 & 7) == 2) {
                GeneratedMessageLite.e b9 = abstractC0667n.b(c0666m, i12, i11 >>> 3);
                if (b9 != null) {
                    T t11 = T.f10158c;
                    throw th;
                }
                i10 = C0658e.F(i11, bArr, H10, i9, e0Var2, aVar);
                eVar = b9;
            } else {
                i10 = C0658e.L(i11, bArr, H10, i9, aVar);
            }
        }
        if (i10 != i9) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final void f(T t3, W w2, C0666m c0666m) {
        d0 d0Var = this.f10148b;
        e0 f10 = d0Var.f(t3);
        AbstractC0667n abstractC0667n = this.f10150d;
        C0670q<ET> d10 = abstractC0667n.d(t3);
        while (w2.z() != Integer.MAX_VALUE && j(w2, c0666m, abstractC0667n, d10, d0Var, f10)) {
            try {
            } finally {
                d0Var.n(t3, f10);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final boolean g(T t3, T t10) {
        d0<?, ?> d0Var = this.f10148b;
        if (!d0Var.g(t3).equals(d0Var.g(t10))) {
            return false;
        }
        if (!this.f10149c) {
            return true;
        }
        AbstractC0667n<?> abstractC0667n = this.f10150d;
        return abstractC0667n.c(t3).equals(abstractC0667n.c(t10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final int h(T t3) {
        d0<?, ?> d0Var = this.f10148b;
        int i = d0Var.i(d0Var.g(t3));
        if (this.f10149c) {
            a0<?, Object> a0Var = this.f10150d.c(t3).f10258a;
            if (a0Var.f10188b.size() > 0) {
                C0670q.e(a0Var.d(0));
                throw null;
            }
            Iterator<Map.Entry<?, Object>> it = a0Var.e().iterator();
            if (it.hasNext()) {
                C0670q.e(it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final int i(T t3) {
        int hashCode = this.f10148b.g(t3).hashCode();
        return this.f10149c ? (hashCode * 53) + this.f10150d.c(t3).f10258a.hashCode() : hashCode;
    }

    public final <UT, UB, ET extends C0670q.a<ET>> boolean j(W w2, C0666m c0666m, AbstractC0667n<ET> abstractC0667n, C0670q<ET> c0670q, d0<UT, UB> d0Var, UB ub) {
        int tag = w2.getTag();
        I i = this.f10147a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return w2.F();
            }
            GeneratedMessageLite.e b9 = abstractC0667n.b(c0666m, i, tag >>> 3);
            if (b9 == null) {
                return d0Var.l(ub, w2);
            }
            abstractC0667n.h(b9);
            throw null;
        }
        int i9 = 0;
        GeneratedMessageLite.e eVar = null;
        ByteString byteString = null;
        while (w2.z() != Integer.MAX_VALUE) {
            int tag2 = w2.getTag();
            if (tag2 == 16) {
                i9 = w2.l();
                eVar = abstractC0667n.b(c0666m, i, i9);
            } else if (tag2 == 26) {
                if (eVar != null) {
                    abstractC0667n.h(eVar);
                    throw null;
                }
                byteString = w2.C();
            } else if (!w2.F()) {
                break;
            }
        }
        if (w2.getTag() != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteString == null) {
            return true;
        }
        if (eVar == null) {
            d0Var.d(ub, i9, byteString);
            return true;
        }
        abstractC0667n.i(eVar);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.X
    public final T newInstance() {
        return (T) this.f10147a.f().h();
    }
}
