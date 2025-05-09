package K0;

import android.widget.EditText;
import pa.C1124b;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0029a f2214a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: K0.a$a, reason: collision with other inner class name */
    public static class C0029a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f2215a;

        /* renamed from: b, reason: collision with root package name */
        public final g f2216b;

        public C0029a(EditText editText) {
            this.f2215a = editText;
            g gVar = new g(editText);
            this.f2216b = gVar;
            editText.addTextChangedListener(gVar);
            if (K0.b.f2218b == null) {
                synchronized (K0.b.f2217a) {
                    try {
                        if (K0.b.f2218b == null) {
                            K0.b bVar = new K0.b();
                            try {
                                K0.b.f2219c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, K0.b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            K0.b.f2218b = bVar;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(K0.b.f2218b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    public static class b {
    }

    public a(EditText editText) {
        C1124b.p(editText, "editText cannot be null");
        this.f2214a = new C0029a(editText);
    }
}
