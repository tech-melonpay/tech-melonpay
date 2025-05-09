package Ca;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class i extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f787e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar, int i, List list) {
        super(str, true);
        this.f788f = dVar;
        this.f789g = i;
        this.f790h = list;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        switch (this.f787e) {
            case 0:
                this.f788f.f740l.getClass();
                try {
                    this.f788f.f753y.A(this.f789g, ErrorCode.CANCEL);
                    synchronized (this.f788f) {
                        this.f788f.f729A.remove(Integer.valueOf(this.f789g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f788f.f740l.getClass();
                try {
                    this.f788f.f753y.A(this.f789g, ErrorCode.CANCEL);
                    synchronized (this.f788f) {
                        this.f788f.f729A.remove(Integer.valueOf(this.f789g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar, int i, List list, boolean z10) {
        super(str, true);
        this.f788f = dVar;
        this.f789g = i;
        this.f790h = list;
    }
}
