package com.chuckerteam.chucker.internal.ui;

import O9.p;
import S1.k;
import S1.l;
import V9.d;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$3$1", f = "MainActivity.kt", l = {199}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "LS1/k;", "<anonymous>", "(Ljava/util/List;)LS1/k;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainActivity$onOptionsItemSelected$3$1 extends SuspendLambda implements InterfaceC0650p<List<? extends HttpTransaction>, T9.a<? super k>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8687u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8688v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onOptionsItemSelected$3$1(MainActivity mainActivity, T9.a<? super MainActivity$onOptionsItemSelected$3$1> aVar) {
        super(2, aVar);
        this.f8689w = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        MainActivity$onOptionsItemSelected$3$1 mainActivity$onOptionsItemSelected$3$1 = new MainActivity$onOptionsItemSelected$3$1(this.f8689w, aVar);
        mainActivity$onOptionsItemSelected$3$1.f8688v = obj;
        return mainActivity$onOptionsItemSelected$3$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(List<? extends HttpTransaction> list, T9.a<? super k> aVar) {
        return ((MainActivity$onOptionsItemSelected$3$1) create(list, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8687u;
        if (i == 0) {
            kotlin.b.b(obj);
            List<HttpTransaction> list = (List) this.f8688v;
            HarUtils harUtils = HarUtils.f8635a;
            MainActivity mainActivity = this.f8689w;
            String string = mainActivity.getString(R.string.chucker_name);
            String string2 = mainActivity.getString(R.string.chucker_version);
            this.f8687u = 1;
            obj = harUtils.a(list, string, string2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return new l((String) obj, 1);
    }
}
