package androidx.room;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f7836b;

    public /* synthetic */ c(QueryInterceptorDatabase queryInterceptorDatabase, int i) {
        this.f7835a = i;
        this.f7836b = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7835a) {
            case 0:
                QueryInterceptorDatabase.endTransaction$lambda$4(this.f7836b);
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(this.f7836b);
                break;
            case 2:
                QueryInterceptorDatabase.beginTransaction$lambda$0(this.f7836b);
                break;
            case 3:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.f7836b);
                break;
            case 4:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.f7836b);
                break;
            default:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.f7836b);
                break;
        }
    }
}
