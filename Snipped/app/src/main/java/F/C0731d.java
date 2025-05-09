package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC0728a;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731d extends AbstractC0728a<String[], Uri> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
    }

    @Override // f.AbstractC0728a
    public final /* bridge */ /* synthetic */ AbstractC0728a.C0395a<Uri> getSynchronousResult(Context context, String[] strArr) {
        return null;
    }

    @Override // f.AbstractC0728a
    public final Uri parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
