package io.sentry;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error(Constants.IPC_BUNDLE_KEY_SEND_ERROR),
    Session("session"),
    Attachment("attachment"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    DataCategory(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
