package net.sf.scuba.data;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import s3.b;

/* loaded from: classes2.dex */
public abstract class Country implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba");
    private static final Class<?>[] SUB_CLASSES = {UnicodeCountry.class, ISOCountry.class, TestCountry.class};
    private static final long serialVersionUID = 9117477643532355118L;

    private static Country fromAlpha2(String str) {
        for (Country country : values()) {
            if (country.toAlpha2Code().equals(str)) {
                return country;
            }
        }
        throw new IllegalArgumentException(b.j("Unknown country code ", str));
    }

    private static Country fromAlpha3(String str) {
        for (Country country : values()) {
            if (country.toAlpha3Code().equals(str)) {
                return country;
            }
        }
        throw new IllegalArgumentException(b.j("Unknown country code ", str));
    }

    public static Country getInstance(int i) {
        for (Country country : values()) {
            if (country.valueOf() == i) {
                return country;
            }
        }
        throw new IllegalArgumentException(a.g(i, new StringBuilder("Illegal country code")));
    }

    public static Country[] values() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : SUB_CLASSES) {
            if (Country.class.isAssignableFrom(cls)) {
                try {
                    arrayList.addAll(Arrays.asList((Country[]) cls.getMethod("values", null).invoke(null, null)));
                } catch (Exception e10) {
                    LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
                }
            }
        }
        Country[] countryArr = new Country[arrayList.size()];
        arrayList.toArray(countryArr);
        return countryArr;
    }

    public abstract String getName();

    public abstract String getNationality();

    public abstract String toAlpha2Code();

    public abstract String toAlpha3Code();

    public abstract int valueOf();

    public static Country getInstance(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            if (length == 2) {
                return fromAlpha2(trim);
            }
            if (length == 3) {
                return fromAlpha3(trim);
            }
            throw new IllegalArgumentException("Illegal country code ".concat(trim));
        }
        throw new IllegalArgumentException("Illegal country code");
    }
}
