package com.sumsub.sns.internal.videoident.presentation;

import P9.m;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public final class d {
    public static final List<String> b(String str, String str2, String str3, String str4, String str5) {
        String format = String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{str, str2, str3, str4, str5}, 5));
        String format2 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, str3, str4}, 4));
        String format3 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", str2, str3, str4}, 4));
        String str6 = !kotlin.jvm.internal.f.b(str4, TextBundle.TEXT_ENTRY) ? str4 : null;
        if (str6 == null) {
            str6 = "brief";
        }
        String format4 = String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{str, str6}, 2));
        if (kotlin.jvm.internal.f.b(str4, TextBundle.TEXT_ENTRY)) {
            str4 = null;
        }
        return m.q(format, format2, format3, format4, String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{"defaults", str4 != null ? str4 : "brief"}, 2)));
    }

    public static final List<String> b(String str, String str2, String str3) {
        String format = String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        String format2 = String.format("sns_step_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", str2, str3}, 3));
        String str4 = !kotlin.jvm.internal.f.b(str3, TextBundle.TEXT_ENTRY) ? str3 : null;
        if (str4 == null) {
            str4 = "brief";
        }
        String format3 = String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{str, str4}, 2));
        if (kotlin.jvm.internal.f.b(str3, TextBundle.TEXT_ENTRY)) {
            str3 = null;
        }
        return m.q(format, format2, format3, String.format("sns_step_%s_%s", Arrays.copyOf(new Object[]{"defaults", str3 != null ? str3 : "brief"}, 2)));
    }
}
