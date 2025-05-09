package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: SettingsBindingModel_.java */
/* loaded from: classes2.dex */
public final class f0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26831a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26832b;

    /* renamed from: c, reason: collision with root package name */
    public String f26833c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26834d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26835e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26836f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26837g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26838h;
    public View.OnClickListener i;

    public final f0 a(String str) {
        onMutation();
        this.f26833c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final f0 b(Boolean bool) {
        onMutation();
        this.f26835e = bool;
        return this;
    }

    public final f0 c(Boolean bool) {
        onMutation();
        this.f26832b = bool;
        return this;
    }

    public final f0 d(Boolean bool) {
        onMutation();
        this.f26834d = bool;
        return this;
    }

    public final f0 e(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0) || !super.equals(obj)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        f0Var.getClass();
        String str = this.f26831a;
        if (str == null ? f0Var.f26831a != null : !str.equals(f0Var.f26831a)) {
            return false;
        }
        Boolean bool = this.f26832b;
        if (bool == null ? f0Var.f26832b != null : !bool.equals(f0Var.f26832b)) {
            return false;
        }
        String str2 = this.f26833c;
        if (str2 == null ? f0Var.f26833c != null : !str2.equals(f0Var.f26833c)) {
            return false;
        }
        Boolean bool2 = this.f26834d;
        if (bool2 == null ? f0Var.f26834d != null : !bool2.equals(f0Var.f26834d)) {
            return false;
        }
        Boolean bool3 = this.f26835e;
        if (bool3 == null ? f0Var.f26835e != null : !bool3.equals(f0Var.f26835e)) {
            return false;
        }
        Boolean bool4 = this.f26836f;
        if (bool4 == null ? f0Var.f26836f != null : !bool4.equals(f0Var.f26836f)) {
            return false;
        }
        Boolean bool5 = this.f26837g;
        if (bool5 == null ? f0Var.f26837g != null : !bool5.equals(f0Var.f26837g)) {
            return false;
        }
        if ((this.f26838h == null) != (f0Var.f26838h == null)) {
            return false;
        }
        return (this.i == null) == (f0Var.i == null);
    }

    public final f0 f(Boolean bool) {
        onMutation();
        this.f26837g = bool;
        return this;
    }

    public final f0 g(Boolean bool) {
        onMutation();
        this.f26836f = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_settings;
    }

    public final f0 h(String str) {
        onMutation();
        this.f26831a = str;
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
        String str = this.f26831a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f26832b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.f26833c;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26834d;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26835e;
        int hashCode6 = (hashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26836f;
        int hashCode7 = (hashCode6 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f26837g;
        return ((((hashCode7 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + (this.f26838h != null ? 1 : 0)) * 31) + (this.i != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final f0 i(B7.f fVar) {
        onMutation();
        this.f26838h = fVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final f0 j(m8.c cVar) {
        onMutation();
        this.i = cVar;
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
        this.f26831a = null;
        this.f26832b = null;
        this.f26833c = null;
        this.f26834d = null;
        this.f26835e = null;
        this.f26836f = null;
        this.f26837g = null;
        this.f26838h = null;
        this.i = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26831a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(37, this.f26832b)) {
            throw new IllegalStateException("The attribute hasDescription was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(25, this.f26833c)) {
            throw new IllegalStateException("The attribute description was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(38, this.f26834d)) {
            throw new IllegalStateException("The attribute hasSwitch was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(36, this.f26835e)) {
            throw new IllegalStateException("The attribute hasArrowDown was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f26836f)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26837g)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26838h)) {
            throw new IllegalStateException("The attribute onClickAccount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(119, this.i)) {
            throw new IllegalStateException("The attribute onSwitchListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "SettingsBindingModel_{nameText=" + this.f26831a + ", hasDescription=" + this.f26832b + ", description=" + this.f26833c + ", hasSwitch=" + this.f26834d + ", hasArrowDown=" + this.f26835e + ", isEnabled=" + this.f26836f + ", isActive=" + this.f26837g + ", onClickAccount=" + this.f26838h + ", onSwitchListener=" + this.i + "}" + super.toString();
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
        if (!(epoxyModel instanceof f0)) {
            setDataBindingVariables(fVar);
            return;
        }
        f0 f0Var = (f0) epoxyModel;
        String str = this.f26831a;
        if (str == null ? f0Var.f26831a != null : !str.equals(f0Var.f26831a)) {
            fVar.m(101, this.f26831a);
        }
        Boolean bool = this.f26832b;
        if (bool == null ? f0Var.f26832b != null : !bool.equals(f0Var.f26832b)) {
            fVar.m(37, this.f26832b);
        }
        String str2 = this.f26833c;
        if (str2 == null ? f0Var.f26833c != null : !str2.equals(f0Var.f26833c)) {
            fVar.m(25, this.f26833c);
        }
        Boolean bool2 = this.f26834d;
        if (bool2 == null ? f0Var.f26834d != null : !bool2.equals(f0Var.f26834d)) {
            fVar.m(38, this.f26834d);
        }
        Boolean bool3 = this.f26835e;
        if (bool3 == null ? f0Var.f26835e != null : !bool3.equals(f0Var.f26835e)) {
            fVar.m(36, this.f26835e);
        }
        Boolean bool4 = this.f26836f;
        if (bool4 == null ? f0Var.f26836f != null : !bool4.equals(f0Var.f26836f)) {
            fVar.m(56, this.f26836f);
        }
        Boolean bool5 = this.f26837g;
        if (bool5 == null ? f0Var.f26837g != null : !bool5.equals(f0Var.f26837g)) {
            fVar.m(49, this.f26837g);
        }
        View.OnClickListener onClickListener = this.f26838h;
        if ((onClickListener == null) != (f0Var.f26838h == null)) {
            fVar.m(105, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.i;
        if ((onClickListener2 == null) != (f0Var.i == null)) {
            fVar.m(119, onClickListener2);
        }
    }
}
