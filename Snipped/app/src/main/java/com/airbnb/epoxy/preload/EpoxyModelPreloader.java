package com.airbnb.epoxy.preload;

import O9.p;
import android.view.View;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: EpoxyModelPreloader.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007:\u0001\"B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "Ljava/lang/Class;", "modelType", "", "", "preloadableViewIds", "<init>", "(Ljava/lang/Class;Ljava/util/List;)V", "epoxyModel", "viewSignature", "(Lcom/airbnb/epoxy/EpoxyModel;)Ljava/lang/Object;", "Landroid/view/View;", Promotion.ACTION_VIEW, "buildViewMetadata", "(Landroid/view/View;)Lcom/airbnb/epoxy/preload/ViewMetadata;", "preloadTarget", "Lcom/airbnb/epoxy/preload/ViewData;", "viewData", "LO9/p;", "startPreload", "(Lcom/airbnb/epoxy/EpoxyModel;Lcom/airbnb/epoxy/preload/PreloadRequestHolder;Lcom/airbnb/epoxy/preload/ViewData;)V", "Ljava/lang/Class;", "getModelType", "()Ljava/lang/Class;", "Ljava/util/List;", "getPreloadableViewIds", "()Ljava/util/List;", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class EpoxyModelPreloader<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Class<T> modelType;
    private final List<Integer> preloadableViewIds;

    /* compiled from: EpoxyModelPreloader.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J{\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00028\u00040\u0010\"\u000e\b\u0003\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004\"\b\b\u0004\u0010\u0007*\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2(\b\b\u0010\u000f\u001a\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J±\u0001\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\"\u000e\b\u0003\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004\"\n\b\u0004\u0010\u0013*\u0004\u0018\u00010\r\"\b\b\u0005\u0010\u0007*\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00040\u00142\u0016\b\n\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142&\b\b\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0018J³\u0001\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\"\f\b\u0003\u0010\u0005*\u0006\u0012\u0002\b\u00030\u0004\"\n\b\u0004\u0010\u0013*\u0004\u0018\u00010\r\"\b\b\u0005\u0010\u0007*\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00040\u00142\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\f\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0011\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader$Companion;", "", "<init>", "()V", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "", "preloadableViewIds", "Lkotlin/Function3;", "Lcom/airbnb/epoxy/preload/ViewData;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "LO9/p;", "doPreload", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "with", "(Ljava/util/List;Lca/q;)Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "U", "Lkotlin/Function1;", "Landroid/view/View;", "viewMetadata", "viewSignature", "(Ljava/util/List;Lca/l;Lca/l;Lca/q;)Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Ljava/lang/Class;", "epoxyModelClass", "(Ljava/util/List;Ljava/lang/Class;Lca/l;Lca/l;Lca/q;)Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public static EpoxyModelPreloader with$default(Companion companion, List list, InterfaceC0646l interfaceC0646l, InterfaceC0646l interfaceC0646l2, InterfaceC0651q interfaceC0651q, int i, Object obj) {
            if ((i & 1) != 0) {
                EmptyList emptyList = EmptyList.f23104a;
            }
            if ((i & 4) != 0) {
                f.e();
                throw null;
            }
            f.e();
            throw null;
        }

        public final <T extends EpoxyModel<?>, P extends PreloadRequestHolder> EpoxyModelPreloader<T, ViewMetadata, P> with(List<Integer> preloadableViewIds, InterfaceC0651q<? super T, ? super P, ? super ViewData<? extends ViewMetadata>, p> doPreload) {
            EpoxyModelPreloader$Companion$with$1 epoxyModelPreloader$Companion$with$1 = EpoxyModelPreloader$Companion$with$1.INSTANCE;
            f.e();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> EpoxyModelPreloader<T, U, P> with(final List<Integer> preloadableViewIds, final Class<T> epoxyModelClass, final InterfaceC0646l<? super View, ? extends U> viewMetadata, final InterfaceC0646l<? super T, ? extends Object> viewSignature, final InterfaceC0651q<? super T, ? super P, ? super ViewData<? extends U>, p> doPreload) {
            return (EpoxyModelPreloader<T, U, P>) new EpoxyModelPreloader<T, U, P>(epoxyModelClass, preloadableViewIds) { // from class: com.airbnb.epoxy.preload.EpoxyModelPreloader$Companion$with$5
                /* JADX WARN: Incorrect return type in method signature: (Landroid/view/View;)TU; */
                @Override // com.airbnb.epoxy.preload.EpoxyModelPreloader
                public ViewMetadata buildViewMetadata(View view) {
                    return (ViewMetadata) viewMetadata.invoke(view);
                }

                /* JADX WARN: Incorrect types in method signature: (TT;TP;Lcom/airbnb/epoxy/preload/ViewData<+TU;>;)V */
                @Override // com.airbnb.epoxy.preload.EpoxyModelPreloader
                public void startPreload(EpoxyModel epoxyModel, PreloadRequestHolder preloadTarget, ViewData viewData) {
                    doPreload.invoke(epoxyModel, preloadTarget, viewData);
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Object; */
                @Override // com.airbnb.epoxy.preload.EpoxyModelPreloader
                public Object viewSignature(EpoxyModel epoxyModel) {
                    return viewSignature.invoke(epoxyModel);
                }
            };
        }

        public static EpoxyModelPreloader with$default(Companion companion, List list, InterfaceC0651q interfaceC0651q, int i, Object obj) {
            if ((i & 1) != 0) {
                EmptyList emptyList = EmptyList.f23104a;
            }
            EpoxyModelPreloader$Companion$with$1 epoxyModelPreloader$Companion$with$1 = EpoxyModelPreloader$Companion$with$1.INSTANCE;
            f.e();
            throw null;
        }

        public final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> EpoxyModelPreloader<T, U, P> with(List<Integer> preloadableViewIds, InterfaceC0646l<? super View, ? extends U> viewMetadata, InterfaceC0646l<? super T, ? extends Object> viewSignature, InterfaceC0651q<? super T, ? super P, ? super ViewData<? extends U>, p> doPreload) {
            f.e();
            throw null;
        }

        public static EpoxyModelPreloader with$default(Companion companion, List list, Class cls, InterfaceC0646l interfaceC0646l, InterfaceC0646l interfaceC0646l2, InterfaceC0651q interfaceC0651q, int i, Object obj) {
            if ((i & 1) != 0) {
                list = EmptyList.f23104a;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                interfaceC0646l2 = new InterfaceC0646l() { // from class: com.airbnb.epoxy.preload.EpoxyModelPreloader$Companion$with$4
                    /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Void; */
                    @Override // ca.InterfaceC0646l
                    public final Void invoke(EpoxyModel epoxyModel) {
                        return null;
                    }
                };
            }
            return companion.with(list2, cls, interfaceC0646l, interfaceC0646l2, interfaceC0651q);
        }
    }

    public EpoxyModelPreloader(Class<T> cls, List<Integer> list) {
        this.modelType = cls;
        this.preloadableViewIds = list;
    }

    public abstract U buildViewMetadata(View view);

    public final Class<T> getModelType() {
        return this.modelType;
    }

    public final List<Integer> getPreloadableViewIds() {
        return this.preloadableViewIds;
    }

    public abstract void startPreload(T epoxyModel, P preloadTarget, ViewData<? extends U> viewData);

    public Object viewSignature(T epoxyModel) {
        return null;
    }
}
