package androidx.camera.video;

import C.AbstractC0497m;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.video.Recorder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.C1124b;

/* compiled from: Recording.java */
/* loaded from: classes.dex */
public final class m implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5770a;

    /* renamed from: b, reason: collision with root package name */
    public final Recorder f5771b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5772c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0497m f5773d;

    /* renamed from: e, reason: collision with root package name */
    public final CloseGuardHelper f5774e;

    public m(Recorder recorder, long j10, AbstractC0497m abstractC0497m, boolean z10) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5770a = atomicBoolean;
        CloseGuardHelper create = CloseGuardHelper.create();
        this.f5774e = create;
        this.f5771b = recorder;
        this.f5772c = j10;
        this.f5773d = abstractC0497m;
        if (z10) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d(0, null);
    }

    public final void d(final int i, final RuntimeException runtimeException) {
        this.f5774e.close();
        if (this.f5770a.getAndSet(true)) {
            return;
        }
        final Recorder recorder = this.f5771b;
        synchronized (recorder.f5487f) {
            try {
                if (!Recorder.n(this, recorder.f5492l) && !Recorder.n(this, recorder.f5491k)) {
                    Logger.d("Recorder", "stop() called on a recording that is no longer active: " + this.f5773d);
                    return;
                }
                d dVar = null;
                switch (recorder.f5489h.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        C1124b.q(Recorder.n(this, recorder.f5492l), null);
                        d dVar2 = recorder.f5492l;
                        recorder.f5492l = null;
                        recorder.v();
                        dVar = dVar2;
                        break;
                    case 4:
                    case 5:
                        recorder.A(Recorder.State.f5520g);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final Recorder.f fVar = recorder.f5491k;
                        recorder.f5484c.execute(new Runnable() { // from class: C.w
                            @Override // java.lang.Runnable
                            public final void run() {
                                Recorder.this.F(fVar, micros, i, runtimeException);
                            }
                        });
                        break;
                    case 6:
                    case 7:
                        C1124b.q(Recorder.n(this, recorder.f5491k), null);
                        break;
                }
                if (dVar != null) {
                    if (i == 10) {
                        Logger.e("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                    }
                    recorder.h(dVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException));
                }
            } finally {
            }
        }
    }

    public final void finalize() {
        try {
            this.f5774e.warnIfOpen();
            d(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
