package C;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import java.util.ArrayList;

/* compiled from: VideoCapabilities.java */
/* loaded from: classes.dex */
public interface E {

    /* renamed from: a, reason: collision with root package name */
    public static final a f504a = new a();

    /* compiled from: VideoCapabilities.java */
    public class a implements E {
        @Override // C.E
        public final ArrayList b(DynamicRange dynamicRange) {
            return new ArrayList();
        }
    }

    default E.e a(Size size, DynamicRange dynamicRange) {
        return null;
    }

    ArrayList b(DynamicRange dynamicRange);

    default E.e c(o oVar, DynamicRange dynamicRange) {
        return null;
    }
}
