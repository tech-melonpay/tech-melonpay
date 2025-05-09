package com.chuckerteam.chucker.internal.ui.transaction;

import B1.f;
import O9.p;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.ui.transaction.d;
import com.luminary.mobile.R;
import k0.C0913a;

/* compiled from: TransactionPayloadAdapter.kt */
/* loaded from: classes.dex */
public abstract class e extends RecyclerView.C {

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class a extends e {

        /* renamed from: e, reason: collision with root package name */
        public final H1.e f8781e;

        public a(H1.e eVar) {
            super(eVar.f1455a);
            this.f8781e = eVar;
        }

        @Override // com.chuckerteam.chucker.internal.ui.transaction.e
        public final void a(com.chuckerteam.chucker.internal.ui.transaction.d dVar) {
            if (dVar instanceof d.a) {
                this.f8781e.f1456b.setText(((d.a) dVar).f8777a);
            }
        }
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public final f f8782e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0635a<p> f8783f;

        public b(f fVar, InterfaceC0635a<p> interfaceC0635a) {
            super((LinearLayout) fVar.f229b);
            this.f8782e = fVar;
            this.f8783f = interfaceC0635a;
        }

        @Override // com.chuckerteam.chucker.internal.ui.transaction.e
        public final void a(com.chuckerteam.chucker.internal.ui.transaction.d dVar) {
            if (dVar instanceof d.b) {
                f fVar = this.f8782e;
                ((ImageButton) fVar.f230c).setVisibility(0);
                ((ImageButton) fVar.f230c).setOnClickListener(new J7.b(this, 2));
            }
        }
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public final H1.e f8784e;

        public c(H1.e eVar) {
            super(eVar.f1455a);
            this.f8784e = eVar;
        }

        @Override // com.chuckerteam.chucker.internal.ui.transaction.e
        public final void a(com.chuckerteam.chucker.internal.ui.transaction.d dVar) {
            if (dVar instanceof d.c) {
                this.f8784e.f1456b.setText(((d.c) dVar).f8778a);
            }
        }
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final f f8785e;

        public d(f fVar) {
            super((FrameLayout) fVar.f229b);
            this.f8785e = fVar;
        }

        @Override // com.chuckerteam.chucker.internal.ui.transaction.e
        public final void a(com.chuckerteam.chucker.internal.ui.transaction.d dVar) {
            S1.b bVar;
            S1.b bVar2;
            if (dVar instanceof d.C0098d) {
                f fVar = this.f8785e;
                d.C0098d c0098d = (d.C0098d) dVar;
                ((ImageView) fVar.f230c).setImageBitmap(c0098d.f8779a);
                Double d10 = c0098d.f8780b;
                if (d10 == null) {
                    bVar2 = null;
                } else {
                    if (d10.doubleValue() < 0.25d) {
                        int i = S1.b.f3335b;
                        Context context = this.itemView.getContext();
                        bVar = new S1.b(C0913a.getColor(context, R.color.chucker_chessboard_even_square_light), C0913a.getColor(context, R.color.chucker_chessboard_odd_square_light), context.getResources().getDimensionPixelSize(R.dimen.chucker_half_grid));
                    } else {
                        int i9 = S1.b.f3335b;
                        Context context2 = this.itemView.getContext();
                        bVar = new S1.b(C0913a.getColor(context2, R.color.chucker_chessboard_even_square_dark), C0913a.getColor(context2, R.color.chucker_chessboard_odd_square_dark), context2.getResources().getDimensionPixelSize(R.dimen.chucker_half_grid));
                    }
                    bVar2 = bVar;
                }
                ((FrameLayout) fVar.f229b).setBackground(bVar2);
            }
        }
    }

    public abstract void a(com.chuckerteam.chucker.internal.ui.transaction.d dVar);
}
