package Ca;

import okhttp3.internal.http2.ErrorCode;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class j extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, d dVar, int i, ErrorCode errorCode) {
        super(str, true);
        this.f791e = dVar;
        this.f792f = i;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        this.f791e.f740l.getClass();
        synchronized (this.f791e) {
            this.f791e.f729A.remove(Integer.valueOf(this.f792f));
            O9.p pVar = O9.p.f3034a;
        }
        return -1L;
    }
}
