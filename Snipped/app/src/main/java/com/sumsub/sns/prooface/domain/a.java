package com.sumsub.sns.prooface.domain;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20248a = new a();

    public final Pair<Integer, Float> a(Bitmap bitmap) {
        try {
            return new Pair<>(Integer.valueOf(Bitmap.createScaledBitmap(bitmap, 1, 1, false).getPixel(0, 0)), Float.valueOf(200 * ((float) (((Color.blue(r13) / 255.0d) * 0.0722d) + ((Color.green(r13) / 255.0d) * 0.7152d) + ((Color.red(r13) / 255.0d) * 0.2126d)))));
        } catch (Exception unused) {
            return new Pair<>(0, Float.valueOf(0.0f));
        }
    }
}
