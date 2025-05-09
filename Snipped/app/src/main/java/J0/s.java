package j0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.luminary.mobile.R;
import j0.C0871C;
import j0.m;
import k0.C0913a;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: e, reason: collision with root package name */
    public int f22357e;

    /* renamed from: f, reason: collision with root package name */
    public C0871C f22358f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f22359g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f22360h;
    public PendingIntent i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22361j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f22362k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f22363l;

    /* renamed from: m, reason: collision with root package name */
    public IconCompat f22364m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f22365n;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class d {
        public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
            return Notification.CallStyle.forOngoingCall(person, pendingIntent);
        }

        public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
        }

        public static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
            return callStyle.setAnswerButtonColorHint(i);
        }

        public static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
            return callStyle.setDeclineButtonColorHint(i);
        }

        public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
            return callStyle.setIsVideo(z10);
        }

        public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
            return callStyle.setVerificationIcon(icon);
        }

        public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
            return callStyle.setVerificationText(charSequence);
        }
    }

    @Override // j0.w
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f22357e);
        bundle.putBoolean("android.callIsVideo", this.f22361j);
        C0871C c0871c = this.f22358f;
        if (c0871c != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", c.b(C0871C.a.b(c0871c)));
            } else {
                bundle.putParcelable("android.callPersonCompat", c0871c.b());
            }
        }
        IconCompat iconCompat = this.f22364m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", b.a(iconCompat.f(this.f22377a.f22332a)));
        }
        bundle.putCharSequence("android.verificationText", this.f22365n);
        bundle.putParcelable("android.answerIntent", this.f22359g);
        bundle.putParcelable("android.declineIntent", this.f22360h);
        bundle.putParcelable("android.hangUpIntent", this.i);
        Integer num = this.f22362k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f22363l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // j0.w
    public final void b(x xVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = xVar.f22382b;
        String str = null;
        r5 = null;
        Notification.CallStyle a10 = null;
        if (i < 31) {
            C0871C c0871c = this.f22358f;
            builder.setContentTitle(c0871c != null ? c0871c.f22229a : null);
            Bundle bundle = this.f22377a.f22317B;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f22377a.f22317B.getCharSequence("android.text");
            if (charSequence == null) {
                int i9 = this.f22357e;
                if (i9 == 1) {
                    str = this.f22377a.f22332a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i9 == 2) {
                    str = this.f22377a.f22332a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i9 == 3) {
                    str = this.f22377a.f22332a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = str;
            }
            builder.setContentText(charSequence);
            C0871C c0871c2 = this.f22358f;
            if (c0871c2 != null) {
                IconCompat iconCompat = c0871c2.f22230b;
                if (iconCompat != null) {
                    b.b(builder, iconCompat.f(this.f22377a.f22332a));
                }
                if (i >= 28) {
                    C0871C c0871c3 = this.f22358f;
                    c0871c3.getClass();
                    c.a(builder, C0871C.a.b(c0871c3));
                } else {
                    a.a(builder, this.f22358f.f22231c);
                }
            }
            a.b(builder, "call");
            return;
        }
        int i10 = this.f22357e;
        if (i10 == 1) {
            C0871C c0871c4 = this.f22358f;
            c0871c4.getClass();
            a10 = d.a(C0871C.a.b(c0871c4), this.f22360h, this.f22359g);
        } else if (i10 == 2) {
            C0871C c0871c5 = this.f22358f;
            c0871c5.getClass();
            a10 = d.b(C0871C.a.b(c0871c5), this.i);
        } else if (i10 == 3) {
            C0871C c0871c6 = this.f22358f;
            c0871c6.getClass();
            a10 = d.c(C0871C.a.b(c0871c6), this.i, this.f22359g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f22357e));
        }
        if (a10 != null) {
            a10.setBuilder(builder);
            Integer num = this.f22362k;
            if (num != null) {
                d.d(a10, num.intValue());
            }
            Integer num2 = this.f22363l;
            if (num2 != null) {
                d.e(a10, num2.intValue());
            }
            d.h(a10, this.f22365n);
            IconCompat iconCompat2 = this.f22364m;
            if (iconCompat2 != null) {
                d.g(a10, iconCompat2.f(this.f22377a.f22332a));
            }
            d.f(a10, this.f22361j);
        }
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // j0.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f22357e = bundle.getInt("android.callType");
        this.f22361j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f22358f = C0871C.a.a(C1.i.e(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f22358f = C0871C.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.f6489k;
            this.f22364m = IconCompat.a.a(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f22364m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f22365n = bundle.getCharSequence("android.verificationText");
        this.f22359g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f22360h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.f22362k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f22363l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final m g(int i, int i9, Integer num, int i10, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(C0913a.getColor(this.f22377a.f22332a, i10));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f22377a.f22332a.getResources().getString(i9));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f22377a.f22332a;
        PorterDuff.Mode mode = IconCompat.f6489k;
        context.getClass();
        m a10 = new m.a(IconCompat.b(context.getResources(), context.getPackageName(), i), spannableStringBuilder, pendingIntent).a();
        a10.f22278a.putBoolean("key_action_priority", true);
        return a10;
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static void b(Notification.Builder builder, Icon icon) {
            builder.setLargeIcon(icon);
        }

        public static Parcelable a(Icon icon) {
            return icon;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Parcelable b(Person person) {
            return person;
        }
    }
}
