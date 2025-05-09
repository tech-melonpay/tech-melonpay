package com.sumsub.sns.internal.presentation.screen.preview.photo;

import V9.d;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.ml.badphotos.models.b;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {

    @d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModelKt", f = "SNSPreviewPhotoDocumentViewModel.kt", l = {72}, m = "detectRotationDegree")
    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.photo.a$a, reason: collision with other inner class name */
    public static final class C0336a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f18653a;

        /* renamed from: b, reason: collision with root package name */
        public int f18654b;

        public C0336a(T9.a<? super C0336a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18653a = obj;
            this.f18654b |= Integer.MIN_VALUE;
            return a.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.sumsub.sns.internal.core.common.o0 r6, android.graphics.Bitmap r7, T9.a<? super java.lang.Integer> r8) {
        /*
            boolean r0 = r8 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.a.C0336a
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.presentation.screen.preview.photo.a$a r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.a.C0336a) r0
            int r1 = r0.f18654b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18654b = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.a$a r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18653a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18654b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.b.b(r8)
            r0.f18654b = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            float r7 = (float) r6
            r8 = 90
            float r0 = (float) r8
            float r7 = r7 / r0
            int r7 = U4.b.C(r7)
            int r7 = r7 * r8
            com.sumsub.sns.internal.camera.photo.presentation.document.b r0 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Face rotation: "
            r8.<init>(r1)
            r8.append(r6)
            r6 = 32
            r8.append(r6)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "DocCapture"
            r3 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r0, r1, r2, r3, r4, r5)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.a.b(com.sumsub.sns.internal.core.common.o0, android.graphics.Bitmap, T9.a):java.lang.Object");
    }

    public static final String b(n nVar) {
        File m2 = nVar.m();
        if (m2 != null) {
            return m2.getAbsolutePath();
        }
        return null;
    }

    public static final Map<String, Object> b(n.b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", Integer.valueOf(bVar.c()));
        linkedHashMap.put("fileSize", Long.valueOf(bVar.d()));
        return linkedHashMap;
    }

    public static final Map<String, Object> b(b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m2 = bVar.m();
        if (m2 != null) {
            linkedHashMap.put("checkResult", m2);
        }
        String l10 = bVar.l();
        if (l10 != null) {
            linkedHashMap.put("checkModel", l10);
        }
        Float n10 = bVar.n();
        if (n10 != null) {
            linkedHashMap.put("checkScore", Float.valueOf(n10.floatValue()));
        }
        Long o10 = bVar.o();
        if (o10 != null) {
            linkedHashMap.put("checkTime", Long.valueOf(o10.longValue()));
        }
        Float q10 = bVar.q();
        if (q10 != null) {
            linkedHashMap.put("checkLowThreshold", Float.valueOf(q10.floatValue()));
        }
        Float p10 = bVar.p();
        if (p10 != null) {
            linkedHashMap.put("checkHighThreshold", Float.valueOf(p10.floatValue()));
        }
        Integer j10 = bVar.j();
        if (j10 != null) {
            linkedHashMap.put("checkBadAttempts", Integer.valueOf(j10.intValue()));
        }
        Integer k3 = bVar.k();
        if (k3 != null) {
            linkedHashMap.put("checkMaxBlockedAttempts", Integer.valueOf(k3.intValue()));
        }
        Boolean r8 = bVar.r();
        if (r8 != null) {
            linkedHashMap.put("isAutocaptured", r8);
        }
        return linkedHashMap;
    }
}
