package com.sumsub.sns.internal.core.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010 ¨\u0006@"}, d2 = {"Lcom/sumsub/sns/internal/core/common/SNSSession;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "sessionId", "", ImagesContract.URL, "accessToken", "Ljava/util/Locale;", "locale", "", "isDebug", "packageName", "versionName", "", "versionCode", "theme", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Locale;", "component5", "()Z", "component6", "component7", "component8", "()I", "component9", "()Ljava/lang/Integer;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/sumsub/sns/internal/core/common/SNSSession;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/UUID;", "getSessionId", "Ljava/lang/String;", "getUrl", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "getLocale", "Z", "getPackageName", "getVersionName", "I", "getVersionCode", "Ljava/lang/Integer;", "getTheme", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class SNSSession implements Parcelable {
    public static final Parcelable.Creator<SNSSession> CREATOR = new a();
    private String accessToken;
    private final boolean isDebug;
    private final Locale locale;
    private final String packageName;
    private final UUID sessionId;
    private final Integer theme;
    private final String url;
    private final int versionCode;
    private final String versionName;

    public static final class a implements Parcelable.Creator<SNSSession> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SNSSession createFromParcel(Parcel parcel) {
            return new SNSSession((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SNSSession[] newArray(int i) {
            return new SNSSession[i];
        }
    }

    public SNSSession(UUID uuid, String str, String str2, Locale locale, boolean z10, String str3, String str4, int i, Integer num) {
        this.sessionId = uuid;
        this.url = str;
        this.accessToken = str2;
        this.locale = locale;
        this.isDebug = z10;
        this.packageName = str3;
        this.versionName = str4;
        this.versionCode = i;
        this.theme = num;
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component8, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getTheme() {
        return this.theme;
    }

    public final SNSSession copy(UUID sessionId, String url, String accessToken, Locale locale, boolean isDebug, String packageName, String versionName, int versionCode, Integer theme) {
        return new SNSSession(sessionId, url, accessToken, locale, isDebug, packageName, versionName, versionCode, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSSession)) {
            return false;
        }
        SNSSession sNSSession = (SNSSession) other;
        return kotlin.jvm.internal.f.b(this.sessionId, sNSSession.sessionId) && kotlin.jvm.internal.f.b(this.url, sNSSession.url) && kotlin.jvm.internal.f.b(this.accessToken, sNSSession.accessToken) && kotlin.jvm.internal.f.b(this.locale, sNSSession.locale) && this.isDebug == sNSSession.isDebug && kotlin.jvm.internal.f.b(this.packageName, sNSSession.packageName) && kotlin.jvm.internal.f.b(this.versionName, sNSSession.versionName) && this.versionCode == sNSSession.versionCode && kotlin.jvm.internal.f.b(this.theme, sNSSession.theme);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Integer getTheme() {
        return this.theme;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.locale.hashCode() + C.v.c(C.v.c(this.sessionId.hashCode() * 31, 31, this.url), 31, this.accessToken)) * 31;
        boolean z10 = this.isDebug;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        int b9 = C.v.b(this.versionCode, C.v.c(C.v.c((hashCode + i) * 31, 31, this.packageName), 31, this.versionName), 31);
        Integer num = this.theme;
        return b9 + (num == null ? 0 : num.hashCode());
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public String toString() {
        return "SNSSession(sessionId=" + this.sessionId + ", url=" + this.url + ", accessToken=" + this.accessToken + ", locale=" + this.locale + ", isDebug=" + this.isDebug + ", packageName=" + this.packageName + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        parcel.writeSerializable(this.sessionId);
        parcel.writeString(this.url);
        parcel.writeString(this.accessToken);
        parcel.writeSerializable(this.locale);
        parcel.writeInt(this.isDebug ? 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.versionName);
        parcel.writeInt(this.versionCode);
        Integer num = this.theme;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public /* synthetic */ SNSSession(UUID uuid, String str, String str2, Locale locale, boolean z10, String str3, String str4, int i, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? UUID.randomUUID() : uuid, str, str2, locale, z10, str3, str4, i, num);
    }
}
