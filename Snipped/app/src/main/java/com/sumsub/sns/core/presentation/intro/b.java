package com.sumsub.sns.core.presentation.intro;

import O9.p;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.internal.core.theme.d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f14275a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14276b;

    public b(com.sumsub.sns.internal.core.data.source.extensions.a aVar, boolean z10) {
        this.f14275a = aVar;
        this.f14276b = z10;
    }

    public final void a(View view, Map<String, ?> map, int i, int i9) {
        Button button;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int dimensionPixelSize = this.f14276b ? 0 : context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Object obj = map.get(MessageBundle.TITLE_ENTRY);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            View b9 = b(context, str);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small);
            p pVar = p.f3034a;
            linearLayout.addView(b9, marginLayoutParams);
        }
        Object obj2 = map.get("subtitle");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null) {
            View a10 = a(context, str2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
            p pVar2 = p.f3034a;
            linearLayout.addView(a10, marginLayoutParams2);
        }
        int dimensionPixelSize2 = this.f14276b ? context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small) : 0;
        Object obj3 = map.get("contentBlocks");
        List<?> list = obj3 instanceof List ? (List) obj3 : null;
        if (list != null) {
            for (View view2 : new a(this.f14275a).a(context, list)) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                Resources resources = context.getResources();
                int i10 = R$dimen.sns_margin_small;
                marginLayoutParams3.topMargin = resources.getDimensionPixelSize(i10);
                marginLayoutParams3.bottomMargin = context.getResources().getDimensionPixelSize(i10);
                marginLayoutParams3.setMarginStart(dimensionPixelSize2);
                marginLayoutParams3.setMarginEnd(dimensionPixelSize2);
                p pVar3 = p.f3034a;
                linearLayout.addView(view2, marginLayoutParams3);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(i);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        }
        Object obj4 = map.get("actionTitle");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str3 == null || (button = (Button) view.findViewById(i9)) == null) {
            return;
        }
        button.setText(str3);
    }

    public final View b(Context context, CharSequence charSequence) {
        String value;
        TextView sNSH1TextView = this.f14276b ? new SNSH1TextView(context, null, 0, 0, 14, null) : new SNSH2TextView(context, null, 0, 0, 14, null);
        sNSH1TextView.setText(charSequence != null ? this.f14275a.a(charSequence) : null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small);
        sNSH1TextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 == null || (value = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        aVar.a(sNSH1TextView, value);
        return sNSH1TextView;
    }

    public /* synthetic */ b(com.sumsub.sns.internal.core.data.source.extensions.a aVar, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? true : z10);
    }

    public final View a(Context context, CharSequence charSequence) {
        TextView sNSBodyTextView;
        String value;
        if (this.f14276b) {
            sNSBodyTextView = new SNSSubtitle2TextView(context, null, 0, 0, 14, null);
        } else {
            sNSBodyTextView = new SNSBodyTextView(context, null, 0, 0, 14, null);
        }
        sNSBodyTextView.setText(charSequence != null ? this.f14275a.a(charSequence) : null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        sNSBodyTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 == null || (value = aVar.c(a10, SNSMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        aVar.a(sNSBodyTextView, value);
        return sNSBodyTextView;
    }
}
