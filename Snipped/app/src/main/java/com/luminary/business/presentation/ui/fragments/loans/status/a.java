package com.luminary.business.presentation.ui.fragments.loans.status;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.loans.status.LoansStatusFragment;
import java.io.Serializable;

/* compiled from: LoansStatusFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final LoansStatusFragment.StatusType f12382a;

    public a(LoansStatusFragment.StatusType statusType) {
        this.f12382a = statusType;
    }

    public static final a fromBundle(Bundle bundle) {
        if (!v.y(bundle, a.class, "statusType")) {
            throw new IllegalArgumentException("Required argument \"statusType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LoansStatusFragment.StatusType.class) && !Serializable.class.isAssignableFrom(LoansStatusFragment.StatusType.class)) {
            throw new UnsupportedOperationException(LoansStatusFragment.StatusType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LoansStatusFragment.StatusType statusType = (LoansStatusFragment.StatusType) bundle.get("statusType");
        if (statusType != null) {
            return new a(statusType);
        }
        throw new IllegalArgumentException("Argument \"statusType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12382a == ((a) obj).f12382a;
    }

    public final int hashCode() {
        return this.f12382a.hashCode();
    }

    public final String toString() {
        return "LoansStatusFragmentArgs(statusType=" + this.f12382a + ")";
    }
}
