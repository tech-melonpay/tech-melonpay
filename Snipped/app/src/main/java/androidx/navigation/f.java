package androidx.navigation;

import U0.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f7284c = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7286b;

    /* compiled from: NavInflater.kt */
    public static final class a {
        public static k a(TypedValue typedValue, k kVar, k kVar2, String str, String str2) {
            if (kVar == null || kVar == kVar2) {
                return kVar == null ? kVar2 : kVar;
            }
            StringBuilder p10 = s3.b.p("Type is ", str, " but found ", str2, ": ");
            p10.append(typedValue.data);
            throw new XmlPullParserException(p10.toString());
        }
    }

    public f(Context context, j jVar) {
        this.f7285a = context;
        this.f7286b = jVar;
    }

    public static U0.g c(TypedArray typedArray, Resources resources, int i) {
        boolean z10;
        String str;
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        Object obj;
        k kVar5;
        k tVar;
        boolean z11 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f7284c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        k kVar6 = k.f3605c;
        k kVar7 = k.f3611j;
        k kVar8 = k.f3617p;
        k kVar9 = k.f3614m;
        k kVar10 = k.f3609g;
        k kVar11 = k.f3606d;
        k kVar12 = k.f3608f;
        k kVar13 = k.f3616o;
        k kVar14 = k.f3613l;
        k kVar15 = k.i;
        k kVar16 = k.f3604b;
        if (string != null) {
            kVar = kVar11;
            String resourcePackageName = resources.getResourcePackageName(i);
            if (kotlin.jvm.internal.f.b("integer", string)) {
                z10 = z11;
                str = "boolean";
                kVar2 = kVar12;
                kVar3 = kVar16;
            } else {
                z10 = z11;
                if (kotlin.jvm.internal.f.b("integer[]", string)) {
                    str = "boolean";
                    kVar2 = kVar12;
                    kVar3 = kVar;
                } else {
                    if (kotlin.jvm.internal.f.b("List<Int>", string)) {
                        kVar3 = k.f3607e;
                    } else if (kotlin.jvm.internal.f.b("long", string)) {
                        str = "boolean";
                        kVar3 = kVar12;
                        kVar2 = kVar3;
                    } else if (kotlin.jvm.internal.f.b("long[]", string)) {
                        str = "boolean";
                        kVar2 = kVar12;
                        kVar3 = kVar10;
                    } else if (kotlin.jvm.internal.f.b("List<Long>", string)) {
                        kVar3 = k.f3610h;
                    } else if (kotlin.jvm.internal.f.b("boolean", string)) {
                        str = "boolean";
                        kVar2 = kVar12;
                        kVar3 = kVar14;
                    } else if (kotlin.jvm.internal.f.b("boolean[]", string)) {
                        str = "boolean";
                        kVar2 = kVar12;
                        kVar3 = kVar9;
                    } else if (kotlin.jvm.internal.f.b("List<Boolean>", string)) {
                        kVar3 = k.f3615n;
                    } else {
                        if (!kotlin.jvm.internal.f.b("string", string)) {
                            if (kotlin.jvm.internal.f.b("string[]", string)) {
                                str = "boolean";
                                kVar2 = kVar12;
                                kVar3 = kVar8;
                            } else if (kotlin.jvm.internal.f.b("List<String>", string)) {
                                kVar3 = k.f3618q;
                            } else if (kotlin.jvm.internal.f.b("float", string)) {
                                kVar3 = kVar15;
                            } else if (kotlin.jvm.internal.f.b("float[]", string)) {
                                str = "boolean";
                                kVar2 = kVar12;
                                kVar3 = kVar7;
                            } else if (kotlin.jvm.internal.f.b("List<Float>", string)) {
                                kVar3 = k.f3612k;
                            } else if (kotlin.jvm.internal.f.b("reference", string)) {
                                str = "boolean";
                                kVar3 = kVar6;
                                kVar2 = kVar12;
                            } else if (string.length() != 0) {
                                try {
                                    String concat = (!string.startsWith(".") || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                                    boolean endsWith = string.endsWith("[]");
                                    if (endsWith) {
                                        kVar2 = kVar12;
                                        str = "boolean";
                                        concat = concat.substring(0, concat.length() - 2);
                                    } else {
                                        str = "boolean";
                                        kVar2 = kVar12;
                                    }
                                    Class<?> cls = Class.forName(concat);
                                    if (Parcelable.class.isAssignableFrom(cls)) {
                                        tVar = endsWith ? new k.r(cls) : new k.s(cls);
                                    } else {
                                        tVar = (!Enum.class.isAssignableFrom(cls) || endsWith) ? Serializable.class.isAssignableFrom(cls) ? endsWith ? new k.t(cls) : new k.u(cls) : null : new k.q(cls);
                                    }
                                    if (tVar == null) {
                                        throw new IllegalArgumentException((concat + " is not Serializable or Parcelable.").toString());
                                    }
                                    kVar3 = tVar;
                                } catch (ClassNotFoundException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                        str = "boolean";
                        kVar2 = kVar12;
                        kVar3 = kVar13;
                    }
                    str = "boolean";
                    kVar2 = kVar12;
                }
            }
        } else {
            z10 = z11;
            str = "boolean";
            kVar = kVar11;
            kVar2 = kVar12;
            kVar3 = null;
        }
        boolean z12 = true;
        if (typedArray.getValue(1, typedValue)) {
            if (kVar3 == kVar6) {
                int i9 = typedValue.resourceId;
                if (i9 == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + kVar3.b() + ". Must be a reference to a resource.");
                    }
                    i9 = 0;
                }
                obj = Integer.valueOf(i9);
                kVar6 = kVar3;
            } else {
                int i10 = typedValue.resourceId;
                if (i10 == 0) {
                    if (kVar3 == kVar13) {
                        z12 = true;
                        obj = typedArray.getString(1);
                        kVar6 = kVar3;
                    } else {
                        z12 = true;
                        int i11 = typedValue.type;
                        if (i11 == 3) {
                            String obj2 = typedValue.string.toString();
                            if (kVar3 == null) {
                                try {
                                    kVar16.h(obj2);
                                    kVar3 = kVar16;
                                } catch (IllegalArgumentException unused) {
                                    kVar4 = kVar2;
                                    try {
                                        try {
                                            try {
                                                kVar4.h(obj2);
                                                kVar3 = kVar4;
                                            } catch (IllegalArgumentException unused2) {
                                                kVar15.h(obj2);
                                                kVar3 = kVar15;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            kVar14.h(obj2);
                                            kVar3 = kVar14;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        kVar3 = kVar13;
                                    }
                                }
                            }
                            kVar4 = kVar2;
                            kVar6 = kVar3;
                            obj = kVar6.h(obj2);
                        } else if (i11 == 4) {
                            kVar6 = a.a(typedValue, kVar3, kVar15, string, "float");
                            obj = Float.valueOf(typedValue.getFloat());
                        } else if (i11 == 5) {
                            kVar6 = a.a(typedValue, kVar3, kVar16, string, "dimension");
                            obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                        } else if (i11 == 18) {
                            kVar6 = a.a(typedValue, kVar3, kVar14, string, str);
                            obj = Boolean.valueOf(typedValue.data != 0);
                        } else {
                            if (i11 < 16 || i11 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            }
                            if (kVar3 == kVar15) {
                                kVar6 = a.a(typedValue, kVar3, kVar15, string, "float");
                                obj = Float.valueOf(typedValue.data);
                            } else {
                                kVar6 = a.a(typedValue, kVar3, kVar16, string, "integer");
                                obj = Integer.valueOf(typedValue.data);
                            }
                        }
                    }
                    kVar4 = kVar2;
                } else {
                    if (kVar3 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + kVar3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i10);
                }
            }
            kVar4 = kVar2;
            z12 = true;
        } else {
            kVar4 = kVar2;
            kVar6 = kVar3;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z12 = false;
        }
        k kVar17 = kVar6 != null ? kVar6 : null;
        if (kVar17 != null) {
            kVar5 = kVar17;
        } else if (obj instanceof Integer) {
            kVar5 = kVar16;
        } else if (obj instanceof int[]) {
            kVar5 = kVar;
        } else if (obj instanceof Long) {
            kVar5 = kVar4;
        } else if (obj instanceof long[]) {
            kVar5 = kVar10;
        } else if (obj instanceof Float) {
            kVar5 = kVar15;
        } else if (obj instanceof float[]) {
            kVar5 = kVar7;
        } else if (obj instanceof Boolean) {
            kVar5 = kVar14;
        } else if (obj instanceof boolean[]) {
            kVar5 = kVar9;
        } else if ((obj instanceof String) || obj == null) {
            kVar5 = kVar13;
        } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
            kVar5 = kVar8;
        } else if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            kVar5 = new k.r(obj.getClass().getComponentType());
        } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            kVar5 = new k.t(obj.getClass().getComponentType());
        } else if (obj instanceof Parcelable) {
            kVar5 = new k.s(obj.getClass());
        } else if (obj instanceof Enum) {
            kVar5 = new k.q(obj.getClass());
        } else {
            if (!(obj instanceof Serializable)) {
                throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
            }
            kVar5 = new k.u(obj.getClass());
        }
        return new U0.g(kVar5, z10, obj, z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0128, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e2, code lost:
    
        if (r10.isEmpty() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e4, code lost:
    
        r7.f3594c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e6, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ea, code lost:
    
        if ((!(r4 instanceof androidx.navigation.ActivityNavigator.a)) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ec, code lost:
    
        if (r12 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ee, code lost:
    
        r4.f7265f.e(r12, r7);
        r8.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020a, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022b, code lost:
    
        throw new java.lang.UnsupportedOperationException("Cannot add action " + r12 + " to " + r4 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0267, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.navigation.c a(android.content.res.Resources r27, android.content.res.XmlResourceParser r28, android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.f.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.c");
    }

    @SuppressLint({"ResourceType"})
    public final d b(int i) {
        int next;
        Resources resources = this.f7285a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        c a10 = a(resources, xml, asAttributeSet, i);
        if (a10 instanceof d) {
            return (d) a10;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
