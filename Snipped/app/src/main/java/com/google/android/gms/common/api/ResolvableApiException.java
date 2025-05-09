package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(Activity activity, int i) {
        getStatus().startResolutionForResult(activity, i);
    }
}
