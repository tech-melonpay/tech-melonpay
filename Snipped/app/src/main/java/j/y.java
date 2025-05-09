package J;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* compiled from: VideoEncoderInfoImpl.java */
/* loaded from: classes.dex */
public final class y extends s implements x {

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f2097b;

    public y(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f2084a.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f2097b = videoCapabilities;
    }

    @Override // J.x
    public final int a() {
        return this.f2097b.getWidthAlignment();
    }

    @Override // J.x
    public final Range<Integer> b() {
        return this.f2097b.getBitrateRange();
    }

    @Override // J.x
    public final Range<Integer> c(int i) {
        try {
            return this.f2097b.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // J.x
    public final Range<Integer> d(int i) {
        try {
            return this.f2097b.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // J.x
    public final int e() {
        return this.f2097b.getHeightAlignment();
    }

    @Override // J.x
    public final Range<Integer> f() {
        return this.f2097b.getSupportedWidths();
    }

    @Override // J.x
    public final boolean g(int i, int i9) {
        return this.f2097b.isSizeSupported(i, i9);
    }

    @Override // J.x
    public final Range<Integer> h() {
        return this.f2097b.getSupportedHeights();
    }
}
