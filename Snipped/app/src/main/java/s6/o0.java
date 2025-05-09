package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: TransactionLastBindingModel_.java */
/* loaded from: classes2.dex */
public final class o0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26943a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26944b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26945c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26946d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26947e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26948f;

    /* renamed from: g, reason: collision with root package name */
    public SpannedString f26949g;

    /* renamed from: h, reason: collision with root package name */
    public SpannedString f26950h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f26951j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f26952k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnClickListener f26953l;

    public final o0 a(String str) {
        onMutation();
        this.i = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final o0 b(SpannedString spannedString) {
        onMutation();
        this.f26950h = spannedString;
        return this;
    }

    public final o0 c(String str) {
        super.mo6id(str);
        return this;
    }

    public final o0 d(Boolean bool) {
        onMutation();
        this.f26944b = bool;
        return this;
    }

    public final o0 e() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26945c = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0) || !super.equals(obj)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        String str = this.f26943a;
        if (str == null ? o0Var.f26943a != null : !str.equals(o0Var.f26943a)) {
            return false;
        }
        Boolean bool = this.f26944b;
        if (bool == null ? o0Var.f26944b != null : !bool.equals(o0Var.f26944b)) {
            return false;
        }
        Boolean bool2 = this.f26945c;
        if (bool2 == null ? o0Var.f26945c != null : !bool2.equals(o0Var.f26945c)) {
            return false;
        }
        Boolean bool3 = this.f26946d;
        if (bool3 == null ? o0Var.f26946d != null : !bool3.equals(o0Var.f26946d)) {
            return false;
        }
        Boolean bool4 = this.f26947e;
        if (bool4 == null ? o0Var.f26947e != null : !bool4.equals(o0Var.f26947e)) {
            return false;
        }
        Boolean bool5 = this.f26948f;
        if (bool5 == null ? o0Var.f26948f != null : !bool5.equals(o0Var.f26948f)) {
            return false;
        }
        SpannedString spannedString = this.f26949g;
        if (spannedString == null ? o0Var.f26949g != null : !spannedString.equals(o0Var.f26949g)) {
            return false;
        }
        SpannedString spannedString2 = this.f26950h;
        if (spannedString2 == null ? o0Var.f26950h != null : !spannedString2.equals(o0Var.f26950h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null ? o0Var.i != null : !str2.equals(o0Var.i)) {
            return false;
        }
        String str3 = this.f26951j;
        if (str3 == null ? o0Var.f26951j != null : !str3.equals(o0Var.f26951j)) {
            return false;
        }
        Integer num = this.f26952k;
        if (num == null ? o0Var.f26952k == null : num.equals(o0Var.f26952k)) {
            return (this.f26953l == null) == (o0Var.f26953l == null);
        }
        return false;
    }

    public final o0 f(String str) {
        onMutation();
        this.f26943a = str;
        return this;
    }

    public final o0 g(D7.a aVar) {
        onMutation();
        this.f26953l = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_transaction_last;
    }

    public final o0 h(String str) {
        onMutation();
        this.f26951j = str;
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
        String str = this.f26943a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        Boolean bool = this.f26944b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26945c;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26946d;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26947e;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f26948f;
        int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26949g;
        int hashCode8 = (hashCode7 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        SpannedString spannedString2 = this.f26950h;
        int hashCode9 = (hashCode8 + (spannedString2 != null ? spannedString2.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26951j;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26952k;
        return ((hashCode11 + (num != null ? num.hashCode() : 0)) * 31) + (this.f26953l != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final o0 i() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26946d = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final o0 j() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26948f = bool;
        return this;
    }

    public final o0 k() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26947e = bool;
        return this;
    }

    public final o0 l(SpannedString spannedString) {
        onMutation();
        this.f26949g = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    public final o0 m(Integer num) {
        onMutation();
        this.f26952k = num;
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
        this.f26943a = null;
        this.f26944b = null;
        this.f26945c = null;
        this.f26946d = null;
        this.f26947e = null;
        this.f26948f = null;
        this.f26949g = null;
        this.f26950h = null;
        this.i = null;
        this.f26951j = null;
        this.f26952k = null;
        this.f26953l = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(100, this.f26943a)) {
            throw new IllegalStateException("The attribute name was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, this.f26944b)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(54, this.f26945c)) {
            throw new IllegalStateException("The attribute isDeclined was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(132, this.f26946d)) {
            throw new IllegalStateException("The attribute shouldShowRecive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(134, this.f26947e)) {
            throw new IllegalStateException("The attribute shouldShowSmallPoint was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(133, this.f26948f)) {
            throw new IllegalStateException("The attribute shouldShowShortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(140, this.f26949g)) {
            throw new IllegalStateException("The attribute sourceAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(29, this.f26950h)) {
            throw new IllegalStateException("The attribute destinationAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.i)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, this.f26951j)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(165, this.f26952k)) {
            throw new IllegalStateException("The attribute wayIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26953l)) {
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
        return "TransactionLastBindingModel_{name=" + this.f26943a + ", nameText=null, incoming=" + this.f26944b + ", isDeclined=" + this.f26945c + ", shouldShowRecive=" + this.f26946d + ", shouldShowSmallPoint=" + this.f26947e + ", shouldShowShortName=" + this.f26948f + ", sourceAmount=" + ((Object) this.f26949g) + ", destinationAmount=" + ((Object) this.f26950h) + ", date=" + this.i + ", shortName=" + this.f26951j + ", wayIconRes=" + this.f26952k + ", onClickAccount=" + this.f26953l + "}" + super.toString();
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
        if (!(epoxyModel instanceof o0)) {
            setDataBindingVariables(fVar);
            return;
        }
        o0 o0Var = (o0) epoxyModel;
        String str = this.f26943a;
        if (str == null ? o0Var.f26943a != null : !str.equals(o0Var.f26943a)) {
            fVar.m(100, this.f26943a);
        }
        o0Var.getClass();
        Boolean bool = this.f26944b;
        if (bool == null ? o0Var.f26944b != null : !bool.equals(o0Var.f26944b)) {
            fVar.m(46, this.f26944b);
        }
        Boolean bool2 = this.f26945c;
        if (bool2 == null ? o0Var.f26945c != null : !bool2.equals(o0Var.f26945c)) {
            fVar.m(54, this.f26945c);
        }
        Boolean bool3 = this.f26946d;
        if (bool3 == null ? o0Var.f26946d != null : !bool3.equals(o0Var.f26946d)) {
            fVar.m(132, this.f26946d);
        }
        Boolean bool4 = this.f26947e;
        if (bool4 == null ? o0Var.f26947e != null : !bool4.equals(o0Var.f26947e)) {
            fVar.m(134, this.f26947e);
        }
        Boolean bool5 = this.f26948f;
        if (bool5 == null ? o0Var.f26948f != null : !bool5.equals(o0Var.f26948f)) {
            fVar.m(133, this.f26948f);
        }
        SpannedString spannedString = this.f26949g;
        if (spannedString == null ? o0Var.f26949g != null : !spannedString.equals(o0Var.f26949g)) {
            fVar.m(140, this.f26949g);
        }
        SpannedString spannedString2 = this.f26950h;
        if (spannedString2 == null ? o0Var.f26950h != null : !spannedString2.equals(o0Var.f26950h)) {
            fVar.m(29, this.f26950h);
        }
        String str2 = this.i;
        if (str2 == null ? o0Var.i != null : !str2.equals(o0Var.i)) {
            fVar.m(24, this.i);
        }
        String str3 = this.f26951j;
        if (str3 == null ? o0Var.f26951j != null : !str3.equals(o0Var.f26951j)) {
            fVar.m(130, this.f26951j);
        }
        Integer num = this.f26952k;
        if (num == null ? o0Var.f26952k != null : !num.equals(o0Var.f26952k)) {
            fVar.m(165, this.f26952k);
        }
        View.OnClickListener onClickListener = this.f26953l;
        if ((onClickListener == null) != (o0Var.f26953l == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
