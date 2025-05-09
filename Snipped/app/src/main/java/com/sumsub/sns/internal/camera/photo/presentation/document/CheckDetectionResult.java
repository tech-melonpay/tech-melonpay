package com.sumsub.sns.internal.camera.photo.presentation.document;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CheckDetectionResult {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14587d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14588a;

    /* renamed from: b, reason: collision with root package name */
    public final SizeCheckResult f14589b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14590c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/camera/photo/presentation/document/CheckDetectionResult$SizeCheckResult;", "", "(Ljava/lang/String;I)V", "SMALL", "OK", "BIG", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum SizeCheckResult {
        SMALL,
        OK,
        BIG
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CheckDetectionResult a() {
            return new CheckDetectionResult(false, SizeCheckResult.SMALL, false);
        }

        public a() {
        }
    }

    public CheckDetectionResult(boolean z10, SizeCheckResult sizeCheckResult, boolean z11) {
        this.f14588a = z10;
        this.f14589b = sizeCheckResult;
        this.f14590c = z11;
    }

    public final boolean e() {
        return this.f14588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDetectionResult)) {
            return false;
        }
        CheckDetectionResult checkDetectionResult = (CheckDetectionResult) obj;
        return this.f14588a == checkDetectionResult.f14588a && this.f14589b == checkDetectionResult.f14589b && this.f14590c == checkDetectionResult.f14590c;
    }

    public final SizeCheckResult f() {
        return this.f14589b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z10 = this.f14588a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = (this.f14589b.hashCode() + (r02 * 31)) * 31;
        boolean z11 = this.f14590c;
        return hashCode + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CheckDetectionResult(frameHit=");
        sb2.append(this.f14588a);
        sb2.append(", sizeCheck=");
        sb2.append(this.f14589b);
        sb2.append(", aspectRatio=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f14590c, ')');
    }
}
