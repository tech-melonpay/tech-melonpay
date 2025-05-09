package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: AccountHorisontalBindingModel_.java */
/* renamed from: s6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1216e extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public SpannedString f26816a;

    /* renamed from: b, reason: collision with root package name */
    public String f26817b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f26818c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26819d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26820e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26821f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f26822g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f26823h;
    public Boolean i;

    public final void a(String str) {
        super.mo6id(str);
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
        if (!(obj instanceof C1216e) || !super.equals(obj)) {
            return false;
        }
        C1216e c1216e = (C1216e) obj;
        c1216e.getClass();
        SpannedString spannedString = this.f26816a;
        if (spannedString == null ? c1216e.f26816a != null : !spannedString.equals(c1216e.f26816a)) {
            return false;
        }
        String str = this.f26817b;
        if (str == null ? c1216e.f26817b != null : !str.equals(c1216e.f26817b)) {
            return false;
        }
        if ((this.f26818c == null) != (c1216e.f26818c == null)) {
            return false;
        }
        if ((this.f26819d == null) != (c1216e.f26819d == null)) {
            return false;
        }
        Integer num = this.f26820e;
        if (num == null ? c1216e.f26820e != null : !num.equals(c1216e.f26820e)) {
            return false;
        }
        Boolean bool = this.f26821f;
        if (bool == null ? c1216e.f26821f != null : !bool.equals(c1216e.f26821f)) {
            return false;
        }
        Integer num2 = this.f26822g;
        if (num2 == null ? c1216e.f26822g != null : !num2.equals(c1216e.f26822g)) {
            return false;
        }
        Boolean bool2 = this.f26823h;
        if (bool2 == null ? c1216e.f26823h != null : !bool2.equals(c1216e.f26823h)) {
            return false;
        }
        Boolean bool3 = this.i;
        Boolean bool4 = c1216e.i;
        return bool3 == null ? bool4 == null : bool3.equals(bool4);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_account_horisontal;
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
        SpannedString spannedString = this.f26816a;
        int hashCode2 = (hashCode + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        String str = this.f26817b;
        int hashCode3 = (((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f26818c != null ? 1 : 0)) * 31) + (this.f26819d == null ? 0 : 1)) * 31;
        Integer num = this.f26820e;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26821f;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.f26822g;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26823h;
        int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.i;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
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
        this.f26816a = null;
        this.f26817b = null;
        this.f26818c = null;
        this.f26819d = null;
        this.f26820e = null;
        this.f26821f = null;
        this.f26822g = null;
        this.f26823h = null;
        this.i = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(20, this.f26816a)) {
            throw new IllegalStateException("The attribute crypto was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(2, this.f26817b)) {
            throw new IllegalStateException("The attribute address was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26818c)) {
            throw new IllegalStateException("The attribute onClickAccount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(114, this.f26819d)) {
            throw new IllegalStateException("The attribute onClickRefresh was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f26820e)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26821f)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(167, this.f26822g)) {
            throw new IllegalStateException("The attribute widthDP was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(59, this.f26823h)) {
            throw new IllegalStateException("The attribute isFrozen was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(138, this.i)) {
            throw new IllegalStateException("The attribute showSingleFrozen was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "AccountHorisontalBindingModel_{crypto=" + ((Object) this.f26816a) + ", address=" + this.f26817b + ", onClickAccount=" + this.f26818c + ", onClickRefresh=" + this.f26819d + ", iconRes=" + this.f26820e + ", isActive=" + this.f26821f + ", widthDP=" + this.f26822g + ", isFrozen=" + this.f26823h + ", showSingleFrozen=" + this.i + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1216e)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1216e c1216e = (C1216e) epoxyModel;
        SpannedString spannedString = this.f26816a;
        if (spannedString == null ? c1216e.f26816a != null : !spannedString.equals(c1216e.f26816a)) {
            fVar.m(20, this.f26816a);
        }
        String str = this.f26817b;
        if (str == null ? c1216e.f26817b != null : !str.equals(c1216e.f26817b)) {
            fVar.m(2, this.f26817b);
        }
        View.OnClickListener onClickListener = this.f26818c;
        if ((onClickListener == null) != (c1216e.f26818c == null)) {
            fVar.m(105, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f26819d;
        if ((onClickListener2 == null) != (c1216e.f26819d == null)) {
            fVar.m(114, onClickListener2);
        }
        Integer num = this.f26820e;
        if (num == null ? c1216e.f26820e != null : !num.equals(c1216e.f26820e)) {
            fVar.m(44, this.f26820e);
        }
        Boolean bool = this.f26821f;
        if (bool == null ? c1216e.f26821f != null : !bool.equals(c1216e.f26821f)) {
            fVar.m(49, this.f26821f);
        }
        Integer num2 = this.f26822g;
        if (num2 == null ? c1216e.f26822g != null : !num2.equals(c1216e.f26822g)) {
            fVar.m(167, this.f26822g);
        }
        Boolean bool2 = this.f26823h;
        if (bool2 == null ? c1216e.f26823h != null : !bool2.equals(c1216e.f26823h)) {
            fVar.m(59, this.f26823h);
        }
        Boolean bool3 = this.i;
        Boolean bool4 = c1216e.i;
        if (bool3 != null) {
            if (bool3.equals(bool4)) {
                return;
            }
        } else if (bool4 == null) {
            return;
        }
        fVar.m(138, this.i);
    }
}
