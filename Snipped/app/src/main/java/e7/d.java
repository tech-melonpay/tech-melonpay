package E7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.io.Serializable;

/* compiled from: InvoiceDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1075a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f1076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1077c;

    public d(String str, TransactionUI transactionUI, String str2) {
        this.f1075a = str;
        this.f1076b = transactionUI;
        this.f1077c = str2;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "transactionId")) {
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
        if (transactionUI == null) {
            throw new IllegalArgumentException("Argument \"transactionUI\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("path")) {
            throw new IllegalArgumentException("Required argument \"path\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("path");
        if (string2 != null) {
            return new d(string, transactionUI, string2);
        }
        throw new IllegalArgumentException("Argument \"path\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f1075a, dVar.f1075a) && kotlin.jvm.internal.f.b(this.f1076b, dVar.f1076b) && kotlin.jvm.internal.f.b(this.f1077c, dVar.f1077c);
    }

    public final int hashCode() {
        return this.f1077c.hashCode() + ((this.f1076b.hashCode() + (this.f1075a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvoiceDetailsFragmentArgs(transactionId=");
        sb2.append(this.f1075a);
        sb2.append(", transactionUI=");
        sb2.append(this.f1076b);
        sb2.append(", path=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1077c, ")");
    }
}
