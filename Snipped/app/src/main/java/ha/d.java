package Ha;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import ka.C0969n;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import pa.C1124b;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1664a = new d();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.f23104a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && f.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.f23104a;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(s3.b.i("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("endIndex > string.length: ", length2, " > ");
            l10.append(str.length());
            throw new IllegalArgumentException(l10.toString().toString());
        }
        long j10 = 0;
        int i9 = 0;
        while (i9 < length2) {
            char charAt = str.charAt(i9);
            if (charAt < 128) {
                j10++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i10 = i9 + 1;
                    char charAt2 = i10 < length2 ? str.charAt(i10) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j10++;
                        i9 = i10;
                    } else {
                        j10 += 4;
                        i9 += 2;
                    }
                }
                j10 += i;
            }
            i9++;
        }
        return length == ((int) j10);
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        if (wa.b.f30877f.b(str)) {
            String F10 = C1124b.F(str);
            List a10 = a(x509Certificate, 7);
            if (!(a10 instanceof Collection) || !a10.isEmpty()) {
                Iterator it = a10.iterator();
                while (it.hasNext()) {
                    if (f.b(F10, C1124b.F((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                str = str.toLowerCase(Locale.US);
            }
            List<String> a11 = a(x509Certificate, 2);
            if (!(a11 instanceof Collection) || !a11.isEmpty()) {
                for (String str2 : a11) {
                    if (str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                        String concat = !str.endsWith(".") ? str.concat(".") : str;
                        if (!str2.endsWith(".")) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            str2 = str2.toLowerCase(Locale.US);
                        }
                        if (!C0969n.Y(str2, "*", false)) {
                            if (f.b(concat, str2)) {
                                return true;
                            }
                        } else if (str2.startsWith("*.") && C0969n.f0(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !f.b("*.", str2)) {
                            String substring = str2.substring(1);
                            if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || C0969n.j0('.', length - 1, 4, concat) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (!b(str)) {
            return false;
        }
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
