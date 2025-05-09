package com.chuckerteam.chucker.internal.data.entity;

import P9.s;
import S1.e;
import S1.f;
import S1.g;
import U4.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import ka.C0967l;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.h;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

/* compiled from: HttpTransaction.kt */
@Entity(tableName = "transactions")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002»\u0001B³\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u0015\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&B\t\b\u0017¢\u0006\u0004\b%\u0010'J\u0015\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u001b\u0010+\u001a\u00020*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b+\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b0\u0010,J\u0015\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\u0004\b3\u00102J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b7\u0010,J\u001b\u00107\u001a\u00020*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b7\u0010/J\u0015\u00108\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0015¢\u0006\u0004\b8\u00106J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0007¢\u0006\u0004\b@\u0010:J\u0017\u0010A\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bA\u0010?J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0015¢\u0006\u0004\bG\u00106J\u0015\u0010H\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0015¢\u0006\u0004\bH\u00106J\r\u0010I\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0002¢\u0006\u0004\bK\u0010JJ\r\u0010L\u001a\u00020\u0002¢\u0006\u0004\bL\u0010JJ\u0017\u0010N\u001a\u00020\u00152\b\u0010M\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bP\u0010QJ!\u0010T\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00072\b\u0010S\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\bT\u0010UJ+\u0010V\u001a\u00020=2\u0006\u0010R\u001a\u00020=2\b\u0010S\u001a\u0004\u0018\u00010\u00072\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010J\"\u0004\b]\u0010^R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010_\u001a\u0004\bd\u0010a\"\u0004\be\u0010cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010h\u001a\u0004\bi\u0010:\"\u0004\bj\u0010kR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010h\u001a\u0004\bl\u0010:\"\u0004\bm\u0010kR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010h\u001a\u0004\bn\u0010:\"\u0004\bo\u0010kR$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010h\u001a\u0004\bp\u0010:\"\u0004\bq\u0010kR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010h\u001a\u0004\br\u0010:\"\u0004\bs\u0010kR$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010h\u001a\u0004\bt\u0010:\"\u0004\bu\u0010kR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010h\u001a\u0004\bv\u0010:\"\u0004\bw\u0010kR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010h\u001a\u0004\bx\u0010:\"\u0004\by\u0010kR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010_\u001a\u0004\bz\u0010a\"\u0004\b{\u0010cR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010h\u001a\u0004\b|\u0010:\"\u0004\b}\u0010kR$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010h\u001a\u0004\b~\u0010:\"\u0004\b+\u0010kR%\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u0013\u0010_\u001a\u0004\b\u007f\u0010a\"\u0005\b\u0080\u0001\u0010cR&\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u0014\u0010h\u001a\u0005\b\u0081\u0001\u0010:\"\u0005\b\u0082\u0001\u0010kR&\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0016\u0010\u0083\u0001\u001a\u0005\b\u0016\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b\u0018\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u0019\u0010h\u001a\u0005\b\u008c\u0001\u0010:\"\u0005\b\u008d\u0001\u0010kR&\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001a\u0010h\u001a\u0005\b\u008e\u0001\u0010:\"\u0005\b\u008f\u0001\u0010kR&\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010_\u001a\u0005\b\u0090\u0001\u0010a\"\u0005\b\u0091\u0001\u0010cR&\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001c\u0010h\u001a\u0005\b\u0092\u0001\u0010:\"\u0005\b\u0093\u0001\u0010kR%\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u001d\u0010h\u001a\u0005\b\u0094\u0001\u0010:\"\u0004\b7\u0010kR&\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001e\u0010_\u001a\u0005\b\u0095\u0001\u0010a\"\u0005\b\u0096\u0001\u0010cR&\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001f\u0010h\u001a\u0005\b\u0097\u0001\u0010:\"\u0005\b\u0098\u0001\u0010kR&\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b \u0010\u0083\u0001\u001a\u0005\b \u0010\u0084\u0001\"\u0006\b\u0099\u0001\u0010\u0086\u0001R)\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b\"\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b#\u0010\u0083\u0001\u001a\u0006\b\u009f\u0001\u0010\u0084\u0001\"\u0006\b \u0001\u0010\u0086\u0001R%\u0010$\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b$\u0010h\u001a\u0005\b¡\u0001\u0010:\"\u0004\b0\u0010kR\u0015\u0010¥\u0001\u001a\u00030¢\u00018F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010§\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010:R\u0015\u0010©\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010:R\u0015\u0010«\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010:R\u0013\u0010\u00ad\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010:R\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010:R\u0013\u0010±\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010:R\u0015\u0010³\u0001\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010:R\u0013\u0010µ\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010:R\u0014\u0010¶\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¶\u0001\u0010\u0084\u0001R\u0017\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "", "", "id", "requestDate", "responseDate", "tookMs", "", "protocol", FirebaseAnalytics.Param.METHOD, ImagesContract.URL, "host", "path", "scheme", "responseTlsVersion", "responseCipherSuite", "requestPayloadSize", "requestContentType", "requestHeaders", "requestHeadersSize", "requestBody", "", "isRequestBodyEncoded", "", "responseCode", "responseMessage", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "responsePayloadSize", "responseContentType", "responseHeaders", "responseHeadersSize", "responseBody", "isResponseBodyEncoded", "", "responseImageData", "graphQlDetected", "graphQlOperationName", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V", "()V", "Lokhttp3/g;", "headers", "LO9/p;", "setRequestHeaders", "(Lokhttp3/g;)V", "", "LI1/a;", "(Ljava/util/List;)V", "setGraphQlOperationName", "getParsedRequestHeaders", "()Ljava/util/List;", "getParsedResponseHeaders", "withMarkup", "getRequestHeadersString", "(Z)Ljava/lang/String;", "setResponseHeaders", "getResponseHeadersString", "getFormattedRequestBody", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "getSpannedRequestBody", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "getFormattedResponseBody", "getSpannedResponseBody", "Lokhttp3/h;", "httpUrl", "populateUrl", "(Lokhttp3/h;)Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "encode", "getFormattedUrl", "getFormattedPath", "getRequestTotalSize", "()J", "getResponseTotalSize", "getHarResponseBodySize", "other", "hasTheSameContent", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Z", "toHttpHeaderList", "(Lokhttp3/g;)Ljava/util/List;", "body", CMSAttributeTableGenerator.CONTENT_TYPE, "formatBody", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "spanBody", "(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/CharSequence;", "bytes", "formatBytes", "(J)Ljava/lang/String;", "J", "getId", "setId", "(J)V", "Ljava/lang/Long;", "getRequestDate", "()Ljava/lang/Long;", "setRequestDate", "(Ljava/lang/Long;)V", "getResponseDate", "setResponseDate", "getTookMs", "setTookMs", "Ljava/lang/String;", "getProtocol", "setProtocol", "(Ljava/lang/String;)V", "getMethod", "setMethod", "getUrl", "setUrl", "getHost", "setHost", "getPath", "setPath", "getScheme", "setScheme", "getResponseTlsVersion", "setResponseTlsVersion", "getResponseCipherSuite", "setResponseCipherSuite", "getRequestPayloadSize", "setRequestPayloadSize", "getRequestContentType", "setRequestContentType", "getRequestHeaders", "getRequestHeadersSize", "setRequestHeadersSize", "getRequestBody", "setRequestBody", "Z", "()Z", "setRequestBodyEncoded", "(Z)V", "Ljava/lang/Integer;", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "getResponseMessage", "setResponseMessage", "getError", "setError", "getResponsePayloadSize", "setResponsePayloadSize", "getResponseContentType", "setResponseContentType", "getResponseHeaders", "getResponseHeadersSize", "setResponseHeadersSize", "getResponseBody", "setResponseBody", "setResponseBodyEncoded", "[B", "getResponseImageData", "()[B", "setResponseImageData", "([B)V", "getGraphQlDetected", "setGraphQlDetected", "getGraphQlOperationName", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "getStatus", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "status", "getRequestDateString", "requestDateString", "getResponseDateString", "responseDateString", "getDurationString", "durationString", "getRequestSizeString", "requestSizeString", "getResponseSizeString", "responseSizeString", "getTotalSizeString", "totalSizeString", "getResponseSummaryText", "responseSummaryText", "getNotificationText", "notificationText", "isSsl", "Landroid/graphics/Bitmap;", "getResponseImageBitmap", "()Landroid/graphics/Bitmap;", "responseImageBitmap", "Status", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class HttpTransaction {

    @ColumnInfo(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private String error;

    @ColumnInfo(name = "graphQlDetected")
    private boolean graphQlDetected;

    @ColumnInfo(name = "graphQlOperationName")
    private String graphQlOperationName;

    @ColumnInfo(name = "host")
    private String host;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "isRequestBodyEncoded")
    private boolean isRequestBodyEncoded;

    @ColumnInfo(name = "isResponseBodyEncoded")
    private boolean isResponseBodyEncoded;

    @ColumnInfo(name = FirebaseAnalytics.Param.METHOD)
    private String method;

    @ColumnInfo(name = "path")
    private String path;

    @ColumnInfo(name = "protocol")
    private String protocol;

    @ColumnInfo(name = "requestBody")
    private String requestBody;

    @ColumnInfo(name = "requestContentType")
    private String requestContentType;

    @ColumnInfo(name = "requestDate")
    private Long requestDate;

    @ColumnInfo(name = "requestHeaders")
    private String requestHeaders;

    @ColumnInfo(name = "requestHeadersSize")
    private Long requestHeadersSize;

    @ColumnInfo(name = "requestPayloadSize")
    private Long requestPayloadSize;

    @ColumnInfo(name = "responseBody")
    private String responseBody;

    @ColumnInfo(name = "responseCipherSuite")
    private String responseCipherSuite;

    @ColumnInfo(name = "responseCode")
    private Integer responseCode;

    @ColumnInfo(name = "responseContentType")
    private String responseContentType;

    @ColumnInfo(name = "responseDate")
    private Long responseDate;

    @ColumnInfo(name = "responseHeaders")
    private String responseHeaders;

    @ColumnInfo(name = "responseHeadersSize")
    private Long responseHeadersSize;

    @ColumnInfo(name = "responseImageData")
    private byte[] responseImageData;

    @ColumnInfo(name = "responseMessage")
    private String responseMessage;

    @ColumnInfo(name = "responsePayloadSize")
    private Long responsePayloadSize;

    @ColumnInfo(name = "responseTlsVersion")
    private String responseTlsVersion;

    @ColumnInfo(name = "scheme")
    private String scheme;

    @ColumnInfo(name = "tookMs")
    private Long tookMs;

    @ColumnInfo(name = ImagesContract.URL)
    private String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpTransaction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f8604a;

        /* renamed from: b, reason: collision with root package name */
        public static final Status f8605b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f8606c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f8607d;

        static {
            Status status = new Status("Requested", 0);
            f8604a = status;
            Status status2 = new Status("Complete", 1);
            f8605b = status2;
            Status status3 = new Status("Failed", 2);
            f8606c = status3;
            f8607d = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f8607d.clone();
        }
    }

    public HttpTransaction(long j10, Long l10, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l13, String str9, String str10, Long l14, String str11, boolean z10, Integer num, String str12, String str13, Long l15, String str14, String str15, Long l16, String str16, boolean z11, byte[] bArr, boolean z12, String str17) {
        this.id = j10;
        this.requestDate = l10;
        this.responseDate = l11;
        this.tookMs = l12;
        this.protocol = str;
        this.method = str2;
        this.url = str3;
        this.host = str4;
        this.path = str5;
        this.scheme = str6;
        this.responseTlsVersion = str7;
        this.responseCipherSuite = str8;
        this.requestPayloadSize = l13;
        this.requestContentType = str9;
        this.requestHeaders = str10;
        this.requestHeadersSize = l14;
        this.requestBody = str11;
        this.isRequestBodyEncoded = z10;
        this.responseCode = num;
        this.responseMessage = str12;
        this.error = str13;
        this.responsePayloadSize = l15;
        this.responseContentType = str14;
        this.responseHeaders = str15;
        this.responseHeadersSize = l16;
        this.responseBody = str16;
        this.isResponseBodyEncoded = z11;
        this.responseImageData = bArr;
        this.graphQlDetected = z12;
        this.graphQlOperationName = str17;
    }

    private final String formatBody(String body, String contentType) {
        if (contentType == null || C0969n.i0(contentType)) {
            return body;
        }
        if (C0969n.Y(contentType, "json", true)) {
            try {
                return g.a().g(b.u(body));
            } catch (JsonParseException | UnsupportedEncodingException | IOException | IllegalArgumentException | TransformerException | SAXParseException unused) {
                return body;
            }
        }
        if (!C0969n.Y(contentType, "xml", true)) {
            return (!C0969n.Y(contentType, "x-www-form-urlencoded", true) || C0969n.i0(body)) ? body : s.P(C0969n.r0(body, new String[]{"&"}), "\n", null, null, new Q3.a(9), 30);
        }
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setExpandEntityReferences(false);
        DOMSource dOMSource = new DOMSource(newInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(body.getBytes(Charset.defaultCharset())))));
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        TransformerFactory newInstance2 = TransformerFactory.newInstance();
        newInstance2.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        Transformer newTransformer = newInstance2.newTransformer();
        newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(dOMSource, streamResult);
        return stringWriter.toString();
    }

    private final String formatBytes(long bytes) {
        return Ja.a.j(bytes);
    }

    private final CharSequence spanBody(CharSequence body, String contentType, Context context) {
        return (contentType == null || C0969n.i0(contentType)) ? body : (!C0969n.Y(contentType, "json", true) || context == null) ? formatBody(body.toString(), contentType) : new SpanTextUtil(context).a(body);
    }

    private final List<I1.a> toHttpHeaderList(okhttp3.g headers) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new I1.a(headers.c(i), headers.f(i)));
        }
        return arrayList;
    }

    public final String getDurationString() {
        Long l10 = this.tookMs;
        if (l10 == null) {
            return null;
        }
        return l10.longValue() + " ms";
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormattedPath(boolean encode) {
        String str = this.url;
        if (str == null) {
            return "";
        }
        h.a aVar = new h.a();
        aVar.d(null, str);
        return f.a.a(aVar.a(), encode).a();
    }

    public final String getFormattedRequestBody() {
        String formatBody;
        String str = this.requestBody;
        return (str == null || (formatBody = formatBody(str, this.requestContentType)) == null) ? "" : formatBody;
    }

    public final String getFormattedResponseBody() {
        String formatBody;
        String str = this.responseBody;
        return (str == null || (formatBody = formatBody(str, this.responseContentType)) == null) ? "" : formatBody;
    }

    public final String getFormattedUrl(boolean encode) {
        String str = this.url;
        if (str == null) {
            return "";
        }
        h.a aVar = new h.a();
        aVar.d(null, str);
        return f.a.a(aVar.a(), encode).b();
    }

    public final boolean getGraphQlDetected() {
        return this.graphQlDetected;
    }

    public final String getGraphQlOperationName() {
        return this.graphQlOperationName;
    }

    public final long getHarResponseBodySize() {
        Long l10;
        Integer num = this.responseCode;
        if ((num != null && num.intValue() == 304) || (l10 = this.responsePayloadSize) == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final String getHost() {
        return this.host;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNotificationText() {
        int ordinal = getStatus().ordinal();
        if (ordinal == 0) {
            return s3.b.k(" . . .  ", this.method, " ", this.path);
        }
        if (ordinal == 2) {
            return s3.b.k(" ! ! !  ", this.method, " ", this.path);
        }
        return this.responseCode + " " + this.method + " " + this.path;
    }

    public final List<I1.a> getParsedRequestHeaders() {
        return (List) g.a().c(this.requestHeaders, TypeToken.get(TypeToken.getParameterized(List.class, I1.a.class).getType()));
    }

    public final List<I1.a> getParsedResponseHeaders() {
        return (List) g.a().c(this.responseHeaders, TypeToken.get(TypeToken.getParameterized(List.class, I1.a.class).getType()));
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getRequestContentType() {
        return this.requestContentType;
    }

    public final Long getRequestDate() {
        return this.requestDate;
    }

    public final String getRequestDateString() {
        Long l10 = this.requestDate;
        if (l10 != null) {
            return new Date(l10.longValue()).toString();
        }
        return null;
    }

    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Long getRequestHeadersSize() {
        return this.requestHeadersSize;
    }

    public final String getRequestHeadersString(boolean withMarkup) {
        String P4;
        List<I1.a> parsedRequestHeaders = getParsedRequestHeaders();
        return (parsedRequestHeaders == null || (P4 = s.P(parsedRequestHeaders, "", null, null, new e(withMarkup), 30)) == null) ? "" : P4;
    }

    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    public final String getRequestSizeString() {
        Long l10 = this.requestPayloadSize;
        return formatBytes(l10 != null ? l10.longValue() : 0L);
    }

    public final long getRequestTotalSize() {
        Long l10 = this.requestHeadersSize;
        long longValue = l10 != null ? l10.longValue() : 0L;
        Long l11 = this.requestPayloadSize;
        return longValue + (l11 != null ? l11.longValue() : 0L);
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public final Long getResponseDate() {
        return this.responseDate;
    }

    public final String getResponseDateString() {
        Long l10 = this.responseDate;
        if (l10 != null) {
            return new Date(l10.longValue()).toString();
        }
        return null;
    }

    public final String getResponseHeaders() {
        return this.responseHeaders;
    }

    public final Long getResponseHeadersSize() {
        return this.responseHeadersSize;
    }

    public final String getResponseHeadersString(boolean withMarkup) {
        String P4;
        List<I1.a> parsedResponseHeaders = getParsedResponseHeaders();
        return (parsedResponseHeaders == null || (P4 = s.P(parsedResponseHeaders, "", null, null, new e(withMarkup), 30)) == null) ? "" : P4;
    }

    public final Bitmap getResponseImageBitmap() {
        byte[] bArr = this.responseImageData;
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public final String getResponseSizeString() {
        Long l10 = this.responsePayloadSize;
        if (l10 != null) {
            return formatBytes(l10.longValue());
        }
        return null;
    }

    public final String getResponseSummaryText() {
        int ordinal = getStatus().ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 2) {
            return this.error;
        }
        return this.responseCode + " " + this.responseMessage;
    }

    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final long getResponseTotalSize() {
        Long l10 = this.responseHeadersSize;
        return getHarResponseBodySize() + (l10 != null ? l10.longValue() : 0L);
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final CharSequence getSpannedRequestBody(Context context) {
        CharSequence spanBody;
        String str = this.requestBody;
        return (str == null || (spanBody = spanBody(str, this.requestContentType, context)) == null) ? SpannableStringBuilder.valueOf("") : spanBody;
    }

    public final CharSequence getSpannedResponseBody(Context context) {
        CharSequence spanBody;
        String str = this.responseBody;
        return (str == null || (spanBody = spanBody(str, this.responseContentType, context)) == null) ? SpannableStringBuilder.valueOf("") : spanBody;
    }

    public final Status getStatus() {
        return this.error != null ? Status.f8606c : this.responseCode == null ? Status.f8604a : Status.f8605b;
    }

    public final Long getTookMs() {
        return this.tookMs;
    }

    public final String getTotalSizeString() {
        Long l10 = this.requestPayloadSize;
        long longValue = l10 != null ? l10.longValue() : 0L;
        Long l11 = this.responsePayloadSize;
        return formatBytes(longValue + (l11 != null ? l11.longValue() : 0L));
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        if (java.util.Arrays.equals(r2, r3) == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasTheSameContent(com.chuckerteam.chucker.internal.data.entity.HttpTransaction r7) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.entity.HttpTransaction.hasTheSameContent(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):boolean");
    }

    /* renamed from: isRequestBodyEncoded, reason: from getter */
    public final boolean getIsRequestBodyEncoded() {
        return this.isRequestBodyEncoded;
    }

    /* renamed from: isResponseBodyEncoded, reason: from getter */
    public final boolean getIsResponseBodyEncoded() {
        return this.isResponseBodyEncoded;
    }

    public final boolean isSsl() {
        return C0967l.U(this.scheme, "https", true);
    }

    public final HttpTransaction populateUrl(h httpUrl) {
        f a10 = f.a.a(httpUrl, false);
        this.url = a10.b();
        this.host = a10.f3342b;
        this.path = a10.a();
        this.scheme = a10.f3341a;
        return this;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setGraphQlDetected(boolean z10) {
        this.graphQlDetected = z10;
    }

    public final void setGraphQlOperationName(String str) {
        this.graphQlOperationName = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setId(long j10) {
        this.id = j10;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public final void setRequestBodyEncoded(boolean z10) {
        this.isRequestBodyEncoded = z10;
    }

    public final void setRequestContentType(String str) {
        this.requestContentType = str;
    }

    public final void setRequestDate(Long l10) {
        this.requestDate = l10;
    }

    public final void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public final void setRequestHeadersSize(Long l10) {
        this.requestHeadersSize = l10;
    }

    public final void setRequestPayloadSize(Long l10) {
        this.requestPayloadSize = l10;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }

    public final void setResponseBodyEncoded(boolean z10) {
        this.isResponseBodyEncoded = z10;
    }

    public final void setResponseCipherSuite(String str) {
        this.responseCipherSuite = str;
    }

    public final void setResponseCode(Integer num) {
        this.responseCode = num;
    }

    public final void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    public final void setResponseDate(Long l10) {
        this.responseDate = l10;
    }

    public final void setResponseHeaders(String str) {
        this.responseHeaders = str;
    }

    public final void setResponseHeadersSize(Long l10) {
        this.responseHeadersSize = l10;
    }

    public final void setResponseImageData(byte[] bArr) {
        this.responseImageData = bArr;
    }

    public final void setResponseMessage(String str) {
        this.responseMessage = str;
    }

    public final void setResponsePayloadSize(Long l10) {
        this.responsePayloadSize = l10;
    }

    public final void setResponseTlsVersion(String str) {
        this.responseTlsVersion = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setTookMs(Long l10) {
        this.tookMs = l10;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setGraphQlOperationName(okhttp3.g headers) {
        Object obj;
        Iterator<T> it = toHttpHeaderList(headers).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (C0969n.Y(((I1.a) obj).getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String().toLowerCase(Locale.ROOT), "operation-name", false)) {
                    break;
                }
            }
        }
        I1.a aVar = (I1.a) obj;
        this.graphQlOperationName = aVar != null ? aVar.getValue() : null;
    }

    public final void setRequestHeaders(okhttp3.g headers) {
        setRequestHeaders(toHttpHeaderList(headers));
    }

    public final void setResponseHeaders(okhttp3.g headers) {
        setResponseHeaders(toHttpHeaderList(headers));
    }

    public final void setRequestHeaders(List<I1.a> headers) {
        this.requestHeaders = g.a().h(headers);
    }

    public final void setResponseHeaders(List<I1.a> headers) {
        this.responseHeaders = g.a().h(headers);
    }

    public /* synthetic */ HttpTransaction(long j10, Long l10, Long l11, Long l12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l13, String str9, String str10, Long l14, String str11, boolean z10, Integer num, String str12, String str13, Long l15, String str14, String str15, Long l16, String str16, boolean z11, byte[] bArr, boolean z12, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j10, l10, l11, l12, str, str2, str3, str4, str5, str6, str7, str8, l13, str9, str10, l14, str11, (i & 131072) != 0 ? false : z10, num, str12, str13, l15, str14, str15, l16, str16, (i & 67108864) != 0 ? false : z11, bArr, (i & 268435456) != 0 ? false : z12, str17);
    }

    @Ignore
    public HttpTransaction() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, 335675393, null);
    }
}
