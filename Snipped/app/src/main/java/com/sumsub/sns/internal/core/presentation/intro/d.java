package com.sumsub.sns.internal.core.presentation.intro;

import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.Arrays;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes2.dex */
public final class d {
    public static final String a(b.c cVar, f fVar, Label label) {
        String c2 = fVar.c();
        String b9 = fVar.b();
        String a10 = fVar.a();
        if (a10 == null) {
            a10 = "";
        }
        return cVar.a(a(c2, b9, label, a10), a(fVar.c(), fVar.b(), label, ""), a("defaults", fVar.b(), label, ""));
    }

    public static final e b(f fVar, b.c cVar) {
        return new e(a(MessageBundle.TITLE_ENTRY, cVar, fVar), a("subtitle", cVar, fVar), null, null, null, a("header_image", cVar, fVar), a("header_title", cVar, fVar), a("instructions_text", cVar, fVar), a("action_continue", cVar, fVar));
    }

    public static final String a(String str, String str2, Label label, String str3) {
        String str4;
        String format = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, "instructions", label.name()}, 4));
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 == null || (str4 = "::".concat(str3)) == null) {
            str4 = "";
        }
        return format.concat(str4);
    }

    public static final e a(f fVar, b.c cVar) {
        String a10 = a(cVar, fVar, Label.action_continue);
        String a11 = a(cVar, fVar, Label.title);
        String a12 = a(cVar, fVar, Label.subtitle);
        String a13 = a(cVar, fVar, Label.header);
        if (a13.length() <= 0 || a(cVar, fVar, Label.doHeader).length() != 0 || a(cVar, fVar, Label.dontHeader).length() != 0) {
            a13 = null;
        }
        c cVar2 = a13 != null ? new c(a13, a(cVar, fVar, Label.text), a(cVar, fVar, Label.image)) : null;
        String a14 = a(cVar, fVar, Label.doHeader);
        if (a14.length() <= 0) {
            a14 = null;
        }
        c cVar3 = a14 != null ? new c(a14, a(cVar, fVar, Label.doText), a(cVar, fVar, Label.doImage)) : null;
        String a15 = a(cVar, fVar, Label.dontHeader);
        if (a15.length() <= 0) {
            a15 = null;
        }
        return new e(a11, a12, cVar2, cVar3, a15 != null ? new c(a15, a(cVar, fVar, Label.dontText), a(cVar, fVar, Label.dontImage)) : null, null, null, null, a10);
    }

    public static final String a(String str, b.c cVar, f fVar) {
        return cVar.a(a(fVar.c(), str));
    }

    public static final String a(String str, String str2) {
        return String.format("sns_status_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }
}
