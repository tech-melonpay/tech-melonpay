package com.google.android.datatransport.cct.internal;

import i2.AbstractC0809a;

/* loaded from: classes.dex */
public abstract class ClientInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ClientType {

        /* renamed from: a, reason: collision with root package name */
        public static final ClientType f8905a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ClientType[] f8906b;

        /* JADX INFO: Fake field, exist only in values array */
        ClientType EF0;

        static {
            ClientType clientType = new ClientType("UNKNOWN", 0);
            ClientType clientType2 = new ClientType("ANDROID_FIREBASE", 1);
            f8905a = clientType2;
            f8906b = new ClientType[]{clientType, clientType2};
        }

        public ClientType() {
            throw null;
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) f8906b.clone();
        }
    }

    public abstract AbstractC0809a a();

    public abstract ClientType b();
}
