package s6;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: LoanHistoryBindingModel_.java */
/* loaded from: classes2.dex */
public final class H extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26686a;

    /* renamed from: b, reason: collision with root package name */
    public String f26687b;

    /* renamed from: c, reason: collision with root package name */
    public String f26688c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f26689d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26690e;

    /* renamed from: f, reason: collision with root package name */
    public String f26691f;

    /* renamed from: g, reason: collision with root package name */
    public String f26692g;

    public final H a(String str) {
        onMutation();
        this.f26691f = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final H b() {
        onMutation();
        this.f26692g = ".00";
        return this;
    }

    public final H c(String str) {
        super.mo6id(str);
        return this;
    }

    public final H d(Boolean bool) {
        onMutation();
        this.f26690e = bool;
        return this;
    }

    public final H e(String str) {
        onMutation();
        this.f26687b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H) || !super.equals(obj)) {
            return false;
        }
        H h9 = (H) obj;
        h9.getClass();
        String str = this.f26686a;
        if (str == null ? h9.f26686a != null : !str.equals(h9.f26686a)) {
            return false;
        }
        String str2 = this.f26687b;
        if (str2 == null ? h9.f26687b != null : !str2.equals(h9.f26687b)) {
            return false;
        }
        String str3 = this.f26688c;
        if (str3 == null ? h9.f26688c != null : !str3.equals(h9.f26688c)) {
            return false;
        }
        Integer num = this.f26689d;
        if (num == null ? h9.f26689d != null : !num.equals(h9.f26689d)) {
            return false;
        }
        Boolean bool = this.f26690e;
        if (bool == null ? h9.f26690e != null : !bool.equals(h9.f26690e)) {
            return false;
        }
        String str4 = this.f26691f;
        if (str4 == null ? h9.f26691f != null : !str4.equals(h9.f26691f)) {
            return false;
        }
        String str5 = this.f26692g;
        String str6 = h9.f26692g;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public final H f(String str) {
        onMutation();
        this.f26686a = str;
        return this;
    }

    public final H g(Integer num) {
        onMutation();
        this.f26689d = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_loan_history;
    }

    public final H h(String str) {
        onMutation();
        this.f26688c = str;
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
        String str = this.f26686a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26687b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26688c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26689d;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26690e;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f26691f;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26692g;
        return (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
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
        this.f26686a = null;
        this.f26687b = null;
        this.f26688c = null;
        this.f26689d = null;
        this.f26690e = null;
        this.f26691f = null;
        this.f26692g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26686a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(99, this.f26687b)) {
            throw new IllegalStateException("The attribute metaData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(145, this.f26688c)) {
            throw new IllegalStateException("The attribute statusText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(144, this.f26689d)) {
            throw new IllegalStateException("The attribute statusImgResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26690e)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26691f)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(4, this.f26692g)) {
            throw new IllegalStateException("The attribute amountD was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, null)) {
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
        return "LoanHistoryBindingModel_{nameText=" + this.f26686a + ", metaData=" + this.f26687b + ", statusText=" + this.f26688c + ", statusImgResId=" + this.f26689d + ", isActive=" + this.f26690e + ", amount=" + this.f26691f + ", amountD=" + this.f26692g + ", onClickAccount=null}" + super.toString();
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
        if (!(epoxyModel instanceof H)) {
            setDataBindingVariables(fVar);
            return;
        }
        H h9 = (H) epoxyModel;
        String str = this.f26686a;
        if (str == null ? h9.f26686a != null : !str.equals(h9.f26686a)) {
            fVar.m(101, this.f26686a);
        }
        String str2 = this.f26687b;
        if (str2 == null ? h9.f26687b != null : !str2.equals(h9.f26687b)) {
            fVar.m(99, this.f26687b);
        }
        String str3 = this.f26688c;
        if (str3 == null ? h9.f26688c != null : !str3.equals(h9.f26688c)) {
            fVar.m(145, this.f26688c);
        }
        Integer num = this.f26689d;
        if (num == null ? h9.f26689d != null : !num.equals(h9.f26689d)) {
            fVar.m(144, this.f26689d);
        }
        Boolean bool = this.f26690e;
        if (bool == null ? h9.f26690e != null : !bool.equals(h9.f26690e)) {
            fVar.m(49, this.f26690e);
        }
        String str4 = this.f26691f;
        if (str4 == null ? h9.f26691f != null : !str4.equals(h9.f26691f)) {
            fVar.m(3, this.f26691f);
        }
        String str5 = this.f26692g;
        if (str5 == null ? h9.f26692g != null : !str5.equals(h9.f26692g)) {
            fVar.m(4, this.f26692g);
        }
        h9.getClass();
    }
}
