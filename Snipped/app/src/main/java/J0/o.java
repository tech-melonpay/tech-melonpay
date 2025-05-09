package j0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f22297e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f22298f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22299g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22300h;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    public static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f6489k;
            return IconCompat.a.a((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f6491b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // j0.w
    public final void b(x xVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(xVar.f22382b).setBigContentTitle(this.f22378b);
        IconCompat iconCompat = this.f22297e;
        Context context = xVar.f22381a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, iconCompat.f(context));
            } else {
                int i = iconCompat.f6490a;
                if (i == -1) {
                    i = IconCompat.a.d(iconCompat.f6491b);
                }
                if (i == 1) {
                    IconCompat iconCompat2 = this.f22297e;
                    int i9 = iconCompat2.f6490a;
                    if (i9 == -1) {
                        Object obj = iconCompat2.f6491b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i9 == 1) {
                        bitmap = (Bitmap) iconCompat2.f6491b;
                    } else {
                        if (i9 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f6491b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f10 = min;
                        float f11 = 0.5f * f10;
                        float f12 = 0.9166667f * f11;
                        float f13 = 0.010416667f * f10;
                        paint.setColor(0);
                        paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f11, f11, f12, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f22299g) {
            IconCompat iconCompat3 = this.f22298f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (this.f22380d) {
            bigContentTitle.setSummaryText(this.f22379c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, this.f22300h);
            b.b(bigContentTitle, null);
        }
    }

    @Override // j0.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // j0.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f22298f = g(bundle.getParcelable("android.largeIcon.big"));
            this.f22299g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f22297e = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.f22300h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
