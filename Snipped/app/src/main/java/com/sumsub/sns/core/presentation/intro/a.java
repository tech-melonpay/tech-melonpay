package com.sumsub.sns.core.presentation.intro;

import O9.p;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSIntroItemView;
import com.sumsub.sns.core.widget.SNSListItemView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.theme.d;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f14274a;

    public a(com.sumsub.sns.internal.core.data.source.extensions.a aVar) {
        this.f14274a = aVar;
    }

    public final View a(Context context, String str) {
        SNSImageView sNSImageView = new SNSImageView(context, null, 0, 0, 14, null);
        sNSImageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(context, str));
        return sNSImageView;
    }

    public final View b(Context context, CharSequence charSequence) {
        SNSBodyTextView sNSBodyTextView = new SNSBodyTextView(context, null, 0, 0, 14, null);
        sNSBodyTextView.setText(charSequence != null ? this.f14274a.a(charSequence) : null);
        return sNSBodyTextView;
    }

    public final View c(Context context, String str, CharSequence charSequence, CharSequence charSequence2) {
        String value;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        SNSImageView sNSImageView = new SNSImageView(context, null, 0, 0, 14, null);
        sNSImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        sNSImageView.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(context, str));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelSize(R$dimen.sns_icon_size_huge));
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium_small);
        p pVar = p.f3034a;
        linearLayout.addView(sNSImageView, marginLayoutParams);
        SNSH2TextView sNSH2TextView = new SNSH2TextView(context, null, 0, 0, 14, null);
        sNSH2TextView.setText(charSequence != null ? this.f14274a.a(charSequence) : null);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 == null || (value = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        aVar.a(sNSH2TextView, value);
        ViewGroup.MarginLayoutParams a11 = a();
        a11.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        linearLayout.addView(sNSH2TextView, a11);
        SNSBodyTextView sNSBodyTextView = new SNSBodyTextView(context, null, 0, 0, 14, null);
        sNSBodyTextView.setText(charSequence2 != null ? this.f14274a.a(charSequence2) : null);
        ViewGroup.MarginLayoutParams a12 = a();
        Resources resources = context.getResources();
        int i = R$dimen.sns_margin_small_tiny;
        a12.topMargin = resources.getDimensionPixelSize(i);
        a12.bottomMargin = context.getResources().getDimensionPixelSize(i);
        linearLayout.addView(sNSBodyTextView, a12);
        return linearLayout;
    }

    public final View a(Context context, CharSequence charSequence) {
        String value;
        SNSH2TextView sNSH2TextView = new SNSH2TextView(context, null, 0, 0, 14, null);
        sNSH2TextView.setText(charSequence != null ? this.f14274a.a(charSequence) : null);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 == null || (value = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        aVar.a(sNSH2TextView, value);
        return sNSH2TextView;
    }

    public final View b(Context context, String str, CharSequence charSequence, CharSequence charSequence2) {
        return a(context, str, charSequence, charSequence2, SNSStepState.REJECTED);
    }

    public final View b(Context context, List<? extends Map<String, ?>> list) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            SNSListItemView sNSListItemView = new SNSListItemView(context, null, 0, 0, 14, null);
            SNSIconHandler iconHandler = e0.f15081a.getIconHandler();
            String str = (String) map.get("image");
            if (str == null) {
                str = "";
            }
            sNSListItemView.setIconStart(iconHandler.onResolveIcon(context, str));
            String str2 = (String) map.get(MessageBundle.TITLE_ENTRY);
            Spanned spanned = null;
            sNSListItemView.setTitle(str2 != null ? this.f14274a.a(str2) : null);
            String str3 = (String) map.get("subtitle");
            if (str3 != null) {
                spanned = this.f14274a.a(str3);
            }
            sNSListItemView.setSubtitle(spanned);
            linearLayout.addView(sNSListItemView, a());
        }
        return linearLayout;
    }

    public final View a(Context context, String str, CharSequence charSequence, CharSequence charSequence2) {
        return a(context, str, charSequence, charSequence2, SNSStepState.APPROVED);
    }

    public final View a(Context context, String str, CharSequence charSequence, CharSequence charSequence2, SNSStepState sNSStepState) {
        SNSIntroItemView sNSIntroItemView = new SNSIntroItemView(context, null, 0, 0, 14, null);
        sNSIntroItemView.setTitle(charSequence != null ? this.f14274a.a(charSequence) : null);
        sNSIntroItemView.setSubtitle(charSequence2 != null ? this.f14274a.a(charSequence2) : null);
        sNSIntroItemView.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(context, str));
        SNSStepViewExtensionsKt.setSnsStepState(sNSIntroItemView, sNSStepState);
        return sNSIntroItemView;
    }

    public final ViewGroup.MarginLayoutParams a() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final List<View> a(Context context, List<?> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj2 = map.get("type");
            str = "";
            View view = null;
            view = null;
            if (f.b(obj2, "image")) {
                Object obj3 = map.get("image");
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                view = a(context, str2 != null ? str2 : "");
            } else if (f.b(obj2, "header")) {
                Object obj4 = map.get("header");
                String str3 = obj4 instanceof String ? (String) obj4 : null;
                if (str3 == null) {
                    Object obj5 = map.get(TextBundle.TEXT_ENTRY);
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 != null) {
                        str = str4;
                    }
                } else {
                    str = str3;
                }
                view = a(context, (CharSequence) str);
            } else if (f.b(obj2, TextBundle.TEXT_ENTRY)) {
                Object obj6 = map.get(TextBundle.TEXT_ENTRY);
                view = b(context, obj6 instanceof String ? (String) obj6 : null);
            } else if (f.b(obj2, "single")) {
                Object obj7 = map.get("image");
                String str5 = obj7 instanceof String ? (String) obj7 : null;
                str = str5 != null ? str5 : "";
                Object obj8 = map.get("header");
                CharSequence charSequence = obj8 instanceof String ? (String) obj8 : null;
                Object obj9 = map.get(TextBundle.TEXT_ENTRY);
                view = c(context, str, charSequence, obj9 instanceof String ? (String) obj9 : null);
            } else if (f.b(obj2, "do")) {
                Object obj10 = map.get("image");
                String str6 = obj10 instanceof String ? (String) obj10 : null;
                str = str6 != null ? str6 : "";
                Object obj11 = map.get("header");
                CharSequence charSequence2 = obj11 instanceof String ? (String) obj11 : null;
                Object obj12 = map.get(TextBundle.TEXT_ENTRY);
                view = a(context, str, charSequence2, obj12 instanceof String ? (String) obj12 : null);
            } else if (f.b(obj2, "dont")) {
                Object obj13 = map.get("image");
                String str7 = obj13 instanceof String ? (String) obj13 : null;
                str = str7 != null ? str7 : "";
                Object obj14 = map.get("header");
                CharSequence charSequence3 = obj14 instanceof String ? (String) obj14 : null;
                Object obj15 = map.get(TextBundle.TEXT_ENTRY);
                view = b(context, str, charSequence3, obj15 instanceof String ? (String) obj15 : null);
            } else if (f.b(obj2, "listItems")) {
                Object obj16 = map.get("listItems");
                List list2 = obj16 instanceof List ? (List) obj16 : null;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj17 : list2) {
                        if (obj17 instanceof Map) {
                            arrayList3.add(obj17);
                        }
                    }
                    view = b(context, arrayList3);
                }
            }
            if (view != null) {
                arrayList2.add(view);
            }
        }
        return arrayList2;
    }
}
