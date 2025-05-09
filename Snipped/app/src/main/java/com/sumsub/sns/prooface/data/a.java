package com.sumsub.sns.prooface.data;

import C.v;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.prooface.data.b;
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
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u0015&B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010$\u0012\u0004\b(\u0010)\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R0\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010\u001a\"\u0004\b\u0015\u0010,R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010$\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0018\"\u0004\b\u0015\u0010'R\u0011\u00102\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/sumsub/sns/prooface/data/a;", "", "", "status", "", "Lcom/sumsub/sns/prooface/data/b;", "values", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/prooface/data/a;Lqa/c;Lpa/f;)V", "c", "()Ljava/lang/String;", "d", "()Ljava/util/List;", "e", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/sumsub/sns/prooface/data/a;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "(Ljava/lang/String;)V", "getStatus$annotations", "()V", "Ljava/util/List;", "j", "(Ljava/util/List;)V", "getValues$annotations", "f", "getError$annotations", "l", "()Z", "isComplete", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final a f20187d = new a("skipped", (List) null, (String) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: e, reason: collision with root package name */
    public static final a f20188e = new a("fail", (List) null, "Zero calibration range", 2, (DefaultConstructorMarker) null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public List<b> values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String error;

    /* renamed from: com.sumsub.sns.prooface.data.a$a, reason: collision with other inner class name */
    public static final class C0387a implements InterfaceC1162A<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0387a f20192a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f20193b;

        static {
            C0387a c0387a = new C0387a();
            f20192a = c0387a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.prooface.data.Calibration", c0387a, 3);
            pluginGeneratedSerialDescriptor.k("status", true);
            pluginGeneratedSerialDescriptor.k("values", true);
            pluginGeneratedSerialDescriptor.k(Constants.IPC_BUNDLE_KEY_SEND_ERROR, true);
            f20193b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, new C1169d(b.a.f20197a, 0), obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new a(i, (String) obj, (List) obj2, (String) obj3, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(new C1169d(b.a.f20197a, 0)), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f20193b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a.a(aVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.prooface.data.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f20187d;
        }

        public final a b() {
            return a.f20188e;
        }

        public final InterfaceC1078b<a> serializer() {
            return C0387a.f20192a;
        }

        public Companion() {
        }
    }

    public a() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public final a a(String status, List<b> values, String error) {
        return new a(status, values, error);
    }

    /* renamed from: c, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<b> d() {
        return this.values;
    }

    /* renamed from: e, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return kotlin.jvm.internal.f.b(this.status, aVar.status) && kotlin.jvm.internal.f.b(this.values, aVar.values) && kotlin.jvm.internal.f.b(this.error, aVar.error);
    }

    public final String f() {
        return this.error;
    }

    public final String h() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<b> list = this.values;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.error;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final List<b> j() {
        return this.values;
    }

    public final boolean l() {
        return this.status != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Calibration(status=");
        sb2.append(this.status);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", error=");
        return v.q(sb2, this.error, ')');
    }

    public /* synthetic */ a(int i, String str, List list, String str2, i0 i0Var) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a a(a aVar, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.status;
        }
        if ((i & 2) != 0) {
            list = aVar.values;
        }
        if ((i & 4) != 0) {
            str2 = aVar.error;
        }
        return aVar.a(str, (List<b>) list, str2);
    }

    public final void b(String str) {
        this.status = str;
    }

    public a(String str, List<b> list, String str2) {
        this.status = str;
        this.values = list;
        this.error = str2;
    }

    public static final void a(a self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.status != null) {
            output.e(serialDesc, 0, m0.f26414a, self.status);
        }
        if (output.D() || self.values != null) {
            output.e(serialDesc, 1, new C1169d(b.a.f20197a, 0), self.values);
        }
        if (!output.D() && self.error == null) {
            return;
        }
        output.e(serialDesc, 2, m0.f26414a, self.error);
    }

    public final void a(List<b> list) {
        this.values = list;
    }

    public final void a(String str) {
        this.error = str;
    }

    public /* synthetic */ a(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }
}
