package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.luminary.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f;

/* compiled from: TransactionPayloadFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class TransactionPayloadFragment$payloadAdapter$1 extends FunctionReferenceImpl implements InterfaceC0635a<p> {
    @Override // ca.InterfaceC0635a
    public final p invoke() {
        String responseBody;
        String requestBody;
        TransactionPayloadFragment transactionPayloadFragment = (TransactionPayloadFragment) this.receiver;
        HttpTransaction value = transactionPayloadFragment.p0().f3655E0.getValue();
        String name = transactionPayloadFragment.o0().name();
        if (f.b(name, "REQUEST")) {
            if (value != null && (requestBody = value.getRequestBody()) != null) {
                transactionPayloadFragment.d(requestBody, transactionPayloadFragment.getString(R.string.chucker_request), transactionPayloadFragment.getString(R.string.chucker_request_copied));
            }
        } else if (f.b(name, "RESPONSE") && value != null && (responseBody = value.getResponseBody()) != null) {
            transactionPayloadFragment.d(responseBody, transactionPayloadFragment.getString(R.string.chucker_response), transactionPayloadFragment.getString(R.string.chucker_response_copied));
        }
        return p.f3034a;
    }
}
