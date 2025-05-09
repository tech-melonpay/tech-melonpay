package rb;

import com.bumptech.glide.load.Key;
import com.google.gson.g;
import com.google.gson.r;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import okhttp3.i;
import okhttp3.o;
import qb.f;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes3.dex */
public final class b<T> implements f<T, o> {

    /* renamed from: c, reason: collision with root package name */
    public static final i f26462c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f26463d;

    /* renamed from: a, reason: collision with root package name */
    public final g f26464a;

    /* renamed from: b, reason: collision with root package name */
    public final r<T> f26465b;

    static {
        Pattern pattern = i.f24542d;
        f26462c = i.a.a("application/json; charset=UTF-8");
        f26463d = Charset.forName(Key.STRING_CHARSET_NAME);
    }

    public b(g gVar, r<T> rVar) {
        this.f26464a = gVar;
        this.f26465b = rVar;
    }

    @Override // qb.f
    public final o b(Object obj) {
        Ka.f fVar = new Ka.f();
        r3.b f10 = this.f26464a.f(new OutputStreamWriter(new Ka.g(fVar), f26463d));
        this.f26465b.b(f10, obj);
        f10.close();
        return o.create(f26462c, fVar.h(fVar.f2294b));
    }
}
