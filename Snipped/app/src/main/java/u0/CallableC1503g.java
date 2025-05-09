package u0;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;
import u0.C1505i;

/* compiled from: FontRequestWorker.java */
/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1503g implements Callable<C1505i.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f30105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30106d;

    public CallableC1503g(String str, Context context, List list, int i) {
        this.f30103a = str;
        this.f30104b = context;
        this.f30105c = list;
        this.f30106d = i;
    }

    @Override // java.util.concurrent.Callable
    public final C1505i.a call() {
        try {
            return C1505i.b(this.f30103a, this.f30104b, this.f30105c, this.f30106d);
        } catch (Throwable unused) {
            return new C1505i.a(-3);
        }
    }
}
