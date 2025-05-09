package com.sumsub.sns.internal.core.data.model.remote.response;

import C.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.ReviewAnswerType;
import com.sumsub.sns.internal.core.data.model.ReviewRejectType;
import com.sumsub.sns.internal.core.data.model.ReviewStatusType;
import com.sumsub.sns.internal.core.data.model.b;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.model.remote.e;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import com.sumsub.sns.videoident.presentation.LanguageSelectionFragment;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.C1172g;
import ra.H;
import ra.InterfaceC1162A;
import ra.K;
import ra.O;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003\u0011\u001f#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0013¨\u0006$"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d;", "", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/remote/response/d$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;", "b", "getData$annotations", "()V", "Companion", "c", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final c data;

    public static final class a implements InterfaceC1162A<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15686a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15687b;

        static {
            a aVar = new a();
            f15686a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.k("list", true);
            f15687b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else {
                    if (q10 != 0) {
                        throw new UnknownFieldException(q10);
                    }
                    obj = c2.D(descriptor, 0, c.a.f15689a, obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new d(i, (c) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(c.a.f15689a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15687b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            d.a(dVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<d> serializer() {
            return a.f15686a;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0006\u0012 $%&'B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\"\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014¨\u0006("}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;", "", "", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;Lqa/c;Lpa/f;)V", "()Ljava/util/List;", "(Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "getItems$annotations", "()V", "Companion", "c", "d", "e", "f", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final List<C0219d> items;

        public static final class a implements InterfaceC1162A<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15689a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15690b;

            static {
                a aVar = new a();
                f15689a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data", aVar, 1);
                pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.ITEMS, true);
                f15690b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
                boolean z10 = true;
                int i = 0;
                Object obj = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else {
                        if (q10 != 0) {
                            throw new UnknownFieldException(q10);
                        }
                        obj = c2.D(descriptor, 0, new C1169d(C0219d.a.f15726a, 0), obj);
                        i = 1;
                    }
                }
                c2.b(descriptor);
                return new c(i, (List) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{C1095a.a(new C1169d(C0219d.a.f15726a, 0))};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15690b;
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

        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<c> serializer() {
                return a.f15689a;
            }

            public Companion() {
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002\u0019#B·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013BË\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u001e\b\u0001\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ&\u0010%\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJÀ\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J(\u0010\u0019\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203HÇ\u0001¢\u0006\u0004\b\u0019\u00106R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u00107\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00107\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00107\u0012\u0004\bD\u0010:\u001a\u0004\bC\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00107\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00107\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00107\u0012\u0004\bJ\u0010:\u001a\u0004\bI\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00107\u0012\u0004\bL\u0010:\u001a\u0004\bK\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00107\u0012\u0004\bN\u0010:\u001a\u0004\bM\u0010\u001aR6\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010O\u0012\u0004\bQ\u0010:\u001a\u0004\bP\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u00107\u0012\u0004\bS\u0010:\u001a\u0004\bR\u0010\u001a¨\u0006U"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "", "", "country", "firstName", "lastName", "middleName", "legalName", "gender", "dob", "placeOfBirth", "countryOfBirth", "stateOfBirth", "nationality", "", "", "addresses", "tin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lra/i0;)V", "a", "()Ljava/lang/String;", "f", "g", "h", "i", "j", "k", "l", "m", "b", "c", "d", "()Ljava/util/List;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "p", "getCountry$annotations", "()V", "v", "getFirstName$annotations", "z", "getLastName$annotations", "D", "getMiddleName$annotations", "B", "getLegalName$annotations", "x", "getGender$annotations", "t", "getDob$annotations", "H", "getPlaceOfBirth$annotations", "r", "getCountryOfBirth$annotations", "J", "getStateOfBirth$annotations", "F", "getNationality$annotations", "Ljava/util/List;", "n", "getAddresses$annotations", "L", "getTin$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0218c {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final String country;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final String firstName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final String lastName;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final String middleName;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public final String legalName;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final String gender;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            public final String dob;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            public final String placeOfBirth;

            /* renamed from: i, reason: from kotlin metadata */
            public final String countryOfBirth;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final String stateOfBirth;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            public final String nationality;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            public final List<Map<String, Object>> addresses;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            public final String tin;

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$c$a */
            public static final class a implements InterfaceC1162A<C0218c> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15703a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15704b;

                static {
                    a aVar = new a();
                    f15703a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.Info", aVar, 13);
                    pluginGeneratedSerialDescriptor.k("country", true);
                    pluginGeneratedSerialDescriptor.k("firstName", true);
                    pluginGeneratedSerialDescriptor.k("lastName", true);
                    pluginGeneratedSerialDescriptor.k("middleName", true);
                    pluginGeneratedSerialDescriptor.k("legalName", true);
                    pluginGeneratedSerialDescriptor.k("gender", true);
                    pluginGeneratedSerialDescriptor.k("dob", true);
                    pluginGeneratedSerialDescriptor.k("placeOfBirth", true);
                    pluginGeneratedSerialDescriptor.k("countryOfBirth", true);
                    pluginGeneratedSerialDescriptor.k("stateOfBirth", true);
                    pluginGeneratedSerialDescriptor.k("nationality", true);
                    pluginGeneratedSerialDescriptor.k("addresses", true);
                    pluginGeneratedSerialDescriptor.k("tin", true);
                    f15704b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0218c deserialize(InterfaceC1144d interfaceC1144d) {
                    Object obj;
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    Object obj13 = null;
                    Object obj14 = null;
                    int i = 0;
                    boolean z10 = true;
                    while (z10) {
                        Object obj15 = obj2;
                        int q10 = c2.q(descriptor);
                        switch (q10) {
                            case -1:
                                z10 = false;
                                obj2 = obj15;
                                obj14 = obj14;
                            case 0:
                                obj = obj3;
                                i |= 1;
                                obj2 = c2.D(descriptor, 0, m0.f26414a, obj15);
                                obj14 = obj14;
                                obj3 = obj;
                            case 1:
                                obj = obj3;
                                obj4 = c2.D(descriptor, 1, m0.f26414a, obj4);
                                i |= 2;
                                obj2 = obj15;
                                obj3 = obj;
                            case 2:
                                obj = obj3;
                                obj5 = c2.D(descriptor, 2, m0.f26414a, obj5);
                                i |= 4;
                                obj2 = obj15;
                                obj3 = obj;
                            case 3:
                                obj = obj3;
                                obj6 = c2.D(descriptor, 3, m0.f26414a, obj6);
                                i |= 8;
                                obj2 = obj15;
                                obj3 = obj;
                            case 4:
                                obj = obj3;
                                obj7 = c2.D(descriptor, 4, m0.f26414a, obj7);
                                i |= 16;
                                obj2 = obj15;
                                obj3 = obj;
                            case 5:
                                obj = obj3;
                                obj8 = c2.D(descriptor, 5, m0.f26414a, obj8);
                                i |= 32;
                                obj2 = obj15;
                                obj3 = obj;
                            case 6:
                                obj = obj3;
                                obj9 = c2.D(descriptor, 6, m0.f26414a, obj9);
                                i |= 64;
                                obj2 = obj15;
                                obj3 = obj;
                            case 7:
                                obj = obj3;
                                obj10 = c2.D(descriptor, 7, m0.f26414a, obj10);
                                i |= 128;
                                obj2 = obj15;
                                obj3 = obj;
                            case 8:
                                obj = obj3;
                                obj11 = c2.D(descriptor, 8, m0.f26414a, obj11);
                                i |= 256;
                                obj2 = obj15;
                                obj3 = obj;
                            case 9:
                                obj = obj3;
                                obj12 = c2.D(descriptor, 9, m0.f26414a, obj12);
                                i |= 512;
                                obj2 = obj15;
                                obj3 = obj;
                            case 10:
                                obj = obj3;
                                obj13 = c2.D(descriptor, 10, m0.f26414a, obj13);
                                i |= 1024;
                                obj2 = obj15;
                                obj3 = obj;
                            case 11:
                                obj14 = c2.D(descriptor, 11, new C1169d(new K(m0.f26414a, C1095a.a(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), 0), obj14);
                                i |= 2048;
                                obj2 = obj15;
                                obj4 = obj4;
                                obj3 = obj3;
                                obj5 = obj5;
                                obj7 = obj7;
                                obj6 = obj6;
                                obj8 = obj8;
                            case 12:
                                obj3 = c2.D(descriptor, 12, m0.f26414a, obj3);
                                i |= 4096;
                                obj2 = obj15;
                                obj4 = obj4;
                            default:
                                throw new UnknownFieldException(q10);
                        }
                    }
                    Object obj16 = obj14;
                    c2.b(descriptor);
                    return new C0218c(i, (String) obj2, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (List) obj16, (String) obj3, (i0) null);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    m0 m0Var = m0.f26414a;
                    return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(new K(m0Var, C1095a.a(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), 0)), C1095a.a(m0Var)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15704b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, C0218c c0218c) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    C0218c.a(c0218c, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<C0218c> serializer() {
                    return a.f15703a;
                }

                public Companion() {
                }
            }

            public C0218c() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 8191, (DefaultConstructorMarker) null);
            }

            /* renamed from: B, reason: from getter */
            public final String getLegalName() {
                return this.legalName;
            }

            /* renamed from: D, reason: from getter */
            public final String getMiddleName() {
                return this.middleName;
            }

            /* renamed from: F, reason: from getter */
            public final String getNationality() {
                return this.nationality;
            }

            /* renamed from: H, reason: from getter */
            public final String getPlaceOfBirth() {
                return this.placeOfBirth;
            }

            /* renamed from: J, reason: from getter */
            public final String getStateOfBirth() {
                return this.stateOfBirth;
            }

            /* renamed from: L, reason: from getter */
            public final String getTin() {
                return this.tin;
            }

            /* renamed from: a, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            public final String b() {
                return this.stateOfBirth;
            }

            public final String c() {
                return this.nationality;
            }

            public final List<Map<String, Object>> d() {
                return this.addresses;
            }

            public final String e() {
                return this.tin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0218c)) {
                    return false;
                }
                C0218c c0218c = (C0218c) other;
                return kotlin.jvm.internal.f.b(this.country, c0218c.country) && kotlin.jvm.internal.f.b(this.firstName, c0218c.firstName) && kotlin.jvm.internal.f.b(this.lastName, c0218c.lastName) && kotlin.jvm.internal.f.b(this.middleName, c0218c.middleName) && kotlin.jvm.internal.f.b(this.legalName, c0218c.legalName) && kotlin.jvm.internal.f.b(this.gender, c0218c.gender) && kotlin.jvm.internal.f.b(this.dob, c0218c.dob) && kotlin.jvm.internal.f.b(this.placeOfBirth, c0218c.placeOfBirth) && kotlin.jvm.internal.f.b(this.countryOfBirth, c0218c.countryOfBirth) && kotlin.jvm.internal.f.b(this.stateOfBirth, c0218c.stateOfBirth) && kotlin.jvm.internal.f.b(this.nationality, c0218c.nationality) && kotlin.jvm.internal.f.b(this.addresses, c0218c.addresses) && kotlin.jvm.internal.f.b(this.tin, c0218c.tin);
            }

            /* renamed from: f, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* renamed from: g, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            public final String h() {
                return this.middleName;
            }

            public int hashCode() {
                String str = this.country;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.firstName;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.lastName;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.middleName;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.legalName;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.gender;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.dob;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.placeOfBirth;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.countryOfBirth;
                int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.stateOfBirth;
                int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.nationality;
                int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                List<Map<String, Object>> list = this.addresses;
                int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
                String str12 = this.tin;
                return hashCode12 + (str12 != null ? str12.hashCode() : 0);
            }

            public final String i() {
                return this.legalName;
            }

            /* renamed from: j, reason: from getter */
            public final String getGender() {
                return this.gender;
            }

            /* renamed from: k, reason: from getter */
            public final String getDob() {
                return this.dob;
            }

            public final String l() {
                return this.placeOfBirth;
            }

            /* renamed from: m, reason: from getter */
            public final String getCountryOfBirth() {
                return this.countryOfBirth;
            }

            public final List<Map<String, Object>> n() {
                return this.addresses;
            }

            public final String p() {
                return this.country;
            }

            public final String r() {
                return this.countryOfBirth;
            }

            public final String t() {
                return this.dob;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Info(country=");
                sb2.append(this.country);
                sb2.append(", firstName=");
                sb2.append(this.firstName);
                sb2.append(", lastName=");
                sb2.append(this.lastName);
                sb2.append(", middleName=");
                sb2.append(this.middleName);
                sb2.append(", legalName=");
                sb2.append(this.legalName);
                sb2.append(", gender=");
                sb2.append(this.gender);
                sb2.append(", dob=");
                sb2.append(this.dob);
                sb2.append(", placeOfBirth=");
                sb2.append(this.placeOfBirth);
                sb2.append(", countryOfBirth=");
                sb2.append(this.countryOfBirth);
                sb2.append(", stateOfBirth=");
                sb2.append(this.stateOfBirth);
                sb2.append(", nationality=");
                sb2.append(this.nationality);
                sb2.append(", addresses=");
                sb2.append(this.addresses);
                sb2.append(", tin=");
                return v.q(sb2, this.tin, ')');
            }

            public final String v() {
                return this.firstName;
            }

            public final String x() {
                return this.gender;
            }

            public final String z() {
                return this.lastName;
            }

            public /* synthetic */ C0218c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, i0 i0Var) {
                if ((i & 1) == 0) {
                    this.country = null;
                } else {
                    this.country = str;
                }
                if ((i & 2) == 0) {
                    this.firstName = null;
                } else {
                    this.firstName = str2;
                }
                if ((i & 4) == 0) {
                    this.lastName = null;
                } else {
                    this.lastName = str3;
                }
                if ((i & 8) == 0) {
                    this.middleName = null;
                } else {
                    this.middleName = str4;
                }
                if ((i & 16) == 0) {
                    this.legalName = null;
                } else {
                    this.legalName = str5;
                }
                if ((i & 32) == 0) {
                    this.gender = null;
                } else {
                    this.gender = str6;
                }
                if ((i & 64) == 0) {
                    this.dob = null;
                } else {
                    this.dob = str7;
                }
                if ((i & 128) == 0) {
                    this.placeOfBirth = null;
                } else {
                    this.placeOfBirth = str8;
                }
                if ((i & 256) == 0) {
                    this.countryOfBirth = null;
                } else {
                    this.countryOfBirth = str9;
                }
                if ((i & 512) == 0) {
                    this.stateOfBirth = null;
                } else {
                    this.stateOfBirth = str10;
                }
                if ((i & 1024) == 0) {
                    this.nationality = null;
                } else {
                    this.nationality = str11;
                }
                if ((i & 2048) == 0) {
                    this.addresses = null;
                } else {
                    this.addresses = list;
                }
                if ((i & 4096) == 0) {
                    this.tin = null;
                } else {
                    this.tin = str12;
                }
            }

            public final C0218c a(String country, String firstName, String lastName, String middleName, String legalName, String gender, String dob, String placeOfBirth, String countryOfBirth, String stateOfBirth, String nationality, List<? extends Map<String, ? extends Object>> addresses, String tin) {
                return new C0218c(country, firstName, lastName, middleName, legalName, gender, dob, placeOfBirth, countryOfBirth, stateOfBirth, nationality, addresses, tin);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0218c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<? extends Map<String, ? extends Object>> list, String str12) {
                this.country = str;
                this.firstName = str2;
                this.lastName = str3;
                this.middleName = str4;
                this.legalName = str5;
                this.gender = str6;
                this.dob = str7;
                this.placeOfBirth = str8;
                this.countryOfBirth = str9;
                this.stateOfBirth = str10;
                this.nationality = str11;
                this.addresses = list;
                this.tin = str12;
            }

            public static final void a(C0218c self, InterfaceC1143c output, pa.f serialDesc) {
                if (output.D() || self.country != null) {
                    output.e(serialDesc, 0, m0.f26414a, self.country);
                }
                if (output.D() || self.firstName != null) {
                    output.e(serialDesc, 1, m0.f26414a, self.firstName);
                }
                if (output.D() || self.lastName != null) {
                    output.e(serialDesc, 2, m0.f26414a, self.lastName);
                }
                if (output.D() || self.middleName != null) {
                    output.e(serialDesc, 3, m0.f26414a, self.middleName);
                }
                if (output.D() || self.legalName != null) {
                    output.e(serialDesc, 4, m0.f26414a, self.legalName);
                }
                if (output.D() || self.gender != null) {
                    output.e(serialDesc, 5, m0.f26414a, self.gender);
                }
                if (output.D() || self.dob != null) {
                    output.e(serialDesc, 6, m0.f26414a, self.dob);
                }
                if (output.D() || self.placeOfBirth != null) {
                    output.e(serialDesc, 7, m0.f26414a, self.placeOfBirth);
                }
                if (output.D() || self.countryOfBirth != null) {
                    output.e(serialDesc, 8, m0.f26414a, self.countryOfBirth);
                }
                if (output.D() || self.stateOfBirth != null) {
                    output.e(serialDesc, 9, m0.f26414a, self.stateOfBirth);
                }
                if (output.D() || self.nationality != null) {
                    output.e(serialDesc, 10, m0.f26414a, self.nationality);
                }
                if (output.D() || self.addresses != null) {
                    output.e(serialDesc, 11, new C1169d(new K(m0.f26414a, C1095a.a(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), 0), self.addresses);
                }
                if (!output.D() && self.tin == null) {
                    return;
                }
                output.e(serialDesc, 12, m0.f26414a, self.tin);
            }

            public static /* synthetic */ void A() {
            }

            public static /* synthetic */ void C() {
            }

            public static /* synthetic */ void E() {
            }

            public static /* synthetic */ void G() {
            }

            public static /* synthetic */ void I() {
            }

            public static /* synthetic */ void K() {
            }

            public static /* synthetic */ void M() {
            }

            public static /* synthetic */ void o() {
            }

            public static /* synthetic */ void q() {
            }

            public static /* synthetic */ void s() {
            }

            public static /* synthetic */ void u() {
            }

            public static /* synthetic */ void w() {
            }

            public static /* synthetic */ void y() {
            }

            public /* synthetic */ C0218c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : list, (i & 4096) == 0 ? str12 : null);
            }
        }

        @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002(4B\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"B¯\u0002\b\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010)J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010)J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u00106J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010)J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010)J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010)J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010)J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010)J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010)J\u0012\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bC\u0010:J\u009c\u0002\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\b(\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010)J\u0010\u0010F\u001a\u00020#HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ(\u0010(\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OHÇ\u0001¢\u0006\u0004\b(\u0010RR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010)R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010S\u0012\u0004\bX\u0010V\u001a\u0004\bW\u0010)R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010Y\u0012\u0004\b[\u0010V\u001a\u0004\bZ\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010S\u0012\u0004\b]\u0010V\u001a\u0004\b\\\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010S\u0012\u0004\b_\u0010V\u001a\u0004\b^\u0010)R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010`\u0012\u0004\bb\u0010V\u001a\u0004\ba\u00100R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010S\u0012\u0004\bd\u0010V\u001a\u0004\bc\u0010)R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010S\u0012\u0004\bf\u0010V\u001a\u0004\be\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010S\u0012\u0004\bh\u0010V\u001a\u0004\bg\u0010)R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010S\u0012\u0004\bj\u0010V\u001a\u0004\bi\u0010)R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010k\u0012\u0004\bm\u0010V\u001a\u0004\bl\u00106R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010k\u0012\u0004\bo\u0010V\u001a\u0004\bn\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010S\u0012\u0004\bq\u0010V\u001a\u0004\bp\u0010)R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010r\u0012\u0004\bt\u0010V\u001a\u0004\bs\u0010:R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010S\u0012\u0004\bv\u0010V\u001a\u0004\bu\u0010)R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010S\u0012\u0004\bx\u0010V\u001a\u0004\bw\u0010)R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010S\u0012\u0004\bz\u0010V\u001a\u0004\by\u0010)R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010S\u0012\u0004\b|\u0010V\u001a\u0004\b{\u0010)R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010S\u0012\u0004\b~\u0010V\u001a\u0004\b}\u0010)R#\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b1\u0010S\u0012\u0005\b\u0080\u0001\u0010V\u001a\u0004\b\u007f\u0010)R%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b2\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010V\u001a\u0005\b\u0082\u0001\u0010BR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b3\u0010r\u0012\u0005\b\u0085\u0001\u0010V\u001a\u0005\b\u0084\u0001\u0010:¨\u0006\u0087\u0001"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;", "", "", "createdAt", "inspectionId", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;", "requiredIdDocs", "clientId", "externalUserId", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;", "review", "id", "applicantId", "env", "type", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "info", "fixedInfo", LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, "", "Lcom/sumsub/sns/internal/core/data/model/remote/e;", "metadata", "email", "tin", "phone", "key", "applicantPlatform", "ipCountry", "Lcom/sumsub/sns/internal/core/data/model/b;", "agreement", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;", "questionnaires", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/b;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/b;Ljava/util/List;Lra/i0;)V", "a", "()Ljava/lang/String;", "l", "p", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;", "q", "r", "s", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;", "t", "u", "v", "b", "c", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "d", "e", "f", "()Ljava/util/List;", "g", "h", "i", "j", "k", "m", "n", "()Lcom/sumsub/sns/internal/core/data/model/b;", "o", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/b;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$d;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "E", "getCreatedAt$annotations", "()V", "S", "getInspectionId$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;", "g0", "getRequiredIdDocs$annotations", "C", "getClientId$annotations", "K", "getExternalUserId$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;", "i0", "getReview$annotations", "O", "getId$annotations", "y", "getApplicantId$annotations", "I", "getEnv$annotations", "m0", "getType$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$c;", "Q", "getInfo$annotations", "M", "getFixedInfo$annotations", "Y", "getLang$annotations", "Ljava/util/List;", "a0", "getMetadata$annotations", "G", "getEmail$annotations", "k0", "getTin$annotations", "c0", "getPhone$annotations", "W", "getKey$annotations", "A", "getApplicantPlatform$annotations", "U", "getIpCountry$annotations", "Lcom/sumsub/sns/internal/core/data/model/b;", "w", "getAgreement$annotations", "e0", "getQuestionnaires$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$d, reason: collision with other inner class name */
        public static final /* data */ class C0219d {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final String createdAt;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final String inspectionId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final e requiredIdDocs;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final String clientId;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public final String externalUserId;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final f review;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            public final String id;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            public final String applicantId;

            /* renamed from: i, reason: from kotlin metadata */
            public final String env;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final String type;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            public final C0218c info;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata */
            public final C0218c fixedInfo;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata */
            public final String lang;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata */
            public final List<com.sumsub.sns.internal.core.data.model.remote.e> metadata;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            public final String email;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            public final String tin;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final String phone;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            public final String key;

            /* renamed from: s, reason: collision with root package name and from kotlin metadata */
            public final String applicantPlatform;

            /* renamed from: t, reason: collision with root package name and from kotlin metadata */
            public final String ipCountry;

            /* renamed from: u, reason: collision with root package name and from kotlin metadata */
            public final com.sumsub.sns.internal.core.data.model.b agreement;

            /* renamed from: v, reason: collision with root package name and from kotlin metadata */
            public final List<u> questionnaires;

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$d$a */
            public static final class a implements InterfaceC1162A<C0219d> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15726a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15727b;

                static {
                    a aVar = new a();
                    f15726a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.Item", aVar, 22);
                    pluginGeneratedSerialDescriptor.k("createdAt", true);
                    pluginGeneratedSerialDescriptor.k("inspectionId", true);
                    pluginGeneratedSerialDescriptor.k("requiredIdDocs", false);
                    pluginGeneratedSerialDescriptor.k("clientId", true);
                    pluginGeneratedSerialDescriptor.k("externalUserId", true);
                    pluginGeneratedSerialDescriptor.k("review", false);
                    pluginGeneratedSerialDescriptor.k("id", true);
                    pluginGeneratedSerialDescriptor.k("applicantId", true);
                    pluginGeneratedSerialDescriptor.k("env", true);
                    pluginGeneratedSerialDescriptor.k("type", true);
                    pluginGeneratedSerialDescriptor.k("info", true);
                    pluginGeneratedSerialDescriptor.k("fixedInfo", true);
                    pluginGeneratedSerialDescriptor.k(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, true);
                    pluginGeneratedSerialDescriptor.k("metadata", true);
                    pluginGeneratedSerialDescriptor.k("email", true);
                    pluginGeneratedSerialDescriptor.k("tin", true);
                    pluginGeneratedSerialDescriptor.k("phone", true);
                    pluginGeneratedSerialDescriptor.k("key", true);
                    pluginGeneratedSerialDescriptor.k("applicantPlatform", true);
                    pluginGeneratedSerialDescriptor.k("ipCountry", true);
                    pluginGeneratedSerialDescriptor.k("agreement", true);
                    pluginGeneratedSerialDescriptor.k("questionnaires", true);
                    f15727b = pluginGeneratedSerialDescriptor;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0219d deserialize(InterfaceC1144d interfaceC1144d) {
                    Object obj;
                    int i;
                    Object obj2;
                    Object obj3;
                    int i9;
                    Object obj4;
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    Object obj13 = null;
                    Object obj14 = null;
                    Object obj15 = null;
                    Object obj16 = null;
                    Object obj17 = null;
                    Object obj18 = null;
                    Object obj19 = null;
                    String str = null;
                    Object obj20 = null;
                    e eVar = null;
                    Object obj21 = null;
                    Object obj22 = null;
                    f fVar = null;
                    String str2 = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        Object obj23 = obj14;
                        int q10 = c2.q(descriptor);
                        Object obj24 = obj18;
                        switch (q10) {
                            case -1:
                                obj14 = obj23;
                                z10 = false;
                                obj13 = obj13;
                                obj18 = obj24;
                                obj22 = obj22;
                                obj11 = obj11;
                                obj20 = obj20;
                                obj10 = obj10;
                                obj19 = obj19;
                                obj15 = obj15;
                            case 0:
                                obj14 = obj23;
                                obj = obj13;
                                Object obj25 = obj19;
                                obj16 = obj16;
                                obj17 = obj17;
                                obj12 = obj12;
                                obj22 = obj22;
                                obj21 = obj21;
                                obj11 = obj11;
                                i = 1;
                                obj20 = obj20;
                                obj10 = obj10;
                                obj19 = c2.D(descriptor, 0, m0.f26414a, obj25);
                                obj15 = obj15;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 1:
                                obj14 = obj23;
                                obj = obj13;
                                Object obj26 = obj20;
                                obj16 = obj16;
                                obj17 = obj17;
                                obj12 = obj12;
                                obj22 = obj22;
                                obj21 = obj21;
                                obj11 = obj11;
                                i = 2;
                                obj20 = c2.D(descriptor, 1, m0.f26414a, obj26);
                                obj10 = obj10;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 2:
                                Object obj27 = obj11;
                                obj14 = obj23;
                                obj = obj13;
                                eVar = c2.C(descriptor, 2, e.a.f15734a, eVar);
                                obj16 = obj16;
                                obj17 = obj17;
                                obj12 = obj12;
                                obj22 = obj22;
                                obj21 = obj21;
                                obj11 = obj27;
                                i = 4;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 3:
                                obj14 = obj23;
                                obj = obj13;
                                obj21 = c2.D(descriptor, 3, m0.f26414a, obj21);
                                obj16 = obj16;
                                obj11 = obj11;
                                obj12 = obj12;
                                i = 8;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 4:
                                obj14 = obj23;
                                obj = obj13;
                                obj22 = c2.D(descriptor, 4, m0.f26414a, obj22);
                                obj16 = obj16;
                                obj11 = obj11;
                                obj12 = obj12;
                                i = 16;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 5:
                                obj = obj13;
                                fVar = c2.C(descriptor, 5, f.a.f15756a, fVar);
                                obj14 = obj23;
                                obj16 = obj16;
                                obj12 = obj12;
                                i = 32;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 6:
                                obj2 = obj16;
                                obj3 = obj23;
                                obj = obj13;
                                i9 = 64;
                                str = c2.y(descriptor, 6);
                                i = i9;
                                obj14 = obj3;
                                obj16 = obj2;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 7:
                                obj2 = obj16;
                                obj3 = obj23;
                                obj = obj13;
                                i9 = 128;
                                str2 = c2.y(descriptor, 7);
                                i = i9;
                                obj14 = obj3;
                                obj16 = obj2;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 8:
                                obj = obj13;
                                obj16 = obj16;
                                i = 256;
                                obj14 = c2.D(descriptor, 8, m0.f26414a, obj23);
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 9:
                                obj4 = obj16;
                                i = 512;
                                obj24 = c2.D(descriptor, 9, m0.f26414a, obj24);
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 10:
                                i = 1024;
                                obj16 = c2.D(descriptor, 10, C0218c.a.f15703a, obj16);
                                obj14 = obj23;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 11:
                                obj4 = obj16;
                                i = 2048;
                                obj17 = c2.D(descriptor, 11, C0218c.a.f15703a, obj17);
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 12:
                                obj4 = obj16;
                                i = 4096;
                                obj15 = c2.D(descriptor, 12, m0.f26414a, obj15);
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 13:
                                obj4 = obj16;
                                obj13 = c2.D(descriptor, 13, new C1169d(e.a.f15591a, 0), obj13);
                                i = 8192;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 14:
                                obj4 = obj16;
                                obj7 = c2.D(descriptor, 14, m0.f26414a, obj7);
                                i = 16384;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 15:
                                obj4 = obj16;
                                obj6 = c2.D(descriptor, 15, m0.f26414a, obj6);
                                i = 32768;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 16:
                                obj4 = obj16;
                                obj5 = c2.D(descriptor, 16, m0.f26414a, obj5);
                                i = 65536;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 17:
                                obj4 = obj16;
                                obj8 = c2.D(descriptor, 17, m0.f26414a, obj8);
                                i = 131072;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 18:
                                obj4 = obj16;
                                obj9 = c2.D(descriptor, 18, m0.f26414a, obj9);
                                i = 262144;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 19:
                                obj4 = obj16;
                                obj10 = c2.D(descriptor, 19, m0.f26414a, obj10);
                                i = 524288;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 20:
                                obj4 = obj16;
                                obj11 = c2.D(descriptor, 20, b.a.f15405a, obj11);
                                i = PKIFailureInfo.badCertTemplate;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            case 21:
                                obj4 = obj16;
                                obj12 = c2.D(descriptor, 21, new C1169d(u.a.f16065a, 0), obj12);
                                i = PKIFailureInfo.badSenderNonce;
                                obj14 = obj23;
                                obj16 = obj4;
                                obj = obj13;
                                i10 |= i;
                                obj13 = obj;
                                obj18 = obj24;
                            default:
                                throw new UnknownFieldException(q10);
                        }
                    }
                    Object obj28 = obj11;
                    Object obj29 = obj12;
                    Object obj30 = obj18;
                    Object obj31 = obj21;
                    Object obj32 = obj22;
                    Object obj33 = obj16;
                    Object obj34 = obj17;
                    Object obj35 = obj20;
                    Object obj36 = obj19;
                    Object obj37 = obj15;
                    c2.b(descriptor);
                    return new C0219d(i10, (String) obj36, (String) obj35, eVar, (String) obj31, (String) obj32, fVar, str, str2, (String) obj14, (String) obj30, (C0218c) obj33, (C0218c) obj34, (String) obj37, (List) obj13, (String) obj7, (String) obj6, (String) obj5, (String) obj8, (String) obj9, (String) obj10, (com.sumsub.sns.internal.core.data.model.b) obj28, (List) obj29, (i0) null);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    m0 m0Var = m0.f26414a;
                    InterfaceC1078b<?> a10 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a11 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a12 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a13 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a14 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a15 = C1095a.a(m0Var);
                    C0218c.a aVar = C0218c.a.f15703a;
                    return new InterfaceC1078b[]{a10, a11, e.a.f15734a, a12, a13, f.a.f15756a, m0Var, m0Var, a14, a15, C1095a.a(aVar), C1095a.a(aVar), C1095a.a(m0Var), C1095a.a(new C1169d(e.a.f15591a, 0)), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(b.a.f15405a), C1095a.a(new C1169d(u.a.f16065a, 0))};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15727b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, C0219d c0219d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    C0219d.a(c0219d, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<C0219d> serializer() {
                    return a.f15726a;
                }

                public Companion() {
                }
            }

            public /* synthetic */ C0219d(int i, String str, String str2, e eVar, String str3, String str4, f fVar, String str5, String str6, String str7, String str8, C0218c c0218c, C0218c c0218c2, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, com.sumsub.sns.internal.core.data.model.b bVar, List list2, i0 i0Var) {
                if (36 != (i & 36)) {
                    a0.h(i, 36, a.f15726a.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.createdAt = null;
                } else {
                    this.createdAt = str;
                }
                if ((i & 2) == 0) {
                    this.inspectionId = null;
                } else {
                    this.inspectionId = str2;
                }
                this.requiredIdDocs = eVar;
                if ((i & 8) == 0) {
                    this.clientId = null;
                } else {
                    this.clientId = str3;
                }
                if ((i & 16) == 0) {
                    this.externalUserId = null;
                } else {
                    this.externalUserId = str4;
                }
                this.review = fVar;
                if ((i & 64) == 0) {
                    this.id = "";
                } else {
                    this.id = str5;
                }
                if ((i & 128) == 0) {
                    this.applicantId = "";
                } else {
                    this.applicantId = str6;
                }
                if ((i & 256) == 0) {
                    this.env = null;
                } else {
                    this.env = str7;
                }
                if ((i & 512) == 0) {
                    this.type = null;
                } else {
                    this.type = str8;
                }
                if ((i & 1024) == 0) {
                    this.info = null;
                } else {
                    this.info = c0218c;
                }
                if ((i & 2048) == 0) {
                    this.fixedInfo = null;
                } else {
                    this.fixedInfo = c0218c2;
                }
                if ((i & 4096) == 0) {
                    this.lang = null;
                } else {
                    this.lang = str9;
                }
                if ((i & 8192) == 0) {
                    this.metadata = null;
                } else {
                    this.metadata = list;
                }
                if ((i & 16384) == 0) {
                    this.email = null;
                } else {
                    this.email = str10;
                }
                if ((32768 & i) == 0) {
                    this.tin = null;
                } else {
                    this.tin = str11;
                }
                if ((65536 & i) == 0) {
                    this.phone = null;
                } else {
                    this.phone = str12;
                }
                if ((131072 & i) == 0) {
                    this.key = null;
                } else {
                    this.key = str13;
                }
                if ((262144 & i) == 0) {
                    this.applicantPlatform = null;
                } else {
                    this.applicantPlatform = str14;
                }
                if ((524288 & i) == 0) {
                    this.ipCountry = null;
                } else {
                    this.ipCountry = str15;
                }
                if ((1048576 & i) == 0) {
                    this.agreement = null;
                } else {
                    this.agreement = bVar;
                }
                if ((i & PKIFailureInfo.badSenderNonce) == 0) {
                    this.questionnaires = null;
                } else {
                    this.questionnaires = list2;
                }
            }

            /* renamed from: A, reason: from getter */
            public final String getApplicantPlatform() {
                return this.applicantPlatform;
            }

            /* renamed from: C, reason: from getter */
            public final String getClientId() {
                return this.clientId;
            }

            /* renamed from: E, reason: from getter */
            public final String getCreatedAt() {
                return this.createdAt;
            }

            /* renamed from: G, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            /* renamed from: I, reason: from getter */
            public final String getEnv() {
                return this.env;
            }

            /* renamed from: K, reason: from getter */
            public final String getExternalUserId() {
                return this.externalUserId;
            }

            /* renamed from: M, reason: from getter */
            public final C0218c getFixedInfo() {
                return this.fixedInfo;
            }

            /* renamed from: O, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: Q, reason: from getter */
            public final C0218c getInfo() {
                return this.info;
            }

            /* renamed from: S, reason: from getter */
            public final String getInspectionId() {
                return this.inspectionId;
            }

            /* renamed from: U, reason: from getter */
            public final String getIpCountry() {
                return this.ipCountry;
            }

            /* renamed from: W, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: Y, reason: from getter */
            public final String getLang() {
                return this.lang;
            }

            public final String a() {
                return this.createdAt;
            }

            public final List<com.sumsub.sns.internal.core.data.model.remote.e> a0() {
                return this.metadata;
            }

            /* renamed from: b, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final C0218c c() {
                return this.info;
            }

            /* renamed from: c0, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            public final C0218c d() {
                return this.fixedInfo;
            }

            public final String e() {
                return this.lang;
            }

            public final List<u> e0() {
                return this.questionnaires;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0219d)) {
                    return false;
                }
                C0219d c0219d = (C0219d) other;
                return kotlin.jvm.internal.f.b(this.createdAt, c0219d.createdAt) && kotlin.jvm.internal.f.b(this.inspectionId, c0219d.inspectionId) && kotlin.jvm.internal.f.b(this.requiredIdDocs, c0219d.requiredIdDocs) && kotlin.jvm.internal.f.b(this.clientId, c0219d.clientId) && kotlin.jvm.internal.f.b(this.externalUserId, c0219d.externalUserId) && kotlin.jvm.internal.f.b(this.review, c0219d.review) && kotlin.jvm.internal.f.b(this.id, c0219d.id) && kotlin.jvm.internal.f.b(this.applicantId, c0219d.applicantId) && kotlin.jvm.internal.f.b(this.env, c0219d.env) && kotlin.jvm.internal.f.b(this.type, c0219d.type) && kotlin.jvm.internal.f.b(this.info, c0219d.info) && kotlin.jvm.internal.f.b(this.fixedInfo, c0219d.fixedInfo) && kotlin.jvm.internal.f.b(this.lang, c0219d.lang) && kotlin.jvm.internal.f.b(this.metadata, c0219d.metadata) && kotlin.jvm.internal.f.b(this.email, c0219d.email) && kotlin.jvm.internal.f.b(this.tin, c0219d.tin) && kotlin.jvm.internal.f.b(this.phone, c0219d.phone) && kotlin.jvm.internal.f.b(this.key, c0219d.key) && kotlin.jvm.internal.f.b(this.applicantPlatform, c0219d.applicantPlatform) && kotlin.jvm.internal.f.b(this.ipCountry, c0219d.ipCountry) && kotlin.jvm.internal.f.b(this.agreement, c0219d.agreement) && kotlin.jvm.internal.f.b(this.questionnaires, c0219d.questionnaires);
            }

            public final List<com.sumsub.sns.internal.core.data.model.remote.e> f() {
                return this.metadata;
            }

            public final String g() {
                return this.email;
            }

            /* renamed from: g0, reason: from getter */
            public final e getRequiredIdDocs() {
                return this.requiredIdDocs;
            }

            /* renamed from: h, reason: from getter */
            public final String getTin() {
                return this.tin;
            }

            public int hashCode() {
                String str = this.createdAt;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.inspectionId;
                int hashCode2 = (this.requiredIdDocs.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                String str3 = this.clientId;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.externalUserId;
                int c2 = v.c(v.c((this.review.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.id), 31, this.applicantId);
                String str5 = this.env;
                int hashCode4 = (c2 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.type;
                int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
                C0218c c0218c = this.info;
                int hashCode6 = (hashCode5 + (c0218c == null ? 0 : c0218c.hashCode())) * 31;
                C0218c c0218c2 = this.fixedInfo;
                int hashCode7 = (hashCode6 + (c0218c2 == null ? 0 : c0218c2.hashCode())) * 31;
                String str7 = this.lang;
                int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                List<com.sumsub.sns.internal.core.data.model.remote.e> list = this.metadata;
                int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
                String str8 = this.email;
                int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.tin;
                int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.phone;
                int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.key;
                int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.applicantPlatform;
                int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.ipCountry;
                int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
                com.sumsub.sns.internal.core.data.model.b bVar = this.agreement;
                int hashCode16 = (hashCode15 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                List<u> list2 = this.questionnaires;
                return hashCode16 + (list2 != null ? list2.hashCode() : 0);
            }

            public final String i() {
                return this.phone;
            }

            /* renamed from: i0, reason: from getter */
            public final f getReview() {
                return this.review;
            }

            public final String j() {
                return this.key;
            }

            public final String k() {
                return this.applicantPlatform;
            }

            public final String k0() {
                return this.tin;
            }

            public final String l() {
                return this.inspectionId;
            }

            public final String m() {
                return this.ipCountry;
            }

            public final String m0() {
                return this.type;
            }

            /* renamed from: n, reason: from getter */
            public final com.sumsub.sns.internal.core.data.model.b getAgreement() {
                return this.agreement;
            }

            public final List<u> o() {
                return this.questionnaires;
            }

            public final e p() {
                return this.requiredIdDocs;
            }

            public final String q() {
                return this.clientId;
            }

            public final String r() {
                return this.externalUserId;
            }

            public final f s() {
                return this.review;
            }

            public final String t() {
                return this.id;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Item(createdAt=");
                sb2.append(this.createdAt);
                sb2.append(", inspectionId=");
                sb2.append(this.inspectionId);
                sb2.append(", requiredIdDocs=");
                sb2.append(this.requiredIdDocs);
                sb2.append(", clientId=");
                sb2.append(this.clientId);
                sb2.append(", externalUserId=");
                sb2.append(this.externalUserId);
                sb2.append(", review=");
                sb2.append(this.review);
                sb2.append(", id=");
                sb2.append(this.id);
                sb2.append(", applicantId=");
                sb2.append(this.applicantId);
                sb2.append(", env=");
                sb2.append(this.env);
                sb2.append(", type=");
                sb2.append(this.type);
                sb2.append(", info=");
                sb2.append(this.info);
                sb2.append(", fixedInfo=");
                sb2.append(this.fixedInfo);
                sb2.append(", lang=");
                sb2.append(this.lang);
                sb2.append(", metadata=");
                sb2.append(this.metadata);
                sb2.append(", email=");
                sb2.append(this.email);
                sb2.append(", tin=");
                sb2.append(this.tin);
                sb2.append(", phone=");
                sb2.append(this.phone);
                sb2.append(", key=");
                sb2.append(this.key);
                sb2.append(", applicantPlatform=");
                sb2.append(this.applicantPlatform);
                sb2.append(", ipCountry=");
                sb2.append(this.ipCountry);
                sb2.append(", agreement=");
                sb2.append(this.agreement);
                sb2.append(", questionnaires=");
                return v.r(sb2, this.questionnaires, ')');
            }

            /* renamed from: u, reason: from getter */
            public final String getApplicantId() {
                return this.applicantId;
            }

            public final String v() {
                return this.env;
            }

            public final com.sumsub.sns.internal.core.data.model.b w() {
                return this.agreement;
            }

            public final String y() {
                return this.applicantId;
            }

            public C0219d(String str, String str2, e eVar, String str3, String str4, f fVar, String str5, String str6, String str7, String str8, C0218c c0218c, C0218c c0218c2, String str9, List<com.sumsub.sns.internal.core.data.model.remote.e> list, String str10, String str11, String str12, String str13, String str14, String str15, com.sumsub.sns.internal.core.data.model.b bVar, List<u> list2) {
                this.createdAt = str;
                this.inspectionId = str2;
                this.requiredIdDocs = eVar;
                this.clientId = str3;
                this.externalUserId = str4;
                this.review = fVar;
                this.id = str5;
                this.applicantId = str6;
                this.env = str7;
                this.type = str8;
                this.info = c0218c;
                this.fixedInfo = c0218c2;
                this.lang = str9;
                this.metadata = list;
                this.email = str10;
                this.tin = str11;
                this.phone = str12;
                this.key = str13;
                this.applicantPlatform = str14;
                this.ipCountry = str15;
                this.agreement = bVar;
                this.questionnaires = list2;
            }

            public final C0219d a(String createdAt, String inspectionId, e requiredIdDocs, String clientId, String externalUserId, f review, String id, String applicantId, String env, String type, C0218c info, C0218c fixedInfo, String lang, List<com.sumsub.sns.internal.core.data.model.remote.e> metadata, String email, String tin, String phone, String key, String applicantPlatform, String ipCountry, com.sumsub.sns.internal.core.data.model.b agreement, List<u> questionnaires) {
                return new C0219d(createdAt, inspectionId, requiredIdDocs, clientId, externalUserId, review, id, applicantId, env, type, info, fixedInfo, lang, metadata, email, tin, phone, key, applicantPlatform, ipCountry, agreement, questionnaires);
            }

            public static final void a(C0219d self, InterfaceC1143c output, pa.f serialDesc) {
                if (output.D() || self.createdAt != null) {
                    output.e(serialDesc, 0, m0.f26414a, self.createdAt);
                }
                if (output.D() || self.inspectionId != null) {
                    output.e(serialDesc, 1, m0.f26414a, self.inspectionId);
                }
                output.C(serialDesc, 2, e.a.f15734a, self.requiredIdDocs);
                if (output.D() || self.clientId != null) {
                    output.e(serialDesc, 3, m0.f26414a, self.clientId);
                }
                if (output.D() || self.externalUserId != null) {
                    output.e(serialDesc, 4, m0.f26414a, self.externalUserId);
                }
                output.C(serialDesc, 5, f.a.f15756a, self.review);
                if (output.D() || !kotlin.jvm.internal.f.b(self.id, "")) {
                    output.x(serialDesc, 6, self.id);
                }
                if (output.D() || !kotlin.jvm.internal.f.b(self.applicantId, "")) {
                    output.x(serialDesc, 7, self.applicantId);
                }
                if (output.D() || self.env != null) {
                    output.e(serialDesc, 8, m0.f26414a, self.env);
                }
                if (output.D() || self.type != null) {
                    output.e(serialDesc, 9, m0.f26414a, self.type);
                }
                if (output.D() || self.info != null) {
                    output.e(serialDesc, 10, C0218c.a.f15703a, self.info);
                }
                if (output.D() || self.fixedInfo != null) {
                    output.e(serialDesc, 11, C0218c.a.f15703a, self.fixedInfo);
                }
                if (output.D() || self.lang != null) {
                    output.e(serialDesc, 12, m0.f26414a, self.lang);
                }
                if (output.D() || self.metadata != null) {
                    output.e(serialDesc, 13, new C1169d(e.a.f15591a, 0), self.metadata);
                }
                if (output.D() || self.email != null) {
                    output.e(serialDesc, 14, m0.f26414a, self.email);
                }
                if (output.D() || self.tin != null) {
                    output.e(serialDesc, 15, m0.f26414a, self.tin);
                }
                if (output.D() || self.phone != null) {
                    output.e(serialDesc, 16, m0.f26414a, self.phone);
                }
                if (output.D() || self.key != null) {
                    output.e(serialDesc, 17, m0.f26414a, self.key);
                }
                if (output.D() || self.applicantPlatform != null) {
                    output.e(serialDesc, 18, m0.f26414a, self.applicantPlatform);
                }
                if (output.D() || self.ipCountry != null) {
                    output.e(serialDesc, 19, m0.f26414a, self.ipCountry);
                }
                if (output.D() || self.agreement != null) {
                    output.e(serialDesc, 20, b.a.f15405a, self.agreement);
                }
                if (!output.D() && self.questionnaires == null) {
                    return;
                }
                output.e(serialDesc, 21, new C1169d(u.a.f16065a, 0), self.questionnaires);
            }

            public static /* synthetic */ void B() {
            }

            public static /* synthetic */ void D() {
            }

            public static /* synthetic */ void F() {
            }

            public static /* synthetic */ void H() {
            }

            public static /* synthetic */ void J() {
            }

            public static /* synthetic */ void L() {
            }

            public static /* synthetic */ void N() {
            }

            public static /* synthetic */ void P() {
            }

            public static /* synthetic */ void R() {
            }

            public static /* synthetic */ void T() {
            }

            public static /* synthetic */ void V() {
            }

            public static /* synthetic */ void X() {
            }

            public static /* synthetic */ void Z() {
            }

            public static /* synthetic */ void b0() {
            }

            public static /* synthetic */ void d0() {
            }

            public static /* synthetic */ void f0() {
            }

            public static /* synthetic */ void h0() {
            }

            public static /* synthetic */ void j0() {
            }

            public static /* synthetic */ void l0() {
            }

            public static /* synthetic */ void n0() {
            }

            public static /* synthetic */ void x() {
            }

            public static /* synthetic */ void z() {
            }

            public /* synthetic */ C0219d(String str, String str2, e eVar, String str3, String str4, f fVar, String str5, String str6, String str7, String str8, C0218c c0218c, C0218c c0218c2, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, com.sumsub.sns.internal.core.data.model.b bVar, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, eVar, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, fVar, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : c0218c, (i & 2048) != 0 ? null : c0218c2, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : str14, (524288 & i) != 0 ? null : str15, (1048576 & i) != 0 ? null : bVar, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : list2);
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003\u0019\u001c\u001eBm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0081\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJv\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001bR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010*\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010\u001bR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001bR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010*\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;", "", "", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e$c;", "docSets", "", "videoIdent", "", "videoIdentUploadTypes", "stepsOutsideVideoId", "includedCountries", "excludedCountries", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;Lqa/c;Lpa/f;)V", "()Ljava/util/List;", "b", "()Ljava/lang/Boolean;", "c", "d", "e", "f", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "getDocSets$annotations", "()V", "Ljava/lang/Boolean;", "o", "getVideoIdent$annotations", "q", "getVideoIdentUploadTypes$annotations", "m", "getStepsOutsideVideoId$annotations", "k", "getIncludedCountries$annotations", "i", "getExcludedCountries$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class e {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final List<C0220c> docSets;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final Boolean videoIdent;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final List<String> videoIdentUploadTypes;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final List<String> stepsOutsideVideoId;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public final List<String> includedCountries;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final List<String> excludedCountries;

            public static final class a implements InterfaceC1162A<e> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15734a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15735b;

                static {
                    a aVar = new a();
                    f15734a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.RequiredIdDocs", aVar, 6);
                    pluginGeneratedSerialDescriptor.k("docSets", true);
                    pluginGeneratedSerialDescriptor.k("videoIdent", true);
                    pluginGeneratedSerialDescriptor.k("videoIdentUploadTypes", true);
                    pluginGeneratedSerialDescriptor.k("stepsOutsideVideoId", true);
                    pluginGeneratedSerialDescriptor.k("includedCountries", true);
                    pluginGeneratedSerialDescriptor.k("excludedCountries", true);
                    f15735b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    Object obj = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        switch (q10) {
                            case -1:
                                z10 = false;
                                break;
                            case 0:
                                obj = c2.D(descriptor, 0, new C1169d(C0220c.a.f15744a, 0), obj);
                                i |= 1;
                                break;
                            case 1:
                                obj2 = c2.D(descriptor, 1, C1172g.f26395a, obj2);
                                i |= 2;
                                break;
                            case 2:
                                obj3 = c2.D(descriptor, 2, new C1169d(m0.f26414a, 0), obj3);
                                i |= 4;
                                break;
                            case 3:
                                obj4 = c2.D(descriptor, 3, new C1169d(m0.f26414a, 0), obj4);
                                i |= 8;
                                break;
                            case 4:
                                obj5 = c2.D(descriptor, 4, new C1169d(m0.f26414a, 0), obj5);
                                i |= 16;
                                break;
                            case 5:
                                obj6 = c2.D(descriptor, 5, new C1169d(m0.f26414a, 0), obj6);
                                i |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(q10);
                        }
                    }
                    c2.b(descriptor);
                    return new e(i, (List) obj, (Boolean) obj2, (List) obj3, (List) obj4, (List) obj5, (List) obj6, (i0) null);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    InterfaceC1078b<?> a10 = C1095a.a(new C1169d(C0220c.a.f15744a, 0));
                    InterfaceC1078b<?> a11 = C1095a.a(C1172g.f26395a);
                    m0 m0Var = m0.f26414a;
                    return new InterfaceC1078b[]{a10, a11, C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(m0Var, 0))};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15735b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, e eVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    e.a(eVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<e> serializer() {
                    return a.f15734a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002\u0017\u0019B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u009f\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0094\u0001\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J(\u0010\u0017\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-HÇ\u0001¢\u0006\u0004\b\u0017\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0018R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u001aR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00101\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0018R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00105\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u001aR(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00105\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00101\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00101\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0018R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u00101\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010\u0018¨\u0006G"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e$c;", "", "", "idDocSetType", "", "types", "Lcom/sumsub/sns/internal/core/data/model/IdentitySide;", "sides", "videoRequired", "Lcom/sumsub/sns/internal/core/data/model/h$d;", "fields", "Lcom/sumsub/sns/internal/core/data/model/h$c;", "customFields", "questionnaireId", "questionnaireDefId", "captureMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "c", "d", "e", "f", "g", "h", "i", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$e$c;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "p", "getIdDocSetType$annotations", "()V", "Ljava/util/List;", "x", "getTypes$annotations", "v", "getSides$annotations", "z", "getVideoRequired$annotations", "n", "getFields$annotations", "l", "getCustomFields$annotations", "t", "getQuestionnaireId$annotations", "r", "getQuestionnaireDefId$annotations", "j", "getCaptureMode$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$e$c, reason: collision with other inner class name */
            public static final /* data */ class C0220c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String idDocSetType;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final List<String> types;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final List<IdentitySide> sides;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                public final String videoRequired;

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                public final List<h.d> fields;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                public final List<h.c> customFields;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                public final String questionnaireId;

                /* renamed from: h, reason: collision with root package name and from kotlin metadata */
                public final String questionnaireDefId;

                /* renamed from: i, reason: from kotlin metadata */
                public final String captureMode;

                /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$e$c$a */
                public static final class a implements InterfaceC1162A<C0220c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15744a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15745b;

                    static {
                        a aVar = new a();
                        f15744a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.RequiredIdDocs.DocSetsItem", aVar, 9);
                        pluginGeneratedSerialDescriptor.k("idDocSetType", true);
                        pluginGeneratedSerialDescriptor.k("types", true);
                        pluginGeneratedSerialDescriptor.k("subTypes", true);
                        pluginGeneratedSerialDescriptor.k("videoRequired", true);
                        pluginGeneratedSerialDescriptor.k("fields", true);
                        pluginGeneratedSerialDescriptor.k("customFields", true);
                        pluginGeneratedSerialDescriptor.k("questionnaireId", true);
                        pluginGeneratedSerialDescriptor.k("questionnaireDefId", true);
                        pluginGeneratedSerialDescriptor.k("captureMode", true);
                        f15745b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C0220c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        Object obj6 = null;
                        Object obj7 = null;
                        Object obj8 = null;
                        Object obj9 = null;
                        boolean z10 = true;
                        int i = 0;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            switch (q10) {
                                case -1:
                                    z10 = false;
                                    break;
                                case 0:
                                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                    i |= 1;
                                    break;
                                case 1:
                                    obj2 = c2.D(descriptor, 1, new C1169d(m0.f26414a, 0), obj2);
                                    i |= 2;
                                    break;
                                case 2:
                                    obj3 = c2.D(descriptor, 2, new C1169d(IdentitySide.a.f15261a, 0), obj3);
                                    i |= 4;
                                    break;
                                case 3:
                                    obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                                    i |= 8;
                                    break;
                                case 4:
                                    obj5 = c2.D(descriptor, 4, new C1169d(h.d.a.f15503a, 0), obj5);
                                    i |= 16;
                                    break;
                                case 5:
                                    obj6 = c2.D(descriptor, 5, new C1169d(h.c.a.f15494a, 0), obj6);
                                    i |= 32;
                                    break;
                                case 6:
                                    obj7 = c2.D(descriptor, 6, m0.f26414a, obj7);
                                    i |= 64;
                                    break;
                                case 7:
                                    obj8 = c2.D(descriptor, 7, m0.f26414a, obj8);
                                    i |= 128;
                                    break;
                                case 8:
                                    obj9 = c2.D(descriptor, 8, m0.f26414a, obj9);
                                    i |= 256;
                                    break;
                                default:
                                    throw new UnknownFieldException(q10);
                            }
                        }
                        c2.b(descriptor);
                        return new C0220c(i, (String) obj, (List) obj2, (List) obj3, (String) obj4, (List) obj5, (List) obj6, (String) obj7, (String) obj8, (String) obj9, (i0) null);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(IdentitySide.a.f15261a, 0)), C1095a.a(m0Var), C1095a.a(new C1169d(h.d.a.f15503a, 0)), C1095a.a(new C1169d(h.c.a.f15494a, 0)), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15745b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, C0220c c0220c) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        C0220c.a(c0220c, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<C0220c> serializer() {
                        return a.f15744a;
                    }

                    public Companion() {
                    }
                }

                public C0220c() {
                    this((String) null, (List) null, (List) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
                }

                /* renamed from: a, reason: from getter */
                public final String getIdDocSetType() {
                    return this.idDocSetType;
                }

                public final List<String> b() {
                    return this.types;
                }

                public final List<IdentitySide> c() {
                    return this.sides;
                }

                /* renamed from: d, reason: from getter */
                public final String getVideoRequired() {
                    return this.videoRequired;
                }

                public final List<h.d> e() {
                    return this.fields;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C0220c)) {
                        return false;
                    }
                    C0220c c0220c = (C0220c) other;
                    return kotlin.jvm.internal.f.b(this.idDocSetType, c0220c.idDocSetType) && kotlin.jvm.internal.f.b(this.types, c0220c.types) && kotlin.jvm.internal.f.b(this.sides, c0220c.sides) && kotlin.jvm.internal.f.b(this.videoRequired, c0220c.videoRequired) && kotlin.jvm.internal.f.b(this.fields, c0220c.fields) && kotlin.jvm.internal.f.b(this.customFields, c0220c.customFields) && kotlin.jvm.internal.f.b(this.questionnaireId, c0220c.questionnaireId) && kotlin.jvm.internal.f.b(this.questionnaireDefId, c0220c.questionnaireDefId) && kotlin.jvm.internal.f.b(this.captureMode, c0220c.captureMode);
                }

                public final List<h.c> f() {
                    return this.customFields;
                }

                /* renamed from: g, reason: from getter */
                public final String getQuestionnaireId() {
                    return this.questionnaireId;
                }

                /* renamed from: h, reason: from getter */
                public final String getQuestionnaireDefId() {
                    return this.questionnaireDefId;
                }

                public int hashCode() {
                    String str = this.idDocSetType;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    List<String> list = this.types;
                    int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                    List<IdentitySide> list2 = this.sides;
                    int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    String str2 = this.videoRequired;
                    int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    List<h.d> list3 = this.fields;
                    int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
                    List<h.c> list4 = this.customFields;
                    int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
                    String str3 = this.questionnaireId;
                    int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.questionnaireDefId;
                    int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.captureMode;
                    return hashCode8 + (str5 != null ? str5.hashCode() : 0);
                }

                /* renamed from: i, reason: from getter */
                public final String getCaptureMode() {
                    return this.captureMode;
                }

                public final String j() {
                    return this.captureMode;
                }

                public final List<h.c> l() {
                    return this.customFields;
                }

                public final List<h.d> n() {
                    return this.fields;
                }

                public final String p() {
                    return this.idDocSetType;
                }

                public final String r() {
                    return this.questionnaireDefId;
                }

                public final String t() {
                    return this.questionnaireId;
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("DocSetsItem(idDocSetType=");
                    sb2.append(this.idDocSetType);
                    sb2.append(", types=");
                    sb2.append(this.types);
                    sb2.append(", sides=");
                    sb2.append(this.sides);
                    sb2.append(", videoRequired=");
                    sb2.append(this.videoRequired);
                    sb2.append(", fields=");
                    sb2.append(this.fields);
                    sb2.append(", customFields=");
                    sb2.append(this.customFields);
                    sb2.append(", questionnaireId=");
                    sb2.append(this.questionnaireId);
                    sb2.append(", questionnaireDefId=");
                    sb2.append(this.questionnaireDefId);
                    sb2.append(", captureMode=");
                    return v.q(sb2, this.captureMode, ')');
                }

                public final List<IdentitySide> v() {
                    return this.sides;
                }

                public final List<String> x() {
                    return this.types;
                }

                public final String z() {
                    return this.videoRequired;
                }

                public /* synthetic */ C0220c(int i, String str, List list, List list2, String str2, List list3, List list4, String str3, String str4, String str5, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.idDocSetType = null;
                    } else {
                        this.idDocSetType = str;
                    }
                    if ((i & 2) == 0) {
                        this.types = null;
                    } else {
                        this.types = list;
                    }
                    if ((i & 4) == 0) {
                        this.sides = null;
                    } else {
                        this.sides = list2;
                    }
                    if ((i & 8) == 0) {
                        this.videoRequired = null;
                    } else {
                        this.videoRequired = str2;
                    }
                    if ((i & 16) == 0) {
                        this.fields = null;
                    } else {
                        this.fields = list3;
                    }
                    if ((i & 32) == 0) {
                        this.customFields = null;
                    } else {
                        this.customFields = list4;
                    }
                    if ((i & 64) == 0) {
                        this.questionnaireId = null;
                    } else {
                        this.questionnaireId = str3;
                    }
                    if ((i & 128) == 0) {
                        this.questionnaireDefId = null;
                    } else {
                        this.questionnaireDefId = str4;
                    }
                    if ((i & 256) == 0) {
                        this.captureMode = null;
                    } else {
                        this.captureMode = str5;
                    }
                }

                public final C0220c a(String idDocSetType, List<String> types, List<? extends IdentitySide> sides, String videoRequired, List<h.d> fields, List<h.c> customFields, String questionnaireId, String questionnaireDefId, String captureMode) {
                    return new C0220c(idDocSetType, types, sides, videoRequired, fields, customFields, questionnaireId, questionnaireDefId, captureMode);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0220c(String str, List<String> list, List<? extends IdentitySide> list2, String str2, List<h.d> list3, List<h.c> list4, String str3, String str4, String str5) {
                    this.idDocSetType = str;
                    this.types = list;
                    this.sides = list2;
                    this.videoRequired = str2;
                    this.fields = list3;
                    this.customFields = list4;
                    this.questionnaireId = str3;
                    this.questionnaireDefId = str4;
                    this.captureMode = str5;
                }

                public static final void a(C0220c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.idDocSetType != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.idDocSetType);
                    }
                    if (output.D() || self.types != null) {
                        output.e(serialDesc, 1, new C1169d(m0.f26414a, 0), self.types);
                    }
                    if (output.D() || self.sides != null) {
                        output.e(serialDesc, 2, new C1169d(IdentitySide.a.f15261a, 0), self.sides);
                    }
                    if (output.D() || self.videoRequired != null) {
                        output.e(serialDesc, 3, m0.f26414a, self.videoRequired);
                    }
                    if (output.D() || self.fields != null) {
                        output.e(serialDesc, 4, new C1169d(h.d.a.f15503a, 0), self.fields);
                    }
                    if (output.D() || self.customFields != null) {
                        output.e(serialDesc, 5, new C1169d(h.c.a.f15494a, 0), self.customFields);
                    }
                    if (output.D() || self.questionnaireId != null) {
                        output.e(serialDesc, 6, m0.f26414a, self.questionnaireId);
                    }
                    if (output.D() || self.questionnaireDefId != null) {
                        output.e(serialDesc, 7, m0.f26414a, self.questionnaireDefId);
                    }
                    if (!output.D() && self.captureMode == null) {
                        return;
                    }
                    output.e(serialDesc, 8, m0.f26414a, self.captureMode);
                }

                public /* synthetic */ C0220c(String str, List list, List list2, String str2, List list3, List list4, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
                }

                public static /* synthetic */ void A() {
                }

                public static /* synthetic */ void k() {
                }

                public static /* synthetic */ void m() {
                }

                public static /* synthetic */ void o() {
                }

                public static /* synthetic */ void q() {
                }

                public static /* synthetic */ void s() {
                }

                public static /* synthetic */ void u() {
                }

                public static /* synthetic */ void w() {
                }

                public static /* synthetic */ void y() {
                }
            }

            public e() {
                this((List) null, (Boolean) null, (List) null, (List) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
            }

            public final List<C0220c> a() {
                return this.docSets;
            }

            /* renamed from: b, reason: from getter */
            public final Boolean getVideoIdent() {
                return this.videoIdent;
            }

            public final List<String> c() {
                return this.videoIdentUploadTypes;
            }

            public final List<String> d() {
                return this.stepsOutsideVideoId;
            }

            public final List<String> e() {
                return this.includedCountries;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return kotlin.jvm.internal.f.b(this.docSets, eVar.docSets) && kotlin.jvm.internal.f.b(this.videoIdent, eVar.videoIdent) && kotlin.jvm.internal.f.b(this.videoIdentUploadTypes, eVar.videoIdentUploadTypes) && kotlin.jvm.internal.f.b(this.stepsOutsideVideoId, eVar.stepsOutsideVideoId) && kotlin.jvm.internal.f.b(this.includedCountries, eVar.includedCountries) && kotlin.jvm.internal.f.b(this.excludedCountries, eVar.excludedCountries);
            }

            public final List<String> f() {
                return this.excludedCountries;
            }

            public final List<C0220c> g() {
                return this.docSets;
            }

            public int hashCode() {
                List<C0220c> list = this.docSets;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Boolean bool = this.videoIdent;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                List<String> list2 = this.videoIdentUploadTypes;
                int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<String> list3 = this.stepsOutsideVideoId;
                int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<String> list4 = this.includedCountries;
                int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
                List<String> list5 = this.excludedCountries;
                return hashCode5 + (list5 != null ? list5.hashCode() : 0);
            }

            public final List<String> i() {
                return this.excludedCountries;
            }

            public final List<String> k() {
                return this.includedCountries;
            }

            public final List<String> m() {
                return this.stepsOutsideVideoId;
            }

            public final Boolean o() {
                return this.videoIdent;
            }

            public final List<String> q() {
                return this.videoIdentUploadTypes;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("RequiredIdDocs(docSets=");
                sb2.append(this.docSets);
                sb2.append(", videoIdent=");
                sb2.append(this.videoIdent);
                sb2.append(", videoIdentUploadTypes=");
                sb2.append(this.videoIdentUploadTypes);
                sb2.append(", stepsOutsideVideoId=");
                sb2.append(this.stepsOutsideVideoId);
                sb2.append(", includedCountries=");
                sb2.append(this.includedCountries);
                sb2.append(", excludedCountries=");
                return v.r(sb2, this.excludedCountries, ')');
            }

            public /* synthetic */ e(int i, List list, Boolean bool, List list2, List list3, List list4, List list5, i0 i0Var) {
                if ((i & 1) == 0) {
                    this.docSets = null;
                } else {
                    this.docSets = list;
                }
                if ((i & 2) == 0) {
                    this.videoIdent = Boolean.FALSE;
                } else {
                    this.videoIdent = bool;
                }
                if ((i & 4) == 0) {
                    this.videoIdentUploadTypes = null;
                } else {
                    this.videoIdentUploadTypes = list2;
                }
                if ((i & 8) == 0) {
                    this.stepsOutsideVideoId = null;
                } else {
                    this.stepsOutsideVideoId = list3;
                }
                if ((i & 16) == 0) {
                    this.includedCountries = null;
                } else {
                    this.includedCountries = list4;
                }
                if ((i & 32) == 0) {
                    this.excludedCountries = null;
                } else {
                    this.excludedCountries = list5;
                }
            }

            public final e a(List<C0220c> docSets, Boolean videoIdent, List<String> videoIdentUploadTypes, List<String> stepsOutsideVideoId, List<String> includedCountries, List<String> excludedCountries) {
                return new e(docSets, videoIdent, videoIdentUploadTypes, stepsOutsideVideoId, includedCountries, excludedCountries);
            }

            public static /* synthetic */ e a(e eVar, List list, Boolean bool, List list2, List list3, List list4, List list5, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = eVar.docSets;
                }
                if ((i & 2) != 0) {
                    bool = eVar.videoIdent;
                }
                Boolean bool2 = bool;
                if ((i & 4) != 0) {
                    list2 = eVar.videoIdentUploadTypes;
                }
                List list6 = list2;
                if ((i & 8) != 0) {
                    list3 = eVar.stepsOutsideVideoId;
                }
                List list7 = list3;
                if ((i & 16) != 0) {
                    list4 = eVar.includedCountries;
                }
                List list8 = list4;
                if ((i & 32) != 0) {
                    list5 = eVar.excludedCountries;
                }
                return eVar.a(list, bool2, list6, list7, list8, list5);
            }

            public static final void a(e self, InterfaceC1143c output, pa.f serialDesc) {
                if (output.D() || self.docSets != null) {
                    output.e(serialDesc, 0, new C1169d(C0220c.a.f15744a, 0), self.docSets);
                }
                if (output.D() || !kotlin.jvm.internal.f.b(self.videoIdent, Boolean.FALSE)) {
                    output.e(serialDesc, 1, C1172g.f26395a, self.videoIdent);
                }
                if (output.D() || self.videoIdentUploadTypes != null) {
                    output.e(serialDesc, 2, new C1169d(m0.f26414a, 0), self.videoIdentUploadTypes);
                }
                if (output.D() || self.stepsOutsideVideoId != null) {
                    output.e(serialDesc, 3, new C1169d(m0.f26414a, 0), self.stepsOutsideVideoId);
                }
                if (output.D() || self.includedCountries != null) {
                    output.e(serialDesc, 4, new C1169d(m0.f26414a, 0), self.includedCountries);
                }
                if (!output.D() && self.excludedCountries == null) {
                    return;
                }
                output.e(serialDesc, 5, new C1169d(m0.f26414a, 0), self.excludedCountries);
            }

            public e(List<C0220c> list, Boolean bool, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
                this.docSets = list;
                this.videoIdent = bool;
                this.videoIdentUploadTypes = list2;
                this.stepsOutsideVideoId = list3;
                this.includedCountries = list4;
                this.excludedCountries = list5;
            }

            public /* synthetic */ e(List list, Boolean bool, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5);
            }

            public static /* synthetic */ void h() {
            }

            public static /* synthetic */ void j() {
            }

            public static /* synthetic */ void l() {
            }

            public static /* synthetic */ void n() {
            }

            public static /* synthetic */ void p() {
            }

            public static /* synthetic */ void r() {
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0003\u0019')B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u009f\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0094\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0019\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J(\u0010\u0019\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÇ\u0001¢\u0006\u0004\b\u0019\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00108\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010A\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010D\u0012\u0004\bF\u0010;\u001a\u0004\bE\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010A\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010I\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010A\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010I\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010P\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010P\u0012\u0004\bT\u0010;\u001a\u0004\bS\u0010(¨\u0006V"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;", "", "", "notificationFailureCnt", "Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;", "reviewStatus", "priority", "", "createDate", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;", "result", "reviewId", "", "reprocessing", "levelName", "autoChecked", "", "elapsedSinceQueuedMs", "elapsedSincePendingMs", "<init>", "(Ljava/lang/Integer;Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lra/i0;)V", "a", "()Ljava/lang/Integer;", "d", "()Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;", "e", "f", "()Ljava/lang/String;", "g", "()Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;", "h", "i", "()Ljava/lang/Boolean;", "j", "k", "b", "()Ljava/lang/Long;", "c", "(Ljava/lang/Integer;Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;Ljava/lang/Integer;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f;Lqa/c;Lpa/f;)V", "Ljava/lang/Integer;", "v", "getNotificationFailureCnt$annotations", "()V", "Lcom/sumsub/sns/internal/core/data/model/ReviewStatusType;", "F", "getReviewStatus$annotations", "x", "getPriority$annotations", "Ljava/lang/String;", "n", "getCreateDate$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;", "B", "getResult$annotations", "D", "getReviewId$annotations", "Ljava/lang/Boolean;", "z", "getReprocessing$annotations", "t", "getLevelName$annotations", "l", "getAutoChecked$annotations", "Ljava/lang/Long;", "r", "getElapsedSinceQueuedMs$annotations", "p", "getElapsedSincePendingMs$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class f {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final Integer notificationFailureCnt;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final ReviewStatusType reviewStatus;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final Integer priority;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final String createDate;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public final C0221c result;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final String reviewId;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            public final Boolean reprocessing;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            public final String levelName;

            /* renamed from: i, reason: from kotlin metadata */
            public final Boolean autoChecked;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final Long elapsedSinceQueuedMs;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            public final Long elapsedSincePendingMs;

            public static final class a implements InterfaceC1162A<f> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15756a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15757b;

                static {
                    a aVar = new a();
                    f15756a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.Review", aVar, 11);
                    pluginGeneratedSerialDescriptor.k("notificationFailureCnt", true);
                    pluginGeneratedSerialDescriptor.k("reviewStatus", true);
                    pluginGeneratedSerialDescriptor.k("priority", true);
                    pluginGeneratedSerialDescriptor.k("createDate", true);
                    pluginGeneratedSerialDescriptor.k("reviewResult", true);
                    pluginGeneratedSerialDescriptor.k("reviewId", true);
                    pluginGeneratedSerialDescriptor.k("reprocessing", true);
                    pluginGeneratedSerialDescriptor.k("levelName", true);
                    pluginGeneratedSerialDescriptor.k("autoChecked", true);
                    pluginGeneratedSerialDescriptor.k("elapsedSinceQueuedMs", true);
                    pluginGeneratedSerialDescriptor.k("elapsedSincePendingMs", true);
                    f15757b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(InterfaceC1144d interfaceC1144d) {
                    boolean z10;
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    int i = 0;
                    boolean z11 = true;
                    while (z11) {
                        int q10 = c2.q(descriptor);
                        switch (q10) {
                            case -1:
                                z11 = false;
                                continue;
                            case 0:
                                z10 = z11;
                                obj = c2.D(descriptor, 0, H.f26353a, obj);
                                i |= 1;
                                break;
                            case 1:
                                z10 = z11;
                                obj2 = c2.D(descriptor, 1, ReviewStatusType.a.f15271a, obj2);
                                i |= 2;
                                break;
                            case 2:
                                z10 = z11;
                                obj3 = c2.D(descriptor, 2, H.f26353a, obj3);
                                i |= 4;
                                break;
                            case 3:
                                z10 = z11;
                                obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                                i |= 8;
                                break;
                            case 4:
                                z10 = z11;
                                obj5 = c2.D(descriptor, 4, C0221c.a.f15763a, obj5);
                                i |= 16;
                                break;
                            case 5:
                                z10 = z11;
                                obj6 = c2.D(descriptor, 5, m0.f26414a, obj6);
                                i |= 32;
                                break;
                            case 6:
                                z10 = z11;
                                obj7 = c2.D(descriptor, 6, C1172g.f26395a, obj7);
                                i |= 64;
                                break;
                            case 7:
                                z10 = z11;
                                obj8 = c2.D(descriptor, 7, m0.f26414a, obj8);
                                i |= 128;
                                break;
                            case 8:
                                z10 = z11;
                                obj9 = c2.D(descriptor, 8, C1172g.f26395a, obj9);
                                i |= 256;
                                break;
                            case 9:
                                z10 = z11;
                                obj10 = c2.D(descriptor, 9, O.f26364a, obj10);
                                i |= 512;
                                break;
                            case 10:
                                z10 = z11;
                                obj11 = c2.D(descriptor, 10, O.f26364a, obj11);
                                i |= 1024;
                                break;
                            default:
                                throw new UnknownFieldException(q10);
                        }
                        z11 = z10;
                    }
                    c2.b(descriptor);
                    return new f(i, (Integer) obj, (ReviewStatusType) obj2, (Integer) obj3, (String) obj4, (C0221c) obj5, (String) obj6, (Boolean) obj7, (String) obj8, (Boolean) obj9, (Long) obj10, (Long) obj11, (i0) null);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    H h9 = H.f26353a;
                    InterfaceC1078b<?> a10 = C1095a.a(h9);
                    InterfaceC1078b<?> a11 = C1095a.a(ReviewStatusType.a.f15271a);
                    InterfaceC1078b<?> a12 = C1095a.a(h9);
                    m0 m0Var = m0.f26414a;
                    InterfaceC1078b<?> a13 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a14 = C1095a.a(C0221c.a.f15763a);
                    InterfaceC1078b<?> a15 = C1095a.a(m0Var);
                    C1172g c1172g = C1172g.f26395a;
                    InterfaceC1078b<?> a16 = C1095a.a(c1172g);
                    InterfaceC1078b<?> a17 = C1095a.a(m0Var);
                    InterfaceC1078b<?> a18 = C1095a.a(c1172g);
                    O o10 = O.f26364a;
                    return new InterfaceC1078b[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, C1095a.a(o10), C1095a.a(o10)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15757b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, f fVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    f.a(fVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<f> serializer() {
                    return a.f15756a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002\u0018\u001bBI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB]\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JR\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001dR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!¨\u0006:"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;", "", "", "moderationComment", "clientComment", "Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "reviewAnswer", "", "rejectLabels", "Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;", "reviewRejectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "()Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "d", "()Ljava/util/List;", "e", "()Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;)Lcom/sumsub/sns/internal/core/data/model/remote/response/d$c$f$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "getModerationComment$annotations", "()V", "f", "getClientComment$annotations", "Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "l", "getReviewAnswer$annotations", "Ljava/util/List;", "j", "getRejectLabels$annotations", "Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;", "n", "getReviewRejectType$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$f$c, reason: collision with other inner class name */
            public static final /* data */ class C0221c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String moderationComment;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String clientComment;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final ReviewAnswerType reviewAnswer;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata */
                public final List<String> rejectLabels;

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                public final ReviewRejectType reviewRejectType;

                /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$f$c$a */
                public static final class a implements InterfaceC1162A<C0221c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15763a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15764b;

                    static {
                        a aVar = new a();
                        f15763a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.response.ListApplicantsResponse.Data.Review.Result", aVar, 5);
                        pluginGeneratedSerialDescriptor.k("moderationComment", true);
                        pluginGeneratedSerialDescriptor.k("clientComment", true);
                        pluginGeneratedSerialDescriptor.k("reviewAnswer", true);
                        pluginGeneratedSerialDescriptor.k("rejectLabels", true);
                        pluginGeneratedSerialDescriptor.k("reviewRejectType", true);
                        f15764b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C0221c deserialize(InterfaceC1144d interfaceC1144d) {
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
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else if (q10 == 1) {
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            } else if (q10 == 2) {
                                obj3 = c2.D(descriptor, 2, ReviewAnswerType.a.f15267a, obj3);
                                i |= 4;
                            } else if (q10 == 3) {
                                obj4 = c2.D(descriptor, 3, new C1169d(m0.f26414a, 0), obj4);
                                i |= 8;
                            } else {
                                if (q10 != 4) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj5 = c2.D(descriptor, 4, ReviewRejectType.a.f15269a, obj5);
                                i |= 16;
                            }
                        }
                        c2.b(descriptor);
                        return new C0221c(i, (String) obj, (String) obj2, (ReviewAnswerType) obj3, (List) obj4, (ReviewRejectType) obj5, (i0) null);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(ReviewAnswerType.a.f15267a), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(ReviewRejectType.a.f15269a)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15764b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, C0221c c0221c) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        C0221c.a(c0221c, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.remote.response.d$c$f$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<C0221c> serializer() {
                        return a.f15763a;
                    }

                    public Companion() {
                    }
                }

                public C0221c() {
                    this((String) null, (String) null, (ReviewAnswerType) null, (List) null, (ReviewRejectType) null, 31, (DefaultConstructorMarker) null);
                }

                /* renamed from: a, reason: from getter */
                public final String getModerationComment() {
                    return this.moderationComment;
                }

                /* renamed from: b, reason: from getter */
                public final String getClientComment() {
                    return this.clientComment;
                }

                /* renamed from: c, reason: from getter */
                public final ReviewAnswerType getReviewAnswer() {
                    return this.reviewAnswer;
                }

                public final List<String> d() {
                    return this.rejectLabels;
                }

                /* renamed from: e, reason: from getter */
                public final ReviewRejectType getReviewRejectType() {
                    return this.reviewRejectType;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C0221c)) {
                        return false;
                    }
                    C0221c c0221c = (C0221c) other;
                    return kotlin.jvm.internal.f.b(this.moderationComment, c0221c.moderationComment) && kotlin.jvm.internal.f.b(this.clientComment, c0221c.clientComment) && this.reviewAnswer == c0221c.reviewAnswer && kotlin.jvm.internal.f.b(this.rejectLabels, c0221c.rejectLabels) && this.reviewRejectType == c0221c.reviewRejectType;
                }

                public final String f() {
                    return this.clientComment;
                }

                public final String h() {
                    return this.moderationComment;
                }

                public int hashCode() {
                    String str = this.moderationComment;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.clientComment;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    ReviewAnswerType reviewAnswerType = this.reviewAnswer;
                    int hashCode3 = (hashCode2 + (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode())) * 31;
                    List<String> list = this.rejectLabels;
                    int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                    ReviewRejectType reviewRejectType = this.reviewRejectType;
                    return hashCode4 + (reviewRejectType != null ? reviewRejectType.hashCode() : 0);
                }

                public final List<String> j() {
                    return this.rejectLabels;
                }

                public final ReviewAnswerType l() {
                    return this.reviewAnswer;
                }

                public final ReviewRejectType n() {
                    return this.reviewRejectType;
                }

                public String toString() {
                    return "Result(moderationComment=" + this.moderationComment + ", clientComment=" + this.clientComment + ", reviewAnswer=" + this.reviewAnswer + ", rejectLabels=" + this.rejectLabels + ", reviewRejectType=" + this.reviewRejectType + ')';
                }

                public /* synthetic */ C0221c(int i, String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.moderationComment = null;
                    } else {
                        this.moderationComment = str;
                    }
                    if ((i & 2) == 0) {
                        this.clientComment = null;
                    } else {
                        this.clientComment = str2;
                    }
                    if ((i & 4) == 0) {
                        this.reviewAnswer = null;
                    } else {
                        this.reviewAnswer = reviewAnswerType;
                    }
                    if ((i & 8) == 0) {
                        this.rejectLabels = null;
                    } else {
                        this.rejectLabels = list;
                    }
                    if ((i & 16) == 0) {
                        this.reviewRejectType = null;
                    } else {
                        this.reviewRejectType = reviewRejectType;
                    }
                }

                public final C0221c a(String moderationComment, String clientComment, ReviewAnswerType reviewAnswer, List<String> rejectLabels, ReviewRejectType reviewRejectType) {
                    return new C0221c(moderationComment, clientComment, reviewAnswer, rejectLabels, reviewRejectType);
                }

                public C0221c(String str, String str2, ReviewAnswerType reviewAnswerType, List<String> list, ReviewRejectType reviewRejectType) {
                    this.moderationComment = str;
                    this.clientComment = str2;
                    this.reviewAnswer = reviewAnswerType;
                    this.rejectLabels = list;
                    this.reviewRejectType = reviewRejectType;
                }

                public static /* synthetic */ C0221c a(C0221c c0221c, String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = c0221c.moderationComment;
                    }
                    if ((i & 2) != 0) {
                        str2 = c0221c.clientComment;
                    }
                    String str3 = str2;
                    if ((i & 4) != 0) {
                        reviewAnswerType = c0221c.reviewAnswer;
                    }
                    ReviewAnswerType reviewAnswerType2 = reviewAnswerType;
                    if ((i & 8) != 0) {
                        list = c0221c.rejectLabels;
                    }
                    List list2 = list;
                    if ((i & 16) != 0) {
                        reviewRejectType = c0221c.reviewRejectType;
                    }
                    return c0221c.a(str, str3, reviewAnswerType2, list2, reviewRejectType);
                }

                public static final void a(C0221c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.moderationComment != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.moderationComment);
                    }
                    if (output.D() || self.clientComment != null) {
                        output.e(serialDesc, 1, m0.f26414a, self.clientComment);
                    }
                    if (output.D() || self.reviewAnswer != null) {
                        output.e(serialDesc, 2, ReviewAnswerType.a.f15267a, self.reviewAnswer);
                    }
                    if (output.D() || self.rejectLabels != null) {
                        output.e(serialDesc, 3, new C1169d(m0.f26414a, 0), self.rejectLabels);
                    }
                    if (!output.D() && self.reviewRejectType == null) {
                        return;
                    }
                    output.e(serialDesc, 4, ReviewRejectType.a.f15269a, self.reviewRejectType);
                }

                public /* synthetic */ C0221c(String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : reviewAnswerType, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : reviewRejectType);
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

            public f() {
                this((Integer) null, (ReviewStatusType) null, (Integer) null, (String) null, (C0221c) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (Long) null, (Long) null, 2047, (DefaultConstructorMarker) null);
            }

            /* renamed from: B, reason: from getter */
            public final C0221c getResult() {
                return this.result;
            }

            /* renamed from: D, reason: from getter */
            public final String getReviewId() {
                return this.reviewId;
            }

            /* renamed from: F, reason: from getter */
            public final ReviewStatusType getReviewStatus() {
                return this.reviewStatus;
            }

            /* renamed from: a, reason: from getter */
            public final Integer getNotificationFailureCnt() {
                return this.notificationFailureCnt;
            }

            /* renamed from: b, reason: from getter */
            public final Long getElapsedSinceQueuedMs() {
                return this.elapsedSinceQueuedMs;
            }

            /* renamed from: c, reason: from getter */
            public final Long getElapsedSincePendingMs() {
                return this.elapsedSincePendingMs;
            }

            public final ReviewStatusType d() {
                return this.reviewStatus;
            }

            /* renamed from: e, reason: from getter */
            public final Integer getPriority() {
                return this.priority;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof f)) {
                    return false;
                }
                f fVar = (f) other;
                return kotlin.jvm.internal.f.b(this.notificationFailureCnt, fVar.notificationFailureCnt) && this.reviewStatus == fVar.reviewStatus && kotlin.jvm.internal.f.b(this.priority, fVar.priority) && kotlin.jvm.internal.f.b(this.createDate, fVar.createDate) && kotlin.jvm.internal.f.b(this.result, fVar.result) && kotlin.jvm.internal.f.b(this.reviewId, fVar.reviewId) && kotlin.jvm.internal.f.b(this.reprocessing, fVar.reprocessing) && kotlin.jvm.internal.f.b(this.levelName, fVar.levelName) && kotlin.jvm.internal.f.b(this.autoChecked, fVar.autoChecked) && kotlin.jvm.internal.f.b(this.elapsedSinceQueuedMs, fVar.elapsedSinceQueuedMs) && kotlin.jvm.internal.f.b(this.elapsedSincePendingMs, fVar.elapsedSincePendingMs);
            }

            /* renamed from: f, reason: from getter */
            public final String getCreateDate() {
                return this.createDate;
            }

            public final C0221c g() {
                return this.result;
            }

            public final String h() {
                return this.reviewId;
            }

            public int hashCode() {
                Integer num = this.notificationFailureCnt;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                ReviewStatusType reviewStatusType = this.reviewStatus;
                int hashCode2 = (hashCode + (reviewStatusType == null ? 0 : reviewStatusType.hashCode())) * 31;
                Integer num2 = this.priority;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.createDate;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                C0221c c0221c = this.result;
                int hashCode5 = (hashCode4 + (c0221c == null ? 0 : c0221c.hashCode())) * 31;
                String str2 = this.reviewId;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.reprocessing;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.levelName;
                int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool2 = this.autoChecked;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Long l10 = this.elapsedSinceQueuedMs;
                int hashCode10 = (hashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
                Long l11 = this.elapsedSincePendingMs;
                return hashCode10 + (l11 != null ? l11.hashCode() : 0);
            }

            /* renamed from: i, reason: from getter */
            public final Boolean getReprocessing() {
                return this.reprocessing;
            }

            /* renamed from: j, reason: from getter */
            public final String getLevelName() {
                return this.levelName;
            }

            /* renamed from: k, reason: from getter */
            public final Boolean getAutoChecked() {
                return this.autoChecked;
            }

            public final Boolean l() {
                return this.autoChecked;
            }

            public final String n() {
                return this.createDate;
            }

            public final Long p() {
                return this.elapsedSincePendingMs;
            }

            public final Long r() {
                return this.elapsedSinceQueuedMs;
            }

            public final String t() {
                return this.levelName;
            }

            public String toString() {
                return "Review(notificationFailureCnt=" + this.notificationFailureCnt + ", reviewStatus=" + this.reviewStatus + ", priority=" + this.priority + ", createDate=" + this.createDate + ", result=" + this.result + ", reviewId=" + this.reviewId + ", reprocessing=" + this.reprocessing + ", levelName=" + this.levelName + ", autoChecked=" + this.autoChecked + ", elapsedSinceQueuedMs=" + this.elapsedSinceQueuedMs + ", elapsedSincePendingMs=" + this.elapsedSincePendingMs + ')';
            }

            public final Integer v() {
                return this.notificationFailureCnt;
            }

            public final Integer x() {
                return this.priority;
            }

            public final Boolean z() {
                return this.reprocessing;
            }

            public /* synthetic */ f(int i, Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C0221c c0221c, String str2, Boolean bool, String str3, Boolean bool2, Long l10, Long l11, i0 i0Var) {
                if ((i & 1) == 0) {
                    this.notificationFailureCnt = null;
                } else {
                    this.notificationFailureCnt = num;
                }
                if ((i & 2) == 0) {
                    this.reviewStatus = null;
                } else {
                    this.reviewStatus = reviewStatusType;
                }
                if ((i & 4) == 0) {
                    this.priority = null;
                } else {
                    this.priority = num2;
                }
                if ((i & 8) == 0) {
                    this.createDate = null;
                } else {
                    this.createDate = str;
                }
                if ((i & 16) == 0) {
                    this.result = null;
                } else {
                    this.result = c0221c;
                }
                if ((i & 32) == 0) {
                    this.reviewId = null;
                } else {
                    this.reviewId = str2;
                }
                if ((i & 64) == 0) {
                    this.reprocessing = null;
                } else {
                    this.reprocessing = bool;
                }
                if ((i & 128) == 0) {
                    this.levelName = null;
                } else {
                    this.levelName = str3;
                }
                if ((i & 256) == 0) {
                    this.autoChecked = null;
                } else {
                    this.autoChecked = bool2;
                }
                if ((i & 512) == 0) {
                    this.elapsedSinceQueuedMs = null;
                } else {
                    this.elapsedSinceQueuedMs = l10;
                }
                if ((i & 1024) == 0) {
                    this.elapsedSincePendingMs = null;
                } else {
                    this.elapsedSincePendingMs = l11;
                }
            }

            public final f a(Integer notificationFailureCnt, ReviewStatusType reviewStatus, Integer priority, String createDate, C0221c result, String reviewId, Boolean reprocessing, String levelName, Boolean autoChecked, Long elapsedSinceQueuedMs, Long elapsedSincePendingMs) {
                return new f(notificationFailureCnt, reviewStatus, priority, createDate, result, reviewId, reprocessing, levelName, autoChecked, elapsedSinceQueuedMs, elapsedSincePendingMs);
            }

            public f(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C0221c c0221c, String str2, Boolean bool, String str3, Boolean bool2, Long l10, Long l11) {
                this.notificationFailureCnt = num;
                this.reviewStatus = reviewStatusType;
                this.priority = num2;
                this.createDate = str;
                this.result = c0221c;
                this.reviewId = str2;
                this.reprocessing = bool;
                this.levelName = str3;
                this.autoChecked = bool2;
                this.elapsedSinceQueuedMs = l10;
                this.elapsedSincePendingMs = l11;
            }

            public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
                if (output.D() || self.notificationFailureCnt != null) {
                    output.e(serialDesc, 0, H.f26353a, self.notificationFailureCnt);
                }
                if (output.D() || self.reviewStatus != null) {
                    output.e(serialDesc, 1, ReviewStatusType.a.f15271a, self.reviewStatus);
                }
                if (output.D() || self.priority != null) {
                    output.e(serialDesc, 2, H.f26353a, self.priority);
                }
                if (output.D() || self.createDate != null) {
                    output.e(serialDesc, 3, m0.f26414a, self.createDate);
                }
                if (output.D() || self.result != null) {
                    output.e(serialDesc, 4, C0221c.a.f15763a, self.result);
                }
                if (output.D() || self.reviewId != null) {
                    output.e(serialDesc, 5, m0.f26414a, self.reviewId);
                }
                if (output.D() || self.reprocessing != null) {
                    output.e(serialDesc, 6, C1172g.f26395a, self.reprocessing);
                }
                if (output.D() || self.levelName != null) {
                    output.e(serialDesc, 7, m0.f26414a, self.levelName);
                }
                if (output.D() || self.autoChecked != null) {
                    output.e(serialDesc, 8, C1172g.f26395a, self.autoChecked);
                }
                if (output.D() || self.elapsedSinceQueuedMs != null) {
                    output.e(serialDesc, 9, O.f26364a, self.elapsedSinceQueuedMs);
                }
                if (!output.D() && self.elapsedSincePendingMs == null) {
                    return;
                }
                output.e(serialDesc, 10, O.f26364a, self.elapsedSincePendingMs);
            }

            public /* synthetic */ f(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C0221c c0221c, String str2, Boolean bool, String str3, Boolean bool2, Long l10, Long l11, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : reviewStatusType, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : c0221c, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : l10, (i & 1024) == 0 ? l11 : null);
            }

            public static /* synthetic */ void A() {
            }

            public static /* synthetic */ void C() {
            }

            public static /* synthetic */ void E() {
            }

            public static /* synthetic */ void G() {
            }

            public static /* synthetic */ void m() {
            }

            public static /* synthetic */ void o() {
            }

            public static /* synthetic */ void q() {
            }

            public static /* synthetic */ void s() {
            }

            public static /* synthetic */ void u() {
            }

            public static /* synthetic */ void w() {
            }

            public static /* synthetic */ void y() {
            }
        }

        public c() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public final List<C0219d> a() {
            return this.items;
        }

        public final List<C0219d> b() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && kotlin.jvm.internal.f.b(this.items, ((c) other).items);
        }

        public int hashCode() {
            List<C0219d> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return v.r(new StringBuilder("Data(items="), this.items, ')');
        }

        public /* synthetic */ c(int i, List list, i0 i0Var) {
            if ((i & 1) == 0) {
                this.items = null;
            } else {
                this.items = list;
            }
        }

        public final c a(List<C0219d> items) {
            return new c(items);
        }

        public c(List<C0219d> list) {
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.items;
            }
            return cVar.a(list);
        }

        public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
            if (!output.D() && self.items == null) {
                return;
            }
            output.e(serialDesc, 0, new C1169d(C0219d.a.f15726a, 0), self.items);
        }

        public /* synthetic */ c(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }

        public static /* synthetic */ void c() {
        }
    }

    public d() {
        this((c) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final c getData() {
        return this.data;
    }

    public final c b() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && kotlin.jvm.internal.f.b(this.data, ((d) other).data);
    }

    public int hashCode() {
        c cVar = this.data;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public String toString() {
        return "ListApplicantsResponse(data=" + this.data + ')';
    }

    public /* synthetic */ d(int i, c cVar, i0 i0Var) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = cVar;
        }
    }

    public final d a(c data) {
        return new d(data);
    }

    public d(c cVar) {
        this.data = cVar;
    }

    public static /* synthetic */ d a(d dVar, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = dVar.data;
        }
        return dVar.a(cVar);
    }

    public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
        if (!output.D() && self.data == null) {
            return;
        }
        output.e(serialDesc, 0, c.a.f15689a, self.data);
    }

    public /* synthetic */ d(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar);
    }

    public static /* synthetic */ void c() {
    }
}
