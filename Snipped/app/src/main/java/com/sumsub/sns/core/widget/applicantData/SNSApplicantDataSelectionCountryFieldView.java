package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.camera.photo.presentation.document.c;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultCountryPickerKt;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010/\u001a\u0004\u0018\u00010\u00122\b\u0010.\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010;\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionCountryFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setFragmentResultListener", "()Z", "", "getCountryRequestKey", "()Ljava/lang/String;", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "item", "LO9/p;", "onCountrySelected", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;)V", "openSelector", "()V", "enabled", "setEnabled", "(Z)V", "", "tag", "setTag", "(Ljava/lang/Object;)V", "", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "onCountrySelectedCallback", "Lca/l;", "getOnCountrySelectedCallback", "()Lca/l;", "setOnCountrySelectedCallback", "(Lca/l;)V", "<set-?>", "selectedCountry", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "getSelectedCountry", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "fragmentListenerSet", "Z", "Ljava/lang/Runnable;", "picker", "Ljava/lang/Runnable;", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class SNSApplicantDataSelectionCountryFieldView extends SNSApplicantDataFieldView implements SNSApplicantDataBaseFieldView.Selectable {
    private Drawable endIcon;
    private boolean fragmentListenerSet;
    private List<SNSCountryPicker.CountryItem> items;
    private InterfaceC0646l<? super SNSCountryPicker.CountryItem, p> onCountrySelectedCallback;
    private final Runnable picker;
    private SNSCountryPicker.CountryItem selectedCountry;

    public SNSApplicantDataSelectionCountryFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-5, reason: not valid java name */
    public static final boolean m64_init_$lambda5(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCountryRequestKey() {
        Object tag = getTag();
        Object q10 = tag instanceof h.d ? ((h.d) tag).q() : tag instanceof h.c ? ((h.c) tag).i() : null;
        if (q10 != null) {
            return String.format("SNSApplicantDataSelectionCountryFieldView_country_picker_request_key_%s", Arrays.copyOf(new Object[]{q10}, 1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountrySelected(SNSCountryPicker.CountryItem item) {
        SNSFlagView flagView;
        EditText editText;
        EditText editText2;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText2 = inputLayout.getEditText()) != null) {
            editText2.clearFocus();
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.setText(item.getName());
        }
        TextInputLayout inputLayout3 = getInputLayout();
        SNSFlaggedInputLayout sNSFlaggedInputLayout = inputLayout3 instanceof SNSFlaggedInputLayout ? (SNSFlaggedInputLayout) inputLayout3 : null;
        if (sNSFlaggedInputLayout != null && (flagView = sNSFlaggedInputLayout.getFlagView()) != null) {
            flagView.setImageDrawable(SNSDefaultCountryPickerKt.getFlagDrawable(item, flagView.getContext()));
        }
        this.selectedCountry = item;
        InterfaceC0646l<? super SNSCountryPicker.CountryItem, p> interfaceC0646l = this.onCountrySelectedCallback;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: picker$lambda-3, reason: not valid java name */
    public static final void m65picker$lambda3(final SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, Context context) {
        if (sNSApplicantDataSelectionCountryFieldView.isEnabled()) {
            e0.f15081a.getCountryPicker().pickCountry(context, sNSApplicantDataSelectionCountryFieldView.items, new SNSCountryPicker.SNSCountryPickerCallBack() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView$picker$1$1
                @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker.SNSCountryPickerCallBack
                public void onDismiss() {
                    EditText editText;
                    TextInputLayout inputLayout = SNSApplicantDataSelectionCountryFieldView.this.getInputLayout();
                    if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
                        return;
                    }
                    editText.clearFocus();
                }

                @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker.SNSCountryPickerCallBack
                public void onItemSelected(SNSCountryPicker.CountryItem item) {
                    SNSApplicantDataSelectionCountryFieldView.this.onCountrySelected(item);
                }
            }, sNSApplicantDataSelectionCountryFieldView.fragmentListenerSet ? sNSApplicantDataSelectionCountryFieldView.getCountryRequestKey() : null, sNSApplicantDataSelectionCountryFieldView.fragmentListenerSet ? "SNSApplicantDataSelectionCountryFieldView_country_picker_result_key" : null);
        }
    }

    private final boolean setFragmentResultListener() {
        String countryRequestKey = getCountryRequestKey();
        if (countryRequestKey == null) {
            return false;
        }
        Context context = getContext();
        ActivityC0533g activityC0533g = context instanceof ActivityC0533g ? (ActivityC0533g) context : null;
        if (activityC0533g == null) {
            return false;
        }
        activityC0533g.getSupportFragmentManager().g0(countryRequestKey, activityC0533g, new A0.b(this, 29));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFragmentResultListener$lambda-9$lambda-8, reason: not valid java name */
    public static final void m66setFragmentResultListener$lambda9$lambda8(SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("SNSApplicantDataSelectionCountryFieldView_country_picker_result_key");
        SNSPickerDialog.Item item = parcelable instanceof SNSPickerDialog.Item ? (SNSPickerDialog.Item) parcelable : null;
        if (item != null) {
            sNSApplicantDataSelectionCountryFieldView.onCountrySelected(new SNSCountryPicker.CountryItem(item.getId(), item.getTitle()));
        }
    }

    public final List<SNSCountryPicker.CountryItem> getItems() {
        return this.items;
    }

    public final InterfaceC0646l<SNSCountryPicker.CountryItem, p> getOnCountrySelectedCallback() {
        return this.onCountrySelectedCallback;
    }

    public final SNSCountryPicker.CountryItem getSelectedCountry() {
        return this.selectedCountry;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public String getValue() {
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        return String.valueOf((inputLayout == null || (editText = inputLayout.getEditText()) == null) ? null : editText.getText());
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        this.picker.run();
    }

    @Override // com.sumsub.sns.core.widget.SNSApplicantDataFieldView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout == null) {
            return;
        }
        inputLayout.setEndIconDrawable(enabled ? this.endIcon : null);
    }

    public final void setItems(List<SNSCountryPicker.CountryItem> list) {
        this.items = list;
    }

    public final void setOnCountrySelectedCallback(InterfaceC0646l<? super SNSCountryPicker.CountryItem, p> interfaceC0646l) {
        this.onCountrySelectedCallback = interfaceC0646l;
    }

    @Override // android.view.View
    public void setTag(Object tag) {
        super.setTag(tag);
        this.fragmentListenerSet = setFragmentResultListener();
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(String str) {
        Object obj;
        SNSFlagView flagView;
        SNSFlagView flagView2;
        EditText editText;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setText(str);
        }
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String name = ((SNSCountryPicker.CountryItem) obj).getName();
            Locale locale = Locale.ROOT;
            if (f.b(name.toLowerCase(locale), str.toLowerCase(locale))) {
                break;
            }
        }
        SNSCountryPicker.CountryItem countryItem = (SNSCountryPicker.CountryItem) obj;
        if (countryItem != null) {
            TextInputLayout inputLayout2 = getInputLayout();
            SNSFlaggedInputLayout sNSFlaggedInputLayout = inputLayout2 instanceof SNSFlaggedInputLayout ? (SNSFlaggedInputLayout) inputLayout2 : null;
            if (sNSFlaggedInputLayout != null && (flagView2 = sNSFlaggedInputLayout.getFlagView()) != null) {
                flagView2.setImageDrawable(SNSDefaultCountryPickerKt.getFlagDrawable(countryItem, getContext()));
            }
            this.selectedCountry = countryItem;
            return;
        }
        TextInputLayout inputLayout3 = getInputLayout();
        SNSFlaggedInputLayout sNSFlaggedInputLayout2 = inputLayout3 instanceof SNSFlaggedInputLayout ? (SNSFlaggedInputLayout) inputLayout3 : null;
        if (sNSFlaggedInputLayout2 != null && (flagView = sNSFlaggedInputLayout2.getFlagView()) != null) {
            flagView.setImageDrawable(null);
        }
        this.selectedCountry = null;
    }

    public /* synthetic */ SNSApplicantDataSelectionCountryFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Country : i9);
    }

    public SNSApplicantDataSelectionCountryFieldView(final Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        EditText editText;
        this.items = EmptyList.f23104a;
        this.picker = new c(1, this, context);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Drawable a10 = aVar.a(context, SNSIconHandler.SNSCommonIcons.MORE.getImageName());
        this.endIcon = a10 == null ? aVar.a(context, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName()) : a10;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setEndIconDrawable(this.endIcon);
        }
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e10) {
                SNSApplicantDataSelectionCountryFieldView.this.openSelector();
                return super.onSingleTapUp(e10);
            }
        });
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.setOnTouchListener(new b(gestureDetector, 0));
        }
        TextInputLayout inputLayout3 = getInputLayout();
        EditText editText2 = inputLayout3 != null ? inputLayout3.getEditText() : null;
        if (editText2 != null) {
            editText2.setKeyListener(null);
        }
        setOnClear(new InterfaceC0635a<p>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ActivityC0533g a11;
                FragmentManager supportFragmentManager;
                String countryRequestKey = SNSApplicantDataSelectionCountryFieldView.this.getCountryRequestKey();
                if (countryRequestKey == null || (a11 = i.a(context)) == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
                    return;
                }
                FragmentManager.m remove = supportFragmentManager.f6745n.remove(countryRequestKey);
                if (remove != null) {
                    remove.f6772a.c(remove.i);
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing FragmentResultListener for key ".concat(countryRequestKey));
                }
            }
        });
        onInitializationFinished();
    }
}
