package A0;

import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f16a;

    /* compiled from: InputContentInfoCompat.java */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f17a;

        public a(Object obj) {
            this.f17a = (InputContentInfo) obj;
        }

        public final void a() {
            this.f17a.requestPermission();
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    public interface b {
    }

    public d(a aVar) {
        this.f16a = aVar;
    }
}
