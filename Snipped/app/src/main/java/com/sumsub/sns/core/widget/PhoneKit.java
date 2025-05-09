package com.sumsub.sns.core.widget;

import android.content.Context;
import android.os.Bundle;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001BK\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/sumsub/sns/core/widget/PhoneKit;", "", "", "", "Lcom/sumsub/sns/internal/core/data/model/CountryCodeToNameMap;", "countries", "Lcom/sumsub/sns/internal/core/data/model/remote/c;", "Lcom/sumsub/sns/internal/core/data/model/PhoneCountryCodeWithMasks;", "phoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "validListener", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;)V", "Landroid/os/Bundle;", "outState", "LO9/p;", "saveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "detach", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "input", "", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "defaultCountry", "savedInstanceState", "attachToInput", "(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/List;Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;Landroid/os/Bundle;)V", "country", "", "isUser", "setCountry", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;Z)V", "Ljava/util/Map;", "getCountries", "()Ljava/util/Map;", "getPhoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "getValidListener", "()Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "isValid", "()Z", "getCountry", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "getMask", "()Lcom/sumsub/sns/internal/core/data/model/remote/c;", "mask", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class PhoneKit {
    private final Map<String, String> countries;
    private final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> phoneMasks;
    private final ValidationListener validListener;

    public PhoneKit(Map<String, String> map, Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2, ValidationListener validationListener) {
        this.countries = map;
        this.phoneMasks = map2;
        this.validListener = validationListener;
    }

    public static /* synthetic */ void attachToInput$default(PhoneKit phoneKit, SNSFlaggedInputLayout sNSFlaggedInputLayout, List list, SNSCountryPicker.CountryItem countryItem, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachToInput");
        }
        if ((i & 8) != 0) {
            bundle = null;
        }
        phoneKit.attachToInput(sNSFlaggedInputLayout, list, countryItem, bundle);
    }

    public abstract SNSCountryPicker.CountryItem getCountry();

    public abstract com.sumsub.sns.internal.core.data.model.remote.c getMask();

    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> getPhoneMasks() {
        return this.phoneMasks;
    }

    public abstract boolean isValid();

    public void detach(Context context) {
    }

    public void saveInstanceState(Bundle outState) {
    }

    public void setCountry(SNSCountryPicker.CountryItem country, boolean isUser) {
    }

    public void attachToInput(SNSFlaggedInputLayout input, List<SNSCountryPicker.CountryItem> countries, SNSCountryPicker.CountryItem defaultCountry, Bundle savedInstanceState) {
    }
}
