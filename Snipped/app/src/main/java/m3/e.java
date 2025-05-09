package m3;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class e implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23900a;

    public e(String str) {
        this.f23900a = str;
    }

    @Override // m3.i
    public final Object a() {
        throw new JsonIOException(this.f23900a);
    }
}
