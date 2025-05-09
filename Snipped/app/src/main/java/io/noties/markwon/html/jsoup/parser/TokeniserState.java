package io.noties.markwon.html.jsoup.parser;

import a9.C0525a;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class TokeniserState {

    /* renamed from: A, reason: collision with root package name */
    public static final AnonymousClass28 f21704A;

    /* renamed from: B, reason: collision with root package name */
    public static final AnonymousClass29 f21705B;

    /* renamed from: C, reason: collision with root package name */
    public static final AnonymousClass30 f21706C;

    /* renamed from: D, reason: collision with root package name */
    public static final AnonymousClass31 f21707D;

    /* renamed from: E, reason: collision with root package name */
    public static final AnonymousClass32 f21708E;

    /* renamed from: F, reason: collision with root package name */
    public static final AnonymousClass33 f21709F;

    /* renamed from: G, reason: collision with root package name */
    public static final AnonymousClass34 f21710G;

    /* renamed from: H, reason: collision with root package name */
    public static final AnonymousClass35 f21711H;

    /* renamed from: I, reason: collision with root package name */
    public static final AnonymousClass36 f21712I;

    /* renamed from: J, reason: collision with root package name */
    public static final AnonymousClass37 f21713J;

    /* renamed from: K, reason: collision with root package name */
    public static final AnonymousClass38 f21714K;

    /* renamed from: L, reason: collision with root package name */
    public static final AnonymousClass39 f21715L;

    /* renamed from: M, reason: collision with root package name */
    public static final AnonymousClass40 f21716M;

    /* renamed from: N, reason: collision with root package name */
    public static final AnonymousClass41 f21717N;

    /* renamed from: O, reason: collision with root package name */
    public static final AnonymousClass42 f21718O;

    /* renamed from: P, reason: collision with root package name */
    public static final AnonymousClass43 f21719P;

    /* renamed from: Q, reason: collision with root package name */
    public static final AnonymousClass44 f21720Q;
    public static final AnonymousClass45 R;
    public static final AnonymousClass46 S;
    public static final AnonymousClass47 T;
    public static final AnonymousClass48 U;
    public static final AnonymousClass49 V;
    public static final AnonymousClass50 W;
    public static final AnonymousClass51 X;
    public static final AnonymousClass52 Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final AnonymousClass53 f21721Z;

    /* renamed from: a, reason: collision with root package name */
    public static final AnonymousClass1 f21722a;

    /* renamed from: a0, reason: collision with root package name */
    public static final AnonymousClass54 f21723a0;

    /* renamed from: b, reason: collision with root package name */
    public static final AnonymousClass2 f21724b;

    /* renamed from: b0, reason: collision with root package name */
    public static final AnonymousClass55 f21725b0;

    /* renamed from: c, reason: collision with root package name */
    public static final AnonymousClass3 f21726c;

    /* renamed from: c0, reason: collision with root package name */
    public static final AnonymousClass56 f21727c0;

    /* renamed from: d, reason: collision with root package name */
    public static final AnonymousClass4 f21728d;

    /* renamed from: d0, reason: collision with root package name */
    public static final AnonymousClass57 f21729d0;

    /* renamed from: e, reason: collision with root package name */
    public static final AnonymousClass5 f21730e;

    /* renamed from: f, reason: collision with root package name */
    public static final AnonymousClass6 f21731f;

    /* renamed from: f0, reason: collision with root package name */
    public static final AnonymousClass58 f21732f0;

    /* renamed from: g, reason: collision with root package name */
    public static final AnonymousClass8 f21733g;

    /* renamed from: g0, reason: collision with root package name */
    public static final AnonymousClass59 f21734g0;

    /* renamed from: h, reason: collision with root package name */
    public static final AnonymousClass9 f21735h;

    /* renamed from: h0, reason: collision with root package name */
    public static final AnonymousClass60 f21736h0;
    public static final AnonymousClass10 i;

    /* renamed from: i0, reason: collision with root package name */
    public static final AnonymousClass61 f21737i0;

    /* renamed from: j, reason: collision with root package name */
    public static final AnonymousClass11 f21738j;

    /* renamed from: j0, reason: collision with root package name */
    public static final AnonymousClass62 f21739j0;

    /* renamed from: k, reason: collision with root package name */
    public static final AnonymousClass12 f21740k;

    /* renamed from: k0, reason: collision with root package name */
    public static final AnonymousClass63 f21741k0;

    /* renamed from: l, reason: collision with root package name */
    public static final AnonymousClass13 f21742l;

    /* renamed from: l0, reason: collision with root package name */
    public static final AnonymousClass64 f21743l0;

    /* renamed from: m, reason: collision with root package name */
    public static final AnonymousClass14 f21744m;

    /* renamed from: m0, reason: collision with root package name */
    public static final AnonymousClass65 f21745m0;

    /* renamed from: n, reason: collision with root package name */
    public static final AnonymousClass15 f21746n;

    /* renamed from: n0, reason: collision with root package name */
    public static final AnonymousClass66 f21747n0;

    /* renamed from: o, reason: collision with root package name */
    public static final AnonymousClass16 f21748o;

    /* renamed from: o0, reason: collision with root package name */
    public static final AnonymousClass67 f21749o0;

    /* renamed from: p, reason: collision with root package name */
    public static final AnonymousClass17 f21750p;

    /* renamed from: p0, reason: collision with root package name */
    public static final char[] f21751p0;

    /* renamed from: q, reason: collision with root package name */
    public static final AnonymousClass18 f21752q;

    /* renamed from: q0, reason: collision with root package name */
    public static final char[] f21753q0;

    /* renamed from: r, reason: collision with root package name */
    public static final AnonymousClass19 f21754r;

    /* renamed from: r0, reason: collision with root package name */
    public static final char[] f21755r0;

    /* renamed from: s, reason: collision with root package name */
    public static final AnonymousClass20 f21756s;
    public static final char[] s0;

    /* renamed from: t, reason: collision with root package name */
    public static final AnonymousClass21 f21757t;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f21758t0;

    /* renamed from: u, reason: collision with root package name */
    public static final AnonymousClass22 f21759u;

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ TokeniserState[] f21760u0;

    /* renamed from: v, reason: collision with root package name */
    public static final AnonymousClass23 f21761v;

    /* renamed from: w, reason: collision with root package name */
    public static final AnonymousClass24 f21762w;

    /* renamed from: x, reason: collision with root package name */
    public static final AnonymousClass25 f21763x;

    /* renamed from: y, reason: collision with root package name */
    public static final AnonymousClass26 f21764y;

    /* renamed from: z, reason: collision with root package name */
    public static final AnonymousClass27 f21765z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$11] */
    /* JADX WARN: Type inference failed for: r11v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$12] */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$13] */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$14] */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$15] */
    /* JADX WARN: Type inference failed for: r15v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$16] */
    /* JADX WARN: Type inference failed for: r16v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$17] */
    /* JADX WARN: Type inference failed for: r17v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$18] */
    /* JADX WARN: Type inference failed for: r18v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$19] */
    /* JADX WARN: Type inference failed for: r19v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$2] */
    /* JADX WARN: Type inference failed for: r20v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$21] */
    /* JADX WARN: Type inference failed for: r21v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$22] */
    /* JADX WARN: Type inference failed for: r22v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$23] */
    /* JADX WARN: Type inference failed for: r23v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$24] */
    /* JADX WARN: Type inference failed for: r24v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$25] */
    /* JADX WARN: Type inference failed for: r25v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$26] */
    /* JADX WARN: Type inference failed for: r26v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$27] */
    /* JADX WARN: Type inference failed for: r27v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$28] */
    /* JADX WARN: Type inference failed for: r28v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$29] */
    /* JADX WARN: Type inference failed for: r29v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$30] */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$3] */
    /* JADX WARN: Type inference failed for: r30v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$31] */
    /* JADX WARN: Type inference failed for: r31v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$32] */
    /* JADX WARN: Type inference failed for: r32v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$33] */
    /* JADX WARN: Type inference failed for: r33v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$34] */
    /* JADX WARN: Type inference failed for: r34v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$35] */
    /* JADX WARN: Type inference failed for: r35v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$36] */
    /* JADX WARN: Type inference failed for: r36v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$37] */
    /* JADX WARN: Type inference failed for: r37v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$38] */
    /* JADX WARN: Type inference failed for: r38v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$39] */
    /* JADX WARN: Type inference failed for: r39v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$40] */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$4] */
    /* JADX WARN: Type inference failed for: r40v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$41] */
    /* JADX WARN: Type inference failed for: r41v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$42] */
    /* JADX WARN: Type inference failed for: r42v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$43] */
    /* JADX WARN: Type inference failed for: r43v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$44] */
    /* JADX WARN: Type inference failed for: r44v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$45] */
    /* JADX WARN: Type inference failed for: r45v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$46] */
    /* JADX WARN: Type inference failed for: r46v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$47] */
    /* JADX WARN: Type inference failed for: r47v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$48] */
    /* JADX WARN: Type inference failed for: r48v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$49] */
    /* JADX WARN: Type inference failed for: r49v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$50] */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$5] */
    /* JADX WARN: Type inference failed for: r50v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$51] */
    /* JADX WARN: Type inference failed for: r51v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$52] */
    /* JADX WARN: Type inference failed for: r52v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$53] */
    /* JADX WARN: Type inference failed for: r53v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$54] */
    /* JADX WARN: Type inference failed for: r54v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$55] */
    /* JADX WARN: Type inference failed for: r55v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$56] */
    /* JADX WARN: Type inference failed for: r56v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$57] */
    /* JADX WARN: Type inference failed for: r57v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$58] */
    /* JADX WARN: Type inference failed for: r58v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$59] */
    /* JADX WARN: Type inference failed for: r59v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$60] */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$6] */
    /* JADX WARN: Type inference failed for: r60v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$61] */
    /* JADX WARN: Type inference failed for: r61v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$62] */
    /* JADX WARN: Type inference failed for: r62v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$63] */
    /* JADX WARN: Type inference failed for: r63v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$64] */
    /* JADX WARN: Type inference failed for: r64v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$65] */
    /* JADX WARN: Type inference failed for: r65v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$66] */
    /* JADX WARN: Type inference failed for: r66v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$67] */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$8] */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$9] */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.noties.markwon.html.jsoup.parser.TokeniserState$10] */
    static {
        ?? r02 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.1
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
            
                r9 = a9.C0525a.c(r5, r9.f4495h, r0, r4 - r0);
             */
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void e(io.noties.markwon.html.jsoup.parser.a r8, a9.C0525a r9) {
                /*
                    r7 = this;
                    char r0 = r9.i()
                    if (r0 == 0) goto L53
                    r1 = 38
                    if (r0 == r1) goto L4d
                    r2 = 60
                    if (r0 == r2) goto L47
                    r3 = 65535(0xffff, float:9.1834E-41)
                    if (r0 == r3) goto L3e
                    r9.b()
                    int r0 = r9.f4492e
                    int r3 = r9.f4490c
                L1a:
                    int r4 = r9.f4492e
                    char[] r5 = r9.f4488a
                    if (r4 >= r3) goto L2e
                    char r6 = r5[r4]
                    if (r6 == r1) goto L2e
                    if (r6 == r2) goto L2e
                    if (r6 != 0) goto L29
                    goto L2e
                L29:
                    int r4 = r4 + 1
                    r9.f4492e = r4
                    goto L1a
                L2e:
                    if (r4 <= r0) goto L38
                    java.lang.String[] r9 = r9.f4495h
                    int r4 = r4 - r0
                    java.lang.String r9 = a9.C0525a.c(r5, r9, r0, r4)
                    goto L3a
                L38:
                    java.lang.String r9 = ""
                L3a:
                    r8.h(r9)
                    goto L5d
                L3e:
                    io.noties.markwon.html.jsoup.parser.Token$e r9 = new io.noties.markwon.html.jsoup.parser.Token$e
                    r9.<init>()
                    r8.g(r9)
                    goto L5d
                L47:
                    io.noties.markwon.html.jsoup.parser.TokeniserState$8 r9 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21733g
                    r8.a(r9)
                    goto L5d
                L4d:
                    io.noties.markwon.html.jsoup.parser.TokeniserState$2 r9 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21724b
                    r8.a(r9)
                    goto L5d
                L53:
                    r8.m(r7)
                    char r9 = r9.d()
                    r8.f(r9)
                L5d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.html.jsoup.parser.TokeniserState.AnonymousClass1.e(io.noties.markwon.html.jsoup.parser.a, a9.a):void");
            }
        };
        f21722a = r02;
        ?? r12 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.2
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                int[] c2 = aVar.c(null, false);
                if (c2 == null) {
                    aVar.f('&');
                } else {
                    aVar.h(new String(c2, 0, c2.length));
                }
                aVar.f21770c = anonymousClass1;
            }
        };
        f21724b = r12;
        ?? r22 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.3
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char i9 = c0525a.i();
                if (i9 == 0) {
                    aVar.m(this);
                    c0525a.a();
                    aVar.f((char) 65533);
                } else {
                    if (i9 == '&') {
                        aVar.a(TokeniserState.f21728d);
                        return;
                    }
                    if (i9 == '<') {
                        aVar.a(TokeniserState.f21738j);
                    } else if (i9 != 65535) {
                        aVar.h(c0525a.g('&', '<', 0));
                    } else {
                        aVar.g(new Token.e());
                    }
                }
            }
        };
        f21726c = r22;
        ?? r32 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.4
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                AnonymousClass3 anonymousClass3 = TokeniserState.f21726c;
                int[] c2 = aVar.c(null, false);
                if (c2 == null) {
                    aVar.f('&');
                } else {
                    aVar.h(new String(c2, 0, c2.length));
                }
                aVar.f21770c = anonymousClass3;
            }
        };
        f21728d = r32;
        ?? r42 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.5
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.a(aVar, c0525a, this, TokeniserState.f21744m);
            }
        };
        f21730e = r42;
        ?? r52 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.6
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.a(aVar, c0525a, this, TokeniserState.f21750p);
            }
        };
        f21731f = r52;
        TokeniserState tokeniserState = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.7
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char i9 = c0525a.i();
                if (i9 == 0) {
                    aVar.m(this);
                    c0525a.a();
                    aVar.f((char) 65533);
                } else if (i9 != 65535) {
                    aVar.h(c0525a.f((char) 0));
                } else {
                    aVar.g(new Token.e());
                }
            }
        };
        ?? r72 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.8
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char i9 = c0525a.i();
                if (i9 == '!') {
                    aVar.a(TokeniserState.f21720Q);
                    return;
                }
                if (i9 == '/') {
                    aVar.a(TokeniserState.f21735h);
                    return;
                }
                if (i9 == '?') {
                    aVar.a(TokeniserState.f21719P);
                    return;
                }
                if (c0525a.o()) {
                    aVar.d(true);
                    aVar.f21770c = TokeniserState.i;
                } else {
                    aVar.m(this);
                    aVar.f('<');
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21733g = r72;
        ?? r8 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.9
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                boolean j10 = c0525a.j();
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (j10) {
                    aVar.l(this);
                    aVar.h("</");
                    aVar.f21770c = anonymousClass1;
                } else if (c0525a.o()) {
                    aVar.d(false);
                    aVar.f21770c = TokeniserState.i;
                } else if (c0525a.m('>')) {
                    aVar.m(this);
                    aVar.a(anonymousClass1);
                } else {
                    aVar.m(this);
                    aVar.a(TokeniserState.f21719P);
                }
            }
        };
        f21735h = r8;
        ?? r92 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.10
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
            
                r0 = a9.C0525a.c(r10, r14.f4495h, r0, r2 - r0);
             */
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void e(io.noties.markwon.html.jsoup.parser.a r13, a9.C0525a r14) {
                /*
                    r12 = this;
                    r14.b()
                    int r0 = r14.f4492e
                    int r1 = r14.f4490c
                L7:
                    int r2 = r14.f4492e
                    r3 = 62
                    r4 = 47
                    r5 = 32
                    r6 = 12
                    r7 = 13
                    r8 = 10
                    r9 = 9
                    char[] r10 = r14.f4488a
                    if (r2 >= r1) goto L33
                    char r11 = r10[r2]
                    if (r11 == r9) goto L33
                    if (r11 == r8) goto L33
                    if (r11 == r7) goto L33
                    if (r11 == r6) goto L33
                    if (r11 == r5) goto L33
                    if (r11 == r4) goto L33
                    if (r11 == r3) goto L33
                    if (r11 != 0) goto L2e
                    goto L33
                L2e:
                    int r2 = r2 + 1
                    r14.f4492e = r2
                    goto L7
                L33:
                    if (r2 <= r0) goto L3d
                    java.lang.String[] r1 = r14.f4495h
                    int r2 = r2 - r0
                    java.lang.String r0 = a9.C0525a.c(r10, r1, r0, r2)
                    goto L3f
                L3d:
                    java.lang.String r0 = ""
                L3f:
                    io.noties.markwon.html.jsoup.parser.Token$h r1 = r13.i
                    r1.g(r0)
                    char r14 = r14.d()
                    if (r14 == 0) goto L82
                    if (r14 == r5) goto L7d
                    if (r14 == r4) goto L78
                    io.noties.markwon.html.jsoup.parser.TokeniserState$1 r0 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21722a
                    if (r14 == r3) goto L72
                    r1 = 65535(0xffff, float:9.1834E-41)
                    if (r14 == r1) goto L6c
                    if (r14 == r9) goto L7d
                    if (r14 == r8) goto L7d
                    if (r14 == r6) goto L7d
                    if (r14 == r7) goto L7d
                    io.noties.markwon.html.jsoup.parser.Token$h r13 = r13.i
                    r13.getClass()
                    java.lang.String r14 = java.lang.String.valueOf(r14)
                    r13.g(r14)
                    goto L89
                L6c:
                    r13.l(r12)
                    r13.f21770c = r0
                    goto L89
                L72:
                    r13.k()
                    r13.f21770c = r0
                    goto L89
                L78:
                    io.noties.markwon.html.jsoup.parser.TokeniserState$42 r14 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21718O
                    r13.f21770c = r14
                    goto L89
                L7d:
                    io.noties.markwon.html.jsoup.parser.TokeniserState$34 r14 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21710G
                    r13.f21770c = r14
                    goto L89
                L82:
                    io.noties.markwon.html.jsoup.parser.Token$h r13 = r13.i
                    java.lang.String r14 = io.noties.markwon.html.jsoup.parser.TokeniserState.f21758t0
                    r13.g(r14)
                L89:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.html.jsoup.parser.TokeniserState.AnonymousClass10.e(io.noties.markwon.html.jsoup.parser.a, a9.a):void");
            }
        };
        i = r92;
        ?? r10 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.11
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.f21740k);
                    return;
                }
                if (c0525a.o() && aVar.f21781o != null) {
                    String str = "</" + aVar.f21781o;
                    Locale locale = Locale.ENGLISH;
                    String lowerCase = str.toLowerCase(locale);
                    String upperCase = str.toUpperCase(locale);
                    if (c0525a.p(lowerCase) <= -1 && c0525a.p(upperCase) <= -1) {
                        Token.h d10 = aVar.d(false);
                        String str2 = aVar.f21781o;
                        d10.f21696b = str2;
                        d10.f21697c = str2 != null ? str2.toLowerCase(locale) : "";
                        aVar.i = d10;
                        aVar.k();
                        c0525a.q();
                        aVar.f21770c = TokeniserState.f21722a;
                        return;
                    }
                }
                aVar.h("<");
                aVar.f21770c = TokeniserState.f21726c;
            }
        };
        f21738j = r10;
        ?? r11 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.12
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (!c0525a.o()) {
                    aVar.h("</");
                    aVar.f21770c = TokeniserState.f21726c;
                    return;
                }
                aVar.d(false);
                Token.h hVar = aVar.i;
                char i9 = c0525a.i();
                hVar.getClass();
                hVar.g(String.valueOf(i9));
                aVar.f21775h.append(c0525a.i());
                aVar.a(TokeniserState.f21742l);
            }
        };
        f21740k = r11;
        ?? r122 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.13
            public static void f(a aVar, C0525a c0525a) {
                aVar.h("</" + aVar.f21775h.toString());
                c0525a.q();
                aVar.f21770c = TokeniserState.f21726c;
            }

            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.o()) {
                    String e10 = c0525a.e();
                    aVar.i.g(e10);
                    aVar.f21775h.append(e10);
                    return;
                }
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    if (aVar.n()) {
                        aVar.f21770c = TokeniserState.f21710G;
                        return;
                    } else {
                        f(aVar, c0525a);
                        return;
                    }
                }
                if (d10 == '/') {
                    if (aVar.n()) {
                        aVar.f21770c = TokeniserState.f21718O;
                        return;
                    } else {
                        f(aVar, c0525a);
                        return;
                    }
                }
                if (d10 != '>') {
                    f(aVar, c0525a);
                } else if (!aVar.n()) {
                    f(aVar, c0525a);
                } else {
                    aVar.k();
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21742l = r122;
        ?? r13 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.14
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.f21746n);
                } else {
                    aVar.f('<');
                    aVar.f21770c = TokeniserState.f21730e;
                }
            }
        };
        f21744m = r13;
        ?? r14 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.15
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                AnonymousClass16 anonymousClass16 = TokeniserState.f21748o;
                AnonymousClass5 anonymousClass5 = TokeniserState.f21730e;
                if (c0525a.o()) {
                    aVar.d(false);
                    aVar.f21770c = anonymousClass16;
                } else {
                    aVar.h("</");
                    aVar.f21770c = anonymousClass5;
                }
            }
        };
        f21746n = r14;
        ?? r15 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.16
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.c(aVar, c0525a, TokeniserState.f21730e);
            }
        };
        f21748o = r15;
        ?? r16 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.17
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '!') {
                    aVar.h("<!");
                    aVar.f21770c = TokeniserState.f21756s;
                } else if (d10 == '/') {
                    aVar.e();
                    aVar.f21770c = TokeniserState.f21752q;
                } else {
                    aVar.h("<");
                    c0525a.q();
                    aVar.f21770c = TokeniserState.f21731f;
                }
            }
        };
        f21750p = r16;
        ?? r17 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.18
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                AnonymousClass19 anonymousClass19 = TokeniserState.f21754r;
                AnonymousClass6 anonymousClass6 = TokeniserState.f21731f;
                if (c0525a.o()) {
                    aVar.d(false);
                    aVar.f21770c = anonymousClass19;
                } else {
                    aVar.h("</");
                    aVar.f21770c = anonymousClass6;
                }
            }
        };
        f21752q = r17;
        ?? r18 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.19
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.c(aVar, c0525a, TokeniserState.f21731f);
            }
        };
        f21754r = r18;
        ?? r19 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.20
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (!c0525a.m('-')) {
                    aVar.f21770c = TokeniserState.f21731f;
                } else {
                    aVar.f('-');
                    aVar.a(TokeniserState.f21757t);
                }
            }
        };
        f21756s = r19;
        ?? r20 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.21
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (!c0525a.m('-')) {
                    aVar.f21770c = TokeniserState.f21731f;
                } else {
                    aVar.f('-');
                    aVar.a(TokeniserState.f21762w);
                }
            }
        };
        f21757t = r20;
        ?? r21 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.22
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.j()) {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                    return;
                }
                char i9 = c0525a.i();
                if (i9 == 0) {
                    aVar.m(this);
                    c0525a.a();
                    aVar.f((char) 65533);
                } else if (i9 == '-') {
                    aVar.f('-');
                    aVar.a(TokeniserState.f21761v);
                } else if (i9 != '<') {
                    aVar.h(c0525a.g('-', '<', 0));
                } else {
                    aVar.a(TokeniserState.f21763x);
                }
            }
        };
        f21759u = r21;
        ?? r222 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.23
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.j()) {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                    return;
                }
                char d10 = c0525a.d();
                AnonymousClass22 anonymousClass22 = TokeniserState.f21759u;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.f21770c = anonymousClass22;
                } else if (d10 == '-') {
                    aVar.f(d10);
                    aVar.f21770c = TokeniserState.f21762w;
                } else if (d10 == '<') {
                    aVar.f21770c = TokeniserState.f21763x;
                } else {
                    aVar.f(d10);
                    aVar.f21770c = anonymousClass22;
                }
            }
        };
        f21761v = r222;
        ?? r23 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.24
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.j()) {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                    return;
                }
                char d10 = c0525a.d();
                AnonymousClass22 anonymousClass22 = TokeniserState.f21759u;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.f21770c = anonymousClass22;
                } else {
                    if (d10 == '-') {
                        aVar.f(d10);
                        return;
                    }
                    if (d10 == '<') {
                        aVar.f21770c = TokeniserState.f21763x;
                    } else if (d10 != '>') {
                        aVar.f(d10);
                        aVar.f21770c = anonymousClass22;
                    } else {
                        aVar.f(d10);
                        aVar.f21770c = TokeniserState.f21731f;
                    }
                }
            }
        };
        f21762w = r23;
        ?? r24 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.25
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.o()) {
                    aVar.e();
                    aVar.f21775h.append(c0525a.i());
                    aVar.h("<" + c0525a.i());
                    aVar.a(TokeniserState.f21704A);
                    return;
                }
                if (c0525a.m('/')) {
                    aVar.e();
                    aVar.a(TokeniserState.f21764y);
                } else {
                    aVar.f('<');
                    aVar.f21770c = TokeniserState.f21759u;
                }
            }
        };
        f21763x = r24;
        ?? r25 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.26
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (!c0525a.o()) {
                    aVar.h("</");
                    aVar.f21770c = TokeniserState.f21759u;
                    return;
                }
                aVar.d(false);
                Token.h hVar = aVar.i;
                char i9 = c0525a.i();
                hVar.getClass();
                hVar.g(String.valueOf(i9));
                aVar.f21775h.append(c0525a.i());
                aVar.a(TokeniserState.f21765z);
            }
        };
        f21764y = r25;
        ?? r26 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.27
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.c(aVar, c0525a, TokeniserState.f21759u);
            }
        };
        f21765z = r26;
        ?? r27 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.28
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.d(aVar, c0525a, TokeniserState.f21705B, TokeniserState.f21759u);
            }
        };
        f21704A = r27;
        ?? r28 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.29
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char i9 = c0525a.i();
                if (i9 == 0) {
                    aVar.m(this);
                    c0525a.a();
                    aVar.f((char) 65533);
                } else if (i9 == '-') {
                    aVar.f(i9);
                    aVar.a(TokeniserState.f21706C);
                } else if (i9 == '<') {
                    aVar.f(i9);
                    aVar.a(TokeniserState.f21708E);
                } else if (i9 != 65535) {
                    aVar.h(c0525a.g('-', '<', 0));
                } else {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21705B = r28;
        ?? r29 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.30
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass29 anonymousClass29 = TokeniserState.f21705B;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.f21770c = anonymousClass29;
                } else if (d10 == '-') {
                    aVar.f(d10);
                    aVar.f21770c = TokeniserState.f21707D;
                } else if (d10 == '<') {
                    aVar.f(d10);
                    aVar.f21770c = TokeniserState.f21708E;
                } else if (d10 != 65535) {
                    aVar.f(d10);
                    aVar.f21770c = anonymousClass29;
                } else {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21706C = r29;
        ?? r30 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.31
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass29 anonymousClass29 = TokeniserState.f21705B;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f((char) 65533);
                    aVar.f21770c = anonymousClass29;
                    return;
                }
                if (d10 == '-') {
                    aVar.f(d10);
                    return;
                }
                if (d10 == '<') {
                    aVar.f(d10);
                    aVar.f21770c = TokeniserState.f21708E;
                } else if (d10 == '>') {
                    aVar.f(d10);
                    aVar.f21770c = TokeniserState.f21731f;
                } else if (d10 != 65535) {
                    aVar.f(d10);
                    aVar.f21770c = anonymousClass29;
                } else {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21707D = r30;
        ?? r31 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.32
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (!c0525a.m('/')) {
                    aVar.f21770c = TokeniserState.f21705B;
                    return;
                }
                aVar.f('/');
                aVar.e();
                aVar.a(TokeniserState.f21709F);
            }
        };
        f21708E = r31;
        ?? r322 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.33
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                TokeniserState.d(aVar, c0525a, TokeniserState.f21759u, TokeniserState.f21705B);
            }
        };
        f21709F = r322;
        ?? r33 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.34
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass35 anonymousClass35 = TokeniserState.f21711H;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.i();
                    c0525a.q();
                    aVar.f21770c = anonymousClass35;
                    return;
                }
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '\'') {
                        if (d10 == '/') {
                            aVar.f21770c = TokeniserState.f21718O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                        if (d10 == 65535) {
                            aVar.l(this);
                            aVar.f21770c = anonymousClass1;
                            return;
                        }
                        if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r') {
                            return;
                        }
                        switch (d10) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                aVar.k();
                                aVar.f21770c = anonymousClass1;
                                break;
                            default:
                                aVar.i.i();
                                c0525a.q();
                                aVar.f21770c = anonymousClass35;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.i();
                    aVar.i.c(d10);
                    aVar.f21770c = anonymousClass35;
                }
            }
        };
        f21710G = r33;
        ?? r34 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.35
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                String h9 = c0525a.h(TokeniserState.f21755r0);
                Token.h hVar = aVar.i;
                String str = hVar.f21698d;
                if (str != null) {
                    h9 = str.concat(h9);
                }
                hVar.f21698d = h9;
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.c((char) 65533);
                    return;
                }
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '\'') {
                        if (d10 == '/') {
                            aVar.f21770c = TokeniserState.f21718O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                        if (d10 == 65535) {
                            aVar.l(this);
                            aVar.f21770c = anonymousClass1;
                            return;
                        }
                        if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                            switch (d10) {
                                case '<':
                                    break;
                                case '=':
                                    aVar.f21770c = TokeniserState.f21713J;
                                    break;
                                case '>':
                                    aVar.k();
                                    aVar.f21770c = anonymousClass1;
                                    break;
                                default:
                                    aVar.i.c(d10);
                                    break;
                            }
                            return;
                        }
                    }
                    aVar.m(this);
                    aVar.i.c(d10);
                    return;
                }
                aVar.f21770c = TokeniserState.f21712I;
            }
        };
        f21711H = r34;
        ?? r35 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.36
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass35 anonymousClass35 = TokeniserState.f21711H;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.c((char) 65533);
                    aVar.f21770c = anonymousClass35;
                    return;
                }
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '\'') {
                        if (d10 == '/') {
                            aVar.f21770c = TokeniserState.f21718O;
                            return;
                        }
                        AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                        if (d10 == 65535) {
                            aVar.l(this);
                            aVar.f21770c = anonymousClass1;
                            return;
                        }
                        if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r') {
                            return;
                        }
                        switch (d10) {
                            case '<':
                                break;
                            case '=':
                                aVar.f21770c = TokeniserState.f21713J;
                                break;
                            case '>':
                                aVar.k();
                                aVar.f21770c = anonymousClass1;
                                break;
                            default:
                                aVar.i.i();
                                c0525a.q();
                                aVar.f21770c = anonymousClass35;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.i();
                    aVar.i.c(d10);
                    aVar.f21770c = anonymousClass35;
                }
            }
        };
        f21712I = r35;
        ?? r36 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.37
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass40 anonymousClass40 = TokeniserState.f21716M;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.d((char) 65533);
                    aVar.f21770c = anonymousClass40;
                    return;
                }
                if (d10 != ' ') {
                    if (d10 == '\"') {
                        aVar.f21770c = TokeniserState.f21714K;
                        return;
                    }
                    if (d10 != '`') {
                        AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                        if (d10 == 65535) {
                            aVar.l(this);
                            aVar.k();
                            aVar.f21770c = anonymousClass1;
                            return;
                        }
                        if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r') {
                            return;
                        }
                        if (d10 == '&') {
                            c0525a.q();
                            aVar.f21770c = anonymousClass40;
                            return;
                        }
                        if (d10 == '\'') {
                            aVar.f21770c = TokeniserState.f21715L;
                            return;
                        }
                        switch (d10) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                aVar.m(this);
                                aVar.k();
                                aVar.f21770c = anonymousClass1;
                                break;
                            default:
                                c0525a.q();
                                aVar.f21770c = anonymousClass40;
                                break;
                        }
                        return;
                    }
                    aVar.m(this);
                    aVar.i.d(d10);
                    aVar.f21770c = anonymousClass40;
                }
            }
        };
        f21713J = r36;
        ?? r37 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.38
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                String g10 = c0525a.g(TokeniserState.f21753q0);
                if (g10.length() > 0) {
                    aVar.i.e(g10);
                } else {
                    aVar.i.f21701g = true;
                }
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.d((char) 65533);
                    return;
                }
                if (d10 == '\"') {
                    aVar.f21770c = TokeniserState.f21717N;
                    return;
                }
                if (d10 != '&') {
                    if (d10 != 65535) {
                        aVar.i.d(d10);
                        return;
                    } else {
                        aVar.l(this);
                        aVar.f21770c = TokeniserState.f21722a;
                        return;
                    }
                }
                int[] c2 = aVar.c('\"', true);
                if (c2 != null) {
                    aVar.i.f(c2);
                } else {
                    aVar.i.d('&');
                }
            }
        };
        f21714K = r37;
        ?? r38 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.39
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                String g10 = c0525a.g(TokeniserState.f21751p0);
                if (g10.length() > 0) {
                    aVar.i.e(g10);
                } else {
                    aVar.i.f21701g = true;
                }
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.d((char) 65533);
                    return;
                }
                if (d10 == 65535) {
                    aVar.l(this);
                    aVar.f21770c = TokeniserState.f21722a;
                    return;
                }
                if (d10 != '&') {
                    if (d10 != '\'') {
                        aVar.i.d(d10);
                        return;
                    } else {
                        aVar.f21770c = TokeniserState.f21717N;
                        return;
                    }
                }
                int[] c2 = aVar.c('\'', true);
                if (c2 != null) {
                    aVar.i.f(c2);
                } else {
                    aVar.i.d('&');
                }
            }
        };
        f21715L = r38;
        ?? r39 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.40
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                String h9 = c0525a.h(TokeniserState.s0);
                if (h9.length() > 0) {
                    aVar.i.e(h9);
                }
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.i.d((char) 65533);
                    return;
                }
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '`') {
                        AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                        if (d10 == 65535) {
                            aVar.l(this);
                            aVar.f21770c = anonymousClass1;
                            return;
                        }
                        if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                            if (d10 == '&') {
                                int[] c2 = aVar.c('>', true);
                                if (c2 != null) {
                                    aVar.i.f(c2);
                                    return;
                                } else {
                                    aVar.i.d('&');
                                    return;
                                }
                            }
                            if (d10 != '\'') {
                                switch (d10) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        aVar.k();
                                        aVar.f21770c = anonymousClass1;
                                        break;
                                    default:
                                        aVar.i.d(d10);
                                        break;
                                }
                                return;
                            }
                        }
                    }
                    aVar.m(this);
                    aVar.i.d(d10);
                    return;
                }
                aVar.f21770c = TokeniserState.f21710G;
            }
        };
        f21716M = r39;
        ?? r40 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.41
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass34 anonymousClass34 = TokeniserState.f21710G;
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    aVar.f21770c = anonymousClass34;
                    return;
                }
                if (d10 == '/') {
                    aVar.f21770c = TokeniserState.f21718O;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.k();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 == 65535) {
                    aVar.l(this);
                    aVar.f21770c = anonymousClass1;
                } else {
                    aVar.m(this);
                    c0525a.q();
                    aVar.f21770c = anonymousClass34;
                }
            }
        };
        f21717N = r40;
        ?? r41 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.42
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.i.i = true;
                    aVar.k();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 == 65535) {
                    aVar.l(this);
                    aVar.f21770c = anonymousClass1;
                } else {
                    aVar.m(this);
                    c0525a.q();
                    aVar.f21770c = TokeniserState.f21710G;
                }
            }
        };
        f21718O = r41;
        ?? r422 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.43
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                c0525a.q();
                Token.c cVar = new Token.c();
                cVar.f21692b.append(c0525a.f('>'));
                aVar.g(cVar);
                aVar.a(TokeniserState.f21722a);
            }
        };
        f21719P = r422;
        ?? r43 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.44
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.k("--")) {
                    aVar.f21780n.a();
                    aVar.f21770c = TokeniserState.R;
                } else if (c0525a.l("DOCTYPE")) {
                    aVar.f21770c = TokeniserState.X;
                } else if (c0525a.k("[CDATA[")) {
                    aVar.e();
                    aVar.f21770c = TokeniserState.f21749o0;
                } else {
                    aVar.m(this);
                    aVar.a(TokeniserState.f21719P);
                }
            }
        };
        f21720Q = r43;
        ?? r44 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.45
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21780n.f21692b.append((char) 65533);
                    aVar.f21770c = anonymousClass47;
                    return;
                }
                if (d10 == '-') {
                    aVar.f21770c = TokeniserState.S;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 != 65535) {
                    aVar.f21780n.f21692b.append(d10);
                    aVar.f21770c = anonymousClass47;
                } else {
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        R = r44;
        ?? r45 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.46
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21780n.f21692b.append((char) 65533);
                    aVar.f21770c = anonymousClass47;
                    return;
                }
                if (d10 == '-') {
                    aVar.f21770c = TokeniserState.S;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 != 65535) {
                    aVar.f21780n.f21692b.append(d10);
                    aVar.f21770c = anonymousClass47;
                } else {
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        S = r45;
        ?? r46 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.47
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char i9 = c0525a.i();
                if (i9 == 0) {
                    aVar.m(this);
                    c0525a.a();
                    aVar.f21780n.f21692b.append((char) 65533);
                } else if (i9 == '-') {
                    aVar.a(TokeniserState.U);
                } else {
                    if (i9 != 65535) {
                        aVar.f21780n.f21692b.append(c0525a.g('-', 0));
                        return;
                    }
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        T = r46;
        ?? r47 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.48
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (d10 == 0) {
                    aVar.m(this);
                    StringBuilder sb2 = aVar.f21780n.f21692b;
                    sb2.append('-');
                    sb2.append((char) 65533);
                    aVar.f21770c = anonymousClass47;
                    return;
                }
                if (d10 == '-') {
                    aVar.f21770c = TokeniserState.V;
                    return;
                }
                if (d10 == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = TokeniserState.f21722a;
                } else {
                    StringBuilder sb3 = aVar.f21780n.f21692b;
                    sb3.append('-');
                    sb3.append(d10);
                    aVar.f21770c = anonymousClass47;
                }
            }
        };
        U = r47;
        ?? r48 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.49
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (d10 == 0) {
                    aVar.m(this);
                    StringBuilder sb2 = aVar.f21780n.f21692b;
                    sb2.append("--");
                    sb2.append((char) 65533);
                    aVar.f21770c = anonymousClass47;
                    return;
                }
                if (d10 == '!') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.W;
                    return;
                }
                if (d10 == '-') {
                    aVar.m(this);
                    aVar.f21780n.f21692b.append('-');
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else {
                    aVar.m(this);
                    StringBuilder sb3 = aVar.f21780n.f21692b;
                    sb3.append("--");
                    sb3.append(d10);
                    aVar.f21770c = anonymousClass47;
                }
            }
        };
        V = r48;
        ?? r49 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.50
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass47 anonymousClass47 = TokeniserState.T;
                if (d10 == 0) {
                    aVar.m(this);
                    StringBuilder sb2 = aVar.f21780n.f21692b;
                    sb2.append("--!");
                    sb2.append((char) 65533);
                    aVar.f21770c = anonymousClass47;
                    return;
                }
                if (d10 == '-') {
                    aVar.f21780n.f21692b.append("--!");
                    aVar.f21770c = TokeniserState.U;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 == 65535) {
                    aVar.l(this);
                    aVar.i();
                    aVar.f21770c = anonymousClass1;
                } else {
                    StringBuilder sb3 = aVar.f21780n.f21692b;
                    sb3.append("--!");
                    sb3.append(d10);
                    aVar.f21770c = anonymousClass47;
                }
            }
        };
        W = r49;
        ?? r50 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.51
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass52 anonymousClass52 = TokeniserState.Y;
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    aVar.f21770c = anonymousClass52;
                    return;
                }
                if (d10 != '>') {
                    if (d10 != 65535) {
                        aVar.m(this);
                        aVar.f21770c = anonymousClass52;
                        return;
                    }
                    aVar.l(this);
                }
                aVar.m(this);
                aVar.f21779m.a();
                aVar.f21779m.getClass();
                aVar.j();
                aVar.f21770c = TokeniserState.f21722a;
            }
        };
        X = r50;
        ?? r51 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.52
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                boolean o10 = c0525a.o();
                AnonymousClass53 anonymousClass53 = TokeniserState.f21721Z;
                if (o10) {
                    aVar.f21779m.a();
                    aVar.f21770c = anonymousClass53;
                    return;
                }
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.a();
                    aVar.f21779m.f21693b.append((char) 65533);
                    aVar.f21770c = anonymousClass53;
                    return;
                }
                if (d10 != ' ') {
                    if (d10 == 65535) {
                        aVar.l(this);
                        aVar.f21779m.a();
                        aVar.f21779m.getClass();
                        aVar.j();
                        aVar.f21770c = TokeniserState.f21722a;
                        return;
                    }
                    if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r') {
                        return;
                    }
                    aVar.f21779m.a();
                    aVar.f21779m.f21693b.append(d10);
                    aVar.f21770c = anonymousClass53;
                }
            }
        };
        Y = r51;
        ?? r522 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.53
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                if (c0525a.o()) {
                    aVar.f21779m.f21693b.append(c0525a.e());
                    return;
                }
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.f21693b.append((char) 65533);
                    return;
                }
                if (d10 != ' ') {
                    AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                    if (d10 == '>') {
                        aVar.j();
                        aVar.f21770c = anonymousClass1;
                        return;
                    }
                    if (d10 == 65535) {
                        aVar.l(this);
                        aVar.f21779m.getClass();
                        aVar.j();
                        aVar.f21770c = anonymousClass1;
                        return;
                    }
                    if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                        aVar.f21779m.f21693b.append(d10);
                        return;
                    }
                }
                aVar.f21770c = TokeniserState.f21723a0;
            }
        };
        f21721Z = r522;
        ?? r53 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.54
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                boolean j10 = c0525a.j();
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (j10) {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (c0525a.n('\t', '\n', '\r', '\f', ' ')) {
                    c0525a.a();
                    return;
                }
                if (c0525a.m('>')) {
                    aVar.j();
                    aVar.a(anonymousClass1);
                    return;
                }
                if (c0525a.l("PUBLIC")) {
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21725b0;
                } else if (c0525a.l("SYSTEM")) {
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21737i0;
                } else {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.a(TokeniserState.f21747n0);
                }
            }
        };
        f21723a0 = r53;
        ?? r54 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.55
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    aVar.f21770c = TokeniserState.f21727c0;
                    return;
                }
                if (d10 == '\"') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21729d0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21732f0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21725b0 = r54;
        ?? r55 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.56
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    return;
                }
                if (d10 == '\"') {
                    aVar.f21770c = TokeniserState.f21729d0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.f21770c = TokeniserState.f21732f0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21727c0 = r55;
        ?? r56 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.57
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.f21694c.append((char) 65533);
                    return;
                }
                if (d10 == '\"') {
                    aVar.f21770c = TokeniserState.f21734g0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.f21779m.f21694c.append(d10);
                    return;
                }
                aVar.l(this);
                aVar.f21779m.getClass();
                aVar.j();
                aVar.f21770c = anonymousClass1;
            }
        };
        f21729d0 = r56;
        ?? r57 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.58
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.f21694c.append((char) 65533);
                    return;
                }
                if (d10 == '\'') {
                    aVar.f21770c = TokeniserState.f21734g0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.f21779m.f21694c.append(d10);
                    return;
                }
                aVar.l(this);
                aVar.f21779m.getClass();
                aVar.j();
                aVar.f21770c = anonymousClass1;
            }
        };
        f21732f0 = r57;
        ?? r58 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.59
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    aVar.f21770c = TokeniserState.f21736h0;
                    return;
                }
                if (d10 == '\"') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21741k0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21743l0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21734g0 = r58;
        ?? r59 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.60
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    return;
                }
                if (d10 == '\"') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21741k0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21743l0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21736h0 = r59;
        ?? r60 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.61
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    aVar.f21770c = TokeniserState.f21739j0;
                    return;
                }
                if (d10 == '\"') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21741k0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21743l0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21737i0 = r60;
        ?? r61 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.62
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    return;
                }
                if (d10 == '\"') {
                    aVar.f21770c = TokeniserState.f21741k0;
                    return;
                }
                if (d10 == '\'') {
                    aVar.f21770c = TokeniserState.f21743l0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21739j0 = r61;
        ?? r62 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.63
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.f21695d.append((char) 65533);
                    return;
                }
                if (d10 == '\"') {
                    aVar.f21770c = TokeniserState.f21745m0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.f21779m.f21695d.append(d10);
                    return;
                }
                aVar.l(this);
                aVar.f21779m.getClass();
                aVar.j();
                aVar.f21770c = anonymousClass1;
            }
        };
        f21741k0 = r62;
        ?? r63 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.64
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == 0) {
                    aVar.m(this);
                    aVar.f21779m.f21695d.append((char) 65533);
                    return;
                }
                if (d10 == '\'') {
                    aVar.f21770c = TokeniserState.f21745m0;
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.m(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                    return;
                }
                if (d10 != 65535) {
                    aVar.f21779m.f21695d.append(d10);
                    return;
                }
                aVar.l(this);
                aVar.f21779m.getClass();
                aVar.j();
                aVar.f21770c = anonymousClass1;
            }
        };
        f21743l0 = r63;
        ?? r64 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.65
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                    return;
                }
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                } else if (d10 != 65535) {
                    aVar.m(this);
                    aVar.f21770c = TokeniserState.f21747n0;
                } else {
                    aVar.l(this);
                    aVar.f21779m.getClass();
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21745m0 = r64;
        ?? r65 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.66
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                char d10 = c0525a.d();
                AnonymousClass1 anonymousClass1 = TokeniserState.f21722a;
                if (d10 == '>') {
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                } else {
                    if (d10 != 65535) {
                        return;
                    }
                    aVar.j();
                    aVar.f21770c = anonymousClass1;
                }
            }
        };
        f21747n0 = r65;
        ?? r66 = new TokeniserState() { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.67
            @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
            public final void e(a aVar, C0525a c0525a) {
                String c2;
                int p10 = c0525a.p("]]>");
                String[] strArr = c0525a.f4495h;
                char[] cArr = c0525a.f4488a;
                if (p10 != -1) {
                    c2 = C0525a.c(cArr, strArr, c0525a.f4492e, p10);
                    c0525a.f4492e += p10;
                } else {
                    c0525a.b();
                    int i9 = c0525a.f4492e;
                    c2 = C0525a.c(cArr, strArr, i9, c0525a.f4490c - i9);
                    c0525a.f4492e = c0525a.f4490c;
                }
                aVar.f21775h.append(c2);
                if (c0525a.k("]]>") || c0525a.j()) {
                    String sb2 = aVar.f21775h.toString();
                    Token.a aVar2 = new Token.a();
                    aVar2.f21691b = sb2;
                    aVar.g(aVar2);
                    aVar.f21770c = TokeniserState.f21722a;
                }
            }
        };
        f21749o0 = r66;
        f21760u0 = new TokeniserState[]{r02, r12, r22, r32, r42, r52, tokeniserState, r72, r8, r92, r10, r11, r122, r13, r14, r15, r16, r17, r18, r19, r20, r21, r222, r23, r24, r25, r26, r27, r28, r29, r30, r31, r322, r33, r34, r35, r36, r37, r38, r39, r40, r41, r422, r43, r44, r45, r46, r47, r48, r49, r50, r51, r522, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66};
        f21751p0 = new char[]{0, '&', '\''};
        f21753q0 = new char[]{0, '\"', '&'};
        f21755r0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        s0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f21758t0 = String.valueOf((char) 65533);
    }

    public TokeniserState() {
        throw null;
    }

    public static void a(a aVar, C0525a c0525a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char i9 = c0525a.i();
        if (i9 == 0) {
            aVar.m(tokeniserState);
            c0525a.a();
            aVar.f((char) 65533);
        } else if (i9 == '<') {
            aVar.a(tokeniserState2);
        } else if (i9 != 65535) {
            aVar.h(c0525a.g('<', 0));
        } else {
            aVar.g(new Token.e());
        }
    }

    public static void c(a aVar, C0525a c0525a, TokeniserState tokeniserState) {
        if (c0525a.o()) {
            String e10 = c0525a.e();
            aVar.i.g(e10);
            aVar.f21775h.append(e10);
            return;
        }
        boolean n10 = aVar.n();
        StringBuilder sb2 = aVar.f21775h;
        if (n10 && !c0525a.j()) {
            char d10 = c0525a.d();
            if (d10 == '\t' || d10 == '\n' || d10 == '\f' || d10 == '\r' || d10 == ' ') {
                aVar.f21770c = f21710G;
                return;
            }
            if (d10 == '/') {
                aVar.f21770c = f21718O;
                return;
            } else {
                if (d10 == '>') {
                    aVar.k();
                    aVar.f21770c = f21722a;
                    return;
                }
                sb2.append(d10);
            }
        }
        aVar.h("</" + sb2.toString());
        aVar.f21770c = tokeniserState;
    }

    public static void d(a aVar, C0525a c0525a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (c0525a.o()) {
            String e10 = c0525a.e();
            aVar.f21775h.append(e10);
            aVar.h(e10);
            return;
        }
        char d10 = c0525a.d();
        if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ' && d10 != '/' && d10 != '>') {
            c0525a.q();
            aVar.f21770c = tokeniserState2;
        } else {
            if (aVar.f21775h.toString().equals("script")) {
                aVar.f21770c = tokeniserState;
            } else {
                aVar.f21770c = tokeniserState2;
            }
            aVar.f(d10);
        }
    }

    public static TokeniserState valueOf(String str) {
        return (TokeniserState) Enum.valueOf(TokeniserState.class, str);
    }

    public static TokeniserState[] values() {
        return (TokeniserState[]) f21760u0.clone();
    }

    public abstract void e(a aVar, C0525a c0525a);
}
