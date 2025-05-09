package m3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p3.C1106a;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class f implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Constructor f23901a;

    public f(Constructor constructor) {
        this.f23901a = constructor;
    }

    @Override // m3.i
    public final Object a() {
        Constructor constructor = this.f23901a;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + C1106a.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + C1106a.b(constructor) + "' with no args", e12.getCause());
        }
    }
}
