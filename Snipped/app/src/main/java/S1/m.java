package S1;

import P9.s;
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.luminary.mobile.R;
import java.util.List;
import ka.C0969n;

/* compiled from: TransactionDetailsSharable.kt */
/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final HttpTransaction f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3362b;

    public m(HttpTransaction httpTransaction, boolean z10) {
        this.f3361a = httpTransaction;
        this.f3362b = z10;
    }

    @Override // S1.k
    public final Ka.f a(Context context) {
        String str;
        String string;
        String string2;
        String P4;
        Ka.f fVar = new Ka.f();
        String string3 = context.getString(R.string.chucker_url);
        HttpTransaction httpTransaction = this.f3361a;
        fVar.o0(string3 + ": " + httpTransaction.getFormattedUrl(this.f3362b) + "\n");
        fVar.o0(context.getString(R.string.chucker_method) + ": " + httpTransaction.getMethod() + "\n");
        fVar.o0(context.getString(R.string.chucker_protocol) + ": " + httpTransaction.getProtocol() + "\n");
        fVar.o0(context.getString(R.string.chucker_status) + ": " + httpTransaction.getStatus() + "\n");
        fVar.o0(context.getString(R.string.chucker_response) + ": " + httpTransaction.getResponseSummaryText() + "\n");
        int i = httpTransaction.isSsl() ? R.string.chucker_yes : R.string.chucker_no;
        fVar.o0(context.getString(R.string.chucker_ssl) + ": " + context.getString(i) + "\n");
        fVar.n0(0, 1, "\n");
        fVar.o0(context.getString(R.string.chucker_request_time) + ": " + httpTransaction.getRequestDateString() + "\n");
        fVar.o0(context.getString(R.string.chucker_response_time) + ": " + httpTransaction.getResponseDateString() + "\n");
        fVar.o0(context.getString(R.string.chucker_duration) + ": " + httpTransaction.getDurationString() + "\n");
        fVar.n0(0, 1, "\n");
        fVar.o0(context.getString(R.string.chucker_request_size) + ": " + httpTransaction.getRequestSizeString() + "\n");
        fVar.o0(context.getString(R.string.chucker_response_size) + ": " + httpTransaction.getResponseSizeString() + "\n");
        fVar.o0(context.getString(R.string.chucker_total_size) + ": " + httpTransaction.getTotalSizeString() + "\n");
        fVar.n0(0, 1, "\n");
        fVar.o0("---------- " + context.getString(R.string.chucker_request) + " ----------\n\n");
        List<I1.a> parsedRequestHeaders = httpTransaction.getParsedRequestHeaders();
        String str2 = "";
        if (parsedRequestHeaders == null || (str = s.P(parsedRequestHeaders, "", null, null, new e(false), 30)) == null) {
            str = "";
        }
        if (!C0969n.i0(str)) {
            fVar.n0(0, str.length(), str);
            fVar.n0(0, 1, "\n");
        }
        String requestBody = httpTransaction.getRequestBody();
        int i9 = R.string.chucker_body_empty;
        if (requestBody == null || C0969n.i0(requestBody)) {
            string = context.getString(httpTransaction.getIsResponseBodyEncoded() ? R.string.chucker_body_omitted : R.string.chucker_body_empty);
        } else {
            string = httpTransaction.getFormattedRequestBody();
        }
        fVar.o0(string);
        fVar.n0(0, 2, "\n\n");
        fVar.o0("---------- " + context.getString(R.string.chucker_response) + " ----------\n\n");
        List<I1.a> parsedResponseHeaders = httpTransaction.getParsedResponseHeaders();
        if (parsedResponseHeaders != null && (P4 = s.P(parsedResponseHeaders, "", null, null, new e(false), 30)) != null) {
            str2 = P4;
        }
        if (!C0969n.i0(str2)) {
            fVar.n0(0, str2.length(), str2);
            fVar.n0(0, 1, "\n");
        }
        String responseBody = httpTransaction.getResponseBody();
        if (responseBody == null || C0969n.i0(responseBody)) {
            if (httpTransaction.getIsResponseBodyEncoded()) {
                i9 = R.string.chucker_body_omitted;
            }
            string2 = context.getString(i9);
        } else {
            string2 = httpTransaction.getFormattedResponseBody();
        }
        fVar.o0(string2);
        return fVar;
    }
}
