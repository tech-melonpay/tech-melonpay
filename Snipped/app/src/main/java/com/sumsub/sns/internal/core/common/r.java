package com.sumsub.sns.internal.core.common;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class r {
    public static final void a(Fragment fragment, String str) {
        try {
            fragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((str.startsWith("http://") || str.startsWith("https://")) ? str : "https://".concat(str))));
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.a.f17535a.e(i.a(fragment), "Can't open url ".concat(str), e10);
        }
    }
}
