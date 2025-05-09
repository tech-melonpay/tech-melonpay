package H0;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class c<T> {
    final String mPropertyName;

    public c(String str) {
        this.mPropertyName = str;
    }

    public abstract float getValue(T t3);

    public abstract void setValue(T t3, float f10);
}
