package androidx.camera.view;

import a3.InterfaceFutureC0509a;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.CameraOrientationUtil;

/* compiled from: PreviewViewImplementation.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public Size f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f5848b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5849c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5850d = false;

    /* compiled from: PreviewViewImplementation.java */
    public interface a {
    }

    public c(PreviewView previewView, b bVar) {
        this.f5848b = previewView;
        this.f5849c = bVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(SurfaceRequest surfaceRequest, M.b bVar);

    public final void f() {
        View a10 = a();
        if (a10 == null || !this.f5850d) {
            return;
        }
        FrameLayout frameLayout = this.f5848b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        b bVar = this.f5849c;
        bVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            Logger.w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (bVar.f()) {
            if (a10 instanceof TextureView) {
                ((TextureView) a10).setTransform(bVar.d());
            } else {
                Display display = a10.getDisplay();
                boolean z10 = false;
                boolean z11 = (!bVar.f5845g || display == null || display.getRotation() == bVar.f5843e) ? false : true;
                boolean z12 = bVar.f5845g;
                if (!z12) {
                    if ((!z12 ? bVar.f5841c : -CameraOrientationUtil.surfaceRotationToDegrees(bVar.f5843e)) != 0) {
                        z10 = true;
                    }
                }
                if (z11 || z10) {
                    Logger.e("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF e10 = bVar.e(size, layoutDirection);
            a10.setPivotX(0.0f);
            a10.setPivotY(0.0f);
            a10.setScaleX(e10.width() / bVar.f5839a.getWidth());
            a10.setScaleY(e10.height() / bVar.f5839a.getHeight());
            a10.setTranslationX(e10.left - a10.getLeft());
            a10.setTranslationY(e10.top - a10.getTop());
        }
    }

    public abstract InterfaceFutureC0509a<Void> g();
}
