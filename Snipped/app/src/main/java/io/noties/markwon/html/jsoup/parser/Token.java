package io.noties.markwon.html.jsoup.parser;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class Token {

    /* renamed from: a, reason: collision with root package name */
    public final TokenType f21683a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {

        /* renamed from: a, reason: collision with root package name */
        public static final TokenType f21684a;

        /* renamed from: b, reason: collision with root package name */
        public static final TokenType f21685b;

        /* renamed from: c, reason: collision with root package name */
        public static final TokenType f21686c;

        /* renamed from: d, reason: collision with root package name */
        public static final TokenType f21687d;

        /* renamed from: e, reason: collision with root package name */
        public static final TokenType f21688e;

        /* renamed from: f, reason: collision with root package name */
        public static final TokenType f21689f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ TokenType[] f21690g;

        static {
            TokenType tokenType = new TokenType("Doctype", 0);
            f21684a = tokenType;
            TokenType tokenType2 = new TokenType("StartTag", 1);
            f21685b = tokenType2;
            TokenType tokenType3 = new TokenType("EndTag", 2);
            f21686c = tokenType3;
            TokenType tokenType4 = new TokenType("Comment", 3);
            f21687d = tokenType4;
            TokenType tokenType5 = new TokenType("Character", 4);
            f21688e = tokenType5;
            TokenType tokenType6 = new TokenType("EOF", 5);
            f21689f = tokenType6;
            f21690g = new TokenType[]{tokenType, tokenType2, tokenType3, tokenType4, tokenType5, tokenType6};
        }

        public TokenType() {
            throw null;
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) f21690g.clone();
        }
    }

    public static final class a extends b {
        @Override // io.noties.markwon.html.jsoup.parser.Token.b
        public final String toString() {
            return androidx.camera.core.impl.utils.a.n(new StringBuilder("<![CDATA["), this.f21691b, "]]>");
        }
    }

    public static class b extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f21691b;

        public b() {
            super(TokenType.f21688e);
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            this.f21691b = null;
            return this;
        }

        public String toString() {
            return this.f21691b;
        }
    }

    public static final class c extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f21692b;

        public c() {
            super(TokenType.f21687d);
            this.f21692b = new StringBuilder();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            Token.b(this.f21692b);
            return this;
        }

        public final String toString() {
            return "<!--" + this.f21692b.toString() + "-->";
        }
    }

    public static final class d extends Token {

        /* renamed from: b, reason: collision with root package name */
        public final StringBuilder f21693b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f21694c;

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f21695d;

        public d() {
            super(TokenType.f21684a);
            this.f21693b = new StringBuilder();
            this.f21694c = new StringBuilder();
            this.f21695d = new StringBuilder();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            Token.b(this.f21693b);
            Token.b(this.f21694c);
            Token.b(this.f21695d);
            return this;
        }
    }

    public static final class f extends h {
        public f() {
            super(TokenType.f21686c);
        }

        public final String toString() {
            return "</" + h() + ">";
        }
    }

    public static final class g extends h {
        public g() {
            super(TokenType.f21685b);
            this.f21703j = new Z8.b();
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token.h, io.noties.markwon.html.jsoup.parser.Token
        public final /* bridge */ /* synthetic */ Token a() {
            a();
            return this;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token.h
        /* renamed from: j */
        public final h a() {
            super.a();
            this.f21703j = new Z8.b();
            return this;
        }

        public final String toString() {
            Z8.b bVar = this.f21703j;
            if (bVar == null || bVar.f4238a <= 0) {
                return "<" + h() + ">";
            }
            return "<" + h() + " " + this.f21703j.toString() + ">";
        }
    }

    public static abstract class h extends Token {

        /* renamed from: b, reason: collision with root package name */
        public String f21696b;

        /* renamed from: c, reason: collision with root package name */
        public String f21697c;

        /* renamed from: d, reason: collision with root package name */
        public String f21698d;

        /* renamed from: e, reason: collision with root package name */
        public final StringBuilder f21699e;

        /* renamed from: f, reason: collision with root package name */
        public String f21700f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f21701g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f21702h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public Z8.b f21703j;

        public h(TokenType tokenType) {
            super(tokenType);
            this.f21699e = new StringBuilder();
            this.f21701g = false;
            this.f21702h = false;
            this.i = false;
        }

        public final void c(char c2) {
            String valueOf = String.valueOf(c2);
            String str = this.f21698d;
            if (str != null) {
                valueOf = str.concat(valueOf);
            }
            this.f21698d = valueOf;
        }

        public final void d(char c2) {
            this.f21702h = true;
            String str = this.f21700f;
            if (str != null) {
                this.f21699e.append(str);
                this.f21700f = null;
            }
            this.f21699e.append(c2);
        }

        public final void e(String str) {
            this.f21702h = true;
            String str2 = this.f21700f;
            if (str2 != null) {
                this.f21699e.append(str2);
                this.f21700f = null;
            }
            StringBuilder sb2 = this.f21699e;
            if (sb2.length() == 0) {
                this.f21700f = str;
            } else {
                sb2.append(str);
            }
        }

        public final void f(int[] iArr) {
            this.f21702h = true;
            String str = this.f21700f;
            if (str != null) {
                this.f21699e.append(str);
                this.f21700f = null;
            }
            for (int i : iArr) {
                this.f21699e.appendCodePoint(i);
            }
        }

        public final void g(String str) {
            String str2 = this.f21696b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f21696b = str;
            this.f21697c = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
        }

        public final String h() {
            String str = this.f21696b;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.f21696b;
        }

        public final void i() {
            if (this.f21703j == null) {
                this.f21703j = new Z8.b();
            }
            String str = this.f21698d;
            StringBuilder sb2 = this.f21699e;
            if (str != null) {
                String trim = str.trim();
                this.f21698d = trim;
                if (trim.length() > 0) {
                    String sb3 = this.f21702h ? sb2.length() > 0 ? sb2.toString() : this.f21700f : this.f21701g ? "" : null;
                    Z8.b bVar = this.f21703j;
                    String str2 = this.f21698d;
                    int a10 = bVar.a(str2);
                    if (a10 != -1) {
                        bVar.f4240c[a10] = sb3;
                    } else {
                        int i = bVar.f4238a;
                        int i9 = i + 1;
                        if (i9 < i) {
                            throw new IllegalArgumentException("Must be true");
                        }
                        String[] strArr = bVar.f4239b;
                        int length = strArr.length;
                        if (length < i9) {
                            int i10 = length >= 4 ? i * 2 : 4;
                            if (i9 <= i10) {
                                i9 = i10;
                            }
                            String[] strArr2 = new String[i9];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i9));
                            bVar.f4239b = strArr2;
                            String[] strArr3 = bVar.f4240c;
                            String[] strArr4 = new String[i9];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i9));
                            bVar.f4240c = strArr4;
                        }
                        String[] strArr5 = bVar.f4239b;
                        int i11 = bVar.f4238a;
                        strArr5[i11] = str2;
                        bVar.f4240c[i11] = sb3;
                        bVar.f4238a = i11 + 1;
                    }
                }
            }
            this.f21698d = null;
            this.f21701g = false;
            this.f21702h = false;
            Token.b(sb2);
            this.f21700f = null;
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public h a() {
            this.f21696b = null;
            this.f21697c = null;
            this.f21698d = null;
            Token.b(this.f21699e);
            this.f21700f = null;
            this.f21701g = false;
            this.f21702h = false;
            this.i = false;
            this.f21703j = null;
            return this;
        }
    }

    public Token(TokenType tokenType) {
        this.f21683a = tokenType;
    }

    public static void b(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public abstract Token a();

    public static final class e extends Token {
        public e() {
            super(TokenType.f21689f);
        }

        @Override // io.noties.markwon.html.jsoup.parser.Token
        public final Token a() {
            return this;
        }
    }
}
