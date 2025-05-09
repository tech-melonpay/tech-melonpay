package J;

import android.media.MediaCodec;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BufferCopiedEncodedData.java */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final CallbackToFutureAdapter.a<Void> f2057c;

    public g(i iVar) {
        MediaCodec.BufferInfo bufferInfo = iVar.f2059b;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.f2056b = bufferInfo2;
        ByteBuffer c2 = iVar.c();
        MediaCodec.BufferInfo bufferInfo3 = iVar.f2059b;
        c2.position(bufferInfo3.offset);
        c2.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo3.size);
        allocate.order(c2.order());
        allocate.put(c2);
        allocate.flip();
        this.f2055a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        CallbackToFutureAdapter.a(new f(atomicReference, 0));
        CallbackToFutureAdapter.a<Void> aVar = (CallbackToFutureAdapter.a) atomicReference.get();
        aVar.getClass();
        this.f2057c = aVar;
    }

    @Override // J.h
    public final long U() {
        return this.f2056b.presentationTimeUs;
    }

    @Override // J.h
    public final ByteBuffer c() {
        return this.f2055a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2057c.b(null);
    }

    @Override // J.h
    public final long size() {
        return this.f2056b.size;
    }

    @Override // J.h
    public final MediaCodec.BufferInfo w() {
        return this.f2056b;
    }
}
