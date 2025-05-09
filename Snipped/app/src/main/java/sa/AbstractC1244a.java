package sa;

import P9.AbstractC0499a;
import g9.C0771a;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.WriteMode;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import na.InterfaceC1083g;
import ta.s;
import ta.u;

/* compiled from: Json.kt */
/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1244a implements InterfaceC1083g {

    /* renamed from: d, reason: collision with root package name */
    public static final C0471a f27064d = new C0471a(new f(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, ClassDiscriminatorMode.f23366b), ua.a.f30484a);

    /* renamed from: a, reason: collision with root package name */
    public final f f27065a;

    /* renamed from: b, reason: collision with root package name */
    public final Y8.a f27066b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.json.internal.a f27067c = new kotlinx.serialization.json.internal.a();

    /* compiled from: Json.kt */
    /* renamed from: sa.a$a, reason: collision with other inner class name */
    public static final class C0471a extends AbstractC1244a {
    }

    public AbstractC1244a(f fVar, Y8.a aVar) {
        this.f27065a = fVar;
        this.f27066b = aVar;
    }

    @Override // na.InterfaceC1083g
    public final Y8.a a() {
        return this.f27066b;
    }

    @Override // na.InterfaceC1083g
    public final <T> String b(InterfaceC1081e<? super T> interfaceC1081e, T t3) {
        char[] cArr;
        Na.a aVar = new Na.a(5, (char) 0);
        ta.d dVar = ta.d.f29981d;
        synchronized (dVar) {
            P9.h hVar = (P9.h) dVar.f2859c;
            cArr = null;
            char[] cArr2 = (char[]) (hVar.isEmpty() ? null : hVar.removeLast());
            if (cArr2 != null) {
                dVar.f2858b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f2859c = cArr;
        try {
            new s(this.f27065a.f27093e ? new ta.h(aVar, this) : new C0771a(aVar), this, WriteMode.f23398c, new j[((AbstractC0499a) WriteMode.f23403h).a()]).s(interfaceC1081e, t3);
            return aVar.toString();
        } finally {
            aVar.e();
        }
    }

    @Override // na.InterfaceC1083g
    public final <T> T c(InterfaceC1077a<? extends T> interfaceC1077a, String str) {
        u uVar = new u(str);
        T t3 = (T) new ta.r(this, WriteMode.f23398c, uVar, interfaceC1077a.getDescriptor(), null).x(interfaceC1077a);
        if (uVar.e() == 10) {
            return t3;
        }
        u.m(uVar, "Expected EOF after parsing, but had " + uVar.f30029e.charAt(uVar.f30025a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final Object d(InterfaceC1078b interfaceC1078b, JsonElement jsonElement) {
        g kVar;
        if (jsonElement instanceof JsonObject) {
            kVar = new kotlinx.serialization.json.internal.c(this, (JsonObject) jsonElement, null, null);
        } else if (jsonElement instanceof JsonArray) {
            kVar = new ta.m(this, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof l) && !kotlin.jvm.internal.f.b(jsonElement, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new ta.k(this, (JsonPrimitive) jsonElement);
        }
        return ta.p.d(kVar, interfaceC1078b);
    }
}
