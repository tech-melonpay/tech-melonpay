package pa;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SerialDescriptors.kt */
/* renamed from: pa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1123a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25718a;

    /* renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f25719b = EmptyList.f23104a;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25720c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f25721d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25722e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f25723f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f25724g = new ArrayList();

    public C1123a(String str) {
        this.f25718a = str;
    }

    public static void a(C1123a c1123a, String str, f fVar) {
        EmptyList emptyList = EmptyList.f23104a;
        if (!c1123a.f25721d.add(str)) {
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Element with name '", str, "' is already registered in ");
            m2.append(c1123a.f25718a);
            throw new IllegalArgumentException(m2.toString().toString());
        }
        c1123a.f25720c.add(str);
        c1123a.f25722e.add(fVar);
        c1123a.f25723f.add(emptyList);
        c1123a.f25724g.add(false);
    }
}
