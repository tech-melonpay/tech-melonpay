package com.sumsub.sns.core.data.listener;

import O9.f;
import P9.z;
import androidx.annotation.Keep;
import ca.InterfaceC0635a;
import ia.InterfaceC0835c;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import kotlinx.serialization.c;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1143c;
import ra.K;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u0011\u001c\u001b\u001d\u001e\u001f !\"#$%&'()*+B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\r,-./012345678¨\u00069"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent;", "", "", "eventType", "", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "write$Self", "(Lcom/sumsub/sns/core/data/listener/SNSEvent;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "Companion", "ApplicantDataUpdated", "CountrySelected", "DocumentTypeSelected", "EventParams", "EventType", "PhotoAccepted", "PhotoDeclined", "SNSEventAnalytics", "SNSEventApplicantLoaded", "SNSEventStepCompleted", "SNSEventStepInitiated", "ShowMoreGuidance", "SupportItemClicked", "UserStartedVerification", "VerificationStarted", "ViewItem", "Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$DocumentTypeSelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoDeclined;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventAnalytics;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventApplicantLoaded;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SupportItemClicked;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SNSEvent {
    private final String eventType;
    private final Map<String, Object> payload;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final f<InterfaceC1078b<Object>> $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.f23086b, new InterfaceC0635a<InterfaceC1078b<Object>>() { // from class: com.sumsub.sns.core.data.listener.SNSEvent$Companion$$cachedSerializer$delegate$1
        @Override // ca.InterfaceC0635a
        public final InterfaceC1078b<Object> invoke() {
            return new c("com.sumsub.sns.core.data.listener.SNSEvent", h.a(SNSEvent.class), new InterfaceC0835c[0], new InterfaceC1078b[0], new Annotation[0]);
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "values", "", "", "(Ljava/util/List;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApplicantDataUpdated extends SNSEvent {
        public ApplicantDataUpdated(List<String> list) {
            super(EventType.ApplicantDataUpdated.name(), z.o(new Pair(EventParams.Value.getValue(), list)), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$Companion;", "", "<init>", "()V", "Lna/b;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "serializer", "()Lna/b;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ f get$cachedSerializer$delegate() {
            return SNSEvent.$cachedSerializer$delegate;
        }

        public final InterfaceC1078b<SNSEvent> serializer() {
            return (InterfaceC1078b) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "countryCode", "", "byUser", "", "(Ljava/lang/String;Z)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CountrySelected extends SNSEvent {
        public CountrySelected(String str, boolean z10) {
            super(EventType.CountrySelected.name(), kotlin.collections.a.s(new Pair(EventParams.CountryCode.getValue(), str), new Pair(EventParams.ByUser.getValue(), Boolean.valueOf(z10))), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$DocumentTypeSelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "countryCode", "", "documentType", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DocumentTypeSelected extends SNSEvent {
        public DocumentTypeSelected(String str, String str2) {
            super(EventType.ItemClicked.name(), kotlin.collections.a.s(new Pair(EventParams.ViewItem.getValue(), ViewItem.DocumentType.name()), new Pair(EventParams.CountryCode.getValue(), str), new Pair(EventParams.DocumentType.getValue(), str2)), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$EventParams;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "idDocSetType", "isCancelled", "CountryCode", "DocumentType", "ByUser", "Type", "Value", "ViewItem", "ApplicantId", "EventPayload", "EventName", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum EventParams {
        idDocSetType("idDocSetType"),
        isCancelled("isCancelled"),
        CountryCode("CountryCode"),
        DocumentType("DocumentType"),
        ByUser("ByUser"),
        Type("Type"),
        Value("Value"),
        ViewItem("ViewItem"),
        ApplicantId("applicantId"),
        EventPayload("eventPayload"),
        EventName("eventName");

        private final String value;

        EventParams(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$EventType;", "", "(Ljava/lang/String;I)V", "Analytics", "StepInitiated", "StepCompleted", "CountrySelected", "ApplicantLoaded", "ApplicantDataUpdated", "ItemClicked", "VerificationStarted", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum EventType {
        Analytics,
        StepInitiated,
        StepCompleted,
        CountrySelected,
        ApplicantLoaded,
        ApplicantDataUpdated,
        ItemClicked,
        VerificationStarted
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "idDocSetType", "", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PhotoAccepted extends SNSEvent {
        public PhotoAccepted(String str) {
            super(EventType.ItemClicked.name(), kotlin.collections.a.s(new Pair(EventParams.ViewItem.getValue(), ViewItem.PhotoAccepted.name()), new Pair(EventParams.idDocSetType.getValue(), str)), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoDeclined;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "idDocSetType", "", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PhotoDeclined extends SNSEvent {
        public PhotoDeclined(String str) {
            super(EventType.ItemClicked.name(), kotlin.collections.a.s(new Pair(EventParams.ViewItem.getValue(), ViewItem.RetakePhoto.name()), new Pair(EventParams.idDocSetType.getValue(), str)), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventAnalytics;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "event", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SNSEventAnalytics extends SNSEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public SNSEventAnalytics(com.sumsub.sns.core.data.model.SNSTrackEvents r5) {
            /*
                r4 = this;
                com.sumsub.sns.core.data.listener.SNSEvent$EventType r0 = com.sumsub.sns.core.data.listener.SNSEvent.EventType.Analytics
                java.lang.String r0 = r0.name()
                com.sumsub.sns.core.data.listener.SNSEvent$EventParams r1 = com.sumsub.sns.core.data.listener.SNSEvent.EventParams.EventPayload
                java.lang.String r1 = r1.getValue()
                java.util.Map r2 = r5.getPayload()
                if (r2 != 0) goto L16
                java.util.Map r2 = kotlin.collections.a.p()
            L16:
                kotlin.Pair r3 = new kotlin.Pair
                r3.<init>(r1, r2)
                com.sumsub.sns.core.data.listener.SNSEvent$EventParams r1 = com.sumsub.sns.core.data.listener.SNSEvent.EventParams.EventName
                java.lang.String r1 = r1.getValue()
                java.lang.String r5 = r5.getActivity()
                kotlin.Pair r2 = new kotlin.Pair
                r2.<init>(r1, r5)
                kotlin.Pair[] r5 = new kotlin.Pair[]{r3, r2}
                java.util.Map r5 = kotlin.collections.a.s(r5)
                r1 = 0
                r4.<init>(r0, r5, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.data.listener.SNSEvent.SNSEventAnalytics.<init>(com.sumsub.sns.core.data.model.SNSTrackEvents):void");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventApplicantLoaded;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SNSEventApplicantLoaded extends SNSEvent {
        public SNSEventApplicantLoaded(String str) {
            super(EventType.ApplicantLoaded.name(), com.google.android.gms.measurement.internal.a.n(EventParams.ApplicantId.getValue(), str), null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "idDocSetType", "isCancelled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SNSEventStepCompleted extends SNSEvent {
        public SNSEventStepCompleted(String str, String str2, boolean z10) {
            super(EventType.StepCompleted.name(), kotlin.collections.a.s(new Pair(EventParams.ApplicantId.getValue(), str), new Pair(EventParams.idDocSetType.getValue(), str2), new Pair(EventParams.isCancelled.getValue(), Boolean.valueOf(z10))), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "idDocSetType", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SNSEventStepInitiated extends SNSEvent {
        public SNSEventStepInitiated(String str, String str2) {
            super(EventType.StepInitiated.name(), kotlin.collections.a.s(new Pair(EventParams.ApplicantId.getValue(), str), new Pair(EventParams.idDocSetType.getValue(), str2)), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ShowMoreGuidance extends SNSEvent {
        public static final ShowMoreGuidance INSTANCE = new ShowMoreGuidance();

        private ShowMoreGuidance() {
            super(EventType.ItemClicked.name(), com.google.android.gms.measurement.internal.a.n(EventParams.ViewItem.getValue(), ViewItem.MoreGuidance.name()), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SupportItemClicked;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SupportItemClicked extends SNSEvent {
        public SupportItemClicked(String str, String str2) {
            super(EventType.ItemClicked.name(), kotlin.collections.a.s(new Pair(EventParams.ViewItem.getValue(), ViewItem.SupportItem.name()), new Pair(EventParams.Type.getValue(), str), new Pair(EventParams.Value.getValue(), str2)), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UserStartedVerification extends SNSEvent {
        public static final UserStartedVerification INSTANCE = new UserStartedVerification();

        private UserStartedVerification() {
            super(EventType.ItemClicked.name(), com.google.android.gms.measurement.internal.a.n(EventParams.ViewItem.getValue(), ViewItem.Continue.name()), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VerificationStarted extends SNSEvent {
        public VerificationStarted(String str) {
            super(EventType.VerificationStarted.name(), com.google.android.gms.measurement.internal.a.n(EventParams.ApplicantId.getValue(), str), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ViewItem;", "", "(Ljava/lang/String;I)V", "Continue", "SupportItem", "MoreGuidance", "RetakePhoto", "PhotoAccepted", "DocumentType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ViewItem {
        Continue,
        SupportItem,
        MoreGuidance,
        RetakePhoto,
        PhotoAccepted,
        DocumentType
    }

    public /* synthetic */ SNSEvent(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map);
    }

    public static final void write$Self(SNSEvent self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.eventType);
        if (!output.D() && self.payload == null) {
            return;
        }
        output.e(serialDesc, 1, new K(m0.f26414a, new kotlinx.serialization.a(h.a(Object.class), new InterfaceC1078b[0])), self.payload);
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public /* synthetic */ SNSEvent(int i, String str, Map map, i0 i0Var) {
        this.eventType = str;
        if ((i & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
    }

    private SNSEvent(String str, Map<String, ? extends Object> map) {
        this.eventType = str;
        this.payload = map;
    }

    public /* synthetic */ SNSEvent(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, null);
    }
}
