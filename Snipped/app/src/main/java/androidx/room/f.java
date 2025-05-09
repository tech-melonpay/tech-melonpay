package androidx.room;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorStatement f7845b;

    public /* synthetic */ f(QueryInterceptorStatement queryInterceptorStatement, int i) {
        this.f7844a = i;
        this.f7845b = queryInterceptorStatement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7844a) {
            case 0:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(this.f7845b);
                break;
            case 1:
                QueryInterceptorStatement.executeInsert$lambda$2(this.f7845b);
                break;
            case 2:
                QueryInterceptorStatement.simpleQueryForString$lambda$4(this.f7845b);
                break;
            case 3:
                QueryInterceptorStatement.execute$lambda$0(this.f7845b);
                break;
            default:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(this.f7845b);
                break;
        }
    }
}
