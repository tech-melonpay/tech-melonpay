package com.chuckerteam.chucker.internal.support;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BitmapUtils.kt */
/* loaded from: classes.dex */
public final class BitmapUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f8624a = new Paint(2);

    public static final Object a(Bitmap bitmap, T9.a<? super Double> aVar) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new BitmapUtilsKt$calculateLuminance$2(bitmap, -65281, null), aVar);
    }
}
