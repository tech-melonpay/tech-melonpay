package P8;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.o;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public final class e implements P8.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f3103a;

    /* compiled from: LruCache.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f3104a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3105b;

        public a(Bitmap bitmap, int i) {
            this.f3104a = bitmap;
            this.f3105b = i;
        }
    }

    public e(Context context) {
        StringBuilder sb2 = o.f13496a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3103a = new d((int) ((((context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7));
    }
}
