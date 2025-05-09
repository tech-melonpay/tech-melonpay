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

/* compiled from: AccountCryptoDetailsTopBindingModel_.java */
/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1214c extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public OnModelBoundListener<C1214c, DataBindingEpoxyModel.DataBindingHolder> f26787a;

    /* renamed from: b, reason: collision with root package name */
    public String f26788b;

    /* renamed from: c, reason: collision with root package name */
    public SpannedString f26789c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f26790d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26791e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26792f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnClickListener f26793g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26794h;
    public View.OnClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f26795j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f26796k;

    public final C1214c a(SpannedString spannedString) {
        onMutation();
        this.f26789c = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1214c b(Integer num) {
        onMutation();
        this.f26790d = num;
        return this;
    }

    public final C1214c c() {
        super.mo6id("top");
        return this;
    }

    public final C1214c d() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f26792f = bool;
        return this;
    }

    public final C1214c e() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26791e = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1214c) || !super.equals(obj)) {
            return false;
        }
        C1214c c1214c = (C1214c) obj;
        if ((this.f26787a == null) != (c1214c.f26787a == null)) {
            return false;
        }
        String str = this.f26788b;
        if (str == null ? c1214c.f26788b != null : !str.equals(c1214c.f26788b)) {
            return false;
        }
        SpannedString spannedString = this.f26789c;
        if (spannedString == null ? c1214c.f26789c != null : !spannedString.equals(c1214c.f26789c)) {
            return false;
        }
        Integer num = this.f26790d;
        if (num == null ? c1214c.f26790d != null : !num.equals(c1214c.f26790d)) {
            return false;
        }
        Boolean bool = this.f26791e;
        if (bool == null ? c1214c.f26791e != null : !bool.equals(c1214c.f26791e)) {
            return false;
        }
        Boolean bool2 = this.f26792f;
        if (bool2 == null ? c1214c.f26792f != null : !bool2.equals(c1214c.f26792f)) {
            return false;
        }
        if ((this.f26793g == null) != (c1214c.f26793g == null)) {
            return false;
        }
        if ((this.f26794h == null) != (c1214c.f26794h == null)) {
            return false;
        }
        if ((this.i == null) != (c1214c.i == null)) {
            return false;
        }
        if ((this.f26795j == null) != (c1214c.f26795j == null)) {
            return false;
        }
        return (this.f26796k == null) == (c1214c.f26796k == null);
    }

    public final C1214c f(String str) {
        onMutation();
        this.f26788b = str;
        return this;
    }

    public final C1214c g(com.sumsub.sns.geo.presentation.d dVar) {
        onMutation();
        this.f26787a = dVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_account_crypto_details_top;
    }

    public final C1214c h(l7.a aVar) {
        onMutation();
        this.i = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePostBind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder2 = dataBindingHolder;
        OnModelBoundListener<C1214c, DataBindingEpoxyModel.DataBindingHolder> onModelBoundListener = this.f26787a;
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
        int hashCode = ((super.hashCode() * 31) + (this.f26787a != null ? 1 : 0)) * 923521;
        String str = this.f26788b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26789c;
        int hashCode3 = (hashCode2 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        Integer num = this.f26790d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26791e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 961;
        Boolean bool2 = this.f26792f;
        return ((((((((((hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.f26793g != null ? 1 : 0)) * 31) + (this.f26794h != null ? 1 : 0)) * 31) + (this.i != null ? 1 : 0)) * 31) + (this.f26795j != null ? 1 : 0)) * 31) + (this.f26796k == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1214c i(l7.a aVar) {
        onMutation();
        this.f26793g = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1214c j(l7.b bVar) {
        onMutation();
        this.f26794h = bVar;
        return this;
    }

    public final C1214c k(l7.a aVar) {
        onMutation();
        this.f26796k = aVar;
        return this;
    }

    public final C1214c l(l7.b bVar) {
        onMutation();
        this.f26795j = bVar;
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
        this.f26787a = null;
        this.f26788b = null;
        this.f26789c = null;
        this.f26790d = null;
        this.f26791e = null;
        this.f26792f = null;
        this.f26793g = null;
        this.f26794h = null;
        this.i = null;
        this.f26795j = null;
        this.f26796k = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26788b)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26789c)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f26790d)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(72, this.f26791e)) {
            throw new IllegalStateException("The attribute isSellEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(83, null)) {
            throw new IllegalStateException("The attribute isWithdrawEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(70, this.f26792f)) {
            throw new IllegalStateException("The attribute isRightVisible was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(112, this.f26793g)) {
            throw new IllegalStateException("The attribute onClickLeft was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(115, this.f26794h)) {
            throw new IllegalStateException("The attribute onClickRight was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(108, this.i)) {
            throw new IllegalStateException("The attribute onClickDeposit was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(117, this.f26795j)) {
            throw new IllegalStateException("The attribute onClickWithdraw was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(116, this.f26796k)) {
            throw new IllegalStateException("The attribute onClickUnfreeze was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "AccountCryptoDetailsTopBindingModel_{nameText=" + this.f26788b + ", amount=" + ((Object) this.f26789c) + ", iconRes=" + this.f26790d + ", isSellEnabled=" + this.f26791e + ", isWithdrawEnabled=null, isRightVisible=" + this.f26792f + ", onClickLeft=" + this.f26793g + ", onClickRight=" + this.f26794h + ", onClickDeposit=" + this.i + ", onClickWithdraw=" + this.f26795j + ", onClickUnfreeze=" + this.f26796k + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1214c)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1214c c1214c = (C1214c) epoxyModel;
        String str = this.f26788b;
        if (str == null ? c1214c.f26788b != null : !str.equals(c1214c.f26788b)) {
            fVar.m(101, this.f26788b);
        }
        SpannedString spannedString = this.f26789c;
        if (spannedString == null ? c1214c.f26789c != null : !spannedString.equals(c1214c.f26789c)) {
            fVar.m(3, this.f26789c);
        }
        Integer num = this.f26790d;
        if (num == null ? c1214c.f26790d != null : !num.equals(c1214c.f26790d)) {
            fVar.m(44, this.f26790d);
        }
        Boolean bool = this.f26791e;
        if (bool == null ? c1214c.f26791e != null : !bool.equals(c1214c.f26791e)) {
            fVar.m(72, this.f26791e);
        }
        c1214c.getClass();
        Boolean bool2 = this.f26792f;
        if (bool2 == null ? c1214c.f26792f != null : !bool2.equals(c1214c.f26792f)) {
            fVar.m(70, this.f26792f);
        }
        View.OnClickListener onClickListener = this.f26793g;
        if ((onClickListener == null) != (c1214c.f26793g == null)) {
            fVar.m(112, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f26794h;
        if ((onClickListener2 == null) != (c1214c.f26794h == null)) {
            fVar.m(115, onClickListener2);
        }
        View.OnClickListener onClickListener3 = this.i;
        if ((onClickListener3 == null) != (c1214c.i == null)) {
            fVar.m(108, onClickListener3);
        }
        View.OnClickListener onClickListener4 = this.f26795j;
        if ((onClickListener4 == null) != (c1214c.f26795j == null)) {
            fVar.m(117, onClickListener4);
        }
        View.OnClickListener onClickListener5 = this.f26796k;
        if ((onClickListener5 == null) != (c1214c.f26796k == null)) {
            fVar.m(116, onClickListener5);
        }
    }
}
