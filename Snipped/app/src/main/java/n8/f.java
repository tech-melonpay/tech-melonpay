package n8;

import android.view.View;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StatementsSelectorDialog.SelectorController f24299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StatementsSelectorDialog.a f24300c;

    public /* synthetic */ f(StatementsSelectorDialog.a aVar, StatementsSelectorDialog.SelectorController selectorController, int i) {
        this.f24298a = i;
        this.f24300c = aVar;
        this.f24299b = selectorController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24298a) {
            case 0:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$3$lambda$2(this.f24299b, this.f24300c, view);
                break;
            case 1:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$5$lambda$4(this.f24299b, this.f24300c, view);
                break;
            case 2:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$7$lambda$6(this.f24299b, this.f24300c, view);
                break;
            case 3:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$9$lambda$8(this.f24300c, this.f24299b, view);
                break;
            case 4:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$11$lambda$10(this.f24299b, this.f24300c, view);
                break;
            case 5:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$13$lambda$12(this.f24300c, this.f24299b, view);
                break;
            case 6:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$15$lambda$14(this.f24299b, this.f24300c, view);
                break;
            default:
                StatementsSelectorDialog.SelectorController.buildModels$lambda$18$lambda$17$lambda$16(this.f24300c, this.f24299b, view);
                break;
        }
    }

    public /* synthetic */ f(StatementsSelectorDialog.SelectorController selectorController, StatementsSelectorDialog.a aVar, int i) {
        this.f24298a = i;
        this.f24299b = selectorController;
        this.f24300c = aVar;
    }
}
