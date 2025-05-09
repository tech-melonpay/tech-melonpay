package f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class h extends AbstractC0728a<Intent, ActivityResult> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, Intent intent) {
        return intent;
    }

    @Override // f.AbstractC0728a
    public final ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
