package com.sumsub.sns.core.data.listener;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.internal.core.common.c0;
import com.sumsub.sns.internal.core.common.e0;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getFlagDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "context", "Landroid/content/Context;", "idensic-mobile-sdk-aar_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSDefaultCountryPickerKt {
    public static final Drawable getFlagDrawable(SNSCountryPicker.CountryItem countryItem, Context context) {
        String a10 = c0.f15062a.a(countryItem.getCode());
        return e0.f15081a.getIconHandler().onResolveIcon(context, "Flag/" + a10.toLowerCase(Locale.ROOT));
    }
}
