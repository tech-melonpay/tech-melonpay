package qb;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.HttpException;

/* compiled from: KotlinExtensions.kt */
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f25953b;

    public /* synthetic */ i(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.f25952a = i;
        this.f25953b = cancellableContinuationImpl;
    }

    @Override // qb.d
    public final void onFailure(b bVar, Throwable th) {
        switch (this.f25952a) {
            case 0:
                this.f25953b.resumeWith(new Result.Failure(th));
                break;
            case 1:
                this.f25953b.resumeWith(new Result.Failure(th));
                break;
            default:
                this.f25953b.resumeWith(new Result.Failure(th));
                break;
        }
    }

    @Override // qb.d
    public final void onResponse(b bVar, q qVar) {
        switch (this.f25952a) {
            case 0:
                boolean j10 = qVar.f26065a.j();
                CancellableContinuation cancellableContinuation = this.f25953b;
                if (!j10) {
                    cancellableContinuation.resumeWith(new Result.Failure(new HttpException(qVar)));
                    return;
                }
                Object obj = qVar.f26066b;
                if (obj != null) {
                    cancellableContinuation.resumeWith(obj);
                    return;
                }
                Object cast = h.class.cast(bVar.request().f24648e.get(h.class));
                if (cast == null) {
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                    kotlin.jvm.internal.f.d(kotlinNullPointerException, kotlin.jvm.internal.f.class.getName());
                    throw kotlinNullPointerException;
                }
                StringBuilder sb2 = new StringBuilder("Response from ");
                Method method = ((h) cast).f25950a;
                sb2.append(method.getDeclaringClass().getName());
                sb2.append('.');
                sb2.append(method.getName());
                sb2.append(" was null but response body type was declared as non-null");
                cancellableContinuation.resumeWith(new Result.Failure(new KotlinNullPointerException(sb2.toString())));
                return;
            case 1:
                boolean j11 = qVar.f26065a.j();
                CancellableContinuation cancellableContinuation2 = this.f25953b;
                if (j11) {
                    cancellableContinuation2.resumeWith(qVar.f26066b);
                    return;
                } else {
                    cancellableContinuation2.resumeWith(new Result.Failure(new HttpException(qVar)));
                    return;
                }
            default:
                this.f25953b.resumeWith(qVar);
                return;
        }
    }
}
