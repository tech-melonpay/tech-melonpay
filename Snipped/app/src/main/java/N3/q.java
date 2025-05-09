package n3;

import com.google.gson.reflect.TypeToken;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class q implements com.google.gson.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.r f24207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24208c;

    public /* synthetic */ q(Object obj, com.google.gson.r rVar, int i) {
        this.f24206a = i;
        this.f24208c = obj;
        this.f24207b = rVar;
    }

    @Override // com.google.gson.s
    public final com.google.gson.r a(com.google.gson.g gVar, TypeToken typeToken) {
        switch (this.f24206a) {
            case 0:
                if (typeToken.equals((TypeToken) this.f24208c)) {
                    break;
                }
                break;
            default:
                if (typeToken.getRawType() == ((Class) this.f24208c)) {
                    break;
                }
                break;
        }
        return this.f24207b;
    }

    public String toString() {
        switch (this.f24206a) {
            case 1:
                return "Factory[type=" + ((Class) this.f24208c).getName() + ",adapter=" + this.f24207b + "]";
            default:
                return super.toString();
        }
    }
}
