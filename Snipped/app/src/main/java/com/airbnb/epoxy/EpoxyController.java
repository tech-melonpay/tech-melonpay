package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class EpoxyController implements ModelCollector, StickyHeaderCallbacks {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final Timer NO_OP_TIMER = new NoOpTimer();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static ExceptionHandler globalExceptionHandler;
    private final EpoxyControllerAdapter adapter;
    private final Runnable buildModelsRunnable;
    private EpoxyDiffLogger debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final ControllerHelper helper;
    private final List<Interceptor> interceptors;
    private final Handler modelBuildHandler;
    private List<ModelInterceptorCallback> modelInterceptorCallbacks;
    private ControllerModelList modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private EpoxyModel<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private Timer timer;

    public interface ExceptionHandler {
        void onException(EpoxyController epoxyController, RuntimeException runtimeException);
    }

    public interface Interceptor {
        void intercept(List<EpoxyModel<?>> list);
    }

    public interface ModelInterceptorCallback {
        void onInterceptorsFinished(EpoxyController epoxyController);

        void onInterceptorsStarted(EpoxyController epoxyController);
    }

    static {
        Handler handler = MainThreadExecutor.INSTANCE.handler;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new ExceptionHandler() { // from class: com.airbnb.epoxy.EpoxyController.2
            @Override // com.airbnb.epoxy.EpoxyController.ExceptionHandler
            public void onException(EpoxyController epoxyController, RuntimeException runtimeException) {
            }
        };
    }

    public EpoxyController() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<EpoxyModel<?>> list) {
        if (this.filterDuplicates) {
            this.timer.start("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<EpoxyModel<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                EpoxyModel<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.id()))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    EpoxyModel<?> epoxyModel = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + epoxyModel + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.stop();
        }
    }

    private int findPositionOfDuplicate(List<EpoxyModel<?>> list, EpoxyModel<?> epoxyModel) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).id() == epoxyModel.id()) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<ModelInterceptorCallback> list = this.modelInterceptorCallbacks;
            if (list != null) {
                Iterator<ModelInterceptorCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onInterceptorsStarted(this);
                }
            }
            this.timer.start("Interceptors executed");
            Iterator<Interceptor> it2 = this.interceptors.iterator();
            while (it2.hasNext()) {
                it2.next().intercept(this.modelsBeingBuilt);
            }
            this.timer.stop();
            List<ModelInterceptorCallback> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                Iterator<ModelInterceptorCallback> it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next().onInterceptorsFinished(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z10) {
        globalDebugLoggingEnabled = z10;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z10) {
        filterDuplicatesDefault = z10;
    }

    public static void setGlobalExceptionHandler(ExceptionHandler exceptionHandler) {
        globalExceptionHandler = exceptionHandler;
    }

    @Override // com.airbnb.epoxy.ModelCollector
    public void add(EpoxyModel<?> epoxyModel) {
        epoxyModel.addTo(this);
    }

    public void addAfterInterceptorCallback(ModelInterceptorCallback modelInterceptorCallback) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(modelInterceptorCallback);
    }

    public void addCurrentlyStagedModelIfExists() {
        EpoxyModel<?> epoxyModel = this.stagedModel;
        if (epoxyModel != null) {
            epoxyModel.addTo(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(Interceptor interceptor) {
        this.interceptors.add(interceptor);
    }

    public void addInternal(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        if (epoxyModel.hasDefaultId()) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!epoxyModel.isShown()) {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(epoxyModel);
        epoxyModel.controllerToStageTo = null;
        this.modelsBeingBuilt.add(epoxyModel);
    }

    public void addModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.addModelBuildListener(onModelBuildFinishedListener);
    }

    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public void clearModelFromStaging(EpoxyModel<?> epoxyModel) {
        if (this.stagedModel != epoxyModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public EpoxyControllerAdapter getAdapter() {
        return this.adapter;
    }

    public int getFirstIndexOfModelInBuildingList(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == epoxyModel) {
                return i;
            }
        }
        return -1;
    }

    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.getSpanCount();
    }

    public GridLayoutManager.c getSpanSizeLookup() {
        return this.adapter.getSpanSizeLookup();
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.isDiffInProgress()) ? false : true;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isModelAddedMultipleTimes(EpoxyModel<?> epoxyModel) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i9 = 0; i9 < size; i9++) {
            if (this.modelsBeingBuilt.get(i9) == epoxyModel) {
                i++;
            }
        }
        return i > 1;
    }

    public boolean isMultiSpan() {
        return this.adapter.isMultiSpan();
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        return false;
    }

    public void moveModel(int i, int i9) {
        assertNotBuildingModels();
        this.adapter.moveModel(i, i9);
        requestDelayedModelBuild(ServiceStarter.ERROR_UNKNOWN);
    }

    public void notifyModelChanged(int i) {
        assertNotBuildingModels();
        this.adapter.notifyModelChanged(i);
    }

    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            MainThreadExecutor.INSTANCE.handler.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.3
                @Override // java.lang.Runnable
                public void run() {
                    if (EpoxyController.this.recyclerViewAttachCount > 1) {
                        EpoxyController.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, 3000L);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    public void onExceptionSwallowed(RuntimeException runtimeException) {
        globalExceptionHandler.onException(this, runtimeException);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.adapter.onRestoreInstanceState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.adapter.onSaveInstanceState(bundle);
    }

    public void removeInterceptor(Interceptor interceptor) {
        this.interceptors.remove(interceptor);
    }

    public void removeModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.adapter.removeModelBuildListener(onModelBuildFinishedListener);
    }

    public synchronized void requestDelayedModelBuild(int i) {
        try {
            if (isBuildingModels()) {
                throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
            }
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            this.requestedModelBuildType = i != 0 ? 2 : 1;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z10) {
        assertNotBuildingModels();
        if (z10) {
            this.timer = new DebugTimer(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new EpoxyDiffLogger(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        EpoxyDiffLogger epoxyDiffLogger = this.debugObserver;
        if (epoxyDiffLogger != null) {
            this.adapter.unregisterAdapterDataObserver(epoxyDiffLogger);
        }
    }

    public void setFilterDuplicates(boolean z10) {
        this.filterDuplicates = z10;
    }

    public void setSpanCount(int i) {
        this.adapter.setSpanCount(i);
    }

    public void setStagedModel(EpoxyModel<?> epoxyModel) {
        if (epoxyModel != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = epoxyModel;
    }

    public EpoxyController(Handler handler, Handler handler2) {
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = ControllerHelperLookup.getHelperForController(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() { // from class: com.airbnb.epoxy.EpoxyController.1
            @Override // java.lang.Runnable
            public void run() {
                EpoxyController.this.threadBuildingModels = Thread.currentThread();
                EpoxyController.this.cancelPendingModelBuild();
                EpoxyController.this.helper.resetAutoModels();
                EpoxyController.this.modelsBeingBuilt = new ControllerModelList(EpoxyController.this.getExpectedModelCount());
                EpoxyController.this.timer.start("Models built");
                try {
                    EpoxyController.this.buildModels();
                    EpoxyController.this.addCurrentlyStagedModelIfExists();
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.runInterceptors();
                    EpoxyController epoxyController = EpoxyController.this;
                    epoxyController.filterDuplicatesIfNeeded(epoxyController.modelsBeingBuilt);
                    EpoxyController.this.modelsBeingBuilt.freeze();
                    EpoxyController.this.timer.start("Models diffed");
                    EpoxyController.this.adapter.setModels(EpoxyController.this.modelsBeingBuilt);
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                } catch (Throwable th) {
                    EpoxyController.this.timer.stop();
                    EpoxyController.this.modelsBeingBuilt = null;
                    EpoxyController.this.hasBuiltModelsEver = true;
                    EpoxyController.this.threadBuildingModels = null;
                    EpoxyController.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new EpoxyControllerAdapter(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void add(EpoxyModel<?>... epoxyModelArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + epoxyModelArr.length);
        for (EpoxyModel<?> epoxyModel : epoxyModelArr) {
            add(epoxyModel);
        }
    }

    public void add(List<? extends EpoxyModel<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(list.size() + controllerModelList.size());
        Iterator<? extends EpoxyModel<?>> it = list.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
    }

    public void onModelUnbound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
    }

    public void onViewAttachedToWindow(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
    }

    public void onViewDetachedFromWindow(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
    }

    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i, EpoxyModel<?> epoxyModel2) {
    }
}
