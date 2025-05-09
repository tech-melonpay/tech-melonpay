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

/* compiled from: AccountDetailsTopBindingModel_.java */
/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1215d extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public OnModelBoundListener<C1215d, DataBindingEpoxyModel.DataBindingHolder> f26801a;

    /* renamed from: b, reason: collision with root package name */
    public String f26802b;

    /* renamed from: c, reason: collision with root package name */
    public String f26803c;

    /* renamed from: d, reason: collision with root package name */
    public SpannedString f26804d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26805e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26806f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26807g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f26808h;
    public View.OnClickListener i;

    public final C1215d a(SpannedString spannedString) {
        onMutation();
        this.f26804d = spannedString;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1215d b(String str) {
        onMutation();
        this.f26803c = str;
        return this;
    }

    public final C1215d c(Integer num) {
        onMutation();
        this.f26805e = num;
        return this;
    }

    public final C1215d d() {
        super.mo6id("top");
        return this;
    }

    public final C1215d e() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26806f = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1215d) || !super.equals(obj)) {
            return false;
        }
        C1215d c1215d = (C1215d) obj;
        if ((this.f26801a == null) != (c1215d.f26801a == null)) {
            return false;
        }
        String str = this.f26802b;
        if (str == null ? c1215d.f26802b != null : !str.equals(c1215d.f26802b)) {
            return false;
        }
        String str2 = this.f26803c;
        if (str2 == null ? c1215d.f26803c != null : !str2.equals(c1215d.f26803c)) {
            return false;
        }
        SpannedString spannedString = this.f26804d;
        if (spannedString == null ? c1215d.f26804d != null : !spannedString.equals(c1215d.f26804d)) {
            return false;
        }
        Integer num = this.f26805e;
        if (num == null ? c1215d.f26805e != null : !num.equals(c1215d.f26805e)) {
            return false;
        }
        Boolean bool = this.f26806f;
        if (bool == null ? c1215d.f26806f != null : !bool.equals(c1215d.f26806f)) {
            return false;
        }
        Boolean bool2 = this.f26807g;
        if (bool2 == null ? c1215d.f26807g != null : !bool2.equals(c1215d.f26807g)) {
            return false;
        }
        if ((this.f26808h == null) != (c1215d.f26808h == null)) {
            return false;
        }
        return (this.i == null) == (c1215d.i == null);
    }

    public final C1215d f() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26807g = bool;
        return this;
    }

    public final C1215d g(String str) {
        onMutation();
        this.f26802b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_account_details_top;
    }

    public final C1215d h(C.v vVar) {
        onMutation();
        this.f26801a = vVar;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void handlePostBind(DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder2 = dataBindingHolder;
        OnModelBoundListener<C1215d, DataBindingEpoxyModel.DataBindingHolder> onModelBoundListener = this.f26801a;
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
        int hashCode = ((super.hashCode() * 31) + (this.f26801a != null ? 1 : 0)) * 923521;
        String str = this.f26802b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26803c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        SpannedString spannedString = this.f26804d;
        int hashCode4 = (hashCode3 + (spannedString != null ? spannedString.hashCode() : 0)) * 31;
        Integer num = this.f26805e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26806f;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26807g;
        return ((((hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.f26808h != null ? 1 : 0)) * 31) + (this.i == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1215d i(D6.b bVar) {
        onMutation();
        this.f26808h = bVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1215d j(D6.b bVar) {
        onMutation();
        this.i = bVar;
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
        this.f26801a = null;
        this.f26802b = null;
        this.f26803c = null;
        this.f26804d = null;
        this.f26805e = null;
        this.f26806f = null;
        this.f26807g = null;
        this.f26808h = null;
        this.i = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26802b)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(21, this.f26803c)) {
            throw new IllegalStateException("The attribute currency was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(3, this.f26804d)) {
            throw new IllegalStateException("The attribute amount was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(44, this.f26805e)) {
            throw new IllegalStateException("The attribute iconRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f26806f)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(70, this.f26807g)) {
            throw new IllegalStateException("The attribute isRightVisible was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(112, this.f26808h)) {
            throw new IllegalStateException("The attribute onClickLeft was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(115, this.i)) {
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
        return "AccountDetailsTopBindingModel_{nameText=" + this.f26802b + ", currency=" + this.f26803c + ", amount=" + ((Object) this.f26804d) + ", iconRes=" + this.f26805e + ", isEnabled=" + this.f26806f + ", isRightVisible=" + this.f26807g + ", onClickLeft=" + this.f26808h + ", onClickRight=" + this.i + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1215d)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1215d c1215d = (C1215d) epoxyModel;
        String str = this.f26802b;
        if (str == null ? c1215d.f26802b != null : !str.equals(c1215d.f26802b)) {
            fVar.m(101, this.f26802b);
        }
        String str2 = this.f26803c;
        if (str2 == null ? c1215d.f26803c != null : !str2.equals(c1215d.f26803c)) {
            fVar.m(21, this.f26803c);
        }
        SpannedString spannedString = this.f26804d;
        if (spannedString == null ? c1215d.f26804d != null : !spannedString.equals(c1215d.f26804d)) {
            fVar.m(3, this.f26804d);
        }
        Integer num = this.f26805e;
        if (num == null ? c1215d.f26805e != null : !num.equals(c1215d.f26805e)) {
            fVar.m(44, this.f26805e);
        }
        Boolean bool = this.f26806f;
        if (bool == null ? c1215d.f26806f != null : !bool.equals(c1215d.f26806f)) {
            fVar.m(56, this.f26806f);
        }
        Boolean bool2 = this.f26807g;
        if (bool2 == null ? c1215d.f26807g != null : !bool2.equals(c1215d.f26807g)) {
            fVar.m(70, this.f26807g);
        }
        View.OnClickListener onClickListener = this.f26808h;
        if ((onClickListener == null) != (c1215d.f26808h == null)) {
            fVar.m(112, onClickListener);
        }
        View.OnClickListener onClickListener2 = this.i;
        if ((onClickListener2 == null) != (c1215d.i == null)) {
            fVar.m(115, onClickListener2);
        }
    }
}
