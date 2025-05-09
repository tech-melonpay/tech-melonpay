package g1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.luminary.mobile.R;
import j1.C0880a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer.java */
/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0758a f20756d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f20757e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f20760c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f20759b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20758a = new HashMap();

    public C0758a(Context context) {
        this.f20760c = context.getApplicationContext();
    }

    public static C0758a c(Context context) {
        if (f20756d == null) {
            synchronized (f20757e) {
                try {
                    if (f20756d == null) {
                        f20756d = new C0758a(context);
                    }
                } finally {
                }
            }
        }
        return f20756d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f20760c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f20759b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (C0880a.b()) {
            try {
                C0880a.a(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f20758a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : a10) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f20760c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
