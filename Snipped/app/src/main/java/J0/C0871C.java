package j0;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* compiled from: Person.java */
/* renamed from: j0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871C {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f22229a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f22230b;

    /* renamed from: c, reason: collision with root package name */
    public String f22231c;

    /* renamed from: d, reason: collision with root package name */
    public String f22232d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22233e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22234f;

    /* compiled from: Person.java */
    /* renamed from: j0.C$a */
    public static class a {
        public static C0871C a(Person person) {
            IconCompat iconCompat;
            CharSequence name = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f6489k;
                iconCompat = IconCompat.a.a(icon);
            } else {
                iconCompat = null;
            }
            String uri = person.getUri();
            String key = person.getKey();
            boolean isBot = person.isBot();
            boolean isImportant = person.isImportant();
            C0871C c0871c = new C0871C();
            c0871c.f22229a = name;
            c0871c.f22230b = iconCompat;
            c0871c.f22231c = uri;
            c0871c.f22232d = key;
            c0871c.f22233e = isBot;
            c0871c.f22234f = isImportant;
            return c0871c;
        }

        public static Person b(C0871C c0871c) {
            Person.Builder name = new Person.Builder().setName(c0871c.f22229a);
            IconCompat iconCompat = c0871c.f22230b;
            return name.setIcon(iconCompat != null ? iconCompat.f(null) : null).setUri(c0871c.f22231c).setKey(c0871c.f22232d).setBot(c0871c.f22233e).setImportant(c0871c.f22234f).build();
        }
    }

    public static C0871C a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME);
        IconCompat a10 = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z10 = bundle.getBoolean("isBot");
        boolean z11 = bundle.getBoolean("isImportant");
        C0871C c0871c = new C0871C();
        c0871c.f22229a = charSequence;
        c0871c.f22230b = a10;
        c0871c.f22231c = string;
        c0871c.f22232d = string2;
        c0871c.f22233e = z10;
        c0871c.f22234f = z11;
        return c0871c;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f22229a);
        IconCompat iconCompat = this.f22230b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f6490a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f6491b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f6491b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f6491b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f6491b);
                    break;
            }
            bundle.putInt("type", iconCompat.f6490a);
            bundle.putInt("int1", iconCompat.f6494e);
            bundle.putInt("int2", iconCompat.f6495f);
            bundle.putString("string1", iconCompat.f6498j);
            ColorStateList colorStateList = iconCompat.f6496g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f6497h;
            if (mode != IconCompat.f6489k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f22231c);
        bundle2.putString("key", this.f22232d);
        bundle2.putBoolean("isBot", this.f22233e);
        bundle2.putBoolean("isImportant", this.f22234f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0871C)) {
            return false;
        }
        C0871C c0871c = (C0871C) obj;
        String str = this.f22232d;
        String str2 = c0871c.f22232d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f22229a), Objects.toString(c0871c.f22229a)) && Objects.equals(this.f22231c, c0871c.f22231c) && Boolean.valueOf(this.f22233e).equals(Boolean.valueOf(c0871c.f22233e)) && Boolean.valueOf(this.f22234f).equals(Boolean.valueOf(c0871c.f22234f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f22232d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f22229a, this.f22231c, Boolean.valueOf(this.f22233e), Boolean.valueOf(this.f22234f));
    }
}
