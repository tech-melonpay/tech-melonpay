package retrofit2;

import kotlin.Result;

/* compiled from: KotlinExtensions.kt */
/* loaded from: classes3.dex */
public final class KotlinExtensions {

    /* compiled from: KotlinExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T9.a f26469a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Exception f26470b;

        public a(Exception exc, T9.a aVar) {
            this.f26469a = aVar;
            this.f26470b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            U4.b.p(this.f26469a).resumeWith(new Result.Failure(this.f26470b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, T9.a<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f26472v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26472v = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26471u
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f26472v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.b.b(r5)
            O9.p r4 = O9.p.f3034a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.b.b(r5)
            r0.getClass()
            r0.f26472v = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.d r2 = r0.getContext()
            retrofit2.KotlinExtensions$a r3 = new retrofit2.KotlinExtensions$a
            r3.<init>(r4, r0)
            r5.mo168dispatch(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.a(java.lang.Exception, T9.a):java.lang.Object");
    }
}
