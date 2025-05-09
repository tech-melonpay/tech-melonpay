package com.sumsub.sns.core.widget;

import android.view.View;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\b*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "value", "getSnsStepState", "(Landroid/view/View;)Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "setSnsStepState", "(Landroid/view/View;Lcom/sumsub/sns/internal/core/widget/SNSStepState;)V", "snsStepState", "", "getSnsStepStateDrawable", "(Landroid/view/View;)[I", "snsStepStateDrawable", "getToDrawableState", "(Lcom/sumsub/sns/internal/core/widget/SNSStepState;)[I", "toDrawableState", "idensic-mobile-sdk-aar_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSStepViewExtensionsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SNSStepState.values().length];
            iArr[SNSStepState.INIT.ordinal()] = 1;
            iArr[SNSStepState.PENDING.ordinal()] = 2;
            iArr[SNSStepState.APPROVED.ordinal()] = 3;
            iArr[SNSStepState.REJECTED.ordinal()] = 4;
            iArr[SNSStepState.PROCESSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int[] getSnsStepStateDrawable(View view) {
        SNSStepState sNSStepState;
        com.sumsub.sns.internal.core.widget.a aVar = view instanceof com.sumsub.sns.internal.core.widget.a ? (com.sumsub.sns.internal.core.widget.a) view : null;
        if (aVar == null || (sNSStepState = aVar.getSNSStepState()) == null) {
            sNSStepState = SNSStepState.INIT;
        }
        return getToDrawableState(sNSStepState);
    }

    public static final int[] getToDrawableState(SNSStepState sNSStepState) {
        int i = WhenMappings.$EnumSwitchMapping$0[sNSStepState.ordinal()];
        if (i == 1) {
            return SNSStepAttrs.INSTANCE.getSTATE_INIT();
        }
        if (i == 2) {
            return SNSStepAttrs.INSTANCE.getSTATE_PENDING();
        }
        if (i == 3) {
            return SNSStepAttrs.INSTANCE.getSTATE_APPROVED();
        }
        if (i == 4) {
            return SNSStepAttrs.INSTANCE.getSTATE_REJECTED();
        }
        if (i == 5) {
            return SNSStepAttrs.INSTANCE.getSTATE_PROCESSING();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setSnsStepState(View view, SNSStepState sNSStepState) {
        if ((view instanceof com.sumsub.sns.internal.core.widget.a ? (com.sumsub.sns.internal.core.widget.a) view : null) != null) {
            ((com.sumsub.sns.internal.core.widget.a) view).setSNSStepState(sNSStepState);
        }
    }
}
