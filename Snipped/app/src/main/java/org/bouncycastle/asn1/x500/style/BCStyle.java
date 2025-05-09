package org.bouncycastle.asn1.x500.style;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: classes2.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;

    /* renamed from: C, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24733C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;

    /* renamed from: E, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24734E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;

    /* renamed from: L, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24735L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;

    /* renamed from: O, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f24736O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier s10 = a.s("2.5.4.6");
        f24733C = s10;
        ASN1ObjectIdentifier s11 = a.s("2.5.4.10");
        f24736O = s11;
        ASN1ObjectIdentifier s12 = a.s("2.5.4.11");
        OU = s12;
        ASN1ObjectIdentifier s13 = a.s("2.5.4.12");
        T = s13;
        ASN1ObjectIdentifier s14 = a.s("2.5.4.3");
        CN = s14;
        SN = a.s("2.5.4.5");
        ASN1ObjectIdentifier s15 = a.s("2.5.4.9");
        STREET = s15;
        ASN1ObjectIdentifier s16 = a.s("2.5.4.5");
        SERIALNUMBER = s16;
        ASN1ObjectIdentifier s17 = a.s("2.5.4.7");
        f24735L = s17;
        ASN1ObjectIdentifier s18 = a.s("2.5.4.8");
        ST = s18;
        ASN1ObjectIdentifier s19 = a.s("2.5.4.4");
        SURNAME = s19;
        ASN1ObjectIdentifier s20 = a.s("2.5.4.42");
        GIVENNAME = s20;
        ASN1ObjectIdentifier s21 = a.s("2.5.4.43");
        INITIALS = s21;
        ASN1ObjectIdentifier s22 = a.s("2.5.4.44");
        GENERATION = s22;
        ASN1ObjectIdentifier s23 = a.s("2.5.4.45");
        UNIQUE_IDENTIFIER = s23;
        ASN1ObjectIdentifier s24 = a.s("2.5.4.13");
        DESCRIPTION = s24;
        ASN1ObjectIdentifier s25 = a.s("2.5.4.15");
        BUSINESS_CATEGORY = s25;
        ASN1ObjectIdentifier s26 = a.s("2.5.4.17");
        POSTAL_CODE = s26;
        ASN1ObjectIdentifier s27 = a.s("2.5.4.46");
        DN_QUALIFIER = s27;
        ASN1ObjectIdentifier s28 = a.s("2.5.4.65");
        PSEUDONYM = s28;
        ASN1ObjectIdentifier s29 = a.s("2.5.4.72");
        ROLE = s29;
        ASN1ObjectIdentifier s30 = a.s("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = s30;
        ASN1ObjectIdentifier s31 = a.s("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = s31;
        ASN1ObjectIdentifier s32 = a.s("1.3.6.1.5.5.7.9.3");
        GENDER = s32;
        ASN1ObjectIdentifier s33 = a.s("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = s33;
        ASN1ObjectIdentifier s34 = a.s("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = s34;
        ASN1ObjectIdentifier s35 = a.s("1.3.36.8.3.14");
        NAME_AT_BIRTH = s35;
        ASN1ObjectIdentifier s36 = a.s("2.5.4.16");
        POSTAL_ADDRESS = s36;
        DMD_NAME = a.s("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        f24734E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(s10, "C");
        hashtable.put(s11, "O");
        hashtable.put(s13, "T");
        hashtable.put(s12, "OU");
        hashtable.put(s14, "CN");
        hashtable.put(s17, "L");
        hashtable.put(s18, "ST");
        hashtable.put(s16, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(s15, "STREET");
        hashtable.put(s19, "SURNAME");
        hashtable.put(s20, "GIVENNAME");
        hashtable.put(s21, "INITIALS");
        hashtable.put(s22, "GENERATION");
        hashtable.put(s24, "DESCRIPTION");
        hashtable.put(s29, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(s23, "UniqueIdentifier");
        hashtable.put(s27, "DN");
        hashtable.put(s28, "Pseudonym");
        hashtable.put(s36, "PostalAddress");
        hashtable.put(s35, "NameAtBirth");
        hashtable.put(s33, "CountryOfCitizenship");
        hashtable.put(s34, "CountryOfResidence");
        hashtable.put(s32, "Gender");
        hashtable.put(s31, "PlaceOfBirth");
        hashtable.put(s30, "DateOfBirth");
        hashtable.put(s26, "PostalCode");
        hashtable.put(s25, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", s10);
        hashtable2.put("o", s11);
        hashtable2.put("t", s13);
        hashtable2.put("ou", s12);
        hashtable2.put("cn", s14);
        hashtable2.put("l", s17);
        hashtable2.put("st", s18);
        hashtable2.put("sn", s19);
        hashtable2.put("serialnumber", s16);
        hashtable2.put("street", s15);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", s19);
        hashtable2.put("givenname", s20);
        hashtable2.put("initials", s21);
        hashtable2.put("generation", s22);
        hashtable2.put("description", s24);
        hashtable2.put("role", s29);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", s23);
        hashtable2.put("dn", s27);
        hashtable2.put("pseudonym", s28);
        hashtable2.put("postaladdress", s36);
        hashtable2.put("nameatbirth", s35);
        hashtable2.put("countryofcitizenship", s33);
        hashtable2.put("countryofresidence", s34);
        hashtable2.put("gender", s32);
        hashtable2.put("placeofbirth", s31);
        hashtable2.put("dateofbirth", s30);
        hashtable2.put("postalcode", s26);
        hashtable2.put("businesscategory", s25);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f24733C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SN) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
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
        boolean z10 = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
