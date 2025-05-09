package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;

/* loaded from: classes.dex */
public abstract class InstallationTokenResult {

    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j10);

        public abstract Builder setTokenExpirationTimestamp(long j10);
    }

    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}
