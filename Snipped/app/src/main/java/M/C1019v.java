package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.luminary.mobile.R;

/* compiled from: AppCompatSeekBar.java */
/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019v extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1020w f23805a;

    public C1019v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        U.a(this, getContext());
        C1020w c1020w = new C1020w(this);
        this.f23805a = c1020w;
        c1020w.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020w c1020w = this.f23805a;
        Drawable drawable = c1020w.f23807e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c1020w.f23806d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23805a.f23807e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23805a.d(canvas);
    }
}
