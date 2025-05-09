package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.luminary.mobile.R;
import q7.C1137c;
import q7.ViewOnClickListenerC1135a;
import q7.ViewOnClickListenerC1136b;

/* compiled from: ExchangeCryptoNewItemBindingModel_.java */
/* renamed from: s6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1232v extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public OnModelBoundListener<C1232v, DataBindingEpoxyModel.DataBindingHolder> f27018a;

    /* renamed from: b, reason: collision with root package name */
    public String f27019b;

    /* renamed from: c, reason: collision with root package name */
    public String f27020c;

    /* renamed from: d, reason: collision with root package name */
    public SpannedString f27021d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f27022e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f27023f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnClickListener f27024g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f27025h;
    public View.OnClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f27026j;

    public final C1232v a(SpannedString spannedString) {
        onMutation();
        this.f27021d = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1232v b(String str) {
        onMutation();
        this.f27020c = str;
        return this;
    }

    public final C1232v c(Integer num) {
        onMutation();
        this.f27022e = num;
        return this;
    }

    public final C1232v d(String str) {
        super.mo6id(str);
        return this;
    }

    public final C1232v e(Boolean bool) {
        onMutation();
        this.f27026j = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1232v) || !super.equals(obj)) {
            return false;
        }
        C1232v c1232v = (C1232v) obj;
        if ((this.f27018a == null) != (c1232v.f27018a == null)) {
            return false;
        }
        String str = this.f27019b;
        if (str == null ? c1232v.f27019b != null : !str.equals(c1232v.f27019b)) {
            return false;
        }
        String str2 = this.f27020c;
        if (str2 == null ? c1232v.f27020c != null : !str2.equals(c1232v.f27020c)) {
            return false;
        }
        SpannedString spannedString = this.f27021d;
        if (spannedString == null ? c1232v.f27021d != null : !spannedString.equals(c1232v.f27021d)) {
            return false;
        }
        Integer num = this.f27022e;
        if (num == null ? c1232v.f27022e != null : !num.equals(c1232v.f27022e)) {
            return false;
        }
        Boolean bool = this.f27023f;
        if (bool == null ? c1232v.f27023f != null : !bool.equals(c1232v.f27023f)) {
            return false;
        }
        if ((this.f27024g == null) != (c1232v.f27024g == null)) {
            return false;
        }
        if ((this.f27025h == null) != (c1232v.f27025h == null)) {
            return false;
        }
        if ((this.i == null) != (c1232v.i == null)) {
            return false;
        }
        Boolean bool2 = this.f27026j;
        Boolean bool3 = c1232v.f27026j;
        return bool2 == null ? bool3 == null : bool2.equals(bool3);
    }

    public final C1232v f() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f27023f = bool;
        return this;
    }

    public final C1232v g(String str) {
        onMutation();
        this.f27019b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_exchange_crypto_new_item;
    }

    public final C1232v h(C1137c c1137c) {
        onMutation();
        this.f27018a = c1137c;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePostBind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder2 = dataBindingHolder;
        OnModelBoundListener<C1232v, DataBindingEpoxyModel.DataBindingHolder> onModelBoundListener = this.f27018a;
        if (onModelBoundListener != null) {
            onModelBoundListener.onModelBound(this, dataBindingHolder2, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePreBind(EpoxyViewHolder epoxyViewHolder, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + (this.f27018a != null ? 1 : 0)) * 923521;
        String str = this.f27019b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27020c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 961;
        SpannedString spannedString = this.f27021d;
        int hashCode4 = (hashCode3 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        Integer num = this.f27022e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 961;
        Boolean bool = this.f27023f;
        int hashCode6 = (((((((hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f27024g != null ? 1 : 0)) * 31) + (this.f27025h != null ? 1 : 0)) * 31) + (this.i == null ? 0 : 1)) * 31;
        Boolean bool2 = this.f27026j;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1232v i(J7.b bVar) {
        onMutation();
        this.i = bVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1232v j(ViewOnClickListenerC1135a viewOnClickListenerC1135a) {
        onMutation();
        this.f27024g = viewOnClickListenerC1135a;
        return this;
    }

    public final C1232v k(ViewOnClickListenerC1136b viewOnClickListenerC1136b) {
        onMutation();
        this.f27025h = viewOnClickListenerC1136b;
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
        this.f27018a = null;
        this.f27019b = null;
        this.f27020c = null;
        this.f27021d = null;
        this.f27022e = null;
        this.f27023f = null;
        this.f27024g = null;
        this.f27025h = null;
        this.i = null;
        this.f27026j = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f27019b)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, this.f27020c)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(7, null)) {
            throw new IllegalStateException("The attribute amountText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f27021d)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f27022e)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, null)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(70, this.f27023f)) {
            throw new IllegalStateException("The attribute isRightVisible was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(112, this.f27024g)) {
            throw new IllegalStateException("The attribute onClickLeft was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(115, this.f27025h)) {
            throw new IllegalStateException("The attribute onClickRight was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(109, this.i)) {
            throw new IllegalStateException("The attribute onClickFrozen was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(59, this.f27026j)) {
            throw new IllegalStateException("The attribute isFrozen was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "ExchangeCryptoNewItemBindingModel_{nameText=" + this.f27019b + ", currency=" + this.f27020c + ", amountText=null, amount=" + ((Object) this.f27021d) + ", iconRes=" + this.f27022e + ", isEnabled=null, isRightVisible=" + this.f27023f + ", onClickLeft=" + this.f27024g + ", onClickRight=" + this.f27025h + ", onClickFrozen=" + this.i + ", isFrozen=" + this.f27026j + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1232v)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1232v c1232v = (C1232v) epoxyModel;
        String str = this.f27019b;
        if (str == null ? c1232v.f27019b != null : !str.equals(c1232v.f27019b)) {
            fVar.m(101, this.f27019b);
        }
        String str2 = this.f27020c;
        if (str2 == null ? c1232v.f27020c != null : !str2.equals(c1232v.f27020c)) {
            fVar.m(21, this.f27020c);
        }
        c1232v.getClass();
        SpannedString spannedString = this.f27021d;
        if (spannedString == null ? c1232v.f27021d != null : !spannedString.equals(c1232v.f27021d)) {
            fVar.m(3, this.f27021d);
        }
        Integer num = this.f27022e;
        if (num == null ? c1232v.f27022e != null : !num.equals(c1232v.f27022e)) {
            fVar.m(44, this.f27022e);
        }
        c1232v.getClass();
        Boolean bool = this.f27023f;
        if (bool == null ? c1232v.f27023f != null : !bool.equals(c1232v.f27023f)) {
            fVar.m(70, this.f27023f);
        }
        View.OnClickListener onClickListener = this.f27024g;
        if ((onClickListener == null) != (c1232v.f27024g == null)) {
            fVar.m(112, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f27025h;
        if ((onClickListener2 == null) != (c1232v.f27025h == null)) {
            fVar.m(115, onClickListener2);
        }
        View.OnClickListener onClickListener3 = this.i;
        if ((onClickListener3 == null) != (c1232v.i == null)) {
            fVar.m(109, onClickListener3);
        }
        Boolean bool2 = this.f27026j;
        Boolean bool3 = c1232v.f27026j;
        if (bool2 != null) {
            if (bool2.equals(bool3)) {
                return;
            }
        } else if (bool3 == null) {
            return;
        }
        fVar.m(59, this.f27026j);
    }
}
