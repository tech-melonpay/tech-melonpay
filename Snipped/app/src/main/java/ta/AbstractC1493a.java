package ta;

import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import na.InterfaceC1077a;
import pa.C1124b;
import pa.g;
import qa.InterfaceC1142b;
import qa.InterfaceC1144d;
import ra.C1165D;
import ra.U;
import sa.AbstractC1244a;

/* compiled from: TreeJsonDecoder.kt */
/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1493a extends U implements sa.g {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1244a f29974c;

    /* renamed from: d, reason: collision with root package name */
    public final sa.f f29975d;

    public AbstractC1493a(AbstractC1244a abstractC1244a, JsonElement jsonElement) {
        this.f29974c = abstractC1244a;
        this.f29975d = abstractC1244a.f27065a;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final boolean F(String str) {
        try {
            Boolean c2 = sa.h.c(V(str));
            if (c2 != null) {
                return c2.booleanValue();
            }
            X("boolean");
            throw null;
        } catch (IllegalArgumentException unused) {
            X("boolean");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final byte G(String str) {
        try {
            int d10 = sa.h.d(V(str));
            Byte valueOf = (-128 > d10 || d10 > 127) ? null : Byte.valueOf((byte) d10);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            X("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            X("byte");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final char H(String str) {
        try {
            String content = V(str).getContent();
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return content.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X("char");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final double I(String str) {
        String str2 = str;
        JsonPrimitive V = V(str2);
        try {
            C1165D c1165d = sa.h.f27103a;
            double parseDouble = Double.parseDouble(V.getContent());
            if (this.f29974c.f27065a.f27098k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            throw C1124b.f(-1, C1124b.H(Double.valueOf(parseDouble), str2, U().toString()));
        } catch (IllegalArgumentException unused) {
            X("double");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int J(String str, pa.f fVar) {
        return kotlinx.serialization.json.internal.b.c(fVar, this.f29974c, V(str).getContent(), "");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final float K(String str) {
        String str2 = str;
        JsonPrimitive V = V(str2);
        try {
            C1165D c1165d = sa.h.f27103a;
            float parseFloat = Float.parseFloat(V.getContent());
            if (this.f29974c.f27065a.f27098k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            throw C1124b.f(-1, C1124b.H(Float.valueOf(parseFloat), str2, U().toString()));
        } catch (IllegalArgumentException unused) {
            X("float");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final InterfaceC1144d L(String str, pa.f fVar) {
        String str2 = str;
        if (t.a(fVar)) {
            return new i(new u(V(str2).getContent()), this.f29974c);
        }
        this.f23349a.add(str2);
        return this;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final int M(String str) {
        try {
            return sa.h.d(V(str));
        } catch (IllegalArgumentException unused) {
            X("int");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final long N(String str) {
        JsonPrimitive V = V(str);
        try {
            C1165D c1165d = sa.h.f27103a;
            try {
                return new u(V.getContent()).h();
            } catch (JsonDecodingException e10) {
                throw new NumberFormatException(e10.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            X("long");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final short O(String str) {
        try {
            int d10 = sa.h.d(V(str));
            Short valueOf = (-32768 > d10 || d10 > 32767) ? null : Short.valueOf((short) d10);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            X("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            X("short");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String P(String str) {
        String str2 = str;
        JsonPrimitive V = V(str2);
        if (!this.f29974c.f27065a.f27091c) {
            sa.l lVar = V instanceof sa.l ? (sa.l) V : null;
            if (lVar == null) {
                throw C1124b.f(-1, "Unexpected 'null' literal when non-nullable string was expected");
            }
            if (!lVar.f27105a) {
                throw C1124b.g(-1, androidx.camera.core.n.a("String literal for key '", str2, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), U().toString());
            }
        }
        if (V instanceof JsonNull) {
            throw C1124b.g(-1, "Unexpected 'null' value instead of string literal", U().toString());
        }
        return V.getContent();
    }

    public abstract JsonElement T(String str);

    public final JsonElement U() {
        JsonElement T;
        String str = (String) P9.s.R(this.f23349a);
        return (str == null || (T = T(str)) == null) ? W() : T;
    }

    public final JsonPrimitive V(String str) {
        JsonElement T = T(str);
        JsonPrimitive jsonPrimitive = T instanceof JsonPrimitive ? (JsonPrimitive) T : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw C1124b.g(-1, "Expected JsonPrimitive at " + str + ", found " + T, U().toString());
    }

    public abstract JsonElement W();

    public final void X(String str) {
        throw C1124b.g(-1, androidx.camera.core.n.a("Failed to parse literal as '", str, "' value"), U().toString());
    }

    @Override // qa.InterfaceC1144d, qa.InterfaceC1142b
    public final Y8.a a() {
        return this.f29974c.f27066b;
    }

    @Override // qa.InterfaceC1144d
    public InterfaceC1142b c(pa.f fVar) {
        InterfaceC1142b mVar;
        JsonElement U = U();
        pa.g e10 = fVar.e();
        boolean b9 = kotlin.jvm.internal.f.b(e10, b.C0424b.f23310a);
        AbstractC1244a abstractC1244a = this.f29974c;
        if (b9 || (e10 instanceof pa.d)) {
            if (!(U instanceof JsonArray)) {
                throw C1124b.f(-1, "Expected " + kotlin.jvm.internal.h.a(JsonArray.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.h.a(U.getClass()));
            }
            mVar = new m(abstractC1244a, (JsonArray) U);
        } else if (kotlin.jvm.internal.f.b(e10, b.c.f23311a)) {
            pa.f a10 = w.a(fVar.i(0), abstractC1244a.f27066b);
            pa.g e11 = a10.e();
            if ((e11 instanceof pa.e) || kotlin.jvm.internal.f.b(e11, g.b.f25740a)) {
                if (!(U instanceof JsonObject)) {
                    throw C1124b.f(-1, "Expected " + kotlin.jvm.internal.h.a(JsonObject.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.h.a(U.getClass()));
                }
                mVar = new n(abstractC1244a, (JsonObject) U);
            } else {
                if (!abstractC1244a.f27065a.f27092d) {
                    throw C1124b.e(a10);
                }
                if (!(U instanceof JsonArray)) {
                    throw C1124b.f(-1, "Expected " + kotlin.jvm.internal.h.a(JsonArray.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.h.a(U.getClass()));
                }
                mVar = new m(abstractC1244a, (JsonArray) U);
            }
        } else {
            if (!(U instanceof JsonObject)) {
                throw C1124b.f(-1, "Expected " + kotlin.jvm.internal.h.a(JsonObject.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.h.a(U.getClass()));
            }
            mVar = new kotlinx.serialization.json.internal.c(abstractC1244a, (JsonObject) U, null, null);
        }
        return mVar;
    }

    @Override // sa.g
    public final JsonElement l() {
        return U();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, qa.InterfaceC1144d
    public final InterfaceC1144d o(pa.f fVar) {
        if (P9.s.R(this.f23349a) != null) {
            return super.o(fVar);
        }
        return new k(this.f29974c, W()).o(fVar);
    }

    @Override // qa.InterfaceC1144d
    public boolean t() {
        return !(U() instanceof JsonNull);
    }

    @Override // sa.g
    public final AbstractC1244a v() {
        return this.f29974c;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, qa.InterfaceC1144d
    public final <T> T x(InterfaceC1077a<? extends T> interfaceC1077a) {
        return (T) p.d(this, interfaceC1077a);
    }

    public void b(pa.f fVar) {
    }
}
