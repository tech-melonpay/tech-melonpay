package com.sumsub.sns.core.data.listener;

import android.content.Context;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSCountryPickerDialog;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSDefaultCountryPicker;", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", FirebaseAnalytics.Param.ITEMS, "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;", "callback", "", "requestKey", "resultKey", "LO9/p;", "pickCountry", "(Landroid/content/Context;Ljava/util/List;Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSDefaultCountryPicker implements SNSCountryPicker {
    @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker
    public void pickCountry(Context context, List<SNSCountryPicker.CountryItem> items, SNSCountryPicker.SNSCountryPickerCallBack callback, String requestKey, String resultKey) {
        FragmentManager supportFragmentManager;
        ActivityC0533g activityC0533g = context instanceof ActivityC0533g ? (ActivityC0533g) context : null;
        if (activityC0533g == null || (supportFragmentManager = activityC0533g.getSupportFragmentManager()) == null || supportFragmentManager.G("SNSCountryPickerDialog") != null) {
            return;
        }
        SNSCountryPickerDialog newInstance = SNSCountryPickerDialog.INSTANCE.newInstance((SNSCountryPicker.CountryItem[]) items.toArray(new SNSCountryPicker.CountryItem[0]), requestKey, resultKey);
        newInstance.setCountryPickerCallBack(callback);
        newInstance.show(supportFragmentManager, "SNSCountryPickerDialog");
    }
}
