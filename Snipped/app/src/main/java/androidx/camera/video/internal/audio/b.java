package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5650c;

    public /* synthetic */ b(boolean z10, int i, Object obj) {
        this.f5648a = i;
        this.f5649b = obj;
        this.f5650c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5648a) {
            case 0:
                AudioSource audioSource = (AudioSource) this.f5649b;
                int ordinal = audioSource.f5622g.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                audioSource.f5617b.set(null);
                audioSource.f5618c.set(false);
                audioSource.c(AudioSource.InternalState.f5638b);
                audioSource.f5616a.execute(new b(this.f5650c, 1, audioSource));
                audioSource.e();
                return;
            case 1:
                AudioSource audioSource2 = (AudioSource) this.f5649b;
                int ordinal2 = audioSource2.f5622g.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z10 = audioSource2.f5632r;
                boolean z11 = this.f5650c;
                if (z10 == z11) {
                    return;
                }
                audioSource2.f5632r = z11;
                if (audioSource2.f5622g == AudioSource.InternalState.f5638b) {
                    audioSource2.a();
                    return;
                }
                return;
            default:
                AudioSource audioSource3 = AudioSource.this;
                audioSource3.f5631q = this.f5650c;
                if (audioSource3.f5622g == AudioSource.InternalState.f5638b) {
                    audioSource3.a();
                    return;
                }
                return;
        }
    }
}
