package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: CryptoWalletBindingModel_.java */
/* loaded from: classes2.dex */
public final class r extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26985a;

    /* renamed from: b, reason: collision with root package name */
    public String f26986b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26987c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26988d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f26989e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnClickListener f26990f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f26991g;

    /* renamed from: h, reason: collision with root package name */
    public String f26992h;

    public final r a(String str) {
        onMutation();
        this.f26992h = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final r b(String str) {
        super.mo6id(str);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r) || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        rVar.getClass();
        String str = this.f26985a;
        if (str == null ? rVar.f26985a != null : !str.equals(rVar.f26985a)) {
            return false;
        }
        String str2 = this.f26986b;
        if (str2 == null ? rVar.f26986b != null : !str2.equals(rVar.f26986b)) {
            return false;
        }
        Integer num = this.f26987c;
        if (num == null ? rVar.f26987c != null : !num.equals(rVar.f26987c)) {
            return false;
        }
        Boolean bool = this.f26988d;
        if (bool == null ? rVar.f26988d != null : !bool.equals(rVar.f26988d)) {
            return false;
        }
        Integer num2 = this.f26989e;
        if (num2 == null ? rVar.f26989e != null : !num2.equals(rVar.f26989e)) {
            return false;
        }
        if ((this.f26990f == null) != (rVar.f26990f == null)) {
            return false;
        }
        Boolean bool2 = this.f26991g;
        if (bool2 == null ? rVar.f26991g != null : !bool2.equals(rVar.f26991g)) {
            return false;
        }
        String str3 = this.f26992h;
        String str4 = rVar.f26992h;
        return str3 == null ? str4 == null : str3.equals(str4);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_crypto_wallet;
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
        String str = this.f26985a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26986b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f26987c;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f26988d;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.f26989e;
        int hashCode6 = (((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 29791) + (this.f26990f != null ? 1 : 0)) * 31;
        Boolean bool2 = this.f26991g;
        int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str3 = this.f26992h;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
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
        this.f26985a = null;
        this.f26986b = null;
        this.f26987c = null;
        this.f26988d = null;
        this.f26989e = null;
        this.f26990f = null;
        this.f26991g = null;
        this.f26992h = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(148, this.f26985a)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(25, this.f26986b)) {
            throw new IllegalStateException("The attribute description was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(9, this.f26987c)) {
            throw new IllegalStateException("The attribute background was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(32, this.f26988d)) {
            throw new IllegalStateException("The attribute enabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(43, this.f26989e)) {
            throw new IllegalStateException("The attribute icon was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(166, null)) {
            throw new IllegalStateException("The attribute width was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(40, null)) {
            throw new IllegalStateException("The attribute height was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.f26990f)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(59, this.f26991g)) {
            throw new IllegalStateException("The attribute isFrozen was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(35, this.f26992h)) {
            throw new IllegalStateException("The attribute frozenInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "CryptoWalletBindingModel_{title=" + this.f26985a + ", description=" + this.f26986b + ", background=" + this.f26987c + ", enabled=" + this.f26988d + ", icon=" + this.f26989e + ", width=null, height=null, onClick=" + this.f26990f + ", isFrozen=" + this.f26991g + ", frozenInfo=" + this.f26992h + "}" + super.toString();
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
        if (!(epoxyModel instanceof r)) {
            setDataBindingVariables(fVar);
            return;
        }
        r rVar = (r) epoxyModel;
        String str = this.f26985a;
        if (str == null ? rVar.f26985a != null : !str.equals(rVar.f26985a)) {
            fVar.m(148, this.f26985a);
        }
        String str2 = this.f26986b;
        if (str2 == null ? rVar.f26986b != null : !str2.equals(rVar.f26986b)) {
            fVar.m(25, this.f26986b);
        }
        Integer num = this.f26987c;
        if (num == null ? rVar.f26987c != null : !num.equals(rVar.f26987c)) {
            fVar.m(9, this.f26987c);
        }
        Boolean bool = this.f26988d;
        if (bool == null ? rVar.f26988d != null : !bool.equals(rVar.f26988d)) {
            fVar.m(32, this.f26988d);
        }
        Integer num2 = this.f26989e;
        if (num2 == null ? rVar.f26989e != null : !num2.equals(rVar.f26989e)) {
            fVar.m(43, this.f26989e);
        }
        rVar.getClass();
        rVar.getClass();
        View.OnClickListener onClickListener = this.f26990f;
        if ((onClickListener == null) != (rVar.f26990f == null)) {
            fVar.m(104, onClickListener);
        }
        Boolean bool2 = this.f26991g;
        if (bool2 == null ? rVar.f26991g != null : !bool2.equals(rVar.f26991g)) {
            fVar.m(59, this.f26991g);
        }
        String str3 = this.f26992h;
        String str4 = rVar.f26992h;
        if (str3 != null) {
            if (str3.equals(str4)) {
                return;
            }
        } else if (str4 == null) {
            return;
        }
        fVar.m(35, this.f26992h);
    }
}
