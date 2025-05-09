package n8;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import v8.DialogC1549a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f24296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogC1549a f24297c;

    public /* synthetic */ e(View view, DialogC1549a dialogC1549a, int i) {
        this.f24295a = i;
        this.f24296b = view;
        this.f24297c = dialogC1549a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f24295a) {
            case 0:
                if (this.f24296b.getHeight() >= Resources.getSystem().getDisplayMetrics().heightPixels - 250) {
                    ((StatementsSelectorDialog) this.f24297c).j().setState(3);
                    break;
                }
                break;
            default:
                if (this.f24296b.getHeight() >= Resources.getSystem().getDisplayMetrics().heightPixels - 250) {
                    ((SelectorDialog) this.f24297c).j().setState(3);
                    break;
                }
                break;
        }
    }
}
