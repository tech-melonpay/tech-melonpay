package kotlin.text;

import G7.f;
import android.text.SpannableStringBuilder;
import com.google.android.gms.measurement.internal.a;
import ja.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.C0969n;

/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public final class Regex implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f23200a;

    /* compiled from: Regex.kt */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f23201a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23202b;

        public Serialized(String str, int i) {
            this.f23201a = str;
            this.f23202b = i;
        }

        private final Object readResolve() {
            return new Regex(Pattern.compile(this.f23201a, this.f23202b));
        }
    }

    public Regex(Pattern pattern) {
        this.f23200a = pattern;
    }

    public static g a(Regex regex, SpannableStringBuilder spannableStringBuilder) {
        int i = 0;
        if (spannableStringBuilder.length() >= 0) {
            return new g(new f(regex, spannableStringBuilder, i), Regex$findAll$2.f23203a);
        }
        StringBuilder l10 = a.l("Start index out of bounds: ", 0, ", input length: ");
        l10.append(spannableStringBuilder.length());
        throw new IndexOutOfBoundsException(l10.toString());
    }

    private final Object writeReplace() {
        Pattern pattern = this.f23200a;
        return new Serialized(pattern.pattern(), pattern.flags());
    }

    public final boolean b(CharSequence charSequence) {
        return this.f23200a.matcher(charSequence).matches();
    }

    public final String c(CharSequence charSequence, String str) {
        return this.f23200a.matcher(charSequence).replaceAll(str);
    }

    public final List d(CharSequence charSequence) {
        int i = 0;
        C0969n.o0(0);
        Matcher matcher = this.f23200a.matcher(charSequence);
        if (!matcher.find()) {
            return Collections.singletonList(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        return this.f23200a.toString();
    }

    public Regex(String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            int r3 = r3.f23207a
            r0 = r3 & 2
            if (r0 == 0) goto L8
            r3 = r3 | 64
        L8:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }
}
