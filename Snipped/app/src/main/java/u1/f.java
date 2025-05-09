package U1;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import com.luminary.mobile.R;

/* compiled from: TransactionPagerAdapter.kt */
/* loaded from: classes.dex */
public final class f extends u {
    public final String[] i;

    public f(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.i = new String[]{context.getString(R.string.chucker_overview), context.getString(R.string.chucker_request), context.getString(R.string.chucker_response)};
    }

    @Override // o1.AbstractC1086a
    public final int c() {
        return this.i.length;
    }

    @Override // o1.AbstractC1086a
    public final CharSequence d(int i) {
        return this.i[i];
    }
}
