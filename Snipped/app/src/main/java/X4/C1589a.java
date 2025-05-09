package x4;

import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Result;

/* compiled from: UtcDateTypeAdapter.kt */
/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589a implements p<Date>, k<Date> {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f30938a;

    public C1589a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        this.f30938a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // com.google.gson.k
    public final Date a(l lVar) {
        Object failure;
        try {
            failure = this.f30938a.parse(lVar.a());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Date) failure;
    }

    @Override // com.google.gson.p
    public final l b(Object obj) {
        Date date = (Date) obj;
        return date != null ? new o(this.f30938a.format(date)) : m.f10407a;
    }
}
