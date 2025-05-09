package net.sf.scuba.smartcards;

import androidx.camera.core.impl.utils.a;

/* loaded from: classes2.dex */
public class CardServiceException extends Exception {
    public static final int SW_NONE = -1;
    private static final long serialVersionUID = 4489156194716970879L;
    private final int sw;

    public CardServiceException(String str) {
        this(str, -1);
    }

    private static String statusWordToString(short s10) {
        switch (s10) {
            case -28672:
                return "NO ERROR";
            case 25218:
                return "END OF FILE";
            case 25223:
                return "LESS DATA RESPONDED THAN REQUESTED";
            case 26368:
                return "WRONG LENGTH";
            case 27033:
                return "APPLET SELECT FAILED";
            case 27073:
                return "KEY USAGE ERROR";
            case 27270:
                return "INCORRECT P1P2";
            case 27272:
                return "KEY NOT FOUND";
            case 27392:
                return "WRONG P1P2";
            case 27904:
                return "INS NOT SUPPORTED";
            case 28160:
                return "CLA NOT SUPPORTED";
            case 28416:
                return "UNKNOWN";
            case 28671:
                return "CARD TERMINATED";
            default:
                switch (s10) {
                    case 26753:
                        return "LOGICAL CHANNEL NOT SUPPORTED";
                    case 26754:
                        return "SECURE MESSAGING NOT SUPPORTED";
                    case 26755:
                        return "LAST COMMAND EXPECTED";
                    default:
                        switch (s10) {
                            case 27010:
                                return "SECURITY STATUS NOT SATISFIED";
                            case 27011:
                                return "FILE INVALID";
                            case 27012:
                                return "DATA INVALID";
                            case 27013:
                                return "CONDITIONS NOT SATISFIED";
                            case 27014:
                                return "COMMAND NOT ALLOWED";
                            case 27015:
                                return "EXPECTED SM DATA OBJECTS MISSING";
                            case 27016:
                                return "SM DATA OBJECTS INCORRECT";
                            default:
                                switch (s10) {
                                    case 27264:
                                        return "WRONG DATA or FILEHEADER INCONSISTENT";
                                    case 27265:
                                        return "FUNC NOT SUPPORTED";
                                    case 27266:
                                        return "FILE NOT FOUND";
                                    case 27267:
                                        return "RECORD NOT FOUND";
                                    case 27268:
                                        return "OUT OF MEMORY or FILE FULL";
                                    default:
                                        int i = 65280 & s10;
                                        if (i == 24832) {
                                            return "BYTES REMAINING " + Integer.toString(s10 & 255);
                                        }
                                        if (i == 27648) {
                                            return "CORRECT LENGTH " + Integer.toString(s10 & 255);
                                        }
                                        if ((65520 & s10) != 25536) {
                                            return "Unknown";
                                        }
                                        return "NON VOLATILE MEMORY CHANGED COUNT " + Integer.toString(s10 & 15);
                                }
                        }
                }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.sw == -1) {
            return super.getMessage();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(" (SW = 0x");
        sb2.append(Integer.toHexString(this.sw).toUpperCase());
        sb2.append(": ");
        return a.n(sb2, statusWordToString((short) this.sw), ")");
    }

    public int getSW() {
        return this.sw;
    }

    public CardServiceException(String str, int i) {
        super(str);
        this.sw = i;
    }

    private static int getSW(Throwable th) {
        if (th instanceof CardServiceException) {
            return ((CardServiceException) th).getSW();
        }
        return -1;
    }

    public CardServiceException(String str, Throwable th) {
        this(str, th, getSW(th));
    }

    public CardServiceException(String str, Throwable th, int i) {
        super(str, th);
        this.sw = i;
    }
}
