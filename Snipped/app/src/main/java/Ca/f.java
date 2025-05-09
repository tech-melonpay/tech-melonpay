package Ca;

import java.io.IOException;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class f extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, int i, int i9) {
        super(str, true);
        this.f777e = dVar;
        this.f778f = i;
        this.f779g = i9;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        int i = this.f778f;
        int i9 = this.f779g;
        d dVar = this.f777e;
        dVar.getClass();
        try {
            dVar.f753y.y(i, i9, true);
            return -1L;
        } catch (IOException e10) {
            dVar.i(e10);
            return -1L;
        }
    }
}
