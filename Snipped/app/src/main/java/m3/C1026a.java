package m3;

import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: ConstructorConstructor.java */
/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026a {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.i<?>> f23889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23890b;

    /* renamed from: c, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f23891c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: m3.a$a, reason: collision with other inner class name */
    public class C0431a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.i f23892a;

        public C0431a(com.google.gson.i iVar, Type type) {
            this.f23892a = iVar;
        }

        @Override // m3.i
        public final T a() {
            return (T) this.f23892a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: m3.a$b */
    public class b<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.i f23893a;

        public b(com.google.gson.i iVar, Type type) {
            this.f23893a = iVar;
        }

        @Override // m3.i
        public final T a() {
            return (T) this.f23893a.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: m3.a$c */
    public class c<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23894a;

        public c(String str) {
            this.f23894a = str;
        }

        @Override // m3.i
        public final T a() {
            throw new JsonIOException(this.f23894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: m3.a$d */
    public class d<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23895a;

        public d(String str) {
            this.f23895a = str;
        }

        @Override // m3.i
        public final T a() {
            throw new JsonIOException(this.f23895a);
        }
    }

    public C1026a(Map<Type, com.google.gson.i<?>> map, boolean z10, List<ReflectionAccessFilter> list) {
        this.f23889a = map;
        this.f23890b = z10;
        this.f23891c = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + j3.e.i("r8-abstract-class");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> m3.i<T> b(com.google.gson.reflect.TypeToken<T> r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C1026a.b(com.google.gson.reflect.TypeToken):m3.i");
    }

    public final String toString() {
        return this.f23889a.toString();
    }
}
