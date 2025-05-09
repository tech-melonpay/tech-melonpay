package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: InvoicesMiddleBindingModel_.java */
/* renamed from: s6.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1208C extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26662a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26663b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26664c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26665d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26666e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26667f;

    /* renamed from: g, reason: collision with root package name */
    public SpannedString f26668g;

    /* renamed from: h, reason: collision with root package name */
    public SpannedString f26669h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f26670j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f26671k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f26672l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f26673m;

    /* renamed from: n, reason: collision with root package name */
    public View.OnClickListener f26674n;

    public final C1208C a(Integer num) {
        onMutation();
        this.f26671k = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1208C b(String str) {
        onMutation();
        this.i = str;
        return this;
    }

    public final C1208C c(SpannedString spannedString) {
        onMutation();
        this.f26669h = spannedString;
        return this;
    }

    public final C1208C d(String str) {
        super.mo6id(str);
        return this;
    }

    public final C1208C e(Boolean bool) {
        onMutation();
        this.f26663b = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1208C) || !super.equals(obj)) {
            return false;
        }
        C1208C c1208c = (C1208C) obj;
        c1208c.getClass();
        String str = this.f26662a;
        if (str == null ? c1208c.f26662a != null : !str.equals(c1208c.f26662a)) {
            return false;
        }
        Boolean bool = this.f26663b;
        if (bool == null ? c1208c.f26663b != null : !bool.equals(c1208c.f26663b)) {
            return false;
        }
        Boolean bool2 = this.f26664c;
        if (bool2 == null ? c1208c.f26664c != null : !bool2.equals(c1208c.f26664c)) {
            return false;
        }
        Boolean bool3 = this.f26665d;
        if (bool3 == null ? c1208c.f26665d != null : !bool3.equals(c1208c.f26665d)) {
            return false;
        }
        Boolean bool4 = this.f26666e;
        if (bool4 == null ? c1208c.f26666e != null : !bool4.equals(c1208c.f26666e)) {
            return false;
        }
        Boolean bool5 = this.f26667f;
        if (bool5 == null ? c1208c.f26667f != null : !bool5.equals(c1208c.f26667f)) {
            return false;
        }
        SpannedString spannedString = this.f26668g;
        if (spannedString == null ? c1208c.f26668g != null : !spannedString.equals(c1208c.f26668g)) {
            return false;
        }
        SpannedString spannedString2 = this.f26669h;
        if (spannedString2 == null ? c1208c.f26669h != null : !spannedString2.equals(c1208c.f26669h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null ? c1208c.i != null : !str2.equals(c1208c.i)) {
            return false;
        }
        String str3 = this.f26670j;
        if (str3 == null ? c1208c.f26670j != null : !str3.equals(c1208c.f26670j)) {
            return false;
        }
        Integer num = this.f26671k;
        if (num == null ? c1208c.f26671k != null : !num.equals(c1208c.f26671k)) {
            return false;
        }
        Boolean bool6 = this.f26672l;
        if (bool6 == null ? c1208c.f26672l != null : !bool6.equals(c1208c.f26672l)) {
            return false;
        }
        Integer num2 = this.f26673m;
        if (num2 == null ? c1208c.f26673m == null : num2.equals(c1208c.f26673m)) {
            return (this.f26674n == null) == (c1208c.f26674n == null);
        }
        return false;
    }

    public final C1208C f(Boolean bool) {
        onMutation();
        this.f26667f = bool;
        return this;
    }

    public final C1208C g(Boolean bool) {
        onMutation();
        this.f26672l = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_invoices_middle;
    }

    public final C1208C h(String str) {
        onMutation();
        this.f26662a = str;
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
        String str = this.f26662a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        Boolean bool = this.f26663b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26664c;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26665d;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26666e;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f26667f;
        int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26668g;
        int hashCode8 = (hashCode7 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        SpannedString spannedString2 = this.f26669h;
        int hashCode9 = (hashCode8 + (spannedString2 != null ? spannedString2.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26670j;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26671k;
        int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool6 = this.f26672l;
        int hashCode13 = (hashCode12 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Integer num2 = this.f26673m;
        return ((hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.f26674n != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1208C i(B7.f fVar) {
        onMutation();
        this.f26674n = fVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1208C j(String str) {
        onMutation();
        this.f26670j = str;
        return this;
    }

    public final C1208C k() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26664c = bool;
        return this;
    }

    public final C1208C l(Boolean bool) {
        onMutation();
        this.f26666e = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    public final C1208C m(Boolean bool) {
        onMutation();
        this.f26665d = bool;
        return this;
    }

    public final C1208C n(SpannedString spannedString) {
        onMutation();
        this.f26668g = spannedString;
        return this;
    }

    public final C1208C o(Integer num) {
        onMutation();
        this.f26673m = num;
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
        this.f26662a = null;
        this.f26663b = null;
        this.f26664c = null;
        this.f26665d = null;
        this.f26666e = null;
        this.f26667f = null;
        this.f26668g = null;
        this.f26669h = null;
        this.i = null;
        this.f26670j = null;
        this.f26671k = null;
        this.f26672l = null;
        this.f26673m = null;
        this.f26674n = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(100, this.f26662a)) {
            throw new IllegalStateException("The attribute name was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, this.f26663b)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(132, this.f26664c)) {
            throw new IllegalStateException("The attribute shouldShowRecive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(134, this.f26665d)) {
            throw new IllegalStateException("The attribute shouldShowSmallPoint was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(133, this.f26666e)) {
            throw new IllegalStateException("The attribute shouldShowShortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(54, this.f26667f)) {
            throw new IllegalStateException("The attribute isDeclined was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(140, this.f26668g)) {
            throw new IllegalStateException("The attribute sourceAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(29, this.f26669h)) {
            throw new IllegalStateException("The attribute destinationAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.i)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, this.f26670j)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(11, this.f26671k)) {
            throw new IllegalStateException("The attribute backgroundResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(64, this.f26672l)) {
            throw new IllegalStateException("The attribute isLast was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(165, this.f26673m)) {
            throw new IllegalStateException("The attribute wayIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26674n)) {
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
        return "InvoicesMiddleBindingModel_{name=" + this.f26662a + ", nameText=null, incoming=" + this.f26663b + ", shouldShowRecive=" + this.f26664c + ", shouldShowSmallPoint=" + this.f26665d + ", shouldShowShortName=" + this.f26666e + ", isDeclined=" + this.f26667f + ", sourceAmount=" + ((Object) this.f26668g) + ", destinationAmount=" + ((Object) this.f26669h) + ", date=" + this.i + ", shortName=" + this.f26670j + ", backgroundResId=" + this.f26671k + ", isLast=" + this.f26672l + ", wayIconRes=" + this.f26673m + ", onClickAccount=" + this.f26674n + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1208C)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1208C c1208c = (C1208C) epoxyModel;
        String str = this.f26662a;
        if (str == null ? c1208c.f26662a != null : !str.equals(c1208c.f26662a)) {
            fVar.m(100, this.f26662a);
        }
        c1208c.getClass();
        Boolean bool = this.f26663b;
        if (bool == null ? c1208c.f26663b != null : !bool.equals(c1208c.f26663b)) {
            fVar.m(46, this.f26663b);
        }
        Boolean bool2 = this.f26664c;
        if (bool2 == null ? c1208c.f26664c != null : !bool2.equals(c1208c.f26664c)) {
            fVar.m(132, this.f26664c);
        }
        Boolean bool3 = this.f26665d;
        if (bool3 == null ? c1208c.f26665d != null : !bool3.equals(c1208c.f26665d)) {
            fVar.m(134, this.f26665d);
        }
        Boolean bool4 = this.f26666e;
        if (bool4 == null ? c1208c.f26666e != null : !bool4.equals(c1208c.f26666e)) {
            fVar.m(133, this.f26666e);
        }
        Boolean bool5 = this.f26667f;
        if (bool5 == null ? c1208c.f26667f != null : !bool5.equals(c1208c.f26667f)) {
            fVar.m(54, this.f26667f);
        }
        SpannedString spannedString = this.f26668g;
        if (spannedString == null ? c1208c.f26668g != null : !spannedString.equals(c1208c.f26668g)) {
            fVar.m(140, this.f26668g);
        }
        SpannedString spannedString2 = this.f26669h;
        if (spannedString2 == null ? c1208c.f26669h != null : !spannedString2.equals(c1208c.f26669h)) {
            fVar.m(29, this.f26669h);
        }
        String str2 = this.i;
        if (str2 == null ? c1208c.i != null : !str2.equals(c1208c.i)) {
            fVar.m(24, this.i);
        }
        String str3 = this.f26670j;
        if (str3 == null ? c1208c.f26670j != null : !str3.equals(c1208c.f26670j)) {
            fVar.m(130, this.f26670j);
        }
        Integer num = this.f26671k;
        if (num == null ? c1208c.f26671k != null : !num.equals(c1208c.f26671k)) {
            fVar.m(11, this.f26671k);
        }
        Boolean bool6 = this.f26672l;
        if (bool6 == null ? c1208c.f26672l != null : !bool6.equals(c1208c.f26672l)) {
            fVar.m(64, this.f26672l);
        }
        Integer num2 = this.f26673m;
        if (num2 == null ? c1208c.f26673m != null : !num2.equals(c1208c.f26673m)) {
            fVar.m(165, this.f26673m);
        }
        View.OnClickListener onClickListener = this.f26674n;
        if ((onClickListener == null) != (c1208c.f26674n == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
