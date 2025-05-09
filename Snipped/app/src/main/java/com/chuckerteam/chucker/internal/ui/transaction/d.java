package com.chuckerteam.chucker.internal.ui.transaction;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* compiled from: TransactionPayloadAdapter.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public SpannableStringBuilder f8777a;

        public a(SpannableStringBuilder spannableStringBuilder) {
            this.f8777a = spannableStringBuilder;
        }
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class b extends d {
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Spanned f8778a;

        public c(Spanned spanned) {
            this.f8778a = spanned;
        }
    }

    /* compiled from: TransactionPayloadAdapter.kt */
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.d$d, reason: collision with other inner class name */
    public static final class C0098d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f8779a;

        /* renamed from: b, reason: collision with root package name */
        public final Double f8780b;

        public C0098d(Bitmap bitmap, Double d10) {
            this.f8779a = bitmap;
            this.f8780b = d10;
        }
    }
}
