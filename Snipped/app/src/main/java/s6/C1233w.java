package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: ExchangeMiddleBindingModel_.java */
/* renamed from: s6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1233w extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f27027a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f27028b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f27029c;

    /* renamed from: d, reason: collision with root package name */
    public SpannedString f27030d;

    /* renamed from: e, reason: collision with root package name */
    public SpannedString f27031e;

    /* renamed from: f, reason: collision with root package name */
    public String f27032f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f27033g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f27034h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f27035j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f27036k;

    public final C1233w a(String str) {
        super.mo6id(str);
        return this;
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
        if (!(obj instanceof C1233w) || !super.equals(obj)) {
            return false;
        }
        C1233w c1233w = (C1233w) obj;
        c1233w.getClass();
        String str = this.f27027a;
        if (str == null ? c1233w.f27027a != null : !str.equals(c1233w.f27027a)) {
            return false;
        }
        Boolean bool = this.f27028b;
        if (bool == null ? c1233w.f27028b != null : !bool.equals(c1233w.f27028b)) {
            return false;
        }
        Boolean bool2 = this.f27029c;
        if (bool2 == null ? c1233w.f27029c != null : !bool2.equals(c1233w.f27029c)) {
            return false;
        }
        SpannedString spannedString = this.f27030d;
        if (spannedString == null ? c1233w.f27030d != null : !spannedString.equals(c1233w.f27030d)) {
            return false;
        }
        SpannedString spannedString2 = this.f27031e;
        if (spannedString2 == null ? c1233w.f27031e != null : !spannedString2.equals(c1233w.f27031e)) {
            return false;
        }
        String str2 = this.f27032f;
        if (str2 == null ? c1233w.f27032f != null : !str2.equals(c1233w.f27032f)) {
            return false;
        }
        Integer num = this.f27033g;
        if (num == null ? c1233w.f27033g != null : !num.equals(c1233w.f27033g)) {
            return false;
        }
        Integer num2 = this.f27034h;
        if (num2 == null ? c1233w.f27034h != null : !num2.equals(c1233w.f27034h)) {
            return false;
        }
        Integer num3 = this.i;
        if (num3 == null ? c1233w.i != null : !num3.equals(c1233w.i)) {
            return false;
        }
        Boolean bool3 = this.f27035j;
        if (bool3 == null ? c1233w.f27035j == null : bool3.equals(c1233w.f27035j)) {
            return (this.f27036k == null) == (c1233w.f27036k == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_exchange_middle;
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
        String str = this.f27027a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 29791;
        Boolean bool = this.f27028b;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 29791;
        Boolean bool2 = this.f27029c;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f27030d;
        int hashCode5 = (hashCode4 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        SpannedString spannedString2 = this.f27031e;
        int hashCode6 = (hashCode5 + (spannedString2 != null ? spannedString2.hashCode() : 0)) * 31;
        String str2 = this.f27032f;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 961;
        Integer num = this.f27033g;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f27034h;
        int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.i;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f27035j;
        return ((hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + (this.f27036k != null ? 1 : 0);
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
        this.f27027a = null;
        this.f27028b = null;
        this.f27029c = null;
        this.f27030d = null;
        this.f27031e = null;
        this.f27032f = null;
        this.f27033g = null;
        this.f27034h = null;
        this.i = null;
        this.f27035j = null;
        this.f27036k = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(100, this.f27027a)) {
            throw new IllegalStateException("The attribute name was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(46, null)) {
            throw new IllegalStateException("The attribute incoming was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(132, this.f27028b)) {
            throw new IllegalStateException("The attribute shouldShowRecive was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(134, null)) {
            throw new IllegalStateException("The attribute shouldShowSmallPoint was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(133, null)) {
            throw new IllegalStateException("The attribute shouldShowShortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(54, this.f27029c)) {
            throw new IllegalStateException("The attribute isDeclined was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(140, this.f27030d)) {
            throw new IllegalStateException("The attribute sourceAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(29, this.f27031e)) {
            throw new IllegalStateException("The attribute destinationAmount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(24, this.f27032f)) {
            throw new IllegalStateException("The attribute date was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(130, null)) {
            throw new IllegalStateException("The attribute shortName was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(22, this.f27033g)) {
            throw new IllegalStateException("The attribute currencyIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(142, this.f27034h)) {
            throw new IllegalStateException("The attribute statusIconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(11, this.i)) {
            throw new IllegalStateException("The attribute backgroundResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(64, this.f27035j)) {
            throw new IllegalStateException("The attribute isLast was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(105, this.f27036k)) {
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
        return "ExchangeMiddleBindingModel_{name=" + this.f27027a + ", nameText=null, incoming=null, shouldShowRecive=" + this.f27028b + ", shouldShowSmallPoint=null, shouldShowShortName=null, isDeclined=" + this.f27029c + ", sourceAmount=" + ((Object) this.f27030d) + ", destinationAmount=" + ((Object) this.f27031e) + ", date=" + this.f27032f + ", shortName=null, currencyIconRes=" + this.f27033g + ", statusIconRes=" + this.f27034h + ", backgroundResId=" + this.i + ", isLast=" + this.f27035j + ", onClickAccount=" + this.f27036k + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1233w)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1233w c1233w = (C1233w) epoxyModel;
        String str = this.f27027a;
        if (str == null ? c1233w.f27027a != null : !str.equals(c1233w.f27027a)) {
            fVar.m(100, this.f27027a);
        }
        c1233w.getClass();
        c1233w.getClass();
        Boolean bool = this.f27028b;
        if (bool == null ? c1233w.f27028b != null : !bool.equals(c1233w.f27028b)) {
            fVar.m(132, this.f27028b);
        }
        c1233w.getClass();
        c1233w.getClass();
        Boolean bool2 = this.f27029c;
        if (bool2 == null ? c1233w.f27029c != null : !bool2.equals(c1233w.f27029c)) {
            fVar.m(54, this.f27029c);
        }
        SpannedString spannedString = this.f27030d;
        if (spannedString == null ? c1233w.f27030d != null : !spannedString.equals(c1233w.f27030d)) {
            fVar.m(140, this.f27030d);
        }
        SpannedString spannedString2 = this.f27031e;
        if (spannedString2 == null ? c1233w.f27031e != null : !spannedString2.equals(c1233w.f27031e)) {
            fVar.m(29, this.f27031e);
        }
        String str2 = this.f27032f;
        if (str2 == null ? c1233w.f27032f != null : !str2.equals(c1233w.f27032f)) {
            fVar.m(24, this.f27032f);
        }
        c1233w.getClass();
        Integer num = this.f27033g;
        if (num == null ? c1233w.f27033g != null : !num.equals(c1233w.f27033g)) {
            fVar.m(22, this.f27033g);
        }
        Integer num2 = this.f27034h;
        if (num2 == null ? c1233w.f27034h != null : !num2.equals(c1233w.f27034h)) {
            fVar.m(142, this.f27034h);
        }
        Integer num3 = this.i;
        if (num3 == null ? c1233w.i != null : !num3.equals(c1233w.i)) {
            fVar.m(11, this.i);
        }
        Boolean bool3 = this.f27035j;
        if (bool3 == null ? c1233w.f27035j != null : !bool3.equals(c1233w.f27035j)) {
            fVar.m(64, this.f27035j);
        }
        View.OnClickListener onClickListener = this.f27036k;
        if ((onClickListener == null) != (c1233w.f27036k == null)) {
            fVar.m(105, onClickListener);
        }
    }
}
