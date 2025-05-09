package n3;

import C.v;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.C1026a;
import m3.j;
import p3.C1106a;
import r3.C1149a;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class k implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final C1026a f24136a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.b f24137b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.g f24138c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.d f24139d;

    /* renamed from: e, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f24140e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public class a<T> extends com.google.gson.r<T> {
        @Override // com.google.gson.r
        public final T a(C1149a c1149a) {
            c1149a.t0();
            return null;
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, T t3) {
            bVar.E();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static abstract class b<T, A> extends com.google.gson.r<T> {

        /* renamed from: a, reason: collision with root package name */
        public final e f24141a;

        public b(e eVar) {
            this.f24141a = eVar;
        }

        @Override // com.google.gson.r
        public final T a(C1149a c1149a) {
            if (c1149a.k0() == JsonToken.i) {
                c1149a.Y();
                return null;
            }
            A c2 = c();
            Map<String, c> map = this.f24141a.f24147a;
            try {
                c1149a.i();
                while (c1149a.G()) {
                    c cVar = map.get(c1149a.V());
                    if (cVar == null) {
                        c1149a.t0();
                    } else {
                        e(c2, c1149a, cVar);
                    }
                }
                c1149a.A();
                return d(c2);
            } catch (IllegalAccessException e10) {
                C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, T t3) {
            if (t3 == null) {
                bVar.E();
                return;
            }
            bVar.j();
            try {
                Iterator<c> it = this.f24141a.f24148b.iterator();
                while (it.hasNext()) {
                    it.next().c(bVar, t3);
                }
                bVar.A();
            } catch (IllegalAccessException e10) {
                C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract A c();

        public abstract T d(A a10);

        public abstract void e(A a10, C1149a c1149a, c cVar);
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f24142a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f24143b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24144c;

        public c(String str, Field field) {
            this.f24142a = str;
            this.f24143b = field;
            this.f24144c = field.getName();
        }

        public abstract void a(C1149a c1149a, int i, Object[] objArr);

        public abstract void b(C1149a c1149a, Object obj);

        public abstract void c(r3.b bVar, Object obj);
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static class e {

        /* renamed from: c, reason: collision with root package name */
        public static final e f24146c = new e(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, c> f24147a;

        /* renamed from: b, reason: collision with root package name */
        public final List<c> f24148b;

        public e(Map<String, c> map, List<c> list) {
            this.f24147a = map;
            this.f24148b = list;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class f<T> extends b<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        public static final HashMap f24149e;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor<T> f24150b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f24151c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f24152d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f24149e = hashMap;
        }

        public f(Class<T> cls, e eVar, boolean z10) {
            super(eVar);
            this.f24152d = new HashMap();
            C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
            Constructor<T> b9 = abstractC0449a.b(cls);
            this.f24150b = b9;
            if (z10) {
                k.b(null, b9);
            } else {
                C1106a.f(b9);
            }
            String[] c2 = abstractC0449a.c(cls);
            for (int i = 0; i < c2.length; i++) {
                this.f24152d.put(c2[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f24150b.getParameterTypes();
            this.f24151c = new Object[parameterTypes.length];
            for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                this.f24151c[i9] = f24149e.get(parameterTypes[i9]);
            }
        }

        @Override // n3.k.b
        public final Object[] c() {
            return (Object[]) this.f24151c.clone();
        }

        @Override // n3.k.b
        public final Object d(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.f24150b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e10) {
                C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + C1106a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + C1106a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + C1106a.b(constructor) + "' with args " + Arrays.toString(objArr2), e13.getCause());
            }
        }

        @Override // n3.k.b
        public final void e(Object[] objArr, C1149a c1149a, c cVar) {
            Object[] objArr2 = objArr;
            HashMap hashMap = this.f24152d;
            String str = cVar.f24144c;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                cVar.a(c1149a, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C1106a.b(this.f24150b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public k(C1026a c1026a, com.google.gson.b bVar, m3.g gVar, n3.d dVar, List<ReflectionAccessFilter> list) {
        this.f24136a = c1026a;
        this.f24137b = bVar;
        this.f24138c = gVar;
        this.f24139d = dVar;
        this.f24140e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!j.a.f23915a.a(obj, accessibleObject)) {
            throw new JsonIOException(v.n(C1106a.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C1106a.c(field) + " and " + C1106a.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.s
    public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new a();
        }
        ReflectionAccessFilter.FilterResult a10 = m3.j.a(rawType, this.f24140e);
        if (a10 == ReflectionAccessFilter.FilterResult.f10311d) {
            throw new JsonIOException(androidx.camera.core.impl.utils.a.l("ReflectionAccessFilter does not permit using reflection for ", rawType, ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z10 = a10 == ReflectionAccessFilter.FilterResult.f10310c;
        return C1106a.f25612a.d(rawType) ? new f(rawType, d(gVar, typeToken, rawType, z10, true), z10) : new d(this.f24136a.b(typeToken), d(gVar, typeToken, rawType, z10, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f2  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [n3.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n3.k.e d(com.google.gson.g r34, com.google.gson.reflect.TypeToken<?> r35, java.lang.Class<?> r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.k.d(com.google.gson.g, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):n3.k$e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4 < r1.value()) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 >= r3.value()) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            m3.g r0 = r8.f24138c
            r0.getClass()
            int r1 = r9.getModifiers()
            int r2 = r0.f23904b
            r1 = r1 & r2
            r2 = 1
            if (r1 == 0) goto L11
        Lf:
            r9 = r2
            goto L79
        L11:
            double r3 = r0.f23903a
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3f
            java.lang.Class<l3.c> r1 = l3.c.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            l3.c r1 = (l3.c) r1
            java.lang.Class<l3.d> r3 = l3.d.class
            java.lang.annotation.Annotation r3 = r9.getAnnotation(r3)
            l3.d r3 = (l3.d) r3
            double r4 = r0.f23903a
            if (r1 == 0) goto L35
            double r6 = r1.value()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto Lf
        L35:
            if (r3 == 0) goto L3f
            double r6 = r3.value()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lf
        L3f:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L46
            goto Lf
        L46:
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.b(r1, r10)
            if (r1 == 0) goto L51
            goto Lf
        L51:
            if (r10 == 0) goto L56
            java.util.List<com.google.gson.a> r10 = r0.f23906d
            goto L58
        L56:
            java.util.List<com.google.gson.a> r10 = r0.f23907e
        L58:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L78
            java.util.Objects.requireNonNull(r9)
            java.util.Iterator r9 = r10.iterator()
        L65:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L78
            java.lang.Object r10 = r9.next()
            com.google.gson.a r10 = (com.google.gson.a) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto L65
            goto Lf
        L78:
            r9 = 0
        L79:
            r9 = r9 ^ r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.k.e(java.lang.reflect.Field, boolean):boolean");
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class d<T> extends b<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final m3.i<T> f24145b;

        public d(m3.i<T> iVar, e eVar) {
            super(eVar);
            this.f24145b = iVar;
        }

        @Override // n3.k.b
        public final T c() {
            return this.f24145b.a();
        }

        @Override // n3.k.b
        public final void e(T t3, C1149a c1149a, c cVar) {
            cVar.b(c1149a, t3);
        }

        @Override // n3.k.b
        public final T d(T t3) {
            return t3;
        }
    }
}
