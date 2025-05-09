package u0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import u0.C1505i;

/* compiled from: FontRequestWorker.java */
/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1501e implements Callable<C1505i.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1500d f30100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30101d;

    public CallableC1501e(String str, Context context, C1500d c1500d, int i) {
        this.f30098a = str;
        this.f30099b = context;
        this.f30100c = c1500d;
        this.f30101d = i;
    }

    @Override // java.util.concurrent.Callable
    public final C1505i.a call() {
        Object[] objArr = {this.f30100c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return C1505i.b(this.f30098a, this.f30099b, Collections.unmodifiableList(arrayList), this.f30101d);
    }
}
