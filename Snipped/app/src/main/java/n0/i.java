package n0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import m0.e;
import u0.C1507k;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public final class i extends j {
    public static Font g(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i9 = i(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int i11 = i(fontStyle, font2.getStyle());
            if (i11 < i9) {
                font = font2;
                i9 = i11;
            }
        }
        return font;
    }

    public static FontFamily h(C1507k[] c1507kArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = c1507kArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            C1507k c1507k = c1507kArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(c1507k.f30116a, "r", null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(c1507k.f30118c).setSlant(c1507k.f30119d ? 1 : 0).setTtcIndex(c1507k.f30117b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // n0.j
    public final Typeface a(Context context, e.b bVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (e.c cVar : bVar.f23846a) {
                try {
                    Font build = new Font.Builder(resources, cVar.f23852f).setWeight(cVar.f23848b).setSlant(cVar.f23849c ? 1 : 0).setTtcIndex(cVar.f23851e).setFontVariationSettings(cVar.f23850d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // n0.j
    public final Typeface b(Context context, C1507k[] c1507kArr, int i) {
        try {
            FontFamily h9 = h(c1507kArr, context.getContentResolver());
            if (h9 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h9).setStyle(g(h9, i).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // n0.j
    public final Typeface c(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h9 = h((C1507k[]) list.get(0), contentResolver);
            if (h9 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h9);
            for (int i9 = 1; i9 < list.size(); i9++) {
                FontFamily h10 = h((C1507k[]) list.get(i9), contentResolver);
                if (h10 != null) {
                    customFallbackBuilder.addCustomFallback(h10);
                }
            }
            return customFallbackBuilder.setStyle(g(h9, i).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // n0.j
    public final Typeface d(Context context, Resources resources, int i, String str, int i9) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // n0.j
    public final C1507k f(C1507k[] c1507kArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
