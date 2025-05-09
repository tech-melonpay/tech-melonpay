package androidx.camera.video.internal.audio;

import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5647b;

    public /* synthetic */ a(Object obj, int i) {
        this.f5646a = i;
        this.f5647b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5646a) {
            case 0:
                AudioSource audioSource = (AudioSource) this.f5647b;
                int ordinal = audioSource.f5622g.ordinal();
                if (ordinal == 1) {
                    audioSource.c(AudioSource.InternalState.f5637a);
                    audioSource.e();
                    break;
                } else if (ordinal == 2) {
                    Logger.w("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    break;
                }
                break;
            default:
                AudioSource audioSource2 = AudioSource.this;
                audioSource2.f5631q = true;
                if (audioSource2.f5622g == AudioSource.InternalState.f5638b) {
                    audioSource2.a();
                    break;
                }
                break;
        }
    }
}
