package J;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import pa.C1124b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements CallbackToFutureAdapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl.b f2075b;

    public /* synthetic */ o(EncoderImpl.b bVar, int i) {
        this.f2074a = i;
        this.f2075b = bVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
        switch (this.f2074a) {
            case 0:
                final EncoderImpl.b bVar = this.f2075b;
                final int i = 0;
                bVar.f5730d.f5700h.execute(new Runnable() { // from class: J.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                aVar.b(bVar.f5728b);
                                break;
                            default:
                                final EncoderImpl.b bVar2 = bVar;
                                BufferProvider.State state = bVar2.f5728b;
                                BufferProvider.State state2 = BufferProvider.State.f5613a;
                                CallbackToFutureAdapter.a aVar2 = aVar;
                                if (state != state2) {
                                    if (state != BufferProvider.State.f5614b) {
                                        aVar2.c(new IllegalStateException("Unknown state: " + bVar2.f5728b));
                                        break;
                                    } else {
                                        aVar2.c(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    EncoderImpl encoderImpl = bVar2.f5730d;
                                    final InterfaceFutureC0509a<t> a10 = encoderImpl.a();
                                    Futures.propagate(a10, aVar2);
                                    final int i9 = 0;
                                    aVar2.a(new Runnable() { // from class: J.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i9) {
                                                case 0:
                                                    EncoderImpl.b bVar3 = bVar2;
                                                    bVar3.getClass();
                                                    InterfaceFutureC0509a interfaceFutureC0509a = a10;
                                                    if (!interfaceFutureC0509a.cancel(true)) {
                                                        C1124b.q(interfaceFutureC0509a.isDone(), null);
                                                        try {
                                                            ((t) interfaceFutureC0509a.get()).cancel();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            Logger.w(bVar3.f5730d.f5693a, "Unable to cancel the input buffer: " + e10);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bVar2.f5729c.remove(a10);
                                                    break;
                                            }
                                        }
                                    }, CameraXExecutors.directExecutor());
                                    bVar2.f5729c.add(a10);
                                    final int i10 = 1;
                                    a10.addListener(new Runnable() { // from class: J.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    EncoderImpl.b bVar3 = bVar2;
                                                    bVar3.getClass();
                                                    InterfaceFutureC0509a interfaceFutureC0509a = a10;
                                                    if (!interfaceFutureC0509a.cancel(true)) {
                                                        C1124b.q(interfaceFutureC0509a.isDone(), null);
                                                        try {
                                                            ((t) interfaceFutureC0509a.get()).cancel();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            Logger.w(bVar3.f5730d.f5693a, "Unable to cancel the input buffer: " + e10);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bVar2.f5729c.remove(a10);
                                                    break;
                                            }
                                        }
                                    }, encoderImpl.f5700h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final EncoderImpl.b bVar2 = this.f2075b;
                final int i9 = 1;
                bVar2.f5730d.f5700h.execute(new Runnable() { // from class: J.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                aVar.b(bVar2.f5728b);
                                break;
                            default:
                                final EncoderImpl.b bVar22 = bVar2;
                                BufferProvider.State state = bVar22.f5728b;
                                BufferProvider.State state2 = BufferProvider.State.f5613a;
                                CallbackToFutureAdapter.a aVar2 = aVar;
                                if (state != state2) {
                                    if (state != BufferProvider.State.f5614b) {
                                        aVar2.c(new IllegalStateException("Unknown state: " + bVar22.f5728b));
                                        break;
                                    } else {
                                        aVar2.c(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    EncoderImpl encoderImpl = bVar22.f5730d;
                                    final InterfaceFutureC0509a a10 = encoderImpl.a();
                                    Futures.propagate(a10, aVar2);
                                    final int i92 = 0;
                                    aVar2.a(new Runnable() { // from class: J.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i92) {
                                                case 0:
                                                    EncoderImpl.b bVar3 = bVar22;
                                                    bVar3.getClass();
                                                    InterfaceFutureC0509a interfaceFutureC0509a = a10;
                                                    if (!interfaceFutureC0509a.cancel(true)) {
                                                        C1124b.q(interfaceFutureC0509a.isDone(), null);
                                                        try {
                                                            ((t) interfaceFutureC0509a.get()).cancel();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            Logger.w(bVar3.f5730d.f5693a, "Unable to cancel the input buffer: " + e10);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bVar22.f5729c.remove(a10);
                                                    break;
                                            }
                                        }
                                    }, CameraXExecutors.directExecutor());
                                    bVar22.f5729c.add(a10);
                                    final int i10 = 1;
                                    a10.addListener(new Runnable() { // from class: J.q
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    EncoderImpl.b bVar3 = bVar22;
                                                    bVar3.getClass();
                                                    InterfaceFutureC0509a interfaceFutureC0509a = a10;
                                                    if (!interfaceFutureC0509a.cancel(true)) {
                                                        C1124b.q(interfaceFutureC0509a.isDone(), null);
                                                        try {
                                                            ((t) interfaceFutureC0509a.get()).cancel();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e10) {
                                                            Logger.w(bVar3.f5730d.f5693a, "Unable to cancel the input buffer: " + e10);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bVar22.f5729c.remove(a10);
                                                    break;
                                            }
                                        }
                                    }, encoderImpl.f5700h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
