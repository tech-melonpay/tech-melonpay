package Ca;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class h extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ka.f f785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, d dVar, int i, Ka.f fVar, int i9, boolean z10) {
        super(str, true);
        this.f783e = dVar;
        this.f784f = i;
        this.f785g = fVar;
        this.f786h = i9;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        try {
            q qVar = this.f783e.f740l;
            Ka.f fVar = this.f785g;
            int i = this.f786h;
            qVar.getClass();
            fVar.skip(i);
            this.f783e.f753y.A(this.f784f, ErrorCode.CANCEL);
            synchronized (this.f783e) {
                this.f783e.f729A.remove(Integer.valueOf(this.f784f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
