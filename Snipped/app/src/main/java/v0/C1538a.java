package v0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import v0.e;

/* compiled from: BidiFormatter.java */
/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f30510d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30511e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1538a f30512f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1538a f30513g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30515b;

    /* renamed from: c, reason: collision with root package name */
    public final d f30516c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public static class C0474a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f30517e = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f30518a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30519b;

        /* renamed from: c, reason: collision with root package name */
        public int f30520c;

        /* renamed from: d, reason: collision with root package name */
        public char f30521d;

        static {
            for (int i = 0; i < 1792; i++) {
                f30517e[i] = Character.getDirectionality(i);
            }
        }

        public C0474a(CharSequence charSequence) {
            this.f30518a = charSequence;
            this.f30519b = charSequence.length();
        }

        public final byte a() {
            int i = this.f30520c - 1;
            CharSequence charSequence = this.f30518a;
            char charAt = charSequence.charAt(i);
            this.f30521d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f30520c);
                this.f30520c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f30520c--;
            char c2 = this.f30521d;
            return c2 < 1792 ? f30517e[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        e.d dVar = e.f30528c;
        f30510d = Character.toString((char) 8206);
        f30511e = Character.toString((char) 8207);
        f30512f = new C1538a(false, 2, dVar);
        f30513g = new C1538a(true, 2, dVar);
    }

    public C1538a(boolean z10, int i, e.d dVar) {
        this.f30514a = z10;
        this.f30515b = i;
        this.f30516c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f30520c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            v0.a$a r0 = new v0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f30520c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f30520c
            int r5 = r0.f30519b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f30518a
            char r4 = r5.charAt(r4)
            r0.f30521d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f30520c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f30520c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f30520c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f30520c
            int r4 = r4 + r6
            r0.f30520c = r4
            char r4 = r0.f30521d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = v0.C1538a.C0474a.f30517e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = r6
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = r7
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f30520c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1538a.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r7) {
        /*
            v0.a$a r0 = new v0.a$a
            r0.<init>(r7)
            int r7 = r0.f30519b
            r0.f30520c = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f30520c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L35
            r6 = 2
            if (r3 == r6) goto L35
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L31;
                case 15: goto L31;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L2e
        L2c:
            r7 = r5
            goto L41
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r2 != r1) goto L2e
        L33:
            r7 = r4
            goto L41
        L35:
            if (r1 != 0) goto L38
            goto L2c
        L38:
            if (r2 != 0) goto Lc
            goto L40
        L3b:
            if (r1 != 0) goto L3e
            goto L33
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1538a.b(java.lang.CharSequence):int");
    }

    public static C1538a c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f30513g : f30512f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, d dVar) {
        if (charSequence == null) {
            return null;
        }
        boolean b9 = ((e.c) dVar).b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f30515b & 2;
        String str = "";
        String str2 = f30511e;
        String str3 = f30510d;
        boolean z10 = this.f30514a;
        if (i != 0) {
            boolean b10 = (b9 ? e.f30527b : e.f30526a).b(charSequence.length(), charSequence);
            spannableStringBuilder.append((CharSequence) ((z10 || !(b10 || a(charSequence) == 1)) ? (!z10 || (b10 && a(charSequence) != -1)) ? "" : str2 : str3));
        }
        if (b9 != z10) {
            spannableStringBuilder.append(b9 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b11 = (b9 ? e.f30527b : e.f30526a).b(charSequence.length(), charSequence);
        if (!z10 && (b11 || b(charSequence) == 1)) {
            str = str3;
        } else if (z10 && (!b11 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
