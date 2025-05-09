package B1;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class e extends EntityInsertionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RoomDatabase roomDatabase, int i) {
        super(roomDatabase);
        this.f227a = i;
    }

    @Override // androidx.room.EntityInsertionAdapter
    public final void bind(d1.g gVar, Object obj) {
        switch (this.f227a) {
            case 0:
                d dVar = (d) obj;
                String str = dVar.f225a;
                if (str == null) {
                    gVar.bindNull(1);
                } else {
                    gVar.bindString(1, str);
                }
                Long l10 = dVar.f226b;
                if (l10 != null) {
                    gVar.bindLong(2, l10.longValue());
                    break;
                } else {
                    gVar.bindNull(2);
                    break;
                }
            default:
                HttpTransaction httpTransaction = (HttpTransaction) obj;
                gVar.bindLong(1, httpTransaction.getId());
                if (httpTransaction.getRequestDate() == null) {
                    gVar.bindNull(2);
                } else {
                    gVar.bindLong(2, httpTransaction.getRequestDate().longValue());
                }
                if (httpTransaction.getResponseDate() == null) {
                    gVar.bindNull(3);
                } else {
                    gVar.bindLong(3, httpTransaction.getResponseDate().longValue());
                }
                if (httpTransaction.getTookMs() == null) {
                    gVar.bindNull(4);
                } else {
                    gVar.bindLong(4, httpTransaction.getTookMs().longValue());
                }
                if (httpTransaction.getProtocol() == null) {
                    gVar.bindNull(5);
                } else {
                    gVar.bindString(5, httpTransaction.getProtocol());
                }
                if (httpTransaction.getMethod() == null) {
                    gVar.bindNull(6);
                } else {
                    gVar.bindString(6, httpTransaction.getMethod());
                }
                if (httpTransaction.getUrl() == null) {
                    gVar.bindNull(7);
                } else {
                    gVar.bindString(7, httpTransaction.getUrl());
                }
                if (httpTransaction.getHost() == null) {
                    gVar.bindNull(8);
                } else {
                    gVar.bindString(8, httpTransaction.getHost());
                }
                if (httpTransaction.getPath() == null) {
                    gVar.bindNull(9);
                } else {
                    gVar.bindString(9, httpTransaction.getPath());
                }
                if (httpTransaction.getScheme() == null) {
                    gVar.bindNull(10);
                } else {
                    gVar.bindString(10, httpTransaction.getScheme());
                }
                if (httpTransaction.getResponseTlsVersion() == null) {
                    gVar.bindNull(11);
                } else {
                    gVar.bindString(11, httpTransaction.getResponseTlsVersion());
                }
                if (httpTransaction.getResponseCipherSuite() == null) {
                    gVar.bindNull(12);
                } else {
                    gVar.bindString(12, httpTransaction.getResponseCipherSuite());
                }
                if (httpTransaction.getRequestPayloadSize() == null) {
                    gVar.bindNull(13);
                } else {
                    gVar.bindLong(13, httpTransaction.getRequestPayloadSize().longValue());
                }
                if (httpTransaction.getRequestContentType() == null) {
                    gVar.bindNull(14);
                } else {
                    gVar.bindString(14, httpTransaction.getRequestContentType());
                }
                if (httpTransaction.getRequestHeaders() == null) {
                    gVar.bindNull(15);
                } else {
                    gVar.bindString(15, httpTransaction.getRequestHeaders());
                }
                if (httpTransaction.getRequestHeadersSize() == null) {
                    gVar.bindNull(16);
                } else {
                    gVar.bindLong(16, httpTransaction.getRequestHeadersSize().longValue());
                }
                if (httpTransaction.getRequestBody() == null) {
                    gVar.bindNull(17);
                } else {
                    gVar.bindString(17, httpTransaction.getRequestBody());
                }
                gVar.bindLong(18, httpTransaction.getIsRequestBodyEncoded() ? 1L : 0L);
                if (httpTransaction.getResponseCode() == null) {
                    gVar.bindNull(19);
                } else {
                    gVar.bindLong(19, httpTransaction.getResponseCode().intValue());
                }
                if (httpTransaction.getResponseMessage() == null) {
                    gVar.bindNull(20);
                } else {
                    gVar.bindString(20, httpTransaction.getResponseMessage());
                }
                if (httpTransaction.getError() == null) {
                    gVar.bindNull(21);
                } else {
                    gVar.bindString(21, httpTransaction.getError());
                }
                if (httpTransaction.getResponsePayloadSize() == null) {
                    gVar.bindNull(22);
                } else {
                    gVar.bindLong(22, httpTransaction.getResponsePayloadSize().longValue());
                }
                if (httpTransaction.getResponseContentType() == null) {
                    gVar.bindNull(23);
                } else {
                    gVar.bindString(23, httpTransaction.getResponseContentType());
                }
                if (httpTransaction.getResponseHeaders() == null) {
                    gVar.bindNull(24);
                } else {
                    gVar.bindString(24, httpTransaction.getResponseHeaders());
                }
                if (httpTransaction.getResponseHeadersSize() == null) {
                    gVar.bindNull(25);
                } else {
                    gVar.bindLong(25, httpTransaction.getResponseHeadersSize().longValue());
                }
                if (httpTransaction.getResponseBody() == null) {
                    gVar.bindNull(26);
                } else {
                    gVar.bindString(26, httpTransaction.getResponseBody());
                }
                gVar.bindLong(27, httpTransaction.getIsResponseBodyEncoded() ? 1L : 0L);
                if (httpTransaction.getResponseImageData() == null) {
                    gVar.bindNull(28);
                } else {
                    gVar.bindBlob(28, httpTransaction.getResponseImageData());
                }
                gVar.bindLong(29, httpTransaction.getGraphQlDetected() ? 1L : 0L);
                if (httpTransaction.getGraphQlOperationName() != null) {
                    gVar.bindString(30, httpTransaction.getGraphQlOperationName());
                    break;
                } else {
                    gVar.bindNull(30);
                    break;
                }
        }
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        switch (this.f227a) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            default:
                return "INSERT OR ABORT INTO `transactions` (`id`,`requestDate`,`responseDate`,`tookMs`,`protocol`,`method`,`url`,`host`,`path`,`scheme`,`responseTlsVersion`,`responseCipherSuite`,`requestPayloadSize`,`requestContentType`,`requestHeaders`,`requestHeadersSize`,`requestBody`,`isRequestBodyEncoded`,`responseCode`,`responseMessage`,`error`,`responsePayloadSize`,`responseContentType`,`responseHeaders`,`responseHeadersSize`,`responseBody`,`isResponseBodyEncoded`,`responseImageData`,`graphQlDetected`,`graphQlOperationName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
