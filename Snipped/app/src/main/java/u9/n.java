package u9;

import java.util.Date;

/* compiled from: AppStartState.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f30446e;

    /* renamed from: a, reason: collision with root package name */
    public Long f30447a;

    /* renamed from: b, reason: collision with root package name */
    public Long f30448b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f30449c;

    /* renamed from: d, reason: collision with root package name */
    public Date f30450d;

    static {
        n nVar = new n();
        nVar.f30449c = null;
        f30446e = nVar;
    }

    public final synchronized void a(long j10, Date date) {
        if (this.f30450d == null || this.f30447a == null) {
            this.f30450d = date;
            this.f30447a = Long.valueOf(j10);
        }
    }
}
