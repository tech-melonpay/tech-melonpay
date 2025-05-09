package org.bouncycastle.asn1.x500.style;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes2.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24737c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24738l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* renamed from: o, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24739o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier s10 = a.s("2.5.4.15");
        businessCategory = s10;
        ASN1ObjectIdentifier s11 = a.s("2.5.4.6");
        f24737c = s11;
        ASN1ObjectIdentifier s12 = a.s("2.5.4.3");
        cn = s12;
        ASN1ObjectIdentifier s13 = a.s("0.9.2342.19200300.100.1.25");
        dc = s13;
        ASN1ObjectIdentifier s14 = a.s("2.5.4.13");
        description = s14;
        ASN1ObjectIdentifier s15 = a.s("2.5.4.27");
        destinationIndicator = s15;
        ASN1ObjectIdentifier s16 = a.s("2.5.4.49");
        distinguishedName = s16;
        ASN1ObjectIdentifier s17 = a.s("2.5.4.46");
        dnQualifier = s17;
        ASN1ObjectIdentifier s18 = a.s("2.5.4.47");
        enhancedSearchGuide = s18;
        ASN1ObjectIdentifier s19 = a.s("2.5.4.23");
        facsimileTelephoneNumber = s19;
        ASN1ObjectIdentifier s20 = a.s("2.5.4.44");
        generationQualifier = s20;
        ASN1ObjectIdentifier s21 = a.s("2.5.4.42");
        givenName = s21;
        ASN1ObjectIdentifier s22 = a.s("2.5.4.51");
        houseIdentifier = s22;
        ASN1ObjectIdentifier s23 = a.s("2.5.4.43");
        initials = s23;
        ASN1ObjectIdentifier s24 = a.s("2.5.4.25");
        internationalISDNNumber = s24;
        ASN1ObjectIdentifier s25 = a.s("2.5.4.7");
        f24738l = s25;
        ASN1ObjectIdentifier s26 = a.s("2.5.4.31");
        member = s26;
        ASN1ObjectIdentifier s27 = a.s("2.5.4.41");
        name = s27;
        ASN1ObjectIdentifier s28 = a.s("2.5.4.10");
        f24739o = s28;
        ASN1ObjectIdentifier s29 = a.s("2.5.4.11");
        ou = s29;
        ASN1ObjectIdentifier s30 = a.s("2.5.4.32");
        owner = s30;
        ASN1ObjectIdentifier s31 = a.s("2.5.4.19");
        physicalDeliveryOfficeName = s31;
        ASN1ObjectIdentifier s32 = a.s("2.5.4.16");
        postalAddress = s32;
        ASN1ObjectIdentifier s33 = a.s("2.5.4.17");
        postalCode = s33;
        ASN1ObjectIdentifier s34 = a.s("2.5.4.18");
        postOfficeBox = s34;
        ASN1ObjectIdentifier s35 = a.s("2.5.4.28");
        preferredDeliveryMethod = s35;
        ASN1ObjectIdentifier s36 = a.s("2.5.4.26");
        registeredAddress = s36;
        ASN1ObjectIdentifier s37 = a.s("2.5.4.33");
        roleOccupant = s37;
        ASN1ObjectIdentifier s38 = a.s("2.5.4.14");
        searchGuide = s38;
        ASN1ObjectIdentifier s39 = a.s("2.5.4.34");
        seeAlso = s39;
        ASN1ObjectIdentifier s40 = a.s("2.5.4.5");
        serialNumber = s40;
        ASN1ObjectIdentifier s41 = a.s("2.5.4.4");
        sn = s41;
        ASN1ObjectIdentifier s42 = a.s("2.5.4.8");
        st = s42;
        ASN1ObjectIdentifier s43 = a.s("2.5.4.9");
        street = s43;
        ASN1ObjectIdentifier s44 = a.s("2.5.4.20");
        telephoneNumber = s44;
        ASN1ObjectIdentifier s45 = a.s("2.5.4.22");
        teletexTerminalIdentifier = s45;
        ASN1ObjectIdentifier s46 = a.s("2.5.4.21");
        telexNumber = s46;
        ASN1ObjectIdentifier s47 = a.s("2.5.4.12");
        title = s47;
        ASN1ObjectIdentifier s48 = a.s("0.9.2342.19200300.100.1.1");
        uid = s48;
        ASN1ObjectIdentifier s49 = a.s("2.5.4.50");
        uniqueMember = s49;
        ASN1ObjectIdentifier s50 = a.s("2.5.4.35");
        userPassword = s50;
        ASN1ObjectIdentifier s51 = a.s("2.5.4.24");
        x121Address = s51;
        ASN1ObjectIdentifier s52 = a.s("2.5.4.45");
        x500UniqueIdentifier = s52;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(s10, "businessCategory");
        hashtable.put(s11, "c");
        hashtable.put(s12, "cn");
        hashtable.put(s13, "dc");
        hashtable.put(s14, "description");
        hashtable.put(s15, "destinationIndicator");
        hashtable.put(s16, "distinguishedName");
        hashtable.put(s17, "dnQualifier");
        hashtable.put(s18, "enhancedSearchGuide");
        hashtable.put(s19, "facsimileTelephoneNumber");
        hashtable.put(s20, "generationQualifier");
        hashtable.put(s21, "givenName");
        hashtable.put(s22, "houseIdentifier");
        hashtable.put(s23, "initials");
        hashtable.put(s24, "internationalISDNNumber");
        hashtable.put(s25, "l");
        hashtable.put(s26, "member");
        hashtable.put(s27, AppMeasurementSdk.ConditionalUserProperty.NAME);
        hashtable.put(s28, "o");
        hashtable.put(s29, "ou");
        hashtable.put(s30, "owner");
        hashtable.put(s31, "physicalDeliveryOfficeName");
        hashtable.put(s32, "postalAddress");
        hashtable.put(s33, "postalCode");
        hashtable.put(s34, "postOfficeBox");
        hashtable.put(s35, "preferredDeliveryMethod");
        hashtable.put(s36, "registeredAddress");
        hashtable.put(s37, "roleOccupant");
        hashtable.put(s38, "searchGuide");
        hashtable.put(s39, "seeAlso");
        hashtable.put(s40, "serialNumber");
        hashtable.put(s41, "sn");
        hashtable.put(s42, "st");
        hashtable.put(s43, "street");
        hashtable.put(s44, "telephoneNumber");
        hashtable.put(s45, "teletexTerminalIdentifier");
        hashtable.put(s46, "telexNumber");
        hashtable.put(s47, MessageBundle.TITLE_ENTRY);
        hashtable.put(s48, "uid");
        hashtable.put(s49, "uniqueMember");
        hashtable.put(s50, "userPassword");
        hashtable.put(s51, "x121Address");
        hashtable.put(s52, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", s10);
        hashtable2.put("c", s11);
        hashtable2.put("cn", s12);
        hashtable2.put("dc", s13);
        hashtable2.put("description", s14);
        hashtable2.put("destinationindicator", s15);
        hashtable2.put("distinguishedname", s16);
        hashtable2.put("dnqualifier", s17);
        hashtable2.put("enhancedsearchguide", s18);
        hashtable2.put("facsimiletelephonenumber", s19);
        hashtable2.put("generationqualifier", s20);
        hashtable2.put("givenname", s21);
        hashtable2.put("houseidentifier", s22);
        hashtable2.put("initials", s23);
        hashtable2.put("internationalisdnnumber", s24);
        hashtable2.put("l", s25);
        hashtable2.put("member", s26);
        hashtable2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, s27);
        hashtable2.put("o", s28);
        hashtable2.put("ou", s29);
        hashtable2.put("owner", s30);
        hashtable2.put("physicaldeliveryofficename", s31);
        hashtable2.put("postaladdress", s32);
        hashtable2.put("postalcode", s33);
        hashtable2.put("postofficebox", s34);
        hashtable2.put("preferreddeliverymethod", s35);
        hashtable2.put("registeredaddress", s36);
        hashtable2.put("roleoccupant", s37);
        hashtable2.put("searchguide", s38);
        hashtable2.put("seealso", s39);
        hashtable2.put("serialnumber", s40);
        hashtable2.put("sn", s41);
        hashtable2.put("st", s42);
        hashtable2.put("street", s43);
        hashtable2.put("telephonenumber", s44);
        hashtable2.put("teletexterminalidentifier", s45);
        hashtable2.put("telexnumber", s46);
        hashtable2.put(MessageBundle.TITLE_ENTRY, s47);
        hashtable2.put("uid", s48);
        hashtable2.put("uniquemember", s49);
        hashtable2.put("userpassword", s50);
        hashtable2.put("x121address", s51);
        hashtable2.put("x500uniqueidentifier", s52);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f24737c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rDNsFromString.length];
        for (int i = 0; i != rDNsFromString.length; i++) {
            rdnArr[(r0 - i) - 1] = rDNsFromString[i];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) DefaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z10 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
