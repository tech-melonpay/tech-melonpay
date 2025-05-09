package com.airbnb.epoxy.utils;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005¨\u0006\u0006"}, d2 = {"isDebuggable", "", "Landroid/content/Context;", "isDebuggable$annotations", "(Landroid/content/Context;)V", "(Landroid/content/Context;)Z", "epoxy-adapter_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final boolean isDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static /* synthetic */ void isDebuggable$annotations(Context context) {
    }
}
