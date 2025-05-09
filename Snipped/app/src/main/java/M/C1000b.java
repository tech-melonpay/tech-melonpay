package m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: ActionBarBackgroundDrawable.java */
/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f23743a;

    public C1000b(ActionBarContainer actionBarContainer) {
        this.f23743a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f23743a;
        if (actionBarContainer.f4843h) {
            Drawable drawable = actionBarContainer.f4842g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4840e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f4841f;
        if (drawable3 == null || !actionBarContainer.i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f23743a;
        if (actionBarContainer.f4843h) {
            if (actionBarContainer.f4842g != null) {
                actionBarContainer.f4840e.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4840e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
