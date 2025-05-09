package ob;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: QRCodeGraphics.android.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24401b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f24402c;

    /* renamed from: d, reason: collision with root package name */
    public final Canvas f24403d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f24404e;

    static {
        Bitmap.CompressFormat[] values = Bitmap.CompressFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (Bitmap.CompressFormat compressFormat : values) {
            arrayList.add(compressFormat.name());
        }
    }

    public a(int i, int i9) {
        this.f24400a = i;
        this.f24401b = i9;
        Bitmap createBitmap = Bitmap.createBitmap(i, i9, Bitmap.Config.ARGB_8888);
        this.f24402c = createBitmap;
        this.f24403d = new Canvas(createBitmap);
        this.f24404e = new LinkedHashMap();
    }

    public static /* synthetic */ Paint c(a aVar, int i) {
        return aVar.b(i, Paint.Style.FILL, 0.0d);
    }

    public final void a(int i, int i9, int i10, int i11, int i12) {
        this.f24403d.drawRect(new Rect(i, i9, i10 + i, i11 + i9), c(this, i12));
    }

    public final Paint b(int i, Paint.Style style, double d10) {
        LinkedHashMap linkedHashMap = this.f24404e;
        Integer valueOf = Integer.valueOf(i);
        Object obj = linkedHashMap.get(valueOf);
        Object obj2 = obj;
        if (obj == null) {
            Paint paint = new Paint();
            paint.setColor(i);
            linkedHashMap.put(valueOf, paint);
            obj2 = paint;
        }
        Paint paint2 = (Paint) obj2;
        if (paint2.getStyle() != style) {
            paint2.setStyle(style);
        }
        paint2.setStrokeWidth((float) d10);
        return paint2;
    }
}
