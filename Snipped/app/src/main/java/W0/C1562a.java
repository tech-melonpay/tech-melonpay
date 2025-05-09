package w0;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FindAddress.java */
/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0475a[] f30794a = {new C0475a(99, 99, -1, -1), new C0475a(35, 36, -1, -1), new C0475a(71, 72, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(85, 86, -1, -1), new C0475a(90, 96, -1, -1), new C0475a(80, 81, -1, -1), new C0475a(6, 6, -1, -1), new C0475a(20, 20, -1, -1), new C0475a(19, 19, -1, -1), new C0475a(32, 34, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(30, 31, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(50, 52, -1, -1), new C0475a(83, 83, -1, -1), new C0475a(60, 62, -1, -1), new C0475a(46, 47, -1, -1), new C0475a(66, 67, 73, -1), new C0475a(40, 42, -1, -1), new C0475a(70, 71, -1, -1), new C0475a(1, 2, -1, -1), new C0475a(20, 21, -1, -1), new C0475a(3, 4, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(48, 49, -1, -1), new C0475a(55, 56, -1, -1), new C0475a(63, 65, -1, -1), new C0475a(96, 96, -1, -1), new C0475a(38, 39, -1, -1), new C0475a(55, 56, -1, -1), new C0475a(27, 28, -1, -1), new C0475a(58, 58, -1, -1), new C0475a(68, 69, -1, -1), new C0475a(3, 4, -1, -1), new C0475a(7, 8, -1, -1), new C0475a(87, 88, 86, -1), new C0475a(88, 89, 96, -1), new C0475a(10, 14, 0, 6), new C0475a(43, 45, -1, -1), new C0475a(73, 74, -1, -1), new C0475a(97, 97, -1, -1), new C0475a(15, 19, -1, -1), new C0475a(6, 6, 0, 9), new C0475a(96, 96, -1, -1), new C0475a(2, 2, -1, -1), new C0475a(29, 29, -1, -1), new C0475a(57, 57, -1, -1), new C0475a(37, 38, -1, -1), new C0475a(75, 79, 87, 88), new C0475a(84, 84, -1, -1), new C0475a(22, 24, 20, -1), new C0475a(6, 9, -1, -1), new C0475a(5, 5, -1, -1), new C0475a(98, 99, -1, -1), new C0475a(53, 54, -1, -1), new C0475a(24, 26, -1, -1), new C0475a(82, 83, -1, -1)};

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f30795b = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f30796c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f30797d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f30798e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f30799f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f30800g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* compiled from: FindAddress.java */
    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public static class C0475a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30802b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30803c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30804d;

        public C0475a(int i, int i9, int i10, int i11) {
            this.f30801a = i;
            this.f30802b = i9;
            this.f30803c = i10;
            this.f30804d = i11;
        }
    }

    public static boolean a(String str) {
        int i = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (Character.isDigit(str.charAt(i9))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f30799f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i10 = parseInt % 10;
        if (i10 == 1) {
            return lowerCase.equals(parseInt % 100 != 11 ? "st" : "th");
        }
        if (i10 == 2) {
            return lowerCase.equals(parseInt % 100 != 12 ? "nd" : "th");
        }
        if (i10 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(parseInt % 100 != 13 ? "rd" : "th");
    }
}
