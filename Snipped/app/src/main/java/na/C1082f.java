package na;

import P9.n;
import ia.InterfaceC0835c;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import ra.C1169d;
import ra.K;
import ra.a0;
import ra.f0;
import ra.g0;

/* compiled from: SerializersJvm.kt */
/* renamed from: na.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1082f {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length != 0) {
                return a(upperBounds[0]);
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (type instanceof GenericArrayType) {
            return a(((GenericArrayType) type).getGenericComponentType());
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + h.a(type.getClass()));
    }

    public static final <T> InterfaceC1078b<T> b(Y8.a aVar, Class<T> cls, List<? extends InterfaceC1078b<Object>> list) {
        InterfaceC1078b[] interfaceC1078bArr = (InterfaceC1078b[]) list.toArray(new InterfaceC1078b[0]);
        InterfaceC1078b<T> d10 = a0.d(cls, (InterfaceC1078b[]) Arrays.copyOf(interfaceC1078bArr, interfaceC1078bArr.length));
        if (d10 != null) {
            return d10;
        }
        kotlin.jvm.internal.b a10 = h.a(cls);
        InterfaceC1078b<T> interfaceC1078b = (InterfaceC1078b) f0.f26394a.get(a10);
        return interfaceC1078b == null ? aVar.c(a10, list) : interfaceC1078b;
    }

    public static final InterfaceC1078b<Object> c(Y8.a aVar, Type type, boolean z10) {
        ArrayList arrayList;
        InterfaceC1078b<Object> c2;
        InterfaceC1078b<Object> c10;
        InterfaceC0835c interfaceC0835c;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                if (upperBounds.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                genericComponentType = upperBounds[0];
            }
            if (z10) {
                c10 = j3.e.C(aVar, genericComponentType);
            } else {
                c10 = c(aVar, genericComponentType, false);
                if (c10 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                interfaceC0835c = h.a((Class) ((ParameterizedType) genericComponentType).getRawType());
            } else {
                if (!(genericComponentType instanceof InterfaceC0835c)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + h.a(genericComponentType.getClass()));
                }
                interfaceC0835c = (InterfaceC0835c) genericComponentType;
            }
            return new g0(interfaceC0835c, c10);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(aVar, cls, EmptyList.f23104a);
            }
            Class<?> componentType = cls.getComponentType();
            if (z10) {
                c2 = j3.e.C(aVar, componentType);
            } else {
                c2 = c(aVar, componentType, false);
                if (c2 == null) {
                    return null;
                }
            }
            return new g0(h.a(componentType), c2);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                if (upperBounds2.length != 0) {
                    return c(aVar, upperBounds2[0], true);
                }
                throw new NoSuchElementException("Array is empty.");
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + h.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls2 = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(j3.e.C(aVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                InterfaceC1078b<Object> c11 = c(aVar, type3, false);
                if (c11 == null) {
                    return null;
                }
                arrayList.add(c11);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            return new C1169d((InterfaceC1078b) arrayList.get(0), 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return new C1169d((InterfaceC1078b) arrayList.get(0), 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return new K((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            return new MapEntrySerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            return new PairSerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1));
        }
        if (Triple.class.isAssignableFrom(cls2)) {
            return new TripleSerializer((InterfaceC1078b) arrayList.get(0), (InterfaceC1078b) arrayList.get(1), (InterfaceC1078b) arrayList.get(2));
        }
        ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC1078b) it.next());
        }
        return b(aVar, cls2, arrayList2);
    }
}
