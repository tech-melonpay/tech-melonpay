package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;

/* loaded from: classes.dex */
public interface FirebaseInstallationsApi {
    Task<Void> delete();

    Task<String> getId();

    Task<InstallationTokenResult> getToken(boolean z10);

    @DeferredApi
    FidListenerHandle registerFidListener(FidListener fidListener);
}
