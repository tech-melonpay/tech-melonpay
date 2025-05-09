package qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.h;
import qb.c;
import qb.f;
import va.b;

/* compiled from: Retrofit.java */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final b.a f26069b;

    /* renamed from: c, reason: collision with root package name */
    public final okhttp3.h f26070c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f.a> f26071d;

    /* renamed from: e, reason: collision with root package name */
    public final List<c.a> f26072e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f26068a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26073f = false;

    /* compiled from: Retrofit.java */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final n f26074a = n.f26013c;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f26075b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f26076c;

        public a(Class cls) {
            this.f26076c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f26075b;
            }
            n nVar = this.f26074a;
            return (nVar.f26014a && method.isDefault()) ? nVar.b(method, this.f26076c, obj, objArr) : r.this.c(method).a(objArr);
        }
    }

    /* compiled from: Retrofit.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final n f26078a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f26079b;

        /* renamed from: c, reason: collision with root package name */
        public okhttp3.h f26080c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f26081d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f26082e;

        public b() {
            n nVar = n.f26013c;
            this.f26081d = new ArrayList();
            this.f26082e = new ArrayList();
            this.f26078a = nVar;
        }

        public final void a(f.a aVar) {
            ArrayList arrayList = this.f26081d;
            Objects.requireNonNull(aVar, "factory == null");
            arrayList.add(aVar);
        }

        public final void b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            h.a aVar = new h.a();
            aVar.d(null, str);
            okhttp3.h a10 = aVar.a();
            if ("".equals(a10.f24530f.get(r0.size() - 1))) {
                this.f26080c = a10;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + a10);
            }
        }

        public final r c() {
            if (this.f26080c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            b.a aVar = this.f26079b;
            if (aVar == null) {
                aVar = new va.h();
            }
            b.a aVar2 = aVar;
            n nVar = this.f26078a;
            Executor a10 = nVar.a();
            ArrayList arrayList = new ArrayList(this.f26082e);
            g gVar = new g(a10);
            boolean z10 = nVar.f26014a;
            arrayList.addAll(z10 ? Arrays.asList(e.f25937b, gVar) : Collections.singletonList(gVar));
            ArrayList arrayList2 = this.f26081d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z10 ? 1 : 0));
            qb.a aVar3 = new qb.a();
            aVar3.f25930a = true;
            arrayList3.add(aVar3);
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(z10 ? Collections.singletonList(k.f25970a) : Collections.emptyList());
            return new r(aVar2, this.f26080c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), a10);
        }
    }

    public r(b.a aVar, okhttp3.h hVar, List list, List list2, Executor executor) {
        this.f26069b = aVar;
        this.f26070c = hVar;
        this.f26071d = list;
        this.f26072e = list2;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f26072e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            c<?, ?> cVar = list.get(i).get(type, annotationArr, this);
            if (cVar != null) {
                return cVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f26073f) {
            n nVar = n.f26013c;
            for (Method method : cls.getDeclaredMethods()) {
                if ((!nVar.f26014a || !method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final s<?> c(Method method) {
        s<?> sVar;
        s<?> sVar2 = (s) this.f26068a.get(method);
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (this.f26068a) {
            try {
                sVar = (s) this.f26068a.get(method);
                if (sVar == null) {
                    sVar = s.b(this, method);
                    this.f26068a.put(method, sVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public final f d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f26071d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            f<va.i, ?> b9 = list.get(i).b(type, annotationArr, this);
            if (b9 != null) {
                return b9;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<T, okhttp3.o> e(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f26071d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            f<T, okhttp3.o> a10 = list.get(i).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f26071d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
