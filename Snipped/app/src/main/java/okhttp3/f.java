package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.i;

/* compiled from: FormBody.kt */
/* loaded from: classes2.dex */
public final class f extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final i f24516f;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f24517d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f24518e;

    /* compiled from: FormBody.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f24519a = null;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f24520b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f24521c = new ArrayList();
    }

    static {
        Pattern pattern = i.f24542d;
        f24516f = i.a.a("application/x-www-form-urlencoded");
    }

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f24517d = wa.b.w(arrayList);
        this.f24518e = wa.b.w(arrayList2);
    }

    public final long a(Ka.h hVar, boolean z10) {
        Ka.f fVar = z10 ? new Ka.f() : hVar.getBuffer();
        List<String> list = this.f24517d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.W(38);
            }
            fVar.o0(list.get(i));
            fVar.W(61);
            fVar.o0(this.f24518e.get(i));
        }
        if (!z10) {
            return 0L;
        }
        long j10 = fVar.f2294b;
        fVar.d();
        return j10;
    }

    @Override // okhttp3.o
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.o
    public final i contentType() {
        return f24516f;
    }

    @Override // okhttp3.o
    public final void writeTo(Ka.h hVar) {
        a(hVar, false);
    }
}
