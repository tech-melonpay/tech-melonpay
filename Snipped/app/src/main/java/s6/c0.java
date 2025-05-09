package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: SelectorCryptoAccountBindingModel_.java */
/* loaded from: classes2.dex */
public final class c0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26797a;

    /* renamed from: b, reason: collision with root package name */
    public SpannedString f26798b;

    /* renamed from: c, reason: collision with root package name */
    public String f26799c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26800d;

    public final c0 a(Integer num) {
        onMutation();
        this.f26797a = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final c0 b(String str) {
        super.mo6id(str);
        return this;
    }

    public final c0 c(SpannedString spannedString) {
        onMutation();
        this.f26798b = spannedString;
        return this;
    }

    public final c0 d(n8.f fVar) {
        onMutation();
        this.f26800d = fVar;
        return this;
    }

    public final c0 e(String str) {
        onMutation();
        this.f26799c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0) || !super.equals(obj)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        c0Var.getClass();
        Integer num = this.f26797a;
        if (num == null ? c0Var.f26797a != null : !num.equals(c0Var.f26797a)) {
            return false;
        }
        SpannedString spannedString = this.f26798b;
        if (spannedString == null ? c0Var.f26798b != null : !spannedString.equals(c0Var.f26798b)) {
            return false;
        }
        String str = this.f26799c;
        if (str == null ? c0Var.f26799c == null : str.equals(c0Var.f26799c)) {
            return (this.f26800d == null) == (c0Var.f26800d == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_selector_crypto_account;
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
        Integer num = this.f26797a;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26798b;
        int hashCode3 = (hashCode2 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        String str = this.f26799c;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + (this.f26800d != null ? 1 : 0);
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
        this.f26797a = null;
        this.f26798b = null;
        this.f26799c = null;
        this.f26800d = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(44, this.f26797a)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, this.f26798b)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(146, this.f26799c)) {
            throw new IllegalStateException("The attribute subText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.f26800d)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "SelectorCryptoAccountBindingModel_{iconRes=" + this.f26797a + ", nameText=" + ((Object) this.f26798b) + ", subText=" + this.f26799c + ", onClick=" + this.f26800d + "}" + super.toString();
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
        if (!(epoxyModel instanceof c0)) {
            setDataBindingVariables(fVar);
            return;
        }
        c0 c0Var = (c0) epoxyModel;
        Integer num = this.f26797a;
        if (num == null ? c0Var.f26797a != null : !num.equals(c0Var.f26797a)) {
            fVar.m(44, this.f26797a);
        }
        SpannedString spannedString = this.f26798b;
        if (spannedString == null ? c0Var.f26798b != null : !spannedString.equals(c0Var.f26798b)) {
            fVar.m(101, this.f26798b);
        }
        String str = this.f26799c;
        if (str == null ? c0Var.f26799c != null : !str.equals(c0Var.f26799c)) {
            fVar.m(146, this.f26799c);
        }
        View.OnClickListener onClickListener = this.f26800d;
        if ((onClickListener == null) != (c0Var.f26800d == null)) {
            fVar.m(104, onClickListener);
        }
    }
}
