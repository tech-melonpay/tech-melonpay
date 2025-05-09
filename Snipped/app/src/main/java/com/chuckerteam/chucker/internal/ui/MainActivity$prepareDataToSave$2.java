package com.chuckerteam.chucker.internal.ui;

import Ka.t;
import Ka.y;
import O9.p;
import S1.l;
import V9.d;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import com.luminary.mobile.R;
import java.io.ByteArrayInputStream;
import java.util.List;
import ka.C0956a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$prepareDataToSave$2", f = "MainActivity.kt", l = {356}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LKa/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)LKa/y;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class MainActivity$prepareDataToSave$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super y>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8700u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity.ExportType f8701v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List<HttpTransaction> f8702w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8703x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$prepareDataToSave$2(MainActivity.ExportType exportType, List<HttpTransaction> list, MainActivity mainActivity, T9.a<? super MainActivity$prepareDataToSave$2> aVar) {
        super(2, aVar);
        this.f8701v = exportType;
        this.f8702w = list;
        this.f8703x = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new MainActivity$prepareDataToSave$2(this.f8701v, this.f8702w, this.f8703x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super y> aVar) {
        return ((MainActivity$prepareDataToSave$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8700u;
        if (i == 0) {
            kotlin.b.b(obj);
            int ordinal = this.f8701v.ordinal();
            List<HttpTransaction> list = this.f8702w;
            MainActivity mainActivity = this.f8703x;
            if (ordinal == 0) {
                return new l(list).a(mainActivity);
            }
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            HarUtils harUtils = HarUtils.f8635a;
            String string = mainActivity.getString(R.string.chucker_name);
            String string2 = mainActivity.getString(R.string.chucker_version);
            this.f8700u = 1;
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
        return new t(Ja.a.C(new ByteArrayInputStream(((String) obj).getBytes(C0956a.f23054b))));
    }
}
