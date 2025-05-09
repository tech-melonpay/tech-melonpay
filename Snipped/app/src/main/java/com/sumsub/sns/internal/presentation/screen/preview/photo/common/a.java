package com.sumsub.sns.internal.presentation.screen.preview.photo.common;

import V9.d;
import android.graphics.Bitmap;
import androidx.lifecycle.G;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.o0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.domain.o;
import com.sumsub.sns.internal.log.c;
import com.sumsub.sns.internal.ml.core.e;
import com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a extends SNSPreviewPhotoDocumentViewModel {

    @d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.common.SNSPreviewCommonDocumentViewModel", f = "SNSPreviewCommonDocumentViewModel.kt", l = {53}, m = "onPrepare")
    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.common.a$a, reason: collision with other inner class name */
    public static final class C0337a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18655a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18656b;

        /* renamed from: d, reason: collision with root package name */
        public int f18658d;

        public C0337a(T9.a<? super C0337a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18656b = obj;
            this.f18658d |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    public a(Document document, G g10, o oVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.data.source.extensions.a aVar2, o0 o0Var, e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> eVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(document, g10, aVar, bVar, aVar2, oVar, o0Var, eVar, bVar2);
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Preview Common Document is created", null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.common.a.C0337a
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.presentation.screen.preview.photo.common.a$a r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.common.a.C0337a) r0
            int r1 = r0.f18658d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18658d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.common.a$a r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.common.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18656b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18658d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f18655a
            com.sumsub.sns.internal.presentation.screen.preview.photo.common.a r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.common.a) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f18655a = r4
            r0.f18658d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            r0.m()
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.common.a.c(T9.a):java.lang.Object");
    }
}
