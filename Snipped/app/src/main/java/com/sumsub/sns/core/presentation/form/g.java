package com.sumsub.sns.core.presentation.form;

import P9.n;
import P9.s;
import android.widget.EditText;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.presentation.form.viewutils.b;
import com.sumsub.sns.core.presentation.form.viewutils.h;
import com.sumsub.sns.core.presentation.form.viewutils.j;
import com.sumsub.sns.core.presentation.form.viewutils.k;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import com.sumsub.sns.internal.core.presentation.util.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class g {
    public static final void a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, FormItem formItem, f fVar) {
        if ((formItem instanceof FormItem.p) || (formItem instanceof FormItem.q)) {
            EditText editText = sNSApplicantDataBaseFieldView.getEditText();
            if (editText != null) {
                editText.setText(fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.a) {
            SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataBoolFieldView ? (SNSApplicantDataBoolFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataBoolFieldView == null) {
                return;
            }
            String a10 = fVar.a(formItem);
            sNSApplicantDataBoolFieldView.setChecked(a10 != null ? Boolean.parseBoolean(a10) : false);
            return;
        }
        if (formItem instanceof FormItem.d) {
            SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataCalendarFieldView ? (SNSApplicantDataCalendarFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataCalendarFieldView != null) {
                com.sumsub.sns.core.presentation.form.viewutils.d.a(sNSApplicantDataCalendarFieldView, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.e) {
            SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataDateTimeFieldView ? (SNSApplicantDataDateTimeFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataDateTimeFieldView != null) {
                com.sumsub.sns.core.presentation.form.viewutils.c.a(sNSApplicantDataDateTimeFieldView, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.m) {
            SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataRadioGroupView ? (SNSApplicantDataRadioGroupView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataRadioGroupView != null) {
                k.a(sNSApplicantDataRadioGroupView, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.n) {
            SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionFieldView ? (SNSApplicantDataSelectionFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionFieldView != null) {
                j.a(sNSApplicantDataSelectionFieldView, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.c) {
            SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionCountryFieldView ? (SNSApplicantDataSelectionCountryFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionCountryFieldView != null) {
                b.a(sNSApplicantDataSelectionCountryFieldView, (FormItem.c) formItem, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.k) {
            SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataPhoneFieldView ? (SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataPhoneFieldView != null) {
                h.a(sNSApplicantDataPhoneFieldView, (FormItem.k) formItem, fVar);
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.g) {
            SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataFileFieldView != null) {
                com.sumsub.sns.core.presentation.form.viewutils.e.a(sNSApplicantDataFileFieldView, (FormItem.g) formItem, fVar.a(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.j) {
            SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataMutilselectFieldView ? (SNSApplicantDataMutilselectFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataMutilselectFieldView != null) {
                com.sumsub.sns.core.presentation.form.viewutils.g.a(sNSApplicantDataMutilselectFieldView, (FormItem.j) formItem, fVar.b(formItem));
                return;
            }
            return;
        }
        if (formItem instanceof FormItem.i) {
            SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView2 = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataFileFieldView2 != null) {
                com.sumsub.sns.core.presentation.form.viewutils.f.a(sNSApplicantDataFileFieldView2, (FormItem.i) formItem, fVar.b(formItem));
            }
        }
    }

    public static final String b(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, FormItem formItem) {
        List<SNSApplicantDataFileFieldView.Attachment> files;
        SNSApplicantDataFileFieldView.Attachment attachment;
        SNSCountryPicker.CountryItem selectedCountry;
        h.e.a.C0209a selectedItem;
        if ((formItem instanceof FormItem.p) || (formItem instanceof FormItem.q) || (formItem instanceof FormItem.m)) {
            String value = sNSApplicantDataBaseFieldView.getValue();
            if (!C0969n.i0(value)) {
                return value;
            }
            return null;
        }
        if (formItem instanceof FormItem.k) {
            SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataPhoneFieldView ? (SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataPhoneFieldView != null) {
                return com.sumsub.sns.core.presentation.form.viewutils.h.a(sNSApplicantDataPhoneFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.n) {
            SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionFieldView ? (SNSApplicantDataSelectionFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionFieldView == null || (selectedItem = sNSApplicantDataSelectionFieldView.getSelectedItem()) == null) {
                return null;
            }
            return selectedItem.c();
        }
        if (formItem instanceof FormItem.a) {
            SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataBoolFieldView ? (SNSApplicantDataBoolFieldView) sNSApplicantDataBaseFieldView : null;
            return String.valueOf(sNSApplicantDataBoolFieldView != null ? Boolean.valueOf(sNSApplicantDataBoolFieldView.isChecked()) : null);
        }
        if (formItem instanceof FormItem.d) {
            SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataCalendarFieldView ? (SNSApplicantDataCalendarFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataCalendarFieldView != null) {
                return com.sumsub.sns.core.presentation.form.viewutils.d.a(sNSApplicantDataCalendarFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.e) {
            SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataDateTimeFieldView ? (SNSApplicantDataDateTimeFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataDateTimeFieldView != null) {
                return com.sumsub.sns.core.presentation.form.viewutils.c.a(sNSApplicantDataDateTimeFieldView);
            }
            return null;
        }
        if (formItem instanceof FormItem.c) {
            SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionCountryFieldView ? (SNSApplicantDataSelectionCountryFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionCountryFieldView == null || (selectedCountry = sNSApplicantDataSelectionCountryFieldView.getSelectedCountry()) == null) {
                return null;
            }
            return selectedCountry.getCode();
        }
        if (formItem instanceof FormItem.g) {
            SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataFileFieldView == null || (files = sNSApplicantDataFileFieldView.getFiles()) == null || (attachment = (SNSApplicantDataFileFieldView.Attachment) s.L(files)) == null) {
                return null;
            }
            return attachment.getId();
        }
        if ((formItem instanceof FormItem.i) || (formItem instanceof FormItem.j) || (formItem instanceof FormItem.f) || (formItem instanceof FormItem.h) || (formItem instanceof FormItem.l) || (formItem instanceof FormItem.o) || (formItem instanceof FormItem.r)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<String> c(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, FormItem formItem) {
        if (formItem instanceof FormItem.j) {
            List<h.e.a.C0209a> selectedItems = ((SNSApplicantDataMutilselectFieldView) sNSApplicantDataBaseFieldView).getSelectedItems();
            ArrayList arrayList = new ArrayList(n.u(selectedItems, 10));
            Iterator<T> it = selectedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(((h.e.a.C0209a) it.next()).c());
            }
            return arrayList;
        }
        if (formItem instanceof FormItem.i) {
            List<SNSApplicantDataFileFieldView.Attachment> files = ((SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView).getFiles();
            ArrayList arrayList2 = new ArrayList(n.u(files, 10));
            Iterator<T> it2 = files.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SNSApplicantDataFileFieldView.Attachment) it2.next()).getId());
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        } else if (!(formItem instanceof FormItem.a) && !(formItem instanceof FormItem.c) && !(formItem instanceof FormItem.d) && !(formItem instanceof FormItem.e) && !(formItem instanceof FormItem.g) && !(formItem instanceof FormItem.k) && !(formItem instanceof FormItem.m) && !(formItem instanceof FormItem.n) && !(formItem instanceof FormItem.p) && !(formItem instanceof FormItem.q) && !(formItem instanceof FormItem.h) && !(formItem instanceof FormItem.f) && !(formItem instanceof FormItem.l) && !(formItem instanceof FormItem.o) && !(formItem instanceof FormItem.r)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final boolean a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, FormItem formItem) {
        if ((formItem instanceof FormItem.p) || (formItem instanceof FormItem.q) || (formItem instanceof FormItem.a) || (formItem instanceof FormItem.d) || (formItem instanceof FormItem.e) || (formItem instanceof FormItem.c) || (formItem instanceof FormItem.n)) {
            return com.sumsub.sns.internal.core.presentation.form.model.g.a(formItem.d(), b(sNSApplicantDataBaseFieldView, formItem)) == null;
        }
        if (formItem instanceof FormItem.k) {
            return com.sumsub.sns.core.presentation.form.viewutils.h.a((SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView, (FormItem.k) formItem);
        }
        if (formItem instanceof FormItem.m) {
            String b9 = b(sNSApplicantDataBaseFieldView, formItem);
            boolean z10 = b9 == null || b9.length() == 0;
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && z10) {
                return false;
            }
        } else if (formItem instanceof FormItem.j) {
            List<String> c2 = c(sNSApplicantDataBaseFieldView, formItem);
            boolean z11 = c2 == null || c2.isEmpty();
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && z11) {
                return false;
            }
        } else if (formItem instanceof FormItem.g) {
            String b10 = b(sNSApplicantDataBaseFieldView, formItem);
            if (kotlin.jvm.internal.f.b(formItem.d().v(), Boolean.TRUE) && b10 == null) {
                return false;
            }
        } else if (formItem instanceof FormItem.i) {
            List c10 = c(sNSApplicantDataBaseFieldView, formItem);
            if (c10 == null) {
                c10 = EmptyList.f23104a;
            }
            if (com.sumsub.sns.core.presentation.form.viewutils.f.a(sNSApplicantDataBaseFieldView, (FormItem.i) formItem) && !a.a(com.sumsub.sns.internal.core.presentation.form.model.g.a(formItem.d()), String.valueOf(c10.size()))) {
                return false;
            }
        }
        return true;
    }
}
