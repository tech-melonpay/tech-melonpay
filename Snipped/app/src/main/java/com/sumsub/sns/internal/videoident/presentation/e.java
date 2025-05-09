package com.sumsub.sns.internal.videoident.presentation;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19232a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f19233b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19234c;

    public e(boolean z10, CharSequence charSequence, boolean z11) {
        this.f19232a = z10;
        this.f19233b = charSequence;
        this.f19234c = z11;
    }

    public final e a(boolean z10, CharSequence charSequence, boolean z11) {
        return new e(z10, charSequence, z11);
    }

    public final CharSequence d() {
        return this.f19233b;
    }

    public final boolean e() {
        return this.f19234c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19232a == eVar.f19232a && kotlin.jvm.internal.f.b(this.f19233b, eVar.f19233b) && this.f19234c == eVar.f19234c;
    }

    public final boolean f() {
        return this.f19232a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.f19232a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i = r02 * 31;
        CharSequence charSequence = this.f19233b;
        int hashCode = (i + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        boolean z11 = this.f19234c;
        return hashCode + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteVideoState(showVideoView=");
        sb2.append(this.f19232a);
        sb2.append(", caption=");
        sb2.append((Object) this.f19233b);
        sb2.append(", showLoader=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f19234c, ')');
    }

    public static /* synthetic */ e a(e eVar, boolean z10, CharSequence charSequence, boolean z11, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = eVar.f19232a;
        }
        if ((i & 2) != 0) {
            charSequence = eVar.f19233b;
        }
        if ((i & 4) != 0) {
            z11 = eVar.f19234c;
        }
        return eVar.a(z10, charSequence, z11);
    }

    public /* synthetic */ e(boolean z10, CharSequence charSequence, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, charSequence, (i & 4) != 0 ? false : z11);
    }
}
