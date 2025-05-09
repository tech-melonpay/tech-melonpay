package j0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import j0.C0871C;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22367e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22368f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public C0871C f22369g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f22370h;
    public Boolean i;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addMessage(message);
        }

        public static Notification.MessagingStyle b(CharSequence charSequence) {
            return new Notification.MessagingStyle(charSequence);
        }

        public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
            return messagingStyle.setConversationTitle(charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addHistoricMessage(message);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class c {
        public static Notification.MessagingStyle a(Person person) {
            return new Notification.MessagingStyle(person);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
            return messagingStyle.setGroupConversation(z10);
        }
    }

    @Override // j0.w
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f22369g.f22229a);
        bundle.putBundle("android.messagingStyleUser", this.f22369g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f22370h);
        if (this.f22370h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f22370h);
        }
        ArrayList arrayList = this.f22367e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", d.a(arrayList));
        }
        ArrayList arrayList2 = this.f22368f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // j0.w
    public final void b(x xVar) {
        Notification.MessagingStyle b9;
        r rVar = this.f22377a;
        boolean z10 = false;
        if (rVar == null || rVar.f22332a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                z10 = bool.booleanValue();
            }
        } else if (this.f22370h != null) {
            z10 = true;
        }
        this.i = Boolean.valueOf(z10);
        if (Build.VERSION.SDK_INT >= 28) {
            C0871C c0871c = this.f22369g;
            c0871c.getClass();
            b9 = c.a(C0871C.a.b(c0871c));
        } else {
            b9 = a.b(this.f22369g.f22229a);
        }
        Iterator it = this.f22367e.iterator();
        while (it.hasNext()) {
            a.a(b9, ((d) it.next()).c());
        }
        Iterator it2 = this.f22368f.iterator();
        while (it2.hasNext()) {
            b.a(b9, ((d) it2.next()).c());
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            a.c(b9, this.f22370h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(b9, this.i.booleanValue());
        }
        b9.setBuilder(xVar.f22382b);
    }

    @Override // j0.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // j0.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // j0.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayList = this.f22367e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f22369g = C0871C.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            C0871C c0871c = new C0871C();
            c0871c.f22229a = string;
            c0871c.f22230b = null;
            c0871c.f22231c = null;
            c0871c.f22232d = null;
            c0871c.f22233e = false;
            c0871c.f22234f = false;
            this.f22369g = c0871c;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f22370h = charSequence;
        if (charSequence == null) {
            this.f22370h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(d.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f22368f.addAll(d.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f22371a;

        /* renamed from: b, reason: collision with root package name */
        public final long f22372b;

        /* renamed from: c, reason: collision with root package name */
        public final C0871C f22373c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f22374d = new Bundle();

        /* renamed from: e, reason: collision with root package name */
        public String f22375e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f22376f;

        /* compiled from: NotificationCompat.java */
        public static class a {
            public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
            }

            public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                return message.setData(str, uri);
            }
        }

        public d(CharSequence charSequence, long j10, C0871C c0871c) {
            this.f22371a = charSequence;
            this.f22372b = j10;
            this.f22373c = c0871c;
        }

        public static Bundle[] a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) arrayList.get(i);
                dVar.getClass();
                Bundle bundle = new Bundle();
                CharSequence charSequence = dVar.f22371a;
                if (charSequence != null) {
                    bundle.putCharSequence(TextBundle.TEXT_ENTRY, charSequence);
                }
                bundle.putLong("time", dVar.f22372b);
                C0871C c0871c = dVar.f22373c;
                if (c0871c != null) {
                    bundle.putCharSequence("sender", c0871c.f22229a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(C0871C.a.b(c0871c)));
                    } else {
                        bundle.putBundle("person", c0871c.b());
                    }
                }
                String str = dVar.f22375e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = dVar.f22376f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = dVar.f22374d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i] = bundle;
            }
            return bundleArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
        
            r0.add(r12);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.ArrayList b(android.os.Parcelable[] r14) {
            /*
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r14.length
                r0.<init>(r1)
                r1 = 0
                r2 = r1
            L8:
                int r3 = r14.length
                if (r2 >= r3) goto Lb8
                r3 = r14[r2]
                boolean r4 = r3 instanceof android.os.Bundle
                if (r4 == 0) goto Lb4
                android.os.Bundle r3 = (android.os.Bundle) r3
                java.lang.String r4 = "extras"
                java.lang.String r5 = "uri"
                java.lang.String r6 = "type"
                java.lang.String r7 = "sender"
                java.lang.String r8 = "sender_person"
                java.lang.String r9 = "person"
                java.lang.String r10 = "time"
                java.lang.String r11 = "text"
                r12 = 0
                boolean r13 = r3.containsKey(r11)     // Catch: java.lang.ClassCastException -> Laf
                if (r13 == 0) goto Laf
                boolean r13 = r3.containsKey(r10)     // Catch: java.lang.ClassCastException -> Laf
                if (r13 != 0) goto L32
                goto Laf
            L32:
                boolean r13 = r3.containsKey(r9)     // Catch: java.lang.ClassCastException -> Laf
                if (r13 == 0) goto L41
                android.os.Bundle r7 = r3.getBundle(r9)     // Catch: java.lang.ClassCastException -> Laf
                j0.C r7 = j0.C0871C.a(r7)     // Catch: java.lang.ClassCastException -> Laf
                goto L78
            L41:
                boolean r9 = r3.containsKey(r8)     // Catch: java.lang.ClassCastException -> Laf
                if (r9 == 0) goto L5a
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> Laf
                r13 = 28
                if (r9 < r13) goto L5a
                android.os.Parcelable r7 = r3.getParcelable(r8)     // Catch: java.lang.ClassCastException -> Laf
                android.app.Person r7 = C1.i.e(r7)     // Catch: java.lang.ClassCastException -> Laf
                j0.C r7 = j0.C0871C.a.a(r7)     // Catch: java.lang.ClassCastException -> Laf
                goto L78
            L5a:
                boolean r8 = r3.containsKey(r7)     // Catch: java.lang.ClassCastException -> Laf
                if (r8 == 0) goto L77
                java.lang.CharSequence r7 = r3.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> Laf
                j0.C r8 = new j0.C     // Catch: java.lang.ClassCastException -> Laf
                r8.<init>()     // Catch: java.lang.ClassCastException -> Laf
                r8.f22229a = r7     // Catch: java.lang.ClassCastException -> Laf
                r8.f22230b = r12     // Catch: java.lang.ClassCastException -> Laf
                r8.f22231c = r12     // Catch: java.lang.ClassCastException -> Laf
                r8.f22232d = r12     // Catch: java.lang.ClassCastException -> Laf
                r8.f22233e = r1     // Catch: java.lang.ClassCastException -> Laf
                r8.f22234f = r1     // Catch: java.lang.ClassCastException -> Laf
                r7 = r8
                goto L78
            L77:
                r7 = r12
            L78:
                j0.v$d r8 = new j0.v$d     // Catch: java.lang.ClassCastException -> Laf
                java.lang.CharSequence r9 = r3.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> Laf
                long r10 = r3.getLong(r10)     // Catch: java.lang.ClassCastException -> Laf
                r8.<init>(r9, r10, r7)     // Catch: java.lang.ClassCastException -> Laf
                boolean r7 = r3.containsKey(r6)     // Catch: java.lang.ClassCastException -> Laf
                if (r7 == 0) goto L9f
                boolean r7 = r3.containsKey(r5)     // Catch: java.lang.ClassCastException -> Laf
                if (r7 == 0) goto L9f
                java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.ClassCastException -> Laf
                android.os.Parcelable r5 = r3.getParcelable(r5)     // Catch: java.lang.ClassCastException -> Laf
                android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> Laf
                r8.f22375e = r6     // Catch: java.lang.ClassCastException -> Laf
                r8.f22376f = r5     // Catch: java.lang.ClassCastException -> Laf
            L9f:
                boolean r5 = r3.containsKey(r4)     // Catch: java.lang.ClassCastException -> Laf
                if (r5 == 0) goto Lae
                android.os.Bundle r5 = r8.f22374d     // Catch: java.lang.ClassCastException -> Laf
                android.os.Bundle r3 = r3.getBundle(r4)     // Catch: java.lang.ClassCastException -> Laf
                r5.putAll(r3)     // Catch: java.lang.ClassCastException -> Laf
            Lae:
                r12 = r8
            Laf:
                if (r12 == 0) goto Lb4
                r0.add(r12)
            Lb4:
                int r2 = r2 + 1
                goto L8
            Lb8:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.v.d.b(android.os.Parcelable[]):java.util.ArrayList");
        }

        public final Notification.MessagingStyle.Message c() {
            Notification.MessagingStyle.Message a10;
            int i = Build.VERSION.SDK_INT;
            long j10 = this.f22372b;
            CharSequence charSequence = this.f22371a;
            C0871C c0871c = this.f22373c;
            if (i >= 28) {
                a10 = b.b(charSequence, j10, c0871c != null ? C0871C.a.b(c0871c) : null);
            } else {
                a10 = a.a(charSequence, j10, c0871c != null ? c0871c.f22229a : null);
            }
            String str = this.f22375e;
            if (str != null) {
                a.b(a10, str, this.f22376f);
            }
            return a10;
        }

        /* compiled from: NotificationCompat.java */
        public static class b {
            public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                return new Notification.MessagingStyle.Message(charSequence, j10, person);
            }

            public static Parcelable a(Person person) {
                return person;
            }
        }
    }
}
