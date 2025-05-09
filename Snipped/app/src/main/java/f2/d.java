package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.RSRuntimeException;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import androidx.renderscript.RenderScript;
import androidx.renderscript.ScriptIntrinsicBlur;

/* compiled from: SupportLibraryBlurImpl.java */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20617e;

    /* renamed from: a, reason: collision with root package name */
    public RenderScript f20618a;

    /* renamed from: b, reason: collision with root package name */
    public ScriptIntrinsicBlur f20619b;

    /* renamed from: c, reason: collision with root package name */
    public Allocation f20620c;

    /* renamed from: d, reason: collision with root package name */
    public Allocation f20621d;

    @Override // f2.c
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        this.f20620c.copyFrom(bitmap);
        this.f20619b.setInput(this.f20620c);
        this.f20619b.forEach(this.f20621d);
        this.f20621d.copyTo(bitmap2);
    }

    @Override // f2.c
    public final boolean b(Context context, Bitmap bitmap, float f10) {
        if (this.f20618a == null) {
            try {
                RenderScript create = RenderScript.create(context);
                this.f20618a = create;
                this.f20619b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (RSRuntimeException e10) {
                if (f20617e == null && context != null) {
                    f20617e = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
                }
                if (f20617e == Boolean.TRUE) {
                    throw e10;
                }
                release();
                return false;
            }
        }
        this.f20619b.setRadius(f10);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f20618a, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f20620c = createFromBitmap;
        this.f20621d = Allocation.createTyped(this.f20618a, createFromBitmap.getType());
        return true;
    }

    @Override // f2.c
    public final void release() {
        Allocation allocation = this.f20620c;
        if (allocation != null) {
            allocation.destroy();
            this.f20620c = null;
        }
        Allocation allocation2 = this.f20621d;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f20621d = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f20619b;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f20619b = null;
        }
        RenderScript renderScript = this.f20618a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f20618a = null;
        }
    }
}
