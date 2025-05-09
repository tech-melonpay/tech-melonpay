package org.jmrtd.lds.icao;

import com.bumptech.glide.load.Key;
import com.google.android.gms.measurement.internal.a;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.jmrtd.lds.DataGroup;
import s3.b;

/* loaded from: classes3.dex */
public class DG11File extends DataGroup {
    public static final int CONTENT_SPECIFIC_CONSTRUCTED_TAG = 160;
    public static final int COUNT_TAG = 2;
    public static final int CUSTODY_INFORMATION_TAG = 24344;
    public static final int FULL_DATE_OF_BIRTH_TAG = 24363;
    public static final int FULL_NAME_TAG = 24334;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int OTHER_NAME_TAG = 24335;
    public static final int OTHER_VALID_TD_NUMBERS_TAG = 24343;
    public static final int PERMANENT_ADDRESS_TAG = 24386;
    public static final int PERSONAL_NUMBER_TAG = 24336;
    public static final int PERSONAL_SUMMARY_TAG = 24341;
    public static final int PLACE_OF_BIRTH_TAG = 24337;
    public static final int PROFESSION_TAG = 24339;
    public static final int PROOF_OF_CITIZENSHIP_TAG = 24342;
    private static final String SDF = "yyyyMMdd";
    public static final int TAG_LIST_TAG = 92;
    public static final int TELEPHONE_TAG = 24338;
    public static final int TITLE_TAG = 24340;
    private static final long serialVersionUID = 8566312538928662937L;
    private String custodyInformation;
    private String fullDateOfBirth;
    private String nameOfHolder;
    private List<String> otherNames;
    private List<String> otherValidTDNumbers;
    private List<String> permanentAddress;
    private String personalNumber;
    private String personalSummary;
    private List<String> placeOfBirth;
    private String profession;
    private byte[] proofOfCitizenship;
    private List<Integer> tagPresenceList;
    private String telephone;
    private String title;

    public DG11File(InputStream inputStream) {
        super(107, inputStream);
    }

    private void parseCustodyInformation(byte[] bArr) {
        try {
            this.custodyInformation = new String(bArr, Key.STRING_CHARSET_NAME).trim();
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            this.custodyInformation = new String(bArr).trim();
        }
    }

    private void parseFullDateOfBirth(byte[] bArr) {
        String str;
        if (bArr.length == 4) {
            str = Hex.bytesToHexString(bArr);
        } else {
            String str2 = new String(bArr);
            try {
                str = new String(bArr, Key.STRING_CHARSET_NAME);
            } catch (UnsupportedEncodingException e10) {
                LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
                str = str2;
            }
        }
        this.fullDateOfBirth = str;
    }

    private void parseNameOfHolder(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.nameOfHolder = str.trim();
    }

    private synchronized void parseOtherName(byte[] bArr) {
        if (this.otherNames == null) {
            this.otherNames = new ArrayList();
        }
        try {
            this.otherNames.add(new String(bArr, Key.STRING_CHARSET_NAME).trim());
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            this.otherNames.add(new String(bArr).trim());
        }
    }

    private void parseOtherValidTDNumbers(byte[] bArr) {
        String trim = new String(bArr).trim();
        try {
            trim = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.otherValidTDNumbers = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(trim, "<");
        while (stringTokenizer.hasMoreTokens()) {
            this.otherValidTDNumbers.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parsePermanentAddress(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.permanentAddress = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.permanentAddress.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parsePersonalNumber(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.personalNumber = str.trim();
    }

    private void parsePersonalSummary(byte[] bArr) {
        try {
            this.personalSummary = new String(bArr, Key.STRING_CHARSET_NAME).trim();
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            this.personalSummary = new String(bArr).trim();
        }
    }

    private void parsePlaceOfBirth(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.placeOfBirth = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.placeOfBirth.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parseProfession(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.profession = str.trim();
    }

    private void parseProofOfCitizenShip(byte[] bArr) {
        this.proofOfCitizenship = bArr;
    }

    private void parseTelephone(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.telephone = str.replace("<", " ").trim();
    }

    private void parseTitle(byte[] bArr) {
        try {
            this.title = new String(bArr, Key.STRING_CHARSET_NAME).trim();
        } catch (UnsupportedEncodingException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            this.title = new String(bArr).trim();
        }
    }

    private void readField(int i, TLVInputStream tLVInputStream) {
        int readTag = tLVInputStream.readTag();
        if (readTag == 160) {
            tLVInputStream.readLength();
            int readTag2 = tLVInputStream.readTag();
            if (readTag2 != 2) {
                throw new IllegalArgumentException("Expected " + Integer.toHexString(2) + ", found " + Integer.toHexString(readTag2));
            }
            int readLength = tLVInputStream.readLength();
            if (readLength != 1) {
                throw new IllegalArgumentException(a.g(readLength, "Expected length 1 count length, found "));
            }
            byte[] readValue = tLVInputStream.readValue();
            if (readValue == null || readValue.length != 1) {
                throw new IllegalArgumentException("Number of content specific fields should be encoded in single byte, found " + Arrays.toString(readValue));
            }
            int i9 = readValue[0] & 255;
            for (int i10 = 0; i10 < i9; i10++) {
                int readTag3 = tLVInputStream.readTag();
                if (readTag3 != 24335) {
                    throw new IllegalArgumentException("Expected " + Integer.toHexString(OTHER_NAME_TAG) + ", found " + Integer.toHexString(readTag3));
                }
                tLVInputStream.readLength();
                parseOtherName(tLVInputStream.readValue());
            }
            return;
        }
        if (readTag != i) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(i) + ", but found " + Integer.toHexString(readTag));
        }
        tLVInputStream.readLength();
        byte[] readValue2 = tLVInputStream.readValue();
        if (readTag == 24363) {
            parseFullDateOfBirth(readValue2);
            return;
        }
        if (readTag == 24386) {
            parsePermanentAddress(readValue2);
            return;
        }
        switch (readTag) {
            case FULL_NAME_TAG /* 24334 */:
                parseNameOfHolder(readValue2);
                return;
            case OTHER_NAME_TAG /* 24335 */:
                parseOtherName(readValue2);
                return;
            case PERSONAL_NUMBER_TAG /* 24336 */:
                parsePersonalNumber(readValue2);
                return;
            case PLACE_OF_BIRTH_TAG /* 24337 */:
                parsePlaceOfBirth(readValue2);
                return;
            case TELEPHONE_TAG /* 24338 */:
                parseTelephone(readValue2);
                return;
            case PROFESSION_TAG /* 24339 */:
                parseProfession(readValue2);
                return;
            case TITLE_TAG /* 24340 */:
                parseTitle(readValue2);
                return;
            case PERSONAL_SUMMARY_TAG /* 24341 */:
                parsePersonalSummary(readValue2);
                return;
            case PROOF_OF_CITIZENSHIP_TAG /* 24342 */:
                parseProofOfCitizenShip(readValue2);
                return;
            case OTHER_VALID_TD_NUMBERS_TAG /* 24343 */:
                parseOtherValidTDNumbers(readValue2);
                return;
            case CUSTODY_INFORMATION_TAG /* 24344 */:
                parseCustodyInformation(readValue2);
                return;
            default:
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.g(readTag, new StringBuilder("Unknown field tag in DG11: ")));
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(getClass())) {
            return toString().equals(((DG11File) obj).toString());
        }
        return false;
    }

    public String getCustodyInformation() {
        return this.custodyInformation;
    }

    public String getFullDateOfBirth() {
        return this.fullDateOfBirth;
    }

    public String getNameOfHolder() {
        return this.nameOfHolder;
    }

    public List<String> getOtherNames() {
        return this.otherNames == null ? new ArrayList() : new ArrayList(this.otherNames);
    }

    public List<String> getOtherValidTDNumbers() {
        return this.otherValidTDNumbers;
    }

    public List<String> getPermanentAddress() {
        return this.permanentAddress;
    }

    public String getPersonalNumber() {
        return this.personalNumber;
    }

    public String getPersonalSummary() {
        return this.personalSummary;
    }

    public List<String> getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public String getProfession() {
        return this.profession;
    }

    public byte[] getProofOfCitizenship() {
        return this.proofOfCitizenship;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public int getTag() {
        return 107;
    }

    public List<Integer> getTagPresenceList() {
        List<Integer> list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(12);
        this.tagPresenceList = arrayList;
        if (this.nameOfHolder != null) {
            arrayList.add(Integer.valueOf(FULL_NAME_TAG));
        }
        List<String> list2 = this.otherNames;
        if (list2 != null && !list2.isEmpty()) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_NAME_TAG));
        }
        if (this.personalNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_NUMBER_TAG));
        }
        if (this.fullDateOfBirth != null) {
            this.tagPresenceList.add(Integer.valueOf(FULL_DATE_OF_BIRTH_TAG));
        }
        List<String> list3 = this.placeOfBirth;
        if (list3 != null && !list3.isEmpty()) {
            this.tagPresenceList.add(Integer.valueOf(PLACE_OF_BIRTH_TAG));
        }
        List<String> list4 = this.permanentAddress;
        if (list4 != null && !list4.isEmpty()) {
            this.tagPresenceList.add(Integer.valueOf(PERMANENT_ADDRESS_TAG));
        }
        if (this.telephone != null) {
            this.tagPresenceList.add(Integer.valueOf(TELEPHONE_TAG));
        }
        if (this.profession != null) {
            this.tagPresenceList.add(Integer.valueOf(PROFESSION_TAG));
        }
        if (this.title != null) {
            this.tagPresenceList.add(Integer.valueOf(TITLE_TAG));
        }
        if (this.personalSummary != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_SUMMARY_TAG));
        }
        if (this.proofOfCitizenship != null) {
            this.tagPresenceList.add(Integer.valueOf(PROOF_OF_CITIZENSHIP_TAG));
        }
        List<String> list5 = this.otherValidTDNumbers;
        if (list5 != null && !list5.isEmpty()) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_VALID_TD_NUMBERS_TAG));
        }
        if (this.custodyInformation != null) {
            this.tagPresenceList.add(Integer.valueOf(CUSTODY_INFORMATION_TAG));
        }
        return this.tagPresenceList;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 111;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (tLVInputStream.readTag() != 92) {
            throw new IllegalArgumentException("Expected tag list in DG11");
        }
        int readLength = tLVInputStream.readLength();
        int i = readLength / 2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tLVInputStream.readValue());
        try {
            ArrayList arrayList = new ArrayList(i + 1);
            int i9 = 0;
            while (i9 < readLength) {
                int readTag = new TLVInputStream(byteArrayInputStream).readTag();
                i9 += TLVUtil.getTagLength(readTag);
                arrayList.add(Integer.valueOf(readTag));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                readField(((Integer) it.next()).intValue(), tLVInputStream);
            }
            byteArrayInputStream.close();
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DG11File [");
        String str = this.nameOfHolder;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(", ");
        List<String> list = this.otherNames;
        String str2 = "[]";
        sb2.append((list == null || list.isEmpty()) ? "[]" : this.otherNames);
        sb2.append(", ");
        String str3 = this.personalNumber;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", ");
        String str4 = this.fullDateOfBirth;
        if (str4 == null) {
            str4 = "";
        }
        sb2.append(str4);
        sb2.append(", ");
        List<String> list2 = this.placeOfBirth;
        sb2.append((list2 == null || list2.isEmpty()) ? "[]" : this.placeOfBirth.toString());
        sb2.append(", ");
        List<String> list3 = this.permanentAddress;
        sb2.append((list3 == null || list3.isEmpty()) ? "[]" : this.permanentAddress.toString());
        sb2.append(", ");
        String str5 = this.telephone;
        if (str5 == null) {
            str5 = "";
        }
        sb2.append(str5);
        sb2.append(", ");
        String str6 = this.profession;
        if (str6 == null) {
            str6 = "";
        }
        sb2.append(str6);
        sb2.append(", ");
        String str7 = this.title;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        sb2.append(", ");
        String str8 = this.personalSummary;
        if (str8 == null) {
            str8 = "";
        }
        sb2.append(str8);
        sb2.append(", ");
        sb2.append(this.proofOfCitizenship == null ? "" : b.m(new StringBuilder("image ("), this.proofOfCitizenship.length, ")"));
        sb2.append(", ");
        List<String> list4 = this.otherValidTDNumbers;
        if (list4 != null && !list4.isEmpty()) {
            str2 = this.otherValidTDNumbers.toString();
        }
        sb2.append(str2);
        sb2.append(", ");
        String str9 = this.custodyInformation;
        return androidx.camera.core.impl.utils.a.n(sb2, str9 != null ? str9 : "", "]");
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(92);
        DataOutputStream dataOutputStream = new DataOutputStream(tLVOutputStream);
        List<Integer> tagPresenceList = getTagPresenceList();
        Iterator<Integer> it = tagPresenceList.iterator();
        while (it.hasNext()) {
            dataOutputStream.writeShort(it.next().intValue());
        }
        dataOutputStream.flush();
        tLVOutputStream.writeValueEnd();
        Iterator<Integer> it2 = tagPresenceList.iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            if (intValue != 24363) {
                boolean z10 = true;
                if (intValue != 24386) {
                    switch (intValue) {
                        case FULL_NAME_TAG /* 24334 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.nameOfHolder.trim().getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case OTHER_NAME_TAG /* 24335 */:
                            if (this.otherNames == null) {
                                this.otherNames = new ArrayList();
                            }
                            tLVOutputStream.writeTag(160);
                            tLVOutputStream.writeTag(2);
                            tLVOutputStream.write(this.otherNames.size());
                            tLVOutputStream.writeValueEnd();
                            for (String str : this.otherNames) {
                                tLVOutputStream.writeTag(OTHER_NAME_TAG);
                                tLVOutputStream.writeValue(str.trim().getBytes(Key.STRING_CHARSET_NAME));
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case PERSONAL_NUMBER_TAG /* 24336 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.personalNumber.trim().getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case PLACE_OF_BIRTH_TAG /* 24337 */:
                            tLVOutputStream.writeTag(intValue);
                            for (String str2 : this.placeOfBirth) {
                                if (str2 != null) {
                                    if (z10) {
                                        z10 = false;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(str2.trim().getBytes(Key.STRING_CHARSET_NAME));
                                }
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case TELEPHONE_TAG /* 24338 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.telephone.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case PROFESSION_TAG /* 24339 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.profession.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case TITLE_TAG /* 24340 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.title.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case PERSONAL_SUMMARY_TAG /* 24341 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.personalSummary.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        case PROOF_OF_CITIZENSHIP_TAG /* 24342 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.proofOfCitizenship);
                            break;
                        case OTHER_VALID_TD_NUMBERS_TAG /* 24343 */:
                            tLVOutputStream.writeTag(intValue);
                            for (String str3 : this.otherValidTDNumbers) {
                                if (str3 != null) {
                                    if (z10) {
                                        z10 = false;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(str3.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                                }
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case CUSTODY_INFORMATION_TAG /* 24344 */:
                            tLVOutputStream.writeTag(intValue);
                            tLVOutputStream.writeValue(this.custodyInformation.trim().replace(' ', '<').getBytes(Key.STRING_CHARSET_NAME));
                            break;
                        default:
                            throw new IllegalStateException(androidx.camera.core.impl.utils.a.g(intValue, new StringBuilder("Unknown tag in DG11: ")));
                    }
                } else {
                    tLVOutputStream.writeTag(intValue);
                    for (String str4 : this.permanentAddress) {
                        if (str4 != null) {
                            if (z10) {
                                z10 = false;
                            } else {
                                tLVOutputStream.write(60);
                            }
                            tLVOutputStream.write(str4.trim().getBytes(Key.STRING_CHARSET_NAME));
                        }
                    }
                    tLVOutputStream.writeValueEnd();
                }
            } else {
                tLVOutputStream.writeTag(intValue);
                tLVOutputStream.writeValue(this.fullDateOfBirth.getBytes(Key.STRING_CHARSET_NAME));
            }
        }
    }

    public DG11File(String str, List<String> list, String str2, Date date, List<String> list2, List<String> list3, String str3, String str4, String str5, String str6, byte[] bArr, List<String> list4, String str7) {
        this(str, list, str2, new SimpleDateFormat(SDF).format(date), list2, list3, str3, str4, str5, str6, bArr, list4, str7);
    }

    public DG11File(String str, List<String> list, String str2, String str3, List<String> list2, List<String> list3, String str4, String str5, String str6, String str7, byte[] bArr, List<String> list4, String str8) {
        super(107);
        this.nameOfHolder = str;
        this.otherNames = list == null ? new ArrayList() : new ArrayList(list);
        this.personalNumber = str2;
        this.fullDateOfBirth = str3;
        this.placeOfBirth = list2 == null ? new ArrayList() : new ArrayList(list2);
        this.permanentAddress = list3;
        this.telephone = str4;
        this.profession = str5;
        this.title = str6;
        this.personalSummary = str7;
        this.proofOfCitizenship = bArr;
        this.otherValidTDNumbers = list4 == null ? new ArrayList() : new ArrayList(list4);
        this.custodyInformation = str8;
    }
}
