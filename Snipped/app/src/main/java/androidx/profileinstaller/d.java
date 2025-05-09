package androidx.profileinstaller;

import C.v;
import com.sumsub.sns.internal.core.data.model.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;

/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7389a = {ISO7816.INS_MANAGE_CHANNEL, 114, ISOFileInfo.FCI_BYTE, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7390b = {ISO7816.INS_MANAGE_CHANNEL, 114, 109, 0};

    public static byte[] a(Z0.b[] bVarArr, byte[] bArr) {
        int i = 0;
        int i9 = 0;
        for (Z0.b bVar : bVarArr) {
            i9 += ((((bVar.f4168g * 2) + 7) & (-8)) / 8) + (bVar.f4166e * 2) + b(bVar.f4162a, bArr, bVar.f4163b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f4167f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, Z0.f.f4177c)) {
            int length = bVarArr.length;
            while (i < length) {
                Z0.b bVar2 = bVarArr[i];
                l(byteArrayOutputStream, bVar2, b(bVar2.f4162a, bArr, bVar2.f4163b));
                k(byteArrayOutputStream, bVar2);
                i++;
            }
        } else {
            for (Z0.b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bVar3.f4162a, bArr, bVar3.f4163b));
            }
            int length2 = bVarArr.length;
            while (i < length2) {
                k(byteArrayOutputStream, bVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static String b(String str, byte[] bArr, String str2) {
        byte[] bArr2 = Z0.f.f4179e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = Z0.f.f4178d;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? p.f15541a : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(p.f15541a, "!") : p.f15541a.equals(obj) ? str2.replace("!", p.f15541a) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(p.f15541a)) {
            return "!".equals(obj) ? str2.replace(p.f15541a, "!") : p.f15541a.equals(obj) ? str2.replace("!", p.f15541a) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return androidx.camera.core.impl.utils.a.n(v.s(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? p.f15541a : "!", str2);
    }

    public static int c(int i, int i9, int i10) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i9;
        }
        if (i == 4) {
            return i9 + i10;
        }
        throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Unexpected flag: "));
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 += (int) U4.b.z(byteArrayInputStream, 2);
            iArr[i10] = i9;
        }
        return iArr;
    }

    public static Z0.b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, Z0.b[] bVarArr) {
        byte[] bArr3 = Z0.f.f4180f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, Z0.f.f4181g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int z10 = (int) U4.b.z(fileInputStream, 2);
            byte[] x9 = U4.b.x(fileInputStream, (int) U4.b.z(fileInputStream, 4), (int) U4.b.z(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x9);
            try {
                Z0.b[] g10 = g(byteArrayInputStream, bArr2, z10, bVarArr);
                byteArrayInputStream.close();
                return g10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(Z0.f.f4175a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int z11 = (int) U4.b.z(fileInputStream, 1);
        byte[] x10 = U4.b.x(fileInputStream, (int) U4.b.z(fileInputStream, 4), (int) U4.b.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(x10);
        try {
            Z0.b[] f10 = f(byteArrayInputStream2, z11, bVarArr);
            byteArrayInputStream2.close();
            return f10;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static Z0.b[] f(ByteArrayInputStream byteArrayInputStream, int i, Z0.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new Z0.b[0];
        }
        if (i != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i9 = 0; i9 < i; i9++) {
            int z10 = (int) U4.b.z(byteArrayInputStream, 2);
            iArr[i9] = (int) U4.b.z(byteArrayInputStream, 2);
            strArr[i9] = new String(U4.b.v(byteArrayInputStream, z10), StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i; i10++) {
            Z0.b bVar = bVarArr[i10];
            if (!bVar.f4163b.equals(strArr[i10])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            bVar.f4166e = i11;
            bVar.f4169h = d(byteArrayInputStream, i11);
        }
        return bVarArr;
    }

    public static Z0.b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, Z0.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new Z0.b[0];
        }
        if (i != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i; i9++) {
            U4.b.z(byteArrayInputStream, 2);
            String str = new String(U4.b.v(byteArrayInputStream, (int) U4.b.z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long z10 = U4.b.z(byteArrayInputStream, 4);
            int z11 = (int) U4.b.z(byteArrayInputStream, 2);
            Z0.b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(p.f15541a);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i10 = 0;
                while (true) {
                    if (i10 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i10].f4163b.equals(substring)) {
                        bVar = bVarArr[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f4165d = z10;
            int[] d10 = d(byteArrayInputStream, z11);
            if (Arrays.equals(bArr, Z0.f.f4179e)) {
                bVar.f4166e = z11;
                bVar.f4169h = d10;
            }
        }
        return bVarArr;
    }

    public static Z0.b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, Z0.f.f4176b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int z10 = (int) U4.b.z(fileInputStream, 1);
        byte[] x9 = U4.b.x(fileInputStream, (int) U4.b.z(fileInputStream, 4), (int) U4.b.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x9);
        try {
            Z0.b[] i = i(byteArrayInputStream, str, z10);
            byteArrayInputStream.close();
            return i;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Z0.b[] i(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new Z0.b[0];
        }
        Z0.b[] bVarArr = new Z0.b[i];
        for (int i9 = 0; i9 < i; i9++) {
            int z10 = (int) U4.b.z(byteArrayInputStream, 2);
            int z11 = (int) U4.b.z(byteArrayInputStream, 2);
            bVarArr[i9] = new Z0.b(str, new String(U4.b.v(byteArrayInputStream, z10), StandardCharsets.UTF_8), U4.b.z(byteArrayInputStream, 4), z11, (int) U4.b.z(byteArrayInputStream, 4), (int) U4.b.z(byteArrayInputStream, 4), new int[z11], new TreeMap());
        }
        for (int i10 = 0; i10 < i; i10++) {
            Z0.b bVar = bVarArr[i10];
            int available = byteArrayInputStream.available() - bVar.f4167f;
            int i11 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.i;
                if (available2 <= available) {
                    break;
                }
                i11 += (int) U4.b.z(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                for (int z12 = (int) U4.b.z(byteArrayInputStream, 2); z12 > 0; z12--) {
                    U4.b.z(byteArrayInputStream, 2);
                    int z13 = (int) U4.b.z(byteArrayInputStream, 1);
                    if (z13 != 6 && z13 != 7) {
                        while (z13 > 0) {
                            U4.b.z(byteArrayInputStream, 1);
                            for (int z14 = (int) U4.b.z(byteArrayInputStream, 1); z14 > 0; z14--) {
                                U4.b.z(byteArrayInputStream, 2);
                            }
                            z13--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f4169h = d(byteArrayInputStream, bVar.f4166e);
            int i12 = bVar.f4168g;
            BitSet valueOf = BitSet.valueOf(U4.b.v(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = valueOf.get(c(2, i13, i12)) ? 2 : 0;
                if (valueOf.get(c(4, i13, i12))) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, Z0.b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = Z0.f.f4175a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = Z0.f.f4176b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a10 = a(bVarArr, bArr3);
                U4.b.M(byteArrayOutputStream, bVarArr.length, 1);
                U4.b.M(byteArrayOutputStream, a10.length, 4);
                byte[] e10 = U4.b.e(a10);
                U4.b.M(byteArrayOutputStream, e10.length, 4);
                byteArrayOutputStream.write(e10);
                return true;
            }
            byte[] bArr4 = Z0.f.f4178d;
            if (Arrays.equals(bArr, bArr4)) {
                U4.b.M(byteArrayOutputStream, bVarArr.length, 1);
                for (Z0.b bVar : bVarArr) {
                    int size = bVar.i.size() * 4;
                    String b9 = b(bVar.f4162a, bArr4, bVar.f4163b);
                    Charset charset = StandardCharsets.UTF_8;
                    U4.b.N(byteArrayOutputStream, b9.getBytes(charset).length);
                    U4.b.N(byteArrayOutputStream, bVar.f4169h.length);
                    U4.b.M(byteArrayOutputStream, size, 4);
                    U4.b.M(byteArrayOutputStream, bVar.f4164c, 4);
                    byteArrayOutputStream.write(b9.getBytes(charset));
                    Iterator<Integer> it = bVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        U4.b.N(byteArrayOutputStream, it.next().intValue());
                        U4.b.N(byteArrayOutputStream, 0);
                    }
                    for (int i9 : bVar.f4169h) {
                        U4.b.N(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = Z0.f.f4177c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a11 = a(bVarArr, bArr5);
                U4.b.M(byteArrayOutputStream, bVarArr.length, 1);
                U4.b.M(byteArrayOutputStream, a11.length, 4);
                byte[] e11 = U4.b.e(a11);
                U4.b.M(byteArrayOutputStream, e11.length, 4);
                byteArrayOutputStream.write(e11);
                return true;
            }
            byte[] bArr6 = Z0.f.f4179e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            U4.b.N(byteArrayOutputStream, bVarArr.length);
            for (Z0.b bVar2 : bVarArr) {
                String b10 = b(bVar2.f4162a, bArr6, bVar2.f4163b);
                Charset charset2 = StandardCharsets.UTF_8;
                U4.b.N(byteArrayOutputStream, b10.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = bVar2.i;
                U4.b.N(byteArrayOutputStream, treeMap.size());
                U4.b.N(byteArrayOutputStream, bVar2.f4169h.length);
                U4.b.M(byteArrayOutputStream, bVar2.f4164c, 4);
                byteArrayOutputStream.write(b10.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    U4.b.N(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i10 : bVar2.f4169h) {
                    U4.b.N(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            U4.b.N(byteArrayOutputStream2, bVarArr.length);
            int i11 = 2;
            int i12 = 2;
            for (Z0.b bVar3 : bVarArr) {
                U4.b.M(byteArrayOutputStream2, bVar3.f4164c, 4);
                U4.b.M(byteArrayOutputStream2, bVar3.f4165d, 4);
                U4.b.M(byteArrayOutputStream2, bVar3.f4168g, 4);
                String b11 = b(bVar3.f4162a, bArr2, bVar3.f4163b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b11.getBytes(charset3).length;
                U4.b.N(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(b11.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < bVarArr.length) {
                try {
                    Z0.b bVar4 = bVarArr[i13];
                    U4.b.N(byteArrayOutputStream3, i13);
                    U4.b.N(byteArrayOutputStream3, bVar4.f4166e);
                    i14 = i14 + 4 + (bVar4.f4166e * 2);
                    int[] iArr = bVar4.f4169h;
                    int length3 = iArr.length;
                    int i15 = i;
                    int i16 = i15;
                    while (i15 < length3) {
                        int i17 = iArr[i15];
                        U4.b.N(byteArrayOutputStream3, i17 - i16);
                        i15++;
                        i16 = i17;
                    }
                    i13++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    Z0.b bVar5 = bVarArr[i18];
                    Iterator<Map.Entry<Integer, Integer>> it3 = bVar5.i.entrySet().iterator();
                    int i20 = 0;
                    while (it3.hasNext()) {
                        i20 |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream4, i20, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            U4.b.N(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + i11 + byteArray4.length;
                            int i21 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            U4.b.M(byteArrayOutputStream3, length4, 4);
                            U4.b.N(byteArrayOutputStream3, i20);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i21 + length4;
                            i18++;
                            arrayList3 = arrayList4;
                            i11 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            U4.b.M(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i22);
                U4.b.M(byteArrayOutputStream, fVar4.f7398a.f7378a, 4);
                U4.b.M(byteArrayOutputStream, size2, 4);
                boolean z10 = fVar4.f7400c;
                byte[] bArr7 = fVar4.f7399b;
                if (z10) {
                    long length5 = bArr7.length;
                    byte[] e12 = U4.b.e(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(e12);
                    U4.b.M(byteArrayOutputStream, e12.length, 4);
                    U4.b.M(byteArrayOutputStream, length5, 4);
                    length = e12.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    U4.b.M(byteArrayOutputStream, bArr7.length, 4);
                    U4.b.M(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, Z0.b bVar) {
        n(byteArrayOutputStream, bVar);
        int[] iArr = bVar.f4169h;
        int length = iArr.length;
        int i = 0;
        int i9 = 0;
        while (i < length) {
            int i10 = iArr[i];
            U4.b.N(byteArrayOutputStream, i10 - i9);
            i++;
            i9 = i10;
        }
        int i11 = bVar.f4168g;
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                int c2 = c(2, intValue, i11);
                int i12 = c2 / 8;
                bArr[i12] = (byte) ((1 << (c2 % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int c10 = c(4, intValue, i11);
                int i13 = c10 / 8;
                bArr[i13] = (byte) ((1 << (c10 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, Z0.b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        U4.b.N(byteArrayOutputStream, str.getBytes(charset).length);
        U4.b.N(byteArrayOutputStream, bVar.f4166e);
        U4.b.M(byteArrayOutputStream, bVar.f4167f, 4);
        U4.b.M(byteArrayOutputStream, bVar.f4164c, 4);
        U4.b.M(byteArrayOutputStream, bVar.f4168g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, int i, Z0.b bVar) {
        int bitCount = Integer.bitCount(i & (-2));
        int i9 = bVar.f4168g;
        byte[] bArr = new byte[(((bitCount * i9) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i) != 0) {
                    if ((i11 & intValue2) == i11) {
                        int i12 = (i10 * i9) + intValue;
                        int i13 = i12 / 8;
                        bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
                    }
                    i10++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, Z0.b bVar) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                U4.b.N(byteArrayOutputStream, intValue - i);
                U4.b.N(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
