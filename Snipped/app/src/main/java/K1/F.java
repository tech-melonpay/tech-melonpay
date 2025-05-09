package k1;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: TransitionInflater.java */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f22739b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.collection.a<String, Constructor<?>> f22740c = new androidx.collection.a<>();

    /* renamed from: a, reason: collision with root package name */
    public final Context f22741a;

    public F(Context context) {
        this.f22741a = context;
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f22740c;
            synchronized (aVar) {
                try {
                    Constructor<?> constructor = aVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f22741a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(f22739b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.f22741a, attributeSet);
                } finally {
                }
            }
            return newInstance;
        } catch (Exception e10) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0344, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [k1.F] */
    /* JADX WARN: Type inference failed for: r20v0, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [k1.J] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r7v10, types: [k1.C, k1.h] */
    /* JADX WARN: Type inference failed for: r7v11, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r7v12, types: [k1.C, k1.W, k1.j] */
    /* JADX WARN: Type inference failed for: r7v13, types: [k1.A, k1.C, k1.W] */
    /* JADX WARN: Type inference failed for: r7v14, types: [k1.C, k1.d] */
    /* JADX WARN: Type inference failed for: r7v15, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r7v16, types: [k1.W] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r7v6, types: [k1.J] */
    /* JADX WARN: Type inference failed for: r7v7, types: [k1.C] */
    /* JADX WARN: Type inference failed for: r7v8, types: [k1.J, k1.b] */
    /* JADX WARN: Type inference failed for: r7v9, types: [k1.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k1.AbstractC0919C b(android.content.res.XmlResourceParser r18, android.util.AttributeSet r19, k1.AbstractC0919C r20) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.F.b(android.content.res.XmlResourceParser, android.util.AttributeSet, k1.C):k1.C");
    }

    public final AbstractC0919C c(int i) {
        XmlResourceParser xml = this.f22741a.getResources().getXml(i);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e10) {
                throw new InflateException(xml.getPositionDescription() + ": " + e10.getMessage(), e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(e11.getMessage(), e11);
            }
        } finally {
            xml.close();
        }
    }
}
