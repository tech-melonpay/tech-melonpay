package com.airbnb.epoxy.preload;

import android.view.View;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Preloadable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/preload/Preloadable;", "", "viewsToPreload", "", "Landroid/view/View;", "getViewsToPreload", "()Ljava/util/List;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Preloadable {
    List<View> getViewsToPreload();
}
