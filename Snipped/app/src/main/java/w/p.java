package w;

import android.util.Pair;
import androidx.camera.core.impl.Quirk;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: FlashAvailabilityBufferUnderflowQuirk.java */
/* loaded from: classes.dex */
public class p implements Quirk {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f30783a;

    static {
        HashSet hashSet = new HashSet();
        f30783a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
