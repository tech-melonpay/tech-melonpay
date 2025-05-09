package com.sumsub.sns.internal.core.theme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.theme.SNSCustomizationFileFormat;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.internal.core.theme.b;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import ka.C0967l;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.f;

/* loaded from: classes2.dex */
public final class d implements SNSCustomizationTheme {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16773f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SNSCustomizationFileFormat f16774a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, b.g> f16775b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, b.a> f16776c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, ? extends com.sumsub.sns.internal.core.theme.b> f16777d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, ? extends com.sumsub.sns.internal.core.theme.b> f16778e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16779a;

        static {
            int[] iArr = new int[SNSCustomizationFileFormat.values().length];
            iArr[SNSCustomizationFileFormat.CORDOVA.ordinal()] = 1;
            iArr[SNSCustomizationFileFormat.REACT_NATIVE.ordinal()] = 2;
            iArr[SNSCustomizationFileFormat.FLUTTER.ordinal()] = 3;
            iArr[SNSCustomizationFileFormat.NATIVE.ordinal()] = 4;
            f16779a = iArr;
        }
    }

    public final Map<String, b.a> a() {
        return this.f16776c;
    }

    public final Map<String, com.sumsub.sns.internal.core.theme.b> b() {
        return this.f16778e;
    }

    public final Map<String, com.sumsub.sns.internal.core.theme.b> c() {
        return this.f16777d;
    }

    public final Map<String, b.g> d() {
        return this.f16775b;
    }

    public final String a(String str) {
        String X = C0967l.X(C0967l.X(C0967l.X(str, " ", "", false), "/", "_", false), "-", "", false);
        int j02 = C0969n.j0('.', 0, 6, X);
        if (j02 != -1) {
            X = X.substring(0, j02);
        }
        return X.toLowerCase(Locale.ROOT);
    }

    @SuppressLint({"DiscouragedApi"})
    public final void a(Context context) {
        String str;
        Collection<? extends com.sumsub.sns.internal.core.theme.b> values;
        Bitmap bitmap;
        Collection<b.g> values2;
        Collection<? extends com.sumsub.sns.internal.core.theme.b> values3;
        Collection<b.g> values4;
        int i = b.f16779a[this.f16774a.ordinal()];
        if (i == 1 || i == 2) {
            str = "";
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str = "flutter_assets/";
        }
        SNSCustomizationFileFormat sNSCustomizationFileFormat = this.f16774a;
        if (sNSCustomizationFileFormat != SNSCustomizationFileFormat.CORDOVA && sNSCustomizationFileFormat != SNSCustomizationFileFormat.FLUTTER) {
            if (sNSCustomizationFileFormat == SNSCustomizationFileFormat.REACT_NATIVE) {
                Map<String, b.g> map = this.f16775b;
                if (map != null && (values4 = map.values()) != null) {
                    for (b.g gVar : values4) {
                        try {
                            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                            Logger.d$default(aVar, com.sumsub.sns.internal.log.c.a(this), "Loading typeface " + gVar.f(), null, 4, null);
                            String a10 = a(gVar.f());
                            Logger.d$default(aVar, com.sumsub.sns.internal.log.c.a(this), "filename=" + a10, null, 4, null);
                            int identifier = context.getResources().getIdentifier(a10, "raw", context.getPackageName());
                            Logger.d$default(aVar, com.sumsub.sns.internal.log.c.a(this), "resId=" + identifier, null, 4, null);
                            gVar.a(f.a(context, identifier));
                        } catch (Exception e10) {
                            com.sumsub.sns.internal.log.a aVar2 = com.sumsub.sns.internal.log.a.f17535a;
                            String a11 = com.sumsub.sns.internal.log.c.a(this);
                            String message = e10.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            aVar2.e(a11, message, e10);
                        }
                    }
                }
                Map<String, ? extends com.sumsub.sns.internal.core.theme.b> map2 = this.f16778e;
                if (map2 == null || (values3 = map2.values()) == null) {
                    return;
                }
                for (com.sumsub.sns.internal.core.theme.b bVar : values3) {
                    if (bVar instanceof b.c) {
                        b.c cVar = (b.c) bVar;
                        cVar.a(a(context, cVar));
                    } else if (bVar instanceof b.d) {
                        for (b.c cVar2 : ((b.d) bVar).b().values()) {
                            cVar2.a(a(context, cVar2));
                        }
                    } else {
                        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Theme: Invalid element in images: " + bVar, null, 4, null);
                    }
                }
                return;
            }
            return;
        }
        Map<String, b.g> map3 = this.f16775b;
        if (map3 != null && (values2 = map3.values()) != null) {
            for (b.g gVar2 : values2) {
                try {
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Loading typeface " + gVar2.f(), null, 4, null);
                    gVar2.a(Typeface.createFromAsset(context.getResources().getAssets(), str + gVar2.f()));
                } catch (Exception e11) {
                    com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "", e11);
                }
            }
        }
        Map<String, ? extends com.sumsub.sns.internal.core.theme.b> map4 = this.f16778e;
        if (map4 == null || (values = map4.values()) == null) {
            return;
        }
        for (com.sumsub.sns.internal.core.theme.b bVar2 : values) {
            if (bVar2 instanceof b.c) {
                b.c cVar3 = (b.c) bVar2;
                String f10 = cVar3.f();
                cVar3.a(f10 != null ? a(context.getResources().getAssets(), str.concat(f10)) : null);
            } else if (bVar2 instanceof b.d) {
                for (b.c cVar4 : ((b.d) bVar2).b().values()) {
                    String f11 = cVar4.f();
                    if (f11 != null) {
                        bitmap = a(context.getResources().getAssets(), str.concat(f11));
                        Integer h9 = cVar4.h();
                        if (h9 != null && h9.intValue() > 1 && bitmap != null) {
                            Integer h10 = cVar4.h();
                            int intValue = h10 != null ? h10.intValue() : 1;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() * intValue, bitmap.getHeight() * intValue, true);
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                    } else {
                        bitmap = null;
                    }
                    cVar4.a(bitmap);
                }
            } else {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Theme: Invalid element in images: " + bVar2, null, 4, null);
            }
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public final Bitmap a(Context context, b.c cVar) {
        String a10;
        if (cVar.f() == null || (a10 = a(cVar.f())) == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(a10, "drawable", context.getPackageName());
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), identifier);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        String a11 = com.sumsub.sns.internal.log.c.a(this);
        StringBuilder sb2 = new StringBuilder("loadRNImage: ");
        sb2.append(cVar);
        sb2.append(", filename: ");
        sb2.append(a10);
        sb2.append(", resId: ");
        sb2.append(identifier);
        sb2.append(", result=");
        sb2.append(decodeResource != null ? Integer.valueOf(decodeResource.getWidth()) : null);
        sb2.append('x');
        sb2.append(decodeResource != null ? Integer.valueOf(decodeResource.getHeight()) : null);
        Logger.d$default(aVar, a11, sb2.toString(), null, 4, null);
        return decodeResource;
    }

    public final Bitmap a(AssetManager assetManager, String str) {
        try {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Loading image " + str, null, 4, null);
            return BitmapFactory.decodeStream(assetManager.open(str));
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(this);
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.d(a10, message, e10);
            return null;
        }
    }
}
