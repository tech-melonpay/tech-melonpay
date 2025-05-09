package com.google.firebase.messaging;

import java.util.Locale;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    public SendException(String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseErrorCode(String str) {
        char c2;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 1;
        }
        if (c2 == 2) {
            return 2;
        }
        if (c2 != 3) {
            return c2 != 4 ? 0 : 4;
        }
        return 3;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
