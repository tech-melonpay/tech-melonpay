package v3;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import s3.InterfaceC1204a;

/* compiled from: ClassPathResourceMetadataLoader.java */
/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543a implements InterfaceC1204a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f30562a = Logger.getLogger(C1543a.class.getName());

    public final InputStream a(String str) {
        InputStream resourceAsStream = C1543a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f30562a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
