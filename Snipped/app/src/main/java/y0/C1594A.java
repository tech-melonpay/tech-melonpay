package y0;

import android.text.TextUtils;
import android.view.View;
import y0.C1596C;

/* compiled from: ViewCompat.java */
/* renamed from: y0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1594A extends C1596C.b<CharSequence> {
    @Override // y0.C1596C.b
    public final CharSequence a(View view) {
        return C1596C.h.a(view);
    }

    @Override // y0.C1596C.b
    public final void b(View view, CharSequence charSequence) {
        C1596C.h.e(view, charSequence);
    }

    @Override // y0.C1596C.b
    public final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
