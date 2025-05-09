package com.sumsub.sns.internal.videoident.videoident.chat;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/internal/videoident/videoident/chat/FocusStatus;", "", "<init>", "()V", "a", "b", "c", "Lcom/sumsub/sns/internal/videoident/videoident/chat/FocusStatus$a;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/FocusStatus$b;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/FocusStatus$c;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class FocusStatus {

    public static final class a extends FocusStatus {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19513a;

        public a(boolean z10) {
            super(null);
            this.f19513a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f19513a == ((a) obj).f19513a;
        }

        public int hashCode() {
            boolean z10 = this.f19513a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("Gained(transient="), this.f19513a, ')');
        }
    }

    public static final class b extends FocusStatus {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19514a;

        public b(boolean z10) {
            super(null);
            this.f19514a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f19514a == ((b) obj).f19514a;
        }

        public int hashCode() {
            boolean z10 = this.f19514a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("Lost(transient="), this.f19514a, ')');
        }
    }

    public static final class c extends FocusStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final c f19515a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ FocusStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FocusStatus() {
    }
}
