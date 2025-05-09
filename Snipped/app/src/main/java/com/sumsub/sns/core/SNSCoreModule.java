package com.sumsub.sns.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/core/SNSCoreModule;", "Lcom/sumsub/sns/core/SNSModule;", "feature", "", "(I)V", "isFullScreenCamera", "", "()Z", "isSkipGeolocationForm", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SNSCoreModule extends SNSModule {

    @Keep
    public static final int FEATURE_FULLSCREEN_CAMERA = 4;

    @Keep
    public static final int FEATURE_SKIP_GEOLOCATION_FORM = 2;
    private final int feature;

    public SNSCoreModule() {
        this(0, 1, null);
    }

    public final boolean isFullScreenCamera() {
        return (this.feature & 4) != 0;
    }

    public final boolean isSkipGeolocationForm() {
        return (this.feature & 2) != 0;
    }

    public /* synthetic */ SNSCoreModule(int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i);
    }

    public SNSCoreModule(int i) {
        super("Core module");
        this.feature = i;
    }
}
