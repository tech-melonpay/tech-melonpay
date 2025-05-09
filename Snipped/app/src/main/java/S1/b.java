package S1;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ChessboardDrawable.kt */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3335b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3336a;

    public b(int i, int i9, int i10) {
        Paint paint = new Paint();
        int i11 = i10 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        paint.setColor(i9);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(i10, 0, i11, i10);
        canvas.drawRect(rect, paint);
        rect.offsetTo(0, i10);
        canvas.drawRect(rect, paint);
        paint.reset();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.f3336a = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPaint(this.f3336a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3336a.getColorFilter() == null ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3336a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3336a.setColorFilter(colorFilter);
    }
}
