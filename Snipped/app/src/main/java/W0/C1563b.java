package w0;

import C.v;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinkifyCompat.java */
/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563b {

    /* renamed from: a, reason: collision with root package name */
    public static final B9.a f30805a = new B9.a(6);

    /* compiled from: LinkifyCompat.java */
    /* renamed from: w0.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public URLSpan f30806a;

        /* renamed from: b, reason: collision with root package name */
        public String f30807b;

        /* renamed from: c, reason: collision with root package name */
        public int f30808c;

        /* renamed from: d, reason: collision with root package name */
        public int f30809d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00bb, code lost:
    
        if (w0.C1562a.a(r3.group(0)) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x004d, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004f, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1563b.a(java.lang.String):java.lang.String");
    }

    public static void b(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z10;
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableStringBuilder, start, end)) && group != null) {
                a aVar = new a();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z10 = false;
                        break;
                    }
                    String str = strArr[i];
                    int i9 = i;
                    if (group.regionMatches(true, 0, str, 0, str.length())) {
                        z10 = true;
                        if (!group.regionMatches(false, 0, str, 0, str.length())) {
                            StringBuilder s10 = v.s(str);
                            s10.append(group.substring(str.length()));
                            group = s10.toString();
                        }
                    } else {
                        i = i9 + 1;
                    }
                }
                if (!z10 && strArr.length > 0) {
                    group = androidx.camera.core.impl.utils.a.n(new StringBuilder(), strArr[0], group);
                }
                aVar.f30807b = group;
                aVar.f30808c = start;
                aVar.f30809d = end;
                arrayList.add(aVar);
            }
        }
    }
}
