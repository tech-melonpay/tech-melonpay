package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.luminary.mobile.R;

/* compiled from: AppCompatRatingBar.java */
/* renamed from: m.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017t extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final r f23804a;

    public C1017t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        U.a(this, getContext());
        r rVar = new r(this);
        this.f23804a = rVar;
        rVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        Bitmap bitmap = this.f23804a.f23799b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
