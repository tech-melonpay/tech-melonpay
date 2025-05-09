package com.sumsub.sns.internal.core.common;

import V9.d;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.DefaultLifecycleObserver;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.c;
import ia.InterfaceC0840h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class z<T extends View> implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f15223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15224b;

    /* renamed from: c, reason: collision with root package name */
    public T f15225c;

    @d(c = "com.sumsub.sns.internal.core.common.LifecycleAwareFindView$getValue$1", f = "LifecycleAwareFindView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15226a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z<T> f15227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z<T> zVar, T9.a<? super a> aVar) {
            super(2, aVar);
            this.f15227b = zVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new a(this.f15227b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f15226a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            try {
                if (this.f15227b.f15223a.getView() != null) {
                    this.f15227b.f15223a.getViewLifecycleOwner().getLifecycle().a(this.f15227b);
                }
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.a.f17535a.e(c.a(this.f15227b), "Error adding lifecycle observer", th);
            }
            return O9.p.f3034a;
        }
    }

    public z(Fragment fragment, int i) {
        this.f15223a = fragment;
        this.f15224b = i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.lifecycle.r rVar) {
        this.f15225c = null;
    }

    public final T a(Object obj, InterfaceC0840h<?> interfaceC0840h) {
        T t3 = null;
        if (this.f15225c == null && this.f15223a.getView() != null) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(this.f15223a), Dispatchers.getMain().getImmediate(), null, new a(this, null), 2, null);
        }
        if (this.f15223a.getView() != null) {
            if (this.f15225c == null) {
                View view = this.f15223a.getView();
                if (view != null) {
                    t3 = (T) view.findViewById(this.f15224b);
                }
                this.f15225c = t3;
            }
            return this.f15225c;
        }
        Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, c.a(this), this.f15223a + ".view is null", null, 4, null);
        this.f15225c = null;
        return null;
    }
}
