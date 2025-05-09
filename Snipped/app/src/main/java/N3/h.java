package n3;

import com.google.gson.reflect.TypeToken;

/* compiled from: NumberTypeAdapter.java */
/* loaded from: classes.dex */
public final class h implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24130b;

    public /* synthetic */ h(Object obj, int i) {
        this.f24129a = i;
        this.f24130b = obj;
    }

    @Override // com.google.gson.s
    public final com.google.gson.r a(com.google.gson.g gVar, TypeToken typeToken) {
        switch (this.f24129a) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (i) this.f24130b;
                }
                return null;
            default:
                if (typeToken.getRawType() == Object.class) {
                    return new j(gVar, (com.google.gson.q) this.f24130b);
                }
                return null;
        }
    }
}
