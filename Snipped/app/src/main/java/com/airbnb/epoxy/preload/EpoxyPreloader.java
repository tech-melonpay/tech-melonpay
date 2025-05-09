package com.airbnb.epoxy.preload;

import O9.p;
import P9.n;
import P9.s;
import P9.z;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.EpoxyAdapter;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.InternalExposerKt;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import ha.C0804c;
import ha.C0806e;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: EpoxyPreloader.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 H*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001HBg\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015Bg\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0019Bg\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u001a\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\bj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u001c*\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u001eJ\u0013\u0010&\u001a\u00020\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010>\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R<\u0010\u0013\u001a*\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030A0@\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00120?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "Landroidx/recyclerview/widget/RecyclerView$s;", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "adapter", "Lkotlin/Function0;", "preloadTargetFactory", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "", "maxItemsToPreload", "", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "modelPreloaders", "<init>", "(Lcom/airbnb/epoxy/BaseEpoxyAdapter;Lca/a;Lca/p;ILjava/util/List;)V", "Lcom/airbnb/epoxy/EpoxyController;", "epoxyController", "requestHolderFactory", "(Lcom/airbnb/epoxy/EpoxyController;Lca/a;Lca/p;ILjava/util/List;)V", "Lcom/airbnb/epoxy/EpoxyAdapter;", "(Lcom/airbnb/epoxy/EpoxyAdapter;Lca/a;Lca/p;ILjava/util/List;)V", "", "isFling", "(I)Z", "firstVisiblePosition", "lastVisiblePosition", "isIncreasing", "Lha/c;", "calculatePreloadRange", "(IIZ)Lha/c;", "isInvalid", "clampToAdapterRange", "(I)I", "position", "preloadAdapterPosition", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "cancelPreloadRequests", "()V", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "I", "Lha/e;", "lastVisibleRange", "Lha/e;", "lastPreloadRange", "Lha/c;", "totalItemCount", "scrollState", "", "Ljava/lang/Class;", "Lcom/airbnb/epoxy/EpoxyModel;", "Ljava/util/Map;", "Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "viewDataCache", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EpoxyPreloader<P extends PreloadRequestHolder> extends RecyclerView.s {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int FLING_THRESHOLD_PX = 75;
    private final BaseEpoxyAdapter adapter;
    private C0804c lastPreloadRange;
    private C0806e lastVisibleRange;
    private final int maxItemsToPreload;
    private final Map<Class<? extends EpoxyModel<?>>, EpoxyModelPreloader<?, ?, ? extends P>> modelPreloaders;
    private final PreloadTargetProvider<P> requestHolderFactory;
    private int scrollState;
    private int totalItemCount;
    private final PreloadableViewDataProvider viewDataCache;

    /* compiled from: EpoxyPreloader.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112$\u0010\u0016\u001a \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0012\u0006\b\u0001\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0089\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112*\u0010\u001b\u001a&\u0012\"\u0012 \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0012\u0006\b\u0001\u0012\u00028\u00010\u00130\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0089\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0001\u0010\u0005*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112*\u0010\u001b\u001a&\u0012\"\u0012 \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0012\u0006\b\u0001\u0012\u00028\u00010\u00130\u001a¢\u0006\u0004\b\u0018\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader$Companion;", "", "<init>", "()V", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "Lcom/airbnb/epoxy/EpoxyController;", "epoxyController", "Lkotlin/Function0;", "requestHolderFactory", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "", "maxItemsToPreload", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lcom/airbnb/epoxy/EpoxyModel;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "modelPreloader", "Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "with", "(Lcom/airbnb/epoxy/EpoxyController;Lca/a;Lca/p;ILcom/airbnb/epoxy/preload/EpoxyModelPreloader;)Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "", "modelPreloaders", "(Lcom/airbnb/epoxy/EpoxyController;Lca/a;Lca/p;ILjava/util/List;)Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "Lcom/airbnb/epoxy/EpoxyAdapter;", "epoxyAdapter", "(Lcom/airbnb/epoxy/EpoxyAdapter;Lca/a;Lca/p;ILjava/util/List;)Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "FLING_THRESHOLD_PX", "I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final <P extends PreloadRequestHolder> EpoxyPreloader<P> with(EpoxyController epoxyController, InterfaceC0635a<? extends P> requestHolderFactory, InterfaceC0650p<? super Context, ? super RuntimeException, p> errorHandler, int maxItemsToPreload, EpoxyModelPreloader<? extends EpoxyModel<?>, ? extends ViewMetadata, ? extends P> modelPreloader) {
            return with(epoxyController, requestHolderFactory, errorHandler, maxItemsToPreload, Collections.singletonList(modelPreloader));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <P extends PreloadRequestHolder> EpoxyPreloader<P> with(EpoxyController epoxyController, InterfaceC0635a<? extends P> requestHolderFactory, InterfaceC0650p<? super Context, ? super RuntimeException, p> errorHandler, int maxItemsToPreload, List<? extends EpoxyModelPreloader<? extends EpoxyModel<?>, ? extends ViewMetadata, ? extends P>> modelPreloaders) {
            return new EpoxyPreloader<>(epoxyController, requestHolderFactory, errorHandler, maxItemsToPreload, modelPreloaders);
        }

        public final <P extends PreloadRequestHolder> EpoxyPreloader<P> with(EpoxyAdapter epoxyAdapter, InterfaceC0635a<? extends P> requestHolderFactory, InterfaceC0650p<? super Context, ? super RuntimeException, p> errorHandler, int maxItemsToPreload, List<? extends EpoxyModelPreloader<? extends EpoxyModel<?>, ? extends ViewMetadata, ? extends P>> modelPreloaders) {
            return new EpoxyPreloader<>(epoxyAdapter, (InterfaceC0635a) requestHolderFactory, errorHandler, maxItemsToPreload, (List) modelPreloaders);
        }
    }

    private EpoxyPreloader(BaseEpoxyAdapter baseEpoxyAdapter, InterfaceC0635a<? extends P> interfaceC0635a, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p, int i, List<? extends EpoxyModelPreloader<?, ?, ? extends P>> list) {
        this.adapter = baseEpoxyAdapter;
        this.maxItemsToPreload = i;
        C0806e c0806e = C0806e.f21233d;
        C0806e c0806e2 = C0806e.f21233d;
        this.lastVisibleRange = c0806e2;
        this.lastPreloadRange = c0806e2;
        this.totalItemCount = -1;
        List<? extends EpoxyModelPreloader<?, ?, ? extends P>> list2 = list;
        int n10 = z.n(n.u(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n10 < 16 ? 16 : n10);
        for (Object obj : list2) {
            linkedHashMap.put(((EpoxyModelPreloader) obj).getModelType(), obj);
        }
        this.modelPreloaders = linkedHashMap;
        this.requestHolderFactory = new PreloadTargetProvider<>(this.maxItemsToPreload, interfaceC0635a);
        this.viewDataCache = new PreloadableViewDataProvider(this.adapter, interfaceC0650p);
        if (this.maxItemsToPreload > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.maxItemsToPreload).toString());
    }

    private final C0804c calculatePreloadRange(int firstVisiblePosition, int lastVisiblePosition, boolean isIncreasing) {
        int i = isIncreasing ? lastVisiblePosition + 1 : firstVisiblePosition - 1;
        int i9 = this.maxItemsToPreload;
        return new C0804c(clampToAdapterRange(i), clampToAdapterRange((isIncreasing ? i9 - 1 : 1 - i9) + i), isIncreasing ? 1 : -1);
    }

    private final int clampToAdapterRange(int i) {
        return Math.min(this.totalItemCount - 1, Math.max(i, 0));
    }

    private final boolean isFling(int i) {
        return Math.abs(i) > 75;
    }

    private final boolean isInvalid(int i) {
        return i == -1 || i >= this.totalItemCount;
    }

    private final void preloadAdapterPosition(int position) {
        EpoxyModel<?> modelForPositionInternal = InternalExposerKt.getModelForPositionInternal(this.adapter, position);
        if (!(modelForPositionInternal instanceof EpoxyModel)) {
            modelForPositionInternal = null;
        }
        if (modelForPositionInternal == null) {
            return;
        }
        EpoxyModelPreloader<?, ?, ? extends P> epoxyModelPreloader = this.modelPreloaders.get(modelForPositionInternal.getClass());
        EpoxyModelPreloader<?, ?, ? extends P> epoxyModelPreloader2 = epoxyModelPreloader instanceof EpoxyModelPreloader ? epoxyModelPreloader : null;
        if (epoxyModelPreloader2 == null) {
            return;
        }
        Iterator it = this.viewDataCache.dataForModel(epoxyModelPreloader2, modelForPositionInternal, position).iterator();
        while (it.hasNext()) {
            epoxyModelPreloader2.startPreload(modelForPositionInternal, this.requestHolderFactory.next$epoxy_adapter_release(), (ViewData) it.next());
        }
    }

    public final void cancelPreloadRequests() {
        this.requestHolderFactory.clearAll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        this.scrollState = newState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        if ((dx == 0 && dy == 0) || isFling(dx) || isFling(dy)) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.totalItemCount = adapter != null ? adapter.getItemCount() : 0;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (isInvalid(findFirstVisibleItemPosition) || isInvalid(findLastVisibleItemPosition)) {
            C0806e c0806e = C0806e.f21233d;
            this.lastVisibleRange = c0806e;
            this.lastPreloadRange = c0806e;
            return;
        }
        C0806e c0806e2 = new C0806e(findFirstVisibleItemPosition, findLastVisibleItemPosition, 1);
        if (f.b(c0806e2, this.lastVisibleRange)) {
            return;
        }
        C0806e c0806e3 = this.lastVisibleRange;
        C0804c calculatePreloadRange = calculatePreloadRange(findFirstVisibleItemPosition, findLastVisibleItemPosition, findFirstVisibleItemPosition > c0806e3.f21226a || c0806e2.f21227b > c0806e3.f21227b);
        Iterable iterable = this.lastPreloadRange;
        Set f02 = s.f0(calculatePreloadRange);
        if (!(iterable instanceof Collection)) {
            iterable = s.c0(iterable);
        }
        f02.removeAll((Collection) iterable);
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            preloadAdapterPosition(((Number) it.next()).intValue());
        }
        this.lastVisibleRange = c0806e2;
        this.lastPreloadRange = calculatePreloadRange;
    }

    public EpoxyPreloader(EpoxyController epoxyController, InterfaceC0635a<? extends P> interfaceC0635a, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p, int i, List<? extends EpoxyModelPreloader<?, ?, ? extends P>> list) {
        this(epoxyController.getAdapter(), interfaceC0635a, interfaceC0650p, i, list);
    }

    public EpoxyPreloader(EpoxyAdapter epoxyAdapter, InterfaceC0635a<? extends P> interfaceC0635a, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p, int i, List<? extends EpoxyModelPreloader<?, ?, ? extends P>> list) {
        this((BaseEpoxyAdapter) epoxyAdapter, (InterfaceC0635a) interfaceC0635a, interfaceC0650p, i, (List) list);
    }
}
