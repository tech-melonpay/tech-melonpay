package t8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.io.Serializable;

/* compiled from: TransactionDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f29941a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f29942b;

    public e(String str, TransactionUI transactionUI) {
        this.f29941a = str;
        this.f29942b = transactionUI;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "transactionId")) {
            throw new IllegalArgumentException("Required argument \"transactionId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("transactionId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"transactionId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("transactionUI")) {
            throw new IllegalArgumentException("Required argument \"transactionUI\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TransactionUI.class) && !Serializable.class.isAssignableFrom(TransactionUI.class)) {
            throw new UnsupportedOperationException(TransactionUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TransactionUI transactionUI = (TransactionUI) bundle.get("transactionUI");
        if (transactionUI != null) {
            return new e(string, transactionUI);
        }
        throw new IllegalArgumentException("Argument \"transactionUI\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f29941a, eVar.f29941a) && kotlin.jvm.internal.f.b(this.f29942b, eVar.f29942b);
    }

    public final int hashCode() {
        return this.f29942b.hashCode() + (this.f29941a.hashCode() * 31);
    }

    public final String toString() {
        return "TransactionDetailsFragmentArgs(transactionId=" + this.f29941a + ", transactionUI=" + this.f29942b + ")";
    }
}
