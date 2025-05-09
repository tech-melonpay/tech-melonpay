package com.chuckerteam.chucker.internal.ui;

import O9.p;
import S1.k;
import V9.d;
import android.content.Context;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1", f = "MainActivity.kt", l = {241, 247, 249}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class MainActivity$exportTransactions$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8678u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8679v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f8680w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<List<HttpTransaction>, T9.a<? super k>, Object> f8681x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f8682y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity$exportTransactions$1(MainActivity mainActivity, Context context, InterfaceC0650p<? super List<HttpTransaction>, ? super T9.a<? super k>, ? extends Object> interfaceC0650p, String str, T9.a<? super MainActivity$exportTransactions$1> aVar) {
        super(2, aVar);
        this.f8679v = mainActivity;
        this.f8680w = context;
        this.f8681x = interfaceC0650p;
        this.f8682y = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new MainActivity$exportTransactions$1(this.f8679v, this.f8680w, this.f8681x, this.f8682y, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((MainActivity$exportTransactions$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r8.f8678u
            android.content.Context r2 = r8.f8680w
            r3 = 3
            r4 = 1
            r5 = 2
            com.chuckerteam.chucker.internal.ui.MainActivity r6 = r8.f8679v
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r3) goto L17
            kotlin.b.b(r9)
            goto L80
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.b.b(r9)
            goto L69
        L23:
            kotlin.b.b(r9)
            goto L49
        L27:
            kotlin.b.b(r9)
            int r9 = com.chuckerteam.chucker.internal.ui.MainActivity.f8665o
            H1.a r9 = r6.i
            java.lang.Object r9 = r9.getValue()
            T1.c r9 = (T1.c) r9
            r8.f8678u = r4
            C.N r9 = Ja.a.f2210a
            if (r9 == 0) goto L95
            java.lang.Object r9 = r9.f535b
            com.chuckerteam.chucker.internal.data.room.ChuckerDatabase r9 = (com.chuckerteam.chucker.internal.data.room.ChuckerDatabase) r9
            R1.a r9 = r9.a()
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L49
            return r0
        L49:
            java.util.List r9 = (java.util.List) r9
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L5e
            r9 = 2132017377(0x7f1400e1, float:1.967303E38)
            java.lang.String r9 = r2.getString(r9)
            T1.a.l(r6, r9)
            O9.p r9 = O9.p.f3034a
            return r9
        L5e:
            r8.f8678u = r5
            ca.p<java.util.List<com.chuckerteam.chucker.internal.data.entity.HttpTransaction>, T9.a<? super S1.k>, java.lang.Object> r1 = r8.f8681x
            java.lang.Object r9 = r1.invoke(r9, r8)
            if (r9 != r0) goto L69
            return r0
        L69:
            S1.k r9 = (S1.k) r9
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1 r4 = new com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1
            java.lang.String r5 = r8.f8682y
            r7 = 0
            r4.<init>(r9, r6, r5, r7)
            r8.f8678u = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r8)
            if (r9 != r0) goto L80
            return r0
        L80:
            android.content.Intent r9 = (android.content.Intent) r9
            if (r9 == 0) goto L88
            r6.startActivity(r9)
            goto L92
        L88:
            r9 = 2132017379(0x7f1400e3, float:1.9673035E38)
            java.lang.String r9 = r2.getString(r9)
            T1.a.l(r6, r9)
        L92:
            O9.p r9 = O9.p.f3034a
            return r9
        L95:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can't access the transaction repository if you don't initialize it!"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
