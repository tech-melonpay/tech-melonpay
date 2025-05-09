package Ia;

import O9.p;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.ByteString;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class f extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f1988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, long j10) {
        super(str, true);
        this.f1988e = dVar;
        this.f1989f = j10;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        d dVar = this.f1988e;
        synchronized (dVar) {
            try {
                if (!dVar.f1973t) {
                    j jVar = dVar.f1963j;
                    if (jVar != null) {
                        int i = dVar.f1975v ? dVar.f1974u : -1;
                        dVar.f1974u++;
                        dVar.f1975v = true;
                        p pVar = p.f3034a;
                        if (i != -1) {
                            StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                            sb2.append(dVar.f1957c);
                            sb2.append("ms (after ");
                            dVar.i(new SocketTimeoutException(s3.b.m(sb2, i - 1, " successful ping/pongs)")), null);
                        } else {
                            try {
                                jVar.d(9, ByteString.f24696d);
                            } catch (IOException e10) {
                                dVar.i(e10, null);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1989f;
    }
}
