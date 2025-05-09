package U1;

import C.N;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.A;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionOverviewFragment;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import kotlin.Pair;
import t.C1262n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3638b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3637a = i;
        this.f3638b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        Object obj2 = this.f3638b;
        switch (this.f3637a) {
            case 0:
                String str = (String) obj;
                N n10 = ((TransactionActivity) obj2).f8715j;
                ((TextView) (n10 != null ? n10 : null).f535b).setText(str);
                break;
            case 1:
                int i = TransactionActivity.f8714k;
                ((MenuItem) obj2).setIcon(((Boolean) obj).booleanValue() ? R.drawable.chucker_ic_encoded_url_white : R.drawable.chucker_ic_decoded_url_white);
                break;
            case 2:
                ((Menu) obj2).findItem(R.id.encode_url).setVisible(((Boolean) obj).booleanValue());
                break;
            case 3:
                Pair pair = (Pair) obj;
                HttpTransaction httpTransaction = (HttpTransaction) pair.f23089a;
                boolean booleanValue = ((Boolean) pair.f23090b).booleanValue();
                H1.b bVar = ((TransactionOverviewFragment) obj2).f8734g0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.f1437q.setText(httpTransaction != null ? httpTransaction.getFormattedUrl(booleanValue) : null);
                bVar.f1425d.setText(httpTransaction != null ? httpTransaction.getMethod() : null);
                bVar.f1426e.setText(httpTransaction != null ? httpTransaction.getProtocol() : null);
                bVar.f1433m.setText(String.valueOf(httpTransaction != null ? httpTransaction.getStatus() : null));
                bVar.f1429h.setText(httpTransaction != null ? httpTransaction.getResponseSummaryText() : null);
                Boolean valueOf = httpTransaction != null ? Boolean.valueOf(httpTransaction.isSsl()) : null;
                Group group = bVar.f1431k;
                if (valueOf == null) {
                    group.setVisibility(8);
                } else {
                    boolean b9 = kotlin.jvm.internal.f.b(valueOf, Boolean.TRUE);
                    TextView textView = bVar.f1432l;
                    if (b9) {
                        group.setVisibility(0);
                        textView.setText(R.string.chucker_yes);
                    } else {
                        group.setVisibility(0);
                        textView.setText(R.string.chucker_no);
                    }
                }
                if ((httpTransaction != null ? httpTransaction.getResponseTlsVersion() : null) != null) {
                    bVar.f1435o.setText(httpTransaction.getResponseTlsVersion());
                    bVar.f1434n.setVisibility(0);
                }
                if ((httpTransaction != null ? httpTransaction.getResponseCipherSuite() : null) != null) {
                    bVar.f1423b.setText(httpTransaction.getResponseCipherSuite());
                    bVar.f1422a.setVisibility(0);
                }
                bVar.f1428g.setText(httpTransaction != null ? httpTransaction.getRequestDateString() : null);
                bVar.f1430j.setText(httpTransaction != null ? httpTransaction.getResponseDateString() : null);
                bVar.f1424c.setText(httpTransaction != null ? httpTransaction.getDurationString() : null);
                bVar.f1427f.setText(httpTransaction != null ? httpTransaction.getRequestSizeString() : null);
                bVar.i.setText(httpTransaction != null ? httpTransaction.getResponseSizeString() : null);
                bVar.f1436p.setText(httpTransaction != null ? httpTransaction.getTotalSizeString() : null);
                break;
            case 4:
                CameraX.a((CameraX) obj2, (PreviewView.StreamState) obj);
                break;
            default:
                ((C1262n.a) obj2).setValue(obj);
                break;
        }
    }
}
