package c9;

import Y8.b;
import android.text.TextUtils;
import c9.C0632c;
import d9.C0699b;

/* compiled from: ImageSizeParserImpl.java */
/* renamed from: c9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0633d implements C0632c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Y8.b f8601a;

    public C0633d(b.a aVar) {
        this.f8601a = aVar;
    }

    public static C0699b.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i = length - 1;
        int i9 = i;
        while (i9 > -1) {
            if (Character.isDigit(str.charAt(i9))) {
                int i10 = i9 + 1;
                try {
                    return new C0699b.a(i9 == i ? null : str.substring(i10, length), Float.parseFloat(str.substring(0, i10)));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            i9--;
        }
        return null;
    }
}
