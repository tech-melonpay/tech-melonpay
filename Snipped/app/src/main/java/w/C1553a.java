package w;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.Quirk;

/* compiled from: AeFpsRangeLegacyQuirk.java */
/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1553a implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public final Range<Integer> f30770a;

    public C1553a(u.n nVar) {
        Range[] rangeArr = (Range[]) nVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.f30770a = range;
    }
}
