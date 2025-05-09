package E;

import C.K;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p.InterfaceC1096a;

/* compiled from: BackupHdrProfileEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class b implements EncoderProfilesProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final K f991d = new K(1);

    /* renamed from: e, reason: collision with root package name */
    public static final Timebase f992e = Timebase.UPTIME;

    /* renamed from: a, reason: collision with root package name */
    public final EncoderProfilesProvider f993a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1096a<EncoderProfilesProxy.VideoProfileProxy, EncoderProfilesProxy.VideoProfileProxy> f994b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f995c;

    public b(EncoderProfilesProvider encoderProfilesProvider) {
        K k3 = f991d;
        this.f995c = new HashMap();
        this.f993a = encoderProfilesProvider;
        this.f994b = k3;
    }

    public final EncoderProfilesProxy a(int i) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        int i9;
        EncoderProfilesProxy.VideoProfileProxy create;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy create2;
        HashMap hashMap = this.f995c;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.f993a;
        if (!encoderProfilesProvider.hasProfile(i)) {
            return null;
        }
        EncoderProfilesProxy all = encoderProfilesProvider.getAll(i);
        if (all != null) {
            ArrayList arrayList = new ArrayList(all.getVideoProfiles());
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = all.getVideoProfiles().iterator();
            while (true) {
                if (!it.hasNext()) {
                    videoProfileProxy = null;
                    break;
                }
                videoProfileProxy = it.next();
                if (videoProfileProxy.getHdrFormat() == 0) {
                    break;
                }
            }
            if (videoProfileProxy == null) {
                create = null;
            } else {
                int codec = videoProfileProxy.getCodec();
                String mediaType = videoProfileProxy.getMediaType();
                int profile = videoProfileProxy.getProfile();
                if (1 != videoProfileProxy.getHdrFormat()) {
                    codec = 5;
                    mediaType = EncoderProfilesProxy.getVideoCodecMimeType(5);
                    profile = 2;
                }
                int i10 = codec;
                String str = mediaType;
                int i11 = profile;
                int bitrate = videoProfileProxy.getBitrate();
                int bitDepth = videoProfileProxy.getBitDepth();
                if (10 == bitDepth) {
                    i9 = bitrate;
                } else {
                    int doubleValue = (int) (bitrate * new Rational(10, bitDepth).doubleValue());
                    if (Logger.isDebugEnabled("BackupHdrProfileEncoderProfilesProvider")) {
                        Logger.d("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(bitrate), 10, Integer.valueOf(bitDepth), Integer.valueOf(doubleValue)));
                    }
                    i9 = doubleValue;
                }
                create = EncoderProfilesProxy.VideoProfileProxy.create(i10, str, i9, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), i11, 10, videoProfileProxy.getChromaSubsampling(), 1);
            }
            EncoderProfilesProxy.VideoProfileProxy apply = this.f994b.apply(create);
            if (apply != null) {
                arrayList.add(apply);
            }
            if (!arrayList.isEmpty()) {
                create2 = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                hashMap.put(Integer.valueOf(i), create2);
                return create2;
            }
        }
        create2 = null;
        hashMap.put(Integer.valueOf(i), create2);
        return create2;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        return a(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        return this.f993a.hasProfile(i) && a(i) != null;
    }
}
