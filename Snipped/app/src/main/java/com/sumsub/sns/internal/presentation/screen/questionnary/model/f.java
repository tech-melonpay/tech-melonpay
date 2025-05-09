package com.sumsub.sns.internal.presentation.screen.questionnary.model;

import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.b;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {
    public static final boolean b(b.C0241b c0241b) {
        List<FormItem> f10 = c0241b.f();
        if (!(f10 instanceof Collection) || !f10.isEmpty()) {
            loop0: for (FormItem formItem : f10) {
                if (formItem instanceof FormItem.g) {
                    FormItem.g gVar = (FormItem.g) formItem;
                    FormItem.ItemState t3 = gVar.t();
                    FormItem.ItemState itemState = FormItem.ItemState.DEFAULT;
                    if (t3 == itemState && gVar.w() == itemState) {
                    }
                    return false;
                }
                if (formItem instanceof FormItem.i) {
                    FormItem.i iVar = (FormItem.i) formItem;
                    List<FormItem.ItemState> u6 = iVar.u();
                    if (!(u6 instanceof Collection) || !u6.isEmpty()) {
                        Iterator<T> it = u6.iterator();
                        while (it.hasNext()) {
                            if (((FormItem.ItemState) it.next()) == FormItem.ItemState.LOADING) {
                                break loop0;
                            }
                        }
                    }
                    if (iVar.x() != FormItem.ItemState.DEFAULT) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FormItem a(List<b.C0241b> list, FieldId fieldId) {
        FormItem formItem;
        Iterator<b.C0241b> it = list.iterator();
        do {
            formItem = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = it.next().f().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (kotlin.jvm.internal.f.b(a((FormItem) next), fieldId)) {
                    formItem = next;
                    break;
                }
            }
            formItem = formItem;
        } while (formItem == null);
        return formItem;
    }

    public static final FieldId a(FormItem formItem) {
        String e10 = formItem.e();
        if (e10 == null) {
            e10 = "";
        }
        String p10 = formItem.d().p();
        return new FieldId(e10, p10 != null ? p10 : "");
    }
}
