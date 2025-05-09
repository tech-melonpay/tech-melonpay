package com.sumsub.sns.core.widget.autocompletePhone.bottomsheet;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultCountryPickerKt;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.f;
import com.sumsub.sns.internal.core.analytics.l;
import com.sumsub.sns.internal.core.theme.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u000fR\u00020\u00012\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSCountryPickerDialog;", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "getThemeBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "holder", "position", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "item", "bindItemViewHolder", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;ILcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;)V", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;", "value", "countryPickerCallBack", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;", "getCountryPickerCallBack", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;", "setCountryPickerCallBack", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$SNSCountryPickerCallBack;)V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSCountryPickerDialog extends SNSPickerDialog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private SNSCountryPicker.SNSCountryPickerCallBack countryPickerCallBack;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSCountryPickerDialog$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSCountryPickerDialog;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "requestKey", "resultKey", "([Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSCountryPickerDialog;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SNSCountryPickerDialog newInstance(SNSCountryPicker.CountryItem[] items, String requestKey, String resultKey) {
            SNSCountryPickerDialog sNSCountryPickerDialog = new SNSCountryPickerDialog();
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(items.length);
            for (SNSCountryPicker.CountryItem countryItem : items) {
                arrayList.add(new SNSPickerDialog.Item(countryItem.getCode(), countryItem.getName()));
            }
            bundle.putParcelableArray(SNSPickerDialog.EXTRA_ITEMS, (SNSPickerDialog.Item[]) arrayList.toArray(new SNSPickerDialog.Item[0]));
            bundle.putInt(SNSPickerDialog.EXTRA_ITEM_LAYOUT_ID, R$layout.sns_countries_list_item);
            bundle.putBoolean(SNSPickerDialog.EXTRA_SHOW_SEARCH, true);
            bundle.putBoolean(SNSPickerDialog.EXTRA_SORT, true);
            if (requestKey != null) {
                bundle.putString(SNSPickerDialog.EXTRA_REQUEST_KEY, requestKey);
            }
            if (resultKey != null) {
                bundle.putString(SNSPickerDialog.EXTRA_RESULT_KEY, resultKey);
            }
            sNSCountryPickerDialog.setArguments(bundle);
            return sNSCountryPickerDialog;
        }

        private Companion() {
        }
    }

    @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog
    public void bindItemViewHolder(SNSPickerDialog.PickerItemViewHolder holder, int position, SNSPickerDialog.Item item) {
        super.bindItemViewHolder(holder, position, item);
        ((ImageView) holder.itemView.findViewById(R.id.icon)).setImageDrawable(SNSDefaultCountryPickerKt.getFlagDrawable(new SNSCountryPicker.CountryItem(item.getId(), item.getTitle()), requireContext()));
    }

    @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog
    public Integer getThemeBackgroundColor(View view) {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 != null) {
            return aVar.a(a10, SNSColorElement.BACKGROUND_COMMON, aVar.a(view));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().j().c(), false, 1, null);
        super.onResume();
    }

    @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().b().c(), false, 1, null);
    }

    public final void setCountryPickerCallBack(final SNSCountryPicker.SNSCountryPickerCallBack sNSCountryPickerCallBack) {
        setPickerCallBack(new SNSPickerDialog.PickerCallBack() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSCountryPickerDialog$countryPickerCallBack$1
            @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog.PickerCallBack
            public void onCancel() {
                l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().m().c(), false, 1, null);
            }

            @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog.PickerCallBack
            public void onDialogClose() {
                super.onDialogClose();
                l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().o().c(), false, 1, null);
            }

            @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog.PickerCallBack
            public void onDismiss() {
                SNSCountryPicker.SNSCountryPickerCallBack sNSCountryPickerCallBack2 = SNSCountryPicker.SNSCountryPickerCallBack.this;
                if (sNSCountryPickerCallBack2 != null) {
                    sNSCountryPickerCallBack2.onDismiss();
                }
            }

            @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog.PickerCallBack
            public void onItemSelected(SNSPickerDialog.Item item) {
                SNSCountryPicker.SNSCountryPickerCallBack sNSCountryPickerCallBack2 = SNSCountryPicker.SNSCountryPickerCallBack.this;
                if (sNSCountryPickerCallBack2 != null) {
                    sNSCountryPickerCallBack2.onItemSelected(new SNSCountryPicker.CountryItem(item.getId(), item.getTitle()));
                }
            }
        });
        this.countryPickerCallBack = sNSCountryPickerCallBack;
    }
}
