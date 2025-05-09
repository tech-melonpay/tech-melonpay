package xa;

import Ka.f;
import Ka.k;
import Ka.w;
import O9.p;
import ca.InterfaceC0646l;
import java.io.IOException;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes2.dex */
public final class e extends k {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0646l<IOException, p> f30955b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30956c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(w wVar, InterfaceC0646l<? super IOException, p> interfaceC0646l) {
        super(wVar);
        this.f30955b = interfaceC0646l;
    }

    @Override // Ka.k, Ka.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30956c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f30956c = true;
            this.f30955b.invoke(e10);
        }
    }

    @Override // Ka.k, Ka.w, java.io.Flushable
    public final void flush() {
        if (this.f30956c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f30956c = true;
            this.f30955b.invoke(e10);
        }
    }

    @Override // Ka.k, Ka.w
    public final void z(f fVar, long j10) {
        if (this.f30956c) {
            fVar.skip(j10);
            return;
        }
        try {
            super.z(fVar, j10);
        } catch (IOException e10) {
            this.f30956c = true;
            this.f30955b.invoke(e10);
        }
    }
}
