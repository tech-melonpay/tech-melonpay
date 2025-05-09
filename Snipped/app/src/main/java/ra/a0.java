package ra;

import ia.InterfaceC0835c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;

/* compiled from: Platform.common.kt */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pa.f[] f26381a = new pa.f[0];

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC1078b[] f26382b = new InterfaceC1078b[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f26383c = new Object();

    public static final C1165D a(String str, InterfaceC1078b interfaceC1078b) {
        return new C1165D(str, new E(interfaceC1078b));
    }

    public static final Set b(pa.f fVar) {
        if (fVar instanceof InterfaceC1177l) {
            return ((InterfaceC1177l) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int f10 = fVar.f();
        for (int i = 0; i < f10; i++) {
            hashSet.add(fVar.g(i));
        }
        return hashSet;
    }

    public static final pa.f[] c(List list) {
        pa.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (pa.f[]) list.toArray(new pa.f[0])) == null) ? f26381a : fVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0111, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00d1, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a2 A[Catch: NoSuchFieldException -> 0x01a5, TRY_LEAVE, TryCatch #3 {NoSuchFieldException -> 0x01a5, blocks: (B:92:0x016a, B:94:0x0175, B:103:0x0192, B:105:0x0198, B:106:0x019e, B:108:0x01a2, B:99:0x018a), top: B:91:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175 A[Catch: NoSuchFieldException -> 0x01a5, TryCatch #3 {NoSuchFieldException -> 0x01a5, blocks: (B:92:0x016a, B:94:0x0175, B:103:0x0192, B:105:0x0198, B:106:0x019e, B:108:0x01a2, B:99:0x018a), top: B:91:0x016a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final na.InterfaceC1078b d(java.lang.Class r17, na.InterfaceC1078b... r18) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.a0.d(java.lang.Class, na.b[]):na.b");
    }

    public static final int e(pa.f fVar, pa.f[] fVarArr) {
        int hashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(fVarArr);
        int f10 = fVar.f();
        int i = 1;
        while (true) {
            int i9 = 0;
            if (!(f10 > 0)) {
                break;
            }
            int i10 = f10 - 1;
            int i11 = i * 31;
            String a10 = fVar.i(fVar.f() - f10).a();
            if (a10 != null) {
                i9 = a10.hashCode();
            }
            i = i11 + i9;
            f10 = i10;
        }
        int f11 = fVar.f();
        int i12 = 1;
        while (true) {
            if (!(f11 > 0)) {
                return (((hashCode * 31) + i) * 31) + i12;
            }
            int i13 = f11 - 1;
            int i14 = i12 * 31;
            pa.g e10 = fVar.i(fVar.f() - f11).e();
            i12 = i14 + (e10 != null ? e10.hashCode() : 0);
            f11 = i13;
        }
    }

    public static final InterfaceC1078b f(Object obj, InterfaceC1078b... interfaceC1078bArr) {
        Class[] clsArr;
        try {
            if (interfaceC1078bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC1078bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC1078b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC1078bArr, interfaceC1078bArr.length));
            if (invoke instanceof InterfaceC1078b) {
                return (InterfaceC1078b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final InterfaceC0835c g(ia.k kVar) {
        InterfaceC0835c e10 = kVar.e();
        if (e10 instanceof InterfaceC0835c) {
            return e10;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + e10);
    }

    public static final void h(int i, int i9, pa.f fVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = (~i) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(fVar.g(i11));
            }
            i10 >>>= 1;
        }
        String a10 = fVar.a();
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? s3.b.o(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", a10, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + a10 + "', but they were missing", null);
    }

    public static final void i(InterfaceC0835c interfaceC0835c, String str) {
        String sb2;
        String str2 = "in the polymorphic scope of '" + interfaceC0835c.d() + '\'';
        if (str == null) {
            sb2 = C.v.o("Class discriminator was missing and no default serializers were registered ", str2, '.');
        } else {
            StringBuilder p10 = s3.b.p("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            androidx.camera.core.impl.utils.a.u(p10, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            p10.append(interfaceC0835c.d());
            p10.append("' has to be sealed and '@Serializable'.");
            sb2 = p10.toString();
        }
        throw new SerializationException(sb2);
    }
}
