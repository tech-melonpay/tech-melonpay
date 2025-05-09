package R1;

import androidx.lifecycle.AbstractC0557x;
import androidx.room.Dao;
import androidx.room.Query;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;

/* compiled from: HttpTransactionDao.kt */
@Dao
/* loaded from: classes.dex */
public interface a {
    @Query("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE :codeQuery AND (path LIKE :pathQuery OR graphQlOperationName LIKE :graphQlQuery) ORDER BY requestDate DESC")
    AbstractC0557x<List<com.chuckerteam.chucker.internal.data.entity.a>> a(String str, String str2, String str3);

    @Query("SELECT * FROM transactions")
    Object b(T9.a<? super List<HttpTransaction>> aVar);

    @Query("SELECT * FROM transactions WHERE id = :id")
    AbstractC0557x<HttpTransaction> c(long j10);

    @Query("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC")
    AbstractC0557x<List<com.chuckerteam.chucker.internal.data.entity.a>> d();

    @Query("DELETE FROM transactions")
    Object e(T9.a<? super Integer> aVar);
}
