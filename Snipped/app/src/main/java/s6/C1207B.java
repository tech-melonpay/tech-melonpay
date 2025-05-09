package s6;

import G0.c;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: InputAmountBindingModel_.java */
/* renamed from: s6.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1207B extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26655a;

    /* renamed from: b, reason: collision with root package name */
    public String f26656b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26657c;

    /* renamed from: d, reason: collision with root package name */
    public String f26658d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26659e;

    /* renamed from: f, reason: collision with root package name */
    public String f26660f;

    /* renamed from: g, reason: collision with root package name */
    public c.InterfaceC0016c f26661g;

    public final C1207B a(String str) {
        onMutation();
        this.f26658d = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1207B b(c.InterfaceC0016c interfaceC0016c) {
        onMutation();
        this.f26661g = interfaceC0016c;
        return this;
    }

    public final C1207B c(String str) {
        onMutation();
        this.f26660f = str;
        return this;
    }

    public final C1207B d(String str) {
        onMutation();
        this.f26655a = str;
        return this;
    }

    public final C1207B e() {
        super.mo6id("amount");
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1207B) || !super.equals(obj)) {
            return false;
        }
        C1207B c1207b = (C1207B) obj;
        c1207b.getClass();
        String str = this.f26655a;
        if (str == null ? c1207b.f26655a != null : !str.equals(c1207b.f26655a)) {
            return false;
        }
        String str2 = this.f26656b;
        if (str2 == null ? c1207b.f26656b != null : !str2.equals(c1207b.f26656b)) {
            return false;
        }
        Integer num = this.f26657c;
        if (num == null ? c1207b.f26657c != null : !num.equals(c1207b.f26657c)) {
            return false;
        }
        String str3 = this.f26658d;
        if (str3 == null ? c1207b.f26658d != null : !str3.equals(c1207b.f26658d)) {
            return false;
        }
        Integer num2 = this.f26659e;
        if (num2 == null ? c1207b.f26659e != null : !num2.equals(c1207b.f26659e)) {
            return false;
        }
        String str4 = this.f26660f;
        if (str4 == null ? c1207b.f26660f == null : str4.equals(c1207b.f26660f)) {
            return (this.f26661g == null) == (c1207b.f26661g == null);
        }
        return false;
    }

    public final C1207B f() {
        onMutation();
        this.f26657c = 7;
        return this;
    }

    public final C1207B g() {
        onMutation();
        this.f26659e = 24;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_input_amount;
    }

    public final C1207B h(String str) {
        onMutation();
        this.f26656b = str;
        return this;
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
        String str = this.f26655a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26656b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f26657c;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 961;
        String str3 = this.f26658d;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 29791;
        Integer num2 = this.f26659e;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 29791;
        String str4 = this.f26660f;
        return ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 29791) + (this.f26661g != null ? 1 : 0);
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
        this.f26655a = null;
        this.f26656b = null;
        this.f26657c = null;
        this.f26658d = null;
        this.f26659e = null;
        this.f26660f = null;
        this.f26661g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(42, this.f26655a)) {
            throw new IllegalStateException("The attribute hintText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(154, this.f26656b)) {
            throw new IllegalStateException("The attribute valueText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(47, this.f26657c)) {
            throw new IllegalStateException("The attribute inputType was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(97, null)) {
            throw new IllegalStateException("The attribute mask was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, this.f26658d)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(168, null)) {
            throw new IllegalStateException("The attribute withArrow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(55, null)) {
            throw new IllegalStateException("The attribute isDisabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(96, this.f26659e)) {
            throw new IllegalStateException("The attribute marginTop was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(98, null)) {
            throw new IllegalStateException("The attribute maximumLength was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(33, null)) {
            throw new IllegalStateException("The attribute errorText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(34, this.f26660f)) {
            throw new IllegalStateException("The attribute feeText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(120, null)) {
            throw new IllegalStateException("The attribute onlyClickable was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(111, null)) {
            throw new IllegalStateException("The attribute onClickInput was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(30, this.f26661g)) {
            throw new IllegalStateException("The attribute doOnTextChanged was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "InputAmountBindingModel_{hintText=" + this.f26655a + ", valueText=" + this.f26656b + ", inputType=" + this.f26657c + ", mask=null, currency=" + this.f26658d + ", withArrow=null, isDisabled=null, marginTop=" + this.f26659e + ", maximumLength=null, errorText=null, feeText=" + this.f26660f + ", onlyClickable=null, onClickInput=null, doOnTextChanged=" + this.f26661g + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1207B)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1207B c1207b = (C1207B) epoxyModel;
        String str = this.f26655a;
        if (str == null ? c1207b.f26655a != null : !str.equals(c1207b.f26655a)) {
            fVar.m(42, this.f26655a);
        }
        String str2 = this.f26656b;
        if (str2 == null ? c1207b.f26656b != null : !str2.equals(c1207b.f26656b)) {
            fVar.m(154, this.f26656b);
        }
        Integer num = this.f26657c;
        if (num == null ? c1207b.f26657c != null : !num.equals(c1207b.f26657c)) {
            fVar.m(47, this.f26657c);
        }
        c1207b.getClass();
        String str3 = this.f26658d;
        if (str3 == null ? c1207b.f26658d != null : !str3.equals(c1207b.f26658d)) {
            fVar.m(21, this.f26658d);
        }
        c1207b.getClass();
        c1207b.getClass();
        Integer num2 = this.f26659e;
        if (num2 == null ? c1207b.f26659e != null : !num2.equals(c1207b.f26659e)) {
            fVar.m(96, this.f26659e);
        }
        c1207b.getClass();
        c1207b.getClass();
        String str4 = this.f26660f;
        if (str4 == null ? c1207b.f26660f != null : !str4.equals(c1207b.f26660f)) {
            fVar.m(34, this.f26660f);
        }
        c1207b.getClass();
        c1207b.getClass();
        c.InterfaceC0016c interfaceC0016c = this.f26661g;
        if ((interfaceC0016c == null) != (c1207b.f26661g == null)) {
            fVar.m(30, interfaceC0016c);
        }
    }
}
