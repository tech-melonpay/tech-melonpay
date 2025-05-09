package com.airbnb.epoxy;

import O9.p;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.preload.EpoxyModelPreloader;
import com.airbnb.epoxy.preload.EpoxyPreloader;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EpoxyRecyclerView.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 y2\u00020\u0001:\u0005yz{|}B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0085\u0001\u0010\u001b\u001a\u00020\u0014\"\f\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\n\"\n\b\u0001\u0010\r*\u0004\u0018\u00010\f\"\b\b\u0002\u0010\u000f*\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\u00140\u0011j\u0002`\u00152\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0015¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H\u0016¢\u0006\u0004\b6\u0010\u001eJ\u0017\u00108\u001a\u00020\u00142\b\b\u0001\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u0010%J\u0017\u0010:\u001a\u00020\u00142\b\b\u0001\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010%J\u0019\u0010<\u001a\u00020\u00142\b\b\u0001\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010%J!\u0010?\u001a\u00020\u00142\u0010\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0=H\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00142\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00142\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bE\u0010DJ!\u0010H\u001a\u00020\u00142\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00140F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00142\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0014¢\u0006\u0004\bN\u0010\u001eJ\u000f\u0010O\u001a\u00020\u0014H\u0016¢\u0006\u0004\bO\u0010\u001eJ\u0019\u0010P\u001a\u00020\u00062\b\b\u0001\u00109\u001a\u00020\u0006H\u0005¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u00062\b\b\u0001\u00107\u001a\u00020\u0006H\u0005¢\u0006\u0004\bR\u0010QJ\u001d\u0010U\u001a\u00020\u00142\f\u0010T\u001a\b\u0012\u0002\b\u0003\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00142\f\u0010T\u001a\b\u0012\u0002\b\u0003\u0018\u00010S2\u0006\u0010W\u001a\u00020\u001fH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0014H\u0016¢\u0006\u0004\bZ\u0010\u001eJ\u000f\u0010[\u001a\u00020\u0014H\u0016¢\u0006\u0004\b[\u0010\u001eJ\u000f\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\\\u0010\u001eJ\u000f\u0010]\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u0010\u001eJ\u000f\u0010^\u001a\u00020\u0002H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0014H\u0002¢\u0006\u0004\b`\u0010\u001eJ\u000f\u0010a\u001a\u00020\u0014H\u0002¢\u0006\u0004\ba\u0010\u001eJ\u000f\u0010b\u001a\u00020\u0014H\u0002¢\u0006\u0004\bb\u0010\u001eJ\u000f\u0010c\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u0010\u001eR\u001a\u0010e\u001a\u00020d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010k\u001a\b\u0012\u0002\b\u0003\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010mR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010nR\u0016\u0010o\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010u\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030t0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR&\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030w0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010v¨\u0006~"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "maxPreloadDistance", "Lkotlin/Function2;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "preloader", "Lkotlin/Function0;", "requestHolderFactory", "addPreloader", "(ILca/p;Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lca/a;)V", "clearPreloaders", "()V", "", "removeAdapterWhenDetachedFromWindow", "setRemoveAdapterWhenDetachedFromWindow", "(Z)V", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "(I)V", "init", "Landroidx/recyclerview/widget/RecyclerView$t;", "createViewPool", "()Landroidx/recyclerview/widget/RecyclerView$t;", "shouldShareViewPoolAcrossContext", "()Z", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroidx/recyclerview/widget/RecyclerView$n;", "createLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$n;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$n;)V", "requestLayout", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", "", "models", "setModels", "(Ljava/util/List;)V", "Lcom/airbnb/epoxy/EpoxyController;", "controller", "setController", "(Lcom/airbnb/epoxy/EpoxyController;)V", "setControllerAndBuildModels", "Lkotlin/Function1;", "buildModels", "withModels", "(Lca/l;)V", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "callback", "buildModelsWith", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;)V", "requestModelBuild", "clear", "dpToPx", "(I)I", "resToPx", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "removeAndRecycleExistingViews", "swapAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Z)V", "onAttachedToWindow", "onDetachedFromWindow", "updatePreloaders", "initViewPool", "getContextForSharedViewPool", "()Landroid/content/Context;", "syncSpanCount", "removeAdapter", "clearRemovedAdapterAndCancelRunnable", "clearPoolIfActivityIsDestroyed", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "spacingDecorator", "Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/EpoxyItemSpacingDecorator;", "epoxyController", "Lcom/airbnb/epoxy/EpoxyController;", "removedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Z", "I", "isRemoveAdapterRunnablePosted", "Ljava/lang/Runnable;", "removeAdapterRunnable", "Ljava/lang/Runnable;", "", "Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "preloadScrollListeners", "Ljava/util/List;", "Lcom/airbnb/epoxy/EpoxyRecyclerView$PreloadConfig;", "preloadConfigs", "Companion", "ModelBuilderCallback", "ModelBuilderCallbackController", "PreloadConfig", "WithModelsController", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class EpoxyRecyclerView extends RecyclerView {
    private static final int DEFAULT_ADAPTER_REMOVAL_DELAY_MS = 2000;
    private int delayMsWhenRemovingAdapterOnDetach;
    private EpoxyController epoxyController;
    private boolean isRemoveAdapterRunnablePosted;
    private final List<PreloadConfig<?, ?, ?>> preloadConfigs;
    private final List<EpoxyPreloader<?>> preloadScrollListeners;
    private final Runnable removeAdapterRunnable;
    private boolean removeAdapterWhenDetachedFromWindow;
    private RecyclerView.Adapter<?> removedAdapter;
    private final EpoxyItemSpacingDecorator spacingDecorator;
    private static final ActivityRecyclerPool ACTIVITY_RECYCLER_POOL = new ActivityRecyclerPool();

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "", "Lcom/airbnb/epoxy/EpoxyController;", "controller", "LO9/p;", "buildModels", "(Lcom/airbnb/epoxy/EpoxyController;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public interface ModelBuilderCallback {
        void buildModels(EpoxyController controller);
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/EpoxyController;", "<init>", "()V", "LO9/p;", "buildModels", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallback;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class ModelBuilderCallbackController extends EpoxyController {
        private ModelBuilderCallback callback = new ModelBuilderCallback() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$callback$1
            @Override // com.airbnb.epoxy.EpoxyRecyclerView.ModelBuilderCallback
            public void buildModels(EpoxyController controller) {
            }
        };

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.buildModels(this);
        }

        public final ModelBuilderCallback getCallback() {
            return this.callback;
        }

        public final void setCallback(ModelBuilderCallback modelBuilderCallback) {
            this.callback = modelBuilderCallback;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007BY\u0012\u0006\u0010\t\u001a\u00020\b\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R1\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\nj\u0002`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$PreloadConfig;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "", "maxPreload", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LO9/p;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "preloader", "Lkotlin/Function0;", "requestHolderFactory", "<init>", "(ILca/p;Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;Lca/a;)V", "I", "getMaxPreload", "()I", "Lca/p;", "getErrorHandler", "()Lca/p;", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "getPreloader", "()Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lca/a;", "getRequestHolderFactory", "()Lca/a;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class PreloadConfig<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {
        private final InterfaceC0650p<Context, RuntimeException, p> errorHandler;
        private final int maxPreload;
        private final EpoxyModelPreloader<T, U, P> preloader;
        private final InterfaceC0635a<P> requestHolderFactory;

        /* JADX WARN: Multi-variable type inference failed */
        public PreloadConfig(int i, InterfaceC0650p<? super Context, ? super RuntimeException, p> interfaceC0650p, EpoxyModelPreloader<T, U, P> epoxyModelPreloader, InterfaceC0635a<? extends P> interfaceC0635a) {
            this.maxPreload = i;
            this.errorHandler = interfaceC0650p;
            this.preloader = epoxyModelPreloader;
            this.requestHolderFactory = interfaceC0635a;
        }

        public final InterfaceC0650p<Context, RuntimeException, p> getErrorHandler() {
            return this.errorHandler;
        }

        public final int getMaxPreload() {
            return this.maxPreload;
        }

        public final EpoxyModelPreloader<T, U, P> getPreloader() {
            return this.preloader;
        }

        public final InterfaceC0635a<P> getRequestHolderFactory() {
            return this.requestHolderFactory;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/EpoxyController;", "<init>", "()V", "LO9/p;", "buildModels", "Lkotlin/Function1;", "callback", "Lca/l;", "getCallback", "()Lca/l;", "setCallback", "(Lca/l;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class WithModelsController extends EpoxyController {
        private InterfaceC0646l<? super EpoxyController, p> callback = new InterfaceC0646l<EpoxyController, p>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$callback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EpoxyController epoxyController) {
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(EpoxyController epoxyController) {
                invoke2(epoxyController);
                return p.f3034a;
            }
        };

        @Override // com.airbnb.epoxy.EpoxyController
        public void buildModels() {
            this.callback.invoke(this);
        }

        public final InterfaceC0646l<EpoxyController, p> getCallback() {
            return this.callback;
        }

        public final void setCallback(InterfaceC0646l<? super EpoxyController, p> interfaceC0646l) {
            this.callback = interfaceC0646l;
        }
    }

    public EpoxyRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void addPreloader$default(EpoxyRecyclerView epoxyRecyclerView, int i, InterfaceC0650p interfaceC0650p, EpoxyModelPreloader epoxyModelPreloader, InterfaceC0635a interfaceC0635a, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPreloader");
        }
        if ((i9 & 1) != 0) {
            i = 3;
        }
        epoxyRecyclerView.addPreloader(i, interfaceC0650p, epoxyModelPreloader, interfaceC0635a);
    }

    private final void clearPoolIfActivityIsDestroyed() {
        if (ActivityRecyclerPoolKt.isActivityDestroyed(getContext())) {
            getRecycledViewPool().clear();
        }
    }

    private final void clearRemovedAdapterAndCancelRunnable() {
        this.removedAdapter = null;
        if (this.isRemoveAdapterRunnablePosted) {
            removeCallbacks(this.removeAdapterRunnable);
            this.isRemoveAdapterRunnablePosted = false;
        }
    }

    private final Context getContextForSharedViewPool() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        return getContext();
    }

    private final void initViewPool() {
        if (shouldShareViewPoolAcrossContext()) {
            setRecycledViewPool(ACTIVITY_RECYCLER_POOL.getPool(getContextForSharedViewPool(), new InterfaceC0635a<RecyclerView.t>() { // from class: com.airbnb.epoxy.EpoxyRecyclerView$initViewPool$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // ca.InterfaceC0635a
                public final RecyclerView.t invoke() {
                    return EpoxyRecyclerView.this.createViewPool();
                }
            }).getViewPool());
        } else {
            setRecycledViewPool(createViewPool());
        }
    }

    private final void removeAdapter() {
        RecyclerView.Adapter<?> adapter = getAdapter();
        if (adapter != null) {
            swapAdapter(null, true);
            this.removedAdapter = adapter;
        }
        clearPoolIfActivityIsDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAdapterRunnable$lambda$0(EpoxyRecyclerView epoxyRecyclerView) {
        if (epoxyRecyclerView.isRemoveAdapterRunnablePosted) {
            epoxyRecyclerView.isRemoveAdapterRunnablePosted = false;
            epoxyRecyclerView.removeAdapter();
        }
    }

    private final void syncSpanCount() {
        RecyclerView.n layoutManager = getLayoutManager();
        EpoxyController epoxyController = this.epoxyController;
        if (!(layoutManager instanceof GridLayoutManager) || epoxyController == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (epoxyController.getSpanCount() == gridLayoutManager.f7414b && gridLayoutManager.f7419g == epoxyController.getSpanSizeLookup()) {
            return;
        }
        epoxyController.setSpanCount(gridLayoutManager.f7414b);
        gridLayoutManager.f7419g = epoxyController.getSpanSizeLookup();
    }

    private final void updatePreloaders() {
        EpoxyPreloader<?> with;
        Iterator<T> it = this.preloadScrollListeners.iterator();
        while (it.hasNext()) {
            removeOnScrollListener((EpoxyPreloader) it.next());
        }
        this.preloadScrollListeners.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return;
        }
        Iterator<T> it2 = this.preloadConfigs.iterator();
        while (it2.hasNext()) {
            PreloadConfig preloadConfig = (PreloadConfig) it2.next();
            if (adapter instanceof EpoxyAdapter) {
                with = EpoxyPreloader.INSTANCE.with((EpoxyAdapter) adapter, preloadConfig.getRequestHolderFactory(), preloadConfig.getErrorHandler(), preloadConfig.getMaxPreload(), Collections.singletonList(preloadConfig.getPreloader()));
            } else {
                EpoxyController epoxyController = this.epoxyController;
                with = epoxyController != null ? EpoxyPreloader.INSTANCE.with(epoxyController, preloadConfig.getRequestHolderFactory(), preloadConfig.getErrorHandler(), preloadConfig.getMaxPreload(), Collections.singletonList(preloadConfig.getPreloader())) : null;
            }
            if (with != null) {
                this.preloadScrollListeners.add(with);
                addOnScrollListener(with);
            }
        }
    }

    public final <T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> void addPreloader(int maxPreloadDistance, InterfaceC0650p<? super Context, ? super RuntimeException, p> errorHandler, EpoxyModelPreloader<T, U, P> preloader, InterfaceC0635a<? extends P> requestHolderFactory) {
        this.preloadConfigs.add(new PreloadConfig<>(maxPreloadDistance, errorHandler, preloader, requestHolderFactory));
        updatePreloaders();
    }

    public final void buildModelsWith(ModelBuilderCallback callback) {
        EpoxyController epoxyController = this.epoxyController;
        ModelBuilderCallbackController modelBuilderCallbackController = epoxyController instanceof ModelBuilderCallbackController ? (ModelBuilderCallbackController) epoxyController : null;
        if (modelBuilderCallbackController == null) {
            modelBuilderCallbackController = new ModelBuilderCallbackController();
            setController(modelBuilderCallbackController);
        }
        modelBuilderCallbackController.setCallback(callback);
        modelBuilderCallbackController.requestModelBuild();
    }

    public void clear() {
        EpoxyController epoxyController = this.epoxyController;
        if (epoxyController != null) {
            epoxyController.cancelPendingModelBuild();
        }
        this.epoxyController = null;
        swapAdapter(null, true);
    }

    public final void clearPreloaders() {
        this.preloadConfigs.clear();
        updatePreloaders();
    }

    public RecyclerView.n createLayoutManager() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = layoutParams.height;
        if (i != -1 && i != 0) {
            return new LinearLayoutManager(getContext(), 0, false);
        }
        int i9 = layoutParams.width;
        if (i9 == -1 || i9 == 0) {
            setHasFixedSize(true);
        }
        return new LinearLayoutManager(getContext());
    }

    public RecyclerView.t createViewPool() {
        return new UnboundedViewPool();
    }

    public final int dpToPx(int dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    public final EpoxyItemSpacingDecorator getSpacingDecorator() {
        return this.spacingDecorator;
    }

    public void init() {
        setClipToPadding(false);
        initViewPool();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter<?> adapter = this.removedAdapter;
        if (adapter != null) {
            swapAdapter(adapter, false);
        }
        clearRemovedAdapterAndCancelRunnable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.preloadScrollListeners.iterator();
        while (it.hasNext()) {
            ((EpoxyPreloader) it.next()).cancelPreloadRequests();
        }
        if (this.removeAdapterWhenDetachedFromWindow) {
            int i = this.delayMsWhenRemovingAdapterOnDetach;
            if (i > 0) {
                this.isRemoveAdapterRunnablePosted = true;
                postDelayed(this.removeAdapterRunnable, i);
            } else {
                removeAdapter();
            }
        }
        clearPoolIfActivityIsDestroyed();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        syncSpanCount();
        super.requestLayout();
    }

    public final void requestModelBuild() {
        EpoxyController epoxyController = this.epoxyController;
        if (epoxyController == null) {
            throw new IllegalStateException("A controller must be set before requesting a model build.");
        }
        if (epoxyController instanceof SimpleEpoxyController) {
            throw new IllegalStateException("Models were set with #setModels, they can not be rebuilt.");
        }
        epoxyController.requestModelBuild();
    }

    public final int resToPx(int itemSpacingRes) {
        return getResources().getDimensionPixelOffset(itemSpacingRes);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void setController(EpoxyController controller) {
        this.epoxyController = controller;
        setAdapter(controller.getAdapter());
        syncSpanCount();
    }

    public final void setControllerAndBuildModels(EpoxyController controller) {
        controller.requestModelBuild();
        setController(controller);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int delayMsWhenRemovingAdapterOnDetach) {
        this.delayMsWhenRemovingAdapterOnDetach = delayMsWhenRemovingAdapterOnDetach;
    }

    public final void setItemSpacingDp(int dp) {
        setItemSpacingPx(dpToPx(dp));
    }

    public void setItemSpacingPx(int spacingPx) {
        removeItemDecoration(this.spacingDecorator);
        this.spacingDecorator.setPxBetweenItems(spacingPx);
        if (spacingPx > 0) {
            addItemDecoration(this.spacingDecorator);
        }
    }

    public final void setItemSpacingRes(int itemSpacingRes) {
        setItemSpacingPx(resToPx(itemSpacingRes));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.n layout) {
        super.setLayoutManager(layout);
        syncSpanCount();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        boolean z10 = getLayoutParams() == null;
        super.setLayoutParams(params);
        if (z10 && getLayoutManager() == null) {
            setLayoutManager(createLayoutManager());
        }
    }

    public void setModels(List<? extends EpoxyModel<?>> models) {
        EpoxyController epoxyController = this.epoxyController;
        SimpleEpoxyController simpleEpoxyController = epoxyController instanceof SimpleEpoxyController ? (SimpleEpoxyController) epoxyController : null;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(models);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean removeAdapterWhenDetachedFromWindow) {
        this.removeAdapterWhenDetachedFromWindow = removeAdapterWhenDetachedFromWindow;
    }

    public boolean shouldShareViewPoolAcrossContext() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter<?> adapter, boolean removeAndRecycleExistingViews) {
        super.swapAdapter(adapter, removeAndRecycleExistingViews);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void withModels(InterfaceC0646l<? super EpoxyController, p> buildModels) {
        EpoxyController epoxyController = this.epoxyController;
        WithModelsController withModelsController = epoxyController instanceof WithModelsController ? (WithModelsController) epoxyController : null;
        if (withModelsController == null) {
            withModelsController = new WithModelsController();
            setController(withModelsController);
        }
        withModelsController.setCallback(buildModels);
        withModelsController.requestModelBuild();
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i);
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.spacingDecorator = new EpoxyItemSpacingDecorator();
        this.removeAdapterWhenDetachedFromWindow = true;
        this.delayMsWhenRemovingAdapterOnDetach = DEFAULT_ADAPTER_REMOVAL_DELAY_MS;
        this.removeAdapterRunnable = new RunnableC0615f(this, 2);
        this.preloadScrollListeners = new ArrayList();
        this.preloadConfigs = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G1.a.f1307a, i, 0);
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
        init();
    }
}
