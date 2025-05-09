package com.airbnb.epoxy;

import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyModel;
import java.util.List;

@EpoxyBuildScope
/* loaded from: classes.dex */
public interface CarouselModelBuilder {
    CarouselModelBuilder hasFixedSize(boolean z10);

    CarouselModelBuilder id(long j10);

    CarouselModelBuilder id(long j10, long j11);

    CarouselModelBuilder id(CharSequence charSequence);

    CarouselModelBuilder id(CharSequence charSequence, long j10);

    CarouselModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    CarouselModelBuilder id(Number... numberArr);

    CarouselModelBuilder initialPrefetchItemCount(int i);

    CarouselModelBuilder models(List<? extends EpoxyModel<?>> list);

    CarouselModelBuilder numViewsToShowOnScreen(float f10);

    CarouselModelBuilder onBind(OnModelBoundListener<CarouselModel_, Carousel> onModelBoundListener);

    CarouselModelBuilder onUnbind(OnModelUnboundListener<CarouselModel_, Carousel> onModelUnboundListener);

    CarouselModelBuilder onVisibilityChanged(OnModelVisibilityChangedListener<CarouselModel_, Carousel> onModelVisibilityChangedListener);

    CarouselModelBuilder onVisibilityStateChanged(OnModelVisibilityStateChangedListener<CarouselModel_, Carousel> onModelVisibilityStateChangedListener);

    CarouselModelBuilder padding(Carousel.Padding padding);

    CarouselModelBuilder paddingDp(int i);

    CarouselModelBuilder paddingRes(int i);

    CarouselModelBuilder spanSizeOverride(EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback);
}
