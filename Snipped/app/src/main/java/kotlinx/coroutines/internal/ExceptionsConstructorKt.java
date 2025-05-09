package kotlinx.coroutines.internal;

import ca.InterfaceC0646l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CopyableThrowable;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*(\b\u0002\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001a"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "createConstructor", "(Ljava/lang/Class;)Lca/l;", "block", "safeCtor", "(Lca/l;)Lca/l;", "", "defaultValue", "fieldsCountOrDefault", "(Ljava/lang/Class;I)I", "accumulator", "fieldsCount", "throwableFields", "I", "Lkotlinx/coroutines/internal/CtorCache;", "ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> InterfaceC0646l<Throwable, Throwable> createConstructor(Class<E> cls) {
        Object obj;
        InterfaceC0646l<Throwable, Throwable> interfaceC0646l;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new InterfaceC0646l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // ca.InterfaceC0646l
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                final int i9 = 3;
                pair = new Pair(safeCtor(new InterfaceC0646l() { // from class: kotlinx.coroutines.internal.b
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        Throwable createConstructor$lambda$7$lambda$1;
                        Throwable createConstructor$lambda$7$lambda$3;
                        Throwable createConstructor$lambda$7$lambda$4;
                        Throwable createConstructor$lambda$7$lambda$6;
                        switch (i9) {
                            case 0:
                                createConstructor$lambda$7$lambda$1 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$1;
                            case 1:
                                createConstructor$lambda$7$lambda$3 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$3;
                            case 2:
                                createConstructor$lambda$7$lambda$4 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$4;
                            default:
                                createConstructor$lambda$7$lambda$6 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$6;
                        }
                    }
                }), 0);
            } else if (length2 == 1) {
                Class<?> cls2 = parameterTypes[0];
                if (f.b(cls2, String.class)) {
                    final int i10 = 1;
                    pair = new Pair(safeCtor(new InterfaceC0646l() { // from class: kotlinx.coroutines.internal.b
                        @Override // ca.InterfaceC0646l
                        public final Object invoke(Object obj2) {
                            Throwable createConstructor$lambda$7$lambda$1;
                            Throwable createConstructor$lambda$7$lambda$3;
                            Throwable createConstructor$lambda$7$lambda$4;
                            Throwable createConstructor$lambda$7$lambda$6;
                            switch (i10) {
                                case 0:
                                    createConstructor$lambda$7$lambda$1 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$1;
                                case 1:
                                    createConstructor$lambda$7$lambda$3 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$3;
                                case 2:
                                    createConstructor$lambda$7$lambda$4 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$4;
                                default:
                                    createConstructor$lambda$7$lambda$6 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$6;
                            }
                        }
                    }), 2);
                } else if (f.b(cls2, Throwable.class)) {
                    final int i11 = 2;
                    pair = new Pair(safeCtor(new InterfaceC0646l() { // from class: kotlinx.coroutines.internal.b
                        @Override // ca.InterfaceC0646l
                        public final Object invoke(Object obj2) {
                            Throwable createConstructor$lambda$7$lambda$1;
                            Throwable createConstructor$lambda$7$lambda$3;
                            Throwable createConstructor$lambda$7$lambda$4;
                            Throwable createConstructor$lambda$7$lambda$6;
                            switch (i11) {
                                case 0:
                                    createConstructor$lambda$7$lambda$1 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$1;
                                case 1:
                                    createConstructor$lambda$7$lambda$3 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$3;
                                case 2:
                                    createConstructor$lambda$7$lambda$4 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$4;
                                default:
                                    createConstructor$lambda$7$lambda$6 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj2);
                                    return createConstructor$lambda$7$lambda$6;
                            }
                        }
                    }), 1);
                } else {
                    pair = new Pair(null, -1);
                }
            } else if (length2 != 2) {
                pair = new Pair(null, -1);
            } else if (f.b(parameterTypes[0], String.class) && f.b(parameterTypes[1], Throwable.class)) {
                final int i12 = 0;
                pair = new Pair(safeCtor(new InterfaceC0646l() { // from class: kotlinx.coroutines.internal.b
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        Throwable createConstructor$lambda$7$lambda$1;
                        Throwable createConstructor$lambda$7$lambda$3;
                        Throwable createConstructor$lambda$7$lambda$4;
                        Throwable createConstructor$lambda$7$lambda$6;
                        switch (i12) {
                            case 0:
                                createConstructor$lambda$7$lambda$1 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$1;
                            case 1:
                                createConstructor$lambda$7$lambda$3 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$3;
                            case 2:
                                createConstructor$lambda$7$lambda$4 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$4;
                            default:
                                createConstructor$lambda$7$lambda$6 = ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj2);
                                return createConstructor$lambda$7$lambda$6;
                        }
                    }
                }), 3);
            } else {
                pair = new Pair(null, -1);
            }
            arrayList.add(pair);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).f23090b).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).f23090b).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        return (pair2 == null || (interfaceC0646l = (InterfaceC0646l) pair2.f23089a) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(th.getMessage(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance(th.getMessage());
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance(null);
        th2.initCause(th);
        return th2;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int length = cls.getDeclaredFields().length;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (!Modifier.isStatic(r0[i10].getModifiers())) {
                    i9++;
                }
            }
            i += i9;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object failure;
        h.a(cls);
        try {
            failure = Integer.valueOf(fieldsCount$default(cls, 0, 1, null));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object valueOf = Integer.valueOf(i);
        if (failure instanceof Result.Failure) {
            failure = valueOf;
        }
        return ((Number) failure).intValue();
    }

    private static final InterfaceC0646l<Throwable, Throwable> safeCtor(InterfaceC0646l<? super Throwable, ? extends Throwable> interfaceC0646l) {
        return new C7.a(interfaceC0646l, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(InterfaceC0646l interfaceC0646l, Throwable th) {
        Object failure;
        try {
            Throwable th2 = (Throwable) interfaceC0646l.invoke(th);
            boolean b9 = f.b(th.getMessage(), th2.getMessage());
            failure = th2;
            if (!b9) {
                boolean b10 = f.b(th2.getMessage(), th.toString());
                failure = th2;
                if (!b10) {
                    failure = null;
                }
            }
        } catch (Throwable th3) {
            failure = new Result.Failure(th3);
        }
        return (Throwable) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e10) {
        Object failure;
        if (!(e10 instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e10.getClass()).invoke(e10);
        }
        try {
            failure = ((CopyableThrowable) e10).createCopy();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (E) failure;
    }
}
