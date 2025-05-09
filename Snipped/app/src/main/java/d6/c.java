package D6;

import android.os.Parcelable;
import android.view.View;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountDetailsController f928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f929c;

    public /* synthetic */ c(AccountDetailsController accountDetailsController, Parcelable parcelable, int i) {
        this.f927a = i;
        this.f928b = accountDetailsController;
        this.f929c = parcelable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean showAccountDetailData$lambda$17$lambda$16;
        boolean showAccountDetailData$lambda$19$lambda$18;
        boolean buildModels$lambda$10$lambda$9$lambda$7;
        switch (this.f927a) {
            case 0:
                showAccountDetailData$lambda$17$lambda$16 = AccountDetailsController.showAccountDetailData$lambda$17$lambda$16(this.f928b, (AccountDetailsUI.ProviderRequisiteUI) this.f929c, view);
                return showAccountDetailData$lambda$17$lambda$16;
            case 1:
                showAccountDetailData$lambda$19$lambda$18 = AccountDetailsController.showAccountDetailData$lambda$19$lambda$18(this.f928b, (AccountDetailsUI.ProviderRequisiteUI) this.f929c, view);
                return showAccountDetailData$lambda$19$lambda$18;
            default:
                buildModels$lambda$10$lambda$9$lambda$7 = AccountDetailsController.buildModels$lambda$10$lambda$9$lambda$7(this.f928b, (AccountDetailsUI) this.f929c, view);
                return buildModels$lambda$10$lambda$9$lambda$7;
        }
    }
}
