package com.google.android.gms.common.server.response;

import C.v;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import s3.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = r0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = r0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L55
            if (r2 != 0) goto L53
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r2 = r0
            goto L5d
        L55:
            r6 = 92
            if (r5 != r6) goto L53
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zao) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.zao[0])) {
            if (bufferedReader.read(this.zao) == -1) {
                return (char) 0;
            }
        }
        return this.zao[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) {
        int i;
        int i9;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException("No number to parse");
        }
        char c2 = cArr[0];
        int i10 = c2 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i11 = c2 == '-' ? 1 : 0;
        if (i11 < zam2) {
            i9 = i11 + 1;
            int digit = Character.digit(cArr[i11], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i = -digit;
        } else {
            i = 0;
            i9 = i11;
        }
        while (i9 < zam2) {
            int i12 = i9 + 1;
            int digit2 = Character.digit(cArr[i9], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i < -214748364) {
                throw new ParseException("Number too large");
            }
            int i13 = i * 10;
            if (i13 < i10 + digit2) {
                throw new ParseException("Number too large");
            }
            i = i13 - digit2;
            i9 = i12;
        }
        if (i11 == 0) {
            return -i;
        }
        if (i9 > 1) {
            return i;
        }
        throw new ParseException("No digits to parse");
    }

    private final int zam(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char zai2 = zai(bufferedReader);
        if (zai2 == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (zai2 == ',') {
            throw new ParseException("Missing value");
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zai2 == '\"') {
            i = 0;
            boolean z10 = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (Character.isISOControl(c2)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c2 == '\"') {
                    if (!z10) {
                        bufferedReader.reset();
                        bufferedReader.skip(i + 1);
                        return i;
                    }
                } else if (c2 == '\\') {
                    z10 = !z10;
                    i++;
                }
                z10 = false;
                i++;
            }
        } else {
            cArr[0] = zai2;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c10 = cArr[i];
                if (c10 == '}' || c10 == ',' || Character.isWhitespace(c10) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) {
        long j10;
        int i;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new ParseException("No number to parse");
        }
        char c2 = cArr[0];
        long j11 = c2 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i9 = c2 == '-' ? 1 : 0;
        if (i9 < zam2) {
            i = i9 + 1;
            int digit = Character.digit(cArr[i9], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j10 = -digit;
        } else {
            j10 = 0;
            i = i9;
        }
        while (i < zam2) {
            int i10 = i + 1;
            int digit2 = Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j10 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j12 = j10 * 10;
            int i11 = zam2;
            long j13 = digit2;
            if (j12 < j11 + j13) {
                throw new ParseException("Number too large");
            }
            j10 = j12 - j13;
            zam2 = i11;
            i = i10;
        }
        if (i9 == 0) {
            return -j10;
        }
        if (i > 1) {
            return j10;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, char[] cArr2) {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            return zaA(bufferedReader, cArr, sb2, cArr2);
        }
        if (zai2 != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    private final String zaq(BufferedReader bufferedReader) {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (zai2 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + zai2);
    }

    private final String zar(BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i = 1;
        if (zai2 == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c2 = this.zao[0];
            boolean z10 = false;
            do {
                if (c2 == '\"') {
                    if (z10) {
                        c2 = '\"';
                        z10 = true;
                    }
                }
                z10 = c2 == '\\' ? !z10 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c2 = this.zao[0];
            } while (!Character.isISOControl(c2));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (zai2 == ',') {
            throw new ParseException("Missing value");
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z11 = false;
                boolean z12 = false;
                while (i > 0) {
                    char zai3 = zai(bufferedReader);
                    if (zai3 == 0) {
                        throw new ParseException("Unexpected EOF while parsing array");
                    }
                    if (Character.isISOControl(zai3)) {
                        throw new ParseException("Unexpected control character while reading array");
                    }
                    if (zai3 == '\"') {
                        if (!z12) {
                            z11 = !z11;
                        }
                        zai3 = '\"';
                    }
                    if (zai3 == '[') {
                        if (!z11) {
                            i++;
                        }
                        zai3 = '[';
                    }
                    if (zai3 == ']' && !z11) {
                        i--;
                    }
                    z12 = (zai3 == '\\' && z11) ? !z12 : false;
                }
                zaw(5);
            }
        } else if (zai2 != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char zai4 = zai(bufferedReader);
            if (zai4 == '}') {
                zaw(1);
            } else {
                if (zai4 != '\"') {
                    throw new ParseException("Unexpected token " + zai4);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (zai5 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + zai5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (zai3 != ',') {
                if (zai3 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) {
        ArrayList arrayList = new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (zai2 != '{') {
            throw new ParseException("Unexpected token: " + zai2);
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return arrayList;
                }
                arrayList.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + zai3);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e10) {
                throw new ParseException("Error instantiating inner object", e10);
            } catch (InstantiationException e11) {
                throw new ParseException("Error instantiating inner object", e11);
            }
        }
    }

    private final void zaw(int i) {
        if (this.zat.isEmpty()) {
            throw new ParseException(b.i("Expected state ", i, " but had empty stack"));
        }
        int intValue = ((Integer) this.zat.pop()).intValue();
        if (intValue != i) {
            throw new ParseException(v.k(i, intValue, "Expected state ", " but had "));
        }
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i);
            if (read == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i9 = 0; i9 < read; i9++) {
                if (cArr[i9 + i] != this.zap[i9]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z10) {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z10) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (zai2 == 'f') {
            zax(bufferedReader, z10 ? zae : zad);
            return false;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (zai2 == 't') {
            zax(bufferedReader, z10 ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + zai2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0251 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zaz(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t3) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new ParseException("No data to parse");
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t3.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t3.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        throw new ParseException("Unexpected token: " + zai2);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t3);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e10) {
                throw new ParseException(e10);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
