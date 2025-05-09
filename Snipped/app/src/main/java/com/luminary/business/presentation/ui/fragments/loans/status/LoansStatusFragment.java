package com.luminary.business.presentation.ui.fragments.loans.status;

import Fa.h;
import U4.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import k0.C0913a;
import kotlin.NoWhenBranchMatchedException;
import t6.AbstractC1389m4;

/* compiled from: LoansStatusFragment.kt */
/* loaded from: classes2.dex */
public final class LoansStatusFragment extends BaseFragment<AbstractC1389m4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12372n0 = R.layout.fragment_loans_status;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12373o0 = new h(kotlin.jvm.internal.h.a(com.luminary.business.presentation.ui.fragments.loans.status.a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.loans.status.LoansStatusFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final Bundle invoke() {
            Fragment fragment = Fragment.this;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " has null arguments"));
        }
    });

    /* renamed from: p0, reason: collision with root package name */
    public StatusType f12374p0 = StatusType.WRONG;

    /* compiled from: LoansStatusFragment.kt */
    public enum StatusType {
        /* JADX INFO: Fake field, exist only in values array */
        IN_REVIEW(R.string.loan_status_in_review_title, R.string.loan_status_in_review_description, R.drawable.ic_circularloader),
        /* JADX INFO: Fake field, exist only in values array */
        APPROVED(R.string.loan_status_approved_title, R.string.loan_status_approved_description, R.drawable.ic_verified),
        /* JADX INFO: Fake field, exist only in values array */
        DECLINED(R.string.loan_status_decline_title, R.string.loan_status_decline_description, R.drawable.ic_close_red),
        WRONG(R.string.loan_status_wrong_title, R.string.loan_status_wrong_description, R.drawable.ic_call);


        /* renamed from: a, reason: collision with root package name */
        public final int f12378a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12379b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12380c;

        StatusType(int i, int i9, int i10) {
            this.f12378a = i;
            this.f12379b = i9;
            this.f12380c = i10;
        }
    }

    /* compiled from: LoansStatusFragment.kt */
    public static final class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            LoansStatusFragment loansStatusFragment = LoansStatusFragment.this;
            loansStatusFragment.getClass();
            loansStatusFragment.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat("02037780105"))));
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        b.g(this).m(R.id.loansFragment, false);
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_loans);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12374p0 = ((com.luminary.business.presentation.ui.fragments.loans.status.a) this.f12373o0.getValue()).f12382a;
        AbstractC1389m4 u02 = u0();
        u02.f29322p.setText(getString(this.f12374p0.f12378a));
        AbstractC1389m4 u03 = u0();
        u03.f29321o.setImageResource(this.f12374p0.f12380c);
        AbstractC1389m4 u04 = u0();
        u04.f29320n.setTextColor(requireContext().getColor(R.color.black));
        a aVar = new a();
        int ordinal = this.f12374p0.ordinal();
        if (ordinal == 0) {
            SpannableString spannableString = new SpannableString(getText(this.f12374p0.f12379b));
            SpannableString spannableString2 = new SpannableString(spannableString);
            spannableString2.setSpan(aVar, 144, spannableString.length(), 33);
            spannableString2.setSpan(new ForegroundColorSpan(C0913a.getColor(requireContext(), R.color.main_color)), 144, spannableString.length(), 0);
            u0().f29320n.setMovementMethod(LinkMovementMethod.getInstance());
            u0().f29320n.setText(spannableString2);
            return;
        }
        if (ordinal == 1) {
            SpannableString spannableString3 = new SpannableString(getText(this.f12374p0.f12379b));
            SpannableString spannableString4 = new SpannableString(spannableString3);
            spannableString4.setSpan(aVar, 144, spannableString3.length(), 33);
            spannableString4.setSpan(new ForegroundColorSpan(C0913a.getColor(requireContext(), R.color.main_color)), 144, spannableString3.length(), 0);
            u0().f29320n.setMovementMethod(LinkMovementMethod.getInstance());
            u0().f29320n.setText(spannableString4);
            return;
        }
        if (ordinal == 2) {
            SpannableString spannableString5 = new SpannableString(getText(this.f12374p0.f12379b));
            SpannableString spannableString6 = new SpannableString(spannableString5);
            spannableString6.setSpan(aVar, 94, spannableString5.length(), 33);
            spannableString6.setSpan(new ForegroundColorSpan(C0913a.getColor(requireContext(), R.color.main_color)), 94, spannableString5.length(), 0);
            u0().f29320n.setMovementMethod(LinkMovementMethod.getInstance());
            u0().f29320n.setText(spannableString6);
            return;
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        SpannableString spannableString7 = new SpannableString(getText(this.f12374p0.f12379b));
        SpannableString spannableString8 = new SpannableString(spannableString7);
        spannableString8.setSpan(aVar, 94, spannableString7.length(), 33);
        spannableString8.setSpan(new ForegroundColorSpan(C0913a.getColor(requireContext(), R.color.main_color)), 94, spannableString7.length(), 0);
        u0().f29320n.setMovementMethod(LinkMovementMethod.getInstance());
        u0().f29320n.setText(spannableString8);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12372n0;
    }
}
