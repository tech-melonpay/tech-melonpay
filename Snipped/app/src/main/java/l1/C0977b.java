package l1;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat.java */
/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0978c f23466a;

    public C0977b(AbstractC0978c abstractC0978c) {
        this.f23466a = abstractC0978c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f23466a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f23466a.b(drawable);
    }
}
