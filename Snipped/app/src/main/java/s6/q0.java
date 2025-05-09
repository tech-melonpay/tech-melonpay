package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: TransactionTopBindingModel_.java */
/* loaded from: classes2.dex */
public final class q0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26974a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26975b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26976c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26977d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26978e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26979f;

    /* renamed from: g, reason: collision with root package name */
    public SpannedString f26980g;

    /* renamed from: h, reason: collision with root package name */
    public SpannedString f26981h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f26982j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f26983k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnClickListener f26984l;

    public final q0 a(String str) {
        onMutation();
        this.i = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final q0 b(SpannedString spannedString) {
        onMutation();
        this.f26981h = spannedString;
        return this;
    }

    public final q0 c(String str) {
        super.mo6id(str);
        return this;
    }

    public final q0 d(Boolean bool) {
        onMutation();
        this.f26975b = bool;
        return this;
    }

    public final q0 e() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26979f = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || !super.equals(obj)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        q0Var.getClass();
        String str = this.f26974a;
        if (str == null ? q0Var.f26974a != null : !str.equals(q0Var.f26974a)) {
            return false;
        }
        Boolean bool = this.f26975b;
        if (bool == null ? q0Var.f26975b != null : !bool.equals(q0Var.f26975b)) {
            return false;
        }
        Boolean bool2 = this.f26976c;
        if (bool2 == null ? q0Var.f26976c != null : !bool2.equals(q0Var.f26976c)) {
            return false;
        }
        Boolean bool3 = this.f26977d;
        if (bool3 == null ? q0Var.f26977d != null : !bool3.equals(q0Var.f26977d)) {
            return false;
        }
        Boolean bool4 = this.f26978e;
        if (bool4 == null ? q0Var.f26978e != null : !bool4.equals(q0Var.f26978e)) {
            return false;
        }
        Boolean bool5 = this.f26979f;
        if (bool5 == null ? q0Var.f26979f != null : !bool5.equals(q0Var.f26979f)) {
            return false;
        }
        SpannedString spannedString = this.f26980g;
        if (spannedString == null ? q0Var.f26980g != null : !spannedString.equals(q0Var.f26980g)) {
            return false;
        }
        SpannedString spannedString2 = this.f26981h;
        if (spannedString2 == null ? q0Var.f26981h != null : !spannedString2.equals(q0Var.f26981h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null ? q0Var.i != null : !str2.equals(q0Var.i)) {
            return false;
        }
        String str3 = this.f26982j;
        if (str3 == null ? q0Var.f26982j != null : !str3.equals(q0Var.f26982j)) {
            return false;
        }
        Integer num = this.f26983k;
        if (num == null ? q0Var.f26983k == null : num.equals(q0Var.f26983k)) {
            return (this.f26984l == null) == (q0Var.f26984l == null);
        }
        return false;
    }

    public final q0 f(String str) {
        onMutation();
        this.f26974a = str;
        return this;
    }

    public final q0 g(D7.a aVar) {
        onMutation();
        this.f26984l = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_transaction_top;
    }

    public final q0 h(String str) {
        onMutation();
        this.f26982j = str;
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
        String str = this.f26974a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        Boolean bool = this.f26975b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26976c;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26977d;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26978e;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f26979f;
        int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26980g;
        int hashCode8 = (hashCode7 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        SpannedString spannedString2 = this.f26981h;
        int hashCode9 = (hashCode8 + (spannedString2 != null ? spannedString2.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26982j;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26983k;
        return ((hashCode11 + (num != null ? num.hashCode() : 0)) * 31) + (this.f26984l != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final q0 i() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26976c = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final q0 j() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26978e = bool;
        return this;
    }

    public final q0 k() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26977d = bool;
        return this;
    }

    public final q0 l(SpannedString spannedString) {
        onMutation();
        this.f26980g = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    public final q0 m(Integer num) {
        onMutation();
        this.f26983k = num;
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
        this.f26974a = null;
        this.f26975b = null;
        this.f26976c = null;
        this.f26977d = null;
        this.f26978e = null;
        this.f26979f = null;
        this.f26980g = null;
        this.f26981h = null;
        this.i = null;
        this.f26982j = null;
        this.f26983k = null;
        this.f26984l = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(100, this.f26974a)) {
            throw new IllegalStateException("The attribute name was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, this.f26975b)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(132, this.f26976c)) {
            throw new IllegalStateException("The attribute shouldShowRecive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(134, this.f26977d)) {
            throw new IllegalStateException("The attribute shouldShowSmallPoint was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(133, this.f26978e)) {
            throw new IllegalStateException("The attribute shouldShowShortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(54, this.f26979f)) {
            throw new IllegalStateException("The attribute isDeclined was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(140, this.f26980g)) {
            throw new IllegalStateException("The attribute sourceAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(29, this.f26981h)) {
            throw new IllegalStateException("The attribute destinationAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.i)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, this.f26982j)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(165, this.f26983k)) {
            throw new IllegalStateException("The attribute wayIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26984l)) {
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
        return "TransactionTopBindingModel_{name=" + this.f26974a + ", nameText=null, incoming=" + this.f26975b + ", shouldShowRecive=" + this.f26976c + ", shouldShowSmallPoint=" + this.f26977d + ", shouldShowShortName=" + this.f26978e + ", isDeclined=" + this.f26979f + ", sourceAmount=" + ((Object) this.f26980g) + ", destinationAmount=" + ((Object) this.f26981h) + ", date=" + this.i + ", shortName=" + this.f26982j + ", wayIconRes=" + this.f26983k + ", onClickAccount=" + this.f26984l + "}" + super.toString();
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
        if (!(epoxyModel instanceof q0)) {
            setDataBindingVariables(fVar);
            return;
        }
        q0 q0Var = (q0) epoxyModel;
        String str = this.f26974a;
        if (str == null ? q0Var.f26974a != null : !str.equals(q0Var.f26974a)) {
            fVar.m(100, this.f26974a);
        }
        q0Var.getClass();
        Boolean bool = this.f26975b;
        if (bool == null ? q0Var.f26975b != null : !bool.equals(q0Var.f26975b)) {
            fVar.m(46, this.f26975b);
        }
        Boolean bool2 = this.f26976c;
        if (bool2 == null ? q0Var.f26976c != null : !bool2.equals(q0Var.f26976c)) {
            fVar.m(132, this.f26976c);
        }
        Boolean bool3 = this.f26977d;
        if (bool3 == null ? q0Var.f26977d != null : !bool3.equals(q0Var.f26977d)) {
            fVar.m(134, this.f26977d);
        }
        Boolean bool4 = this.f26978e;
        if (bool4 == null ? q0Var.f26978e != null : !bool4.equals(q0Var.f26978e)) {
            fVar.m(133, this.f26978e);
        }
        Boolean bool5 = this.f26979f;
        if (bool5 == null ? q0Var.f26979f != null : !bool5.equals(q0Var.f26979f)) {
            fVar.m(54, this.f26979f);
        }
        SpannedString spannedString = this.f26980g;
        if (spannedString == null ? q0Var.f26980g != null : !spannedString.equals(q0Var.f26980g)) {
            fVar.m(140, this.f26980g);
        }
        SpannedString spannedString2 = this.f26981h;
        if (spannedString2 == null ? q0Var.f26981h != null : !spannedString2.equals(q0Var.f26981h)) {
            fVar.m(29, this.f26981h);
        }
        String str2 = this.i;
        if (str2 == null ? q0Var.i != null : !str2.equals(q0Var.i)) {
            fVar.m(24, this.i);
        }
        String str3 = this.f26982j;
        if (str3 == null ? q0Var.f26982j != null : !str3.equals(q0Var.f26982j)) {
            fVar.m(130, this.f26982j);
        }
        Integer num = this.f26983k;
        if (num == null ? q0Var.f26983k != null : !num.equals(q0Var.f26983k)) {
            fVar.m(165, this.f26983k);
        }
        View.OnClickListener onClickListener = this.f26984l;
        if ((onClickListener == null) != (q0Var.f26984l == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
