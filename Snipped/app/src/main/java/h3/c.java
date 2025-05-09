package H3;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class c implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1458a;

    public c(e eVar) {
        this.f1458a = eVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        e eVar = this.f1458a;
        ((InputMethodManager) eVar.f1467k.getSystemService("input_method")).hideSoftInputFromWindow(eVar.i.getWindowToken(), 0);
        return true;
    }
}
