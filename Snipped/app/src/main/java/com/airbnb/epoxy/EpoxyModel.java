package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyController;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyModel<T> {
    private static long idCounter = -1;
    boolean addedToAdapter;
    EpoxyController controllerToStageTo;
    private boolean currentlyInInterceptors;
    private EpoxyController firstControllerAddedTo;
    private boolean hasDefaultId;
    private int hashCodeWhenAdded;
    private long id;
    private int layout;
    private boolean shown;
    private SpanSizeOverrideCallback spanSizeOverride;

    public interface AddPredicate {
        boolean addIf();
    }

    public interface SpanSizeOverrideCallback {
        int getSpanSize(int i, int i9, int i10);
    }

    public EpoxyModel(long j10) {
        this.shown = true;
        id(j10);
    }

    private static int getPosition(EpoxyController epoxyController, EpoxyModel<?> epoxyModel) {
        return epoxyController.isBuildingModels() ? epoxyController.getFirstIndexOfModelInBuildingList(epoxyModel) : epoxyController.getAdapter().getModelPosition(epoxyModel);
    }

    public void addIf(boolean z10, EpoxyController epoxyController) {
        if (z10) {
            addTo(epoxyController);
            return;
        }
        EpoxyController epoxyController2 = this.controllerToStageTo;
        if (epoxyController2 != null) {
            epoxyController2.clearModelFromStaging(this);
            this.controllerToStageTo = null;
        }
    }

    public void addTo(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
    }

    public final void addWithDebugValidation(EpoxyController epoxyController) {
        if (epoxyController == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (epoxyController.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + epoxyController.getFirstIndexOfModelInBuildingList(this));
        }
        if (this.firstControllerAddedTo == null) {
            this.firstControllerAddedTo = epoxyController;
            this.hashCodeWhenAdded = hashCode();
            epoxyController.addAfterInterceptorCallback(new EpoxyController.ModelInterceptorCallback() { // from class: com.airbnb.epoxy.EpoxyModel.1
                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                public void onInterceptorsFinished(EpoxyController epoxyController2) {
                    EpoxyModel epoxyModel = EpoxyModel.this;
                    epoxyModel.hashCodeWhenAdded = epoxyModel.hashCode();
                    EpoxyModel.this.currentlyInInterceptors = false;
                }

                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                public void onInterceptorsStarted(EpoxyController epoxyController2) {
                    EpoxyModel.this.currentlyInInterceptors = true;
                }
            });
        }
    }

    public void bind(T t3) {
    }

    public View buildView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(getLayout(), viewGroup, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpoxyModel)) {
            return false;
        }
        EpoxyModel epoxyModel = (EpoxyModel) obj;
        return this.id == epoxyModel.id && getViewType() == epoxyModel.getViewType() && this.shown == epoxyModel.shown;
    }

    public abstract int getDefaultLayout();

    public final int getLayout() {
        int i = this.layout;
        return i == 0 ? getDefaultLayout() : i;
    }

    public int getSpanSize(int i, int i9, int i10) {
        return 1;
    }

    public int getViewType() {
        return getLayout();
    }

    public boolean hasDefaultId() {
        return this.hasDefaultId;
    }

    public int hashCode() {
        long j10 = this.id;
        return ((getViewType() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31) + (this.shown ? 1 : 0);
    }

    public EpoxyModel<T> hide() {
        return show(false);
    }

    public long id() {
        return this.id;
    }

    public boolean isDebugValidationEnabled() {
        return this.firstControllerAddedTo != null;
    }

    public boolean isShown() {
        return this.shown;
    }

    public EpoxyModel<T> layout(int i) {
        onMutation();
        this.layout = i;
        return this;
    }

    public boolean onFailedToRecycleView(T t3) {
        return false;
    }

    public final void onMutation() {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors) {
            throw new ImmutableModelException(this, getPosition(this.firstControllerAddedTo, this));
        }
        EpoxyController epoxyController = this.controllerToStageTo;
        if (epoxyController != null) {
            epoxyController.setStagedModel(this);
        }
    }

    public EpoxyModel<T> reset() {
        onMutation();
        this.layout = 0;
        this.shown = true;
        return this;
    }

    public boolean shouldSaveViewState() {
        return false;
    }

    public EpoxyModel<T> show() {
        return show(true);
    }

    public final int spanSize(int i, int i9, int i10) {
        SpanSizeOverrideCallback spanSizeOverrideCallback = this.spanSizeOverride;
        return spanSizeOverrideCallback != null ? spanSizeOverrideCallback.getSpanSize(i, i9, i10) : getSpanSize(i, i9, i10);
    }

    public EpoxyModel<T> spanSizeOverride(SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.spanSizeOverride = spanSizeOverrideCallback;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{id=");
        sb2.append(this.id);
        sb2.append(", viewType=");
        sb2.append(getViewType());
        sb2.append(", shown=");
        sb2.append(this.shown);
        sb2.append(", addedToAdapter=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.addedToAdapter, '}');
    }

    public final void validateStateHasNotChangedSinceAdded(String str, int i) {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors && this.hashCodeWhenAdded != hashCode()) {
            throw new ImmutableModelException(this, str, i);
        }
    }

    public void bind(T t3, List<Object> list) {
        bind(t3);
    }

    public EpoxyModel<T> id(long j10) {
        if ((this.addedToAdapter || this.firstControllerAddedTo != null) && j10 != this.id) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.hasDefaultId = false;
        this.id = j10;
        return this;
    }

    public EpoxyModel<T> show(boolean z10) {
        onMutation();
        this.shown = z10;
        return this;
    }

    public void bind(T t3, EpoxyModel<?> epoxyModel) {
        bind(t3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EpoxyModel() {
        /*
            r4 = this;
            long r0 = com.airbnb.epoxy.EpoxyModel.idCounter
            r2 = 1
            long r2 = r0 - r2
            com.airbnb.epoxy.EpoxyModel.idCounter = r2
            r4.<init>(r0)
            r0 = 1
            r4.hasDefaultId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyModel.<init>():void");
    }

    public void addIf(AddPredicate addPredicate, EpoxyController epoxyController) {
        addIf(addPredicate.addIf(), epoxyController);
    }

    public EpoxyModel<T> id(Number... numberArr) {
        long j10 = 0;
        if (numberArr != null) {
            long j11 = 0;
            for (Number number : numberArr) {
                j11 = (j11 * 31) + IdUtils.hashLong64Bit(number == null ? 0L : r6.hashCode());
            }
            j10 = j11;
        }
        return id(j10);
    }

    public EpoxyModel<T> id(long j10, long j11) {
        return id(IdUtils.hashLong64Bit(j11) + (IdUtils.hashLong64Bit(j10) * 31));
    }

    public EpoxyModel<T> id(CharSequence charSequence) {
        id(IdUtils.hashString64Bit(charSequence));
        return this;
    }

    public EpoxyModel<T> id(CharSequence charSequence, CharSequence... charSequenceArr) {
        long hashString64Bit = IdUtils.hashString64Bit(charSequence);
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                hashString64Bit = (hashString64Bit * 31) + IdUtils.hashString64Bit(charSequence2);
            }
        }
        return id(hashString64Bit);
    }

    public EpoxyModel<T> id(CharSequence charSequence, long j10) {
        id(IdUtils.hashLong64Bit(j10) + (IdUtils.hashString64Bit(charSequence) * 31));
        return this;
    }

    public void onViewAttachedToWindow(T t3) {
    }

    public void onViewDetachedFromWindow(T t3) {
    }

    public void unbind(T t3) {
    }

    public void onVisibilityStateChanged(int i, T t3) {
    }

    public void preBind(T t3, EpoxyModel<?> epoxyModel) {
    }

    public void onVisibilityChanged(float f10, float f11, int i, int i9, T t3) {
    }
}
