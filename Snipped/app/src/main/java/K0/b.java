package K0;

import android.text.Editable;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2217a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f2218b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f2219c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f2219c;
        return cls != null ? new I0.f(cls, charSequence) : super.newEditable(charSequence);
    }
}
