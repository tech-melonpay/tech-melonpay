package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import P9.q;
import P9.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.core.widget.SNSCheckGroup;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R(\u0010,\u001a\u0004\u0018\u00010'2\b\u0010\u0010\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010/\u001a\u0004\u0018\u00010'2\b\u0010\u0010\u001a\u0004\u0018\u00010'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u00060"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataMutilselectFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isUpdating", "Z", "", "Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function0;", "LO9/p;", "onSelectionChanged", "Lca/a;", "getOnSelectionChanged", "()Lca/a;", "setOnSelectionChanged", "(Lca/a;)V", "aValue", "selectedItems", "getSelectedItems", "setSelectedItems", "Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "getCheckGroup", "()Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "checkGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSApplicantDataMutilselectFieldView extends SNSApplicantDataBaseFieldView {
    private boolean isUpdating;
    private List<h.e.a.C0209a> items;
    private InterfaceC0635a<p> onSelectionChanged;
    private List<h.e.a.C0209a> selectedItems;

    public /* synthetic */ SNSApplicantDataMutilselectFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataMutilselectFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataMutilselectFieldView : i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_items_$lambda-5$lambda-4$lambda-3, reason: not valid java name */
    public static final void m62_set_items_$lambda5$lambda4$lambda3(SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView, CompoundButton compoundButton, boolean z10) {
        Object obj = null;
        sNSApplicantDataMutilselectFieldView.setError(null);
        final String str = (String) compoundButton.getTag();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sNSApplicantDataMutilselectFieldView.selectedItems);
        q.z(arrayList, new InterfaceC0646l<h.e.a.C0209a, Boolean>() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView$items$1$1$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final Boolean invoke(h.e.a.C0209a c0209a) {
                return Boolean.valueOf(f.b(c0209a.c(), str));
            }
        });
        if (z10) {
            Iterator<T> it = sNSApplicantDataMutilselectFieldView.items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (f.b(((h.e.a.C0209a) next).c(), str)) {
                    obj = next;
                    break;
                }
            }
            h.e.a.C0209a c0209a = (h.e.a.C0209a) obj;
            if (c0209a != null) {
                arrayList.add(c0209a);
            }
        }
        if (sNSApplicantDataMutilselectFieldView.isUpdating) {
            return;
        }
        sNSApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
        InterfaceC0635a<p> interfaceC0635a = sNSApplicantDataMutilselectFieldView.onSelectionChanged;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    private final SNSCheckGroup getCheckGroup() {
        return (SNSCheckGroup) findViewById(R$id.sns_checkgroup);
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

    public final InterfaceC0635a<p> getOnSelectionChanged() {
        return this.onSelectionChanged;
    }

    public final List<h.e.a.C0209a> getSelectedItems() {
        return this.selectedItems;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setError(CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            i.a(tvError, charSequence);
        }
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup == null) {
            return;
        }
        SNSStepViewExtensionsKt.setSnsStepState(checkGroup, (charSequence == null || charSequence.length() == 0) ? SNSStepState.INIT : SNSStepState.REJECTED);
    }

    public final void setItems(List<h.e.a.C0209a> list) {
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.removeAllViews();
        }
        setSelectedItems(EmptyList.f23104a);
        for (h.e.a.C0209a c0209a : list) {
            MaterialCheckBox materialCheckBox = new MaterialCheckBox(getContext(), null);
            String d10 = c0209a.d();
            String str = d10.length() > 0 ? d10 : null;
            if (str == null) {
                str = " ";
            }
            materialCheckBox.setText(str);
            materialCheckBox.setOnCheckedChangeListener(new C2.a(this, 2));
            com.sumsub.sns.core.presentation.helper.a.f14273a.a(materialCheckBox, SNSTypographyElement.SUBTITLE2, SNSColorElement.CONTENT_NEUTRAL);
            materialCheckBox.setTag(c0209a.c());
            SNSCheckGroup checkGroup2 = getCheckGroup();
            if (checkGroup2 != null) {
                checkGroup2.addView(materialCheckBox);
            }
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

    public final void setOnSelectionChanged(InterfaceC0635a<p> interfaceC0635a) {
        this.onSelectionChanged = interfaceC0635a;
    }

    public final void setSelectedItems(List<h.e.a.C0209a> list) {
        boolean z10;
        this.isUpdating = true;
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            v vVar = new v(checkGroup, 4);
            while (vVar.hasNext()) {
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) ((View) vVar.next());
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (f.b(((h.e.a.C0209a) it.next()).c(), materialCheckBox.getTag())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                materialCheckBox.setChecked(z10);
            }
        }
        this.isUpdating = false;
        this.selectedItems = list;
    }

    public SNSApplicantDataMutilselectFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.items = new ArrayList();
        this.selectedItems = EmptyList.f23104a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataMutilselectFieldView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataMutilselectFieldView_sns_applicantDataMutilselectFieldViewLayout, R$layout.sns_layout_applicant_data_multiselect_view), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
