package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: LoanMainBindingModel_.java */
/* loaded from: classes2.dex */
public final class I extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26693a;

    /* renamed from: b, reason: collision with root package name */
    public String f26694b;

    /* renamed from: c, reason: collision with root package name */
    public String f26695c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f26696d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26697e;

    /* renamed from: f, reason: collision with root package name */
    public String f26698f;

    /* renamed from: g, reason: collision with root package name */
    public String f26699g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26700h;

    public final I a(String str) {
        onMutation();
        this.f26698f = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final I b() {
        onMutation();
        this.f26699g = ".00";
        return this;
    }

    public final I c(String str) {
        super.mo6id(str);
        return this;
    }

    public final I d(Boolean bool) {
        onMutation();
        this.f26697e = bool;
        return this;
    }

    public final I e(String str) {
        onMutation();
        this.f26694b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I) || !super.equals(obj)) {
            return false;
        }
        I i = (I) obj;
        i.getClass();
        String str = this.f26693a;
        if (str == null ? i.f26693a != null : !str.equals(i.f26693a)) {
            return false;
        }
        String str2 = this.f26694b;
        if (str2 == null ? i.f26694b != null : !str2.equals(i.f26694b)) {
            return false;
        }
        String str3 = this.f26695c;
        if (str3 == null ? i.f26695c != null : !str3.equals(i.f26695c)) {
            return false;
        }
        Integer num = this.f26696d;
        if (num == null ? i.f26696d != null : !num.equals(i.f26696d)) {
            return false;
        }
        Boolean bool = this.f26697e;
        if (bool == null ? i.f26697e != null : !bool.equals(i.f26697e)) {
            return false;
        }
        String str4 = this.f26698f;
        if (str4 == null ? i.f26698f != null : !str4.equals(i.f26698f)) {
            return false;
        }
        String str5 = this.f26699g;
        if (str5 == null ? i.f26699g == null : str5.equals(i.f26699g)) {
            return (this.f26700h == null) == (i.f26700h == null);
        }
        return false;
    }

    public final I f(String str) {
        onMutation();
        this.f26693a = str;
        return this;
    }

    public final I g(J7.b bVar) {
        onMutation();
        this.f26700h = bVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_loan_main;
    }

    public final I h(Integer num) {
        onMutation();
        this.f26696d = num;
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
        String str = this.f26693a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26694b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26695c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26696d;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26697e;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f26698f;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26699g;
        return ((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.f26700h != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final I i(String str) {
        onMutation();
        this.f26695c = str;
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
        this.f26693a = null;
        this.f26694b = null;
        this.f26695c = null;
        this.f26696d = null;
        this.f26697e = null;
        this.f26698f = null;
        this.f26699g = null;
        this.f26700h = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26693a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(99, this.f26694b)) {
            throw new IllegalStateException("The attribute metaData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(145, this.f26695c)) {
            throw new IllegalStateException("The attribute statusText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(144, this.f26696d)) {
            throw new IllegalStateException("The attribute statusImgResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26697e)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26698f)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(4, this.f26699g)) {
            throw new IllegalStateException("The attribute amountD was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26700h)) {
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
        return "LoanMainBindingModel_{nameText=" + this.f26693a + ", metaData=" + this.f26694b + ", statusText=" + this.f26695c + ", statusImgResId=" + this.f26696d + ", isActive=" + this.f26697e + ", amount=" + this.f26698f + ", amountD=" + this.f26699g + ", onClickAccount=" + this.f26700h + "}" + super.toString();
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
        if (!(epoxyModel instanceof I)) {
            setDataBindingVariables(fVar);
            return;
        }
        I i = (I) epoxyModel;
        String str = this.f26693a;
        if (str == null ? i.f26693a != null : !str.equals(i.f26693a)) {
            fVar.m(101, this.f26693a);
        }
        String str2 = this.f26694b;
        if (str2 == null ? i.f26694b != null : !str2.equals(i.f26694b)) {
            fVar.m(99, this.f26694b);
        }
        String str3 = this.f26695c;
        if (str3 == null ? i.f26695c != null : !str3.equals(i.f26695c)) {
            fVar.m(145, this.f26695c);
        }
        Integer num = this.f26696d;
        if (num == null ? i.f26696d != null : !num.equals(i.f26696d)) {
            fVar.m(144, this.f26696d);
        }
        Boolean bool = this.f26697e;
        if (bool == null ? i.f26697e != null : !bool.equals(i.f26697e)) {
            fVar.m(49, this.f26697e);
        }
        String str4 = this.f26698f;
        if (str4 == null ? i.f26698f != null : !str4.equals(i.f26698f)) {
            fVar.m(3, this.f26698f);
        }
        String str5 = this.f26699g;
        if (str5 == null ? i.f26699g != null : !str5.equals(i.f26699g)) {
            fVar.m(4, this.f26699g);
        }
        View.OnClickListener onClickListener = this.f26700h;
        if ((onClickListener == null) != (i.f26700h == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
