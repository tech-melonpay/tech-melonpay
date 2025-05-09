package com.sumsub.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sentry.SentryItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.H;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 42\u00020\u0001:\u0002\u0016\u0019B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0017\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u0018R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00101\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010\u001e¨\u00065"}, d2 = {"Lcom/sumsub/sentry/y;", "", "", CMSAttributeTableGenerator.CONTENT_TYPE, "fileName", "Lcom/sumsub/sentry/SentryItemType;", "type", "attachmentType", "", "length", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/SentryItemType;Ljava/lang/String;I)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/SentryItemType;Ljava/lang/String;ILra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/y;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "()Lcom/sumsub/sentry/SentryItemType;", "d", "e", "()I", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sentry/SentryItemType;Ljava/lang/String;I)Lcom/sumsub/sentry/y;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "getContentType$annotations", "()V", "j", "getFileName$annotations", "Lcom/sumsub/sentry/SentryItemType;", "n", "getType$annotations", "f", "getAttachmentType$annotations", "I", "l", "getLength$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class y {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String contentType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String fileName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final SentryItemType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String attachmentType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int length;

    public static final class a implements InterfaceC1162A<y> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13813a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13814b;

        static {
            a aVar = new a();
            f13813a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryEnvelopeItemHeader", aVar, 5);
            pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.CONTENT_TYPE, true);
            pluginGeneratedSerialDescriptor.k("filename", true);
            pluginGeneratedSerialDescriptor.k("type", false);
            pluginGeneratedSerialDescriptor.k("attachment_type", true);
            pluginGeneratedSerialDescriptor.k("length", false);
            f13814b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            int i9 = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, ra.m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, ra.m0.f26414a, obj2);
                    i |= 2;
                } else if (q10 == 2) {
                    obj3 = c2.C(descriptor, 2, SentryItemType.a.f13534a, obj3);
                    i |= 4;
                } else if (q10 == 3) {
                    obj4 = c2.D(descriptor, 3, ra.m0.f26414a, obj4);
                    i |= 8;
                } else {
                    if (q10 != 4) {
                        throw new UnknownFieldException(q10);
                    }
                    i9 = c2.d(descriptor, 4);
                    i |= 16;
                }
            }
            c2.b(descriptor);
            return new y(i, (String) obj, (String) obj2, (SentryItemType) obj3, (String) obj4, i9, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), SentryItemType.a.f13534a, C1095a.a(m0Var), H.f26353a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13814b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, y yVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            y.a(yVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<y> serializer() {
            return a.f13813a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ y(int i, String str, String str2, SentryItemType sentryItemType, String str3, int i9, ra.i0 i0Var) {
        if (20 != (i & 20)) {
            ra.a0.h(i, 20, a.f13813a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.contentType = null;
        } else {
            this.contentType = str;
        }
        if ((i & 2) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str2;
        }
        this.type = sentryItemType;
        if ((i & 8) == 0) {
            this.attachmentType = null;
        } else {
            this.attachmentType = str3;
        }
        this.length = i9;
    }

    /* renamed from: a, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: c, reason: from getter */
    public final SentryItemType getType() {
        return this.type;
    }

    /* renamed from: d, reason: from getter */
    public final String getAttachmentType() {
        return this.attachmentType;
    }

    /* renamed from: e, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return kotlin.jvm.internal.f.b(this.contentType, yVar.contentType) && kotlin.jvm.internal.f.b(this.fileName, yVar.fileName) && this.type == yVar.type && kotlin.jvm.internal.f.b(this.attachmentType, yVar.attachmentType) && this.length == yVar.length;
    }

    public final String f() {
        return this.attachmentType;
    }

    public final String h() {
        return this.contentType;
    }

    public int hashCode() {
        String str = this.contentType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode2 = (this.type.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.attachmentType;
        return Integer.hashCode(this.length) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String j() {
        return this.fileName;
    }

    public final int l() {
        return this.length;
    }

    public final SentryItemType n() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentryEnvelopeItemHeader(contentType=");
        sb2.append(this.contentType);
        sb2.append(", fileName=");
        sb2.append(this.fileName);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", attachmentType=");
        sb2.append(this.attachmentType);
        sb2.append(", length=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.length, ')');
    }

    public y(String str, String str2, SentryItemType sentryItemType, String str3, int i) {
        this.contentType = str;
        this.fileName = str2;
        this.type = sentryItemType;
        this.attachmentType = str3;
        this.length = i;
    }

    public final y a(String contentType, String fileName, SentryItemType type, String attachmentType, int length) {
        return new y(contentType, fileName, type, attachmentType, length);
    }

    public static /* synthetic */ y a(y yVar, String str, String str2, SentryItemType sentryItemType, String str3, int i, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = yVar.contentType;
        }
        if ((i9 & 2) != 0) {
            str2 = yVar.fileName;
        }
        String str4 = str2;
        if ((i9 & 4) != 0) {
            sentryItemType = yVar.type;
        }
        SentryItemType sentryItemType2 = sentryItemType;
        if ((i9 & 8) != 0) {
            str3 = yVar.attachmentType;
        }
        String str5 = str3;
        if ((i9 & 16) != 0) {
            i = yVar.length;
        }
        return yVar.a(str, str4, sentryItemType2, str5, i);
    }

    public static final void a(y self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.contentType != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.contentType);
        }
        if (output.D() || self.fileName != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.fileName);
        }
        output.C(serialDesc, 2, SentryItemType.a.f13534a, self.type);
        if (output.D() || self.attachmentType != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.attachmentType);
        }
        output.m(4, self.length, serialDesc);
    }

    public /* synthetic */ y(String str, String str2, SentryItemType sentryItemType, String str3, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, sentryItemType, (i9 & 8) != 0 ? null : str3, i);
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
