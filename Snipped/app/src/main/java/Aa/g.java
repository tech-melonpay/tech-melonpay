package Aa;

import Ka.t;
import java.util.regex.Pattern;
import okhttp3.i;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes2.dex */
public final class g extends va.i {

    /* renamed from: b, reason: collision with root package name */
    public final String f156b;

    /* renamed from: c, reason: collision with root package name */
    public final long f157c;

    /* renamed from: d, reason: collision with root package name */
    public final Ka.i f158d;

    public g(String str, long j10, t tVar) {
        this.f156b = str;
        this.f157c = j10;
        this.f158d = tVar;
    }

    @Override // va.i
    public final long i() {
        return this.f157c;
    }

    @Override // va.i
    public final okhttp3.i j() {
        String str = this.f156b;
        if (str == null) {
            return null;
        }
        Pattern pattern = okhttp3.i.f24542d;
        return i.a.b(str);
    }

    @Override // va.i
    public final Ka.i p() {
        return this.f158d;
    }
}
