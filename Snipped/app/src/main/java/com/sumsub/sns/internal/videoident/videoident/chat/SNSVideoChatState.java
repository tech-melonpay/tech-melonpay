package com.sumsub.sns.internal.videoident.videoident.chat;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "", "isConnected", "()Z", "b", "c", "d", "e", "f", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState$b;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState$c;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState$d;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState$e;", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState$f;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SNSVideoChatState {
    private final String name;

    public static final class b extends SNSVideoChatState {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19558a = new b();

        public b() {
            super("Connecting", null);
        }
    }

    public static final class c extends SNSVideoChatState {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f19559a;

        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Throwable b() {
            return this.f19559a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f19559a, ((c) obj).f19559a);
        }

        public int hashCode() {
            Throwable th = this.f19559a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @Override // com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState
        public String toString() {
            return "SNSDisconnected(error=" + this.f19559a + ')';
        }

        public /* synthetic */ c(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public c(Throwable th) {
            super("Disconnected", null);
            this.f19559a = th;
        }
    }

    public static final class d extends SNSVideoChatState {

        /* renamed from: e, reason: collision with root package name */
        public static final a f19560e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19561a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19562b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19563c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f19564d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public d() {
            this(false, false, false, false, 15, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19561a == dVar.f19561a && this.f19562b == dVar.f19562b && this.f19563c == dVar.f19563c && this.f19564d == dVar.f19564d;
        }

        public final boolean f() {
            return this.f19563c;
        }

        public final boolean g() {
            return this.f19562b;
        }

        public final boolean h() {
            return this.f19564d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f19561a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            ?? r22 = this.f19562b;
            int i9 = r22;
            if (r22 != 0) {
                i9 = 1;
            }
            int i10 = (i + i9) * 31;
            ?? r23 = this.f19563c;
            int i11 = r23;
            if (r23 != 0) {
                i11 = 1;
            }
            int i12 = (i10 + i11) * 31;
            boolean z11 = this.f19564d;
            return i12 + (z11 ? 1 : z11 ? 1 : 0);
        }

        @Override // com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SNSParticipantConnected(hasAudioTrack=");
            sb2.append(this.f19561a);
            sb2.append(", hasVideoTrack=");
            sb2.append(this.f19562b);
            sb2.append(", hasDataTrack=");
            sb2.append(this.f19563c);
            sb2.append(", isReconnected=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f19564d, ')');
        }

        public /* synthetic */ d(boolean z10, boolean z11, boolean z12, boolean z13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z10, (i & 2) != 0 ? true : z11, (i & 4) != 0 ? true : z12, (i & 8) != 0 ? false : z13);
        }

        public d(boolean z10, boolean z11, boolean z12, boolean z13) {
            super("ParticipantConnected", null);
            this.f19561a = z10;
            this.f19562b = z11;
            this.f19563c = z12;
            this.f19564d = z13;
        }
    }

    public static final class e extends SNSVideoChatState {

        /* renamed from: a, reason: collision with root package name */
        public static final e f19565a = new e();

        public e() {
            super("ParticipantDisconnected", null);
        }
    }

    public static final class f extends SNSVideoChatState {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f19566a;

        public final Throwable a() {
            return this.f19566a;
        }
    }

    public /* synthetic */ SNSVideoChatState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isConnected() {
        return ((this instanceof c) || (this instanceof b)) ? false : true;
    }

    public String toString() {
        return "SNSVideoChatState->" + this.name;
    }

    private SNSVideoChatState(String str) {
        this.name = str;
    }
}
