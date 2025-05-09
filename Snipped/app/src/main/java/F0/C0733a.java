package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20575a;

    /* renamed from: b, reason: collision with root package name */
    public int f20576b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f20577c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<C0396a> f20578d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f20579e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: f0.a$a, reason: collision with other inner class name */
    public static class C0396a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20580a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f20581b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f20582c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f20583d;

        public C0396a(Context context, XmlResourceParser xmlResourceParser) {
            this.f20582c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0736d.f20598j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f20580a = obtainStyledAttributes.getResourceId(index, this.f20580a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f20582c);
                    this.f20582c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f20583d = bVar;
                        bVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: f0.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f20584a;

        /* renamed from: b, reason: collision with root package name */
        public final float f20585b;

        /* renamed from: c, reason: collision with root package name */
        public final float f20586c;

        /* renamed from: d, reason: collision with root package name */
        public final float f20587d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20588e;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f20589f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f20584a = Float.NaN;
            this.f20585b = Float.NaN;
            this.f20586c = Float.NaN;
            this.f20587d = Float.NaN;
            this.f20588e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0736d.f20600l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f20588e);
                    this.f20588e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f20589f = bVar;
                        bVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f20587d = obtainStyledAttributes.getDimension(index, this.f20587d);
                } else if (index == 2) {
                    this.f20585b = obtainStyledAttributes.getDimension(index, this.f20585b);
                } else if (index == 3) {
                    this.f20586c = obtainStyledAttributes.getDimension(index, this.f20586c);
                } else if (index == 4) {
                    this.f20584a = obtainStyledAttributes.getDimension(index, this.f20584a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f20584a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f20585b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f20586c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f20587d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    public C0733a(Context context, ConstraintLayout constraintLayout, int i) {
        this.f20575a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0396a c0396a = null;
            while (true) {
                char c2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 2) {
                        C0396a c0396a2 = new C0396a(context, xml);
                        this.f20578d.put(c0396a2.f20580a, c0396a2);
                        c0396a = c0396a2;
                    } else if (c2 == 3) {
                        b bVar = new b(context, xml);
                        if (c0396a != null) {
                            c0396a.f20581b.add(bVar);
                        }
                    } else if (c2 == 4) {
                        a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0733a.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
