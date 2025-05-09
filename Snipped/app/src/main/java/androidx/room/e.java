package androidx.room;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f7841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1.f f7842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorProgram f7843d;

    public /* synthetic */ e(QueryInterceptorDatabase queryInterceptorDatabase, d1.f fVar, QueryInterceptorProgram queryInterceptorProgram, int i) {
        this.f7840a = i;
        this.f7841b = queryInterceptorDatabase;
        this.f7842c = fVar;
        this.f7843d = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7840a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$8(this.f7841b, this.f7842c, this.f7843d);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$9(this.f7841b, this.f7842c, this.f7843d);
                break;
        }
    }
}
