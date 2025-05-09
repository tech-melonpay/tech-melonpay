package androidx.lifecycle;

import R0.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public final class S extends U {

    /* renamed from: c, reason: collision with root package name */
    public static S f7045c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f7046d = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Application f7047b;

    /* compiled from: ViewModelProvider.android.kt */
    public static final class a implements a.b<Application> {
    }

    public S(Application application) {
        this.f7047b = application;
    }

    public static Q b(Class cls, Application application) {
        if (!C0536b.class.isAssignableFrom(cls)) {
            return Ja.a.f(cls);
        }
        try {
            return (Q) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }

    @Override // androidx.lifecycle.U, androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls, R0.a aVar) {
        if (this.f7047b != null) {
            return (T) create(cls);
        }
        Application application = (Application) ((R0.c) aVar).f3235a.get(f7046d);
        if (application != null) {
            return (T) b(cls, application);
        }
        if (C0536b.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return (T) Ja.a.f(cls);
    }

    @Override // androidx.lifecycle.U, androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls) {
        Application application = this.f7047b;
        if (application != null) {
            return (T) b(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
