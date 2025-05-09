package kotlin.coroutines.jvm.internal;

import O9.p;
import T9.a;
import V9.c;
import V9.d;
import V9.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class BaseContinuationImpl implements a<Object>, c, Serializable {
    private final a<Object> completion;

    public BaseContinuationImpl(a<Object> aVar) {
        this.completion = aVar;
    }

    public a<p> create(a<?> aVar) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // V9.c
    public c getCallerFrame() {
        a<Object> aVar = this.completion;
        if (aVar instanceof c) {
            return (c) aVar;
        }
        return null;
    }

    public final a<Object> getCompletion() {
        return this.completion;
    }

    @Override // V9.c
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v10 = dVar.v();
        if (v10 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i9 = i >= 0 ? dVar.l()[i] : -1;
        e.a aVar = e.f3770b;
        e.a aVar2 = e.f3769a;
        if (aVar == null) {
            try {
                e.a aVar3 = new e.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                e.f3770b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                e.f3770b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.f3771a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = aVar.f3772b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar.f3773c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i9);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T9.a
    public final void resumeWith(Object obj) {
        a aVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) aVar;
            a aVar2 = baseContinuationImpl.completion;
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.f23158a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new Result.Failure(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(aVar2 instanceof BaseContinuationImpl)) {
                aVar2.resumeWith(obj);
                return;
            }
            aVar = aVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public a<p> create(Object obj, a<?> aVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
