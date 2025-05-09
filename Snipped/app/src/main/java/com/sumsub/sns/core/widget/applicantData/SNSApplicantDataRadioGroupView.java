package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import ca.InterfaceC0646l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.core.widget.SNSRadioGroup;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import ja.e;
import ja.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR>\u0010\u000f\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010'\u001a\u0004\u0018\u00010\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R4\u00100\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00103\u001a\u0004\u0018\u00010\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&¨\u00064"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataRadioGroupView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "Lcom/sumsub/sns/core/widget/applicantData/Item;", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "LO9/p;", "onSelectionChanged", "Lca/l;", "getOnSelectionChanged", "()Lca/l;", "setOnSelectionChanged", "(Lca/l;)V", "Lcom/sumsub/sns/core/widget/SNSRadioGroup;", "getRadioGroup", "()Lcom/sumsub/sns/core/widget/SNSRadioGroup;", "radioGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getSelectedItem", "()Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "setSelectedItem", "(Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;)V", "selectedItem", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataRadioGroupView extends SNSApplicantDataBaseFieldView {
    private List<h.e.a.C0209a> items;
    private InterfaceC0646l<? super String, p> onSelectionChanged;

    public /* synthetic */ SNSApplicantDataRadioGroupView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataRadioGroupViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataRadioGroupView : i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_items_$lambda-4$lambda-3$lambda-2, reason: not valid java name */
    public static final void m63_set_items_$lambda4$lambda3$lambda2(SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView, CompoundButton compoundButton, boolean z10) {
        InterfaceC0646l<? super String, p> interfaceC0646l;
        Object obj = null;
        sNSApplicantDataRadioGroupView.setError(null);
        Iterator<T> it = sNSApplicantDataRadioGroupView.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String c2 = ((h.e.a.C0209a) next).c();
            Object tag = compoundButton.getTag();
            if (f.b(c2, tag instanceof String ? (String) tag : null)) {
                obj = next;
                break;
            }
        }
        h.e.a.C0209a c0209a = (h.e.a.C0209a) obj;
        if (c0209a == null || !z10 || (interfaceC0646l = sNSApplicantDataRadioGroupView.onSelectionChanged) == null) {
            return;
        }
        interfaceC0646l.invoke(c0209a.c());
    }

    private final SNSRadioGroup getRadioGroup() {
        return (SNSRadioGroup) findViewById(R$id.sns_radiogroup);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    public final List<h.e.a.C0209a> getItems() {
        return this.items;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    public final InterfaceC0646l<String, p> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    public final h.e.a.C0209a getSelectedItem() {
        Object h9;
        SNSRadioGroup radioGroup = getRadioGroup();
        Object obj = null;
        if (radioGroup == null || (h9 = kotlin.sequences.a.h(new o(kotlin.sequences.a.g(kotlin.sequences.a.g(androidx.core.view.a.a(radioGroup), new InterfaceC0646l<Object, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0646l
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof RadioButton);
            }
        }), new InterfaceC0646l<RadioButton, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$selectedItem$1
            @Override // ca.InterfaceC0646l
            public final Boolean invoke(RadioButton radioButton) {
                return Boolean.valueOf(radioButton.isChecked());
            }
        }), new InterfaceC0646l<RadioButton, Object>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$selectedItem$2
            @Override // ca.InterfaceC0646l
            public final Object invoke(RadioButton radioButton) {
                return radioButton.getTag();
            }
        }))) == null) {
            return null;
        }
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (f.b(((h.e.a.C0209a) next).c(), h9 instanceof String ? (String) h9 : null)) {
                obj = next;
                break;
            }
        }
        return (h.e.a.C0209a) obj;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public String getValue() {
        String c2;
        h.e.a.C0209a selectedItem = getSelectedItem();
        return (selectedItem == null || (c2 = selectedItem.c()) == null) ? "" : c2;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            i.a(tvError, charSequence);
        }
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup == null) {
            return;
        }
        SNSStepViewExtensionsKt.setSnsStepState(radioGroup, (charSequence == null || charSequence.length() == 0) ? SNSStepState.INIT : SNSStepState.REJECTED);
    }

    public final void setItems(List<h.e.a.C0209a> list) {
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            radioGroup.removeAllViews();
        }
        for (h.e.a.C0209a c0209a : list) {
            O2.a aVar = new O2.a(getContext(), null);
            aVar.setText(c0209a.d());
            aVar.setOnCheckedChangeListener(new C2.a(this, 3));
            aVar.setTag(c0209a.c());
            SNSRadioGroup radioGroup2 = getRadioGroup();
            if (radioGroup2 != null) {
                radioGroup2.addView(aVar);
            }
            com.sumsub.sns.core.presentation.helper.a.f14273a.a(aVar, SNSTypographyElement.SUBTITLE2, SNSColorElement.CONTENT_NEUTRAL);
        }
        this.items = list;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    public final void setOnSelectionChanged(InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.onSelectionChanged = interfaceC0646l;
    }

    public final void setSelectedItem(h.e.a.C0209a c0209a) {
        SNSRadioGroup radioGroup = getRadioGroup();
        if (radioGroup != null) {
            e.a aVar = new e.a(kotlin.sequences.a.g(androidx.core.view.a.a(radioGroup), new InterfaceC0646l<Object, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // ca.InterfaceC0646l
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof RadioButton);
                }
            }));
            while (aVar.hasNext()) {
                RadioButton radioButton = (RadioButton) aVar.next();
                Object tag = radioButton.getTag();
                String str = null;
                String str2 = tag instanceof String ? (String) tag : null;
                if (c0209a != null) {
                    str = c0209a.c();
                }
                radioButton.setChecked(f.b(str2, str));
            }
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setValue(String str) {
        Object obj;
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (f.b(((h.e.a.C0209a) obj).c(), str)) {
                    break;
                }
            }
        }
        setSelectedItem((h.e.a.C0209a) obj);
    }

    public SNSApplicantDataRadioGroupView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.items = EmptyList.f23104a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataRadioGroupView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataRadioGroupView_sns_applicantDataRadioGroupLayout, R$layout.sns_layout_applicant_data_radio_group_view), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
