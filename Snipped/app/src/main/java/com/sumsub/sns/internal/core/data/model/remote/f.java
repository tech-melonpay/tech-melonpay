package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import java.util.List;
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
import ra.C1172g;
import ra.H;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0004\u001a\u001d\u001e B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBo\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00104\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010.\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010\u001cR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010.\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010;\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010#R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010>\u0012\u0004\b@\u00101\u001a\u0004\b?\u0010%¨\u0006B"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/f;", "", "", "id", "applicantId", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "type", "createdAt", "externalActionId", "Lcom/sumsub/sns/internal/core/data/model/remote/f$c;", "requiredIdDocs", "Lcom/sumsub/sns/internal/core/data/model/remote/f$d;", "review", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/f$c;Lcom/sumsub/sns/internal/core/data/model/remote/f$d;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/f$c;Lcom/sumsub/sns/internal/core/data/model/remote/f$d;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/f;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "()Lcom/sumsub/sns/core/data/model/FlowActionType;", "d", "e", "f", "()Lcom/sumsub/sns/internal/core/data/model/remote/f$c;", "g", "()Lcom/sumsub/sns/internal/core/data/model/remote/f$d;", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/remote/f$c;Lcom/sumsub/sns/internal/core/data/model/remote/f$d;)Lcom/sumsub/sns/internal/core/data/model/remote/f;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "n", "getId$annotations", "()V", "h", "getApplicantId$annotations", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "t", "getType$annotations", "j", "getCreatedAt$annotations", "l", "getExternalActionId$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/f$c;", "p", "getRequiredIdDocs$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/f$d;", "r", "getReview$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final FlowActionType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String createdAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String externalActionId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final c requiredIdDocs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final d review;

    public static final class a implements InterfaceC1162A<f> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15600a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15601b;

        static {
            a aVar = new a();
            f15600a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteAction", aVar, 7);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("applicantId", false);
            pluginGeneratedSerialDescriptor.k("type", false);
            pluginGeneratedSerialDescriptor.k("createdAt", false);
            pluginGeneratedSerialDescriptor.k("externalActionId", false);
            pluginGeneratedSerialDescriptor.k("requiredIdDocs", false);
            pluginGeneratedSerialDescriptor.k("review", false);
            f15601b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str = c2.y(descriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        str2 = c2.y(descriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        obj = c2.C(descriptor, 2, com.sumsub.sns.internal.core.data.serializer.b.f15824a, obj);
                        i |= 4;
                        break;
                    case 3:
                        str3 = c2.y(descriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = c2.y(descriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        obj2 = c2.C(descriptor, 5, c.a.f15603a, obj2);
                        i |= 32;
                        break;
                    case 6:
                        obj3 = c2.C(descriptor, 6, d.a.f15614a, obj3);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new f(i, str, str2, (FlowActionType) obj, str3, str4, (c) obj2, (d) obj3, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{m0Var, m0Var, com.sumsub.sns.internal.core.data.serializer.b.f15824a, m0Var, m0Var, c.a.f15603a, d.a.f15614a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15601b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<f> serializer() {
            return a.f15600a;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u0012 $B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0014¨\u0006%"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/f$c;", "", "", "Lcom/sumsub/sns/internal/core/data/model/remote/f$c$c;", "docSets", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/f$c;Lqa/c;Lpa/f;)V", "()Ljava/util/List;", "(Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/f$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "getDocSets$annotations", "()V", "Companion", "c", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final List<C0215c> docSets;

        public static final class a implements InterfaceC1162A<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15603a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15604b;

            static {
                a aVar = new a();
                f15603a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteAction.RequiredIdDocs", aVar, 1);
                pluginGeneratedSerialDescriptor.k("docSets", false);
                f15604b = pluginGeneratedSerialDescriptor;
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
                        obj = c2.C(descriptor, 0, new C1169d(C0215c.a.f15607a, 0), obj);
                        i = 1;
                    }
                }
                c2.b(descriptor);
                return new c(i, (List) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{new C1169d(C0215c.a.f15607a, 0)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15604b;
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

        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<c> serializer() {
                return a.f15603a;
            }

            public Companion() {
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0013\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006("}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/f$c$c;", "", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "idDocSetType", "", "questionnaireDefId", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/DocumentType;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/DocumentType;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/f$c$c;Lqa/c;Lpa/f;)V", "()Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "b", "()Ljava/lang/String;", "(Lcom/sumsub/sns/internal/core/data/model/DocumentType;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/f$c$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "c", "getIdDocSetType$annotations", "()V", "Ljava/lang/String;", "e", "getQuestionnaireDefId$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0215c {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final DocumentType idDocSetType;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final String questionnaireDefId;

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$c$c$a */
            public static final class a implements InterfaceC1162A<C0215c> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15607a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15608b;

                static {
                    a aVar = new a();
                    f15607a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteAction.RequiredIdDocs.DocSetsItem", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("idDocSetType", false);
                    pluginGeneratedSerialDescriptor.k("questionnaireDefId", true);
                    f15608b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0215c deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, DocumentType.Companion.C0199a.f15257a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new C0215c(i, (DocumentType) obj, (String) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{DocumentType.Companion.C0199a.f15257a, C1095a.a(m0.f26414a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15608b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, C0215c c0215c) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    C0215c.a(c0215c, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<C0215c> serializer() {
                    return a.f15607a;
                }

                public Companion() {
                }
            }

            public /* synthetic */ C0215c(int i, DocumentType documentType, String str, i0 i0Var) {
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15607a.getDescriptor());
                    throw null;
                }
                this.idDocSetType = documentType;
                if ((i & 2) == 0) {
                    this.questionnaireDefId = null;
                } else {
                    this.questionnaireDefId = str;
                }
            }

            /* renamed from: a, reason: from getter */
            public final DocumentType getIdDocSetType() {
                return this.idDocSetType;
            }

            /* renamed from: b, reason: from getter */
            public final String getQuestionnaireDefId() {
                return this.questionnaireDefId;
            }

            public final DocumentType c() {
                return this.idDocSetType;
            }

            public final String e() {
                return this.questionnaireDefId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0215c)) {
                    return false;
                }
                C0215c c0215c = (C0215c) other;
                return kotlin.jvm.internal.f.b(this.idDocSetType, c0215c.idDocSetType) && kotlin.jvm.internal.f.b(this.questionnaireDefId, c0215c.questionnaireDefId);
            }

            public int hashCode() {
                int hashCode = this.idDocSetType.hashCode() * 31;
                String str = this.questionnaireDefId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("DocSetsItem(idDocSetType=");
                sb2.append(this.idDocSetType);
                sb2.append(", questionnaireDefId=");
                return v.q(sb2, this.questionnaireDefId, ')');
            }

            public C0215c(DocumentType documentType, String str) {
                this.idDocSetType = documentType;
                this.questionnaireDefId = str;
            }

            public final C0215c a(DocumentType idDocSetType, String questionnaireDefId) {
                return new C0215c(idDocSetType, questionnaireDefId);
            }

            public static /* synthetic */ C0215c a(C0215c c0215c, DocumentType documentType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    documentType = c0215c.idDocSetType;
                }
                if ((i & 2) != 0) {
                    str = c0215c.questionnaireDefId;
                }
                return c0215c.a(documentType, str);
            }

            public static final void a(C0215c self, InterfaceC1143c output, pa.f serialDesc) {
                output.C(serialDesc, 0, DocumentType.Companion.C0199a.f15257a, self.idDocSetType);
                if (!output.D() && self.questionnaireDefId == null) {
                    return;
                }
                output.e(serialDesc, 1, m0.f26414a, self.questionnaireDefId);
            }

            public /* synthetic */ C0215c(DocumentType documentType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(documentType, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ void d() {
            }

            public static /* synthetic */ void f() {
            }
        }

        public /* synthetic */ c(int i, List list, i0 i0Var) {
            if (1 == (i & 1)) {
                this.docSets = list;
            } else {
                a0.h(i, 1, a.f15603a.getDescriptor());
                throw null;
            }
        }

        public final List<C0215c> a() {
            return this.docSets;
        }

        public final List<C0215c> b() {
            return this.docSets;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && kotlin.jvm.internal.f.b(this.docSets, ((c) other).docSets);
        }

        public int hashCode() {
            return this.docSets.hashCode();
        }

        public String toString() {
            return v.r(new StringBuilder("RequiredIdDocs(docSets="), this.docSets, ')');
        }

        public c(List<C0215c> list) {
            this.docSets = list;
        }

        public final c a(List<C0215c> docSets) {
            return new c(docSets);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.docSets;
            }
            return cVar.a(list);
        }

        public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
            output.C(serialDesc, 0, new C1169d(C0215c.a.f15607a, 0), self.docSets);
        }

        public static /* synthetic */ void c() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002\u0016\u0019BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010&\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010-\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001c¨\u00065"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/f$d;", "", "", "reprocessing", "", "notificationFailureCnt", "", "reviewStatus", "autoChecked", "createDate", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/f$d;Lqa/c;Lpa/f;)V", "()Ljava/lang/Boolean;", "b", "()Ljava/lang/Integer;", "c", "()Ljava/lang/String;", "d", "e", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/f$d;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "l", "getReprocessing$annotations", "()V", "Ljava/lang/Integer;", "j", "getNotificationFailureCnt$annotations", "Ljava/lang/String;", "n", "getReviewStatus$annotations", "f", "getAutoChecked$annotations", "h", "getCreateDate$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Boolean reprocessing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Integer notificationFailureCnt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String reviewStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final Boolean autoChecked;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String createDate;

        public static final class a implements InterfaceC1162A<d> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15614a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15615b;

            static {
                a aVar = new a();
                f15614a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteAction.Review", aVar, 5);
                pluginGeneratedSerialDescriptor.k("reprocessing", true);
                pluginGeneratedSerialDescriptor.k("notificationFailureCnt", true);
                pluginGeneratedSerialDescriptor.k("reviewStatus", true);
                pluginGeneratedSerialDescriptor.k("autoChecked", true);
                pluginGeneratedSerialDescriptor.k("createDate", true);
                f15615b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj = c2.D(descriptor, 0, C1172g.f26395a, obj);
                        i |= 1;
                    } else if (q10 == 1) {
                        obj2 = c2.D(descriptor, 1, H.f26353a, obj2);
                        i |= 2;
                    } else if (q10 == 2) {
                        obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                        i |= 4;
                    } else if (q10 == 3) {
                        obj4 = c2.D(descriptor, 3, C1172g.f26395a, obj4);
                        i |= 8;
                    } else {
                        if (q10 != 4) {
                            throw new UnknownFieldException(q10);
                        }
                        obj5 = c2.D(descriptor, 4, m0.f26414a, obj5);
                        i |= 16;
                    }
                }
                c2.b(descriptor);
                return new d(i, (Boolean) obj, (Integer) obj2, (String) obj3, (Boolean) obj4, (String) obj5, (i0) null);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                C1172g c1172g = C1172g.f26395a;
                InterfaceC1078b<?> a10 = C1095a.a(c1172g);
                InterfaceC1078b<?> a11 = C1095a.a(H.f26353a);
                m0 m0Var = m0.f26414a;
                return new InterfaceC1078b[]{a10, a11, C1095a.a(m0Var), C1095a.a(c1172g), C1095a.a(m0Var)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15615b;
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

        /* renamed from: com.sumsub.sns.internal.core.data.model.remote.f$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<d> serializer() {
                return a.f15614a;
            }

            public Companion() {
            }
        }

        public d() {
            this((Boolean) null, (Integer) null, (String) null, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* renamed from: a, reason: from getter */
        public final Boolean getReprocessing() {
            return this.reprocessing;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getNotificationFailureCnt() {
            return this.notificationFailureCnt;
        }

        /* renamed from: c, reason: from getter */
        public final String getReviewStatus() {
            return this.reviewStatus;
        }

        /* renamed from: d, reason: from getter */
        public final Boolean getAutoChecked() {
            return this.autoChecked;
        }

        /* renamed from: e, reason: from getter */
        public final String getCreateDate() {
            return this.createDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return kotlin.jvm.internal.f.b(this.reprocessing, dVar.reprocessing) && kotlin.jvm.internal.f.b(this.notificationFailureCnt, dVar.notificationFailureCnt) && kotlin.jvm.internal.f.b(this.reviewStatus, dVar.reviewStatus) && kotlin.jvm.internal.f.b(this.autoChecked, dVar.autoChecked) && kotlin.jvm.internal.f.b(this.createDate, dVar.createDate);
        }

        public final Boolean f() {
            return this.autoChecked;
        }

        public final String h() {
            return this.createDate;
        }

        public int hashCode() {
            Boolean bool = this.reprocessing;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.notificationFailureCnt;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.reviewStatus;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.autoChecked;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.createDate;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final Integer j() {
            return this.notificationFailureCnt;
        }

        public final Boolean l() {
            return this.reprocessing;
        }

        public final String n() {
            return this.reviewStatus;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Review(reprocessing=");
            sb2.append(this.reprocessing);
            sb2.append(", notificationFailureCnt=");
            sb2.append(this.notificationFailureCnt);
            sb2.append(", reviewStatus=");
            sb2.append(this.reviewStatus);
            sb2.append(", autoChecked=");
            sb2.append(this.autoChecked);
            sb2.append(", createDate=");
            return v.q(sb2, this.createDate, ')');
        }

        public /* synthetic */ d(int i, Boolean bool, Integer num, String str, Boolean bool2, String str2, i0 i0Var) {
            if ((i & 1) == 0) {
                this.reprocessing = null;
            } else {
                this.reprocessing = bool;
            }
            if ((i & 2) == 0) {
                this.notificationFailureCnt = null;
            } else {
                this.notificationFailureCnt = num;
            }
            if ((i & 4) == 0) {
                this.reviewStatus = null;
            } else {
                this.reviewStatus = str;
            }
            if ((i & 8) == 0) {
                this.autoChecked = null;
            } else {
                this.autoChecked = bool2;
            }
            if ((i & 16) == 0) {
                this.createDate = null;
            } else {
                this.createDate = str2;
            }
        }

        public final d a(Boolean reprocessing, Integer notificationFailureCnt, String reviewStatus, Boolean autoChecked, String createDate) {
            return new d(reprocessing, notificationFailureCnt, reviewStatus, autoChecked, createDate);
        }

        public d(Boolean bool, Integer num, String str, Boolean bool2, String str2) {
            this.reprocessing = bool;
            this.notificationFailureCnt = num;
            this.reviewStatus = str;
            this.autoChecked = bool2;
            this.createDate = str2;
        }

        public static /* synthetic */ d a(d dVar, Boolean bool, Integer num, String str, Boolean bool2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = dVar.reprocessing;
            }
            if ((i & 2) != 0) {
                num = dVar.notificationFailureCnt;
            }
            Integer num2 = num;
            if ((i & 4) != 0) {
                str = dVar.reviewStatus;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                bool2 = dVar.autoChecked;
            }
            Boolean bool3 = bool2;
            if ((i & 16) != 0) {
                str2 = dVar.createDate;
            }
            return dVar.a(bool, num2, str3, bool3, str2);
        }

        public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
            if (output.D() || self.reprocessing != null) {
                output.e(serialDesc, 0, C1172g.f26395a, self.reprocessing);
            }
            if (output.D() || self.notificationFailureCnt != null) {
                output.e(serialDesc, 1, H.f26353a, self.notificationFailureCnt);
            }
            if (output.D() || self.reviewStatus != null) {
                output.e(serialDesc, 2, m0.f26414a, self.reviewStatus);
            }
            if (output.D() || self.autoChecked != null) {
                output.e(serialDesc, 3, C1172g.f26395a, self.autoChecked);
            }
            if (!output.D() && self.createDate == null) {
                return;
            }
            output.e(serialDesc, 4, m0.f26414a, self.createDate);
        }

        public /* synthetic */ d(Boolean bool, Integer num, String str, Boolean bool2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str2);
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

    public /* synthetic */ f(int i, String str, String str2, FlowActionType flowActionType, String str3, String str4, c cVar, d dVar, i0 i0Var) {
        if (127 != (i & 127)) {
            a0.h(i, 127, a.f15600a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.applicantId = str2;
        this.type = flowActionType;
        this.createdAt = str3;
        this.externalActionId = str4;
        this.requiredIdDocs = cVar;
        this.review = dVar;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    /* renamed from: c, reason: from getter */
    public final FlowActionType getType() {
        return this.type;
    }

    /* renamed from: d, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: e, reason: from getter */
    public final String getExternalActionId() {
        return this.externalActionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return kotlin.jvm.internal.f.b(this.id, fVar.id) && kotlin.jvm.internal.f.b(this.applicantId, fVar.applicantId) && kotlin.jvm.internal.f.b(this.type, fVar.type) && kotlin.jvm.internal.f.b(this.createdAt, fVar.createdAt) && kotlin.jvm.internal.f.b(this.externalActionId, fVar.externalActionId) && kotlin.jvm.internal.f.b(this.requiredIdDocs, fVar.requiredIdDocs) && kotlin.jvm.internal.f.b(this.review, fVar.review);
    }

    /* renamed from: f, reason: from getter */
    public final c getRequiredIdDocs() {
        return this.requiredIdDocs;
    }

    /* renamed from: g, reason: from getter */
    public final d getReview() {
        return this.review;
    }

    public final String h() {
        return this.applicantId;
    }

    public int hashCode() {
        return this.review.hashCode() + ((this.requiredIdDocs.hashCode() + v.c(v.c((this.type.hashCode() + v.c(this.id.hashCode() * 31, 31, this.applicantId)) * 31, 31, this.createdAt), 31, this.externalActionId)) * 31);
    }

    public final String j() {
        return this.createdAt;
    }

    public final String l() {
        return this.externalActionId;
    }

    public final String n() {
        return this.id;
    }

    public final c p() {
        return this.requiredIdDocs;
    }

    public final d r() {
        return this.review;
    }

    public final FlowActionType t() {
        return this.type;
    }

    public String toString() {
        return "RemoteAction(id=" + this.id + ", applicantId=" + this.applicantId + ", type=" + this.type + ", createdAt=" + this.createdAt + ", externalActionId=" + this.externalActionId + ", requiredIdDocs=" + this.requiredIdDocs + ", review=" + this.review + ')';
    }

    public f(String str, String str2, FlowActionType flowActionType, String str3, String str4, c cVar, d dVar) {
        this.id = str;
        this.applicantId = str2;
        this.type = flowActionType;
        this.createdAt = str3;
        this.externalActionId = str4;
        this.requiredIdDocs = cVar;
        this.review = dVar;
    }

    public final f a(String id, String applicantId, FlowActionType type, String createdAt, String externalActionId, c requiredIdDocs, d review) {
        return new f(id, applicantId, type, createdAt, externalActionId, requiredIdDocs, review);
    }

    public static /* synthetic */ f a(f fVar, String str, String str2, FlowActionType flowActionType, String str3, String str4, c cVar, d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.id;
        }
        if ((i & 2) != 0) {
            str2 = fVar.applicantId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            flowActionType = fVar.type;
        }
        FlowActionType flowActionType2 = flowActionType;
        if ((i & 8) != 0) {
            str3 = fVar.createdAt;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = fVar.externalActionId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            cVar = fVar.requiredIdDocs;
        }
        c cVar2 = cVar;
        if ((i & 64) != 0) {
            dVar = fVar.review;
        }
        return fVar.a(str, str5, flowActionType2, str6, str7, cVar2, dVar);
    }

    public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.id);
        output.x(serialDesc, 1, self.applicantId);
        output.C(serialDesc, 2, com.sumsub.sns.internal.core.data.serializer.b.f15824a, self.type);
        output.x(serialDesc, 3, self.createdAt);
        output.x(serialDesc, 4, self.externalActionId);
        output.C(serialDesc, 5, c.a.f15603a, self.requiredIdDocs);
        output.C(serialDesc, 6, d.a.f15614a, self.review);
    }

    public static /* synthetic */ void i() {
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
}
