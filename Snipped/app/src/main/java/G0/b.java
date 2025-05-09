package G0;

import G0.c;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextViewBindingAdapter.java */
/* loaded from: classes.dex */
public final class b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.InterfaceC0016c f1306a;

    public b(c.InterfaceC0016c interfaceC0016c) {
        this.f1306a = interfaceC0016c;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        c.InterfaceC0016c interfaceC0016c = this.f1306a;
        if (interfaceC0016c != null) {
            interfaceC0016c.a(charSequence);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
