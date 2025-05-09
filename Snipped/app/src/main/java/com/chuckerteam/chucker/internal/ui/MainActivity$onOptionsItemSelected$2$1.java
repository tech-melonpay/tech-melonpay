package com.chuckerteam.chucker.internal.ui;

import O9.p;
import S1.k;
import S1.l;
import V9.d;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$2$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "LS1/k;", "<anonymous>", "(Ljava/util/List;)LS1/k;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainActivity$onOptionsItemSelected$2$1 extends SuspendLambda implements InterfaceC0650p<List<? extends HttpTransaction>, T9.a<? super k>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8686u;

    public MainActivity$onOptionsItemSelected$2$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        MainActivity$onOptionsItemSelected$2$1 mainActivity$onOptionsItemSelected$2$1 = new MainActivity$onOptionsItemSelected$2$1(2, aVar);
        mainActivity$onOptionsItemSelected$2$1.f8686u = obj;
        return mainActivity$onOptionsItemSelected$2$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(List<? extends HttpTransaction> list, T9.a<? super k> aVar) {
        return ((MainActivity$onOptionsItemSelected$2$1) create(list, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        return new l((List) this.f8686u);
    }
}
