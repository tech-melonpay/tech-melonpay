package s6;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: LoanBottomBindingModel_.java */
/* renamed from: s6.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1211F extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26678a;

    /* renamed from: b, reason: collision with root package name */
    public String f26679b;

    /* renamed from: c, reason: collision with root package name */
    public String f26680c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f26681d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26682e;

    /* renamed from: f, reason: collision with root package name */
    public String f26683f;

    /* renamed from: g, reason: collision with root package name */
    public String f26684g;

    public final C1211F a(String str) {
        onMutation();
        this.f26683f = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1211F b() {
        onMutation();
        this.f26684g = ".00";
        return this;
    }

    public final C1211F c(String str) {
        super.mo6id(str);
        return this;
    }

    public final C1211F d(Boolean bool) {
        onMutation();
        this.f26682e = bool;
        return this;
    }

    public final C1211F e(String str) {
        onMutation();
        this.f26679b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1211F) || !super.equals(obj)) {
            return false;
        }
        C1211F c1211f = (C1211F) obj;
        c1211f.getClass();
        String str = this.f26678a;
        if (str == null ? c1211f.f26678a != null : !str.equals(c1211f.f26678a)) {
            return false;
        }
        String str2 = this.f26679b;
        if (str2 == null ? c1211f.f26679b != null : !str2.equals(c1211f.f26679b)) {
            return false;
        }
        String str3 = this.f26680c;
        if (str3 == null ? c1211f.f26680c != null : !str3.equals(c1211f.f26680c)) {
            return false;
        }
        Integer num = this.f26681d;
        if (num == null ? c1211f.f26681d != null : !num.equals(c1211f.f26681d)) {
            return false;
        }
        Boolean bool = this.f26682e;
        if (bool == null ? c1211f.f26682e != null : !bool.equals(c1211f.f26682e)) {
            return false;
        }
        String str4 = this.f26683f;
        if (str4 == null ? c1211f.f26683f != null : !str4.equals(c1211f.f26683f)) {
            return false;
        }
        String str5 = this.f26684g;
        String str6 = c1211f.f26684g;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public final C1211F f(String str) {
        onMutation();
        this.f26678a = str;
        return this;
    }

    public final C1211F g(Integer num) {
        onMutation();
        this.f26681d = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_loan_bottom;
    }

    public final C1211F h(String str) {
        onMutation();
        this.f26680c = str;
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
        String str = this.f26678a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26679b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26680c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26681d;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26682e;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f26683f;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26684g;
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
        this.f26678a = null;
        this.f26679b = null;
        this.f26680c = null;
        this.f26681d = null;
        this.f26682e = null;
        this.f26683f = null;
        this.f26684g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26678a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(99, this.f26679b)) {
            throw new IllegalStateException("The attribute metaData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(145, this.f26680c)) {
            throw new IllegalStateException("The attribute statusText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(144, this.f26681d)) {
            throw new IllegalStateException("The attribute statusImgResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26682e)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26683f)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(4, this.f26684g)) {
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
        return "LoanBottomBindingModel_{nameText=" + this.f26678a + ", metaData=" + this.f26679b + ", statusText=" + this.f26680c + ", statusImgResId=" + this.f26681d + ", isActive=" + this.f26682e + ", amount=" + this.f26683f + ", amountD=" + this.f26684g + ", onClickAccount=null}" + super.toString();
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
        if (!(epoxyModel instanceof C1211F)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1211F c1211f = (C1211F) epoxyModel;
        String str = this.f26678a;
        if (str == null ? c1211f.f26678a != null : !str.equals(c1211f.f26678a)) {
            fVar.m(101, this.f26678a);
        }
        String str2 = this.f26679b;
        if (str2 == null ? c1211f.f26679b != null : !str2.equals(c1211f.f26679b)) {
            fVar.m(99, this.f26679b);
        }
        String str3 = this.f26680c;
        if (str3 == null ? c1211f.f26680c != null : !str3.equals(c1211f.f26680c)) {
            fVar.m(145, this.f26680c);
        }
        Integer num = this.f26681d;
        if (num == null ? c1211f.f26681d != null : !num.equals(c1211f.f26681d)) {
            fVar.m(144, this.f26681d);
        }
        Boolean bool = this.f26682e;
        if (bool == null ? c1211f.f26682e != null : !bool.equals(c1211f.f26682e)) {
            fVar.m(49, this.f26682e);
        }
        String str4 = this.f26683f;
        if (str4 == null ? c1211f.f26683f != null : !str4.equals(c1211f.f26683f)) {
            fVar.m(3, this.f26683f);
        }
        String str5 = this.f26684g;
        if (str5 == null ? c1211f.f26684g != null : !str5.equals(c1211f.f26684g)) {
            fVar.m(4, this.f26684g);
        }
        c1211f.getClass();
    }
}
