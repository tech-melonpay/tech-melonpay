package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i9, List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i, String str2, String str3, String str4, int i9, List<String> list, long j10) {
    }

    @KeepForSdk
    public void registerReleaseEvent(Context context, Intent intent) {
    }

    @KeepForSdk
    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i, String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i, List<String> list, boolean z10, long j10) {
    }
}
