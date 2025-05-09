package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: PaymentSavedBindingModel_.java */
/* loaded from: classes2.dex */
public final class V extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26733a;

    /* renamed from: b, reason: collision with root package name */
    public String f26734b;

    /* renamed from: c, reason: collision with root package name */
    public String f26735c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f26736d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f26737e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26738f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26739g;

    public final V a(String str) {
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
        if (!(obj instanceof V) || !super.equals(obj)) {
            return false;
        }
        V v10 = (V) obj;
        v10.getClass();
        String str = this.f26733a;
        if (str == null ? v10.f26733a != null : !str.equals(v10.f26733a)) {
            return false;
        }
        String str2 = this.f26734b;
        if (str2 == null ? v10.f26734b != null : !str2.equals(v10.f26734b)) {
            return false;
        }
        String str3 = this.f26735c;
        if (str3 == null ? v10.f26735c != null : !str3.equals(v10.f26735c)) {
            return false;
        }
        Integer num = this.f26736d;
        if (num == null ? v10.f26736d != null : !num.equals(v10.f26736d)) {
            return false;
        }
        if ((this.f26737e == null) != (v10.f26737e == null)) {
            return false;
        }
        Boolean bool = this.f26738f;
        if (bool == null ? v10.f26738f != null : !bool.equals(v10.f26738f)) {
            return false;
        }
        Boolean bool2 = this.f26739g;
        Boolean bool3 = v10.f26739g;
        return bool2 == null ? bool3 == null : bool2.equals(bool3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_payment_saved;
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
        String str = this.f26733a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 29791;
        String str2 = this.f26734b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26735c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26736d;
        int hashCode5 = (((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + (this.f26737e != null ? 1 : 0)) * 31;
        Boolean bool = this.f26738f;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26739g;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
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
        this.f26733a = null;
        this.f26734b = null;
        this.f26735c = null;
        this.f26736d = null;
        this.f26737e = null;
        this.f26738f = null;
        this.f26739g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26733a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, null)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, null)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.f26734b)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, this.f26735c)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(22, this.f26736d)) {
            throw new IllegalStateException("The attribute currencyIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26737e)) {
            throw new IllegalStateException("The attribute onClickAccount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(57, this.f26738f)) {
            throw new IllegalStateException("The attribute isFirst was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(66, this.f26739g)) {
            throw new IllegalStateException("The attribute isLuminary was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "PaymentSavedBindingModel_{nameText=" + this.f26733a + ", incoming=null, amount=null, date=" + this.f26734b + ", shortName=" + this.f26735c + ", currencyIconRes=" + this.f26736d + ", onClickAccount=" + this.f26737e + ", isFirst=" + this.f26738f + ", isLuminary=" + this.f26739g + "}" + super.toString();
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
        if (!(epoxyModel instanceof V)) {
            setDataBindingVariables(fVar);
            return;
        }
        V v10 = (V) epoxyModel;
        String str = this.f26733a;
        if (str == null ? v10.f26733a != null : !str.equals(v10.f26733a)) {
            fVar.m(101, this.f26733a);
        }
        v10.getClass();
        v10.getClass();
        String str2 = this.f26734b;
        if (str2 == null ? v10.f26734b != null : !str2.equals(v10.f26734b)) {
            fVar.m(24, this.f26734b);
        }
        String str3 = this.f26735c;
        if (str3 == null ? v10.f26735c != null : !str3.equals(v10.f26735c)) {
            fVar.m(130, this.f26735c);
        }
        Integer num = this.f26736d;
        if (num == null ? v10.f26736d != null : !num.equals(v10.f26736d)) {
            fVar.m(22, this.f26736d);
        }
        View.OnClickListener onClickListener = this.f26737e;
        if ((onClickListener == null) != (v10.f26737e == null)) {
            fVar.m(105, onClickListener);
        }
        Boolean bool = this.f26738f;
        if (bool == null ? v10.f26738f != null : !bool.equals(v10.f26738f)) {
            fVar.m(57, this.f26738f);
        }
        Boolean bool2 = this.f26739g;
        Boolean bool3 = v10.f26739g;
        if (bool2 != null) {
            if (bool2.equals(bool3)) {
                return;
            }
        } else if (bool3 == null) {
            return;
        }
        fVar.m(66, this.f26739g);
    }
}
