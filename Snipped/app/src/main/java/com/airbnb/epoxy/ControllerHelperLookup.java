package com.airbnb.epoxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ControllerHelperLookup {
    private static final String GENERATED_HELPER_CLASS_SUFFIX = "_EpoxyHelper";
    private static final Map<Class<?>, Constructor<?>> BINDINGS = new LinkedHashMap();
    private static final NoOpControllerHelper NO_OP_CONTROLLER_HELPER = new NoOpControllerHelper();

    private static Constructor<?> findConstructorForClass(Class<?> cls) {
        Constructor<?> findConstructorForClass;
        Map<Class<?>, Constructor<?>> map = BINDINGS;
        Constructor<?> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            findConstructorForClass = Class.forName(name.concat(GENERATED_HELPER_CLASS_SUFFIX)).getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            findConstructorForClass = findConstructorForClass(cls.getSuperclass());
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(name), e10);
        }
        BINDINGS.put(cls, findConstructorForClass);
        return findConstructorForClass;
    }

    public static ControllerHelper getHelperForController(EpoxyController epoxyController) {
        Constructor<?> findConstructorForClass = findConstructorForClass(epoxyController.getClass());
        if (findConstructorForClass == null) {
            return NO_OP_CONTROLLER_HELPER;
        }
        try {
            return (ControllerHelper) findConstructorForClass.newInstance(epoxyController);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to invoke " + findConstructorForClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to invoke " + findConstructorForClass, e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to get Epoxy helper class.", cause);
        }
    }
}
