package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: SupportItemBindingModel_.java */
/* loaded from: classes2.dex */
public final class m0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26929a;

    /* renamed from: b, reason: collision with root package name */
    public String f26930b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26931c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26932d;

    public final m0 a(String str) {
        onMutation();
        this.f26930b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final m0 b(String str) {
        super.mo6id(str);
        return this;
    }

    public final m0 c(Integer num) {
        onMutation();
        this.f26931c = num;
        return this;
    }

    public final m0 d(J7.b bVar) {
        onMutation();
        this.f26932d = bVar;
        return this;
    }

    public final m0 e(String str) {
        onMutation();
        this.f26929a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0) || !super.equals(obj)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        String str = this.f26929a;
        if (str == null ? m0Var.f26929a != null : !str.equals(m0Var.f26929a)) {
            return false;
        }
        String str2 = this.f26930b;
        if (str2 == null ? m0Var.f26930b != null : !str2.equals(m0Var.f26930b)) {
            return false;
        }
        Integer num = this.f26931c;
        if (num == null ? m0Var.f26931c == null : num.equals(m0Var.f26931c)) {
            return (this.f26932d == null) == (m0Var.f26932d == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_support_item;
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
        String str = this.f26929a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26930b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f26931c;
        return ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + (this.f26932d != null ? 1 : 0);
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
        this.f26929a = null;
        this.f26930b = null;
        this.f26931c = null;
        this.f26932d = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(148, this.f26929a)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.f26930b)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(45, this.f26931c)) {
            throw new IllegalStateException("The attribute image was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(118, this.f26932d)) {
            throw new IllegalStateException("The attribute onItemClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "SupportItemBindingModel_{title=" + this.f26929a + ", date=" + this.f26930b + ", image=" + this.f26931c + ", onItemClick=" + this.f26932d + "}" + super.toString();
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
        if (!(epoxyModel instanceof m0)) {
            setDataBindingVariables(fVar);
            return;
        }
        m0 m0Var = (m0) epoxyModel;
        String str = this.f26929a;
        if (str == null ? m0Var.f26929a != null : !str.equals(m0Var.f26929a)) {
            fVar.m(148, this.f26929a);
        }
        String str2 = this.f26930b;
        if (str2 == null ? m0Var.f26930b != null : !str2.equals(m0Var.f26930b)) {
            fVar.m(24, this.f26930b);
        }
        Integer num = this.f26931c;
        if (num == null ? m0Var.f26931c != null : !num.equals(m0Var.f26931c)) {
            fVar.m(45, this.f26931c);
        }
        View.OnClickListener onClickListener = this.f26932d;
        if ((onClickListener == null) != (m0Var.f26932d == null)) {
            fVar.m(118, onClickListener);
        }
    }
}
