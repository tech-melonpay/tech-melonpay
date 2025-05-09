package ya;

import com.google.firebase.messaging.ServiceStarter;
import java.util.Arrays;

/* compiled from: TaskLogger.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final void a(AbstractC1633a abstractC1633a, c cVar, String str) {
        d.i.fine(cVar.f31184b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC1633a.f31179a);
    }

    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ServiceStarter.ERROR_UNKNOWN) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ServiceStarter.ERROR_UNKNOWN) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }
}
