package K7;

import android.view.View;
import com.luminary.business.presentation.ui.fragments.newcard.NewCardListController;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2260c;

    public /* synthetic */ a(int i, int i9, Object obj) {
        this.f2258a = i9;
        this.f2260c = obj;
        this.f2259b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2259b;
        Object obj = this.f2260c;
        switch (this.f2258a) {
            case 0:
                NewCardListController.buildModels$lambda$6$lambda$5$lambda$4((NewCardListController) obj, i, view);
                break;
            default:
                int i9 = DotsIndicator.f20361n;
                DotsIndicator dotsIndicator = (DotsIndicator) obj;
                if (dotsIndicator.getDotsClickable()) {
                    BaseDotsIndicator.a pager = dotsIndicator.getPager();
                    if (i < (pager != null ? pager.getCount() : 0)) {
                        dotsIndicator.getPager().c(i);
                        break;
                    }
                }
                break;
        }
    }
}
