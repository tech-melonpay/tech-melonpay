package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.common.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "", "list", "LO9/p;", "setMasks", "(Ljava/util/List;)V", "", "enabled", "setEnabled", "(Z)V", "disableInput", "()V", "enableInput", "Landroid/text/method/KeyListener;", "saveKeyListener", "Landroid/text/method/KeyListener;", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSApplicantDataFieldView extends SNSApplicantDataBaseFieldView {
    private KeyListener saveKeyListener;

    public SNSApplicantDataFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda-3$lambda-2, reason: not valid java name */
    public static final boolean m38lambda3$lambda2(SNSApplicantDataFieldView sNSApplicantDataFieldView, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            View focusSearch = textView.focusSearch(130);
            if (focusSearch instanceof SNSApplicantDataBaseFieldView.Selectable) {
                ((SNSApplicantDataBaseFieldView.Selectable) focusSearch).openSelector();
            } else if (focusSearch instanceof TextInputLayout) {
                EditText editText = ((TextInputLayout) focusSearch).getEditText();
                if (editText != null) {
                    editText.requestFocus();
                }
            } else if (focusSearch != 0) {
                focusSearch.requestFocus();
            }
        } else {
            if (i != 6) {
                return false;
            }
            Runnable onSubmitForm = sNSApplicantDataFieldView.getOnSubmitForm();
            if (onSubmitForm != null) {
                onSubmitForm.run();
            }
        }
        return true;
    }

    public final void disableInput() {
        EditText editText = getEditText();
        if ((editText != null ? editText.getKeyListener() : null) != null) {
            EditText editText2 = getEditText();
            this.saveKeyListener = editText2 != null ? editText2.getKeyListener() : null;
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setKeyListener(null);
        }
        TextInputLayout inputLayout = getInputLayout();
        EditText editText4 = inputLayout != null ? inputLayout.getEditText() : null;
        if (editText4 == null) {
            return;
        }
        editText4.setKeyListener(null);
    }

    public final void enableInput() {
        EditText editText;
        EditText editText2 = getEditText();
        if ((editText2 != null ? editText2.getKeyListener() : null) != null || (editText = getEditText()) == null) {
            return;
        }
        editText.setKeyListener(this.saveKeyListener);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        return (tvLabel$idensic_mobile_sdk_aar_release == null || (text = tvLabel$idensic_mobile_sdk_aar_release.getText()) == null) ? "" : text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout == null) {
            return;
        }
        inputLayout.setEnabled(enabled);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            i.a(tvLabel$idensic_mobile_sdk_aar_release, charSequence);
        }
    }

    public final void setMasks(List<String> list) {
        SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) findViewById(R$id.sns_editor);
        if (sNSTextInputEditText != null) {
            sNSTextInputEditText.setMasksString(list);
        }
    }

    public /* synthetic */ SNSApplicantDataFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView : i9);
    }

    public SNSApplicantDataFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        EditText editText;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataFieldView, i, i9);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataFieldView_sns_applicantDataFieldLayout, R$layout.sns_layout_applicant_data_field), (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) findViewById(R$id.sns_editor);
        if (sNSTextInputEditText != null) {
            sNSTextInputEditText.setInputType(1);
            sNSTextInputEditText.setMaxLines(1);
            sNSTextInputEditText.setImeOptions(5);
            sNSTextInputEditText.setOnEditorActionListener(new com.sumsub.sns.core.presentation.screen.verification.b(this, 2));
        }
        setInputLayout$idensic_mobile_sdk_aar_release((TextInputLayout) findViewById(R$id.sns_editor_layout));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setHintEnabled(false);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.SNSApplicantDataFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                    TextInputLayout inputLayout3 = SNSApplicantDataFieldView.this.getInputLayout();
                    if (inputLayout3 != null) {
                        inputLayout3.setError(null);
                    }
                    TextInputLayout inputLayout4 = SNSApplicantDataFieldView.this.getInputLayout();
                    if (inputLayout4 == null) {
                        return;
                    }
                    inputLayout4.setErrorEnabled(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
