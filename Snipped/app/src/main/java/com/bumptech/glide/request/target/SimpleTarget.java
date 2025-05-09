package com.bumptech.glide.request.target;

import com.bumptech.glide.util.Util;
import s3.b;

@Deprecated
/* loaded from: classes.dex */
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {
    private final int height;
    private final int width;

    public SimpleTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        if (Util.isValidDimensions(this.width, this.height)) {
            sizeReadyCallback.onSizeReady(this.width, this.height);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb2.append(this.width);
        sb2.append(" and height: ");
        throw new IllegalArgumentException(b.m(sb2, this.height, ", either provide dimensions in the constructor or call override()"));
    }

    public SimpleTarget(int i, int i9) {
        this.width = i;
        this.height = i9;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }
}
