package com.luminary.business.presentation.ui.fragments.home.newhome;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import kotlin.jvm.internal.f;

/* compiled from: ExchangeItems.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: ExchangeItems.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.home.newhome.a$a, reason: collision with other inner class name */
    public static final class C0129a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CryptoExchangeDomain f12263a;

        public C0129a(CryptoExchangeDomain cryptoExchangeDomain) {
            this.f12263a = cryptoExchangeDomain;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0129a) && f.b(this.f12263a, ((C0129a) obj).f12263a);
        }

        public final int hashCode() {
            return this.f12263a.hashCode();
        }

        public final String toString() {
            return "Display(item=" + this.f12263a + ")";
        }
    }

    /* compiled from: ExchangeItems.kt */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f12264a;

        public b(String str) {
            this.f12264a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && f.b(this.f12264a, ((b) obj).f12264a);
        }

        public final int hashCode() {
            return this.f12264a.hashCode();
        }

        public final String toString() {
            return androidx.camera.core.impl.utils.a.n(new StringBuilder("Header(item="), this.f12264a, ")");
        }
    }
}
