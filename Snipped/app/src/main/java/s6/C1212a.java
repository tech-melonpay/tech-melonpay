package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: AccountBindingModel_.java */
/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1212a extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26766a;

    /* renamed from: b, reason: collision with root package name */
    public String f26767b;

    /* renamed from: c, reason: collision with root package name */
    public String f26768c;

    /* renamed from: d, reason: collision with root package name */
    public String f26769d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f26770e;

    /* renamed from: f, reason: collision with root package name */
    public String f26771f;

    /* renamed from: g, reason: collision with root package name */
    public String f26772g;

    /* renamed from: h, reason: collision with root package name */
    public String f26773h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f26774j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f26775k;

    public final C1212a a(String str) {
        onMutation();
        this.f26768c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1212a b(String str) {
        onMutation();
        this.f26769d = str;
        return this;
    }

    public final C1212a c(String str) {
        onMutation();
        this.f26767b = str;
        return this;
    }

    public final C1212a d(Integer num) {
        onMutation();
        this.f26774j = num;
        return this;
    }

    public final C1212a e(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1212a) || !super.equals(obj)) {
            return false;
        }
        C1212a c1212a = (C1212a) obj;
        c1212a.getClass();
        String str = this.f26766a;
        if (str == null ? c1212a.f26766a != null : !str.equals(c1212a.f26766a)) {
            return false;
        }
        String str2 = this.f26767b;
        if (str2 == null ? c1212a.f26767b != null : !str2.equals(c1212a.f26767b)) {
            return false;
        }
        String str3 = this.f26768c;
        if (str3 == null ? c1212a.f26768c != null : !str3.equals(c1212a.f26768c)) {
            return false;
        }
        String str4 = this.f26769d;
        if (str4 == null ? c1212a.f26769d != null : !str4.equals(c1212a.f26769d)) {
            return false;
        }
        if ((this.f26770e == null) != (c1212a.f26770e == null)) {
            return false;
        }
        String str5 = this.f26771f;
        if (str5 == null ? c1212a.f26771f != null : !str5.equals(c1212a.f26771f)) {
            return false;
        }
        String str6 = this.f26772g;
        if (str6 == null ? c1212a.f26772g != null : !str6.equals(c1212a.f26772g)) {
            return false;
        }
        String str7 = this.f26773h;
        if (str7 == null ? c1212a.f26773h != null : !str7.equals(c1212a.f26773h)) {
            return false;
        }
        String str8 = this.i;
        if (str8 == null ? c1212a.i != null : !str8.equals(c1212a.i)) {
            return false;
        }
        Integer num = this.f26774j;
        if (num == null ? c1212a.f26774j != null : !num.equals(c1212a.f26774j)) {
            return false;
        }
        Boolean bool = this.f26775k;
        Boolean bool2 = c1212a.f26775k;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public final C1212a f(Boolean bool) {
        onMutation();
        this.f26775k = bool;
        return this;
    }

    public final C1212a g(String str) {
        onMutation();
        this.f26766a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_account;
    }

    public final C1212a h(B7.f fVar) {
        onMutation();
        this.f26770e = fVar;
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
        String str = this.f26766a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26767b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 961;
        String str3 = this.f26768c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26769d;
        int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f26770e != null ? 1 : 0)) * 31;
        String str5 = this.f26771f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f26772g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f26773h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.i;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num = this.f26774j;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26775k;
        return hashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1212a i(String str) {
        onMutation();
        this.f26771f = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1212a j(String str) {
        onMutation();
        this.f26772g = str;
        return this;
    }

    public final C1212a k(String str) {
        onMutation();
        this.f26773h = str;
        return this;
    }

    public final C1212a l(String str) {
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
        this.f26766a = null;
        this.f26767b = null;
        this.f26768c = null;
        this.f26769d = null;
        this.f26770e = null;
        this.f26771f = null;
        this.f26772g = null;
        this.f26773h = null;
        this.i = null;
        this.f26774j = null;
        this.f26775k = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26766a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, this.f26767b)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(7, null)) {
            throw new IllegalStateException("The attribute amountText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26768c)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(4, this.f26769d)) {
            throw new IllegalStateException("The attribute amountD was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26770e)) {
            throw new IllegalStateException("The attribute onClickAccount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(121, this.f26771f)) {
            throw new IllegalStateException("The attribute opt1Label was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(122, this.f26772g)) {
            throw new IllegalStateException("The attribute opt1Value was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(123, this.f26773h)) {
            throw new IllegalStateException("The attribute opt2Label was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(124, this.i)) {
            throw new IllegalStateException("The attribute opt2Value was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f26774j)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(49, this.f26775k)) {
            throw new IllegalStateException("The attribute isActive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "AccountBindingModel_{nameText=" + this.f26766a + ", currency=" + this.f26767b + ", amountText=null, amount=" + this.f26768c + ", amountD=" + this.f26769d + ", onClickAccount=" + this.f26770e + ", opt1Label=" + this.f26771f + ", opt1Value=" + this.f26772g + ", opt2Label=" + this.f26773h + ", opt2Value=" + this.i + ", iconRes=" + this.f26774j + ", isActive=" + this.f26775k + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1212a)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1212a c1212a = (C1212a) epoxyModel;
        String str = this.f26766a;
        if (str == null ? c1212a.f26766a != null : !str.equals(c1212a.f26766a)) {
            fVar.m(101, this.f26766a);
        }
        String str2 = this.f26767b;
        if (str2 == null ? c1212a.f26767b != null : !str2.equals(c1212a.f26767b)) {
            fVar.m(21, this.f26767b);
        }
        c1212a.getClass();
        String str3 = this.f26768c;
        if (str3 == null ? c1212a.f26768c != null : !str3.equals(c1212a.f26768c)) {
            fVar.m(3, this.f26768c);
        }
        String str4 = this.f26769d;
        if (str4 == null ? c1212a.f26769d != null : !str4.equals(c1212a.f26769d)) {
            fVar.m(4, this.f26769d);
        }
        View.OnClickListener onClickListener = this.f26770e;
        if ((onClickListener == null) != (c1212a.f26770e == null)) {
            fVar.m(105, onClickListener);
        }
        String str5 = this.f26771f;
        if (str5 == null ? c1212a.f26771f != null : !str5.equals(c1212a.f26771f)) {
            fVar.m(121, this.f26771f);
        }
        String str6 = this.f26772g;
        if (str6 == null ? c1212a.f26772g != null : !str6.equals(c1212a.f26772g)) {
            fVar.m(122, this.f26772g);
        }
        String str7 = this.f26773h;
        if (str7 == null ? c1212a.f26773h != null : !str7.equals(c1212a.f26773h)) {
            fVar.m(123, this.f26773h);
        }
        String str8 = this.i;
        if (str8 == null ? c1212a.i != null : !str8.equals(c1212a.i)) {
            fVar.m(124, this.i);
        }
        Integer num = this.f26774j;
        if (num == null ? c1212a.f26774j != null : !num.equals(c1212a.f26774j)) {
            fVar.m(44, this.f26774j);
        }
        Boolean bool = this.f26775k;
        Boolean bool2 = c1212a.f26775k;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        fVar.m(49, this.f26775k);
    }
}
