package J1;

import C.v;
import P9.n;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.sumsub.sentry.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: Log.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006¨\u0006!"}, d2 = {"LJ1/b;", "", "", "a", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "version", "LK1/b;", "b", "LK1/b;", "getCreator", "()LK1/b;", "creator", "LK1/a;", "c", "LK1/a;", "getBrowser", "()LK1/a;", c.f13591c, "", "d", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "pages", "LK1/c;", "e", "getEntries", "entries", "f", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("version")
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("creator")
    private final K1.b creator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b(c.f13591c)
    private final K1.a browser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l3.b("pages")
    private final List<Object> pages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l3.b("entries")
    private final List<K1.c> entries;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    public b() {
        throw null;
    }

    public b(List<HttpTransaction> list, K1.b bVar) {
        List<HttpTransaction> list2 = list;
        ArrayList arrayList = new ArrayList(n.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new K1.c((HttpTransaction) it.next()));
        }
        this.version = "1.2";
        this.creator = bVar;
        this.browser = null;
        this.pages = null;
        this.entries = arrayList;
        this.comment = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.version, bVar.version) && f.b(this.creator, bVar.creator) && f.b(this.browser, bVar.browser) && f.b(this.pages, bVar.pages) && f.b(this.entries, bVar.entries) && f.b(this.comment, bVar.comment);
    }

    public final int hashCode() {
        int hashCode = (this.creator.hashCode() + (this.version.hashCode() * 31)) * 31;
        K1.a aVar = this.browser;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<Object> list = this.pages;
        int f10 = v.f(this.entries, (hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str = this.comment;
        return f10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Log(version=" + this.version + ", creator=" + this.creator + ", browser=" + this.browser + ", pages=" + this.pages + ", entries=" + this.entries + ", comment=" + this.comment + ")";
    }
}
