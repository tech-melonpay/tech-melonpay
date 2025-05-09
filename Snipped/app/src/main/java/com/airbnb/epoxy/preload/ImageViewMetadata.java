package com.airbnb.epoxy.preload;

import android.widget.ImageView;
import kotlin.Metadata;

/* compiled from: EpoxyPreloader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/preload/ImageViewMetadata;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "(Landroid/widget/ImageView$ScaleType;)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ImageViewMetadata implements ViewMetadata {
    private final ImageView.ScaleType scaleType;

    public ImageViewMetadata(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }
}
