package com.sumsub.sns.internal.videoident.videoident.chat;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19571e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19572a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19573b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19574c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19575d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return new b(false, false, false, false);
        }

        public final b b() {
            return a();
        }

        public a() {
        }
    }

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19572a = z10;
        this.f19573b = z11;
        this.f19574c = z12;
        this.f19575d = z13;
    }

    public final boolean e() {
        return this.f19573b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19572a == bVar.f19572a && this.f19573b == bVar.f19573b && this.f19574c == bVar.f19574c && this.f19575d == bVar.f19575d;
    }

    public final boolean f() {
        return this.f19572a;
    }

    public final boolean g() {
        return this.f19575d;
    }

    public final boolean h() {
        return this.f19574c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f19572a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i = r02 * 31;
        ?? r22 = this.f19573b;
        int i9 = r22;
        if (r22 != 0) {
            i9 = 1;
        }
        int i10 = (i + i9) * 31;
        ?? r23 = this.f19574c;
        int i11 = r23;
        if (r23 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f19575d;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantState(connected=");
        sb2.append(this.f19572a);
        sb2.append(", audioTrackSubscribed=");
        sb2.append(this.f19573b);
        sb2.append(", videoTrackSubscribed=");
        sb2.append(this.f19574c);
        sb2.append(", dataTrackSubscribed=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f19575d, ')');
    }
}
