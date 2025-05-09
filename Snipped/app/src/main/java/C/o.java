package C;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: Quality.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0491g f560a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0491g f561b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0491g f562c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0491g f563d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0491g f564e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0491g f565f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0491g f566g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f567h;
    public static final List<o> i;

    /* compiled from: Quality.java */
    public static abstract class a extends o {
        public abstract String a();

        public abstract int b();
    }

    static {
        C0491g c0491g = new C0491g(4, "SD");
        f560a = c0491g;
        C0491g c0491g2 = new C0491g(5, "HD");
        f561b = c0491g2;
        C0491g c0491g3 = new C0491g(6, "FHD");
        f562c = c0491g3;
        C0491g c0491g4 = new C0491g(8, "UHD");
        f563d = c0491g4;
        C0491g c0491g5 = new C0491g(0, "LOWEST");
        f564e = c0491g5;
        C0491g c0491g6 = new C0491g(1, "HIGHEST");
        f565f = c0491g6;
        f566g = new C0491g(-1, "NONE");
        f567h = new HashSet(Arrays.asList(c0491g5, c0491g6, c0491g, c0491g2, c0491g3, c0491g4));
        i = Arrays.asList(c0491g4, c0491g3, c0491g2, c0491g);
    }
}
