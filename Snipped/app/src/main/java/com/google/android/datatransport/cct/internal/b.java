package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;
import i2.AbstractC0809a;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class b extends ClientInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f8950a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0809a f8951b;

    public b(ClientInfo.ClientType clientType, AbstractC0809a abstractC0809a) {
        this.f8950a = clientType;
        this.f8951b = abstractC0809a;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final AbstractC0809a a() {
        return this.f8951b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType b() {
        return this.f8950a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f8950a;
        if (clientType != null ? clientType.equals(clientInfo.b()) : clientInfo.b() == null) {
            AbstractC0809a abstractC0809a = this.f8951b;
            if (abstractC0809a == null) {
                if (clientInfo.a() == null) {
                    return true;
                }
            } else if (abstractC0809a.equals(clientInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f8950a;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AbstractC0809a abstractC0809a = this.f8951b;
        return (abstractC0809a != null ? abstractC0809a.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f8950a + ", androidClientInfo=" + this.f8951b + "}";
    }
}
