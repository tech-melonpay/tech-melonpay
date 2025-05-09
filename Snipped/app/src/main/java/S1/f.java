package S1;

import C.v;
import P9.s;
import com.sumsub.sns.internal.core.data.model.p;
import java.util.List;
import ka.C0969n;
import okhttp3.h;

/* compiled from: FormattedUrl.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3343c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3344d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3345e;

    /* compiled from: FormattedUrl.kt */
    public static final class a {
        public static f a(okhttp3.h hVar, boolean z10) {
            f fVar;
            String sb2;
            if (z10) {
                String P4 = s.P(hVar.c(), "/", null, null, null, 62);
                String concat = C0969n.i0(P4) ^ true ? "/".concat(P4) : "";
                String d10 = hVar.d();
                fVar = new f(hVar.f24529e, hVar.f24525a, hVar.f24528d, concat, d10 == null ? "" : d10);
            } else {
                String P10 = s.P(hVar.f24530f, "/", null, null, null, 62);
                String concat2 = C0969n.i0(P10) ^ true ? "/".concat(P10) : "";
                List<String> list = hVar.f24531g;
                if (list == null) {
                    sb2 = null;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    h.b.e(list, sb3);
                    sb2 = sb3.toString();
                }
                fVar = new f(hVar.f24529e, hVar.f24525a, hVar.f24528d, concat2, sb2 == null ? "" : sb2);
            }
            return fVar;
        }
    }

    public f(int i, String str, String str2, String str3, String str4) {
        this.f3341a = str;
        this.f3342b = str2;
        this.f3343c = i;
        this.f3344d = str3;
        this.f3345e = str4;
    }

    public final String a() {
        String str = this.f3345e;
        boolean i02 = C0969n.i0(str);
        String str2 = this.f3344d;
        return i02 ? str2 : v.p(str2, "?", str);
    }

    public final String b() {
        String str = this.f3341a;
        boolean b9 = kotlin.jvm.internal.f.b(str, "https");
        String str2 = this.f3342b;
        int i = this.f3343c;
        if ((b9 && i == 443) || (kotlin.jvm.internal.f.b(str, "http") && i == 80)) {
            return str + "://" + str2 + a();
        }
        return str + "://" + str2 + p.f15541a + i + a();
    }
}
