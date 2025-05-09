package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.model.p;
import java.nio.charset.Charset;
import m1.AbstractC1025a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1025a abstractC1025a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f6490a = abstractC1025a.j(iconCompat.f6490a, 1);
        byte[] bArr = iconCompat.f6492c;
        if (abstractC1025a.h(2)) {
            bArr = abstractC1025a.f();
        }
        iconCompat.f6492c = bArr;
        Parcelable parcelable = iconCompat.f6493d;
        if (abstractC1025a.h(3)) {
            parcelable = abstractC1025a.k();
        }
        iconCompat.f6493d = parcelable;
        iconCompat.f6494e = abstractC1025a.j(iconCompat.f6494e, 4);
        iconCompat.f6495f = abstractC1025a.j(iconCompat.f6495f, 5);
        Parcelable parcelable2 = iconCompat.f6496g;
        if (abstractC1025a.h(6)) {
            parcelable2 = abstractC1025a.k();
        }
        iconCompat.f6496g = (ColorStateList) parcelable2;
        String str = iconCompat.i;
        if (abstractC1025a.h(7)) {
            str = abstractC1025a.l();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f6498j;
        if (abstractC1025a.h(8)) {
            str2 = abstractC1025a.l();
        }
        iconCompat.f6498j = str2;
        iconCompat.f6497h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f6490a) {
            case -1:
                Parcelable parcelable3 = iconCompat.f6493d;
                if (parcelable3 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6491b = parcelable3;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable4 = iconCompat.f6493d;
                if (parcelable4 != null) {
                    iconCompat.f6491b = parcelable4;
                } else {
                    byte[] bArr2 = iconCompat.f6492c;
                    iconCompat.f6491b = bArr2;
                    iconCompat.f6490a = 3;
                    iconCompat.f6494e = 0;
                    iconCompat.f6495f = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f6492c, Charset.forName("UTF-16"));
                iconCompat.f6491b = str3;
                if (iconCompat.f6490a == 2 && iconCompat.f6498j == null) {
                    iconCompat.f6498j = str3.split(p.f15541a, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6491b = iconCompat.f6492c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1025a abstractC1025a) {
        abstractC1025a.getClass();
        iconCompat.i = iconCompat.f6497h.name();
        switch (iconCompat.f6490a) {
            case -1:
                iconCompat.f6493d = (Parcelable) iconCompat.f6491b;
                break;
            case 1:
            case 5:
                iconCompat.f6493d = (Parcelable) iconCompat.f6491b;
                break;
            case 2:
                iconCompat.f6492c = ((String) iconCompat.f6491b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6492c = (byte[]) iconCompat.f6491b;
                break;
            case 4:
            case 6:
                iconCompat.f6492c = iconCompat.f6491b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6490a;
        if (-1 != i) {
            abstractC1025a.s(i, 1);
        }
        byte[] bArr = iconCompat.f6492c;
        if (bArr != null) {
            abstractC1025a.n(2);
            abstractC1025a.p(bArr);
        }
        Parcelable parcelable = iconCompat.f6493d;
        if (parcelable != null) {
            abstractC1025a.n(3);
            abstractC1025a.t(parcelable);
        }
        int i9 = iconCompat.f6494e;
        if (i9 != 0) {
            abstractC1025a.s(i9, 4);
        }
        int i10 = iconCompat.f6495f;
        if (i10 != 0) {
            abstractC1025a.s(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.f6496g;
        if (colorStateList != null) {
            abstractC1025a.n(6);
            abstractC1025a.t(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC1025a.n(7);
            abstractC1025a.u(str);
        }
        String str2 = iconCompat.f6498j;
        if (str2 != null) {
            abstractC1025a.n(8);
            abstractC1025a.u(str2);
        }
    }
}
