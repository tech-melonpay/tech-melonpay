package m;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f23797c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f23798a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f23799b;

    public r(ProgressBar progressBar) {
        this.f23798a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.f23798a;
        Z f10 = Z.f(progressBar.getContext(), attributeSet, f23797c, i, 0);
        Drawable c2 = f10.c(0);
        if (c2 != null) {
            if (c2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i9 = 0; i9 < numberOfFrames; i9++) {
                    Drawable b9 = b(animationDrawable.getFrame(i9), true);
                    b9.setLevel(ModuleDescriptor.MODULE_VERSION);
                    animationDrawable2.addFrame(b9, animationDrawable.getDuration(i9));
                }
                animationDrawable2.setLevel(ModuleDescriptor.MODULE_VERSION);
                c2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c2);
        }
        Drawable c10 = f10.c(1);
        if (c10 != null) {
            progressBar.setProgressDrawable(b(c10, false));
        }
        f10.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z10) {
        if (drawable instanceof o0.b) {
            o0.b bVar = (o0.b) drawable;
            Drawable b9 = bVar.b();
            if (b9 != null) {
                bVar.a(b(b9, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    layerDrawable2.setId(i9, layerDrawable.getId(i9));
                    layerDrawable2.setLayerGravity(i9, layerDrawable.getLayerGravity(i9));
                    layerDrawable2.setLayerWidth(i9, layerDrawable.getLayerWidth(i9));
                    layerDrawable2.setLayerHeight(i9, layerDrawable.getLayerHeight(i9));
                    layerDrawable2.setLayerInsetLeft(i9, layerDrawable.getLayerInsetLeft(i9));
                    layerDrawable2.setLayerInsetRight(i9, layerDrawable.getLayerInsetRight(i9));
                    layerDrawable2.setLayerInsetTop(i9, layerDrawable.getLayerInsetTop(i9));
                    layerDrawable2.setLayerInsetBottom(i9, layerDrawable.getLayerInsetBottom(i9));
                    layerDrawable2.setLayerInsetStart(i9, layerDrawable.getLayerInsetStart(i9));
                    layerDrawable2.setLayerInsetEnd(i9, layerDrawable.getLayerInsetEnd(i9));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f23799b == null) {
                    this.f23799b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
