package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class v<T> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final StabilityLevel f17126a;

        public a(StabilityLevel stabilityLevel) {
            this.f17126a = stabilityLevel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f17126a == ((a) obj).f17126a;
        }

        public int hashCode() {
            return this.f17126a.hashCode();
        }

        public String toString() {
            return "Info(stabilityLevel=" + this.f17126a + ')';
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, String> d();

    public v() {
    }
}
