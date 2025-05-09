package com.squareup.picasso;

import Ka.y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;

/* compiled from: RequestHandler.java */
/* loaded from: classes2.dex */
public abstract class m {
    public static void a(int i, int i9, int i10, int i11, BitmapFactory.Options options, k kVar) {
        int max;
        double floor;
        if (i11 > i9 || i10 > i) {
            if (i9 == 0) {
                floor = Math.floor(i10 / i);
            } else if (i == 0) {
                floor = Math.floor(i11 / i9);
            } else {
                int floor2 = (int) Math.floor(i11 / i9);
                int floor3 = (int) Math.floor(i10 / i);
                max = kVar.f13473j ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(k kVar) {
        boolean a10 = kVar.a();
        Bitmap.Config config = kVar.f13480q;
        boolean z10 = config != null;
        boolean z11 = kVar.f13479p;
        if (!a10 && !z10 && !z11) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = a10;
        options.inInputShareable = z11;
        options.inPurgeable = z11;
        if (z10) {
            options.inPreferredConfig = config;
        }
        return options;
    }

    public abstract boolean b(k kVar);

    public int d() {
        return 0;
    }

    public abstract a e(k kVar, int i);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }

    /* compiled from: RequestHandler.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Picasso.LoadedFrom f13491a;

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f13492b;

        /* renamed from: c, reason: collision with root package name */
        public final y f13493c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13494d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(y yVar, Picasso.LoadedFrom loadedFrom) {
            this(null, yVar, loadedFrom, 0);
            StringBuilder sb2 = o.f13496a;
            if (yVar == null) {
                throw new NullPointerException("source == null");
            }
        }

        public a(Bitmap bitmap, y yVar, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (yVar != null)) {
                this.f13492b = bitmap;
                this.f13493c = yVar;
                StringBuilder sb2 = o.f13496a;
                this.f13491a = loadedFrom;
                this.f13494d = i;
                return;
            }
            throw new AssertionError();
        }
    }
}
