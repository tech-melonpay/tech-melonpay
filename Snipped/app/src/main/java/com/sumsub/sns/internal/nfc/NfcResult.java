package com.sumsub.sns.internal.nfc;

import C.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class NfcResult {

    public static final class Failed extends NfcResult {

        /* renamed from: a, reason: collision with root package name */
        public final Reason f17767a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/nfc/NfcResult$Failed$Reason;", "", "(Ljava/lang/String;I)V", "AUTH_FAILED", "READ_FAILED", "TAG_WAS_LOST", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum Reason {
            AUTH_FAILED,
            READ_FAILED,
            TAG_WAS_LOST
        }

        public Failed(Reason reason) {
            super(null);
            this.f17767a = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && this.f17767a == ((Failed) obj).f17767a;
        }

        public int hashCode() {
            return this.f17767a.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.f17767a + ')';
        }
    }

    public static final class a extends NfcResult {

        /* renamed from: a, reason: collision with root package name */
        public final List<byte[]> f17768a;

        public a(List<byte[]> list) {
            super(null);
            this.f17768a = list;
        }

        public final List<byte[]> b() {
            return this.f17768a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f17768a, ((a) obj).f17768a);
        }

        public int hashCode() {
            return this.f17768a.hashCode();
        }

        public String toString() {
            return v.r(new StringBuilder("Success(files="), this.f17768a, ')');
        }
    }

    public /* synthetic */ NfcResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public NfcResult() {
    }
}
