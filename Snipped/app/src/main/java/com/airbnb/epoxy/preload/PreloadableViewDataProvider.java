package com.airbnb.epoxy.preload;

import C.v;
import O9.p;
import P9.q;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.InternalExposerKt;
import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import y0.C1596C;
import y0.E;

/* compiled from: PreloadableViewDataProvider.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0015\u001a\u00020\u0014\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jk\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c\u0018\u00010\u001b\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r\"\n\b\u0001\u0010\u0018*\u0004\u0018\u00010\u0017\"\b\b\u0002\u0010\u001a*\u00020\u00192\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b\"\b\b\u0000\u0010\u000e*\u00020\u001f*\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$Ja\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r\"\n\b\u0001\u0010\u0018*\u0004\u0018\u00010\u0017\"\b\b\u0002\u0010\u001a*\u00020\u0019*\u00020\u001f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&Jg\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001b\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\r\"\n\b\u0001\u0010\u0018*\u0004\u0018\u00010\u0017\"\b\b\u0002\u0010\u001a*\u00020\u00192\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R1\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0004j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R,\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0018\u00010\u001b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "adapter", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "<init>", "(Lcom/airbnb/epoxy/BaseEpoxyAdapter;Lca/p;)V", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "preloader", "epoxyModel", "", "position", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "cacheKey", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;I)Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "Lcom/airbnb/epoxy/preload/ViewData;", "findViewData", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;)Ljava/util/List;", "Landroid/view/View;", "viewIds", "findViews", "(Landroid/view/View;Ljava/util/List;Lcom/airbnb/epoxy/EpoxyModel;)Ljava/util/List;", "recursePreloadableViews", "(Landroid/view/View;)Ljava/util/List;", "buildData", "(Landroid/view/View;Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;)Lcom/airbnb/epoxy/preload/ViewData;", "dataForModel", "(Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lcom/airbnb/epoxy/EpoxyModel;I)Ljava/util/List;", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "getAdapter", "()Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "Lca/p;", "getErrorHandler", "()Lca/p;", "", "cache", "Ljava/util/Map;", "CacheKey", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PreloadableViewDataProvider {
    private final BaseEpoxyAdapter adapter;
    private final Map<CacheKey, List<ViewData<?>>> cache = new LinkedHashMap();
    private final InterfaceC0650p<Context, RuntimeException, p> errorHandler;

    /* compiled from: PreloadableViewDataProvider.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ\u0015\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "", "epoxyModelClass", "Ljava/lang/Class;", "Lcom/airbnb/epoxy/EpoxyModel;", "spanSize", "", "viewType", "signature", "(Ljava/lang/Class;IILjava/lang/Object;)V", "getEpoxyModelClass", "()Ljava/lang/Class;", "getSignature", "()Ljava/lang/Object;", "getSpanSize", "()I", "getViewType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CacheKey {
        private final Class<? extends EpoxyModel<?>> epoxyModelClass;
        private final Object signature;
        private final int spanSize;
        private final int viewType;

        public CacheKey(Class<? extends EpoxyModel<?>> cls, int i, int i9, Object obj) {
            this.epoxyModelClass = cls;
            this.spanSize = i;
            this.viewType = i9;
            this.signature = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, Class cls, int i, int i9, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                cls = cacheKey.epoxyModelClass;
            }
            if ((i10 & 2) != 0) {
                i = cacheKey.spanSize;
            }
            if ((i10 & 4) != 0) {
                i9 = cacheKey.viewType;
            }
            if ((i10 & 8) != 0) {
                obj = cacheKey.signature;
            }
            return cacheKey.copy(cls, i, i9, obj);
        }

        public final Class<? extends EpoxyModel<?>> component1() {
            return this.epoxyModelClass;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSpanSize() {
            return this.spanSize;
        }

        /* renamed from: component3, reason: from getter */
        public final int getViewType() {
            return this.viewType;
        }

        /* renamed from: component4, reason: from getter */
        public final Object getSignature() {
            return this.signature;
        }

        public final CacheKey copy(Class<? extends EpoxyModel<?>> epoxyModelClass, int spanSize, int viewType, Object signature) {
            return new CacheKey(epoxyModelClass, spanSize, viewType, signature);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return f.b(this.epoxyModelClass, cacheKey.epoxyModelClass) && this.spanSize == cacheKey.spanSize && this.viewType == cacheKey.viewType && f.b(this.signature, cacheKey.signature);
        }

        public final Class<? extends EpoxyModel<?>> getEpoxyModelClass() {
            return this.epoxyModelClass;
        }

        public final Object getSignature() {
            return this.signature;
        }

        public final int getSpanSize() {
            return this.spanSize;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            int b9 = v.b(this.viewType, v.b(this.spanSize, this.epoxyModelClass.hashCode() * 31, 31), 31);
            Object obj = this.signature;
            return b9 + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.epoxyModelClass + ", spanSize=" + this.spanSize + ", viewType=" + this.viewType + ", signature=" + this.signature + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadableViewDataProvider(BaseEpoxyAdapter baseEpoxyAdapter, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p) {
        this.adapter = baseEpoxyAdapter;
        this.errorHandler = interfaceC0650p;
    }

    private final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> ViewData<U> buildData(View view, EpoxyModelPreloader<T, U, P> epoxyModelPreloader, T t3) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0) {
            return new ViewData<>(view.getId(), width, height, epoxyModelPreloader.buildViewMetadata(view));
        }
        this.errorHandler.invoke(view.getContext(), new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t3.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
        return null;
    }

    private final <T extends EpoxyModel<?>> CacheKey cacheKey(EpoxyModelPreloader<T, ?, ?> preloader, T epoxyModel, int position) {
        return new CacheKey(epoxyModel.getClass(), this.adapter.isMultiSpan() ? epoxyModel.spanSize(this.adapter.getSpanCount(), position, this.adapter.getItemCount()) : 1, InternalExposerKt.viewTypeInternal(epoxyModel), preloader.viewSignature(epoxyModel));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> List<ViewData<U>> findViewData(EpoxyModelPreloader<T, U, P> preloader, T epoxyModel, CacheKey cacheKey) {
        EpoxyViewHolder epoxyViewHolder;
        View view;
        Iterator<EpoxyViewHolder> it = InternalExposerKt.boundViewHoldersInternal(this.adapter).iterator();
        while (true) {
            if (!it.hasNext()) {
                epoxyViewHolder = null;
                break;
            }
            epoxyViewHolder = it.next();
            EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
            EpoxyModel<?> model = epoxyViewHolder2.getModel();
            if (model.getClass() == epoxyModel.getClass()) {
                View view2 = epoxyViewHolder2.itemView;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                if (view2.isAttachedToWindow() && epoxyViewHolder2.itemView.isLaidOut() && f.b(cacheKey(preloader, model, epoxyViewHolder2.getAdapterPosition()), cacheKey)) {
                    break;
                }
            }
        }
        EpoxyViewHolder epoxyViewHolder3 = epoxyViewHolder;
        if (epoxyViewHolder3 == null || (view = epoxyViewHolder3.itemView) == 0) {
            return null;
        }
        Object objectToBindInternal = InternalExposerKt.objectToBindInternal(epoxyViewHolder3);
        List<View> findViews = preloader.getPreloadableViewIds().isEmpty() ^ true ? findViews(view, preloader.getPreloadableViewIds(), epoxyModel) : view instanceof Preloadable ? ((Preloadable) view).getViewsToPreload() : objectToBindInternal instanceof Preloadable ? ((Preloadable) objectToBindInternal).getViewsToPreload() : EmptyList.f23104a;
        if (findViews.isEmpty()) {
            this.errorHandler.invoke(view.getContext(), new EpoxyPreloadException("No preloadable views were found in ".concat(epoxyModel.getClass().getSimpleName())));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = findViews.iterator();
        while (it2.hasNext()) {
            q.x(arrayList, recursePreloadableViews((View) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ViewData buildData = buildData((View) it3.next(), preloader, epoxyModel);
            if (buildData != null) {
                arrayList2.add(buildData);
            }
        }
        return arrayList2;
    }

    private final <T extends EpoxyModel<?>> List<View> findViews(View view, List<Integer> list, T t3) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            View findViewById = view.findViewById(intValue);
            if (findViewById == null) {
                InterfaceC0650p<Context, RuntimeException, p> interfaceC0650p = this.errorHandler;
                Context context = view.getContext();
                StringBuilder l10 = a.l("View with id ", intValue, " in ");
                l10.append(t3.getClass().getSimpleName());
                l10.append(" could not be found.");
                interfaceC0650p.invoke(context, new EpoxyPreloadException(l10.toString()));
            }
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends View> List<View> recursePreloadableViews(T t3) {
        if (!(t3 instanceof Preloadable)) {
            return Collections.singletonList(t3);
        }
        List<View> viewsToPreload = ((Preloadable) t3).getViewsToPreload();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = viewsToPreload.iterator();
        while (it.hasNext()) {
            q.x(arrayList, recursePreloadableViews((View) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> List<ViewData<U>> dataForModel(EpoxyModelPreloader<T, U, P> preloader, T epoxyModel, int position) {
        CacheKey cacheKey = cacheKey(preloader, epoxyModel, position);
        Map<CacheKey, List<ViewData<?>>> map = this.cache;
        Object obj = map.get(cacheKey);
        if (obj == null) {
            obj = findViewData(preloader, epoxyModel, cacheKey);
            map.put(cacheKey, obj);
        }
        List<ViewData<U>> list = obj instanceof List ? (List) obj : null;
        return list == null ? EmptyList.f23104a : list;
    }

    public final BaseEpoxyAdapter getAdapter() {
        return this.adapter;
    }

    public final InterfaceC0650p<Context, RuntimeException, p> getErrorHandler() {
        return this.errorHandler;
    }
}
