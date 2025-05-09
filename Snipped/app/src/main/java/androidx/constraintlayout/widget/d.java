package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jmrtd.PassportService;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f6449a;

    /* renamed from: b, reason: collision with root package name */
    public View f6450b;

    /* renamed from: c, reason: collision with root package name */
    public int f6451c;

    public View getContent() {
        return this.f6450b;
    }

    public int getEmptyVisibility() {
        return this.f6451c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(PassportService.DEFAULT_MAX_BLOCKSIZE, PassportService.DEFAULT_MAX_BLOCKSIZE, PassportService.DEFAULT_MAX_BLOCKSIZE);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f6449a == i) {
            return;
        }
        View view = this.f6450b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f6450b.getLayoutParams()).f6279f0 = false;
            this.f6450b = null;
        }
        this.f6449a = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f6451c = i;
    }
}
