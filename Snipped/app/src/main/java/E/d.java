package E;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: DynamicRangeMatchedEncoderProfilesProvider.java */
/* loaded from: classes.dex */
public final class d implements EncoderProfilesProvider {

    /* renamed from: a, reason: collision with root package name */
    public final EncoderProfilesProvider f996a;

    /* renamed from: b, reason: collision with root package name */
    public final DynamicRange f997b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f998c = new HashMap();

    public d(EncoderProfilesProvider encoderProfilesProvider, DynamicRange dynamicRange) {
        this.f996a = encoderProfilesProvider;
        this.f997b = dynamicRange;
    }

    public final EncoderProfilesProxy a(int i) {
        Set set;
        HashMap hashMap = this.f998c;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) hashMap.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.f996a;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = null;
        if (encoderProfilesProvider.hasProfile(i)) {
            EncoderProfilesProxy all = encoderProfilesProvider.getAll(i);
            if (all != null) {
                ArrayList arrayList = new ArrayList();
                for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : all.getVideoProfiles()) {
                    HashMap hashMap2 = K.a.f2211a;
                    DynamicRange dynamicRange = this.f997b;
                    Set set2 = (Set) hashMap2.get(Integer.valueOf(dynamicRange.getBitDepth()));
                    if (set2 != null && set2.contains(Integer.valueOf(videoProfileProxy.getBitDepth())) && (set = (Set) K.a.f2212b.get(Integer.valueOf(dynamicRange.getEncoding()))) != null && set.contains(Integer.valueOf(videoProfileProxy.getHdrFormat()))) {
                        arrayList.add(videoProfileProxy);
                    }
                }
                if (!arrayList.isEmpty()) {
                    immutableEncoderProfilesProxy = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
            hashMap.put(Integer.valueOf(i), immutableEncoderProfilesProxy);
        }
        return immutableEncoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i) {
        return a(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i) {
        return this.f996a.hasProfile(i) && a(i) != null;
    }
}
