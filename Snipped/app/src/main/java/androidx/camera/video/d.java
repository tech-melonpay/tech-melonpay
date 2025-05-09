package androidx.camera.video;

import C.AbstractC0497m;
import androidx.camera.video.Recorder;
import java.util.concurrent.Executor;
import x0.InterfaceC1579a;

/* compiled from: AutoValue_Recorder_RecordingRecord.java */
/* loaded from: classes.dex */
public final class d extends Recorder.f {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0497m f5589g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f5590h;
    public final InterfaceC1579a<q> i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5591j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5592k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5593l;

    public d(AbstractC0497m abstractC0497m, Executor executor, InterfaceC1579a interfaceC1579a, boolean z10, long j10) {
        if (abstractC0497m == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f5589g = abstractC0497m;
        this.f5590h = executor;
        this.i = interfaceC1579a;
        this.f5591j = z10;
        this.f5592k = false;
        this.f5593l = j10;
    }

    @Override // androidx.camera.video.Recorder.f
    public final long A() {
        return this.f5593l;
    }

    @Override // androidx.camera.video.Recorder.f
    public final boolean C() {
        return this.f5591j;
    }

    @Override // androidx.camera.video.Recorder.f
    public final boolean E() {
        return this.f5592k;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        InterfaceC1579a<q> interfaceC1579a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recorder.f)) {
            return false;
        }
        Recorder.f fVar = (Recorder.f) obj;
        return this.f5589g.equals(fVar.y()) && ((executor = this.f5590h) != null ? executor.equals(fVar.j()) : fVar.j() == null) && ((interfaceC1579a = this.i) != null ? interfaceC1579a.equals(fVar.p()) : fVar.p() == null) && this.f5591j == fVar.C() && this.f5592k == fVar.E() && this.f5593l == fVar.A();
    }

    public final int hashCode() {
        int hashCode = (this.f5589g.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f5590h;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        InterfaceC1579a<q> interfaceC1579a = this.i;
        int hashCode3 = (((hashCode2 ^ (interfaceC1579a != null ? interfaceC1579a.hashCode() : 0)) * 1000003) ^ (this.f5591j ? 1231 : 1237)) * 1000003;
        int i = this.f5592k ? 1231 : 1237;
        long j10 = this.f5593l;
        return ((hashCode3 ^ i) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    @Override // androidx.camera.video.Recorder.f
    public final Executor j() {
        return this.f5590h;
    }

    @Override // androidx.camera.video.Recorder.f
    public final InterfaceC1579a<q> p() {
        return this.i;
    }

    public final String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f5589g + ", getCallbackExecutor=" + this.f5590h + ", getEventListener=" + this.i + ", hasAudioEnabled=" + this.f5591j + ", isPersistent=" + this.f5592k + ", getRecordingId=" + this.f5593l + "}";
    }

    @Override // androidx.camera.video.Recorder.f
    public final AbstractC0497m y() {
        return this.f5589g;
    }
}
