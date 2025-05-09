package m;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: SearchView.java */
/* loaded from: classes.dex */
public final class Q implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f23694a;

    public Q(SearchView searchView) {
        this.f23694a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        SearchView searchView = this.f23694a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f4997L;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z10);
        }
    }
}
