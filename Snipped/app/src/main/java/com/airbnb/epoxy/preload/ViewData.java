package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.ViewMetadata;
import kotlin.Metadata;

/* compiled from: EpoxyPreloader.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\u00020\u0003B+\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/airbnb/epoxy/preload/ViewData;", "U", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "", "viewId", "", "width", "height", "metadata", "(IIILcom/airbnb/epoxy/preload/ViewMetadata;)V", "getHeight", "()I", "getMetadata", "()Lcom/airbnb/epoxy/preload/ViewMetadata;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "getViewId", "getWidth", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewData<U extends ViewMetadata> {
    private final int height;
    private final U metadata;
    private final int viewId;
    private final int width;

    public ViewData(int i, int i9, int i10, U u6) {
        this.viewId = i;
        this.width = i9;
        this.height = i10;
        this.metadata = u6;
    }

    public final int getHeight() {
        return this.height;
    }

    public final U getMetadata() {
        return this.metadata;
    }

    public final int getViewId() {
        return this.viewId;
    }

    public final int getWidth() {
        return this.width;
    }
}
