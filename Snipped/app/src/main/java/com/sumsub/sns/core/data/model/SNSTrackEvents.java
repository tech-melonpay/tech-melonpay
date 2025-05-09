package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import kotlinx.serialization.a;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.f;
import qa.InterfaceC1143c;
import ra.K;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "", "", "activity", "ts", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "write$Self", "(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;Lqa/c;Lpa/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivity", "getActivity$annotations", "()V", "getTs", "getTs$annotations", "Ljava/util/Map;", "getPayload", "getPayload$annotations", "Companion", "$serializer", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class SNSTrackEvents {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activity;
    private final Map<String, Object> payload;
    private final String ts;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSTrackEvents$Companion;", "", "<init>", "()V", "Lna/b;", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "serializer", "()Lna/b;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<SNSTrackEvents> serializer() {
            return SNSTrackEvents$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SNSTrackEvents(int i, String str, String str2, Map map, i0 i0Var) {
        if (1 != (i & 1)) {
            a0.h(i, 1, SNSTrackEvents$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.activity = str;
        if ((i & 2) == 0) {
            this.ts = null;
        } else {
            this.ts = str2;
        }
        if ((i & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SNSTrackEvents copy$default(SNSTrackEvents sNSTrackEvents, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sNSTrackEvents.activity;
        }
        if ((i & 2) != 0) {
            str2 = sNSTrackEvents.ts;
        }
        if ((i & 4) != 0) {
            map = sNSTrackEvents.payload;
        }
        return sNSTrackEvents.copy(str, str2, map);
    }

    public static final void write$Self(SNSTrackEvents self, InterfaceC1143c output, f serialDesc) {
        output.x(serialDesc, 0, self.activity);
        if (output.D() || self.ts != null) {
            output.e(serialDesc, 1, m0.f26414a, self.ts);
        }
        if (!output.D() && self.payload == null) {
            return;
        }
        output.e(serialDesc, 2, new K(m0.f26414a, new a(h.a(Object.class), new InterfaceC1078b[0])), self.payload);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTs() {
        return this.ts;
    }

    public final Map<String, Object> component3() {
        return this.payload;
    }

    public final SNSTrackEvents copy(String activity, String ts, Map<String, ? extends Object> payload) {
        return new SNSTrackEvents(activity, ts, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSTrackEvents)) {
            return false;
        }
        SNSTrackEvents sNSTrackEvents = (SNSTrackEvents) other;
        return kotlin.jvm.internal.f.b(this.activity, sNSTrackEvents.activity) && kotlin.jvm.internal.f.b(this.ts, sNSTrackEvents.ts) && kotlin.jvm.internal.f.b(this.payload, sNSTrackEvents.payload);
    }

    public final String getActivity() {
        return this.activity;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public final String getTs() {
        return this.ts;
    }

    public int hashCode() {
        int hashCode = this.activity.hashCode() * 31;
        String str = this.ts;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.payload;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SNSTrackEvents(activity=" + this.activity + ", ts=" + this.ts + ", payload=" + this.payload + ')';
    }

    public SNSTrackEvents(String str, String str2, Map<String, ? extends Object> map) {
        this.activity = str;
        this.ts = str2;
        this.payload = map;
    }

    public /* synthetic */ SNSTrackEvents(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }

    public static /* synthetic */ void getActivity$annotations() {
    }

    public static /* synthetic */ void getPayload$annotations() {
    }

    public static /* synthetic */ void getTs$annotations() {
    }
}
