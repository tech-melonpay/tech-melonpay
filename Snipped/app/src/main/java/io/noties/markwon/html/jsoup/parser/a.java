package io.noties.markwon.html.jsoup.parser;

import Z8.c;
import a9.C0525a;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Tokeniser.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f21766r;

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f21767s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    public final C0525a f21768a;

    /* renamed from: b, reason: collision with root package name */
    public final ParseErrorList f21769b;

    /* renamed from: d, reason: collision with root package name */
    public Token f21771d;
    public Token.h i;

    /* renamed from: o, reason: collision with root package name */
    public String f21781o;

    /* renamed from: c, reason: collision with root package name */
    public TokeniserState f21770c = TokeniserState.f21722a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21772e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f21773f = null;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f21774g = new StringBuilder(1024);

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f21775h = new StringBuilder(1024);

    /* renamed from: j, reason: collision with root package name */
    public final Token.g f21776j = new Token.g();

    /* renamed from: k, reason: collision with root package name */
    public final Token.f f21777k = new Token.f();

    /* renamed from: l, reason: collision with root package name */
    public final Token.b f21778l = new Token.b();

    /* renamed from: m, reason: collision with root package name */
    public final Token.d f21779m = new Token.d();

    /* renamed from: n, reason: collision with root package name */
    public final Token.c f21780n = new Token.c();

    /* renamed from: p, reason: collision with root package name */
    public final int[] f21782p = new int[1];

    /* renamed from: q, reason: collision with root package name */
    public final int[] f21783q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f21766r = cArr;
        Arrays.sort(cArr);
    }

    public a(C0525a c0525a, ParseErrorList parseErrorList) {
        this.f21768a = c0525a;
        this.f21769b = parseErrorList;
    }

    public final void a(TokeniserState tokeniserState) {
        this.f21768a.a();
        this.f21770c = tokeniserState;
    }

    public final void b(String str) {
        ParseErrorList parseErrorList = this.f21769b;
        if (parseErrorList.size() < parseErrorList.f21682a) {
            C0525a c0525a = this.f21768a;
            parseErrorList.add(new Na.a(c0525a.f4493f + c0525a.f4492e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    public final int[] c(Character ch, boolean z10) {
        int i;
        char c2;
        int i9;
        char c10;
        char c11;
        char c12;
        int i10;
        String c13;
        char c14;
        int i11;
        int i12;
        char c15;
        C0525a c0525a = this.f21768a;
        if (c0525a.j()) {
            return null;
        }
        if (ch != null && ch.charValue() == c0525a.i()) {
            return null;
        }
        char[] cArr = f21766r;
        c0525a.b();
        boolean j10 = c0525a.j();
        char[] cArr2 = c0525a.f4488a;
        if (!j10 && Arrays.binarySearch(cArr, cArr2[c0525a.f4492e]) >= 0) {
            return null;
        }
        c0525a.f4494g = c0525a.f4492e;
        boolean k3 = c0525a.k("#");
        String[] strArr = c0525a.f4495h;
        char c16 = 'A';
        int[] iArr = this.f21782p;
        if (k3) {
            boolean l10 = c0525a.l("X");
            if (l10) {
                c0525a.b();
                int i13 = c0525a.f4492e;
                while (true) {
                    i12 = c0525a.f4492e;
                    if (i12 >= c0525a.f4490c || (((c15 = cArr2[i12]) < '0' || c15 > '9') && ((c15 < c16 || c15 > 'F') && (c15 < 'a' || c15 > 'f')))) {
                        break;
                    }
                    c0525a.f4492e = i12 + 1;
                    c16 = 'A';
                }
                c13 = C0525a.c(cArr2, strArr, i13, i12 - i13);
            } else {
                c0525a.b();
                int i14 = c0525a.f4492e;
                while (true) {
                    i10 = c0525a.f4492e;
                    if (i10 >= c0525a.f4490c || (c14 = cArr2[i10]) < '0' || c14 > '9') {
                        break;
                    }
                    c0525a.f4492e = i10 + 1;
                }
                c13 = C0525a.c(cArr2, strArr, i14, i10 - i14);
            }
            if (c13.length() == 0) {
                b("numeric reference with no numerals");
                c0525a.f4492e = c0525a.f4494g;
                return null;
            }
            if (!c0525a.k(";")) {
                b("missing semicolon");
            }
            try {
                i11 = Integer.valueOf(c13, l10 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i11 = -1;
            }
            if (i11 == -1 || ((i11 >= 55296 && i11 <= 57343) || i11 > 1114111)) {
                b("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (i11 >= 128 && i11 < 160) {
                b("character is not a valid unicode code point");
                i11 = f21767s[i11 - 128];
            }
            iArr[0] = i11;
            return iArr;
        }
        c0525a.b();
        int i15 = c0525a.f4492e;
        while (true) {
            int i16 = c0525a.f4492e;
            if (i16 >= c0525a.f4490c || (((c12 = cArr2[i16]) < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !Character.isLetter(c12)))) {
                break;
            }
            c0525a.f4492e++;
        }
        while (true) {
            i = c0525a.f4492e;
            if (i < c0525a.f4490c && (c11 = cArr2[i]) >= '0' && c11 <= '9') {
                c0525a.f4492e = i + 1;
            }
        }
        String c17 = C0525a.c(cArr2, strArr, i15, i - i15);
        boolean m2 = c0525a.m(';');
        Map<String, String> map = c.f4243a;
        if (!map.containsKey(c17) || !m2) {
            c0525a.f4492e = c0525a.f4494g;
            if (!m2) {
                return null;
            }
            b("invalid named referenece '" + c17 + "'");
            return null;
        }
        if (z10 && (c0525a.o() || ((!c0525a.j() && (c10 = cArr2[c0525a.f4492e]) >= '0' && c10 <= '9') || c0525a.n('=', '-', '_')))) {
            c0525a.f4492e = c0525a.f4494g;
            return null;
        }
        if (!c0525a.k(";")) {
            b("missing semicolon");
        }
        String str = map.get(c17);
        int[] iArr2 = this.f21783q;
        if (str != null) {
            i9 = str.length();
            if (i9 == 1) {
                c2 = 0;
                iArr2[0] = str.charAt(0);
            } else {
                c2 = 0;
                iArr2[0] = str.charAt(0);
                iArr2[1] = str.charAt(1);
            }
        } else {
            c2 = 0;
            i9 = 0;
        }
        if (i9 == 1) {
            iArr[c2] = iArr2[c2];
            return iArr;
        }
        if (i9 == 2) {
            return iArr2;
        }
        throw new IllegalArgumentException("Unexpected characters returned for ".concat(c17));
    }

    public final Token.h d(boolean z10) {
        Token.h hVar;
        if (z10) {
            hVar = this.f21776j;
            hVar.a();
        } else {
            hVar = this.f21777k;
            hVar.a();
        }
        this.i = hVar;
        return hVar;
    }

    public final void e() {
        Token.b(this.f21775h);
    }

    public final void f(char c2) {
        h(String.valueOf(c2));
    }

    public final void g(Token token) {
        if (this.f21772e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f21771d = token;
        this.f21772e = true;
        Token.TokenType tokenType = token.f21683a;
        if (tokenType == Token.TokenType.f21685b) {
            this.f21781o = ((Token.g) token).f21696b;
            return;
        }
        if (tokenType != Token.TokenType.f21686c || ((Token.f) token).f21703j == null) {
            return;
        }
        ParseErrorList parseErrorList = this.f21769b;
        if (parseErrorList.size() < parseErrorList.f21682a) {
            C0525a c0525a = this.f21768a;
            int i = c0525a.f4493f + c0525a.f4492e;
            Na.a aVar = new Na.a(1, (char) 0);
            aVar.f2858b = i;
            aVar.f2859c = "Attributes incorrectly present on end tag";
            parseErrorList.add(aVar);
        }
    }

    public final void h(String str) {
        if (this.f21773f == null) {
            this.f21773f = str;
            return;
        }
        StringBuilder sb2 = this.f21774g;
        if (sb2.length() == 0) {
            sb2.append(this.f21773f);
        }
        sb2.append(str);
    }

    public final void i() {
        g(this.f21780n);
    }

    public final void j() {
        g(this.f21779m);
    }

    public final void k() {
        Token.h hVar = this.i;
        if (hVar.f21698d != null) {
            hVar.i();
        }
        g(this.i);
    }

    public final void l(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.f21769b;
        if (parseErrorList.size() < parseErrorList.f21682a) {
            C0525a c0525a = this.f21768a;
            parseErrorList.add(new Na.a(c0525a.f4493f + c0525a.f4492e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{tokeniserState}));
        }
    }

    public final void m(TokeniserState tokeniserState) {
        ParseErrorList parseErrorList = this.f21769b;
        if (parseErrorList.size() < parseErrorList.f21682a) {
            C0525a c0525a = this.f21768a;
            parseErrorList.add(new Na.a(c0525a.f4493f + c0525a.f4492e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c0525a.i()), tokeniserState}));
        }
    }

    public final boolean n() {
        return this.f21781o != null && this.i.h().equalsIgnoreCase(this.f21781o);
    }

    public final Token o() {
        while (!this.f21772e) {
            this.f21770c.e(this, this.f21768a);
        }
        StringBuilder sb2 = this.f21774g;
        int length = sb2.length();
        Token.b bVar = this.f21778l;
        if (length > 0) {
            String sb3 = sb2.toString();
            sb2.delete(0, sb2.length());
            this.f21773f = null;
            bVar.f21691b = sb3;
            return bVar;
        }
        String str = this.f21773f;
        if (str == null) {
            this.f21772e = false;
            return this.f21771d;
        }
        bVar.f21691b = str;
        this.f21773f = null;
        return bVar;
    }
}
