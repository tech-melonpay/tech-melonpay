package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: CompanyBindingModel_.java */
/* renamed from: s6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1224m extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26921a;

    /* renamed from: b, reason: collision with root package name */
    public String f26922b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26923c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26924d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26925e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26926f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26927g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26928h;

    public final C1224m a(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1224m b() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26923c = bool;
        return this;
    }

    public final C1224m c(Boolean bool) {
        onMutation();
        this.f26927g = bool;
        return this;
    }

    public final C1224m d(Boolean bool) {
        onMutation();
        this.f26926f = bool;
        return this;
    }

    public final C1224m e() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26924d = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1224m) || !super.equals(obj)) {
            return false;
        }
        C1224m c1224m = (C1224m) obj;
        c1224m.getClass();
        String str = this.f26921a;
        if (str == null ? c1224m.f26921a != null : !str.equals(c1224m.f26921a)) {
            return false;
        }
        String str2 = this.f26922b;
        if (str2 == null ? c1224m.f26922b != null : !str2.equals(c1224m.f26922b)) {
            return false;
        }
        Boolean bool = this.f26923c;
        if (bool == null ? c1224m.f26923c != null : !bool.equals(c1224m.f26923c)) {
            return false;
        }
        Boolean bool2 = this.f26924d;
        if (bool2 == null ? c1224m.f26924d != null : !bool2.equals(c1224m.f26924d)) {
            return false;
        }
        Integer num = this.f26925e;
        if (num == null ? c1224m.f26925e != null : !num.equals(c1224m.f26925e)) {
            return false;
        }
        Boolean bool3 = this.f26926f;
        if (bool3 == null ? c1224m.f26926f != null : !bool3.equals(c1224m.f26926f)) {
            return false;
        }
        Boolean bool4 = this.f26927g;
        if (bool4 == null ? c1224m.f26927g == null : bool4.equals(c1224m.f26927g)) {
            return (this.f26928h == null) == (c1224m.f26928h == null);
        }
        return false;
    }

    public final C1224m f(String str) {
        onMutation();
        this.f26921a = str;
        return this;
    }

    public final C1224m g(B7.f fVar) {
        onMutation();
        this.f26928h = fVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_company;
    }

    public final C1224m h(String str) {
        onMutation();
        this.f26922b = str;
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
        String str = this.f26921a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26922b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f26923c;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26924d;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.f26925e;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26926f;
        int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26927g;
        return ((hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + (this.f26928h != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1224m i() {
        onMutation();
        this.f26925e = 0;
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
        this.f26921a = null;
        this.f26922b = null;
        this.f26923c = null;
        this.f26924d = null;
        this.f26925e = null;
        this.f26926f = null;
        this.f26927g = null;
        this.f26928h = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26921a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(125, this.f26922b)) {
            throw new IllegalStateException("The attribute percent was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26923c)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(61, this.f26924d)) {
            throw new IllegalStateException("The attribute isImageVisible was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(143, this.f26925e)) {
            throw new IllegalStateException("The attribute statusImageRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(60, this.f26926f)) {
            throw new IllegalStateException("The attribute isGrayText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(52, this.f26927g)) {
            throw new IllegalStateException("The attribute isClickable was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26928h)) {
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
        return "CompanyBindingModel_{nameText=" + this.f26921a + ", percent=" + this.f26922b + ", isActive=" + this.f26923c + ", isImageVisible=" + this.f26924d + ", statusImageRes=" + this.f26925e + ", isGrayText=" + this.f26926f + ", isClickable=" + this.f26927g + ", onClickAccount=" + this.f26928h + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1224m)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1224m c1224m = (C1224m) epoxyModel;
        String str = this.f26921a;
        if (str == null ? c1224m.f26921a != null : !str.equals(c1224m.f26921a)) {
            fVar.m(101, this.f26921a);
        }
        String str2 = this.f26922b;
        if (str2 == null ? c1224m.f26922b != null : !str2.equals(c1224m.f26922b)) {
            fVar.m(125, this.f26922b);
        }
        Boolean bool = this.f26923c;
        if (bool == null ? c1224m.f26923c != null : !bool.equals(c1224m.f26923c)) {
            fVar.m(49, this.f26923c);
        }
        Boolean bool2 = this.f26924d;
        if (bool2 == null ? c1224m.f26924d != null : !bool2.equals(c1224m.f26924d)) {
            fVar.m(61, this.f26924d);
        }
        Integer num = this.f26925e;
        if (num == null ? c1224m.f26925e != null : !num.equals(c1224m.f26925e)) {
            fVar.m(143, this.f26925e);
        }
        Boolean bool3 = this.f26926f;
        if (bool3 == null ? c1224m.f26926f != null : !bool3.equals(c1224m.f26926f)) {
            fVar.m(60, this.f26926f);
        }
        Boolean bool4 = this.f26927g;
        if (bool4 == null ? c1224m.f26927g != null : !bool4.equals(c1224m.f26927g)) {
            fVar.m(52, this.f26927g);
        }
        View.OnClickListener onClickListener = this.f26928h;
        if ((onClickListener == null) != (c1224m.f26928h == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
