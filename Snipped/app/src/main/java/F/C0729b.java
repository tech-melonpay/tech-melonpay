package f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC0728a;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729b extends AbstractC0728a<String, Uri> {

    /* renamed from: b, reason: collision with root package name */
    public final String f20574b;

    public C0729b(String str) {
        this.f20574b = str;
    }

    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, String str) {
        return new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f20574b).putExtra("android.intent.extra.TITLE", str);
    }

    @Override // f.AbstractC0728a
    public final /* bridge */ /* synthetic */ AbstractC0728a.C0395a<Uri> getSynchronousResult(Context context, String str) {
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
