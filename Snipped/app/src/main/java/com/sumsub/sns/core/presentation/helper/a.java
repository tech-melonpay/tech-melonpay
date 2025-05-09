package com.sumsub.sns.core.presentation.helper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.z0;
import com.sumsub.sns.internal.core.theme.ImageElementName;
import com.sumsub.sns.internal.core.theme.b;
import com.sumsub.sns.internal.core.theme.d;
import java.util.List;
import java.util.Map;
import ka.C0969n;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14273a = new a();

    public final d a() {
        SNSJsonCustomization customization = e0.f15081a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        if (theme instanceof d) {
            return (d) theme;
        }
        return null;
    }

    public final b.e b(d dVar, SNSMetricElement sNSMetricElement) {
        Map<String, b> c2 = dVar.c();
        b bVar = c2 != null ? c2.get(sNSMetricElement.getValue()) : null;
        if (bVar instanceof b.e) {
            return (b.e) bVar;
        }
        return null;
    }

    public final String c(d dVar, SNSMetricElement sNSMetricElement) {
        Map<String, b> c2 = dVar.c();
        b bVar = c2 != null ? c2.get(sNSMetricElement.getValue()) : null;
        b.f fVar = bVar instanceof b.f ? (b.f) bVar : null;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public final Integer a(d dVar, SNSColorElement sNSColorElement, boolean z10) {
        b.a aVar;
        Map<String, b.a> a10 = dVar.a();
        if (a10 == null || (aVar = a10.get(sNSColorElement.getValue())) == null) {
            return null;
        }
        return z10 ? aVar.c() : aVar.d();
    }

    public final b.e b(SNSMetricElement sNSMetricElement) {
        d a10 = a();
        if (a10 != null) {
            return b(a10, sNSMetricElement);
        }
        return null;
    }

    public final Float a(d dVar, SNSMetricElement sNSMetricElement) {
        Map<String, b> c2 = dVar.c();
        b bVar = c2 != null ? c2.get(sNSMetricElement.getValue()) : null;
        b.C0250b c0250b = bVar instanceof b.C0250b ? (b.C0250b) bVar : null;
        if (c0250b != null) {
            return c0250b.b();
        }
        return null;
    }

    public final int[][] b() {
        return new int[][]{new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateProcessing}, new int[0]};
    }

    public final boolean a(View view) {
        return i.a(view.getResources().getConfiguration());
    }

    public final void a(TextView textView, String str) {
        if (f.b(str, SNSThemeMetric$TextAlignment.LEFT.getValue())) {
            textView.setGravity(8388611);
        } else if (f.b(str, SNSThemeMetric$TextAlignment.RIGHT.getValue())) {
            textView.setGravity(8388613);
        } else if (f.b(str, SNSThemeMetric$TextAlignment.CENTER.getValue())) {
            textView.setGravity(17);
        }
    }

    public final int a(View view, SNSColorElement sNSColorElement, int i) {
        Integer a10;
        d a11 = a();
        return (a11 == null || (a10 = a(a11, sNSColorElement, a(view))) == null) ? i : a10.intValue();
    }

    public final Integer a(View view, SNSColorElement sNSColorElement) {
        d a10 = a();
        if (a10 != null) {
            return a(a10, sNSColorElement, a(view));
        }
        return null;
    }

    public final Float a(SNSMetricElement sNSMetricElement) {
        d a10 = a();
        if (a10 != null) {
            return a(a10, sNSMetricElement);
        }
        return null;
    }

    public final Drawable a(Context context, String str) {
        return e0.f15081a.getIconHandler().onResolveIcon(context, str);
    }

    public static /* synthetic */ d a(a aVar, View view, Integer num, ColorStateList colorStateList, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            colorStateList = null;
        }
        return aVar.a(view, num, colorStateList);
    }

    public final BitmapDrawable a(d dVar, String str) {
        Bitmap e10;
        Map<String, b> b9 = dVar.b();
        b bVar = b9 != null ? b9.get(str) : null;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar == null || (e10 = cVar.e()) == null) {
            return null;
        }
        return new BitmapDrawable(e10);
    }

    public final BitmapDrawable a(d dVar, String str, String str2) {
        Map<String, b.c> b9;
        b.c cVar;
        Map<String, b.c> b10;
        b.c cVar2;
        Map<String, b> b11 = dVar.b();
        b bVar = b11 != null ? b11.get(str2) : null;
        b.d dVar2 = bVar instanceof b.d ? (b.d) bVar : null;
        Bitmap e10 = (dVar2 == null || (b10 = dVar2.b()) == null || (cVar2 = b10.get(str)) == null) ? null : cVar2.e();
        Bitmap e11 = (dVar2 == null || (b9 = dVar2.b()) == null || (cVar = b9.get("default")) == null) ? null : cVar.e();
        if (e10 == null) {
            e10 = e11;
        }
        if (e10 != null) {
            return new BitmapDrawable(e10);
        }
        return null;
    }

    public final d a(TextView textView, SNSTypographyElement sNSTypographyElement, SNSColorElement sNSColorElement) {
        b.g gVar;
        d a10 = a();
        if (a10 == null) {
            return null;
        }
        Map<String, b.g> d10 = a10.d();
        if (d10 != null && (gVar = d10.get(sNSTypographyElement.getValue())) != null) {
            Typeface h9 = gVar.h();
            if (h9 != null) {
                textView.setTypeface(h9);
            }
            textView.setTextSize(gVar.g());
        }
        a aVar = f14273a;
        Integer a11 = aVar.a(a10, sNSColorElement, aVar.a(textView));
        if (a11 != null) {
            int intValue = a11.intValue();
            if (textView instanceof EditText) {
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{Color.argb(95, Color.red(intValue), Color.green(intValue), Color.blue(intValue)), intValue}));
            } else {
                textView.setTextColor(intValue);
            }
        }
        Integer a12 = aVar.a(a10, SNSColorElement.CONTENT_LINK, aVar.a(textView));
        if (a12 == null) {
            return a10;
        }
        textView.setLinkTextColor(a12.intValue());
        return a10;
    }

    public final Drawable a(String str) {
        d a10 = a();
        if (a10 == null) {
            return null;
        }
        if (str.startsWith("DocType/")) {
            return f14273a.a(a10, z0.a((List<String>) C0969n.q0(C0969n.t0(str, "/"), new char[]{'_'})), ImageElementName.VERIFICATION_STEP_ICONS.getValue());
        }
        if (str.startsWith("default/")) {
            return f14273a.a(a10, str, ImageElementName.INSTRUCTIONS_IMAGES.getValue());
        }
        if (str.startsWith("IdentityType/")) {
            return f14273a.a(a10, C0969n.t0(str, "/"), ImageElementName.DOCUMENT_TYPE_ICONS.getValue());
        }
        return f14273a.a(a10, str);
    }

    public final d a(View view, Integer num, ColorStateList colorStateList) {
        d a10 = a();
        if (a10 == null) {
            return null;
        }
        a aVar = f14273a;
        ColorStateList a11 = aVar.a(aVar.a(view), num, colorStateList);
        if (view instanceof ImageView) {
            ((ImageView) view).setImageTintList(a11);
            return a10;
        }
        if (!(view instanceof TextView)) {
            return a10;
        }
        ((TextView) view).setTextColor(a11);
        return a10;
    }

    public final ColorStateList a(boolean z10, Integer num, ColorStateList colorStateList) {
        Integer num2;
        d a10 = a();
        if (a10 != null) {
            if (num == null) {
                num2 = f14273a.a(a10, SNSColorElement.CONTENT_NEUTRAL, z10);
                if (num2 == null) {
                    num2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateInit}, -65281)) : null;
                }
            } else {
                num2 = num;
            }
            a aVar = f14273a;
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WARNING;
            Integer a11 = aVar.a(a10, sNSColorElement, z10);
            if (a11 == null) {
                a11 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_statePending}, -65281)) : null;
                if (a11 == null) {
                    a11 = num2;
                }
            }
            Integer a12 = aVar.a(a10, SNSColorElement.CONTENT_SUCCESS, z10);
            if (a12 == null) {
                a12 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281)) : null;
                if (a12 == null) {
                    a12 = num2;
                }
            }
            Integer a13 = aVar.a(a10, SNSColorElement.CONTENT_CRITICAL, z10);
            if (a13 == null) {
                a13 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281)) : null;
                if (a13 == null) {
                    a13 = num2;
                }
            }
            Integer a14 = aVar.a(a10, sNSColorElement, z10);
            if (a14 == null) {
                a14 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateProcessing}, -65281)) : null;
                if (a14 == null) {
                    a14 = num2;
                }
            }
            Integer a15 = aVar.a(a10, SNSColorElement.CONTENT_WEAK, z10);
            if (a15 == null) {
                a15 = colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null;
                if (a15 == null) {
                    a15 = num2;
                }
            }
            if (num2 != null) {
                return new ColorStateList(aVar.b(), new int[]{num2.intValue(), a11.intValue(), a12.intValue(), a13.intValue(), a14.intValue(), a15.intValue()});
            }
        }
        return null;
    }
}
