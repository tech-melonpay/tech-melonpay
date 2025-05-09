package com.airbnb.epoxy;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;

/* compiled from: EpoxyProcessorKotlinExtensions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/airbnb/epoxy/ModelCollector;", "Lkotlin/Function1;", "Lcom/airbnb/epoxy/GroupModelBuilder;", "LO9/p;", "modelInitializer", "group", "(Lcom/airbnb/epoxy/ModelCollector;Lca/l;)V", "", "layoutRes", "(Lcom/airbnb/epoxy/ModelCollector;ILca/l;)V", "epoxy-adapter_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EpoxyProcessorKotlinExtensionsKt {
    public static final void group(ModelCollector modelCollector, InterfaceC0646l<? super GroupModelBuilder, p> interfaceC0646l) {
        GroupModel_ groupModel_ = new GroupModel_();
        interfaceC0646l.invoke(groupModel_);
        modelCollector.add(groupModel_);
    }

    public static final void group(ModelCollector modelCollector, int i, InterfaceC0646l<? super GroupModelBuilder, p> interfaceC0646l) {
        GroupModel_ groupModel_ = new GroupModel_(i);
        interfaceC0646l.invoke(groupModel_);
        modelCollector.add(groupModel_);
    }
}
