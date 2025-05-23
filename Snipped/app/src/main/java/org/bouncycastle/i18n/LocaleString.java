package org.bouncycastle.i18n;

import java.util.Locale;

/* loaded from: classes2.dex */
public class LocaleString extends LocalizedMessage {
    public LocaleString(String str, String str2) {
        super(str, str2);
    }

    public String getLocaleString(Locale locale) {
        return getEntry(null, locale, null);
    }

    public LocaleString(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public LocaleString(String str, String str2, String str3, Object[] objArr) {
        super(str, str2, str3, objArr);
    }
}
