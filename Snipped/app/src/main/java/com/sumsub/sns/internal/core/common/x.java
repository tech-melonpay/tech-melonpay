package com.sumsub.sns.internal.core.common;

import ca.InterfaceC0646l;
import java.util.Date;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.c;
import ra.C1165D;
import sa.AbstractC1244a;
import sa.C1247d;

/* loaded from: classes2.dex */
public final class x {

    public static final class a extends Lambda implements InterfaceC0646l<C1247d, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(1);
            this.f15196a = z10;
        }

        public final void a(C1247d c1247d) {
            c1247d.f27076c = true;
            c1247d.f27081h = true;
            c1247d.f27079f = this.f15196a;
            c cVar = new c();
            cVar.b(kotlin.jvm.internal.h.a(Object.class), com.sumsub.sns.internal.core.data.serializer.c.f15826a);
            cVar.b(kotlin.jvm.internal.h.a(Date.class), com.sumsub.sns.internal.core.data.serializer.a.f15821a);
            c1247d.f27088p = new kotlinx.serialization.modules.b(cVar.f23424a, cVar.f23425b, cVar.f23426c, cVar.f23427d, cVar.f23428e);
            c1247d.f27078e = true;
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(C1247d c1247d) {
            a(c1247d);
            return O9.p.f3034a;
        }
    }

    public static final AbstractC1244a a(boolean z10) {
        a aVar = new a(z10);
        AbstractC1244a.C0471a c0471a = AbstractC1244a.f27064d;
        C1247d c1247d = new C1247d();
        sa.f fVar = c0471a.f27065a;
        c1247d.f27074a = fVar.f27089a;
        c1247d.f27075b = fVar.f27094f;
        c1247d.f27076c = fVar.f27090b;
        c1247d.f27077d = fVar.f27091c;
        c1247d.f27078e = fVar.f27092d;
        c1247d.f27079f = fVar.f27093e;
        String str = fVar.f27095g;
        c1247d.f27080g = str;
        c1247d.f27081h = fVar.f27096h;
        boolean z11 = fVar.i;
        c1247d.i = z11;
        String str2 = fVar.f27097j;
        c1247d.f27082j = str2;
        ClassDiscriminatorMode classDiscriminatorMode = fVar.f27102o;
        c1247d.f27083k = classDiscriminatorMode;
        c1247d.f27084l = fVar.f27098k;
        c1247d.f27085m = fVar.f27099l;
        c1247d.f27086n = fVar.f27100m;
        c1247d.f27087o = fVar.f27101n;
        c1247d.f27088p = c0471a.f27066b;
        aVar.invoke(c1247d);
        if (z11) {
            if (!kotlin.jvm.internal.f.b(str2, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (classDiscriminatorMode != ClassDiscriminatorMode.f23366b) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (c1247d.f27079f) {
            if (!kotlin.jvm.internal.f.b(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.f.b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        boolean z12 = c1247d.f27076c;
        boolean z13 = c1247d.f27078e;
        boolean z14 = c1247d.f27079f;
        boolean z15 = c1247d.f27081h;
        boolean z16 = c1247d.f27087o;
        ClassDiscriminatorMode classDiscriminatorMode2 = c1247d.f27083k;
        boolean z17 = c1247d.f27074a;
        boolean z18 = c1247d.f27077d;
        boolean z19 = c1247d.f27075b;
        String str3 = c1247d.f27080g;
        boolean z20 = c1247d.i;
        String str4 = c1247d.f27082j;
        sa.f fVar2 = new sa.f(z17, z12, z18, z13, z14, z19, str3, z15, z20, str4, c1247d.f27084l, c1247d.f27085m, c1247d.f27086n, z16, classDiscriminatorMode2);
        Y8.a aVar2 = c1247d.f27088p;
        sa.k kVar = new sa.k(fVar2, aVar2);
        if (!kotlin.jvm.internal.f.b(aVar2, ua.a.f30484a)) {
            aVar2.b(new ta.q(z20, str4));
        }
        return kVar;
    }

    public static final boolean b(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive.isString();
        }
        return false;
    }

    public static /* synthetic */ AbstractC1244a a(boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = e0.f15081a.isDebug();
        }
        return a(z10);
    }

    public static final String a(JsonElement jsonElement) {
        if (b(jsonElement)) {
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive != null) {
                C1165D c1165d = sa.h.f27103a;
                String content = jsonPrimitive instanceof JsonNull ? null : jsonPrimitive.getContent();
                if (content != null) {
                    return content;
                }
            }
            return jsonElement.toString();
        }
        return jsonElement.toString();
    }
}
