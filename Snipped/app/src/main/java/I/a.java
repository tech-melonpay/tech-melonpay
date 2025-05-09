package I;

import C.p;
import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: AudioConfigUtil.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(androidx.camera.video.a aVar) {
        int e10 = aVar.e();
        if (e10 == -1) {
            Logger.d("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d("AudioConfigUtil", "Using provided AUDIO source: " + e10);
        return e10;
    }

    public static int b(androidx.camera.video.a aVar) {
        int f10 = aVar.f();
        if (f10 == -1) {
            Logger.d("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d("AudioConfigUtil", "Using provided AUDIO source format: " + f10);
        return f10;
    }

    public static int c(int i, int i9, int i10, int i11, int i12, Range<Integer> range) {
        int doubleValue = (int) (new Rational(i11, i12).doubleValue() * new Rational(i9, i10).doubleValue() * i);
        String format = Logger.isDebugEnabled("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(doubleValue)) : "";
        if (!androidx.camera.video.a.f5571a.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            doubleValue = clamp.intValue();
            if (Logger.isDebugEnabled("AudioConfigUtil")) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, clamp));
            }
        }
        Logger.d("AudioConfigUtil", format);
        return doubleValue;
    }

    public static int d(Range<Integer> range, int i, int i9, int i10) {
        ArrayList arrayList = null;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            if (range.contains((Range<Integer>) Integer.valueOf(i12))) {
                if (i12 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i12, i == 1 ? 16 : 12, i9) > 0) {
                        return i12;
                    }
                }
                StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i12, i, "Sample rate ", "Hz is not supported by audio source with channel count ", " and source format ");
                q10.append(i9);
                Logger.d("AudioConfigUtil", q10.toString());
            } else {
                Logger.d("AudioConfigUtil", "Sample rate " + i12 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                Logger.d("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i10 + "Hz");
                arrayList = new ArrayList(F.a.f1123a);
                Collections.sort(arrayList, new p(i10, 1));
            }
            if (i11 >= arrayList.size()) {
                Logger.d("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i12 = ((Integer) arrayList.get(i11)).intValue();
            i11++;
        }
    }
}
