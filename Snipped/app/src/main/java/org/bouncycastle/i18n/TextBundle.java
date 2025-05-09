package org.bouncycastle.i18n;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class TextBundle extends LocalizedMessage {
    public static final String TEXT_ENTRY = "text";

    public TextBundle(String str, String str2) {
        super(str, str2);
    }

    public String getText(Locale locale) {
        return getEntry(TEXT_ENTRY, locale, TimeZone.getDefault());
    }

    public TextBundle(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public String getText(Locale locale, TimeZone timeZone) {
        return getEntry(TEXT_ENTRY, locale, timeZone);
    }

    public TextBundle(String str, String str2, String str3, Object[] objArr) {
        super(str, str2, str3, objArr);
    }

    public TextBundle(String str, String str2, Object[] objArr) {
        super(str, str2, objArr);
    }
}
