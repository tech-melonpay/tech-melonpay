package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: PlanCarouselItemBindingModel_.java */
/* loaded from: classes2.dex */
public final class Y extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26750a;

    /* renamed from: b, reason: collision with root package name */
    public String f26751b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26752c;

    /* renamed from: d, reason: collision with root package name */
    public String f26753d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26754e;

    /* renamed from: f, reason: collision with root package name */
    public String f26755f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f26756g;

    /* renamed from: h, reason: collision with root package name */
    public String f26757h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public C6.a f26758j;

    /* renamed from: k, reason: collision with root package name */
    public String f26759k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f26760l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f26761m;

    public final void a(String str) {
        super.mo6id(str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y) || !super.equals(obj)) {
            return false;
        }
        Y y10 = (Y) obj;
        y10.getClass();
        Integer num = this.f26750a;
        if (num == null ? y10.f26750a != null : !num.equals(y10.f26750a)) {
            return false;
        }
        String str = this.f26751b;
        if (str == null ? y10.f26751b != null : !str.equals(y10.f26751b)) {
            return false;
        }
        Integer num2 = this.f26752c;
        if (num2 == null ? y10.f26752c != null : !num2.equals(y10.f26752c)) {
            return false;
        }
        String str2 = this.f26753d;
        if (str2 == null ? y10.f26753d != null : !str2.equals(y10.f26753d)) {
            return false;
        }
        Integer num3 = this.f26754e;
        if (num3 == null ? y10.f26754e != null : !num3.equals(y10.f26754e)) {
            return false;
        }
        String str3 = this.f26755f;
        if (str3 == null ? y10.f26755f != null : !str3.equals(y10.f26755f)) {
            return false;
        }
        Integer num4 = this.f26756g;
        if (num4 == null ? y10.f26756g != null : !num4.equals(y10.f26756g)) {
            return false;
        }
        String str4 = this.f26757h;
        if (str4 == null ? y10.f26757h != null : !str4.equals(y10.f26757h)) {
            return false;
        }
        Integer num5 = this.i;
        if (num5 == null ? y10.i != null : !num5.equals(y10.i)) {
            return false;
        }
        C6.a aVar = this.f26758j;
        if (aVar == null ? y10.f26758j != null : !aVar.equals(y10.f26758j)) {
            return false;
        }
        String str5 = this.f26759k;
        if (str5 == null ? y10.f26759k != null : !str5.equals(y10.f26759k)) {
            return false;
        }
        Boolean bool = this.f26760l;
        if (bool == null ? y10.f26760l == null : bool.equals(y10.f26760l)) {
            return (this.f26761m == null) == (y10.f26761m == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_plan_carousel_item;
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
        Integer num = this.f26750a;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f26751b;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f26752c;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.f26753d;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num3 = this.f26754e;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str3 = this.f26755f;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num4 = this.f26756g;
        int hashCode8 = (hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str4 = this.f26757h;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num5 = this.i;
        int hashCode10 = (hashCode9 + (num5 != null ? num5.hashCode() : 0)) * 31;
        C6.a aVar = this.f26758j;
        int hashCode11 = (hashCode10 + (aVar != null ? aVar.f680a.hashCode() : 0)) * 31;
        String str5 = this.f26759k;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f26760l;
        return ((hashCode12 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f26761m != null ? 1 : 0);
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
        this.f26750a = null;
        this.f26751b = null;
        this.f26752c = null;
        this.f26753d = null;
        this.f26754e = null;
        this.f26755f = null;
        this.f26756g = null;
        this.f26757h = null;
        this.i = null;
        this.f26758j = null;
        this.f26759k = null;
        this.f26760l = null;
        this.f26761m = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(10, this.f26750a)) {
            throw new IllegalStateException("The attribute backgroundColor was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(148, this.f26751b)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(149, this.f26752c)) {
            throw new IllegalStateException("The attribute titleColor was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(150, this.f26753d)) {
            throw new IllegalStateException("The attribute titleDescription was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(151, this.f26754e)) {
            throw new IllegalStateException("The attribute titleDescriptionColor was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(25, this.f26755f)) {
            throw new IllegalStateException("The attribute description was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(26, this.f26756g)) {
            throw new IllegalStateException("The attribute descriptionColor was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(27, this.f26757h)) {
            throw new IllegalStateException("The attribute descriptionDescription was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(28, this.i)) {
            throw new IllegalStateException("The attribute descriptionDescriptionColor was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(23, this.f26758j)) {
            throw new IllegalStateException("The attribute dataList was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(13, this.f26759k)) {
            throw new IllegalStateException("The attribute buttonTitle was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(50, this.f26760l)) {
            throw new IllegalStateException("The attribute isActivePlan was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.f26761m)) {
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
        return "PlanCarouselItemBindingModel_{backgroundColor=" + this.f26750a + ", title=" + this.f26751b + ", titleColor=" + this.f26752c + ", titleDescription=" + this.f26753d + ", titleDescriptionColor=" + this.f26754e + ", description=" + this.f26755f + ", descriptionColor=" + this.f26756g + ", descriptionDescription=" + this.f26757h + ", descriptionDescriptionColor=" + this.i + ", dataList=" + this.f26758j + ", buttonTitle=" + this.f26759k + ", isActivePlan=" + this.f26760l + ", onClick=" + this.f26761m + "}" + super.toString();
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
        if (!(epoxyModel instanceof Y)) {
            setDataBindingVariables(fVar);
            return;
        }
        Y y10 = (Y) epoxyModel;
        Integer num = this.f26750a;
        if (num == null ? y10.f26750a != null : !num.equals(y10.f26750a)) {
            fVar.m(10, this.f26750a);
        }
        String str = this.f26751b;
        if (str == null ? y10.f26751b != null : !str.equals(y10.f26751b)) {
            fVar.m(148, this.f26751b);
        }
        Integer num2 = this.f26752c;
        if (num2 == null ? y10.f26752c != null : !num2.equals(y10.f26752c)) {
            fVar.m(149, this.f26752c);
        }
        String str2 = this.f26753d;
        if (str2 == null ? y10.f26753d != null : !str2.equals(y10.f26753d)) {
            fVar.m(150, this.f26753d);
        }
        Integer num3 = this.f26754e;
        if (num3 == null ? y10.f26754e != null : !num3.equals(y10.f26754e)) {
            fVar.m(151, this.f26754e);
        }
        String str3 = this.f26755f;
        if (str3 == null ? y10.f26755f != null : !str3.equals(y10.f26755f)) {
            fVar.m(25, this.f26755f);
        }
        Integer num4 = this.f26756g;
        if (num4 == null ? y10.f26756g != null : !num4.equals(y10.f26756g)) {
            fVar.m(26, this.f26756g);
        }
        String str4 = this.f26757h;
        if (str4 == null ? y10.f26757h != null : !str4.equals(y10.f26757h)) {
            fVar.m(27, this.f26757h);
        }
        Integer num5 = this.i;
        if (num5 == null ? y10.i != null : !num5.equals(y10.i)) {
            fVar.m(28, this.i);
        }
        C6.a aVar = this.f26758j;
        if (aVar == null ? y10.f26758j != null : !aVar.equals(y10.f26758j)) {
            fVar.m(23, this.f26758j);
        }
        String str5 = this.f26759k;
        if (str5 == null ? y10.f26759k != null : !str5.equals(y10.f26759k)) {
            fVar.m(13, this.f26759k);
        }
        Boolean bool = this.f26760l;
        if (bool == null ? y10.f26760l != null : !bool.equals(y10.f26760l)) {
            fVar.m(50, this.f26760l);
        }
        View.OnClickListener onClickListener = this.f26761m;
        if ((onClickListener == null) != (y10.f26761m == null)) {
            fVar.m(104, onClickListener);
        }
    }
}
