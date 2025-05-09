package qb;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f26013c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26014a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f26015b;

    /* compiled from: Platform.java */
    public static final class a extends n {

        /* compiled from: Platform.java */
        /* renamed from: qb.n$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0462a implements Executor {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f26016a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f26016a.post(runnable);
            }
        }

        @Override // qb.n
        public final Executor a() {
            return new ExecutorC0462a();
        }

        @Override // qb.n
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            return super.b(method, cls, obj, objArr);
        }
    }

    static {
        f26013c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new n();
    }

    public n() {
        Constructor<MethodHandles.Lookup> constructor = null;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f26015b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f26015b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
