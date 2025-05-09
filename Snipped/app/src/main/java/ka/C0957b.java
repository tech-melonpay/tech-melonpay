package ka;

import ca.InterfaceC0650p;
import da.InterfaceC0701a;
import ha.C0806e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Strings.kt */
/* renamed from: ka.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0957b implements ja.h<C0806e> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f23057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23058b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23059c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0650p<CharSequence, Integer, Pair<Integer, Integer>> f23060d;

    /* compiled from: Strings.kt */
    /* renamed from: ka.b$a */
    public static final class a implements Iterator<C0806e>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public int f23061a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f23062b;

        /* renamed from: c, reason: collision with root package name */
        public int f23063c;

        /* renamed from: d, reason: collision with root package name */
        public C0806e f23064d;

        /* renamed from: e, reason: collision with root package name */
        public int f23065e;

        public a() {
            int S = ha.h.S(C0957b.this.f23058b, 0, C0957b.this.f23057a.length());
            this.f23062b = S;
            this.f23063c = S;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r6 < r3) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f23063c
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.f23061a = r1
                r0 = 0
                r7.f23064d = r0
                goto L7b
            Lb:
                ka.b r2 = ka.C0957b.this
                int r3 = r2.f23059c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.f23065e
                int r6 = r6 + r5
                r7.f23065e = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r3 = r2.f23057a
                int r3 = r3.length()
                if (r0 <= r3) goto L34
            L22:
                ha.e r0 = new ha.e
                int r1 = r7.f23062b
                java.lang.CharSequence r2 = r2.f23057a
                int r2 = ka.C0969n.c0(r2)
                r0.<init>(r1, r2, r5)
                r7.f23064d = r0
                r7.f23063c = r4
                goto L79
            L34:
                ca.p<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r2.f23060d
                java.lang.CharSequence r3 = r2.f23057a
                int r6 = r7.f23063c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L58
                ha.e r0 = new ha.e
                int r1 = r7.f23062b
                java.lang.CharSequence r2 = r2.f23057a
                int r2 = ka.C0969n.c0(r2)
                r0.<init>(r1, r2, r5)
                r7.f23064d = r0
                r7.f23063c = r4
                goto L79
            L58:
                A r2 = r0.f23089a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f23090b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f23062b
                ha.e r3 = ha.h.V(r3, r2)
                r7.f23064d = r3
                int r2 = r2 + r0
                r7.f23062b = r2
                if (r0 != 0) goto L76
                r1 = r5
            L76:
                int r2 = r2 + r1
                r7.f23063c = r2
            L79:
                r7.f23061a = r5
            L7b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.C0957b.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f23061a == -1) {
                a();
            }
            return this.f23061a == 1;
        }

        @Override // java.util.Iterator
        public final C0806e next() {
            if (this.f23061a == -1) {
                a();
            }
            if (this.f23061a == 0) {
                throw new NoSuchElementException();
            }
            C0806e c0806e = this.f23064d;
            this.f23064d = null;
            this.f23061a = -1;
            return c0806e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0957b(CharSequence charSequence, int i, int i9, InterfaceC0650p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> interfaceC0650p) {
        this.f23057a = charSequence;
        this.f23058b = i;
        this.f23059c = i9;
        this.f23060d = interfaceC0650p;
    }

    @Override // ja.h
    public final Iterator<C0806e> iterator() {
        return new a();
    }
}
