package com.sumsub.sns.internal.core.data.source.cache;

import O9.p;
import V9.d;
import android.content.Context;
import ca.InterfaceC0650p;
import com.sumsub.sns.internal.log.c;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16093a;

    @d(c = "com.sumsub.sns.internal.core.data.source.cache.CacheRepositoryImpl$createNewFile$2", f = "CacheRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.core.data.source.cache.b$b, reason: collision with other inner class name */
    public static final class C0230b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16094a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16095b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f16097d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0230b(String str, T9.a<? super C0230b> aVar) {
            super(2, aVar);
            this.f16097d = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super File> aVar) {
            return ((C0230b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            C0230b c0230b = b.this.new C0230b(this.f16097d, aVar);
            c0230b.f16095b = obj;
            return c0230b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16094a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f16095b;
            File file = new File(b.this.f16093a.getCacheDir(), this.f16097d);
            try {
                file.createNewFile();
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a10 = c.a(coroutineScope);
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(a10, message, e10);
            }
            return file;
        }
    }

    public b(Context context) {
        this.f16093a = context;
    }

    @Override // com.sumsub.sns.internal.core.data.source.cache.a
    public Object a(String str, T9.a<? super File> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C0230b(str, null), aVar);
    }
}
