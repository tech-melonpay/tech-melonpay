package com.sumsub.sns.core.widget.autocompletePhone.bottomsheet;

import O9.p;
import V9.d;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0533g;
import ca.InterfaceC0650p;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.tls.CipherSuite;

@d(c = "com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog$onViewCreated$2", f = "SNSPickerDialog.kt", l = {CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSPickerDialog$onViewCreated$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ TextInputLayout $searchEditLayout;
    int label;
    final /* synthetic */ SNSPickerDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNSPickerDialog$onViewCreated$2(SNSPickerDialog sNSPickerDialog, TextInputLayout textInputLayout, T9.a<? super SNSPickerDialog$onViewCreated$2> aVar) {
        super(2, aVar);
        this.this$0 = sNSPickerDialog;
        this.$searchEditLayout = textInputLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new SNSPickerDialog$onViewCreated$2(this.this$0, this.$searchEditLayout, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.sumsub.sns.internal.core.a f10;
        com.sumsub.sns.internal.core.data.source.dynamic.b p10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ActivityC0533g requireActivity = this.this$0.requireActivity();
            com.sumsub.sns.core.presentation.a aVar = requireActivity instanceof com.sumsub.sns.core.presentation.a ? (com.sumsub.sns.core.presentation.a) requireActivity : null;
            if (aVar != null && (f10 = aVar.f()) != null && (p10 = f10.p()) != null) {
                this.label = 1;
                obj = p10.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p.f3034a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        b.c cVar = (b.c) obj;
        if (cVar != null) {
            TextInputLayout textInputLayout = this.$searchEditLayout;
            EditText editText = textInputLayout != null ? textInputLayout.getEditText() : null;
            if (editText != null) {
                editText.setHint(cVar.a("sns_general_search_placeholder"));
            }
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((SNSPickerDialog$onViewCreated$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
