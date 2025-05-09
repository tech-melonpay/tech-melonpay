package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* compiled from: FragmentAccountDetailsBinding.java */
/* loaded from: classes2.dex */
public abstract class A2 extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f27600n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f27601o;

    /* renamed from: p, reason: collision with root package name */
    public final EpoxyRecyclerView f27602p;

    /* renamed from: q, reason: collision with root package name */
    public final SwipeRefreshLayout f27603q;

    /* renamed from: r, reason: collision with root package name */
    public final View f27604r;

    public A2(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, View view2) {
        super(obj, view, 0);
        this.f27600n = constraintLayout;
        this.f27601o = textView;
        this.f27602p = epoxyRecyclerView;
        this.f27603q = swipeRefreshLayout;
        this.f27604r = view2;
    }
}
