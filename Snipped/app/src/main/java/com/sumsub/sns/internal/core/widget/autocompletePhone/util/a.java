package com.sumsub.sns.internal.core.widget.autocompletePhone.util;

/* loaded from: classes2.dex */
public final class a {
    public static final boolean a(String str) {
        int i = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt == '#' || Character.isDigit(charAt)) {
                i++;
            }
        }
        return 7 <= i && i < 16;
    }
}
