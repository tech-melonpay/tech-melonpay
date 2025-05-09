package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: SettingsAccountBindingModel_.java */
/* loaded from: classes2.dex */
public final class d0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26809a;

    /* renamed from: b, reason: collision with root package name */
    public String f26810b;

    /* renamed from: c, reason: collision with root package name */
    public String f26811c;

    /* renamed from: d, reason: collision with root package name */
    public String f26812d;

    /* renamed from: e, reason: collision with root package name */
    public String f26813e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26814f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnClickListener f26815g;

    public final d0 a(String str) {
        onMutation();
        this.f26812d = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final d0 b() {
        super.mo6id("account");
        return this;
    }

    public final d0 c(Boolean bool) {
        onMutation();
        this.f26814f = bool;
        return this;
    }

    public final d0 d(String str) {
        onMutation();
        this.f26809a = str;
        return this;
    }

    public final d0 e(m8.c cVar) {
        onMutation();
        this.f26815g = cVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0) || !super.equals(obj)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        String str = this.f26809a;
        if (str == null ? d0Var.f26809a != null : !str.equals(d0Var.f26809a)) {
            return false;
        }
        String str2 = this.f26810b;
        if (str2 == null ? d0Var.f26810b != null : !str2.equals(d0Var.f26810b)) {
            return false;
        }
        String str3 = this.f26811c;
        if (str3 == null ? d0Var.f26811c != null : !str3.equals(d0Var.f26811c)) {
            return false;
        }
        String str4 = this.f26812d;
        if (str4 == null ? d0Var.f26812d != null : !str4.equals(d0Var.f26812d)) {
            return false;
        }
        String str5 = this.f26813e;
        if (str5 == null ? d0Var.f26813e != null : !str5.equals(d0Var.f26813e)) {
            return false;
        }
        Boolean bool = this.f26814f;
        if (bool == null ? d0Var.f26814f == null : bool.equals(d0Var.f26814f)) {
            return (this.f26815g == null) == (d0Var.f26815g == null);
        }
        return false;
    }

    public final d0 f(String str) {
        onMutation();
        this.f26813e = str;
        return this;
    }

    public final d0 g(String str) {
        onMutation();
        this.f26811c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_settings_account;
    }

    public final d0 h(String str) {
        onMutation();
        this.f26810b = str;
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
        String str = this.f26809a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26810b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26811c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26812d;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26813e;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f26814f;
        return ((hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f26815g != null ? 1 : 0);
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
        this.f26809a = null;
        this.f26810b = null;
        this.f26811c = null;
        this.f26812d = null;
        this.f26813e = null;
        this.f26814f = null;
        this.f26815g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26809a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(131, this.f26810b)) {
            throw new IllegalStateException("The attribute shortNameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(128, this.f26811c)) {
            throw new IllegalStateException("The attribute positionText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(16, this.f26812d)) {
            throw new IllegalStateException("The attribute companyText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(127, this.f26813e)) {
            throw new IllegalStateException("The attribute photoUrl was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(68, this.f26814f)) {
            throw new IllegalStateException("The attribute isPhoto was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(103, this.f26815g)) {
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
        return "SettingsAccountBindingModel_{nameText=" + this.f26809a + ", shortNameText=" + this.f26810b + ", positionText=" + this.f26811c + ", companyText=" + this.f26812d + ", photoUrl=" + this.f26813e + ", isPhoto=" + this.f26814f + ", onAvaChangeClick=" + this.f26815g + "}" + super.toString();
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
        if (!(epoxyModel instanceof d0)) {
            setDataBindingVariables(fVar);
            return;
        }
        d0 d0Var = (d0) epoxyModel;
        String str = this.f26809a;
        if (str == null ? d0Var.f26809a != null : !str.equals(d0Var.f26809a)) {
            fVar.m(101, this.f26809a);
        }
        String str2 = this.f26810b;
        if (str2 == null ? d0Var.f26810b != null : !str2.equals(d0Var.f26810b)) {
            fVar.m(131, this.f26810b);
        }
        String str3 = this.f26811c;
        if (str3 == null ? d0Var.f26811c != null : !str3.equals(d0Var.f26811c)) {
            fVar.m(128, this.f26811c);
        }
        String str4 = this.f26812d;
        if (str4 == null ? d0Var.f26812d != null : !str4.equals(d0Var.f26812d)) {
            fVar.m(16, this.f26812d);
        }
        String str5 = this.f26813e;
        if (str5 == null ? d0Var.f26813e != null : !str5.equals(d0Var.f26813e)) {
            fVar.m(127, this.f26813e);
        }
        Boolean bool = this.f26814f;
        if (bool == null ? d0Var.f26814f != null : !bool.equals(d0Var.f26814f)) {
            fVar.m(68, this.f26814f);
        }
        View.OnClickListener onClickListener = this.f26815g;
        if ((onClickListener == null) != (d0Var.f26815g == null)) {
            fVar.m(103, onClickListener);
        }
    }
}
