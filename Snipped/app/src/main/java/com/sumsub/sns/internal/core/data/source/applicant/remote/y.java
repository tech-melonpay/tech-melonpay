package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.u;
import java.util.ArrayList;
import java.util.Iterator;
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
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0015\u0018B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010(R(\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0017R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u0019¨\u00061"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;", "Landroid/os/Parcelable;", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/SNSEntityId;", "entityId", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;", "questionnaires", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/y;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getEntityId$annotations", "()V", "Ljava/util/List;", "e", "getQuestionnaires$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class y implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String entityId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<u> questionnaires;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<y> CREATOR = new c();

    public static final class a implements InterfaceC1162A<y> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16091a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16092b;

        static {
            a aVar = new a();
            f16091a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.QuestionnaireSubmitModel", aVar, 2);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("questionnaires", true);
            f16092b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.D(descriptor, 1, new C1169d(u.a.f16065a, 0), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new y(i, (String) obj, (List) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(m0.f26414a), C1095a.a(new C1169d(u.a.f16065a, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16092b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<y> serializer() {
            return a.f16091a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(u.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new y(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y[] newArray(int i) {
            return new y[i];
        }
    }

    public y() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    public final List<u> b() {
        return this.questionnaires;
    }

    public final String c() {
        return this.entityId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<u> e() {
        return this.questionnaires;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return kotlin.jvm.internal.f.b(this.entityId, yVar.entityId) && kotlin.jvm.internal.f.b(this.questionnaires, yVar.questionnaires);
    }

    public int hashCode() {
        String str = this.entityId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<u> list = this.questionnaires;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionnaireSubmitModel(entityId=");
        sb2.append(this.entityId);
        sb2.append(", questionnaires=");
        return C.v.r(sb2, this.questionnaires, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.entityId);
        List<u> list = this.questionnaires;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ y(int i, String str, List list, ra.i0 i0Var) {
        this.entityId = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.questionnaires = new ArrayList();
        } else {
            this.questionnaires = list;
        }
    }

    public final y a(String entityId, List<u> questionnaires) {
        return new y(entityId, questionnaires);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y a(y yVar, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yVar.entityId;
        }
        if ((i & 2) != 0) {
            list = yVar.questionnaires;
        }
        return yVar.a(str, list);
    }

    public static final void a(y self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.entityId != null) {
            output.e(serialDesc, 0, m0.f26414a, self.entityId);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.questionnaires, new ArrayList())) {
            return;
        }
        output.e(serialDesc, 1, new C1169d(u.a.f16065a, 0), self.questionnaires);
    }

    public y(String str, List<u> list) {
        this.entityId = str;
        this.questionnaires = list;
    }

    public /* synthetic */ y(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
