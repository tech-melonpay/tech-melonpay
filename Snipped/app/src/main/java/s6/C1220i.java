package s6;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: BusinessProfileBindingModel_.java */
/* renamed from: s6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1220i extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26886a;

    /* renamed from: b, reason: collision with root package name */
    public String f26887b;

    /* renamed from: c, reason: collision with root package name */
    public String f26888c;

    /* renamed from: d, reason: collision with root package name */
    public String f26889d;

    /* renamed from: e, reason: collision with root package name */
    public String f26890e;

    /* renamed from: f, reason: collision with root package name */
    public String f26891f;

    /* renamed from: g, reason: collision with root package name */
    public String f26892g;

    /* renamed from: h, reason: collision with root package name */
    public String f26893h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f26894j;

    /* renamed from: k, reason: collision with root package name */
    public String f26895k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f26896l;

    public final C1220i a(String str) {
        onMutation();
        this.f26886a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1220i b() {
        super.mo6id("company_details");
        return this;
    }

    public final C1220i c() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26896l = bool;
        return this;
    }

    public final C1220i d(String str) {
        onMutation();
        this.f26887b = str;
        return this;
    }

    public final C1220i e(String str) {
        onMutation();
        this.f26889d = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1220i) || !super.equals(obj)) {
            return false;
        }
        C1220i c1220i = (C1220i) obj;
        c1220i.getClass();
        String str = this.f26886a;
        if (str == null ? c1220i.f26886a != null : !str.equals(c1220i.f26886a)) {
            return false;
        }
        String str2 = this.f26887b;
        if (str2 == null ? c1220i.f26887b != null : !str2.equals(c1220i.f26887b)) {
            return false;
        }
        String str3 = this.f26888c;
        if (str3 == null ? c1220i.f26888c != null : !str3.equals(c1220i.f26888c)) {
            return false;
        }
        String str4 = this.f26889d;
        if (str4 == null ? c1220i.f26889d != null : !str4.equals(c1220i.f26889d)) {
            return false;
        }
        String str5 = this.f26890e;
        if (str5 == null ? c1220i.f26890e != null : !str5.equals(c1220i.f26890e)) {
            return false;
        }
        String str6 = this.f26891f;
        if (str6 == null ? c1220i.f26891f != null : !str6.equals(c1220i.f26891f)) {
            return false;
        }
        String str7 = this.f26892g;
        if (str7 == null ? c1220i.f26892g != null : !str7.equals(c1220i.f26892g)) {
            return false;
        }
        String str8 = this.f26893h;
        if (str8 == null ? c1220i.f26893h != null : !str8.equals(c1220i.f26893h)) {
            return false;
        }
        String str9 = this.i;
        if (str9 == null ? c1220i.i != null : !str9.equals(c1220i.i)) {
            return false;
        }
        String str10 = this.f26894j;
        if (str10 == null ? c1220i.f26894j != null : !str10.equals(c1220i.f26894j)) {
            return false;
        }
        String str11 = this.f26895k;
        if (str11 == null ? c1220i.f26895k != null : !str11.equals(c1220i.f26895k)) {
            return false;
        }
        Boolean bool = this.f26896l;
        Boolean bool2 = c1220i.f26896l;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public final C1220i f(String str) {
        onMutation();
        this.f26891f = str;
        return this;
    }

    public final C1220i g(String str) {
        onMutation();
        this.f26893h = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_business_profile;
    }

    public final C1220i h(String str) {
        onMutation();
        this.f26894j = str;
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
        String str = this.f26886a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26887b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26888c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26889d;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26890e;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f26891f;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f26892g;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f26893h;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.i;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f26894j;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f26895k;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Boolean bool = this.f26896l;
        return (hashCode12 + (bool != null ? bool.hashCode() : 0)) * 31;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1220i i(String str) {
        onMutation();
        this.f26888c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1220i j(String str) {
        onMutation();
        this.f26890e = str;
        return this;
    }

    public final C1220i k(String str) {
        onMutation();
        this.f26892g = str;
        return this;
    }

    public final C1220i l(String str) {
        onMutation();
        this.i = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    public final C1220i m(String str) {
        onMutation();
        this.f26895k = str;
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
        this.f26886a = null;
        this.f26887b = null;
        this.f26888c = null;
        this.f26889d = null;
        this.f26890e = null;
        this.f26891f = null;
        this.f26892g = null;
        this.f26893h = null;
        this.i = null;
        this.f26894j = null;
        this.f26895k = null;
        this.f26896l = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(39, this.f26886a)) {
            throw new IllegalStateException("The attribute headerText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(85, this.f26887b)) {
            throw new IllegalStateException("The attribute keyText1 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(155, this.f26888c)) {
            throw new IllegalStateException("The attribute valueText1 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(86, this.f26889d)) {
            throw new IllegalStateException("The attribute keyText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(156, this.f26890e)) {
            throw new IllegalStateException("The attribute valueText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(87, this.f26891f)) {
            throw new IllegalStateException("The attribute keyText3 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(157, this.f26892g)) {
            throw new IllegalStateException("The attribute valueText3 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(88, this.f26893h)) {
            throw new IllegalStateException("The attribute keyText4 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(158, this.i)) {
            throw new IllegalStateException("The attribute valueText4 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(89, this.f26894j)) {
            throw new IllegalStateException("The attribute keyText5 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(159, this.f26895k)) {
            throw new IllegalStateException("The attribute valueText5 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f26896l)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(107, null)) {
            throw new IllegalStateException("The attribute onClickData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "BusinessProfileBindingModel_{headerText=" + this.f26886a + ", keyText1=" + this.f26887b + ", valueText1=" + this.f26888c + ", keyText2=" + this.f26889d + ", valueText2=" + this.f26890e + ", keyText3=" + this.f26891f + ", valueText3=" + this.f26892g + ", keyText4=" + this.f26893h + ", valueText4=" + this.i + ", keyText5=" + this.f26894j + ", valueText5=" + this.f26895k + ", isEnabled=" + this.f26896l + ", onClickData=null}" + super.toString();
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
        if (!(epoxyModel instanceof C1220i)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1220i c1220i = (C1220i) epoxyModel;
        String str = this.f26886a;
        if (str == null ? c1220i.f26886a != null : !str.equals(c1220i.f26886a)) {
            fVar.m(39, this.f26886a);
        }
        String str2 = this.f26887b;
        if (str2 == null ? c1220i.f26887b != null : !str2.equals(c1220i.f26887b)) {
            fVar.m(85, this.f26887b);
        }
        String str3 = this.f26888c;
        if (str3 == null ? c1220i.f26888c != null : !str3.equals(c1220i.f26888c)) {
            fVar.m(155, this.f26888c);
        }
        String str4 = this.f26889d;
        if (str4 == null ? c1220i.f26889d != null : !str4.equals(c1220i.f26889d)) {
            fVar.m(86, this.f26889d);
        }
        String str5 = this.f26890e;
        if (str5 == null ? c1220i.f26890e != null : !str5.equals(c1220i.f26890e)) {
            fVar.m(156, this.f26890e);
        }
        String str6 = this.f26891f;
        if (str6 == null ? c1220i.f26891f != null : !str6.equals(c1220i.f26891f)) {
            fVar.m(87, this.f26891f);
        }
        String str7 = this.f26892g;
        if (str7 == null ? c1220i.f26892g != null : !str7.equals(c1220i.f26892g)) {
            fVar.m(157, this.f26892g);
        }
        String str8 = this.f26893h;
        if (str8 == null ? c1220i.f26893h != null : !str8.equals(c1220i.f26893h)) {
            fVar.m(88, this.f26893h);
        }
        String str9 = this.i;
        if (str9 == null ? c1220i.i != null : !str9.equals(c1220i.i)) {
            fVar.m(158, this.i);
        }
        String str10 = this.f26894j;
        if (str10 == null ? c1220i.f26894j != null : !str10.equals(c1220i.f26894j)) {
            fVar.m(89, this.f26894j);
        }
        String str11 = this.f26895k;
        if (str11 == null ? c1220i.f26895k != null : !str11.equals(c1220i.f26895k)) {
            fVar.m(159, this.f26895k);
        }
        Boolean bool = this.f26896l;
        if (bool == null ? c1220i.f26896l != null : !bool.equals(c1220i.f26896l)) {
            fVar.m(56, this.f26896l);
        }
        c1220i.getClass();
    }
}
