package f2;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: AndroidStockBlurImpl.java */
@TargetApi(17)
/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740a implements c {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20607e;

    /* renamed from: a, reason: collision with root package name */
    public RenderScript f20608a;

    /* renamed from: b, reason: collision with root package name */
    public ScriptIntrinsicBlur f20609b;

    /* renamed from: c, reason: collision with root package name */
    public Allocation f20610c;

    /* renamed from: d, reason: collision with root package name */
    public Allocation f20611d;

    @Override // f2.c
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        this.f20610c.copyFrom(bitmap);
        this.f20609b.setInput(this.f20610c);
        this.f20609b.forEach(this.f20611d);
        this.f20611d.copyTo(bitmap2);
    }

    @Override // f2.c
    public final boolean b(Context context, Bitmap bitmap, float f10) {
        if (this.f20608a == null) {
            try {
                RenderScript create = RenderScript.create(context);
                this.f20608a = create;
                this.f20609b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (RSRuntimeException e10) {
                if (f20607e == null && context != null) {
                    f20607e = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
                }
                if (f20607e == Boolean.TRUE) {
                    throw e10;
                }
                release();
                return false;
            }
        }
        this.f20609b.setRadius(f10);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f20608a, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f20610c = createFromBitmap;
        this.f20611d = Allocation.createTyped(this.f20608a, createFromBitmap.getType());
        return true;
    }

    @Override // f2.c
    public final void release() {
        Allocation allocation = this.f20610c;
        if (allocation != null) {
            allocation.destroy();
            this.f20610c = null;
        }
        Allocation allocation2 = this.f20611d;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f20611d = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f20609b;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f20609b = null;
        }
        RenderScript renderScript = this.f20608a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f20608a = null;
        }
    }
}
