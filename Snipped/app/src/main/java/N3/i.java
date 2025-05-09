package n3;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import r3.C1149a;

/* compiled from: NumberTypeAdapter.java */
/* loaded from: classes.dex */
public final class i extends com.google.gson.r<Number> {

    /* renamed from: b, reason: collision with root package name */
    public static final h f24131b = new h(new i(ToNumberPolicy.f10318b), 0);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.q f24132a;

    public i(com.google.gson.q qVar) {
        this.f24132a = qVar;
    }

    @Override // com.google.gson.r
    public final Number a(C1149a c1149a) {
        JsonToken k02 = c1149a.k0();
        int ordinal = k02.ordinal();
        if (ordinal == 5 || ordinal == 6) {
            return this.f24132a.a(c1149a);
        }
        if (ordinal == 8) {
            c1149a.Y();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + k02 + "; at path " + c1149a.getPath());
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Number number) {
        bVar.V(number);
    }
}
