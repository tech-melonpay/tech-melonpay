package R1;

import androidx.room.EntityDeletionOrUpdateAdapter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import d1.g;

/* compiled from: HttpTransactionDao_Impl.java */
/* loaded from: classes.dex */
public final class c extends EntityDeletionOrUpdateAdapter<HttpTransaction> {
    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(g gVar, HttpTransaction httpTransaction) {
        HttpTransaction httpTransaction2 = httpTransaction;
        gVar.bindLong(1, httpTransaction2.getId());
        if (httpTransaction2.getRequestDate() == null) {
            gVar.bindNull(2);
        } else {
            gVar.bindLong(2, httpTransaction2.getRequestDate().longValue());
        }
        if (httpTransaction2.getResponseDate() == null) {
            gVar.bindNull(3);
        } else {
            gVar.bindLong(3, httpTransaction2.getResponseDate().longValue());
        }
        if (httpTransaction2.getTookMs() == null) {
            gVar.bindNull(4);
        } else {
            gVar.bindLong(4, httpTransaction2.getTookMs().longValue());
        }
        if (httpTransaction2.getProtocol() == null) {
            gVar.bindNull(5);
        } else {
            gVar.bindString(5, httpTransaction2.getProtocol());
        }
        if (httpTransaction2.getMethod() == null) {
            gVar.bindNull(6);
        } else {
            gVar.bindString(6, httpTransaction2.getMethod());
        }
        if (httpTransaction2.getUrl() == null) {
            gVar.bindNull(7);
        } else {
            gVar.bindString(7, httpTransaction2.getUrl());
        }
        if (httpTransaction2.getHost() == null) {
            gVar.bindNull(8);
        } else {
            gVar.bindString(8, httpTransaction2.getHost());
        }
        if (httpTransaction2.getPath() == null) {
            gVar.bindNull(9);
        } else {
            gVar.bindString(9, httpTransaction2.getPath());
        }
        if (httpTransaction2.getScheme() == null) {
            gVar.bindNull(10);
        } else {
            gVar.bindString(10, httpTransaction2.getScheme());
        }
        if (httpTransaction2.getResponseTlsVersion() == null) {
            gVar.bindNull(11);
        } else {
            gVar.bindString(11, httpTransaction2.getResponseTlsVersion());
        }
        if (httpTransaction2.getResponseCipherSuite() == null) {
            gVar.bindNull(12);
        } else {
            gVar.bindString(12, httpTransaction2.getResponseCipherSuite());
        }
        if (httpTransaction2.getRequestPayloadSize() == null) {
            gVar.bindNull(13);
        } else {
            gVar.bindLong(13, httpTransaction2.getRequestPayloadSize().longValue());
        }
        if (httpTransaction2.getRequestContentType() == null) {
            gVar.bindNull(14);
        } else {
            gVar.bindString(14, httpTransaction2.getRequestContentType());
        }
        if (httpTransaction2.getRequestHeaders() == null) {
            gVar.bindNull(15);
        } else {
            gVar.bindString(15, httpTransaction2.getRequestHeaders());
        }
        if (httpTransaction2.getRequestHeadersSize() == null) {
            gVar.bindNull(16);
        } else {
            gVar.bindLong(16, httpTransaction2.getRequestHeadersSize().longValue());
        }
        if (httpTransaction2.getRequestBody() == null) {
            gVar.bindNull(17);
        } else {
            gVar.bindString(17, httpTransaction2.getRequestBody());
        }
        gVar.bindLong(18, httpTransaction2.getIsRequestBodyEncoded() ? 1L : 0L);
        if (httpTransaction2.getResponseCode() == null) {
            gVar.bindNull(19);
        } else {
            gVar.bindLong(19, httpTransaction2.getResponseCode().intValue());
        }
        if (httpTransaction2.getResponseMessage() == null) {
            gVar.bindNull(20);
        } else {
            gVar.bindString(20, httpTransaction2.getResponseMessage());
        }
        if (httpTransaction2.getError() == null) {
            gVar.bindNull(21);
        } else {
            gVar.bindString(21, httpTransaction2.getError());
        }
        if (httpTransaction2.getResponsePayloadSize() == null) {
            gVar.bindNull(22);
        } else {
            gVar.bindLong(22, httpTransaction2.getResponsePayloadSize().longValue());
        }
        if (httpTransaction2.getResponseContentType() == null) {
            gVar.bindNull(23);
        } else {
            gVar.bindString(23, httpTransaction2.getResponseContentType());
        }
        if (httpTransaction2.getResponseHeaders() == null) {
            gVar.bindNull(24);
        } else {
            gVar.bindString(24, httpTransaction2.getResponseHeaders());
        }
        if (httpTransaction2.getResponseHeadersSize() == null) {
            gVar.bindNull(25);
        } else {
            gVar.bindLong(25, httpTransaction2.getResponseHeadersSize().longValue());
        }
        if (httpTransaction2.getResponseBody() == null) {
            gVar.bindNull(26);
        } else {
            gVar.bindString(26, httpTransaction2.getResponseBody());
        }
        gVar.bindLong(27, httpTransaction2.getIsResponseBodyEncoded() ? 1L : 0L);
        if (httpTransaction2.getResponseImageData() == null) {
            gVar.bindNull(28);
        } else {
            gVar.bindBlob(28, httpTransaction2.getResponseImageData());
        }
        gVar.bindLong(29, httpTransaction2.getGraphQlDetected() ? 1L : 0L);
        if (httpTransaction2.getGraphQlOperationName() == null) {
            gVar.bindNull(30);
        } else {
            gVar.bindString(30, httpTransaction2.getGraphQlOperationName());
        }
        gVar.bindLong(31, httpTransaction2.getId());
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestHeadersSize` = ?,`requestBody` = ?,`isRequestBodyEncoded` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseHeadersSize` = ?,`responseBody` = ?,`isResponseBodyEncoded` = ?,`responseImageData` = ?,`graphQlDetected` = ?,`graphQlOperationName` = ? WHERE `id` = ?";
    }
}
