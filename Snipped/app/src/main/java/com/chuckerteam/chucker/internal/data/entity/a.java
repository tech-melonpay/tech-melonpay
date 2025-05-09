package com.chuckerteam.chucker.internal.data.entity;

import C.v;
import androidx.room.ColumnInfo;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.f;

/* compiled from: HttpTransactionTuple.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "id")
    public final long f8608a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "requestDate")
    public final Long f8609b;

    /* renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "tookMs")
    public final Long f8610c;

    /* renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "protocol")
    public final String f8611d;

    /* renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = FirebaseAnalytics.Param.METHOD)
    public final String f8612e;

    /* renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "host")
    public final String f8613f;

    /* renamed from: g, reason: collision with root package name */
    @ColumnInfo(name = "path")
    public final String f8614g;

    /* renamed from: h, reason: collision with root package name */
    @ColumnInfo(name = "scheme")
    public final String f8615h;

    @ColumnInfo(name = "responseCode")
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    @ColumnInfo(name = "requestPayloadSize")
    public final Long f8616j;

    /* renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "responsePayloadSize")
    public final Long f8617k;

    /* renamed from: l, reason: collision with root package name */
    @ColumnInfo(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    public final String f8618l;

    /* renamed from: m, reason: collision with root package name */
    @ColumnInfo(name = "graphQlDetected")
    public final boolean f8619m;

    /* renamed from: n, reason: collision with root package name */
    @ColumnInfo(name = "graphQlOperationName")
    public final String f8620n;

    public a(long j10, Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, Long l12, Long l13, String str6, boolean z10, String str7) {
        this.f8608a = j10;
        this.f8609b = l10;
        this.f8610c = l11;
        this.f8611d = str;
        this.f8612e = str2;
        this.f8613f = str3;
        this.f8614g = str4;
        this.f8615h = str5;
        this.i = num;
        this.f8616j = l12;
        this.f8617k = l13;
        this.f8618l = str6;
        this.f8619m = z10;
        this.f8620n = str7;
    }

    public final HttpTransaction.Status a() {
        return this.f8618l != null ? HttpTransaction.Status.f8606c : this.i == null ? HttpTransaction.Status.f8604a : HttpTransaction.Status.f8605b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8608a == aVar.f8608a && f.b(this.f8609b, aVar.f8609b) && f.b(this.f8610c, aVar.f8610c) && f.b(this.f8611d, aVar.f8611d) && f.b(this.f8612e, aVar.f8612e) && f.b(this.f8613f, aVar.f8613f) && f.b(this.f8614g, aVar.f8614g) && f.b(this.f8615h, aVar.f8615h) && f.b(this.i, aVar.i) && f.b(this.f8616j, aVar.f8616j) && f.b(this.f8617k, aVar.f8617k) && f.b(this.f8618l, aVar.f8618l) && this.f8619m == aVar.f8619m && f.b(this.f8620n, aVar.f8620n);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f8608a) * 31;
        Long l10 = this.f8609b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f8610c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f8611d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8612e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8613f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8614g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f8615h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.i;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.f8616j;
        int hashCode10 = (hashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f8617k;
        int hashCode11 = (hashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str6 = this.f8618l;
        int d10 = v.d((hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f8619m);
        String str7 = this.f8620n;
        return d10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpTransactionTuple(id=");
        sb2.append(this.f8608a);
        sb2.append(", requestDate=");
        sb2.append(this.f8609b);
        sb2.append(", tookMs=");
        sb2.append(this.f8610c);
        sb2.append(", protocol=");
        sb2.append(this.f8611d);
        sb2.append(", method=");
        sb2.append(this.f8612e);
        sb2.append(", host=");
        sb2.append(this.f8613f);
        sb2.append(", path=");
        sb2.append(this.f8614g);
        sb2.append(", scheme=");
        sb2.append(this.f8615h);
        sb2.append(", responseCode=");
        sb2.append(this.i);
        sb2.append(", requestPayloadSize=");
        sb2.append(this.f8616j);
        sb2.append(", responsePayloadSize=");
        sb2.append(this.f8617k);
        sb2.append(", error=");
        sb2.append(this.f8618l);
        sb2.append(", graphQlDetected=");
        sb2.append(this.f8619m);
        sb2.append(", graphQlOperationName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f8620n, ")");
    }
}
