package com.luminary.business.presentation.entity.company;

import C.v;
import androidx.camera.core.impl.utils.a;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: UploadFileUI.kt */
/* loaded from: classes2.dex */
public final class UploadFileUI implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11315a;

    /* renamed from: b, reason: collision with root package name */
    public String f11316b;

    /* renamed from: c, reason: collision with root package name */
    public final NewCompanyViewModel.UploadFileType f11317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11318d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f11319e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11320f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f11321g;

    public /* synthetic */ UploadFileUI(String str, String str2, NewCompanyViewModel.UploadFileType uploadFileType, String str3) {
        this(str, str2, uploadFileType, null, null, str3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadFileUI)) {
            return false;
        }
        UploadFileUI uploadFileUI = (UploadFileUI) obj;
        return f.b(this.f11315a, uploadFileUI.f11315a) && f.b(this.f11316b, uploadFileUI.f11316b) && this.f11317c == uploadFileUI.f11317c && f.b(this.f11318d, uploadFileUI.f11318d) && f.b(this.f11319e, uploadFileUI.f11319e) && f.b(this.f11320f, uploadFileUI.f11320f) && f.b(this.f11321g, uploadFileUI.f11321g);
    }

    public final int hashCode() {
        int hashCode = (this.f11317c.hashCode() + v.c(this.f11315a.hashCode() * 31, 31, this.f11316b)) * 31;
        String str = this.f11318d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f11319e;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f11320f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f11321g;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11316b;
        Boolean bool = this.f11321g;
        StringBuilder sb2 = new StringBuilder("UploadFileUI(body=");
        a.u(sb2, this.f11315a, ", title=", str, ", type=");
        sb2.append(this.f11317c);
        sb2.append(", comments=");
        sb2.append(this.f11318d);
        sb2.append(", expiryDate=");
        sb2.append(this.f11319e);
        sb2.append(", customFilename=");
        sb2.append(this.f11320f);
        sb2.append(", loaded=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    public UploadFileUI(String str, String str2, NewCompanyViewModel.UploadFileType uploadFileType, String str3, Long l10, String str4, Boolean bool) {
        this.f11315a = str;
        this.f11316b = str2;
        this.f11317c = uploadFileType;
        this.f11318d = str3;
        this.f11319e = l10;
        this.f11320f = str4;
        this.f11321g = bool;
    }
}
