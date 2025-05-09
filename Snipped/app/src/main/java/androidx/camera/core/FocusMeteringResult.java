package androidx.camera.core;

/* loaded from: classes.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    private FocusMeteringResult(boolean z10) {
        this.mIsFocusSuccessful = z10;
    }

    public static FocusMeteringResult create(boolean z10) {
        return new FocusMeteringResult(z10);
    }

    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
