package s6;

import android.view.View;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.luminary.mobile.R;

/* compiled from: Data2BindingModel_.java */
/* renamed from: s6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1229s extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder> {

    /* renamed from: a, reason: collision with root package name */
    public String f26999a;

    /* renamed from: b, reason: collision with root package name */
    public String f27000b;

    /* renamed from: c, reason: collision with root package name */
    public String f27001c;

    /* renamed from: d, reason: collision with root package name */
    public String f27002d;

    /* renamed from: e, reason: collision with root package name */
    public String f27003e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f27004f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f27005g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f27006h;
    public View.OnLongClickListener i;

    public final C1229s a(String str) {
        onMutation();
        this.f26999a = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    public final C1229s b() {
        super.mo6id("bank_app_id");
        return this;
    }

    public final C1229s c() {
        Boolean bool = Boolean.TRUE;
        onMutation();
        this.f27005g = bool;
        return this;
    }

    public final C1229s d() {
        Boolean bool = Boolean.FALSE;
        onMutation();
        this.f27004f = bool;
        return this;
    }

    public final C1229s e(String str) {
        onMutation();
        this.f27000b = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1229s) || !super.equals(obj)) {
            return false;
        }
        C1229s c1229s = (C1229s) obj;
        c1229s.getClass();
        String str = this.f26999a;
        if (str == null ? c1229s.f26999a != null : !str.equals(c1229s.f26999a)) {
            return false;
        }
        String str2 = this.f27000b;
        if (str2 == null ? c1229s.f27000b != null : !str2.equals(c1229s.f27000b)) {
            return false;
        }
        String str3 = this.f27001c;
        if (str3 == null ? c1229s.f27001c != null : !str3.equals(c1229s.f27001c)) {
            return false;
        }
        String str4 = this.f27002d;
        if (str4 == null ? c1229s.f27002d != null : !str4.equals(c1229s.f27002d)) {
            return false;
        }
        String str5 = this.f27003e;
        if (str5 == null ? c1229s.f27003e != null : !str5.equals(c1229s.f27003e)) {
            return false;
        }
        Boolean bool = this.f27004f;
        if (bool == null ? c1229s.f27004f != null : !bool.equals(c1229s.f27004f)) {
            return false;
        }
        Boolean bool2 = this.f27005g;
        if (bool2 == null ? c1229s.f27005g != null : !bool2.equals(c1229s.f27005g)) {
            return false;
        }
        if ((this.f27006h == null) != (c1229s.f27006h == null)) {
            return false;
        }
        return (this.i == null) == (c1229s.i == null);
    }

    public final C1229s f(String str) {
        onMutation();
        this.f27002d = str;
        return this;
    }

    public final C1229s g(D6.c cVar) {
        onMutation();
        this.i = cVar;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        return R.layout.cell_data_2;
    }

    public final C1229s h(D6.b bVar) {
        onMutation();
        this.f27006h = bVar;
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
        String str = this.f26999a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27000b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27001c;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f27002d;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f27003e;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f27004f;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f27005g;
        return ((((hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.f27006h != null ? 1 : 0)) * 31) + (this.i != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public final EpoxyModel hide2() {
        super.hide2();
        return this;
    }

    public final C1229s i(String str) {
        onMutation();
        this.f27001c = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    /* renamed from: id */
    public final EpoxyModel mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    public final C1229s j(String str) {
        onMutation();
        this.f27003e = str;
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
        this.f26999a = null;
        this.f27000b = null;
        this.f27001c = null;
        this.f27002d = null;
        this.f27003e = null;
        this.f27004f = null;
        this.f27005g = null;
        this.f27006h = null;
        this.i = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void setDataBindingVariables(F0.f fVar) {
        if (!fVar.m(39, this.f26999a)) {
            throw new IllegalStateException("The attribute headerText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(85, this.f27000b)) {
            throw new IllegalStateException("The attribute keyText1 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(155, this.f27001c)) {
            throw new IllegalStateException("The attribute valueText1 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(86, this.f27002d)) {
            throw new IllegalStateException("The attribute keyText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(156, this.f27003e)) {
            throw new IllegalStateException("The attribute valueText2 was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(63, this.f27004f)) {
            throw new IllegalStateException("The attribute isInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(56, this.f27005g)) {
            throw new IllegalStateException("The attribute isEnabled was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(110, this.f27006h)) {
            throw new IllegalStateException("The attribute onClickInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!fVar.m(104, this.i)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        return "Data2BindingModel_{headerText=" + this.f26999a + ", keyText1=" + this.f27000b + ", valueText1=" + this.f27001c + ", keyText2=" + this.f27002d + ", valueText2=" + this.f27003e + ", isInfo=" + this.f27004f + ", isEnabled=" + this.f27005g + ", onClickInfo=" + this.f27006h + ", onClick=" + this.i + "}" + super.toString();
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
        if (!(epoxyModel instanceof C1229s)) {
            setDataBindingVariables(fVar);
            return;
        }
        C1229s c1229s = (C1229s) epoxyModel;
        String str = this.f26999a;
        if (str == null ? c1229s.f26999a != null : !str.equals(c1229s.f26999a)) {
            fVar.m(39, this.f26999a);
        }
        String str2 = this.f27000b;
        if (str2 == null ? c1229s.f27000b != null : !str2.equals(c1229s.f27000b)) {
            fVar.m(85, this.f27000b);
        }
        String str3 = this.f27001c;
        if (str3 == null ? c1229s.f27001c != null : !str3.equals(c1229s.f27001c)) {
            fVar.m(155, this.f27001c);
        }
        String str4 = this.f27002d;
        if (str4 == null ? c1229s.f27002d != null : !str4.equals(c1229s.f27002d)) {
            fVar.m(86, this.f27002d);
        }
        String str5 = this.f27003e;
        if (str5 == null ? c1229s.f27003e != null : !str5.equals(c1229s.f27003e)) {
            fVar.m(156, this.f27003e);
        }
        Boolean bool = this.f27004f;
        if (bool == null ? c1229s.f27004f != null : !bool.equals(c1229s.f27004f)) {
            fVar.m(63, this.f27004f);
        }
        Boolean bool2 = this.f27005g;
        if (bool2 == null ? c1229s.f27005g != null : !bool2.equals(c1229s.f27005g)) {
            fVar.m(56, this.f27005g);
        }
        View.OnClickListener onClickListener = this.f27006h;
        if ((onClickListener == null) != (c1229s.f27006h == null)) {
            fVar.m(110, onClickListener);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        if ((onLongClickListener == null) != (c1229s.i == null)) {
            fVar.m(104, onLongClickListener);
        }
    }
}
