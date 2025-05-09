package f;

import android.content.Context;
import android.content.Intent;
import f.AbstractC0728a;
import k0.C0913a;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class g extends AbstractC0728a<String, Boolean> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, String str) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
    }

    @Override // f.AbstractC0728a
    public final AbstractC0728a.C0395a<Boolean> getSynchronousResult(Context context, String str) {
        if (C0913a.checkSelfPermission(context, str) == 0) {
            return new AbstractC0728a.C0395a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // f.AbstractC0728a
    public final Boolean parseResult(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (intArrayExtra[i9] == 0) {
                    z10 = true;
                    break;
                }
                i9++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
