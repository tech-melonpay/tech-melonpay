package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.internal.core.data.model.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements Comparator<Document> {

    /* renamed from: a, reason: collision with root package name */
    public final g f15519a;

    /* renamed from: b, reason: collision with root package name */
    public final List<DocumentType> f15520b;

    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f15521a;

        public a(List list) {
            this.f15521a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return R9.a.a(Integer.valueOf(!this.f15521a.contains(((DocumentType) t3).c()) ? 1 : 0), Integer.valueOf(!this.f15521a.contains(((DocumentType) t10).c()) ? 1 : 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    public m(g gVar) {
        this.f15519a = gVar;
        List<g.c.a> g10 = gVar.I().g();
        ArrayList arrayList = new ArrayList(P9.n.u(g10, 10));
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            arrayList.add(((g.c.a) it.next()).m().c());
        }
        ArrayList j10 = this.f15519a.I().k() ? this.f15519a.I().j() : null;
        arrayList = j10 != null ? j10 : arrayList;
        List<g.c.a> g11 = this.f15519a.I().g();
        ArrayList arrayList2 = new ArrayList(P9.n.u(g11, 10));
        Iterator it2 = g11.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((g.c.a) it2.next()).m());
        }
        this.f15520b = P9.s.X(arrayList2, new a(arrayList));
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Document document, Document document2) {
        int i;
        int i9 = -1;
        int i10 = 0;
        if (document != null) {
            Iterator<DocumentType> it = this.f15520b.iterator();
            i = 0;
            while (it.hasNext()) {
                if (kotlin.jvm.internal.f.b(it.next(), document.getType())) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (document2 != null) {
            Iterator<DocumentType> it2 = this.f15520b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.f.b(it2.next(), document2.getType())) {
                    i9 = i10;
                    break;
                }
                i10++;
            }
        }
        return i - i9;
    }
}
