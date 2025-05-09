package androidx.room;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f7838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7839c;

    public /* synthetic */ d(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i) {
        this.f7837a = i;
        this.f7838b = queryInterceptorDatabase;
        this.f7839c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7837a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$6(this.f7838b, this.f7839c);
                break;
            default:
                QueryInterceptorDatabase.execSQL$lambda$10(this.f7838b, this.f7839c);
                break;
        }
    }
}
