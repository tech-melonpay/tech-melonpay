package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: HubCardBindingModel_.java */
/* renamed from: s6.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1206A extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26649a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f26650b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f26651c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f26652d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26653e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f26654f;

    public final C1206A a(Integer num) {
        onMutation();
        this.f26651c = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1206A b(Integer num) {
        onMutation();
        this.f26650b = num;
        return this;
    }

    public final C1206A c(Number[] numberArr) {
        super.mo9id(numberArr);
        return this;
    }

    public final C1206A d(Boolean bool) {
        onMutation();
        this.f26653e = bool;
        return this;
    }

    public final C1206A e(String str) {
        onMutation();
        this.f26649a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1206A) || !super.equals(obj)) {
            return false;
        }
        C1206A c1206a = (C1206A) obj;
        c1206a.getClass();
        String str = this.f26649a;
        if (str == null ? c1206a.f26649a != null : !str.equals(c1206a.f26649a)) {
            return false;
        }
        Integer num = this.f26650b;
        if (num == null ? c1206a.f26650b != null : !num.equals(c1206a.f26650b)) {
            return false;
        }
        Integer num2 = this.f26651c;
        if (num2 == null ? c1206a.f26651c != null : !num2.equals(c1206a.f26651c)) {
            return false;
        }
        if ((this.f26652d == null) != (c1206a.f26652d == null)) {
            return false;
        }
        Boolean bool = this.f26653e;
        if (bool == null ? c1206a.f26653e != null : !bool.equals(c1206a.f26653e)) {
            return false;
        }
        Boolean bool2 = this.f26654f;
        Boolean bool3 = c1206a.f26654f;
        return bool2 == null ? bool3 == null : bool2.equals(bool3);
    }

    public final C1206A f(B7.f fVar) {
        onMutation();
        this.f26652d = fVar;
        return this;
    }

    public final C1206A g(Boolean bool) {
        onMutation();
        this.f26654f = bool;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_hub_card;
    }

    public final C1206A h(C.v vVar) {
        super.mo12spanSizeOverride(vVar);
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
        String str = this.f26649a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f26650b;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f26651c;
        int hashCode4 = (((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.f26652d != null ? 1 : 0)) * 31;
        Boolean bool = this.f26653e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f26654f;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
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
        this.f26649a = null;
        this.f26650b = null;
        this.f26651c = null;
        this.f26652d = null;
        this.f26653e = null;
        this.f26654f = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(101, this.f26649a)) {
            throw new IllegalStateException("The attribute nameText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(15, this.f26650b)) {
            throw new IllegalStateException("The attribute cardImgResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(14, this.f26651c)) {
            throw new IllegalStateException("The attribute cardBackgroundResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(106, this.f26652d)) {
            throw new IllegalStateException("The attribute onClickCart was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(73, this.f26653e)) {
            throw new IllegalStateException("The attribute isSmallIcon was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(139, this.f26654f)) {
            throw new IllegalStateException("The attribute showWarning was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "HubCardBindingModel_{nameText=" + this.f26649a + ", cardImgResId=" + this.f26650b + ", cardBackgroundResId=" + this.f26651c + ", onClickCart=" + this.f26652d + ", isSmallIcon=" + this.f26653e + ", showWarning=" + this.f26654f + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1206A)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1206A c1206a = (C1206A) epoxyModel;
        String str = this.f26649a;
        if (str == null ? c1206a.f26649a != null : !str.equals(c1206a.f26649a)) {
            fVar.m(101, this.f26649a);
        }
        Integer num = this.f26650b;
        if (num == null ? c1206a.f26650b != null : !num.equals(c1206a.f26650b)) {
            fVar.m(15, this.f26650b);
        }
        Integer num2 = this.f26651c;
        if (num2 == null ? c1206a.f26651c != null : !num2.equals(c1206a.f26651c)) {
            fVar.m(14, this.f26651c);
        }
        View.OnClickListener onClickListener = this.f26652d;
        if ((onClickListener == null) != (c1206a.f26652d == null)) {
            fVar.m(106, onClickListener);
        }
        Boolean bool = this.f26653e;
        if (bool == null ? c1206a.f26653e != null : !bool.equals(c1206a.f26653e)) {
            fVar.m(73, this.f26653e);
        }
        Boolean bool2 = this.f26654f;
        Boolean bool3 = c1206a.f26654f;
        if (bool2 != null) {
            if (bool2.equals(bool3)) {
                return;
            }
        } else if (bool3 == null) {
            return;
        }
        fVar.m(139, this.f26654f);
    }
}
