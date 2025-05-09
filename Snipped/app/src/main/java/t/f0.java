package t;

import android.os.Build;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: StreamUseCaseUtil.java */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Config.Option<Long> f27212a = Config.Option.create("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f27213b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f27214c;

    static {
        HashMap hashMap = new HashMap();
        f27213b = hashMap;
        HashMap hashMap2 = new HashMap();
        f27214c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.PREVIEW;
            hashSet.add(captureType);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(captureType);
            hashSet2.add(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType2);
            hashSet5.add(captureType3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType3);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static s.a a(Config config, long j10) {
        Config.Option<Long> option = f27212a;
        if (config.containsOption(option) && ((Long) config.retrieveOption(option)).longValue() == j10) {
            return null;
        }
        MutableOptionsBundle from = MutableOptionsBundle.from(config);
        from.insertOption(option, Long.valueOf(j10));
        return new s.a(from);
    }

    public static boolean b(UseCaseConfigFactory.CaptureType captureType, long j10, List<UseCaseConfigFactory.CaptureType> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            HashMap hashMap = f27213b;
            return hashMap.containsKey(Long.valueOf(j10)) && ((Set) hashMap.get(Long.valueOf(j10))).contains(captureType);
        }
        HashMap hashMap2 = f27214c;
        if (!hashMap2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set set = (Set) hashMap2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<UseCaseConfigFactory.CaptureType> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Config config, UseCaseConfigFactory.CaptureType captureType) {
        if (((Boolean) config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (!config.containsOption(option)) {
            return false;
        }
        int intValue = ((Integer) config.retrieveOption(option)).intValue();
        int i = j0.f27283a[captureType.ordinal()];
        return i != 1 ? i != 2 ? false : false : intValue == 2;
    }
}
