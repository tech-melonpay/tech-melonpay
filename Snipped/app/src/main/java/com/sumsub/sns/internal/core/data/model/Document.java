package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000bR\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0011\u0010*\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010-\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b.\u0010+¨\u00060"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/Document;", "Landroid/os/Parcelable;", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "type", "Lcom/sumsub/sns/internal/core/data/model/Document$b;", "result", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/DocumentType;Lcom/sumsub/sns/internal/core/data/model/Document$b;)V", "component1", "()Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "component2", "()Lcom/sumsub/sns/internal/core/data/model/Document$b;", "copy", "(Lcom/sumsub/sns/internal/core/data/model/DocumentType;Lcom/sumsub/sns/internal/core/data/model/Document$b;)Lcom/sumsub/sns/internal/core/data/model/Document;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "getType", "Lcom/sumsub/sns/internal/core/data/model/Document$b;", "getResult", "Lcom/sumsub/sns/internal/core/data/model/Document$b$b;", "getReview", "()Lcom/sumsub/sns/internal/core/data/model/Document$b$b;", "review", "getCountry", "country", "isRejected", "()Z", "isApproved", "isSubmitted", "isReviewing", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class Document implements Parcelable {
    public static final Parcelable.Creator<Document> CREATOR = new a();
    private final b result;
    private final DocumentType type;

    public static final class a implements Parcelable.Creator<Document> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Document createFromParcel(Parcel parcel) {
            return new Document(DocumentType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Document[] newArray(int i) {
            return new Document[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final C0198b f15237a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15238b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15239c;

        /* renamed from: d, reason: collision with root package name */
        public final List<Integer> f15240d;

        /* renamed from: e, reason: collision with root package name */
        public final Map<Integer, C0198b> f15241e;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                LinkedHashMap linkedHashMap = null;
                C0198b createFromParcel = parcel.readInt() == 0 ? null : C0198b.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt2);
                    for (int i9 = 0; i9 != readInt2; i9++) {
                        linkedHashMap.put(Integer.valueOf(parcel.readInt()), C0198b.CREATOR.createFromParcel(parcel));
                    }
                }
                return new b(createFromParcel, readString, readString2, arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.Document$b$b, reason: collision with other inner class name */
        public static final class C0198b implements Parcelable {
            public static final Parcelable.Creator<C0198b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final ReviewAnswerType f15242a;

            /* renamed from: b, reason: collision with root package name */
            public final String f15243b;

            /* renamed from: c, reason: collision with root package name */
            public final String f15244c;

            /* renamed from: d, reason: collision with root package name */
            public final List<String> f15245d;

            /* renamed from: com.sumsub.sns.internal.core.data.model.Document$b$b$a */
            public static final class a implements Parcelable.Creator<C0198b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0198b createFromParcel(Parcel parcel) {
                    return new C0198b(parcel.readInt() == 0 ? null : ReviewAnswerType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0198b[] newArray(int i) {
                    return new C0198b[i];
                }
            }

            public C0198b(ReviewAnswerType reviewAnswerType, String str, String str2, List<String> list) {
                this.f15242a = reviewAnswerType;
                this.f15243b = str;
                this.f15244c = str2;
                this.f15245d = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final ReviewAnswerType e() {
                return this.f15242a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0198b)) {
                    return false;
                }
                C0198b c0198b = (C0198b) obj;
                return this.f15242a == c0198b.f15242a && kotlin.jvm.internal.f.b(this.f15243b, c0198b.f15243b) && kotlin.jvm.internal.f.b(this.f15244c, c0198b.f15244c) && kotlin.jvm.internal.f.b(this.f15245d, c0198b.f15245d);
            }

            public final String g() {
                return this.f15243b;
            }

            public int hashCode() {
                ReviewAnswerType reviewAnswerType = this.f15242a;
                int hashCode = (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode()) * 31;
                String str = this.f15243b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f15244c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<String> list = this.f15245d;
                return hashCode3 + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Review(answer=");
                sb2.append(this.f15242a);
                sb2.append(", moderationComment=");
                sb2.append(this.f15243b);
                sb2.append(", clientComment=");
                sb2.append(this.f15244c);
                sb2.append(", rejectLabels=");
                return C.v.r(sb2, this.f15245d, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                ReviewAnswerType reviewAnswerType = this.f15242a;
                if (reviewAnswerType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(reviewAnswerType.name());
                }
                parcel.writeString(this.f15243b);
                parcel.writeString(this.f15244c);
                parcel.writeStringList(this.f15245d);
            }
        }

        public b(C0198b c0198b, String str, String str2, List<Integer> list, Map<Integer, C0198b> map) {
            this.f15237a = c0198b;
            this.f15238b = str;
            this.f15239c = str2;
            this.f15240d = list;
            this.f15241e = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f15237a, bVar.f15237a) && kotlin.jvm.internal.f.b(this.f15238b, bVar.f15238b) && kotlin.jvm.internal.f.b(this.f15239c, bVar.f15239c) && kotlin.jvm.internal.f.b(this.f15240d, bVar.f15240d) && kotlin.jvm.internal.f.b(this.f15241e, bVar.f15241e);
        }

        public final String f() {
            return this.f15238b;
        }

        public final List<Integer> h() {
            return this.f15240d;
        }

        public int hashCode() {
            C0198b c0198b = this.f15237a;
            int hashCode = (c0198b == null ? 0 : c0198b.hashCode()) * 31;
            String str = this.f15238b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15239c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Integer> list = this.f15240d;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Map<Integer, C0198b> map = this.f15241e;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        public final Map<Integer, C0198b> i() {
            return this.f15241e;
        }

        public final C0198b j() {
            return this.f15237a;
        }

        public String toString() {
            return "Result(review=" + this.f15237a + ", country=" + this.f15238b + ", identity=" + this.f15239c + ", imageIds=" + this.f15240d + ", imageResult=" + this.f15241e + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0198b c0198b = this.f15237a;
            if (c0198b == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                c0198b.writeToParcel(parcel, i);
            }
            parcel.writeString(this.f15238b);
            parcel.writeString(this.f15239c);
            List<Integer> list = this.f15240d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeInt(it.next().intValue());
                }
            }
            Map<Integer, C0198b> map = this.f15241e;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Integer, C0198b> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().intValue());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
    }

    public Document(DocumentType documentType, b bVar) {
        this.type = documentType;
        this.result = bVar;
    }

    public static /* synthetic */ Document copy$default(Document document, DocumentType documentType, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            documentType = document.type;
        }
        if ((i & 2) != 0) {
            bVar = document.result;
        }
        return document.copy(documentType, bVar);
    }

    /* renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final b getResult() {
        return this.result;
    }

    public final Document copy(DocumentType type, b result) {
        return new Document(type, result);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return kotlin.jvm.internal.f.b(this.type, document.type) && kotlin.jvm.internal.f.b(this.result, document.result);
    }

    public final String getCountry() {
        b bVar = this.result;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public final b getResult() {
        return this.result;
    }

    public final b.C0198b getReview() {
        Map<Integer, b.C0198b> i;
        Collection<b.C0198b> values;
        b.C0198b j10;
        b bVar = this.result;
        Object obj = null;
        if (((bVar == null || (j10 = bVar.j()) == null) ? null : j10.e()) != null) {
            return this.result.j();
        }
        b bVar2 = this.result;
        if (bVar2 == null || (i = bVar2.i()) == null || (values = i.values()) == null) {
            return null;
        }
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((b.C0198b) next).e() != null) {
                obj = next;
                break;
            }
        }
        return (b.C0198b) obj;
    }

    public final DocumentType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        b bVar = this.result;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final boolean isApproved() {
        b.C0198b j10;
        Map<Integer, b.C0198b> i;
        Collection<b.C0198b> values;
        b bVar = this.result;
        if (bVar == null || (i = bVar.i()) == null || (values = i.values()) == null) {
            b bVar2 = this.result;
            return (bVar2 == null || (j10 = bVar2.j()) == null || j10.e() != ReviewAnswerType.Green) ? false : true;
        }
        if (!values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (((b.C0198b) it.next()).e() == ReviewAnswerType.Green) {
                }
            }
        }
    }

    public final boolean isRejected() {
        b.C0198b j10;
        Map<Integer, b.C0198b> i;
        Collection<b.C0198b> values;
        b bVar = this.result;
        if (bVar == null || (i = bVar.i()) == null || (values = i.values()) == null) {
            b bVar2 = this.result;
            return (bVar2 == null || (j10 = bVar2.j()) == null || j10.e() != ReviewAnswerType.Red) ? false : true;
        }
        if (!values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (((b.C0198b) it.next()).e() == ReviewAnswerType.Red) {
                }
            }
        }
    }

    public final boolean isReviewing() {
        Map<Integer, b.C0198b> i;
        Collection<b.C0198b> values;
        b bVar = this.result;
        if (bVar != null && (i = bVar.i()) != null && (values = i.values()) != null && !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (((b.C0198b) it.next()).e() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isSubmitted() {
        b bVar = this.result;
        return (bVar != null ? bVar.j() : null) != null;
    }

    public String toString() {
        return "Document(type=" + this.type + ", result=" + this.result + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        this.type.writeToParcel(parcel, flags);
        b bVar = this.result;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, flags);
        }
    }
}
