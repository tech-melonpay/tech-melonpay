package U1;

import android.view.MenuItem;
import android.widget.Toast;
import androidx.camera.core.impl.j;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.transaction.PayloadType;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3640b;

    public /* synthetic */ c(Object obj, int i) {
        this.f3639a = i;
        this.f3640b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        PayloadType o02;
        Object obj = this.f3640b;
        switch (this.f3639a) {
            case 0:
                int i = TransactionActivity.f8714k;
                ((TransactionActivity) obj).s().f3657k.setValue(Boolean.valueOf(!((Boolean) r0.f3658p.getValue()).booleanValue()));
                break;
            default:
                TransactionPayloadFragment transactionPayloadFragment = (TransactionPayloadFragment) obj;
                HttpTransaction value = transactionPayloadFragment.p0().f3655E0.getValue();
                if (value != null && (((o02 = transactionPayloadFragment.o0()) == PayloadType.f8711a && value.getRequestBody() == null) || (o02 == PayloadType.f8712b && value.getResponseBody() == null))) {
                    Toast.makeText(transactionPayloadFragment.getActivity(), R.string.chucker_file_not_saved_body_is_empty, 0).show();
                    break;
                } else {
                    transactionPayloadFragment.f8739h0.a(j.a("chucker-export-", System.currentTimeMillis()));
                    break;
                }
        }
        return true;
    }
}
