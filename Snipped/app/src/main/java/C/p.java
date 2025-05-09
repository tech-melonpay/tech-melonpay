package C;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f569b;

    public /* synthetic */ p(int i, int i9) {
        this.f568a = i9;
        this.f569b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f568a) {
            case 0:
                int area = SizeUtil.getArea((Size) obj);
                int i = this.f569b;
                return Math.abs(area - i) - Math.abs(SizeUtil.getArea((Size) obj2) - i);
            default:
                int intValue = ((Integer) obj).intValue();
                int i9 = this.f569b;
                int abs = Math.abs(intValue - i9) - Math.abs(((Integer) obj2).intValue() - i9);
                return (int) (abs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(abs));
        }
    }
}
