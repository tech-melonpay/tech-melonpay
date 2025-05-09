package q8;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: StatusFragmentArgs.kt */
/* renamed from: q8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1139a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f25929a;

    public C1139a(String str) {
        this.f25929a = str;
    }

    public static final C1139a fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1139a.class, MessageBundle.TITLE_ENTRY)) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(MessageBundle.TITLE_ENTRY);
        if (string != null) {
            return new C1139a(string);
        }
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1139a) && f.b(this.f25929a, ((C1139a) obj).f25929a);
    }

    public final int hashCode() {
        return this.f25929a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("StatusFragmentArgs(title="), this.f25929a, ")");
    }
}
