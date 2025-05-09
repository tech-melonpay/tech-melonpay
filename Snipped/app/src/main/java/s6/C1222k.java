package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: CardVaultBindingModel_.java */
/* renamed from: s6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1222k extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26909a;

    /* renamed from: b, reason: collision with root package name */
    public SpannedString f26910b;

    /* renamed from: c, reason: collision with root package name */
    public String f26911c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26912d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f26913e;

    public final C1222k a(SpannedString spannedString) {
        onMutation();
        this.f26910b = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1222k b(String str) {
        onMutation();
        this.f26911c = str;
        return this;
    }

    public final C1222k c(Number[] numberArr) {
        super.mo9id(numberArr);
        return this;
    }

    public final C1222k d(String str) {
        onMutation();
        this.f26909a = str;
        return this;
    }

    public final C1222k e(T6.a aVar) {
        onMutation();
        this.f26912d = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1222k) || !super.equals(obj)) {
            return false;
        }
        C1222k c1222k = (C1222k) obj;
        c1222k.getClass();
        String str = this.f26909a;
        if (str == null ? c1222k.f26909a != null : !str.equals(c1222k.f26909a)) {
            return false;
        }
        SpannedString spannedString = this.f26910b;
        if (spannedString == null ? c1222k.f26910b != null : !spannedString.equals(c1222k.f26910b)) {
            return false;
        }
        String str2 = this.f26911c;
        if (str2 == null ? c1222k.f26911c != null : !str2.equals(c1222k.f26911c)) {
            return false;
        }
        if ((this.f26912d == null) != (c1222k.f26912d == null)) {
            return false;
        }
        return (this.f26913e == null) == (c1222k.f26913e == null);
    }

    public final C1222k f(T6.a aVar) {
        onMutation();
        this.f26913e = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_card_vault;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePostBind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePreBind(EpoxyViewHolder epoxyViewHolder, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int hashCode = super.hashCode() * 28629151;
        String str = this.f26909a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        SpannedString spannedString = this.f26910b;
        int hashCode3 = (hashCode2 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        String str2 = this.f26911c;
        return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f26912d != null ? 1 : 0)) * 31) + (this.f26913e != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final void onVisibilityChanged(float f10, float f11, int i, int i9, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        super.onVisibilityChanged(f10, f11, i, i9, (int) dataBindingHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final void onVisibilityStateChanged(int i, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        super.onVisibilityStateChanged(i, (int) dataBindingHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: reset */
    public final EpoxyModel reset2() {
        this.f26909a = null;
        this.f26910b = null;
        this.f26911c = null;
        this.f26912d = null;
        this.f26913e = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26909a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, null)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(7, this.f26910b)) {
            throw new IllegalStateException("The attribute amountText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(8, this.f26911c)) {
            throw new IllegalStateException("The attribute availableBalance was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(153, this.f26912d)) {
            throw new IllegalStateException("The attribute topUpClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(164, this.f26913e)) {
            throw new IllegalStateException("The attribute vaultDetailClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show */
    public final EpoxyModel show2() {
        super.show2();
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: spanSizeOverride */
    public final EpoxyModel mo12spanSizeOverride(EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        super.mo12spanSizeOverride(spanSizeOverrideCallback);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "CardVaultBindingModel_{nameText=" + this.f26909a + ", currency=null, amountText=" + ((Object) this.f26910b) + ", availableBalance=" + this.f26911c + ", topUpClick=" + this.f26912d + ", vaultDetailClick=" + this.f26913e + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    public final void unbind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        super.unbind(dataBindingHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo9id(Number[] numberArr) {
        super.mo9id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show */
    public final EpoxyModel show2(boolean z10) {
        super.show2(z10);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo5id(long j10, long j11) {
        super.mo5id(j10, j11);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void onVisibilityChanged(float f10, float f11, int i, int i9, Object obj) {
        super.onVisibilityChanged(f10, f11, i, i9, (int) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void onVisibilityStateChanged(int i, Object obj) {
        super.onVisibilityStateChanged(i, (int) obj);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void unbind(Object obj) {
        super.unbind((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo6id(CharSequence charSequence) {
        super.mo6id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo8id(CharSequence charSequence, CharSequence[] charSequenceArr) {
        super.mo8id(charSequence, charSequenceArr);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void unbind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder) {
        super.unbind(dataBindingHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo7id(CharSequence charSequence, long j10) {
        super.mo7id(charSequence, j10);
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof C1222k)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1222k c1222k = (C1222k) epoxyModel;
        String str = this.f26909a;
        if (str == null ? c1222k.f26909a != null : !str.equals(c1222k.f26909a)) {
            fVar.m(101, this.f26909a);
        }
        c1222k.getClass();
        SpannedString spannedString = this.f26910b;
        if (spannedString == null ? c1222k.f26910b != null : !spannedString.equals(c1222k.f26910b)) {
            fVar.m(7, this.f26910b);
        }
        String str2 = this.f26911c;
        if (str2 == null ? c1222k.f26911c != null : !str2.equals(c1222k.f26911c)) {
            fVar.m(8, this.f26911c);
        }
        View.OnClickListener onClickListener = this.f26912d;
        if ((onClickListener == null) != (c1222k.f26912d == null)) {
            fVar.m(153, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f26913e;
        if ((onClickListener2 == null) != (c1222k.f26913e == null)) {
            fVar.m(164, onClickListener2);
        }
    }
}
