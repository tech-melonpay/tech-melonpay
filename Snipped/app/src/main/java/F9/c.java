package F9;

import android.content.Context;
import com.bumptech.glide.load.Key;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ResourcesModulesLoader.java */
/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0859q f1281a;

    /* renamed from: b, reason: collision with root package name */
    public Map f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1283c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1284d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0859q interfaceC0859q) {
        this(interfaceC0859q, (byte) 0);
        this.f1283c = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.f1284d = classLoader;
    }

    @Override // F9.a
    public final Map a() {
        Map map = this.f1282b;
        if (map != null) {
            return map;
        }
        TreeMap b9 = b();
        this.f1282b = b9;
        return b9;
    }

    public final TreeMap b() {
        switch (this.f1283c) {
            case 0:
                InterfaceC0859q interfaceC0859q = this.f1281a;
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) this.f1284d).getResourceAsStream("sentry-external-modules.txt");
                    if (resourceAsStream == null) {
                        interfaceC0859q.h(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    } else {
                        treeMap = c(resourceAsStream);
                    }
                } catch (SecurityException e10) {
                    interfaceC0859q.f(SentryLevel.INFO, "Access to resources denied.", e10);
                }
                return treeMap;
            default:
                InterfaceC0859q interfaceC0859q2 = this.f1281a;
                TreeMap treeMap2 = new TreeMap();
                try {
                    return c(((Context) this.f1284d).getAssets().open("sentry-external-modules.txt"));
                } catch (FileNotFoundException unused) {
                    interfaceC0859q2.h(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e11) {
                    interfaceC0859q2.f(SentryLevel.ERROR, "Error extracting modules.", e11);
                    return treeMap2;
                }
        }
    }

    public final TreeMap c(InputStream inputStream) {
        BufferedReader bufferedReader;
        InterfaceC0859q interfaceC0859q = this.f1281a;
        TreeMap treeMap = new TreeMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(Key.STRING_CHARSET_NAME)));
        } catch (IOException e10) {
            interfaceC0859q.f(SentryLevel.ERROR, "Error extracting modules.", e10);
        } catch (RuntimeException e11) {
            interfaceC0859q.d(SentryLevel.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                int lastIndexOf = readLine.lastIndexOf(58);
                treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
            }
            interfaceC0859q.h(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
            bufferedReader.close();
            return treeMap;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, InterfaceC0859q interfaceC0859q) {
        this(interfaceC0859q, (byte) 0);
        this.f1283c = 1;
        this.f1284d = context;
    }

    public c(InterfaceC0859q interfaceC0859q, byte b9) {
        this.f1282b = null;
        this.f1281a = interfaceC0859q;
    }
}
