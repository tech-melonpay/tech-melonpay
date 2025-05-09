package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import m.C0996F;
import m.C1002d;
import m.C1013o;
import m.U;
import m.W;
import m.X;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C1002d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1013o mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.a();
        }
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            c1013o.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        X x9;
        C1013o c1013o = this.mImageHelper;
        if (c1013o == null || (x9 = c1013o.f23791b) == null) {
            return null;
        }
        return x9.f23723a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        X x9;
        C1013o c1013o = this.mImageHelper;
        if (c1013o == null || (x9 = c1013o.f23791b) == null) {
            return null;
        }
        return x9.f23724b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.f23790a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            c1013o.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null && drawable != null && !this.mHasLevel) {
            c1013o.f23792c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C1013o c1013o2 = this.mImageHelper;
        if (c1013o2 != null) {
            c1013o2.a();
            if (this.mHasLevel) {
                return;
            }
            C1013o c1013o3 = this.mImageHelper;
            ImageView imageView = c1013o3.f23790a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1013o3.f23792c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            ImageView imageView = c1013o.f23790a;
            if (i != 0) {
                Drawable j10 = U4.b.j(imageView.getContext(), i);
                if (j10 != null) {
                    C0996F.a(j10);
                }
                imageView.setImageDrawable(j10);
            } else {
                imageView.setImageDrawable(null);
            }
            c1013o.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            c1013o.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            if (c1013o.f23791b == null) {
                c1013o.f23791b = new X();
            }
            X x9 = c1013o.f23791b;
            x9.f23723a = colorStateList;
            x9.f23726d = true;
            c1013o.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1013o c1013o = this.mImageHelper;
        if (c1013o != null) {
            if (c1013o.f23791b == null) {
                c1013o.f23791b = new X();
            }
            X x9 = c1013o.f23791b;
            x9.f23724b = mode;
            x9.f23725c = true;
            c1013o.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        this.mHasLevel = false;
        U.a(this, getContext());
        C1002d c1002d = new C1002d(this);
        this.mBackgroundTintHelper = c1002d;
        c1002d.d(attributeSet, i);
        C1013o c1013o = new C1013o(this);
        this.mImageHelper = c1013o;
        c1013o.b(attributeSet, i);
    }
}
