package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class a extends BackendResponse {

    /* renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f8958a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8959b;

    public a(BackendResponse.Status status, long j10) {
        this.f8958a = status;
        this.f8959b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long a() {
        return this.f8959b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status b() {
        return this.f8958a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f8958a.equals(backendResponse.b()) && this.f8959b == backendResponse.a();
    }

    public final int hashCode() {
        int hashCode = (this.f8958a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f8959b;
        return hashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f8958a + ", nextRequestWaitMillis=" + this.f8959b + "}";
    }
}
