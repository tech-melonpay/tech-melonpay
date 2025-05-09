package Ea;

import P9.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Method f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1111d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1112e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f1113f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f1114g;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f1115a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1116b;

        /* renamed from: c, reason: collision with root package name */
        public String f1117c;

        public a(ArrayList arrayList) {
            this.f1115a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (kotlin.jvm.internal.f.b(name, "supports") && kotlin.jvm.internal.f.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (kotlin.jvm.internal.f.b(name, "unsupported") && kotlin.jvm.internal.f.b(Void.TYPE, returnType)) {
                this.f1116b = true;
                return null;
            }
            boolean b9 = kotlin.jvm.internal.f.b(name, "protocols");
            List<String> list = this.f1115a;
            if (b9 && objArr.length == 0) {
                return list;
            }
            if ((kotlin.jvm.internal.f.b(name, "selectProtocol") || kotlin.jvm.internal.f.b(name, "select")) && kotlin.jvm.internal.f.b(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            String str = (String) list2.get(i);
                            if (!list.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f1117c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = list.get(0);
                    this.f1117c = str2;
                    return str2;
                }
            }
            if ((!kotlin.jvm.internal.f.b(name, "protocolSelected") && !kotlin.jvm.internal.f.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            this.f1117c = (String) objArr[0];
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f1110c = method;
        this.f1111d = method2;
        this.f1112e = method3;
        this.f1113f = cls;
        this.f1114g = cls2;
    }

    @Override // Ea.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f1112e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // Ea.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).f24425a);
        }
        try {
            this.f1110c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f1113f, this.f1114g}, new a(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // Ea.h
    public final String f(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f1111d.invoke(null, sSLSocket));
            boolean z10 = aVar.f1116b;
            if (!z10 && aVar.f1117c == null) {
                h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f1117c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
