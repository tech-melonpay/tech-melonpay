package v8;

import J8.a;
import android.content.Context;
import com.google.android.material.bottomsheet.e;
import com.luminary.mobile.R;

/* compiled from: DialogAutoClosing.kt */
/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogC1549a extends e implements a.b {
    public DialogC1549a(Context context) {
        super(context, R.style.Bottom_Sheet_Style);
    }

    @Override // com.google.android.material.bottomsheet.e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.C0028a.a().f2199d.add(this);
    }

    @Override // com.google.android.material.bottomsheet.e, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        a.C0028a.a().f2199d.remove(this);
        super.onDetachedFromWindow();
    }

    public void b() {
    }
}
