package s6;

import android.text.SpannedString;
import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;
import q7.ViewOnClickListenerC1138d;

/* compiled from: ExchangeCryptoActionRequiredItemBindingModel_.java */
/* renamed from: s6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1231u extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f27011a;

    /* renamed from: b, reason: collision with root package name */
    public SpannedString f27012b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f27013c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f27014d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f27015e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnClickListener f27016f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnClickListener f27017g;

    public final C1231u a(SpannedString spannedString) {
        onMutation();
        this.f27012b = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1231u b(String str) {
        onMutation();
        this.f27011a = str;
        return this;
    }

    public final C1231u c(Integer num) {
        onMutation();
        this.f27013c = num;
        return this;
    }

    public final C1231u d(String str) {
        super.mo6id(str);
        return this;
    }

    public final C1231u e() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f27014d = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1231u) || !super.equals(obj)) {
            return false;
        }
        C1231u c1231u = (C1231u) obj;
        c1231u.getClass();
        String str = this.f27011a;
        if (str == null ? c1231u.f27011a != null : !str.equals(c1231u.f27011a)) {
            return false;
        }
        SpannedString spannedString = this.f27012b;
        if (spannedString == null ? c1231u.f27012b != null : !spannedString.equals(c1231u.f27012b)) {
            return false;
        }
        Integer num = this.f27013c;
        if (num == null ? c1231u.f27013c != null : !num.equals(c1231u.f27013c)) {
            return false;
        }
        Boolean bool = this.f27014d;
        if (bool == null ? c1231u.f27014d != null : !bool.equals(c1231u.f27014d)) {
            return false;
        }
        Boolean bool2 = this.f27015e;
        if (bool2 == null ? c1231u.f27015e != null : !bool2.equals(c1231u.f27015e)) {
            return false;
        }
        if ((this.f27016f == null) != (c1231u.f27016f == null)) {
            return false;
        }
        return (this.f27017g == null) == (c1231u.f27017g == null);
    }

    public final C1231u f() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f27015e = bool;
        return this;
    }

    public final C1231u g(ViewOnClickListenerC1138d viewOnClickListenerC1138d) {
        onMutation();
        this.f27016f = viewOnClickListenerC1138d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_exchange_crypto_action_required_item;
    }

    public final C1231u h(ViewOnClickListenerC1138d viewOnClickListenerC1138d) {
        onMutation();
        this.f27017g = viewOnClickListenerC1138d;
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
        int hashCode = super.hashCode() * 887503681;
        String str = this.f27011a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 961;
        SpannedString spannedString = this.f27012b;
        int hashCode3 = (hashCode2 + (spannedString != null ? spannedString.hashCode() : 0)) * 961;
        Integer num = this.f27013c;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f27014d;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f27015e;
        return ((((hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.f27016f != null ? 1 : 0)) * 31) + (this.f27017g != null ? 1 : 0);
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
        this.f27011a = null;
        this.f27012b = null;
        this.f27013c = null;
        this.f27014d = null;
        this.f27015e = null;
        this.f27016f = null;
        this.f27017g = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, null)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, this.f27011a)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(7, null)) {
            throw new IllegalStateException("The attribute amountText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f27012b)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(4, null)) {
            throw new IllegalStateException("The attribute amountD was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f27013c)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f27014d)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(70, this.f27015e)) {
            throw new IllegalStateException("The attribute isRightVisible was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(112, this.f27016f)) {
            throw new IllegalStateException("The attribute onClickLeft was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(115, this.f27017g)) {
            throw new IllegalStateException("The attribute onClickRight was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "ExchangeCryptoActionRequiredItemBindingModel_{nameText=null, currency=" + this.f27011a + ", amountText=null, amount=" + ((Object) this.f27012b) + ", amountD=null, iconRes=" + this.f27013c + ", isEnabled=" + this.f27014d + ", isRightVisible=" + this.f27015e + ", onClickLeft=" + this.f27016f + ", onClickRight=" + this.f27017g + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1231u)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1231u c1231u = (C1231u) epoxyModel;
        c1231u.getClass();
        String str = this.f27011a;
        if (str == null ? c1231u.f27011a != null : !str.equals(c1231u.f27011a)) {
            fVar.m(21, this.f27011a);
        }
        c1231u.getClass();
        SpannedString spannedString = this.f27012b;
        if (spannedString == null ? c1231u.f27012b != null : !spannedString.equals(c1231u.f27012b)) {
            fVar.m(3, this.f27012b);
        }
        c1231u.getClass();
        Integer num = this.f27013c;
        if (num == null ? c1231u.f27013c != null : !num.equals(c1231u.f27013c)) {
            fVar.m(44, this.f27013c);
        }
        Boolean bool = this.f27014d;
        if (bool == null ? c1231u.f27014d != null : !bool.equals(c1231u.f27014d)) {
            fVar.m(56, this.f27014d);
        }
        Boolean bool2 = this.f27015e;
        if (bool2 == null ? c1231u.f27015e != null : !bool2.equals(c1231u.f27015e)) {
            fVar.m(70, this.f27015e);
        }
        View.OnClickListener onClickListener = this.f27016f;
        if ((onClickListener == null) != (c1231u.f27016f == null)) {
            fVar.m(112, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f27017g;
        if ((onClickListener2 == null) != (c1231u.f27017g == null)) {
            fVar.m(115, onClickListener2);
        }
    }
}
