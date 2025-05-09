package com.airbnb.epoxy;

import android.view.ViewGroup;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyModel;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class CarouselModel_ extends EpoxyModel<Carousel> implements GeneratedModel<Carousel>, CarouselModelBuilder {
    private List<? extends EpoxyModel<?>> models_List;
    private OnModelBoundListener<CarouselModel_, Carousel> onModelBoundListener_epoxyGeneratedModel;
    private OnModelUnboundListener<CarouselModel_, Carousel> onModelUnboundListener_epoxyGeneratedModel;
    private OnModelVisibilityChangedListener<CarouselModel_, Carousel> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private OnModelVisibilityStateChangedListener<CarouselModel_, Carousel> onModelVisibilityStateChangedListener_epoxyGeneratedModel;
    private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(7);
    private boolean hasFixedSize_Boolean = false;
    private float numViewsToShowOnScreen_Float = 0.0f;
    private int initialPrefetchItemCount_Int = 0;
    private int paddingRes_Int = 0;
    private int paddingDp_Int = -1;
    private Carousel.Padding padding_Padding = null;

    @Override // com.airbnb.epoxy.EpoxyModel
    public void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
        if (!this.assignedAttributes_epoxyGeneratedModel.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CarouselModel_) || !super.equals(obj)) {
            return false;
        }
        CarouselModel_ carouselModel_ = (CarouselModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (carouselModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (carouselModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (carouselModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (carouselModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null) || this.hasFixedSize_Boolean != carouselModel_.hasFixedSize_Boolean || Float.compare(carouselModel_.numViewsToShowOnScreen_Float, this.numViewsToShowOnScreen_Float) != 0 || this.initialPrefetchItemCount_Int != carouselModel_.initialPrefetchItemCount_Int || this.paddingRes_Int != carouselModel_.paddingRes_Int || this.paddingDp_Int != carouselModel_.paddingDp_Int) {
            return false;
        }
        Carousel.Padding padding = this.padding_Padding;
        if (padding == null ? carouselModel_.padding_Padding != null : !padding.equals(carouselModel_.padding_Padding)) {
            return false;
        }
        List<? extends EpoxyModel<?>> list = this.models_List;
        List<? extends EpoxyModel<?>> list2 = carouselModel_.models_List;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getDefaultLayout() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getViewType() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel == null ? 0 : 1)) * 31) + (this.hasFixedSize_Boolean ? 1 : 0)) * 31;
        float f10 = this.numViewsToShowOnScreen_Float;
        int floatToIntBits = (((((((hashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.initialPrefetchItemCount_Int) * 31) + this.paddingRes_Int) * 31) + this.paddingDp_Int) * 31;
        Carousel.Padding padding = this.padding_Padding;
        int hashCode2 = (floatToIntBits + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends EpoxyModel<?>> list = this.models_List;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public int initialPrefetchItemCountInt() {
        return this.initialPrefetchItemCount_Int;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public /* bridge */ /* synthetic */ CarouselModelBuilder models(List list) {
        return models((List<? extends EpoxyModel<?>>) list);
    }

    public float numViewsToShowOnScreenFloat() {
        return this.numViewsToShowOnScreen_Float;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public /* bridge */ /* synthetic */ CarouselModelBuilder onBind(OnModelBoundListener onModelBoundListener) {
        return onBind((OnModelBoundListener<CarouselModel_, Carousel>) onModelBoundListener);
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public /* bridge */ /* synthetic */ CarouselModelBuilder onUnbind(OnModelUnboundListener onModelUnboundListener) {
        return onUnbind((OnModelUnboundListener<CarouselModel_, Carousel>) onModelUnboundListener);
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public /* bridge */ /* synthetic */ CarouselModelBuilder onVisibilityChanged(OnModelVisibilityChangedListener onModelVisibilityChangedListener) {
        return onVisibilityChanged((OnModelVisibilityChangedListener<CarouselModel_, Carousel>) onModelVisibilityChangedListener);
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public /* bridge */ /* synthetic */ CarouselModelBuilder onVisibilityStateChanged(OnModelVisibilityStateChangedListener onModelVisibilityStateChangedListener) {
        return onVisibilityStateChanged((OnModelVisibilityStateChangedListener<CarouselModel_, Carousel>) onModelVisibilityStateChangedListener);
    }

    public int paddingDpInt() {
        return this.paddingDp_Int;
    }

    public Carousel.Padding paddingPadding() {
        return this.padding_Padding;
    }

    public int paddingResInt() {
        return this.paddingRes_Int;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean shouldSaveViewState() {
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        return "CarouselModel_{hasFixedSize_Boolean=" + this.hasFixedSize_Boolean + ", numViewsToShowOnScreen_Float=" + this.numViewsToShowOnScreen_Float + ", initialPrefetchItemCount_Int=" + this.initialPrefetchItemCount_Int + ", paddingRes_Int=" + this.paddingRes_Int + ", paddingDp_Int=" + this.paddingDp_Int + ", padding_Padding=" + this.padding_Padding + ", models_List=" + this.models_List + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public Carousel buildView(ViewGroup viewGroup) {
        Carousel carousel = new Carousel(viewGroup.getContext());
        carousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return carousel;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public void handlePostBind(Carousel carousel, int i) {
        OnModelBoundListener<CarouselModel_, Carousel> onModelBoundListener = this.onModelBoundListener_epoxyGeneratedModel;
        if (onModelBoundListener != null) {
            onModelBoundListener.onModelBound(this, carousel, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public void handlePreBind(EpoxyViewHolder epoxyViewHolder, Carousel carousel, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ hasFixedSize(boolean z10) {
        onMutation();
        this.hasFixedSize_Boolean = z10;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<Carousel> hide2() {
        super.hide2();
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ initialPrefetchItemCount(int i) {
        this.assignedAttributes_epoxyGeneratedModel.set(2);
        this.assignedAttributes_epoxyGeneratedModel.clear(1);
        this.numViewsToShowOnScreen_Float = 0.0f;
        onMutation();
        this.initialPrefetchItemCount_Int = i;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: layout, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<Carousel> layout2(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ models(List<? extends EpoxyModel<?>> list) {
        if (list == null) {
            throw new IllegalArgumentException("models cannot be null");
        }
        this.assignedAttributes_epoxyGeneratedModel.set(6);
        onMutation();
        this.models_List = list;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ numViewsToShowOnScreen(float f10) {
        this.assignedAttributes_epoxyGeneratedModel.set(1);
        this.assignedAttributes_epoxyGeneratedModel.clear(2);
        this.initialPrefetchItemCount_Int = 0;
        onMutation();
        this.numViewsToShowOnScreen_Float = f10;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ onBind(OnModelBoundListener<CarouselModel_, Carousel> onModelBoundListener) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = onModelBoundListener;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ onUnbind(OnModelUnboundListener<CarouselModel_, Carousel> onModelUnboundListener) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = onModelUnboundListener;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ padding(Carousel.Padding padding) {
        this.assignedAttributes_epoxyGeneratedModel.set(5);
        this.assignedAttributes_epoxyGeneratedModel.clear(3);
        this.paddingRes_Int = 0;
        this.assignedAttributes_epoxyGeneratedModel.clear(4);
        this.paddingDp_Int = -1;
        onMutation();
        this.padding_Padding = padding;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ paddingDp(int i) {
        this.assignedAttributes_epoxyGeneratedModel.set(4);
        this.assignedAttributes_epoxyGeneratedModel.clear(3);
        this.paddingRes_Int = 0;
        this.assignedAttributes_epoxyGeneratedModel.clear(5);
        this.padding_Padding = null;
        onMutation();
        this.paddingDp_Int = i;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ paddingRes(int i) {
        this.assignedAttributes_epoxyGeneratedModel.set(3);
        this.assignedAttributes_epoxyGeneratedModel.clear(4);
        this.paddingDp_Int = -1;
        this.assignedAttributes_epoxyGeneratedModel.clear(5);
        this.padding_Padding = null;
        onMutation();
        this.paddingRes_Int = i;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: reset, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<Carousel> reset2() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        this.assignedAttributes_epoxyGeneratedModel.clear();
        this.hasFixedSize_Boolean = false;
        this.numViewsToShowOnScreen_Float = 0.0f;
        this.initialPrefetchItemCount_Int = 0;
        this.paddingRes_Int = 0;
        this.paddingDp_Int = -1;
        this.padding_Padding = null;
        this.models_List = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void unbind(Carousel carousel) {
        super.unbind((CarouselModel_) carousel);
        OnModelUnboundListener<CarouselModel_, Carousel> onModelUnboundListener = this.onModelUnboundListener_epoxyGeneratedModel;
        if (onModelUnboundListener != null) {
            onModelUnboundListener.onModelUnbound(this, carousel);
        }
        carousel.clear();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void bind(Carousel carousel) {
        super.bind((CarouselModel_) carousel);
        if (this.assignedAttributes_epoxyGeneratedModel.get(3)) {
            carousel.setPaddingRes(this.paddingRes_Int);
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(4)) {
            carousel.setPaddingDp(this.paddingDp_Int);
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(5)) {
            carousel.setPadding(this.padding_Padding);
        } else {
            carousel.setPaddingDp(this.paddingDp_Int);
        }
        carousel.setHasFixedSize(this.hasFixedSize_Boolean);
        if (this.assignedAttributes_epoxyGeneratedModel.get(1)) {
            carousel.setNumViewsToShowOnScreen(this.numViewsToShowOnScreen_Float);
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(2)) {
            carousel.setInitialPrefetchItemCount(this.initialPrefetchItemCount_Int);
        } else {
            carousel.setNumViewsToShowOnScreen(this.numViewsToShowOnScreen_Float);
        }
        carousel.setModels(this.models_List);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onVisibilityChanged(float f10, float f11, int i, int i9, Carousel carousel) {
        OnModelVisibilityChangedListener<CarouselModel_, Carousel> onModelVisibilityChangedListener = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (onModelVisibilityChangedListener != null) {
            onModelVisibilityChangedListener.onVisibilityChanged(this, carousel, f10, f11, i, i9);
        }
        super.onVisibilityChanged(f10, f11, i, i9, (int) carousel);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onVisibilityStateChanged(int i, Carousel carousel) {
        OnModelVisibilityStateChangedListener<CarouselModel_, Carousel> onModelVisibilityStateChangedListener = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (onModelVisibilityStateChangedListener != null) {
            onModelVisibilityStateChangedListener.onVisibilityStateChanged(this, carousel, i);
        }
        super.onVisibilityStateChanged(i, (int) carousel);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<Carousel> show2() {
        super.show2();
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ spanSizeOverride(EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        super.spanSizeOverride(spanSizeOverrideCallback);
        return this;
    }

    public boolean hasFixedSize() {
        return this.hasFixedSize_Boolean;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<Carousel> show2(boolean z10) {
        super.show2(z10);
        return this;
    }

    public List<? extends EpoxyModel<?>> models() {
        return this.models_List;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ onVisibilityChanged(OnModelVisibilityChangedListener<CarouselModel_, Carousel> onModelVisibilityChangedListener) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = onModelVisibilityChangedListener;
        return this;
    }

    @Override // com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ onVisibilityStateChanged(OnModelVisibilityStateChangedListener<CarouselModel_, Carousel> onModelVisibilityStateChangedListener) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = onModelVisibilityStateChangedListener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(long j10) {
        super.id(j10);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(Number... numberArr) {
        super.id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(long j10, long j11) {
        super.id(j10, j11);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(CharSequence charSequence) {
        super.id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void bind(Carousel carousel, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof CarouselModel_)) {
            bind(carousel);
            return;
        }
        CarouselModel_ carouselModel_ = (CarouselModel_) epoxyModel;
        super.bind((CarouselModel_) carousel);
        if (this.assignedAttributes_epoxyGeneratedModel.get(3)) {
            int i = this.paddingRes_Int;
            if (i != carouselModel_.paddingRes_Int) {
                carousel.setPaddingRes(i);
            }
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(4)) {
            int i9 = this.paddingDp_Int;
            if (i9 != carouselModel_.paddingDp_Int) {
                carousel.setPaddingDp(i9);
            }
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(5)) {
            if (carouselModel_.assignedAttributes_epoxyGeneratedModel.get(5)) {
                if ((r0 = this.padding_Padding) != null) {
                }
            }
            carousel.setPadding(this.padding_Padding);
        } else if (carouselModel_.assignedAttributes_epoxyGeneratedModel.get(3) || carouselModel_.assignedAttributes_epoxyGeneratedModel.get(4) || carouselModel_.assignedAttributes_epoxyGeneratedModel.get(5)) {
            carousel.setPaddingDp(this.paddingDp_Int);
        }
        boolean z10 = this.hasFixedSize_Boolean;
        if (z10 != carouselModel_.hasFixedSize_Boolean) {
            carousel.setHasFixedSize(z10);
        }
        if (this.assignedAttributes_epoxyGeneratedModel.get(1)) {
            if (Float.compare(carouselModel_.numViewsToShowOnScreen_Float, this.numViewsToShowOnScreen_Float) != 0) {
                carousel.setNumViewsToShowOnScreen(this.numViewsToShowOnScreen_Float);
            }
        } else if (this.assignedAttributes_epoxyGeneratedModel.get(2)) {
            int i10 = this.initialPrefetchItemCount_Int;
            if (i10 != carouselModel_.initialPrefetchItemCount_Int) {
                carousel.setInitialPrefetchItemCount(i10);
            }
        } else if (carouselModel_.assignedAttributes_epoxyGeneratedModel.get(1) || carouselModel_.assignedAttributes_epoxyGeneratedModel.get(2)) {
            carousel.setNumViewsToShowOnScreen(this.numViewsToShowOnScreen_Float);
        }
        List<? extends EpoxyModel<?>> list = this.models_List;
        List<? extends EpoxyModel<?>> list2 = carouselModel_.models_List;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        carousel.setModels(this.models_List);
    }

    @Override // com.airbnb.epoxy.EpoxyModel, com.airbnb.epoxy.CarouselModelBuilder
    public CarouselModel_ id(CharSequence charSequence, long j10) {
        super.id(charSequence, j10);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getSpanSize(int i, int i9, int i10) {
        return i;
    }
}
