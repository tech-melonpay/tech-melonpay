package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: SettingsAccountBusinessBindingModel_.java */
/* loaded from: classes2.dex */
public final class e0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26824a;

    /* renamed from: b, reason: collision with root package name */
    public String f26825b;

    /* renamed from: c, reason: collision with root package name */
    public String f26826c;

    /* renamed from: d, reason: collision with root package name */
    public String f26827d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26828e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnClickListener f26829f;

    public final e0 a(String str) {
        onMutation();
        this.f26826c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final e0 b() {
        super.mo6id("account");
        return this;
    }

    public final e0 c(Boolean bool) {
        onMutation();
        this.f26828e = bool;
        return this;
    }

    public final e0 d(String str) {
        onMutation();
        this.f26824a = str;
        return this;
    }

    public final e0 e(m8.c cVar) {
        onMutation();
        this.f26829f = cVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0) || !super.equals(obj)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        e0Var.getClass();
        String str = this.f26824a;
        if (str == null ? e0Var.f26824a != null : !str.equals(e0Var.f26824a)) {
            return false;
        }
        String str2 = this.f26825b;
        if (str2 == null ? e0Var.f26825b != null : !str2.equals(e0Var.f26825b)) {
            return false;
        }
        String str3 = this.f26826c;
        if (str3 == null ? e0Var.f26826c != null : !str3.equals(e0Var.f26826c)) {
            return false;
        }
        String str4 = this.f26827d;
        if (str4 == null ? e0Var.f26827d != null : !str4.equals(e0Var.f26827d)) {
            return false;
        }
        Boolean bool = this.f26828e;
        if (bool == null ? e0Var.f26828e == null : bool.equals(e0Var.f26828e)) {
            return (this.f26829f == null) == (e0Var.f26829f == null);
        }
        return false;
    }

    public final e0 f(String str) {
        onMutation();
        this.f26827d = str;
        return this;
    }

    public final e0 g(String str) {
        onMutation();
        this.f26825b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_settings_account_business;
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
        String str = this.f26824a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26825b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 961;
        String str3 = this.f26826c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26827d;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.f26828e;
        return ((hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f26829f != null ? 1 : 0);
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
        this.f26824a = null;
        this.f26825b = null;
        this.f26826c = null;
        this.f26827d = null;
        this.f26828e = null;
        this.f26829f = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26824a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(131, this.f26825b)) {
            throw new IllegalStateException("The attribute shortNameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(128, null)) {
            throw new IllegalStateException("The attribute positionText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(16, this.f26826c)) {
            throw new IllegalStateException("The attribute companyText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(127, this.f26827d)) {
            throw new IllegalStateException("The attribute photoUrl was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(68, this.f26828e)) {
            throw new IllegalStateException("The attribute isPhoto was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(103, this.f26829f)) {
            throw new IllegalStateException("The attribute onAvaChangeClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "SettingsAccountBusinessBindingModel_{nameText=" + this.f26824a + ", shortNameText=" + this.f26825b + ", positionText=null, companyText=" + this.f26826c + ", photoUrl=" + this.f26827d + ", isPhoto=" + this.f26828e + ", onAvaChangeClick=" + this.f26829f + "}" + super.toString();
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
        if (!(epoxyModel instanceof e0)) {
            setDataBindingVariables(fVar);
            return;
        }
        e0 e0Var = (e0) epoxyModel;
        String str = this.f26824a;
        if (str == null ? e0Var.f26824a != null : !str.equals(e0Var.f26824a)) {
            fVar.m(101, this.f26824a);
        }
        String str2 = this.f26825b;
        if (str2 == null ? e0Var.f26825b != null : !str2.equals(e0Var.f26825b)) {
            fVar.m(131, this.f26825b);
        }
        e0Var.getClass();
        String str3 = this.f26826c;
        if (str3 == null ? e0Var.f26826c != null : !str3.equals(e0Var.f26826c)) {
            fVar.m(16, this.f26826c);
        }
        String str4 = this.f26827d;
        if (str4 == null ? e0Var.f26827d != null : !str4.equals(e0Var.f26827d)) {
            fVar.m(127, this.f26827d);
        }
        Boolean bool = this.f26828e;
        if (bool == null ? e0Var.f26828e != null : !bool.equals(e0Var.f26828e)) {
            fVar.m(68, this.f26828e);
        }
        View.OnClickListener onClickListener = this.f26829f;
        if ((onClickListener == null) != (e0Var.f26829f == null)) {
            fVar.m(103, onClickListener);
        }
    }
}
