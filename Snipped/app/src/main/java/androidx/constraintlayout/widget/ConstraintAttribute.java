package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import f0.C0736d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ConstraintAttribute {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6234a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f6235b;

    /* renamed from: c, reason: collision with root package name */
    public AttributeType f6236c;

    /* renamed from: d, reason: collision with root package name */
    public int f6237d;

    /* renamed from: e, reason: collision with root package name */
    public float f6238e;

    /* renamed from: f, reason: collision with root package name */
    public String f6239f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6240g;

    /* renamed from: h, reason: collision with root package name */
    public int f6241h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {

        /* renamed from: a, reason: collision with root package name */
        public static final AttributeType f6242a;

        /* renamed from: b, reason: collision with root package name */
        public static final AttributeType f6243b;

        /* renamed from: c, reason: collision with root package name */
        public static final AttributeType f6244c;

        /* renamed from: d, reason: collision with root package name */
        public static final AttributeType f6245d;

        /* renamed from: e, reason: collision with root package name */
        public static final AttributeType f6246e;

        /* renamed from: f, reason: collision with root package name */
        public static final AttributeType f6247f;

        /* renamed from: g, reason: collision with root package name */
        public static final AttributeType f6248g;

        /* renamed from: h, reason: collision with root package name */
        public static final AttributeType f6249h;
        public static final /* synthetic */ AttributeType[] i;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            f6242a = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            f6243b = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            f6244c = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            f6245d = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            f6246e = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            f6247f = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            f6248g = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            f6249h = attributeType8;
            i = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public AttributeType() {
            throw null;
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) i.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f6235b = constraintAttribute.f6235b;
        this.f6236c = constraintAttribute.f6236c;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C0736d.f20594e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.f6247f;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.f6244c;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.f6245d;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    AttributeType attributeType3 = AttributeType.f6248g;
                    if (index == 7) {
                        obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.f6243b;
                        valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.f6242a;
                        valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.f6246e;
                        valueOf = obtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.f6249h;
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        valueOf = Integer.valueOf(resourceId);
                    }
                    attributeType2 = attributeType3;
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.f6235b = str;
            constraintAttribute.f6236c = attributeType2;
            constraintAttribute.f6234a = z10;
            constraintAttribute.c(obj);
            hashMap.put(str, constraintAttribute);
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String j10 = !constraintAttribute.f6234a ? s3.b.j("set", str) : str;
            try {
                switch (constraintAttribute.f6236c.ordinal()) {
                    case 0:
                        cls.getMethod(j10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f6237d));
                        break;
                    case 1:
                        cls.getMethod(j10, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f6238e));
                        break;
                    case 2:
                        cls.getMethod(j10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f6241h));
                        break;
                    case 3:
                        Method method = cls.getMethod(j10, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f6241h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(j10, CharSequence.class).invoke(view, constraintAttribute.f6239f);
                        break;
                    case 5:
                        cls.getMethod(j10, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f6240g));
                        break;
                    case 6:
                        cls.getMethod(j10, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f6238e));
                        break;
                    case 7:
                        cls.getMethod(j10, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f6237d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m(" Custom Attribute \"", str, "\" not found on ");
                m2.append(cls.getName());
                Log.e("TransitionLayout", m2.toString(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + j10, e11);
            } catch (InvocationTargetException e12) {
                StringBuilder m9 = com.google.android.gms.measurement.internal.a.m(" Custom Attribute \"", str, "\" not found on ");
                m9.append(cls.getName());
                Log.e("TransitionLayout", m9.toString(), e12);
            }
        }
    }

    public final void c(Object obj) {
        switch (this.f6236c.ordinal()) {
            case 0:
            case 7:
                this.f6237d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f6238e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f6241h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f6239f = (String) obj;
                break;
            case 5:
                this.f6240g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f6238e = ((Float) obj).floatValue();
                break;
        }
    }
}
