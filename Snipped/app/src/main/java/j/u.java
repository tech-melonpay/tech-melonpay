package J;

import a3.InterfaceFutureC0509a;
import android.media.MediaCodec;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;

/* compiled from: InputBufferImpl.java */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f2085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2086b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f2087c;

    /* renamed from: d, reason: collision with root package name */
    public final CallbackToFutureAdapter.c f2088d;

    /* renamed from: e, reason: collision with root package name */
    public final CallbackToFutureAdapter.a<Void> f2089e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2090f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public long f2091g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2092h = false;

    public u(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.f2085a = mediaCodec;
        C1124b.o(i);
        this.f2086b = i;
        this.f2087c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f2088d = CallbackToFutureAdapter.a(new f(atomicReference, 4));
        CallbackToFutureAdapter.a<Void> aVar = (CallbackToFutureAdapter.a) atomicReference.get();
        aVar.getClass();
        this.f2089e = aVar;
    }

    @Override // J.t
    public final void a() {
        if (this.f2090f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        this.f2092h = true;
    }

    @Override // J.t
    public final InterfaceFutureC0509a<Void> b() {
        return Futures.nonCancellationPropagating(this.f2088d);
    }

    @Override // J.t
    public final ByteBuffer c() {
        if (this.f2090f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        return this.f2087c;
    }

    @Override // J.t
    public final boolean cancel() {
        CallbackToFutureAdapter.a<Void> aVar = this.f2089e;
        if (this.f2090f.getAndSet(true)) {
            return false;
        }
        try {
            this.f2085a.queueInputBuffer(this.f2086b, 0, 0, 0L, 0);
            aVar.b(null);
        } catch (IllegalStateException e10) {
            aVar.c(e10);
        }
        return true;
    }

    @Override // J.t
    public final boolean d() {
        CallbackToFutureAdapter.a<Void> aVar = this.f2089e;
        ByteBuffer byteBuffer = this.f2087c;
        if (this.f2090f.getAndSet(true)) {
            return false;
        }
        try {
            this.f2085a.queueInputBuffer(this.f2086b, byteBuffer.position(), byteBuffer.limit(), this.f2091g, this.f2092h ? 4 : 0);
            aVar.b(null);
            return true;
        } catch (IllegalStateException e10) {
            aVar.c(e10);
            return false;
        }
    }

    @Override // J.t
    public final void e(long j10) {
        if (this.f2090f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        C1124b.l(j10 >= 0);
        this.f2091g = j10;
    }
}
