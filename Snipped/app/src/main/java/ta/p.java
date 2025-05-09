package ta;

import java.lang.annotation.Annotation;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import na.InterfaceC1077a;
import na.InterfaceC1081e;
import pa.C1124b;
import pa.g;
import ra.AbstractC1167b;
import ra.C1165D;
import ra.a0;
import sa.AbstractC1244a;
import sa.InterfaceC1248e;

/* compiled from: Polymorphic.kt */
/* loaded from: classes2.dex */
public final class p {
    public static final void a(InterfaceC1081e interfaceC1081e, InterfaceC1081e interfaceC1081e2, String str) {
        if ((interfaceC1081e instanceof kotlinx.serialization.c) && a0.b(interfaceC1081e2.getDescriptor()).contains(str)) {
            StringBuilder p10 = s3.b.p("Sealed class '", interfaceC1081e2.getDescriptor().a(), "' cannot be serialized as base class '", ((kotlinx.serialization.c) interfaceC1081e).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
            p10.append(str);
            p10.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(p10.toString().toString());
        }
    }

    public static final void b(pa.g gVar) {
        if (gVar instanceof g.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (gVar instanceof pa.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (gVar instanceof pa.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String c(pa.f fVar, AbstractC1244a abstractC1244a) {
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC1248e) {
                return ((InterfaceC1248e) annotation).discriminator();
            }
        }
        return abstractC1244a.f27065a.f27097j;
    }

    public static final <T> T d(sa.g gVar, InterfaceC1077a<? extends T> interfaceC1077a) {
        if (!(interfaceC1077a instanceof AbstractC1167b) || gVar.v().f27065a.i) {
            return interfaceC1077a.deserialize(gVar);
        }
        String c2 = c(interfaceC1077a.getDescriptor(), gVar.v());
        JsonElement l10 = gVar.l();
        pa.f descriptor = interfaceC1077a.getDescriptor();
        if (!(l10 instanceof JsonObject)) {
            throw C1124b.f(-1, "Expected " + kotlin.jvm.internal.h.a(JsonObject.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.h.a(l10.getClass()));
        }
        JsonObject jsonObject = (JsonObject) l10;
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) c2);
        String str = null;
        if (jsonElement != null) {
            C1165D c1165d = sa.h.f27103a;
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive == null) {
                throw new IllegalArgumentException("Element " + kotlin.jvm.internal.h.a(jsonElement.getClass()) + " is not a JsonPrimitive");
            }
            if (!(jsonPrimitive instanceof JsonNull)) {
                str = jsonPrimitive.getContent();
            }
        }
        try {
            InterfaceC1077a r8 = j3.e.r((AbstractC1167b) interfaceC1077a, gVar, str);
            return (T) d(new kotlinx.serialization.json.internal.c(gVar.v(), jsonObject, c2, r8.getDescriptor()), r8);
        } catch (SerializationException e10) {
            throw C1124b.g(-1, e10.getMessage(), jsonObject.toString());
        }
    }
}
