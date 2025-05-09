package com.airbnb.epoxy.preload;

import O9.p;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.utils.UtilsKt;
import kotlin.Metadata;

/* compiled from: PreloaderExtensions.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0016\u001a\u00020\u000f\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000\"\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u00102\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/airbnb/epoxy/EpoxyController;", "epoxyController", "", "maxPreloadDistance", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "preloader", "Lkotlin/Function0;", "requestHolderFactory", "addEpoxyPreloader", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyController;ILca/p;Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lca/a;)V", "epoxy-adapter_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PreloaderExtensionsKt {
    public static final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> void addEpoxyPreloader(RecyclerView recyclerView, EpoxyController epoxyController, int i, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p, EpoxyModelPreloader<T, U, P> epoxyModelPreloader, InterfaceC0635a<? extends P> interfaceC0635a) {
        recyclerView.addOnScrollListener(EpoxyPreloader.INSTANCE.with(epoxyController, interfaceC0635a, interfaceC0650p, i, epoxyModelPreloader));
    }

    public static /* synthetic */ void addEpoxyPreloader$default(RecyclerView recyclerView, EpoxyController epoxyController, int i, InterfaceC0650p interfaceC0650p, EpoxyModelPreloader epoxyModelPreloader, InterfaceC0635a interfaceC0635a, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i = 3;
        }
        int i10 = i;
        if ((i9 & 4) != 0) {
            interfaceC0650p = new InterfaceC0650p<Context, RuntimeException, p>() { // from class: com.airbnb.epoxy.preload.PreloaderExtensionsKt$addEpoxyPreloader$1
                @Override // ca.InterfaceC0650p
                public /* bridge */ /* synthetic */ p invoke(Context context, RuntimeException runtimeException) {
                    invoke2(context, runtimeException);
                    return p.f3034a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Context context, RuntimeException runtimeException) {
                    if (!UtilsKt.isDebuggable(context)) {
                        throw runtimeException;
                    }
                }
            };
        }
        addEpoxyPreloader(recyclerView, epoxyController, i10, interfaceC0650p, epoxyModelPreloader, interfaceC0635a);
    }
}
