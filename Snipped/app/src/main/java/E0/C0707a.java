package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707a {
    public static String a(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return com.google.android.gms.measurement.internal.a.g(i, "?");
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
