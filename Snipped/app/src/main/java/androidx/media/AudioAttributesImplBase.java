package androidx.media;

import com.google.android.gms.measurement.internal.a;
import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f7123a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7124b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7125c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7126d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f7124b == audioAttributesImplBase.f7124b) {
            int i9 = this.f7125c;
            int i10 = audioAttributesImplBase.f7125c;
            int i11 = audioAttributesImplBase.f7126d;
            if (i11 == -1) {
                int i12 = audioAttributesImplBase.f7123a;
                int i13 = AudioAttributesCompat.f7119b;
                if ((i10 & 1) != 1) {
                    if ((i10 & 4) != 4) {
                        switch (i12) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i11;
            }
            if (i == 6) {
                i10 |= 4;
            } else if (i == 7) {
                i10 |= 1;
            }
            if (i9 == (i10 & 273) && this.f7123a == audioAttributesImplBase.f7123a && this.f7126d == i11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7124b), Integer.valueOf(this.f7125c), Integer.valueOf(this.f7123a), Integer.valueOf(this.f7126d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f7126d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f7126d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i = this.f7123a;
        int i9 = AudioAttributesCompat.f7119b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = a.g(i, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f7124b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f7125c).toUpperCase());
        return sb2.toString();
    }
}
