package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: TransactionMiddleBindingModel_.java */
/* loaded from: classes2.dex */
public final class p0 extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26959a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f26960b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26961c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26962d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26963e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26964f;

    /* renamed from: g, reason: collision with root package name */
    public SpannedString f26965g;

    /* renamed from: h, reason: collision with root package name */
    public SpannedString f26966h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f26967j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f26968k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f26969l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f26970m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f26971n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnClickListener f26972o;

    public final p0 a(Integer num) {
        onMutation();
        this.f26970m = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final p0 b(Integer num) {
        onMutation();
        this.f26969l = num;
        return this;
    }

    public final p0 c(String str) {
        onMutation();
        this.i = str;
        return this;
    }

    public final p0 d(SpannedString spannedString) {
        onMutation();
        this.f26966h = spannedString;
        return this;
    }

    public final p0 e(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0) || !super.equals(obj)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        String str = this.f26959a;
        if (str == null ? p0Var.f26959a != null : !str.equals(p0Var.f26959a)) {
            return false;
        }
        Boolean bool = this.f26960b;
        if (bool == null ? p0Var.f26960b != null : !bool.equals(p0Var.f26960b)) {
            return false;
        }
        Boolean bool2 = this.f26961c;
        if (bool2 == null ? p0Var.f26961c != null : !bool2.equals(p0Var.f26961c)) {
            return false;
        }
        Boolean bool3 = this.f26962d;
        if (bool3 == null ? p0Var.f26962d != null : !bool3.equals(p0Var.f26962d)) {
            return false;
        }
        Boolean bool4 = this.f26963e;
        if (bool4 == null ? p0Var.f26963e != null : !bool4.equals(p0Var.f26963e)) {
            return false;
        }
        Boolean bool5 = this.f26964f;
        if (bool5 == null ? p0Var.f26964f != null : !bool5.equals(p0Var.f26964f)) {
            return false;
        }
        SpannedString spannedString = this.f26965g;
        if (spannedString == null ? p0Var.f26965g != null : !spannedString.equals(p0Var.f26965g)) {
            return false;
        }
        SpannedString spannedString2 = this.f26966h;
        if (spannedString2 == null ? p0Var.f26966h != null : !spannedString2.equals(p0Var.f26966h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null ? p0Var.i != null : !str2.equals(p0Var.i)) {
            return false;
        }
        String str3 = this.f26967j;
        if (str3 == null ? p0Var.f26967j != null : !str3.equals(p0Var.f26967j)) {
            return false;
        }
        Integer num = this.f26968k;
        if (num == null ? p0Var.f26968k != null : !num.equals(p0Var.f26968k)) {
            return false;
        }
        Integer num2 = this.f26969l;
        if (num2 == null ? p0Var.f26969l != null : !num2.equals(p0Var.f26969l)) {
            return false;
        }
        Integer num3 = this.f26970m;
        if (num3 == null ? p0Var.f26970m != null : !num3.equals(p0Var.f26970m)) {
            return false;
        }
        Boolean bool6 = this.f26971n;
        if (bool6 == null ? p0Var.f26971n == null : bool6.equals(p0Var.f26971n)) {
            return (this.f26972o == null) == (p0Var.f26972o == null);
        }
        return false;
    }

    public final p0 f(Boolean bool) {
        onMutation();
        this.f26960b = bool;
        return this;
    }

    public final p0 g(Boolean bool) {
        onMutation();
        this.f26964f = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_transaction_middle;
    }

    public final p0 h(Boolean bool) {
        onMutation();
        this.f26971n = bool;
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
        String str = this.f26959a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        Boolean bool = this.f26960b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26961c;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f26962d;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f26963e;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f26964f;
        int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26965g;
        int hashCode8 = (hashCode7 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        SpannedString spannedString2 = this.f26966h;
        int hashCode9 = (hashCode8 + (spannedString2 != null ? spannedString2.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26967j;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f26968k;
        int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f26969l;
        int hashCode13 = (hashCode12 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f26970m;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool6 = this.f26971n;
        return ((hashCode14 + (bool6 != null ? bool6.hashCode() : 0)) * 31) + (this.f26972o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final p0 i(String str) {
        onMutation();
        this.f26959a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final p0 j(View.OnClickListener onClickListener) {
        onMutation();
        this.f26972o = onClickListener;
        return this;
    }

    public final p0 k(String str) {
        onMutation();
        this.f26967j = str;
        return this;
    }

    public final p0 l(Boolean bool) {
        onMutation();
        this.f26961c = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout */
    public final EpoxyModel mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    public final p0 m(Boolean bool) {
        onMutation();
        this.f26963e = bool;
        return this;
    }

    public final p0 n(Boolean bool) {
        onMutation();
        this.f26962d = bool;
        return this;
    }

    public final p0 o(SpannedString spannedString) {
        onMutation();
        this.f26965g = spannedString;
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

    public final p0 p(Integer num) {
        onMutation();
        this.f26968k = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: reset */
    public final EpoxyModel reset2() {
        this.f26959a = null;
        this.f26960b = null;
        this.f26961c = null;
        this.f26962d = null;
        this.f26963e = null;
        this.f26964f = null;
        this.f26965g = null;
        this.f26966h = null;
        this.i = null;
        this.f26967j = null;
        this.f26968k = null;
        this.f26969l = null;
        this.f26970m = null;
        this.f26971n = null;
        this.f26972o = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(100, this.f26959a)) {
            throw new IllegalStateException("The attribute name was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, this.f26960b)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(132, this.f26961c)) {
            throw new IllegalStateException("The attribute shouldShowRecive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(134, this.f26962d)) {
            throw new IllegalStateException("The attribute shouldShowSmallPoint was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(133, this.f26963e)) {
            throw new IllegalStateException("The attribute shouldShowShortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(54, this.f26964f)) {
            throw new IllegalStateException("The attribute isDeclined was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(140, this.f26965g)) {
            throw new IllegalStateException("The attribute sourceAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(29, this.f26966h)) {
            throw new IllegalStateException("The attribute destinationAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.i)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, this.f26967j)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(165, this.f26968k)) {
            throw new IllegalStateException("The attribute wayIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(22, this.f26969l)) {
            throw new IllegalStateException("The attribute currencyIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(11, this.f26970m)) {
            throw new IllegalStateException("The attribute backgroundResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(64, this.f26971n)) {
            throw new IllegalStateException("The attribute isLast was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f26972o)) {
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
        return "TransactionMiddleBindingModel_{name=" + this.f26959a + ", nameText=null, incoming=" + this.f26960b + ", shouldShowRecive=" + this.f26961c + ", shouldShowSmallPoint=" + this.f26962d + ", shouldShowShortName=" + this.f26963e + ", isDeclined=" + this.f26964f + ", sourceAmount=" + ((Object) this.f26965g) + ", destinationAmount=" + ((Object) this.f26966h) + ", date=" + this.i + ", shortName=" + this.f26967j + ", wayIconRes=" + this.f26968k + ", currencyIconRes=" + this.f26969l + ", backgroundResId=" + this.f26970m + ", isLast=" + this.f26971n + ", onClickAccount=" + this.f26972o + "}" + super.toString();
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
        if (!(epoxyModel instanceof p0)) {
            setDataBindingVariables(fVar);
            return;
        }
        p0 p0Var = (p0) epoxyModel;
        String str = this.f26959a;
        if (str == null ? p0Var.f26959a != null : !str.equals(p0Var.f26959a)) {
            fVar.m(100, this.f26959a);
        }
        p0Var.getClass();
        Boolean bool = this.f26960b;
        if (bool == null ? p0Var.f26960b != null : !bool.equals(p0Var.f26960b)) {
            fVar.m(46, this.f26960b);
        }
        Boolean bool2 = this.f26961c;
        if (bool2 == null ? p0Var.f26961c != null : !bool2.equals(p0Var.f26961c)) {
            fVar.m(132, this.f26961c);
        }
        Boolean bool3 = this.f26962d;
        if (bool3 == null ? p0Var.f26962d != null : !bool3.equals(p0Var.f26962d)) {
            fVar.m(134, this.f26962d);
        }
        Boolean bool4 = this.f26963e;
        if (bool4 == null ? p0Var.f26963e != null : !bool4.equals(p0Var.f26963e)) {
            fVar.m(133, this.f26963e);
        }
        Boolean bool5 = this.f26964f;
        if (bool5 == null ? p0Var.f26964f != null : !bool5.equals(p0Var.f26964f)) {
            fVar.m(54, this.f26964f);
        }
        SpannedString spannedString = this.f26965g;
        if (spannedString == null ? p0Var.f26965g != null : !spannedString.equals(p0Var.f26965g)) {
            fVar.m(140, this.f26965g);
        }
        SpannedString spannedString2 = this.f26966h;
        if (spannedString2 == null ? p0Var.f26966h != null : !spannedString2.equals(p0Var.f26966h)) {
            fVar.m(29, this.f26966h);
        }
        String str2 = this.i;
        if (str2 == null ? p0Var.i != null : !str2.equals(p0Var.i)) {
            fVar.m(24, this.i);
        }
        String str3 = this.f26967j;
        if (str3 == null ? p0Var.f26967j != null : !str3.equals(p0Var.f26967j)) {
            fVar.m(130, this.f26967j);
        }
        Integer num = this.f26968k;
        if (num == null ? p0Var.f26968k != null : !num.equals(p0Var.f26968k)) {
            fVar.m(165, this.f26968k);
        }
        Integer num2 = this.f26969l;
        if (num2 == null ? p0Var.f26969l != null : !num2.equals(p0Var.f26969l)) {
            fVar.m(22, this.f26969l);
        }
        Integer num3 = this.f26970m;
        if (num3 == null ? p0Var.f26970m != null : !num3.equals(p0Var.f26970m)) {
            fVar.m(11, this.f26970m);
        }
        Boolean bool6 = this.f26971n;
        if (bool6 == null ? p0Var.f26971n != null : !bool6.equals(p0Var.f26971n)) {
            fVar.m(64, this.f26971n);
        }
        View.OnClickListener onClickListener = this.f26972o;
        if ((onClickListener == null) != (p0Var.f26972o == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
