package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import P9.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.camera.d;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.data.model.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010$\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSelectionFieldView;", "Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LO9/p;", "showDialog", "()V", "", "enabled", "setEnabled", "(Z)V", "openSelector", "", "Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "onSelectedCallback", "Lca/l;", "getOnSelectedCallback", "()Lca/l;", "setOnSelectedCallback", "(Lca/l;)V", "aValue", "selectedItem", "Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "getSelectedItem", "()Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;", "setSelectedItem", "(Lcom/sumsub/sns/internal/core/data/model/h$e$a$a;)V", "Landroid/graphics/drawable/Drawable;", "endIcon", "Landroid/graphics/drawable/Drawable;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class SNSApplicantDataSelectionFieldView extends SNSApplicantDataFieldView implements SNSApplicantDataBaseFieldView.Selectable {
    private Drawable endIcon;
    private List<h.e.a.C0209a> items;
    private InterfaceC0646l<? super h.e.a.C0209a, p> onSelectedCallback;
    private h.e.a.C0209a selectedItem;

    public /* synthetic */ SNSApplicantDataSelectionFieldView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m67_init_$lambda0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private final void showDialog() {
        SNSAlertDialogBuilder sNSAlertDialogBuilder = new SNSAlertDialogBuilder(getContext());
        List<h.e.a.C0209a> list = this.items;
        ArrayList arrayList = new ArrayList(n.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((h.e.a.C0209a) it.next()).d());
        }
        sNSAlertDialogBuilder.setItems((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) new d(this, 1)).setCancelable(true).setOnDismissListener((DialogInterface.OnDismissListener) new com.sumsub.sns.videoident.presentation.b(this, 2)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-3, reason: not valid java name */
    public static final void m68showDialog$lambda3(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        sNSApplicantDataSelectionFieldView.setValue(sNSApplicantDataSelectionFieldView.items.get(i).d());
        sNSApplicantDataSelectionFieldView.setSelectedItem(sNSApplicantDataSelectionFieldView.items.get(i));
        InterfaceC0646l<? super h.e.a.C0209a, p> interfaceC0646l = sNSApplicantDataSelectionFieldView.onSelectedCallback;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(sNSApplicantDataSelectionFieldView.items.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-4, reason: not valid java name */
    public static final void m69showDialog$lambda4(SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView, DialogInterface dialogInterface) {
        EditText editText;
        TextInputLayout inputLayout = sNSApplicantDataSelectionFieldView.getInputLayout();
        if (inputLayout == null || (editText = inputLayout.getEditText()) == null) {
            return;
        }
        editText.clearFocus();
    }

    public final List<h.e.a.C0209a> getItems() {
        return this.items;
    }

    public final InterfaceC0646l<h.e.a.C0209a, p> getOnSelectedCallback() {
        return this.onSelectedCallback;
    }

    public final h.e.a.C0209a getSelectedItem() {
        return this.selectedItem;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView.Selectable
    public void openSelector() {
        if (!this.items.isEmpty()) {
            showDialog();
        }
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

    public final void setItems(List<h.e.a.C0209a> list) {
        if (f.b(this.items, list)) {
            return;
        }
        this.items = list;
        if (!list.isEmpty()) {
            disableInput();
        } else {
            enableInput();
        }
    }

    public final void setOnSelectedCallback(InterfaceC0646l<? super h.e.a.C0209a, p> interfaceC0646l) {
        this.onSelectedCallback = interfaceC0646l;
    }

    public final void setSelectedItem(h.e.a.C0209a c0209a) {
        String str;
        this.selectedItem = c0209a;
        if (c0209a == null || (str = c0209a.d()) == null) {
            str = "";
        }
        setValue(str);
    }

    public SNSApplicantDataSelectionFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        EditText editText;
        this.items = new ArrayList();
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e10) {
                SNSApplicantDataSelectionFieldView.this.openSelector();
                return super.onSingleTapUp(e10);
            }
        });
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setOnTouchListener(new b(gestureDetector, 1));
        }
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Drawable a10 = aVar.a(context, SNSIconHandler.SNSCommonIcons.MORE.getImageName());
        this.endIcon = a10 == null ? aVar.a(context, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName()) : a10;
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null) {
            inputLayout2.setEndIconDrawable(this.endIcon);
        }
        onInitializationFinished();
    }
}
