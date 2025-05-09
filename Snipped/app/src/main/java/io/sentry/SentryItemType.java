package io.sentry;

import com.google.android.gms.common.Scopes;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum SentryItemType implements F {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ClientReport("client_report"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements A<SentryItemType> {
        @Override // io.sentry.A
        public final SentryItemType a(D d10, InterfaceC0859q interfaceC0859q) {
            return SentryItemType.valueOfLabel(d10.r0().toLowerCase(Locale.ROOT));
        }
    }

    SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        return obj instanceof i0 ? Event : obj instanceof H9.m ? Transaction : obj instanceof Session ? Session : obj instanceof C9.b ? ClientReport : Attachment;
    }

    public static SentryItemType valueOfLabel(String str) {
        for (SentryItemType sentryItemType : values()) {
            if (sentryItemType.itemType.equals(str)) {
                return sentryItemType;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.F
    public void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.H(this.itemType);
    }
}
