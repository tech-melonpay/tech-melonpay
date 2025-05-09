package m3;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f23898b;

    public /* synthetic */ c(int i, Type type) {
        this.f23897a = i;
        this.f23898b = type;
    }

    @Override // m3.i
    public final Object a() {
        switch (this.f23897a) {
            case 0:
                Type type = this.f23898b;
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.f23898b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new JsonIOException("Invalid EnumMap type: " + type3.toString());
        }
    }
}
