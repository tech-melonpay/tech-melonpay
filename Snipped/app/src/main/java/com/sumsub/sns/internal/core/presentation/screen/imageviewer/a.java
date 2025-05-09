package com.sumsub.sns.internal.core.presentation.screen.imageviewer;

import O9.p;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.File;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.a<b> {

    /* renamed from: t, reason: collision with root package name */
    public static final C0247a f16625t = new C0247a(null);

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f16626q;

    /* renamed from: r, reason: collision with root package name */
    public final File f16627r;

    /* renamed from: s, reason: collision with root package name */
    public final StateFlow<b> f16628s;

    /* renamed from: com.sumsub.sns.internal.core.presentation.screen.imageviewer.a$a, reason: collision with other inner class name */
    public static final class C0247a {
        public /* synthetic */ C0247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0247a() {
        }
    }

    public static final class b implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f16629a;

        /* renamed from: b, reason: collision with root package name */
        public final File f16630b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16631c;

        public b() {
            this(null, null, 0, 7, null);
        }

        public final Bitmap d() {
            return this.f16629a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f.b(this.f16629a, bVar.f16629a) && f.b(this.f16630b, bVar.f16630b) && this.f16631c == bVar.f16631c;
        }

        public final int f() {
            return this.f16631c;
        }

        public int hashCode() {
            Bitmap bitmap = this.f16629a;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            File file = this.f16630b;
            return Integer.hashCode(this.f16631c) + ((hashCode + (file != null ? file.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(bitmap=");
            sb2.append(this.f16629a);
            sb2.append(", bitmapFile=");
            sb2.append(this.f16630b);
            sb2.append(", rotation=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.f16631c, ')');
        }

        public b(Bitmap bitmap, File file, int i) {
            this.f16629a = bitmap;
            this.f16630b = file;
            this.f16631c = i;
        }

        public /* synthetic */ b(Bitmap bitmap, File file, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : bitmap, (i9 & 2) != 0 ? null : file, (i9 & 4) != 0 ? 0 : i);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.imageviewer.SNSImageViewerViewModel$viewState$1", f = "SNSImageViewerViewModel.kt", l = {50, 56, 62}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super b>, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16632a;

        /* renamed from: b, reason: collision with root package name */
        public int f16633b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16634c;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super b> flowCollector, T9.a<? super p> aVar) {
            return ((c) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = a.this.new c(aVar);
            cVar.f16634c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.screen.imageviewer.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.imageviewer.SNSImageViewerViewModel$viewState$2", f = "SNSImageViewerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super b>, Throwable, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f16636a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16637b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f16638c;

        @V9.d(c = "com.sumsub.sns.internal.core.presentation.screen.imageviewer.SNSImageViewerViewModel$viewState$2$1", f = "SNSImageViewerViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.core.presentation.screen.imageviewer.a$d$a, reason: collision with other inner class name */
        public static final class C0248a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f16640a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f16641b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Throwable f16642c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0248a(Throwable th, T9.a<? super C0248a> aVar) {
                super(2, aVar);
                this.f16642c = th;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                return ((C0248a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                C0248a c0248a = new C0248a(this.f16642c, aVar);
                c0248a.f16641b = obj;
                return c0248a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f16640a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a((CoroutineScope) this.f16641b), "Can't decode file", this.f16642c);
                return p.f3034a;
            }
        }

        public d(T9.a<? super d> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super b> flowCollector, Throwable th, T9.a<? super p> aVar) {
            d dVar = a.this.new d(aVar);
            dVar.f16637b = flowCollector;
            dVar.f16638c = th;
            return dVar.invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f16636a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f16637b;
            Throwable th = (Throwable) this.f16638c;
            a aVar = a.this;
            com.sumsub.sns.core.presentation.base.a.a(aVar, th, aVar.r(), (Object) null, 4, (Object) null);
            com.sumsub.sns.internal.log.a aVar2 = com.sumsub.sns.internal.log.a.f17535a;
            String a10 = com.sumsub.sns.internal.log.c.a(flowCollector);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            aVar2.e(a10, message, th);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(a.this), NonCancellable.INSTANCE, null, new C0248a(th, null), 2, null);
            return p.f3034a;
        }
    }

    public a(Bundle bundle, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f16626q = bundle;
        Serializable serializable = bundle != null ? bundle.getSerializable("file") : null;
        this.f16627r = serializable instanceof File ? (File) serializable : null;
        this.f16628s = FlowKt.stateIn(FlowKt.m142catch(FlowKt.flow(new c(null)), new d(null)), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), new b(null, null, 0, 7, null));
    }

    public final File p() {
        return this.f16627r;
    }

    public final String r() {
        Bundle bundle = this.f16626q;
        String string = bundle != null ? bundle.getString("arg_iddocsettype") : null;
        return string == null ? DocumentType.f15253j : string;
    }

    public final int s() {
        Bundle bundle = this.f16626q;
        if (bundle != null) {
            return bundle.getInt("rotation");
        }
        return 0;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public StateFlow<b> j() {
        return this.f16628s;
    }
}
