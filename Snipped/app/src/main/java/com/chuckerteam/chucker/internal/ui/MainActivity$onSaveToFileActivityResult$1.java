package com.chuckerteam.chucker.internal.ui;

import O9.p;
import V9.d;
import android.net.Uri;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$onSaveToFileActivityResult$1", f = "MainActivity.kt", l = {327, 329}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainActivity$onSaveToFileActivityResult$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8690u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8691v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f8692w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8693x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MainActivity.ExportType f8694y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onSaveToFileActivityResult$1(Uri uri, MainActivity mainActivity, MainActivity.ExportType exportType, T9.a<? super MainActivity$onSaveToFileActivityResult$1> aVar) {
        super(2, aVar);
        this.f8692w = uri;
        this.f8693x = mainActivity;
        this.f8694y = exportType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        MainActivity$onSaveToFileActivityResult$1 mainActivity$onSaveToFileActivityResult$1 = new MainActivity$onSaveToFileActivityResult$1(this.f8692w, this.f8693x, this.f8694y, aVar);
        mainActivity$onSaveToFileActivityResult$1.f8691v = obj;
        return mainActivity$onSaveToFileActivityResult$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((MainActivity$onSaveToFileActivityResult$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r5.f8690u
            r2 = 2
            r3 = 1
            com.chuckerteam.chucker.internal.ui.MainActivity r4 = r5.f8693x
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r6)
            goto L57
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L1e
            goto L32
        L1e:
            r6 = move-exception
            goto L35
        L20:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.f8691v
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            com.chuckerteam.chucker.internal.ui.MainActivity$ExportType r6 = r5.f8694y
            r5.f8690u = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = com.chuckerteam.chucker.internal.ui.MainActivity.m(r4, r6, r5)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L32
            return r0
        L32:
            Ka.y r6 = (Ka.y) r6     // Catch: java.lang.Throwable -> L1e
            goto L3b
        L35:
            kotlin.Result$Failure r1 = new kotlin.Result$Failure
            r1.<init>(r6)
            r6 = r1
        L3b:
            boolean r1 = r6 instanceof kotlin.Result.Failure
            if (r1 == 0) goto L41
            r6 = 0
        L41:
            Ka.y r6 = (Ka.y) r6
            if (r6 != 0) goto L48
            O9.p r6 = O9.p.f3034a
            return r6
        L48:
            android.content.ContentResolver r1 = r4.getContentResolver()
            r5.f8690u = r2
            android.net.Uri r2 = r5.f8692w
            java.lang.Object r6 = com.chuckerteam.chucker.internal.support.a.a(r6, r5, r1, r2)
            if (r6 != r0) goto L57
            return r0
        L57:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            r6 = 2132017386(0x7f1400ea, float:1.9673049E38)
            goto L66
        L63:
            r6 = 2132017384(0x7f1400e8, float:1.9673045E38)
        L66:
            android.content.Context r0 = r4.getApplicationContext()
            r1 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r6, r1)
            r6.show()
            O9.p r6 = O9.p.f3034a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.ui.MainActivity$onSaveToFileActivityResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
