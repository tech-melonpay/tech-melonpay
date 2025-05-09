package c;

import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0610a f8487a = new C0610a();

    public final BackEvent a(float f10, float f11, float f12, int i) {
        return new BackEvent(f10, f11, f12, i);
    }

    public final float b(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
