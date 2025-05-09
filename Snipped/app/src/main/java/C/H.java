package C;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import ca.InterfaceC0650p;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f516b;

    public /* synthetic */ H(Object obj, int i) {
        this.f515a = i;
        this.f516b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$sort$0;
        Object obj3 = this.f516b;
        switch (this.f515a) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                Rect rect = (Rect) obj3;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            case 1:
                lambda$sort$0 = ((SurfaceSorter) obj3).lambda$sort$0((SessionConfig.OutputConfig) obj, (SessionConfig.OutputConfig) obj2);
                return lambda$sort$0;
            default:
                return ((Number) ((InterfaceC0650p) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
