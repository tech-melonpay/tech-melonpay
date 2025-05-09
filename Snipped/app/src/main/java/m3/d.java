package m3;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class d implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23899a;

    public d(String str) {
        this.f23899a = str;
    }

    @Override // m3.i
    public final Object a() {
        throw new JsonIOException(this.f23899a);
    }
}
