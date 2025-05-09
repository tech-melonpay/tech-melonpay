package com.sumsub.sns.internal.core.presentation.form.model;

import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16574a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final f f16575b = new f();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Set<String> f16576a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<FieldId> f16577b;

        public a(Set<String> set, Set<FieldId> set2) {
            this.f16576a = set;
            this.f16577b = set2;
        }

        public final Set<String> a() {
            return this.f16576a;
        }

        public final Set<FieldId> b() {
            return this.f16577b;
        }

        public final Set<FieldId> c() {
            return this.f16577b;
        }

        public final Set<String> d() {
            return this.f16576a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f16576a, aVar.f16576a) && kotlin.jvm.internal.f.b(this.f16577b, aVar.f16577b);
        }

        public int hashCode() {
            return this.f16577b.hashCode() + (this.f16576a.hashCode() * 31);
        }

        public String toString() {
            return "CheckResult(illegalSectionIds=" + this.f16576a + ", illegalItemIds=" + this.f16577b + ')';
        }
    }

    public final a a(List<? extends FormItem> list, com.sumsub.sns.internal.core.presentation.form.d dVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FormItem.l) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((FormItem) obj2).d().p() != null) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String e10 = ((FormItem) next).e();
            Object obj3 = linkedHashMap.get(e10);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(e10, obj3);
            }
            ((List) obj3).add(next);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FormItem.l lVar = (FormItem.l) it2.next();
            List<FormItem> list2 = (List) linkedHashMap.get(lVar.e());
            if (f16574a.a(lVar, list, linkedHashSet2, linkedHashSet, dVar)) {
                if (list2 != null && (r10 = list2.iterator()) != null) {
                    for (FormItem formItem : list2) {
                        if (!f16574a.a(formItem, list, linkedHashSet2, linkedHashSet, dVar) && formItem.e() != null && formItem.d().p() != null) {
                            linkedHashSet.add(new FieldId(formItem.e(), formItem.d().p()));
                        }
                    }
                }
            } else if (list2 != null && (r0 = list2.iterator()) != null) {
                for (FormItem formItem2 : list2) {
                    if (formItem2.e() != null && formItem2.d().p() != null) {
                        linkedHashSet.add(new FieldId(formItem2.e(), formItem2.d().p()));
                    }
                    String e11 = formItem2.e();
                    if (e11 != null) {
                        linkedHashSet2.add(e11);
                    }
                }
            }
        }
        return new a(linkedHashSet2, linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r19.contains(r7.c()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r19.contains(r7.c()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r8 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0166, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0120, code lost:
    
        if (r8 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0163, code lost:
    
        if (r8 == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.sumsub.sns.internal.core.presentation.form.model.FormItem r17, java.util.List<? extends com.sumsub.sns.internal.core.presentation.form.model.FormItem> r18, java.util.Set<java.lang.String> r19, java.util.Set<com.sumsub.sns.internal.core.presentation.form.FieldId> r20, com.sumsub.sns.internal.core.presentation.form.d r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.form.model.b.a(com.sumsub.sns.internal.core.presentation.form.model.FormItem, java.util.List, java.util.Set, java.util.Set, com.sumsub.sns.internal.core.presentation.form.d):boolean");
    }

    public final FormItem a(List<? extends FormItem> list, String str, String str2) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FormItem formItem = (FormItem) obj;
            if (kotlin.jvm.internal.f.b(formItem.e(), str) && kotlin.jvm.internal.f.b(formItem.d().p(), str2)) {
                break;
            }
        }
        return (FormItem) obj;
    }
}
