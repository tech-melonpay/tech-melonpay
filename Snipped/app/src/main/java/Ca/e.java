package Ca;

import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.http2.ErrorCode;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class e extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, d dVar, Object obj, int i) {
        super(str, true);
        this.f774e = i;
        this.f775f = dVar;
        this.f776g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ya.AbstractC1633a
    public final long a() {
        switch (this.f774e) {
            case 0:
                this.f775f.f731b.a((r) ((Ref$ObjectRef) this.f776g).f23179a);
                break;
            default:
                try {
                    this.f775f.f731b.b((n) this.f776g);
                    break;
                } catch (IOException e10) {
                    Ea.h hVar = Ea.h.f1121a;
                    Ea.h hVar2 = Ea.h.f1121a;
                    String str = "Http2Connection.Listener failure for " + this.f775f.f733d;
                    hVar2.getClass();
                    Ea.h.i(4, str, e10);
                    try {
                        ((n) this.f776g).c(ErrorCode.PROTOCOL_ERROR, e10);
                        break;
                    } catch (IOException unused) {
                        break;
                    }
                }
        }
        return -1L;
    }
}
