package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.sumsub.sns.internal.core.data.model.p;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6489k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f6490a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6491b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6492c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f6493d;

    /* renamed from: e, reason: collision with root package name */
    public int f6494e;

    /* renamed from: f, reason: collision with root package name */
    public int f6495f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f6496g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6497h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f6498j;

    public static class a {
        public static IconCompat a(Object obj) {
            obj.getClass();
            int d10 = d(obj);
            if (d10 == 2) {
                return IconCompat.b(null, c(obj), b(obj));
            }
            if (d10 == 4) {
                Uri e10 = e(obj);
                PorterDuff.Mode mode = IconCompat.f6489k;
                e10.getClass();
                String uri = e10.toString();
                uri.getClass();
                IconCompat iconCompat = new IconCompat(4);
                iconCompat.f6491b = uri;
                return iconCompat;
            }
            if (d10 != 6) {
                IconCompat iconCompat2 = new IconCompat(-1);
                iconCompat2.f6491b = obj;
                return iconCompat2;
            }
            Uri e11 = e(obj);
            PorterDuff.Mode mode2 = IconCompat.f6489k;
            e11.getClass();
            String uri2 = e11.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(6);
            iconCompat3.f6491b = uri2;
            return iconCompat3;
        }

        public static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return b.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return b.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return b.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return b.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }
    }

    public static class b {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class c {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f6490a = -1;
        this.f6492c = null;
        this.f6493d = null;
        this.f6494e = 0;
        this.f6495f = 0;
        this.f6496g = null;
        this.f6497h = f6489k;
        this.i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f6494e = bundle.getInt("int1");
        iconCompat.f6495f = bundle.getInt("int2");
        iconCompat.f6498j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f6496g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f6497h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f6491b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f6491b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f6491b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f6494e = i;
        if (resources != null) {
            try {
                iconCompat.f6491b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f6491b = str;
        }
        iconCompat.f6498j = str;
        return iconCompat;
    }

    public final int c() {
        int i = this.f6490a;
        if (i == -1) {
            return a.b(this.f6491b);
        }
        if (i == 2) {
            return this.f6494e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String d() {
        int i = this.f6490a;
        if (i == -1) {
            return a.c(this.f6491b);
        }
        if (i == 2) {
            String str = this.f6498j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f6491b).split(p.f15541a, -1)[0] : this.f6498j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri e() {
        int i = this.f6490a;
        if (i == -1) {
            return a.e(this.f6491b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f6491b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Icon f(android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.f(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f6490a == -1) {
            return String.valueOf(this.f6491b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f6490a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f6490a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f6491b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f6491b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f6498j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f6494e);
                if (this.f6495f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f6495f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f6491b);
                break;
        }
        if (this.f6496g != null) {
            sb2.append(" tint=");
            sb2.append(this.f6496g);
        }
        if (this.f6497h != f6489k) {
            sb2.append(" mode=");
            sb2.append(this.f6497h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i) {
        this.f6492c = null;
        this.f6493d = null;
        this.f6494e = 0;
        this.f6495f = 0;
        this.f6496g = null;
        this.f6497h = f6489k;
        this.i = null;
        this.f6490a = i;
    }
}
