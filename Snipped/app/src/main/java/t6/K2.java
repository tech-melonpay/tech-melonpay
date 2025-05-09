package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* compiled from: FragmentAllTransactionsBinding.java */
/* loaded from: classes2.dex */
public abstract class K2 extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f28064n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f28065o;

    /* renamed from: p, reason: collision with root package name */
    public final EpoxyRecyclerView f28066p;

    /* renamed from: q, reason: collision with root package name */
    public final SwipeRefreshLayout f28067q;

    /* renamed from: r, reason: collision with root package name */
    public final View f28068r;

    public K2(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, EpoxyRecyclerView epoxyRecyclerView, SwipeRefreshLayout swipeRefreshLayout, View view2) {
        super(obj, view, 0);
        this.f28064n = constraintLayout;
        this.f28065o = textView;
        this.f28066p = epoxyRecyclerView;
        this.f28067q = swipeRefreshLayout;
        this.f28068r = view2;
    }
}
