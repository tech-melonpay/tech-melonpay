package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: StatementsSelectorAccountWithCurrencyBindingModel_.java */
/* loaded from: classes2.dex */
public final class i0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26897a;

    /* renamed from: b, reason: collision with root package name */
    public String f26898b;

    /* renamed from: c, reason: collision with root package name */
    public String f26899c;

    /* renamed from: d, reason: collision with root package name */
    public SpannedString f26900d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f26901e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26902f;

    public final i0 a(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0) || !super.equals(obj)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        i0Var.getClass();
        Integer num = this.f26897a;
        if (num == null ? i0Var.f26897a != null : !num.equals(i0Var.f26897a)) {
            return false;
        }
        String str = this.f26898b;
        if (str == null ? i0Var.f26898b != null : !str.equals(i0Var.f26898b)) {
            return false;
        }
        String str2 = this.f26899c;
        if (str2 == null ? i0Var.f26899c != null : !str2.equals(i0Var.f26899c)) {
            return false;
        }
        SpannedString spannedString = this.f26900d;
        if (spannedString == null ? i0Var.f26900d != null : !spannedString.equals(i0Var.f26900d)) {
            return false;
        }
        if ((this.f26901e == null) != (i0Var.f26901e == null)) {
            return false;
        }
        Boolean bool = this.f26902f;
        Boolean bool2 = i0Var.f26902f;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_statements_selector_account_with_currency;
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
        Integer num = this.f26897a;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f26898b;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26899c;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26900d;
        int hashCode5 = (((hashCode4 + (spannedString != null ? spannedString.hashCode() : 0)) * 31) + (this.f26901e != null ? 1 : 0)) * 31;
        Boolean bool = this.f26902f;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
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
        this.f26897a = null;
        this.f26898b = null;
        this.f26899c = null;
        this.f26900d = null;
        this.f26901e = null;
        this.f26902f = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(44, this.f26897a)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, this.f26898b)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(146, this.f26899c)) {
            throw new IllegalStateException("The attribute subText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26900d)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.f26901e)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26902f)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "StatementsSelectorAccountWithCurrencyBindingModel_{iconRes=" + this.f26897a + ", nameText=" + this.f26898b + ", subText=" + this.f26899c + ", amount=" + ((Object) this.f26900d) + ", onClick=" + this.f26901e + ", isActive=" + this.f26902f + "}" + super.toString();
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
        if (!(epoxyModel instanceof i0)) {
            setDataBindingVariables(fVar);
            return;
        }
        i0 i0Var = (i0) epoxyModel;
        Integer num = this.f26897a;
        if (num == null ? i0Var.f26897a != null : !num.equals(i0Var.f26897a)) {
            fVar.m(44, this.f26897a);
        }
        String str = this.f26898b;
        if (str == null ? i0Var.f26898b != null : !str.equals(i0Var.f26898b)) {
            fVar.m(101, this.f26898b);
        }
        String str2 = this.f26899c;
        if (str2 == null ? i0Var.f26899c != null : !str2.equals(i0Var.f26899c)) {
            fVar.m(146, this.f26899c);
        }
        SpannedString spannedString = this.f26900d;
        if (spannedString == null ? i0Var.f26900d != null : !spannedString.equals(i0Var.f26900d)) {
            fVar.m(3, this.f26900d);
        }
        View.OnClickListener onClickListener = this.f26901e;
        if ((onClickListener == null) != (i0Var.f26901e == null)) {
            fVar.m(104, onClickListener);
        }
        Boolean bool = this.f26902f;
        Boolean bool2 = i0Var.f26902f;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        fVar.m(49, this.f26902f);
    }
}
