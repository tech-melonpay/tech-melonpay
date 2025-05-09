package j3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.MalformedJsonException;
import ha.C0806e;
import ia.InterfaceC0835c;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt__SerializersKt;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import na.C1082f;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jmrtd.lds.iso19794.IrisImageInfo;
import qa.InterfaceC1142b;
import qa.InterfaceC1145e;
import r3.C1149a;
import ra.AbstractC1167b;
import ra.C1164C;
import ra.C1169d;
import ra.K;
import ra.a0;
import ra.f0;
import ra.g0;

/* compiled from: AesUtil.java */
/* loaded from: classes.dex */
public class e implements m3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22479a;

    public /* synthetic */ e(int i) {
        this.f22479a = i;
    }

    public static BigDecimal A(String str) {
        d(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static final InterfaceC1078b B(Y8.a aVar, ia.k kVar) {
        InterfaceC1078b<Object> a10 = SerializersKt__SerializersKt.a(aVar, kVar, true);
        if (a10 != null) {
            return a10;
        }
        String d10 = a0.g(kVar).d();
        if (d10 == null) {
            d10 = "<local class name not available>";
        }
        throw new SerializationException(androidx.camera.core.n.a("Serializer for class '", d10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final InterfaceC1078b C(Y8.a aVar, Type type) {
        InterfaceC1078b<Object> c2 = C1082f.c(aVar, type, true);
        if (c2 != null) {
            return c2;
        }
        String d10 = kotlin.jvm.internal.h.a(C1082f.a(type)).d();
        if (d10 == null) {
            d10 = "<local class name not available>";
        }
        throw new SerializationException(androidx.camera.core.n.a("Serializer for class '", d10, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final InterfaceC1078b D(InterfaceC0835c interfaceC0835c) {
        InterfaceC1078b<? extends Object> d10 = a0.d(((kotlin.jvm.internal.a) interfaceC0835c).g(), (InterfaceC1078b[]) Arrays.copyOf(new InterfaceC1078b[0], 0));
        if (d10 == null) {
            d10 = f0.f26394a.get(interfaceC0835c);
        }
        if (d10 != null) {
            return d10;
        }
        String d11 = interfaceC0835c.d();
        if (d11 == null) {
            d11 = "<local class name not available>";
        }
        throw new SerializationException(androidx.camera.core.n.a("Serializer for class '", d11, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final ArrayList E(Y8.a aVar, List list, boolean z10) {
        ArrayList arrayList;
        if (z10) {
            List list2 = list;
            arrayList = new ArrayList(P9.n.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(B(aVar, (ia.k) it.next()));
            }
        } else {
            List list3 = list;
            arrayList = new ArrayList(P9.n.u(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                InterfaceC1078b<Object> a10 = SerializersKt__SerializersKt.a(aVar, (ia.k) it2.next(), false);
                if (a10 == null) {
                    return null;
                }
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public static String F(char c2) {
        String valueOf = String.valueOf(c2);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(locale);
    }

    public static void G(byte[] bArr, long j10, int i) {
        int i9 = 0;
        while (i9 < 4) {
            bArr[i + i9] = (byte) (255 & j10);
            i9++;
            j10 >>= 8;
        }
    }

    public static final O9.i H(String str) {
        int i;
        e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.f.c(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i10 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i9, i10) > 0) {
                if (i10 == 119304647) {
                    i10 = Integer.divideUnsigned(-1, 10);
                    if (Integer.compareUnsigned(i9, i10) > 0) {
                    }
                }
                return null;
            }
            int i11 = i9 * 10;
            int i12 = digit + i11;
            if (Integer.compareUnsigned(i12, i11) < 0) {
                return null;
            }
            i++;
            i9 = i12;
        }
        return new O9.i(i9);
    }

    public static final O9.k I(String str) {
        e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.f.c(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j10 = 10;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j11, j12) > 0) {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                j12 = Long.divideUnsigned(-1L, j10);
                if (Long.compareUnsigned(j11, j12) > 0) {
                    return null;
                }
            }
            long j13 = j11 * j10;
            long j14 = (digit & BodyPartID.bodyIdMax) + j13;
            if (Long.compareUnsigned(j14, j13) < 0) {
                return null;
            }
            i++;
            j11 = j14;
        }
        return new O9.k(j11);
    }

    public static void J(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    public static final void K(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i9 = 0; i9 < i; i9++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] L(byte[] bArr, int i, byte[] bArr2, int i9, int i10) {
        if (i10 < 0 || bArr.length - i10 < i || bArr2.length - i10 < i9) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr3[i11] = (byte) (bArr[i11 + i] ^ bArr2[i11 + i9]);
        }
        return bArr3;
    }

    public static final byte[] M(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return L(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void b(StringBuilder sb2, Object obj, InterfaceC0646l interfaceC0646l) {
        if (interfaceC0646l != null) {
            sb2.append((CharSequence) interfaceC0646l.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static void e(int i) {
        if (2 > i || i >= 37) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("radix ", i, " was not in valid range ");
            l10.append(new C0806e(2, 36, 1));
            throw new IllegalArgumentException(l10.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r2 == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r6, java.lang.String r7) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L15
            goto L84
        L15:
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            r0 = 0
            if (r7 != 0) goto L1f
        L1c:
            r3 = r0
            goto L84
        L1f:
            if (r2 != 0) goto L31
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L84
            int r4 = r2.length
            if (r4 > 0) goto L2f
            goto L84
        L2f:
            r2 = r2[r0]
        L31:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L75
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L75
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L6a
            java.lang.Object r3 = r6.getSystemService(r5)
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3
            int r4 = android.os.Binder.getCallingUid()
            if (r3 != 0) goto L57
            r2 = 1
            goto L5b
        L57:
            int r2 = r3.checkOpNoThrow(r7, r4, r2)
        L5b:
            if (r2 == 0) goto L5e
            goto L7f
        L5e:
            java.lang.String r6 = j0.C0878g.a(r6)
            if (r3 != 0) goto L65
            goto L82
        L65:
            int r2 = r3.checkOpNoThrow(r7, r1, r6)
            goto L7f
        L6a:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
            goto L7f
        L75:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
        L7f:
            if (r2 != 0) goto L82
            goto L1c
        L82:
            r6 = -2
            r3 = r6
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.f(android.content.Context, java.lang.String):int");
    }

    public static byte[] g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b9 = 0;
        long v10 = v(0, bArr) & 67108863;
        long v11 = (v(3, bArr) >> 2) & 67108611;
        long v12 = (v(6, bArr) >> 4) & 67092735;
        long v13 = (v(9, bArr) >> 6) & 66076671;
        long v14 = (v(12, bArr) >> 8) & 1048575;
        long j10 = v11 * 5;
        long j11 = v12 * 5;
        long j12 = v13 * 5;
        long j13 = v14 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i9 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i9 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i9);
            System.arraycopy(bArr2, i9, bArr3, b9, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i, b9);
            }
            long v15 = j18 + (v(b9, bArr3) & 67108863);
            long v16 = j14 + ((v(3, bArr3) >> 2) & 67108863);
            long v17 = j15 + ((v(6, bArr3) >> 4) & 67108863);
            long v18 = j16 + ((v(9, bArr3) >> 6) & 67108863);
            long v19 = j17 + (((v(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j19 = (v19 * j10) + (v18 * j11) + (v17 * j12) + (v16 * j13) + (v15 * v10);
            long j20 = (v19 * j11) + (v18 * j12) + (v17 * j13) + (v16 * v10) + (v15 * v11);
            long j21 = (v19 * j12) + (v18 * j13) + (v17 * v10) + (v16 * v11) + (v15 * v12);
            long j22 = (v19 * j13) + (v18 * v10) + (v17 * v11) + (v16 * v12) + (v15 * v13);
            long j23 = v18 * v11;
            long j24 = v19 * v10;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (v17 * v12) + (v16 * v13) + (v15 * v14) + (j27 >> 26);
            long j29 = j28 >> 26;
            j17 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            long j31 = j30 & 67108863;
            j14 = (j25 & 67108863) + (j30 >> 26);
            i9 += 16;
            j15 = j26 & 67108863;
            j16 = j27 & 67108863;
            b9 = 0;
            i = 17;
            j18 = j31;
        }
        long j32 = j15 + (j14 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j16 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j17 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = ((j36 >> 26) * 5) + j18;
        long j39 = j38 >> 26;
        long j40 = j38 & 67108863;
        long j41 = (j14 & 67108863) + j39;
        long j42 = j40 + 5;
        long j43 = j42 & 67108863;
        long j44 = j41 + (j42 >> 26);
        long j45 = j33 + (j44 >> 26);
        long j46 = j35 + (j45 >> 26);
        long j47 = (j37 + (j46 >> 26)) - 67108864;
        long j48 = j47 >> 63;
        long j49 = ~j48;
        long j50 = (j41 & j48) | (j44 & 67108863 & j49);
        long j51 = (j33 & j48) | (j45 & 67108863 & j49);
        long j52 = (j35 & j48) | (j46 & 67108863 & j49);
        long j53 = ((j40 & j48) | (j43 & j49) | (j50 << 26)) & BodyPartID.bodyIdMax;
        long j54 = ((j50 >> 6) | (j51 << 20)) & BodyPartID.bodyIdMax;
        long j55 = ((j51 >> 12) | (j52 << 14)) & BodyPartID.bodyIdMax;
        long j56 = ((((j47 & j49) | (j37 & j48)) << 8) | (j52 >> 18)) & BodyPartID.bodyIdMax;
        long v20 = v(16, bArr) + j53;
        long j57 = v20 & BodyPartID.bodyIdMax;
        long v21 = v(20, bArr) + j54 + (v20 >> 32);
        long j58 = v21 & BodyPartID.bodyIdMax;
        long v22 = v(24, bArr) + j55 + (v21 >> 32);
        long j59 = v22 & BodyPartID.bodyIdMax;
        long v23 = (v(28, bArr) + j56 + (v22 >> 32)) & BodyPartID.bodyIdMax;
        byte[] bArr4 = new byte[16];
        G(bArr4, j57, 0);
        G(bArr4, j58, 4);
        G(bArr4, j59, 8);
        G(bArr4, v23, 12);
        return bArr4;
    }

    public static byte[] h(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i9 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
            i9 += bArr4.length;
        }
        return bArr3;
    }

    public static String i(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static void j(String str, String str2, Object obj) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    public static byte[] k(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b9 = (byte) ((bArr[i] << 1) & IrisImageInfo.IMAGE_QUAL_UNDEF);
            bArr2[i] = b9;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b9);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i9 = i * 2;
            int digit = Character.digit(str.charAt(i9), 16);
            int digit2 = Character.digit(str.charAt(i9 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static int m(char c2) {
        int digit = Character.digit((int) c2, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
    }

    public static String n(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            int i = b9 & 255;
            sb2.append("0123456789abcdef".charAt(i / 16));
            sb2.append("0123456789abcdef".charAt(i % 16));
        }
        return sb2.toString();
    }

    public static final boolean o(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            i |= bArr[i9] ^ bArr2[i9];
        }
        return i == 0;
    }

    public static boolean p(char c2, char c10, boolean z10) {
        if (c2 == c10) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View q(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View findViewById = viewGroup.getChildAt(i9).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final InterfaceC1077a r(AbstractC1167b abstractC1167b, InterfaceC1142b interfaceC1142b, String str) {
        InterfaceC1077a a10 = abstractC1167b.a(interfaceC1142b, str);
        if (a10 != null) {
            return a10;
        }
        a0.i(abstractC1167b.c(), str);
        throw null;
    }

    public static final InterfaceC1081e s(AbstractC1167b abstractC1167b, InterfaceC1145e interfaceC1145e, Object obj) {
        InterfaceC1081e b9 = abstractC1167b.b(interfaceC1145e, obj);
        if (b9 != null) {
            return b9;
        }
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(obj.getClass());
        InterfaceC0835c c2 = abstractC1167b.c();
        String d10 = a10.d();
        if (d10 == null) {
            d10 = String.valueOf(a10);
        }
        a0.i(c2, d10);
        throw null;
    }

    public static boolean t() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean u(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static long v(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & BodyPartID.bodyIdMax;
    }

    public static fb.a w(InterfaceC0646l interfaceC0646l) {
        fb.a aVar = new fb.a(false);
        interfaceC0646l.invoke(aVar);
        return aVar;
    }

    public static void x(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof m.f0) {
                editorInfo.hintText = ((m.f0) parent).getHint();
                return;
            }
        }
    }

    public static final InterfaceC1078b y(InterfaceC0835c interfaceC0835c, ArrayList arrayList, InterfaceC0635a interfaceC0635a) {
        InterfaceC1078b c1169d;
        InterfaceC1078b g0Var;
        if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Collection.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(List.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(List.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(ArrayList.class))) {
            c1169d = new C1169d((InterfaceC1078b) arrayList.get(0), 0);
        } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(HashSet.class))) {
            c1169d = new C1169d((InterfaceC1078b) arrayList.get(0), 1);
        } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Set.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Set.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(LinkedHashSet.class))) {
            c1169d = new C1169d((InterfaceC1078b) arrayList.get(0), 2);
        } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(HashMap.class))) {
            c1169d = new C1164C((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
        } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Map.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Map.class)) || kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(LinkedHashMap.class))) {
            c1169d = new K((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
        } else {
            if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Map.Entry.class))) {
                g0Var = new MapEntrySerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
            } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Pair.class))) {
                g0Var = new PairSerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
            } else if (kotlin.jvm.internal.f.b(interfaceC0835c, kotlin.jvm.internal.h.a(Triple.class))) {
                c1169d = new TripleSerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1), (InterfaceC1078b) arrayList.get(2));
            } else if (((kotlin.jvm.internal.a) interfaceC0835c).g().isArray()) {
                g0Var = new g0((InterfaceC0835c) interfaceC0635a.invoke(), (InterfaceC1078b) arrayList.get(0));
            } else {
                c1169d = null;
            }
            c1169d = g0Var;
        }
        if (c1169d != null) {
            return c1169d;
        }
        InterfaceC1078b[] interfaceC1078bArr = (InterfaceC1078b[]) arrayList.toArray(new InterfaceC1078b[0]);
        InterfaceC1078b[] interfaceC1078bArr2 = (InterfaceC1078b[]) Arrays.copyOf(interfaceC1078bArr, interfaceC1078bArr.length);
        return a0.d(((kotlin.jvm.internal.a) interfaceC0835c).g(), (InterfaceC1078b[]) Arrays.copyOf(interfaceC1078bArr2, interfaceC1078bArr2.length));
    }

    public static com.google.gson.l z(C1149a c1149a) {
        boolean z10;
        try {
            try {
                c1149a.k0();
                z10 = false;
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            } catch (NumberFormatException e12) {
                throw new JsonSyntaxException(e12);
            }
        } catch (EOFException e13) {
            e = e13;
            z10 = true;
        }
        try {
            return (com.google.gson.l) n3.p.f24174B.a(c1149a);
        } catch (EOFException e14) {
            e = e14;
            if (z10) {
                return com.google.gson.m.f10407a;
            }
            throw new JsonSyntaxException(e);
        }
    }

    @Override // m3.i
    public Object a() {
        switch (this.f22479a) {
            case 13:
                return new TreeSet();
            case 14:
                return new LinkedHashSet();
            case 15:
                return new ArrayDeque();
            case 16:
                return new ArrayList();
            case 17:
                return new ConcurrentSkipListMap();
            case 18:
                return new ConcurrentHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new LinkedHashMap();
            default:
                return new LinkedTreeMap();
        }
    }
}
