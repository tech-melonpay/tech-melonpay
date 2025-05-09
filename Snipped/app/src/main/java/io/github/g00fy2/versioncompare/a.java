package io.github.g00fy2.versioncompare;

import io.github.g00fy2.versioncompare.VersionComparator;
import java.util.ArrayList;

/* compiled from: Version.java */
/* loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21529a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21530b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21531c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final String f21532d;

    /* renamed from: e, reason: collision with root package name */
    public final VersionComparator.ReleaseType f21533e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21534f;

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bb A[EDGE_INSN: B:87:0x01bb->B:91:0x01bb BREAK  A[LOOP:4: B:69:0x0183->B:72:0x01b8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.g00fy2.versioncompare.a.<init>(java.lang.String):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a aVar) {
        ArrayList arrayList = this.f21531c;
        ArrayList arrayList2 = aVar.f21531c;
        int size = arrayList.size();
        int size2 = arrayList2.size();
        int max = Math.max(size, size2);
        int i = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= max) {
                break;
            }
            if ((i9 < size ? ((Long) arrayList.get(i9)).longValue() : 0L) > (i9 < size2 ? ((Long) arrayList2.get(i9)).longValue() : 0L)) {
                i = 1;
                break;
            }
            if ((i9 < size ? ((Long) arrayList.get(i9)).longValue() : 0L) < (i9 < size2 ? ((Long) arrayList2.get(i9)).longValue() : 0L)) {
                i = -1;
                break;
            }
            i9++;
        }
        if (i != 0) {
            return i;
        }
        int compareTo = this.f21533e.compareTo(aVar.f21533e);
        return compareTo != 0 ? compareTo : Long.compare(this.f21534f, aVar.f21534f);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && compareTo((a) obj) == 0) {
            return true;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        int hashCode = (this.f21533e.hashCode() + (this.f21531c.hashCode() * 31)) * 31;
        long j10 = this.f21534f;
        return hashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return String.valueOf(this.f21529a);
    }
}
