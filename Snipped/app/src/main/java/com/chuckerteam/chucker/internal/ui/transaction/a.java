package com.chuckerteam.chucker.internal.ui.transaction;

import B1.f;
import O9.p;
import P9.s;
import P9.u;
import P9.v;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.chuckerteam.chucker.internal.ui.transaction.d;
import com.chuckerteam.chucker.internal.ui.transaction.e;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TransactionPayloadAdapter.kt */
/* loaded from: classes.dex */
public final class a extends RecyclerView.Adapter<e> {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0635a<p> f8771d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<d> f8772e = new ArrayList<>();

    /* compiled from: TransactionPayloadAdapter.kt */
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.a$a, reason: collision with other inner class name */
    public static final class C0097a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8773a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8774b;

        public C0097a(int i, int i9) {
            this.f8773a = i;
            this.f8774b = i9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0097a)) {
                return false;
            }
            C0097a c0097a = (C0097a) obj;
            return this.f8773a == c0097a.f8773a && this.f8774b == c0097a.f8774b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8774b) + (Integer.hashCode(this.f8773a) * 31);
        }

        public final String toString() {
            return "SearchItemBodyLine(indexBodyLine=" + this.f8773a + ", indexStartOfQuerySubString=" + this.f8774b + ")";
        }
    }

    public a(InterfaceC0635a<p> interfaceC0635a) {
        this.f8771d = interfaceC0635a;
    }

    public static int d(SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
            if (!(obj instanceof SpanTextUtil.ChuckerForegroundColorSpan)) {
                spannableStringBuilder.removeSpan(obj);
                i++;
            }
        }
        return i;
    }

    public final void e(String str, int i, int i9, int i10, int i11) {
        Object M8 = s.M(i, this.f8772e);
        d.a aVar = M8 instanceof d.a ? (d.a) M8 : null;
        if (aVar != null) {
            SpannableStringBuilder spannableStringBuilder = aVar.f8777a;
            Ja.a.d(spannableStringBuilder, i9, str.length(), i10, i11);
            aVar.f8777a = spannableStringBuilder;
            notifyItemChanged(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        ArrayList<d> arrayList = this.f8772e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<d> it = arrayList.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof d.a) {
                arrayList2.add(next);
            }
        }
        v vVar = new v(arrayList2.iterator(), 0);
        while (((Iterator) vVar.f3168c).hasNext()) {
            u uVar = (u) vVar.next();
            int i = uVar.f3164a;
            if (d(((d.a) uVar.f3165b).f8777a) > 0) {
                notifyItemChanged(i + 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8772e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        d dVar = this.f8772e.get(i);
        if (dVar instanceof d.c) {
            return 1;
        }
        if (dVar instanceof d.a) {
            return 2;
        }
        if (dVar instanceof d.C0098d) {
            return 3;
        }
        if (dVar instanceof d.b) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(e eVar, int i) {
        eVar.a(this.f8772e.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final e onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View inflate = from.inflate(R.layout.chucker_transaction_item_headers, viewGroup, false);
            if (inflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) inflate;
            return new e.c(new H1.e(textView, textView));
        }
        if (i == 2) {
            View inflate2 = from.inflate(R.layout.chucker_transaction_item_body_line, viewGroup, false);
            if (inflate2 == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView2 = (TextView) inflate2;
            return new e.a(new H1.e(textView2, textView2));
        }
        if (i != 4) {
            View inflate3 = from.inflate(R.layout.chucker_transaction_item_image, viewGroup, false);
            ImageView imageView = (ImageView) j3.e.q(R.id.binaryData, inflate3);
            if (imageView != null) {
                return new e.d(new f(4, (FrameLayout) inflate3, imageView));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.binaryData)));
        }
        View inflate4 = from.inflate(R.layout.chucker_transaction_item_copy, viewGroup, false);
        ImageButton imageButton = (ImageButton) j3.e.q(R.id.responseCopy, inflate4);
        if (imageButton != null) {
            return new e.b(new f(3, (LinearLayout) inflate4, imageButton), this.f8771d);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(R.id.responseCopy)));
    }
}
