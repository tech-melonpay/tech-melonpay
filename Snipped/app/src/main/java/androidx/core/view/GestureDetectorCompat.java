package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

@Deprecated
/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f6499a;

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f6499a = new GestureDetector(context, onGestureListener, handler);
    }
}
