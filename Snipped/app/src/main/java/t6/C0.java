package t6;

import G0.c;

/* compiled from: CellInputAmountBindingImpl.java */
/* loaded from: classes2.dex */
public final class C0 extends B0 {

    /* renamed from: x, reason: collision with root package name */
    public long f27655x;

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f27655x;
            this.f27655x = 0L;
        }
        String str = this.f27639v;
        c.InterfaceC0016c interfaceC0016c = this.f27640w;
        String str2 = this.f27635r;
        Integer num = this.f27637t;
        String str3 = this.f27634q;
        String str4 = this.f27636s;
        String str5 = this.f27638u;
        long j11 = 16386 & j10;
        long j12 = 16400 & j10;
        long j13 = 16416 & j10;
        long j14 = 16512 & j10;
        int j15 = j14 != 0 ? F0.f.j(num) : 0;
        long j16 = j10 & 17408;
        long j17 = j10 & 18432;
        long j18 = j10 & 24576;
        if (j14 != 0) {
            C8.a.h(j15, this.f27631n);
        }
        if (j16 != 0) {
            this.f27631n.setHint(str3);
        }
        if (j18 != 0) {
            this.f27631n.setError(str5);
        }
        if (j13 != 0) {
            G0.c.a(this.f27632o, str2);
        }
        if (j17 != 0) {
            this.f27632o.setCurrency(str4);
        }
        if (j12 != 0) {
            G0.c.b(this.f27632o, interfaceC0016c);
        }
        if (j11 != 0) {
            G0.c.a(this.f27633p, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27655x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (111 == i) {
        } else if (34 == i) {
            this.f27639v = (String) obj;
            synchronized (this) {
                this.f27655x |= 2;
            }
            a();
            i();
        } else if (98 == i) {
        } else if (47 == i) {
        } else if (30 == i) {
            this.f27640w = (c.InterfaceC0016c) obj;
            synchronized (this) {
                this.f27655x |= 16;
            }
            a();
            i();
        } else if (154 == i) {
            this.f27635r = (String) obj;
            synchronized (this) {
                this.f27655x |= 32;
            }
            a();
            i();
        } else if (97 == i) {
        } else if (96 == i) {
            this.f27637t = (Integer) obj;
            synchronized (this) {
                this.f27655x |= 128;
            }
            a();
            i();
        } else if (168 == i) {
        } else if (55 == i) {
        } else if (42 == i) {
            this.f27634q = (String) obj;
            synchronized (this) {
                this.f27655x |= 1024;
            }
            a();
            i();
        } else if (21 == i) {
            this.f27636s = (String) obj;
            synchronized (this) {
                this.f27655x |= 2048;
            }
            a();
            i();
        } else if (120 == i) {
        } else {
            if (33 != i) {
                return false;
            }
            this.f27638u = (String) obj;
            synchronized (this) {
                this.f27655x |= 8192;
            }
            a();
            i();
        }
        return true;
    }
}
