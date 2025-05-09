package com.sumsub.sns.core.presentation.screen.verification;

import R0.a;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneKitProviderKt;
import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel;
import com.sumsub.sns.internal.core.presentation.screen.verification.ValidationIdentifierType;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import ia.InterfaceC0840h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 V2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\t\u0010\u0011J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\t\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001d\u00100\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b/\u0010-R\u001d\u00105\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0004\u0018\u0001068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u0004\u0018\u00010;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u0004\u0018\u00010@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u0004\u0018\u00010E8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010HR\u001d\u0010L\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010-R\u001d\u0010Q\u001a\u0004\u0018\u00010M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010+\u001a\u0004\bO\u0010PR\u001d\u0010T\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010+\u001a\u0004\bS\u0010-R\u001d\u0010X\u001a\u0004\u0018\u00010U8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\bV\u0010WR\u001d\u0010Z\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\bY\u0010-R\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\\R\u001b\u0010a\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010cR\u0014\u0010h\u001a\u00020e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006q"}, d2 = {"Lcom/sumsub/sns/core/presentation/screen/verification/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e;", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel;", "<init>", "()V", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$d;", "state", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$d;)V", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$e;", "Landroid/os/Bundle;", "savedInstanceState", "b", "(Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$e;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$c;", "(Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$c;)V", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$b;", "(Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e$b;)V", "l", "o", "n", "m", "k", "", "getLayoutId", "()I", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "(Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel$e;Landroid/os/Bundle;)V", "onDestroyView", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/widget/TextView;", "Lcom/sumsub/sns/internal/core/common/z;", "A", "()Landroid/widget/TextView;", "tvTitle", "z", "tvSubtitle", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "v", "()Lcom/google/android/material/textfield/TextInputLayout;", "tlEmail", "Lcom/google/android/material/textfield/TextInputEditText;", "d", "q", "()Lcom/google/android/material/textfield/TextInputEditText;", "etEmailId", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "e", "w", "()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "tlPhone", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "f", "r", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "etPhone", "Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "g", "u", "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", "pinCode", "h", "x", "tvResendCode", "Landroid/widget/ImageView;", "i", "s", "()Landroid/widget/ImageView;", "ivIcon", "j", "y", "tvStatus", "Landroid/widget/Button;", "p", "()Landroid/widget/Button;", "btnPrimary", "t", "otpErrorText", "Landroid/text/TextWatcher;", "Landroid/text/TextWatcher;", "emailTextWatcher", "LO9/f;", "C", "()Lcom/sumsub/sns/internal/core/presentation/screen/verification/SNSVerificationStepViewModel;", "viewModel", "Lcom/sumsub/sns/core/widget/PhoneKit;", "Lcom/sumsub/sns/core/widget/PhoneKit;", "phoneNumberKit", "Lcom/sumsub/sns/internal/core/presentation/screen/verification/ValidationIdentifierType;", "B", "()Lcom/sumsub/sns/internal/core/presentation/screen/verification/ValidationIdentifierType;", "type", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<SNSVerificationStepViewModel.e, SNSVerificationStepViewModel> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f14294q;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle = a0.a(this, R$id.sns_title);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z tvSubtitle = a0.a(this, R$id.sns_subtitle);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z tlEmail = a0.a(this, R$id.sns_email);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z etEmailId = a0.a(this, R$id.sns_email_id);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z tlPhone = a0.a(this, R$id.sns_phone);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z etPhone = a0.a(this, R$id.sns_phone_id);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z pinCode = a0.a(this, R$id.sns_pin_code);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z tvResendCode = a0.a(this, R$id.sns_resend_verification_code);

    /* renamed from: i, reason: from kotlin metadata */
    public final z ivIcon = a0.a(this, R$id.sns_status_icon);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z tvStatus = a0.a(this, R$id.sns_status_comment);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final z btnPrimary = a0.a(this, R$id.sns_primary_button);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final z otpErrorText = a0.a(this, R$id.sns_otp_error);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public TextWatcher emailTextWatcher;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public PhoneKit phoneNumberKit;

    /* renamed from: com.sumsub.sns.core.presentation.screen.verification.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ValidationIdentifierType validationIdentifierType) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ValidationIdentifier", validationIdentifierType);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14309a;

        static {
            int[] iArr = new int[ValidationIdentifierType.values().length];
            iArr[ValidationIdentifierType.EMAIL.ordinal()] = 1;
            iArr[ValidationIdentifierType.PHONE.ordinal()] = 2;
            iArr[ValidationIdentifierType.UNKNOWN.ordinal()] = 3;
            f14309a = iArr;
        }
    }

    public static final class d implements ValidationListener {
        public d() {
        }

        @Override // com.sumsub.sns.core.widget.autocompletePhone.ValidationListener
        public void onValidate(boolean z10, boolean z11) {
            Button p10 = a.this.p();
            if (p10 != null) {
                p10.setEnabled(z10);
            }
            SNSFlaggedInputLayout w2 = a.this.w();
            if (w2 == null) {
                return;
            }
            w2.setError(null);
        }
    }

    public static final class f implements SNSPinView.OnTextCompleteListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SNSVerificationStepViewModel.e.c f14315b;

        public f(SNSVerificationStepViewModel.e.c cVar) {
            this.f14315b = cVar;
        }

        @Override // com.sumsub.sns.core.widget.pincode.SNSPinView.OnTextCompleteListener
        public boolean onTextComplete(String str) {
            a.this.getViewModel().a(this.f14315b.m(), str);
            SNSPinView u6 = a.this.u();
            if (u6 == null) {
                return true;
            }
            com.sumsub.sns.internal.core.common.i.b(u6);
            return true;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f14316a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f14316a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f14316a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f14317a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f14317a.invoke();
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f14318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(O9.f fVar) {
            super(0);
            this.f14318a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f14318a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14319a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f14320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f14319a = interfaceC0635a;
            this.f14320b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f14319a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f14320b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<T> {
        public l() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new SNSVerificationStepViewModel.d(aVar, aVar.B(), a.this.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f14294q = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tlEmail", "getTlEmail()Lcom/google/android/material/textfield/TextInputLayout;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "etEmailId", "getEtEmailId()Lcom/google/android/material/textfield/TextInputEditText;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tlPhone", "getTlPhone()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "etPhone", "getEtPhone()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "pinCode", "getPinCode()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvResendCode", "getTvResendCode()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvStatus", "getTvStatus()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "otpErrorText", "getOtpErrorText()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        l lVar = new l();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new h(new g(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(SNSVerificationStepViewModel.class), new i(b9), lVar, new j(null, b9));
    }

    public static final void c(a aVar, View view) {
        Button p10 = aVar.p();
        if (p10 != null) {
            p10.setEnabled(false);
        }
        SNSVerificationStepViewModel viewModel = aVar.getViewModel();
        SNSTextInputEditText r8 = aVar.r();
        viewModel.b(String.valueOf(r8 != null ? r8.getRawText() : null));
        SNSTextInputEditText r10 = aVar.r();
        if (r10 != null) {
            com.sumsub.sns.internal.core.common.i.b(r10);
        }
        aVar.o();
    }

    public final TextView A() {
        return (TextView) this.tvTitle.a(this, f14294q[0]);
    }

    public final ValidationIdentifierType B() {
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("ValidationIdentifier") : null;
        ValidationIdentifierType validationIdentifierType = obj instanceof ValidationIdentifierType ? (ValidationIdentifierType) obj : null;
        return validationIdentifierType == null ? ValidationIdentifierType.UNKNOWN : validationIdentifierType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public SNSVerificationStepViewModel getViewModel() {
        return (SNSVerificationStepViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        int i9 = b.f14309a[B().ordinal()];
        if (i9 == 1) {
            return DocumentType.f15251g;
        }
        if (i9 == 2) {
            return DocumentType.f15252h;
        }
        if (i9 == 3) {
            return DocumentType.f15253j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_verification_step;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (!(event instanceof SNSVerificationStepViewModel.c.b)) {
            if (event instanceof SNSVerificationStepViewModel.c.a) {
                l();
                return;
            } else {
                super.handleEvent(event);
                return;
            }
        }
        SNSPinView u6 = u();
        if (u6 != null) {
            u6.setText((CharSequence) null);
        }
        SNSPinView u10 = u();
        if (u10 != null) {
            com.sumsub.sns.internal.core.common.i.g(u10);
        }
        SNSPinView u11 = u();
        if (u11 != null) {
            u11.addTextChangedListener(new c(u11, this));
        }
    }

    public final void k() {
        com.sumsub.sns.core.presentation.b.setResult$default(this, 5, null, 2, null);
    }

    public final void l() {
        if (isForResult()) {
            com.sumsub.sns.core.presentation.b.setResult$default(this, 1, null, 2, null);
        } else {
            com.sumsub.sns.core.presentation.b.finish$default(this, new q.b(false, 1, null), null, null, 6, null);
        }
    }

    public final void m() {
        com.sumsub.sns.core.presentation.b.setResult$default(this, 4, null, 2, null);
    }

    public final void n() {
        com.sumsub.sns.core.presentation.b.setResult$default(this, 3, null, 2, null);
    }

    public final void o() {
        com.sumsub.sns.core.presentation.b.setResult$default(this, 2, null, 2, null);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PhoneKit phoneKit = this.phoneNumberKit;
        if (phoneKit != null) {
            phoneKit.detach(getContext());
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (kotlin.jvm.internal.f.b(finishReason, q.c.f15162b)) {
            SNSPinView u6 = u();
            if (u6 != null && u6.getVisibility() == 0) {
                getViewModel().w();
                return false;
            }
            k();
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        PhoneKit phoneKit = this.phoneNumberKit;
        if (phoneKit != null) {
            phoneKit.saveInstanceState(outState);
        }
    }

    public final Button p() {
        return (Button) this.btnPrimary.a(this, f14294q[10]);
    }

    public final TextInputEditText q() {
        return (TextInputEditText) this.etEmailId.a(this, f14294q[3]);
    }

    public final SNSTextInputEditText r() {
        return (SNSTextInputEditText) this.etPhone.a(this, f14294q[5]);
    }

    public final ImageView s() {
        return (ImageView) this.ivIcon.a(this, f14294q[8]);
    }

    public final TextView t() {
        return (TextView) this.otpErrorText.a(this, f14294q[11]);
    }

    public final SNSPinView u() {
        return (SNSPinView) this.pinCode.a(this, f14294q[6]);
    }

    public final TextInputLayout v() {
        return (TextInputLayout) this.tlEmail.a(this, f14294q[2]);
    }

    public final SNSFlaggedInputLayout w() {
        return (SNSFlaggedInputLayout) this.tlPhone.a(this, f14294q[4]);
    }

    public final TextView x() {
        return (TextView) this.tvResendCode.a(this, f14294q[7]);
    }

    public final TextView y() {
        return (TextView) this.tvStatus.a(this, f14294q[9]);
    }

    public final TextView z() {
        return (TextView) this.tvSubtitle.a(this, f14294q[1]);
    }

    public static final void b(a aVar, View view) {
        Button p10 = aVar.p();
        if (p10 != null) {
            p10.setEnabled(false);
        }
        SNSVerificationStepViewModel viewModel = aVar.getViewModel();
        TextInputEditText q10 = aVar.q();
        viewModel.b(String.valueOf(q10 != null ? q10.getText() : null));
        TextInputEditText q11 = aVar.q();
        if (q11 != null) {
            com.sumsub.sns.internal.core.common.i.b(q11);
        }
        aVar.o();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(SNSVerificationStepViewModel.e state, Bundle savedInstanceState) {
        if (state instanceof SNSVerificationStepViewModel.e.d) {
            a((SNSVerificationStepViewModel.e.d) state);
            return;
        }
        if (state instanceof SNSVerificationStepViewModel.e.C0249e) {
            b((SNSVerificationStepViewModel.e.C0249e) state, savedInstanceState);
        } else if (state instanceof SNSVerificationStepViewModel.e.c) {
            a((SNSVerificationStepViewModel.e.c) state);
        } else if (state instanceof SNSVerificationStepViewModel.e.b) {
            a((SNSVerificationStepViewModel.e.b) state);
        }
    }

    public final void b(SNSVerificationStepViewModel.e.C0249e state, Bundle savedInstanceState) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "showValidatePhoneForm " + state, null, 4, null);
        com.sumsub.sns.internal.core.common.i.c(A(), z(), w(), r(), p());
        com.sumsub.sns.internal.core.common.i.a(v(), q(), u(), t(), x(), s(), y());
        TextView A10 = A();
        if (A10 != null) {
            CharSequence c2 = state.c();
            A10.setText(c2 != null ? com.sumsub.sns.internal.core.common.i.a(c2, requireContext()) : null);
        }
        TextView z10 = z();
        if (z10 != null) {
            CharSequence b9 = state.b();
            z10.setText(b9 != null ? com.sumsub.sns.internal.core.common.i.a(b9, requireContext()) : null);
        }
        TextInputLayout v10 = v();
        if (v10 != null) {
            v10.setVisibility(8);
        }
        SNSFlaggedInputLayout w2 = w();
        if (w2 != null) {
            w2.setError(state.k());
        }
        SNSTextInputEditText r8 = r();
        if (r8 != null) {
            r8.setOnEditorActionListener(new com.sumsub.sns.core.presentation.screen.verification.b(this, 1));
        }
        Button p10 = p();
        if (p10 != null) {
            p10.setText(state.l());
        }
        Button p11 = p();
        if (p11 != null) {
            p11.setEnabled(true);
        }
        Button p12 = p();
        if (p12 != null) {
            p12.setOnClickListener(new com.sumsub.sns.core.presentation.screen.verification.c(this, 1));
        }
        SNSTextInputEditText r10 = r();
        if (r10 != null) {
            com.sumsub.sns.internal.core.common.i.g(r10);
        }
        a(state, savedInstanceState);
    }

    public final void a(SNSVerificationStepViewModel.e.d state) {
        e eVar;
        TextInputEditText q10;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "showValidateEmailForm " + state, null, 4, null);
        com.sumsub.sns.internal.core.common.i.c(A(), z(), v(), q(), p());
        com.sumsub.sns.internal.core.common.i.a(w(), r(), u(), t(), x(), s(), y());
        TextView A10 = A();
        if (A10 != null) {
            CharSequence c2 = state.c();
            A10.setText(c2 != null ? com.sumsub.sns.internal.core.common.i.a(c2, requireContext()) : null);
        }
        TextView z10 = z();
        if (z10 != null) {
            CharSequence b9 = state.b();
            z10.setText(b9 != null ? com.sumsub.sns.internal.core.common.i.a(b9, requireContext()) : null);
        }
        TextInputLayout v10 = v();
        if (v10 != null) {
            v10.setError(state.j());
        }
        if (state.a() != null && (!C0969n.i0(r1))) {
            TextInputEditText q11 = q();
            if (q11 != null) {
                q11.setText(state.a());
            }
            TextInputEditText q12 = q();
            if (q12 != null) {
                q12.setSelection(state.a().length());
            }
        }
        TextInputEditText q13 = q();
        if (q13 != null) {
            q13.setHint(state.k());
        }
        TextInputEditText q14 = q();
        if (q14 != null) {
            q14.setOnEditorActionListener(new com.sumsub.sns.core.presentation.screen.verification.b(this, 0));
        }
        TextWatcher textWatcher = this.emailTextWatcher;
        if (textWatcher != null && (q10 = q()) != null) {
            q10.removeTextChangedListener(textWatcher);
        }
        TextInputEditText q15 = q();
        if (q15 != null) {
            eVar = new e();
            q15.addTextChangedListener(eVar);
        } else {
            eVar = null;
        }
        this.emailTextWatcher = eVar;
        TextInputEditText q16 = q();
        if (q16 != null) {
            com.sumsub.sns.internal.core.common.i.g(q16);
        }
        Button p10 = p();
        if (p10 != null) {
            p10.setText(state.l());
        }
        Button p11 = p();
        if (p11 != null) {
            TextInputEditText q17 = q();
            Editable text = q17 != null ? q17.getText() : null;
            p11.setEnabled(true ^ (text == null || C0969n.i0(text)));
        }
        Button p12 = p();
        if (p12 != null) {
            p12.setOnClickListener(new com.sumsub.sns.core.presentation.screen.verification.c(this, 0));
        }
    }

    public static final boolean b(a aVar, TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        PhoneKit phoneKit = aVar.phoneNumberKit;
        if (phoneKit != null && phoneKit.isValid()) {
            Button p10 = aVar.p();
            if (p10 != null) {
                p10.setEnabled(false);
            }
            SNSVerificationStepViewModel viewModel = aVar.getViewModel();
            SNSTextInputEditText r8 = aVar.r();
            viewModel.b(String.valueOf(r8 != null ? r8.getRawText() : null));
            aVar.o();
        }
        com.sumsub.sns.internal.core.common.i.b(textView);
        return true;
    }

    public static final class c implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f14310a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f14311b;

        public c(TextView textView, a aVar) {
            this.f14310a = textView;
            this.f14311b = aVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            this.f14311b.getViewModel().p();
            this.f14310a.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            if (charSequence != null && (!C0969n.i0(charSequence))) {
                a.this.getViewModel().p();
            }
            Button p10 = a.this.p();
            if (p10 == null) {
                return;
            }
            TextInputEditText q10 = a.this.q();
            Editable text = q10 != null ? q10.getText() : null;
            p10.setEnabled(true ^ (text == null || C0969n.i0(text)));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    public static final boolean a(a aVar, TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        Button p10 = aVar.p();
        if (p10 != null) {
            p10.setEnabled(false);
        }
        SNSVerificationStepViewModel viewModel = aVar.getViewModel();
        TextInputEditText q10 = aVar.q();
        viewModel.b(String.valueOf(q10 != null ? q10.getText() : null));
        com.sumsub.sns.internal.core.common.i.b(textView);
        aVar.o();
        return true;
    }

    public final void a(SNSVerificationStepViewModel.e.c state) {
        SNSPinView u6;
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "showVerifyCode " + state, null, 4, null);
        SNSPinView u10 = u();
        if ((u10 == null || u10.getVisibility() != 0) && (u6 = u()) != null) {
            com.sumsub.sns.internal.core.common.i.g(u6);
        }
        com.sumsub.sns.internal.core.common.i.c(A(), z(), u(), t(), x());
        com.sumsub.sns.internal.core.common.i.a(v(), q(), w(), r(), s(), y(), p());
        TextView A10 = A();
        if (A10 != null) {
            CharSequence c2 = state.c();
            A10.setText(c2 != null ? com.sumsub.sns.internal.core.common.i.a(c2, requireContext()) : null);
        }
        TextView z10 = z();
        if (z10 != null) {
            CharSequence b9 = state.b();
            z10.setText(b9 != null ? com.sumsub.sns.internal.core.common.i.a(b9, requireContext()) : null);
        }
        SNSPinView u11 = u();
        if (u11 != null) {
            Integer q10 = state.q();
            u11.setItemCount(q10 != null ? q10.intValue() : 6);
        }
        SNSPinView u12 = u();
        if (u12 != null) {
            u12.setOnTextCompleteListener(new f(state));
        }
        TextView t3 = t();
        if (t3 != null) {
            t3.setText(state.l());
        }
        SNSPinView u13 = u();
        if (u13 != null) {
            u13.setError(state.l() != null);
        }
        if (state.l() != null) {
            m();
        }
        if (state.p() != null) {
            TextView x9 = x();
            if (x9 != null) {
                x9.setEnabled(false);
            }
            TextView x10 = x();
            if (x10 != null) {
                x10.setText(state.p());
            }
            TextView x11 = x();
            if (x11 != null) {
                x11.setOnClickListener(null);
            }
        } else if (state.o() != null) {
            TextView x12 = x();
            if (x12 != null) {
                x12.setEnabled(true);
            }
            TextView x13 = x();
            if (x13 != null) {
                x13.setText(state.o());
            }
            TextView x14 = x();
            if (x14 != null) {
                x14.setOnClickListener(new B7.f(14, this, state));
            }
        }
        SNSPinView u14 = u();
        if (u14 != null) {
            u14.requestFocus();
        }
    }

    public static final void a(a aVar, SNSVerificationStepViewModel.e.c cVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), Screen.ConfirmationCodeScreen, aVar.getIdDocSetType(), Control.RetryButton, null, 8, null);
        aVar.getViewModel().b(cVar.n());
        aVar.n();
    }

    public final void a(SNSVerificationStepViewModel.e.b state) {
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "showStatus " + state, null, 4, null);
        com.sumsub.sns.internal.core.common.i.c(s(), y());
        com.sumsub.sns.internal.core.common.i.a(A(), z(), v(), q(), w(), r(), u(), t(), x(), p());
        if (state.f()) {
            m();
        }
        ImageView s10 = s();
        if (s10 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(s10, state.f() ? SNSStepState.REJECTED : SNSStepState.APPROVED);
        }
        ImageView s11 = s();
        if (s11 != null) {
            s11.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.d()));
        }
        TextView y10 = y();
        if (y10 != null) {
            y10.setText(state.c());
        }
        if (state.e() != null) {
            Button p10 = p();
            if (p10 != null) {
                p10.setVisibility(0);
            }
            Button p11 = p();
            if (p11 != null) {
                p11.setText(state.e());
            }
            Button p12 = p();
            if (p12 != null) {
                p12.setVisibility(0);
            }
            Button p13 = p();
            if (p13 != null) {
                p13.setEnabled(true);
            }
            Button p14 = p();
            if (p14 != null) {
                p14.setOnClickListener(new com.sumsub.sns.core.presentation.screen.verification.c(this, 2));
            }
        }
    }

    public static final void a(a aVar, View view) {
        aVar.getViewModel().w();
    }

    public final void a(SNSVerificationStepViewModel.e.C0249e state, Bundle savedInstanceState) {
        Object obj;
        if (this.phoneNumberKit != null) {
            return;
        }
        this.phoneNumberKit = PhoneKitProviderKt.getPhoneKit(w(), state.j().g(), state.j().k(), new d(), state.a());
        SNSFlaggedInputLayout w2 = w();
        if (w2 != null) {
            SNSCountryPicker.CountryItem.Companion companion = SNSCountryPicker.CountryItem.INSTANCE;
            Map<String, String> h9 = state.j().h();
            if (h9 == null) {
                h9 = kotlin.collections.a.p();
            }
            List<SNSCountryPicker.CountryItem> fromMap = companion.fromMap(h9);
            Iterator<T> it = fromMap.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.f.b(((SNSCountryPicker.CountryItem) obj).getCode(), state.j().i())) {
                        break;
                    }
                }
            }
            SNSCountryPicker.CountryItem countryItem = (SNSCountryPicker.CountryItem) obj;
            PhoneKit phoneKit = this.phoneNumberKit;
            if (phoneKit != null) {
                phoneKit.attachToInput(w2, fromMap, countryItem, savedInstanceState);
            }
        }
    }
}
