package com.sumsub.sns.core.presentation.screen.verification;

import android.view.KeyEvent;
import android.widget.TextView;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14323b;

    public /* synthetic */ b(Object obj, int i) {
        this.f14322a = i;
        this.f14323b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean m38lambda3$lambda2;
        switch (this.f14322a) {
            case 0:
                return a.a((a) this.f14323b, textView, i, keyEvent);
            case 1:
                return a.b((a) this.f14323b, textView, i, keyEvent);
            default:
                m38lambda3$lambda2 = SNSApplicantDataFieldView.m38lambda3$lambda2((SNSApplicantDataFieldView) this.f14323b, textView, i, keyEvent);
                return m38lambda3$lambda2;
        }
    }
}
