package pl.droidsonroids.gif;

import com.google.android.gms.measurement.internal.a;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;

    /* renamed from: a, reason: collision with root package name */
    public final GifError f25748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25749b;

    public GifIOException(int i, String str) {
        GifError gifError;
        GifError[] values = GifError.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                gifError = GifError.f25744c;
                gifError.f25747b = i;
                break;
            } else {
                gifError = values[i9];
                if (gifError.f25747b == i) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f25748a = gifError;
        this.f25749b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        GifError gifError = this.f25748a;
        String str = this.f25749b;
        if (str == null) {
            gifError.getClass();
            Locale locale = Locale.ENGLISH;
            StringBuilder l10 = a.l("GifError ", gifError.f25747b, ": ");
            l10.append(gifError.f25746a);
            return l10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        gifError.getClass();
        Locale locale2 = Locale.ENGLISH;
        StringBuilder l11 = a.l("GifError ", gifError.f25747b, ": ");
        l11.append(gifError.f25746a);
        sb2.append(l11.toString());
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }
}
