package m0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.google.firebase.messaging.ServiceStarter;
import i0.C0807a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import u0.C1500d;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: FontResourcesParserCompat.java */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final c[] f23846a;

        public b(c[] cVarArr) {
            this.f23846a = cVarArr;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f23847a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23848b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23849c;

        /* renamed from: d, reason: collision with root package name */
        public final String f23850d;

        /* renamed from: e, reason: collision with root package name */
        public final int f23851e;

        /* renamed from: f, reason: collision with root package name */
        public final int f23852f;

        public c(int i, int i9, int i10, String str, String str2, boolean z10) {
            this.f23847a = str;
            this.f23848b = i;
            this.f23849c = z10;
            this.f23850d = str2;
            this.f23851e = i9;
            this.f23852f = i10;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final C1500d f23853a;

        /* renamed from: b, reason: collision with root package name */
        public final C1500d f23854b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23855c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23856d;

        /* renamed from: e, reason: collision with root package name */
        public final String f23857e;

        public d(C1500d c1500d, C1500d c1500d2, int i, int i9, String str) {
            this.f23853a = c1500d;
            this.f23854b = c1500d2;
            this.f23856d = i;
            this.f23855c = i9;
            this.f23857e = str;
        }
    }

    public static a a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0807a.f21240b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(5);
            String string3 = obtainAttributes.getString(6);
            String string4 = obtainAttributes.getString(2);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(3, 1);
            int integer2 = obtainAttributes.getInteger(4, ServiceStarter.ERROR_UNKNOWN);
            String string5 = obtainAttributes.getString(7);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    c(xmlResourceParser);
                }
                List<List<byte[]>> b9 = b(resources, resourceId);
                return new d(new C1500d(string, string2, string3, b9), string4 != null ? new C1500d(string, string2, string4, b9) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C0807a.f21241c);
                        int i = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i9 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i10 = obtainAttributes2.getInt(i9, 0);
                        int i11 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                        String string7 = obtainAttributes2.getString(i11);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new c(i, i10, resourceId2, string7, string6, z10));
                    } else {
                        c(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new b((c[]) arrayList.toArray(new c[0]));
            }
        } else {
            c(xmlResourceParser);
        }
        return null;
    }

    public static List<List<byte[]>> b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i9 = 0; i9 < obtainTypedArray.length(); i9++) {
                    int resourceId = obtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
