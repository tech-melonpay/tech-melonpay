package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;

/* compiled from: AutoValue_AudioStream_PacketInfo.java */
/* loaded from: classes.dex */
public final class e extends AudioStream.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5665b;

    public e(int i, long j10) {
        this.f5664a = i;
        this.f5665b = j10;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public final int a() {
        return this.f5664a;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public final long b() {
        return this.f5665b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.b)) {
            return false;
        }
        AudioStream.b bVar = (AudioStream.b) obj;
        return this.f5664a == bVar.a() && this.f5665b == bVar.b();
    }

    public final int hashCode() {
        int i = (this.f5664a ^ 1000003) * 1000003;
        long j10 = this.f5665b;
        return i ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "PacketInfo{sizeInBytes=" + this.f5664a + ", timestampNs=" + this.f5665b + "}";
    }
}
