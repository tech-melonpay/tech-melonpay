package com.luminary.business.presentation.ui.views.dialogs;

import F0.d;
import F0.f;
import F8.o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import com.luminary.mobile.R;
import kotlin.NoWhenBranchMatchedException;
import t6.AbstractC1462w2;
import v8.DialogC1549a;

/* compiled from: EditTFADialog.kt */
/* loaded from: classes2.dex */
public final class EditTFADialog extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1462w2 f13197q;

    /* renamed from: r, reason: collision with root package name */
    public final State f13198r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditTFADialog.kt */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f13199a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ State[] f13200b;

        static {
            State state = new State("MAIN", 0);
            f13199a = state;
            f13200b = new State[]{state, new State("PHONE", 1), new State("TOTP", 2)};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f13200b.clone();
        }
    }

    public EditTFADialog(Context context) {
        super(context);
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1462w2.f29733q;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1462w2 abstractC1462w2 = (AbstractC1462w2) f.f(from, R.layout.edit_2fa_dialog, null, false, null);
        this.f13197q = abstractC1462w2;
        this.f13198r = State.f13199a;
        setCancelable(false);
        setContentView(abstractC1462w2.f1148d);
        setCanceledOnTouchOutside(false);
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int ordinal = this.f13198r.ordinal();
        AbstractC1462w2 abstractC1462w2 = this.f13197q;
        if (ordinal == 0) {
            abstractC1462w2.f29734n.setVisibility(0);
            o.b(abstractC1462w2.f29735o);
            o.b(abstractC1462w2.f29736p);
        } else if (ordinal == 1) {
            abstractC1462w2.f29734n.setVisibility(4);
            abstractC1462w2.f29735o.setVisibility(0);
            o.b(abstractC1462w2.f29736p);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC1462w2.f29734n.setVisibility(4);
            o.b(abstractC1462w2.f29735o);
            abstractC1462w2.f29736p.setVisibility(0);
        }
    }
}
