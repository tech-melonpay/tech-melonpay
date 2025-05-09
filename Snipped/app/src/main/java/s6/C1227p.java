package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: CountryBindingModel_.java */
/* renamed from: s6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1227p extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f26954a;

    /* renamed from: b, reason: collision with root package name */
    public String f26955b;

    /* renamed from: c, reason: collision with root package name */
    public String f26956c;

    /* renamed from: d, reason: collision with root package name */
    public String f26957d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f26958e;

    public final C1227p a(String str) {
        onMutation();
        this.f26955b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1227p b(String str) {
        onMutation();
        this.f26957d = str;
        return this;
    }

    public final C1227p c(String str) {
        super.mo6id(str);
        return this;
    }

    public final C1227p d(Boolean bool) {
        onMutation();
        this.f26954a = bool;
        return this;
    }

    public final C1227p e(B7.f fVar) {
        onMutation();
        this.f26958e = fVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1227p) || !super.equals(obj)) {
            return false;
        }
        C1227p c1227p = (C1227p) obj;
        c1227p.getClass();
        Boolean bool = this.f26954a;
        if (bool == null ? c1227p.f26954a != null : !bool.equals(c1227p.f26954a)) {
            return false;
        }
        String str = this.f26955b;
        if (str == null ? c1227p.f26955b != null : !str.equals(c1227p.f26955b)) {
            return false;
        }
        String str2 = this.f26956c;
        if (str2 == null ? c1227p.f26956c != null : !str2.equals(c1227p.f26956c)) {
            return false;
        }
        String str3 = this.f26957d;
        if (str3 == null ? c1227p.f26957d == null : str3.equals(c1227p.f26957d)) {
            return (this.f26958e == null) == (c1227p.f26958e == null);
        }
        return false;
    }

    public final C1227p f(String str) {
        onMutation();
        this.f26956c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_country;
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
        Boolean bool = this.f26954a;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f26955b;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26956c;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26957d;
        return ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f26958e != null ? 1 : 0);
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
        this.f26954a = null;
        this.f26955b = null;
        this.f26956c = null;
        this.f26957d = null;
        this.f26958e = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(53, this.f26954a)) {
            throw new IllegalStateException("The attribute isCountryCode was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(18, this.f26955b)) {
            throw new IllegalStateException("The attribute countryCode was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(126, this.f26956c)) {
            throw new IllegalStateException("The attribute phoneCode was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(19, this.f26957d)) {
            throw new IllegalStateException("The attribute countryName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.f26958e)) {
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
        return "CountryBindingModel_{isCountryCode=" + this.f26954a + ", countryCode=" + this.f26955b + ", phoneCode=" + this.f26956c + ", countryName=" + this.f26957d + ", onClick=" + this.f26958e + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1227p)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1227p c1227p = (C1227p) epoxyModel;
        Boolean bool = this.f26954a;
        if (bool == null ? c1227p.f26954a != null : !bool.equals(c1227p.f26954a)) {
            fVar.m(53, this.f26954a);
        }
        String str = this.f26955b;
        if (str == null ? c1227p.f26955b != null : !str.equals(c1227p.f26955b)) {
            fVar.m(18, this.f26955b);
        }
        String str2 = this.f26956c;
        if (str2 == null ? c1227p.f26956c != null : !str2.equals(c1227p.f26956c)) {
            fVar.m(126, this.f26956c);
        }
        String str3 = this.f26957d;
        if (str3 == null ? c1227p.f26957d != null : !str3.equals(c1227p.f26957d)) {
            fVar.m(19, this.f26957d);
        }
        View.OnClickListener onClickListener = this.f26958e;
        if ((onClickListener == null) != (c1227p.f26958e == null)) {
            fVar.m(104, onClickListener);
        }
    }
}
