package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.internal.core.data.model.ReviewAnswerType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.H;
import ra.InterfaceC1162A;
import ra.K;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003\u0018\u001b\u001dBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBi\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J^\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001cR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001fR.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!¨\u0006:"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/m;", "", "Lcom/sumsub/sns/internal/core/data/model/remote/m$c;", "reviewResult", "", "country", "identity", "", "", "imageIds", "", "imageReviewResults", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/remote/m$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/remote/m$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/m;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/model/remote/m$c;", "b", "()Ljava/lang/String;", "c", "d", "()Ljava/util/List;", "e", "()Ljava/util/Map;", "(Lcom/sumsub/sns/internal/core/data/model/remote/m$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/sumsub/sns/internal/core/data/model/remote/m;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/model/remote/m$c;", "n", "getReviewResult$annotations", "()V", "Ljava/lang/String;", "f", "getCountry$annotations", "h", "getIdentity$annotations", "Ljava/util/List;", "j", "getImageIds$annotations", "Ljava/util/Map;", "l", "getImageReviewResults$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class m {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c reviewResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String identity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<Integer> imageIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, c> imageReviewResults;

    public static final class a implements InterfaceC1162A<m> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15661a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15662b;

        static {
            a aVar = new a();
            f15661a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteRequiredDoc", aVar, 5);
            pluginGeneratedSerialDescriptor.k("reviewResult", true);
            pluginGeneratedSerialDescriptor.k("country", true);
            pluginGeneratedSerialDescriptor.k("idDocType", true);
            pluginGeneratedSerialDescriptor.k("imageIds", true);
            pluginGeneratedSerialDescriptor.k("imageReviewResults", true);
            f15662b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, c.a.f15667a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                    i |= 2;
                } else if (q10 == 2) {
                    obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                    i |= 4;
                } else if (q10 == 3) {
                    obj4 = c2.D(descriptor, 3, new C1169d(H.f26353a, 0), obj4);
                    i |= 8;
                } else {
                    if (q10 != 4) {
                        throw new UnknownFieldException(q10);
                    }
                    obj5 = c2.D(descriptor, 4, new K(H.f26353a, c.a.f15667a), obj5);
                    i |= 16;
                }
            }
            c2.b(descriptor);
            return new m(i, (c) obj, (String) obj2, (String) obj3, (List) obj4, (Map) obj5, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            c.a aVar = c.a.f15667a;
            InterfaceC1078b<?> a10 = C1095a.a(aVar);
            m0 m0Var = m0.f26414a;
            InterfaceC1078b<?> a11 = C1095a.a(m0Var);
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            H h9 = H.f26353a;
            return new InterfaceC1078b[]{a10, a11, a12, C1095a.a(new C1169d(h9, 0)), C1095a.a(new K(h9, aVar))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15662b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, m mVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            m.a(mVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.m$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<m> serializer() {
            return a.f15661a;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0016\u0019B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001aR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010/\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u001d¨\u00063"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/m$c;", "", "Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "answer", "", "moderationComment", "clientComment", "", "rejectLabels", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/m$c;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "b", "()Ljava/lang/String;", "c", "d", "()Ljava/util/List;", "(Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/m$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "e", "getAnswer$annotations", "()V", "Ljava/lang/String;", "i", "getModerationComment$annotations", "g", "getClientComment$annotations", "Ljava/util/List;", "k", "getRejectLabels$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final ReviewAnswerType answer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String moderationComment;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String clientComment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final List<String> rejectLabels;

        public static final class a implements InterfaceC1162A<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15667a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15668b;

            static {
                a aVar = new a();
                f15667a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteRequiredDoc.ReviewResult", aVar, 4);
                pluginGeneratedSerialDescriptor.k("reviewAnswer", true);
                pluginGeneratedSerialDescriptor.k("moderationComment", true);
                pluginGeneratedSerialDescriptor.k("clientComment", true);
                pluginGeneratedSerialDescriptor.k("rejectLabels", true);
                f15668b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                Object obj = null;
                boolean z10 = true;
                int i = 0;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else if (q10 == 0) {
                        obj = c2.D(descriptor, 0, ReviewAnswerType.a.f15267a, obj);
                        i |= 1;
                    } else if (q10 == 1) {
                        obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                        i |= 2;
                    } else if (q10 == 2) {
                        obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                        i |= 4;
                    } else {
                        if (q10 != 3) {
                            throw new UnknownFieldException(q10);
                        }
                        obj4 = c2.D(descriptor, 3, new C1169d(m0.f26414a, 0), obj4);
                        i |= 8;
                    }
                }
                c2.b(descriptor);
                return new c(i, (ReviewAnswerType) obj, (String) obj2, (String) obj3, (List) obj4, (i0) null);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                InterfaceC1078b<?> a10 = C1095a.a(ReviewAnswerType.a.f15267a);
                m0 m0Var = m0.f26414a;
                return new InterfaceC1078b[]{a10, C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0))};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15668b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                c.a(cVar, c2, descriptor);
                c2.b(descriptor);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.m$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<c> serializer() {
                return a.f15667a;
            }

            public Companion() {
            }
        }

        public c() {
            this((ReviewAnswerType) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a, reason: from getter */
        public final ReviewAnswerType getAnswer() {
            return this.answer;
        }

        /* renamed from: b, reason: from getter */
        public final String getModerationComment() {
            return this.moderationComment;
        }

        /* renamed from: c, reason: from getter */
        public final String getClientComment() {
            return this.clientComment;
        }

        public final List<String> d() {
            return this.rejectLabels;
        }

        public final ReviewAnswerType e() {
            return this.answer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.answer == cVar.answer && kotlin.jvm.internal.f.b(this.moderationComment, cVar.moderationComment) && kotlin.jvm.internal.f.b(this.clientComment, cVar.clientComment) && kotlin.jvm.internal.f.b(this.rejectLabels, cVar.rejectLabels);
        }

        public final String g() {
            return this.clientComment;
        }

        public int hashCode() {
            ReviewAnswerType reviewAnswerType = this.answer;
            int hashCode = (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode()) * 31;
            String str = this.moderationComment;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clientComment;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<String> list = this.rejectLabels;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String i() {
            return this.moderationComment;
        }

        public final List<String> k() {
            return this.rejectLabels;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReviewResult(answer=");
            sb2.append(this.answer);
            sb2.append(", moderationComment=");
            sb2.append(this.moderationComment);
            sb2.append(", clientComment=");
            sb2.append(this.clientComment);
            sb2.append(", rejectLabels=");
            return v.r(sb2, this.rejectLabels, ')');
        }

        public /* synthetic */ c(int i, ReviewAnswerType reviewAnswerType, String str, String str2, List list, i0 i0Var) {
            if ((i & 1) == 0) {
                this.answer = null;
            } else {
                this.answer = reviewAnswerType;
            }
            if ((i & 2) == 0) {
                this.moderationComment = null;
            } else {
                this.moderationComment = str;
            }
            if ((i & 4) == 0) {
                this.clientComment = null;
            } else {
                this.clientComment = str2;
            }
            if ((i & 8) == 0) {
                this.rejectLabels = null;
            } else {
                this.rejectLabels = list;
            }
        }

        public final c a(ReviewAnswerType answer, String moderationComment, String clientComment, List<String> rejectLabels) {
            return new c(answer, moderationComment, clientComment, rejectLabels);
        }

        public c(ReviewAnswerType reviewAnswerType, String str, String str2, List<String> list) {
            this.answer = reviewAnswerType;
            this.moderationComment = str;
            this.clientComment = str2;
            this.rejectLabels = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, ReviewAnswerType reviewAnswerType, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                reviewAnswerType = cVar.answer;
            }
            if ((i & 2) != 0) {
                str = cVar.moderationComment;
            }
            if ((i & 4) != 0) {
                str2 = cVar.clientComment;
            }
            if ((i & 8) != 0) {
                list = cVar.rejectLabels;
            }
            return cVar.a(reviewAnswerType, str, str2, list);
        }

        public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
            if (output.D() || self.answer != null) {
                output.e(serialDesc, 0, ReviewAnswerType.a.f15267a, self.answer);
            }
            if (output.D() || self.moderationComment != null) {
                output.e(serialDesc, 1, m0.f26414a, self.moderationComment);
            }
            if (output.D() || self.clientComment != null) {
                output.e(serialDesc, 2, m0.f26414a, self.clientComment);
            }
            if (!output.D() && self.rejectLabels == null) {
                return;
            }
            output.e(serialDesc, 3, new C1169d(m0.f26414a, 0), self.rejectLabels);
        }

        public /* synthetic */ c(ReviewAnswerType reviewAnswerType, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : reviewAnswerType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
        }

        public static /* synthetic */ void f() {
        }

        public static /* synthetic */ void h() {
        }

        public static /* synthetic */ void j() {
        }

        public static /* synthetic */ void l() {
        }
    }

    public m() {
        this((c) null, (String) null, (String) null, (List) null, (Map) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final c getReviewResult() {
        return this.reviewResult;
    }

    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdentity() {
        return this.identity;
    }

    public final List<Integer> d() {
        return this.imageIds;
    }

    public final Map<Integer, c> e() {
        return this.imageReviewResults;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return kotlin.jvm.internal.f.b(this.reviewResult, mVar.reviewResult) && kotlin.jvm.internal.f.b(this.country, mVar.country) && kotlin.jvm.internal.f.b(this.identity, mVar.identity) && kotlin.jvm.internal.f.b(this.imageIds, mVar.imageIds) && kotlin.jvm.internal.f.b(this.imageReviewResults, mVar.imageReviewResults);
    }

    public final String f() {
        return this.country;
    }

    public final String h() {
        return this.identity;
    }

    public int hashCode() {
        c cVar = this.reviewResult;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.country;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.identity;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.imageIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, c> map = this.imageReviewResults;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final List<Integer> j() {
        return this.imageIds;
    }

    public final Map<Integer, c> l() {
        return this.imageReviewResults;
    }

    public final c n() {
        return this.reviewResult;
    }

    public String toString() {
        return "RemoteRequiredDoc(reviewResult=" + this.reviewResult + ", country=" + this.country + ", identity=" + this.identity + ", imageIds=" + this.imageIds + ", imageReviewResults=" + this.imageReviewResults + ')';
    }

    public /* synthetic */ m(int i, c cVar, String str, String str2, List list, Map map, i0 i0Var) {
        if ((i & 1) == 0) {
            this.reviewResult = null;
        } else {
            this.reviewResult = cVar;
        }
        if ((i & 2) == 0) {
            this.country = null;
        } else {
            this.country = str;
        }
        if ((i & 4) == 0) {
            this.identity = null;
        } else {
            this.identity = str2;
        }
        if ((i & 8) == 0) {
            this.imageIds = null;
        } else {
            this.imageIds = list;
        }
        if ((i & 16) == 0) {
            this.imageReviewResults = null;
        } else {
            this.imageReviewResults = map;
        }
    }

    public final m a(c reviewResult, String country, String identity, List<Integer> imageIds, Map<Integer, c> imageReviewResults) {
        return new m(reviewResult, country, identity, imageIds, imageReviewResults);
    }

    public m(c cVar, String str, String str2, List<Integer> list, Map<Integer, c> map) {
        this.reviewResult = cVar;
        this.country = str;
        this.identity = str2;
        this.imageIds = list;
        this.imageReviewResults = map;
    }

    public static /* synthetic */ m a(m mVar, c cVar, String str, String str2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = mVar.reviewResult;
        }
        if ((i & 2) != 0) {
            str = mVar.country;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = mVar.identity;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = mVar.imageIds;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            map = mVar.imageReviewResults;
        }
        return mVar.a(cVar, str3, str4, list2, map);
    }

    public static final void a(m self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.reviewResult != null) {
            output.e(serialDesc, 0, c.a.f15667a, self.reviewResult);
        }
        if (output.D() || self.country != null) {
            output.e(serialDesc, 1, m0.f26414a, self.country);
        }
        if (output.D() || self.identity != null) {
            output.e(serialDesc, 2, m0.f26414a, self.identity);
        }
        if (output.D() || self.imageIds != null) {
            output.e(serialDesc, 3, new C1169d(H.f26353a, 0), self.imageIds);
        }
        if (!output.D() && self.imageReviewResults == null) {
            return;
        }
        output.e(serialDesc, 4, new K(H.f26353a, c.a.f15667a), self.imageReviewResults);
    }

    public /* synthetic */ m(c cVar, String str, String str2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : map);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }
}
