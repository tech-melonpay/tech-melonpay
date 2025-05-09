package S1;

import C.v;
import P9.s;
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import ka.C0969n;

/* compiled from: TransactionCurlCommandSharable.kt */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3360b;

    public /* synthetic */ l(Object obj, int i) {
        this.f3359a = i;
        this.f3360b = obj;
    }

    @Override // S1.k
    public final Ka.f a(Context context) {
        boolean z10;
        switch (this.f3359a) {
            case 0:
                Ka.f fVar = new Ka.f();
                HttpTransaction httpTransaction = (HttpTransaction) this.f3360b;
                fVar.o0("curl -X " + httpTransaction.getMethod());
                List<I1.a> parsedRequestHeaders = httpTransaction.getParsedRequestHeaders();
                if (parsedRequestHeaders != null) {
                    z10 = false;
                    for (I1.a aVar : parsedRequestHeaders) {
                        if ((C0967l.U("Accept-Encoding", aVar.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), true) && C0969n.Y("gzip", aVar.getValue(), true)) || C0969n.Y("br", aVar.getValue(), true)) {
                            z10 = true;
                        }
                        fVar.o0(s3.b.l(" -H \"", aVar.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), ": ", C0967l.X(aVar.getValue(), "\"", "\\\"", false), "\""));
                    }
                } else {
                    z10 = false;
                }
                String requestBody = httpTransaction.getRequestBody();
                if (requestBody != null && requestBody.length() != 0) {
                    fVar.o0(" --data $'" + C0967l.X(requestBody, "\n", "\\n", false) + "'");
                }
                String str = z10 ? " --compressed " : " ";
                fVar.o0(str + httpTransaction.getFormattedUrl(false));
                return fVar;
            case 1:
                Ka.f fVar2 = new Ka.f();
                fVar2.o0(((String) this.f3360b) + "\n");
                return fVar2;
            default:
                Ka.f fVar3 = new Ka.f();
                fVar3.o0(s.P((ArrayList) this.f3360b, androidx.camera.core.n.a("\n", context.getString(R.string.chucker_export_separator), "\n"), v.n(context.getString(R.string.chucker_export_prefix), "\n"), androidx.camera.core.n.a("\n", context.getString(R.string.chucker_export_postfix), "\n"), new C7.a(context, 9), 24));
                return fVar3;
        }
    }

    public l(List list) {
        this.f3359a = 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(P9.n.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new m((HttpTransaction) it.next(), false));
        }
        this.f3360b = arrayList;
    }
}
