package m3;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: ReflectionAccessFilterHelper.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23915a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: m3.j$a$a, reason: collision with other inner class name */
        public class C0432a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f23916b;

            public C0432a(Method method) {
                this.f23916b = method;
            }

            @Override // m3.j.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f23916b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        public class b extends a {
            @Override // m3.j.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            /*
                int r0 = m3.h.f23914a
                r1 = 9
                if (r0 < r1) goto L1a
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L1a
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
                m3.j$a$a r1 = new m3.j$a$a     // Catch: java.lang.NoSuchMethodException -> L1a
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                if (r1 != 0) goto L22
                m3.j$a$b r1 = new m3.j$a$b
                r1.<init>()
            L22:
                m3.j.a.f23915a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.j.a.<clinit>():void");
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static ReflectionAccessFilter.FilterResult a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult a10 = ((ReflectionAccessFilter) it.next()).a();
            if (a10 != ReflectionAccessFilter.FilterResult.f10309b) {
                return a10;
            }
        }
        return ReflectionAccessFilter.FilterResult.f10308a;
    }
}
