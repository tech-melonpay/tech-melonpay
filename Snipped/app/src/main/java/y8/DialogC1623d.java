package y8;

import F8.o;
import O9.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0652r;
import com.luminary.mobile.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import qrcode.QRCode;
import qrcode.QRCodeBuilder;
import t6.AbstractC1355i2;
import v8.DialogC1549a;

/* compiled from: QrCodeDialog.kt */
/* renamed from: y8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC1623d extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final String f31133q;

    /* renamed from: r, reason: collision with root package name */
    public final String f31134r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1355i2 f31135s;

    public DialogC1623d(Context context, String str, String str2) {
        super(context);
        this.f31133q = str;
        this.f31134r = str2;
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1355i2.f29096q;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1355i2 abstractC1355i2 = (AbstractC1355i2) F0.f.f(from, R.layout.dialog_qr, null, false, null);
        this.f31135s = abstractC1355i2;
        setCancelable(false);
        setContentView(abstractC1355i2.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1355i2.f29097n, 500L, new g8.g(this, 23));
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Bitmap bitmap;
        ByteArrayOutputStream byteArrayOutputStream;
        j().setState(3);
        super.onCreate(bundle);
        Integer z10 = D9.b.z(this.f31134r);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (z10 != null) {
            bitmap = BitmapFactory.decodeResource(getContext().getResources(), z10.intValue());
        } else {
            bitmap = null;
        }
        float f10 = 57;
        int C10 = U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10);
        int C11 = U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(C10 / width, C11 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        float f11 = 78;
        Bitmap createBitmap2 = Bitmap.createBitmap(U4.b.C(Resources.getSystem().getDisplayMetrics().density * f11), U4.b.C(Resources.getSystem().getDisplayMetrics().density * f11), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawColor(-1);
        canvas.drawBitmap(createBitmap, (r2 - createBitmap.getWidth()) / 2.0f, (r3 - createBitmap.getHeight()) / 2.0f, new Paint());
        InterfaceC0652r<QRCode, ob.a, Integer, Integer, p> interfaceC0652r = QRCode.f26084k;
        QRCodeBuilder.QRCodeShapesEnum[] qRCodeShapesEnumArr = QRCodeBuilder.QRCodeShapesEnum.f26109a;
        QRCodeBuilder qRCodeBuilder = new QRCodeBuilder();
        qRCodeBuilder.f26100b = -16777216;
        qRCodeBuilder.f26101c = 0;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            QRCodeBuilder.b(qRCodeBuilder, byteArray, U4.b.C(Resources.getSystem().getDisplayMetrics().density * f11), U4.b.C(f11 * Resources.getSystem().getDisplayMetrics().density));
            this.f31135s.f29098o.setImageBitmap(QRCode.a(qRCodeBuilder.a(this.f31133q)).f24402c);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
