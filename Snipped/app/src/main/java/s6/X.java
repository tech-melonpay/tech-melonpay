package s6;

import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: PersonalDataBindingModel_.java */
/* loaded from: classes2.dex */
public final class X extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26741a;

    /* renamed from: b, reason: collision with root package name */
    public String f26742b;

    /* renamed from: c, reason: collision with root package name */
    public String f26743c;

    /* renamed from: d, reason: collision with root package name */
    public String f26744d;

    /* renamed from: e, reason: collision with root package name */
    public String f26745e;

    /* renamed from: f, reason: collision with root package name */
    public String f26746f;

    /* renamed from: g, reason: collision with root package name */
    public String f26747g;

    /* renamed from: h, reason: collision with root package name */
    public String f26748h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f26749j;

    public final X a(String str) {
        onMutation();
        this.f26741a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final X b() {
        super.mo6id("personal_details");
        return this;
    }

    public final X c() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f26749j = bool;
        return this;
    }

    public final X d(String str) {
        onMutation();
        this.f26742b = str;
        return this;
    }

    public final X e(String str) {
        onMutation();
        this.f26744d = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X) || !super.equals(obj)) {
            return false;
        }
        X x9 = (X) obj;
        x9.getClass();
        String str = this.f26741a;
        if (str == null ? x9.f26741a != null : !str.equals(x9.f26741a)) {
            return false;
        }
        String str2 = this.f26742b;
        if (str2 == null ? x9.f26742b != null : !str2.equals(x9.f26742b)) {
            return false;
        }
        String str3 = this.f26743c;
        if (str3 == null ? x9.f26743c != null : !str3.equals(x9.f26743c)) {
            return false;
        }
        String str4 = this.f26744d;
        if (str4 == null ? x9.f26744d != null : !str4.equals(x9.f26744d)) {
            return false;
        }
        String str5 = this.f26745e;
        if (str5 == null ? x9.f26745e != null : !str5.equals(x9.f26745e)) {
            return false;
        }
        String str6 = this.f26746f;
        if (str6 == null ? x9.f26746f != null : !str6.equals(x9.f26746f)) {
            return false;
        }
        String str7 = this.f26747g;
        if (str7 == null ? x9.f26747g != null : !str7.equals(x9.f26747g)) {
            return false;
        }
        String str8 = this.f26748h;
        if (str8 == null ? x9.f26748h != null : !str8.equals(x9.f26748h)) {
            return false;
        }
        String str9 = this.i;
        if (str9 == null ? x9.i != null : !str9.equals(x9.i)) {
            return false;
        }
        Boolean bool = this.f26749j;
        Boolean bool2 = x9.f26749j;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public final X f(String str) {
        onMutation();
        this.f26746f = str;
        return this;
    }

    public final X g(String str) {
        onMutation();
        this.f26748h = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_personal_data;
    }

    public final X h(String str) {
        onMutation();
        this.f26743c = str;
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
        String str = this.f26741a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26742b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26743c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26744d;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26745e;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f26746f;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f26747g;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f26748h;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.i;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool = this.f26749j;
        return (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final X i(String str) {
        onMutation();
        this.f26745e = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final X j(String str) {
        onMutation();
        this.f26747g = str;
        return this;
    }

    public final X k(String str) {
        onMutation();
        this.i = str;
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
        this.f26741a = null;
        this.f26742b = null;
        this.f26743c = null;
        this.f26744d = null;
        this.f26745e = null;
        this.f26746f = null;
        this.f26747g = null;
        this.f26748h = null;
        this.i = null;
        this.f26749j = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(39, this.f26741a)) {
            throw new IllegalStateException("The attribute headerText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(84, this.f26742b)) {
            throw new IllegalStateException("The attribute keyText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(154, this.f26743c)) {
            throw new IllegalStateException("The attribute valueText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(86, this.f26744d)) {
            throw new IllegalStateException("The attribute keyText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(156, this.f26745e)) {
            throw new IllegalStateException("The attribute valueText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(87, this.f26746f)) {
            throw new IllegalStateException("The attribute keyText3 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(157, this.f26747g)) {
            throw new IllegalStateException("The attribute valueText3 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(88, this.f26748h)) {
            throw new IllegalStateException("The attribute keyText4 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(158, this.i)) {
            throw new IllegalStateException("The attribute valueText4 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f26749j)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(107, null)) {
            throw new IllegalStateException("The attribute onClickData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "PersonalDataBindingModel_{headerText=" + this.f26741a + ", keyText=" + this.f26742b + ", valueText=" + this.f26743c + ", keyText2=" + this.f26744d + ", valueText2=" + this.f26745e + ", keyText3=" + this.f26746f + ", valueText3=" + this.f26747g + ", keyText4=" + this.f26748h + ", valueText4=" + this.i + ", isEnabled=" + this.f26749j + ", onClickData=null}" + super.toString();
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
        if (!(epoxyModel instanceof X)) {
            setDataBindingVariables(fVar);
            return;
        }
        X x9 = (X) epoxyModel;
        String str = this.f26741a;
        if (str == null ? x9.f26741a != null : !str.equals(x9.f26741a)) {
            fVar.m(39, this.f26741a);
        }
        String str2 = this.f26742b;
        if (str2 == null ? x9.f26742b != null : !str2.equals(x9.f26742b)) {
            fVar.m(84, this.f26742b);
        }
        String str3 = this.f26743c;
        if (str3 == null ? x9.f26743c != null : !str3.equals(x9.f26743c)) {
            fVar.m(154, this.f26743c);
        }
        String str4 = this.f26744d;
        if (str4 == null ? x9.f26744d != null : !str4.equals(x9.f26744d)) {
            fVar.m(86, this.f26744d);
        }
        String str5 = this.f26745e;
        if (str5 == null ? x9.f26745e != null : !str5.equals(x9.f26745e)) {
            fVar.m(156, this.f26745e);
        }
        String str6 = this.f26746f;
        if (str6 == null ? x9.f26746f != null : !str6.equals(x9.f26746f)) {
            fVar.m(87, this.f26746f);
        }
        String str7 = this.f26747g;
        if (str7 == null ? x9.f26747g != null : !str7.equals(x9.f26747g)) {
            fVar.m(157, this.f26747g);
        }
        String str8 = this.f26748h;
        if (str8 == null ? x9.f26748h != null : !str8.equals(x9.f26748h)) {
            fVar.m(88, this.f26748h);
        }
        String str9 = this.i;
        if (str9 == null ? x9.i != null : !str9.equals(x9.i)) {
            fVar.m(158, this.i);
        }
        Boolean bool = this.f26749j;
        if (bool == null ? x9.f26749j != null : !bool.equals(x9.f26749j)) {
            fVar.m(56, this.f26749j);
        }
        x9.getClass();
    }
}
