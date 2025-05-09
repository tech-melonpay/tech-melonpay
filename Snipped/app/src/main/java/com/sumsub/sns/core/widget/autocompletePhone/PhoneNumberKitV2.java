package com.sumsub.sns.core.widget.autocompletePhone;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.model.remote.c;
import com.sumsub.sns.internal.core.widget.autocompletePhone.util.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.C0967l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;", "Lcom/sumsub/sns/core/widget/PhoneKit;", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "input", "", "", "Lcom/sumsub/sns/internal/core/data/model/CountryCodeToNameMap;", "countries", "Lcom/sumsub/sns/internal/core/data/model/remote/c;", "Lcom/sumsub/sns/internal/core/data/model/PhoneCountryCodeWithMasks;", "phoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "validListener", "", "initialValue", "<init>", "(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V", "number", "", "validate", "(Ljava/lang/CharSequence;)Z", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "country", "isUser", "LO9/p;", "setCountry", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;Z)V", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "<set-?>", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "getCountry", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "mask", "Lcom/sumsub/sns/internal/core/data/model/remote/c;", "getMask", "()Lcom/sumsub/sns/internal/core/data/model/remote/c;", "manuallySelectedCountryKey", "Ljava/lang/String;", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "getEditText", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "editText", "isValid", "()Z", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PhoneNumberKitV2 extends PhoneKit {
    private static final Companion Companion = new Companion(null);
    private SNSCountryPicker.CountryItem country;
    private final SNSFlaggedInputLayout input;
    private String manuallySelectedCountryKey;
    private c mask;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;", "", "()V", "MAX_PHONE_LENGTH", "", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PhoneNumberKitV2(com.sumsub.sns.core.widget.SNSFlaggedInputLayout r25, java.util.Map<java.lang.String, java.lang.String> r26, java.util.Map<java.lang.String, com.sumsub.sns.internal.core.data.model.remote.c> r27, final com.sumsub.sns.core.widget.autocompletePhone.ValidationListener r28, java.lang.CharSequence r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2.<init>(com.sumsub.sns.core.widget.SNSFlaggedInputLayout, java.util.Map, java.util.Map, com.sumsub.sns.core.widget.autocompletePhone.ValidationListener, java.lang.CharSequence):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-12, reason: not valid java name */
    public static final void m70_init_$lambda12(List list, final List list2, final PhoneNumberKitV2 phoneNumberKitV2, View view) {
        SNSCountryPicker.pickCountry$default(e0.f15081a.getCountryPicker(), view.getContext(), list, new SNSCountryPicker.SNSCountryPickerCallBack() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$1$1
            @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker.SNSCountryPickerCallBack
            public void onItemSelected(SNSCountryPicker.CountryItem item) {
                SNSTextInputEditText.Mask mask;
                Map phoneMasks;
                SNSTextInputEditText editText;
                SNSTextInputEditText editText2;
                SNSTextInputEditText editText3;
                SNSTextInputEditText editText4;
                Editable text;
                Editable text2;
                c cVar;
                String c2;
                Object obj;
                List<SNSTextInputEditText.Mask> list3 = list2;
                String str = null;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Object payload = ((SNSTextInputEditText.Mask) obj).getPayload();
                        SNSCountryPicker.CountryItem countryItem = payload instanceof SNSCountryPicker.CountryItem ? (SNSCountryPicker.CountryItem) payload : null;
                        if (f.b(countryItem != null ? countryItem.getCode() : null, item.getCode())) {
                            break;
                        }
                    }
                    mask = (SNSTextInputEditText.Mask) obj;
                } else {
                    mask = null;
                }
                int i = 0;
                phoneNumberKitV2.setCountry(item, false);
                Object payload2 = mask != null ? mask.getPayload() : null;
                SNSCountryPicker.CountryItem countryItem2 = payload2 instanceof SNSCountryPicker.CountryItem ? (SNSCountryPicker.CountryItem) payload2 : null;
                if (countryItem2 != null) {
                    PhoneNumberKitV2 phoneNumberKitV22 = phoneNumberKitV2;
                    phoneMasks = phoneNumberKitV22.getPhoneMasks();
                    if (phoneMasks != null && (cVar = (c) phoneMasks.get(countryItem2.getCode())) != null && (c2 = cVar.c()) != null) {
                        str = C0967l.X(c2, " ", "", false);
                    }
                    editText = phoneNumberKitV22.getEditText();
                    if (editText != null && (text2 = editText.getText()) != null) {
                        text2.clear();
                    }
                    phoneNumberKitV22.manuallySelectedCountryKey = item.getCode();
                    editText2 = phoneNumberKitV22.getEditText();
                    if (editText2 != null) {
                        editText2.setText(str);
                    }
                    editText3 = phoneNumberKitV22.getEditText();
                    if (editText3 != null) {
                        editText4 = phoneNumberKitV22.getEditText();
                        if (editText4 != null && (text = editText4.getText()) != null) {
                            i = text.length();
                        }
                        editText3.setSelection(i);
                    }
                }
            }
        }, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SNSTextInputEditText getEditText() {
        SNSFlaggedInputLayout sNSFlaggedInputLayout = this.input;
        EditText editText = sNSFlaggedInputLayout != null ? sNSFlaggedInputLayout.getEditText() : null;
        if (editText instanceof SNSTextInputEditText) {
            return (SNSTextInputEditText) editText;
        }
        return null;
    }

    private final boolean validate(CharSequence number) {
        String obj;
        if (number == null || (obj = number.toString()) == null) {
            return false;
        }
        return a.a(obj);
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    public SNSCountryPicker.CountryItem getCountry() {
        return this.country;
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    public c getMask() {
        return this.mask;
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    public boolean isValid() {
        SNSTextInputEditText editText = getEditText();
        boolean validate = validate(editText != null ? editText.getRawText() : null);
        if (!validate) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, "SNSPhoneNumberKit", "valid=" + validate, null, 4, null);
        }
        return validate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r7 == null) goto L18;
     */
    @Override // com.sumsub.sns.core.widget.PhoneKit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCountry(com.sumsub.sns.core.data.listener.SNSCountryPicker.CountryItem r6, boolean r7) {
        /*
            r5 = this;
            com.sumsub.sns.core.widget.SNSTextInputEditText r7 = r5.getEditText()
            r0 = 0
            if (r7 == 0) goto Lc
            android.content.Context r7 = r7.getContext()
            goto Ld
        Lc:
            r7 = r0
        Ld:
            if (r7 != 0) goto L10
            return
        L10:
            if (r6 == 0) goto L2b
            android.graphics.drawable.Drawable r7 = com.sumsub.sns.core.data.listener.SNSDefaultCountryPickerKt.getFlagDrawable(r6, r7)
            if (r7 == 0) goto L28
            com.sumsub.sns.core.widget.SNSFlaggedInputLayout r1 = r5.input
            if (r1 == 0) goto L28
            com.sumsub.sns.core.widget.SNSFlagView r1 = r1.getFlagView()
            if (r1 == 0) goto L28
            r1.setImageDrawable(r7)
            O9.p r7 = O9.p.f3034a
            goto L29
        L28:
            r7 = r0
        L29:
            if (r7 != 0) goto L4e
        L2b:
            com.sumsub.sns.core.widget.SNSFlaggedInputLayout r7 = r5.input
            if (r7 == 0) goto L4e
            com.sumsub.sns.core.widget.SNSFlagView r7 = r7.getFlagView()
            if (r7 == 0) goto L4e
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.sumsub.sns.R$drawable.sns_ic_flag_placeholder
            android.content.Context r3 = r7.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r4 = m0.f.f23858a
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2, r3)
            r7.setImageDrawable(r1)
            O9.p r7 = O9.p.f3034a
        L4e:
            r5.country = r6
            if (r6 == 0) goto L63
            java.util.Map r7 = r5.getPhoneMasks()
            if (r7 == 0) goto L63
            java.lang.String r6 = r6.getCode()
            java.lang.Object r6 = r7.get(r6)
            r0 = r6
            com.sumsub.sns.internal.core.data.model.remote.c r0 = (com.sumsub.sns.internal.core.data.model.remote.c) r0
        L63:
            r5.mask = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2.setCountry(com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem, boolean):void");
    }
}
