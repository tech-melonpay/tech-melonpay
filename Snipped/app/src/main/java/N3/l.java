package n3;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n3.k;
import p3.C1106a;
import r3.C1149a;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class l extends k.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f24154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.r f24155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.r f24156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f24157h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Field field, boolean z10, Method method, com.google.gson.r rVar, com.google.gson.r rVar2, boolean z11, boolean z12) {
        super(str, field);
        this.f24153d = z10;
        this.f24154e = method;
        this.f24155f = rVar;
        this.f24156g = rVar2;
        this.f24157h = z11;
        this.i = z12;
    }

    @Override // n3.k.c
    public final void a(C1149a c1149a, int i, Object[] objArr) {
        Object a10 = this.f24156g.a(c1149a);
        if (a10 != null || !this.f24157h) {
            objArr[i] = a10;
            return;
        }
        throw new JsonParseException("null is not allowed as value for record component '" + this.f24144c + "' of primitive type; at path " + c1149a.getPath());
    }

    @Override // n3.k.c
    public final void b(C1149a c1149a, Object obj) {
        Object a10 = this.f24156g.a(c1149a);
        if (a10 == null && this.f24157h) {
            return;
        }
        boolean z10 = this.f24153d;
        Field field = this.f24143b;
        if (z10) {
            k.b(obj, field);
        } else if (this.i) {
            throw new JsonIOException(s3.b.j("Cannot set value of 'static final' ", C1106a.d(field, false)));
        }
        field.set(obj, a10);
    }

    @Override // n3.k.c
    public final void c(r3.b bVar, Object obj) {
        Object obj2;
        boolean z10 = this.f24153d;
        Field field = this.f24143b;
        Method method = this.f24154e;
        if (z10) {
            if (method == null) {
                k.b(obj, field);
            } else {
                k.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new JsonIOException(androidx.camera.core.n.a("Accessor ", C1106a.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.C(this.f24142a);
        this.f24155f.b(bVar, obj2);
    }
}
