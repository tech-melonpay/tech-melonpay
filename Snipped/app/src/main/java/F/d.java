package F;

import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1136b;

    public /* synthetic */ d(f fVar, int i) {
        this.f1135a = i;
        this.f1136b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1135a) {
            case 0:
                f fVar = this.f1136b;
                fVar.f5675k.set(false);
                fVar.f5672g.stop();
                synchronized (fVar.f5670e) {
                    fVar.f5671f = null;
                    fVar.f5668c.clear();
                }
                return;
            case 1:
                f fVar2 = this.f1136b;
                fVar2.getClass();
                try {
                    fVar2.f5672g.start();
                    if (fVar2.f5675k.getAndSet(true)) {
                        return;
                    }
                    fVar2.c();
                    return;
                } catch (AudioStream.AudioStreamException e10) {
                    throw new RuntimeException(e10);
                }
            case 2:
                this.f1136b.c();
                return;
            default:
                f fVar3 = this.f1136b;
                fVar3.f5675k.set(false);
                fVar3.f5672g.release();
                synchronized (fVar3.f5670e) {
                    fVar3.f5671f = null;
                    fVar3.f5668c.clear();
                }
                return;
        }
    }
}
