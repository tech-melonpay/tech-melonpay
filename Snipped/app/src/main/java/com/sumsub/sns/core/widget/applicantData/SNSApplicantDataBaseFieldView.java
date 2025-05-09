package com.sumsub.sns.core.widget.applicantData;

import O9.p;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.internal.core.common.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0014\b&\u0018\u00002\u00020\u0001:\u0001TB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\rR.\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&RF\u0010(\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u0001058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010<\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R$\u0010'\u001a\u00020 2\u0006\u0010'\u001a\u00020 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010F\u001a\u0004\u0018\u00010A8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010I\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\u0016\u0010K\u001a\u0004\u0018\u0001058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u00107R(\u0010N\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER(\u0010Q\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010C\"\u0004\bP\u0010ER\u0016\u0010S\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u00107¨\u0006U"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "onInitializationFinished", "()V", "onAttachedToWindow", "clear", "Lcom/google/android/material/textfield/TextInputLayout;", "<set-?>", "inputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setInputLayout$idensic_mobile_sdk_aar_release", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Ljava/lang/Runnable;", "onSubmitForm", "Ljava/lang/Runnable;", "getOnSubmitForm", "()Ljava/lang/Runnable;", "setOnSubmitForm", "(Ljava/lang/Runnable;)V", "Lkotlin/Function1;", "", "textChangedCallback", "Lca/l;", "getTextChangedCallback", "()Lca/l;", "setTextChangedCallback", "(Lca/l;)V", "value", "onLinkClicked", "getOnLinkClicked", "setOnLinkClicked", "Lkotlin/Function0;", "onClear", "Lca/a;", "getOnClear", "()Lca/a;", "setOnClear", "(Lca/a;)V", "", "initizationFinishedCalled", "Z", "Landroid/widget/TextView;", "getTvLabel$idensic_mobile_sdk_aar_release", "()Landroid/widget/TextView;", "tvLabel", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "getExample", "setExample", "example", "getTvError", "tvError", "getError", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getHint", "setHint", "hint", "getTvExample", "tvExample", "Selectable", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SNSApplicantDataBaseFieldView extends ConstraintLayout {
    private boolean initizationFinishedCalled;
    private TextInputLayout inputLayout;
    private InterfaceC0635a<p> onClear;
    private InterfaceC0646l<? super String, p> onLinkClicked;
    private Runnable onSubmitForm;
    private InterfaceC0646l<? super String, p> textChangedCallback;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "", "LO9/p;", "openSelector", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public interface Selectable {
        void openSelector();
    }

    public SNSApplicantDataBaseFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final TextView getTvExample() {
        return (TextView) findViewById(R$id.sns_example);
    }

    public void clear() {
        InterfaceC0635a<p> interfaceC0635a = this.onClear;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
        setOnLinkClicked(null);
        this.textChangedCallback = null;
    }

    public final EditText getEditText() {
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            return textInputLayout.getEditText();
        }
        return null;
    }

    public CharSequence getError() {
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            return textInputLayout.getError();
        }
        return null;
    }

    public final CharSequence getExample() {
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            return tvExample.getText();
        }
        return null;
    }

    public final CharSequence getHint() {
        EditText editText;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
            return null;
        }
        return editText.getHint();
    }

    public final TextInputLayout getInputLayout() {
        return this.inputLayout;
    }

    public abstract CharSequence getLabel();

    public final InterfaceC0635a<p> getOnClear() {
        return this.onClear;
    }

    public InterfaceC0646l<String, p> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    public final Runnable getOnSubmitForm() {
        return this.onSubmitForm;
    }

    public final InterfaceC0646l<String, p> getTextChangedCallback() {
        return this.textChangedCallback;
    }

    public final TextView getTvError() {
        return (TextView) findViewById(R$id.sns_error);
    }

    public final TextView getTvLabel$idensic_mobile_sdk_aar_release() {
        return (TextView) findViewById(R$id.sns_label);
    }

    public String getValue() {
        String rawText;
        TextInputLayout textInputLayout = this.inputLayout;
        EditText editText = textInputLayout != null ? textInputLayout.getEditText() : null;
        SNSTextInputEditText sNSTextInputEditText = editText instanceof SNSTextInputEditText ? (SNSTextInputEditText) editText : null;
        if (sNSTextInputEditText == null || (rawText = sNSTextInputEditText.getRawText()) == null) {
            return String.valueOf(editText != null ? editText.getText() : null);
        }
        return rawText;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.initizationFinishedCalled) {
            return;
        }
        throw new IllegalStateException(("onInitializationFinished not called for " + i.a((Object) this)).toString());
    }

    public final void onInitializationFinished() {
        this.initizationFinishedCalled = true;
        EditText editText = getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView$onInitializationFinished$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                    InterfaceC0646l<String, p> textChangedCallback = SNSApplicantDataBaseFieldView.this.getTextChangedCallback();
                    if (textChangedCallback != null) {
                        textChangedCallback.invoke(s10 != null ? s10.toString() : null);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }
    }

    public void setError(CharSequence charSequence) {
        EditText editText;
        EditText editText2;
        Editable text;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            textInputLayout.setError(charSequence);
        }
        TextInputLayout textInputLayout2 = this.inputLayout;
        if (textInputLayout2 == null || (editText = textInputLayout2.getEditText()) == null) {
            return;
        }
        TextInputLayout textInputLayout3 = this.inputLayout;
        editText.setSelection((textInputLayout3 == null || (editText2 = textInputLayout3.getEditText()) == null || (text = editText2.getText()) == null) ? 0 : text.length());
    }

    public final void setExample(CharSequence charSequence) {
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            i.a(tvExample, charSequence);
        }
    }

    public final void setHint(CharSequence charSequence) {
        TextInputLayout textInputLayout = this.inputLayout;
        EditText editText = textInputLayout != null ? textInputLayout.getEditText() : null;
        if (editText == null) {
            return;
        }
        editText.setHint(charSequence);
    }

    public final void setInputLayout$idensic_mobile_sdk_aar_release(TextInputLayout textInputLayout) {
        this.inputLayout = textInputLayout;
    }

    public abstract void setLabel(CharSequence charSequence);

    public final void setOnClear(InterfaceC0635a<p> interfaceC0635a) {
        this.onClear = interfaceC0635a;
    }

    public void setOnLinkClicked(InterfaceC0646l<? super String, p> interfaceC0646l) {
        TextView tvLabel$idensic_mobile_sdk_aar_release = getTvLabel$idensic_mobile_sdk_aar_release();
        if (tvLabel$idensic_mobile_sdk_aar_release != null) {
            com.sumsub.sns.core.common.b.a(tvLabel$idensic_mobile_sdk_aar_release, interfaceC0646l);
        }
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            com.sumsub.sns.core.common.b.a(tvExample, interfaceC0646l);
        }
        this.onLinkClicked = interfaceC0646l;
    }

    public final void setOnSubmitForm(Runnable runnable) {
        this.onSubmitForm = runnable;
    }

    public final void setTextChangedCallback(InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.textChangedCallback = interfaceC0646l;
    }

    public void setValue(String str) {
        EditText editText;
        EditText editText2;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setText(str);
        }
        TextInputLayout textInputLayout2 = this.inputLayout;
        if (textInputLayout2 == null || (editText = textInputLayout2.getEditText()) == null) {
            return;
        }
        editText.setSelection(str.length());
    }

    public /* synthetic */ SNSApplicantDataBaseFieldView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView : i9);
    }

    public SNSApplicantDataBaseFieldView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
    }
}
