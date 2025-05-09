package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC0728a;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class i extends AbstractC0728a<Uri, Boolean> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, Uri uri) {
        return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
    }

    @Override // f.AbstractC0728a
    public final /* bridge */ /* synthetic */ AbstractC0728a.C0395a<Boolean> getSynchronousResult(Context context, Uri uri) {
        return null;
    }

    @Override // f.AbstractC0728a
    public final Boolean parseResult(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
