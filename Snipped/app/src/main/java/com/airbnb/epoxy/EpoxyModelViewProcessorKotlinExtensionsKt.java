package com.airbnb.epoxy;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;

/* compiled from: EpoxyModelViewProcessorKotlinExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/ModelCollector;", "Lkotlin/Function1;", "Lcom/airbnb/epoxy/CarouselModelBuilder;", "LO9/p;", "modelInitializer", "carousel", "(Lcom/airbnb/epoxy/ModelCollector;Lca/l;)V", "epoxy-adapter_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EpoxyModelViewProcessorKotlinExtensionsKt {
    public static final void carousel(ModelCollector modelCollector, InterfaceC0646l<? super CarouselModelBuilder, p> interfaceC0646l) {
        CarouselModel_ carouselModel_ = new CarouselModel_();
        interfaceC0646l.invoke(carouselModel_);
        modelCollector.add(carouselModel_);
    }
}
