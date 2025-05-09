package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;
import y8.ViewOnClickListenerC1624e;

/* compiled from: SelectorBindingModel_.java */
/* loaded from: classes2.dex */
public final class b0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26783a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26784b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26785c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26786d;

    public final b0 a(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final b0 b(Boolean bool) {
        onMutation();
        this.f26785c = bool;
        return this;
    }

    public final b0 c(Boolean bool) {
        onMutation();
        this.f26784b = bool;
        return this;
    }

    public final b0 d(String str) {
        onMutation();
        this.f26783a = str;
        return this;
    }

    public final b0 e(ViewOnClickListenerC1624e viewOnClickListenerC1624e) {
        onMutation();
        this.f26786d = viewOnClickListenerC1624e;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0) || !super.equals(obj)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        b0Var.getClass();
        String str = this.f26783a;
        if (str == null ? b0Var.f26783a != null : !str.equals(b0Var.f26783a)) {
            return false;
        }
        Boolean bool = this.f26784b;
        if (bool == null ? b0Var.f26784b != null : !bool.equals(b0Var.f26784b)) {
            return false;
        }
        Boolean bool2 = this.f26785c;
        if (bool2 == null ? b0Var.f26785c == null : bool2.equals(b0Var.f26785c)) {
            return (this.f26786d == null) == (b0Var.f26786d == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_selector;
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
        String str = this.f26783a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f26784b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26785c;
        return ((hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.f26786d != null ? 1 : 0);
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
        this.f26783a = null;
        this.f26784b = null;
        this.f26785c = null;
        this.f26786d = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26783a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(71, this.f26784b)) {
            throw new IllegalStateException("The attribute isSelected was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(67, this.f26785c)) {
            throw new IllegalStateException("The attribute isMultiSelect was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26786d)) {
            throw new IllegalStateException("The attribute onClickAccount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "SelectorBindingModel_{nameText=" + this.f26783a + ", isSelected=" + this.f26784b + ", isMultiSelect=" + this.f26785c + ", onClickAccount=" + this.f26786d + "}" + super.toString();
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
        if (!(epoxyModel instanceof b0)) {
            setDataBindingVariables(fVar);
            return;
        }
        b0 b0Var = (b0) epoxyModel;
        String str = this.f26783a;
        if (str == null ? b0Var.f26783a != null : !str.equals(b0Var.f26783a)) {
            fVar.m(101, this.f26783a);
        }
        Boolean bool = this.f26784b;
        if (bool == null ? b0Var.f26784b != null : !bool.equals(b0Var.f26784b)) {
            fVar.m(71, this.f26784b);
        }
        Boolean bool2 = this.f26785c;
        if (bool2 == null ? b0Var.f26785c != null : !bool2.equals(b0Var.f26785c)) {
            fVar.m(67, this.f26785c);
        }
        View.OnClickListener onClickListener = this.f26786d;
        if ((onClickListener == null) != (b0Var.f26786d == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
