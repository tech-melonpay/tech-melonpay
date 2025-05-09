package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.RSRuntimeException;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import androidx.renderscript.RenderScript;
import androidx.renderscript.ScriptIntrinsicBlur;

/* compiled from: AndroidXBlurImpl.java */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20612e;

    /* renamed from: a, reason: collision with root package name */
    public RenderScript f20613a;

    /* renamed from: b, reason: collision with root package name */
    public ScriptIntrinsicBlur f20614b;

    /* renamed from: c, reason: collision with root package name */
    public Allocation f20615c;

    /* renamed from: d, reason: collision with root package name */
    public Allocation f20616d;

    @Override // f2.c
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        this.f20615c.copyFrom(bitmap);
        this.f20614b.setInput(this.f20615c);
        this.f20614b.forEach(this.f20616d);
        this.f20616d.copyTo(bitmap2);
    }

    @Override // f2.c
    public final boolean b(Context context, Bitmap bitmap, float f10) {
        if (this.f20613a == null) {
            try {
                RenderScript create = RenderScript.create(context);
                this.f20613a = create;
                this.f20614b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (RSRuntimeException e10) {
                if (f20612e == null && context != null) {
                    f20612e = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
                }
                if (f20612e == Boolean.TRUE) {
                    throw e10;
                }
                release();
                return false;
            }
        }
        this.f20614b.setRadius(f10);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f20613a, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f20615c = createFromBitmap;
        this.f20616d = Allocation.createTyped(this.f20613a, createFromBitmap.getType());
        return true;
    }

    @Override // f2.c
    public final void release() {
        Allocation allocation = this.f20615c;
        if (allocation != null) {
            allocation.destroy();
            this.f20615c = null;
        }
        Allocation allocation2 = this.f20616d;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f20616d = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f20614b;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f20614b = null;
        }
        RenderScript renderScript = this.f20613a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f20613a = null;
        }
    }
}
