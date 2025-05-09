package P9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes2.dex */
public class i {
    public static ListBuilder a(List list) {
        ListBuilder listBuilder = (ListBuilder) list;
        listBuilder.h();
        listBuilder.f23110c = true;
        return listBuilder.f23109b > 0 ? listBuilder : ListBuilder.f23107d;
    }

    public static SetBuilder b(SetBuilder setBuilder) {
        setBuilder.f23148a.c();
        return setBuilder.size() > 0 ? setBuilder : SetBuilder.f23147b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!c((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof O9.h) && (obj2 instanceof O9.h)) {
                    O9.h hVar = (O9.h) obj2;
                    byte[] bArr = ((O9.h) obj).f3018a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = hVar.f3018a;
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof O9.o) && (obj2 instanceof O9.o)) {
                    O9.o oVar = (O9.o) obj2;
                    short[] sArr = ((O9.o) obj).f3031a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    ?? r52 = oVar.f3031a;
                    if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof O9.j) && (obj2 instanceof O9.j)) {
                    O9.j jVar = (O9.j) obj2;
                    int[] iArr = ((O9.j) obj).f3022a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    ?? r53 = jVar.f3022a;
                    if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if ((obj instanceof O9.l) && (obj2 instanceof O9.l)) {
                    O9.l lVar = (O9.l) obj2;
                    long[] jArr = ((O9.l) obj).f3026a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    ?? r54 = lVar.f3026a;
                    if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.f.b(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void d(int i, int i9, int[] iArr, int[] iArr2, int i10) {
        System.arraycopy(iArr, i9, iArr2, i, i10 - i9);
    }

    public static void e(Object[] objArr, Object[] objArr2, int i, int i9, int i10) {
        System.arraycopy(objArr, i9, objArr2, i, i10 - i9);
    }

    public static void f(int i, int i9, int[] iArr, int[] iArr2, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i9);
    }

    public static void g(byte[] bArr, byte[] bArr2, int i, int i9) {
        System.arraycopy(bArr, i, bArr2, 0, i9 - i);
    }

    public static void h(Object[] objArr, Object[] objArr2, int i, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i9 - i);
    }

    public static final void i(int i, int i9) {
        if (i <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i9 + ").");
    }

    public static ListBuilder j() {
        return new ListBuilder((Object) null);
    }

    public static void k(Object[] objArr, Symbol symbol) {
        Arrays.fill(objArr, 0, objArr.length, symbol);
    }

    public static List l(Object obj) {
        return Collections.singletonList(obj);
    }

    public static Map m(Map map, Z3.a aVar) {
        return map instanceof A ? m(((A) map).l(), aVar) : new B(map, aVar);
    }
}
