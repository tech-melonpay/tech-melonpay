package org.jmrtd.lds.icao;

import com.bumptech.glide.load.Key;
import com.google.android.gms.measurement.internal.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import net.sf.scuba.data.Gender;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.lds.AbstractLDSInfo;
import s3.b;

/* loaded from: classes3.dex */
public class MRZInfo extends AbstractLDSInfo {
    public static final int DOC_TYPE_ID1 = 1;
    public static final int DOC_TYPE_ID2 = 2;
    public static final int DOC_TYPE_ID3 = 3;
    public static final int DOC_TYPE_UNSPECIFIED = 0;
    private static final String MRZ_CHARS = "<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final long serialVersionUID = 7054965914471297804L;
    private char compositeCheckDigit;
    private String dateOfBirth;
    private char dateOfBirthCheckDigit;
    private String dateOfExpiry;
    private char dateOfExpiryCheckDigit;
    private String documentCode;
    private String documentNumber;
    private char documentNumberCheckDigit;
    private DocumentType documentType;
    private Gender gender;
    private String issuingState;
    private String nationality;
    private String optionalData1;
    private String optionalData2;
    private String primaryIdentifier;
    private String secondaryIdentifier;

    /* renamed from: org.jmrtd.lds.icao.MRZInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$sf$scuba$data$Gender;
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType;

        static {
            int[] iArr = new int[Gender.values().length];
            $SwitchMap$net$sf$scuba$data$Gender = iArr;
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$sf$scuba$data$Gender[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DocumentType.values().length];
            $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType = iArr2;
            try {
                iArr2[DocumentType.TD1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.TD2.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.MRVB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.MRVA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[DocumentType.TD3.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum DocumentType {
        UNKNOWN(0),
        TD1(1),
        TD2(2),
        TD3(3),
        MRVA(4),
        MRVB(5);

        private int code;

        DocumentType(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    @Deprecated
    public MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        this(getDocumentTypeFromDocumentCode(str), str, str2, str5, personalNumberToOptionalData(str9), str7, gender, str8, str6, null, str3, str4);
    }

    public static char checkDigit(String str) {
        return checkDigit(str, false);
    }

    public static MRZInfo createMRVAMRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        return new MRZInfo(DocumentType.MRVA, str, str2, str5, str9, str7, gender, str8, str6, null, str3, str4);
    }

    public static MRZInfo createMRVBMRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        return new MRZInfo(DocumentType.MRVB, str, str2, str5, str9, str7, gender, str8, str6, null, str3, str4);
    }

    public static MRZInfo createTD1MRZInfo(String str, String str2, String str3, String str4, String str5, Gender gender, String str6, String str7, String str8, String str9, String str10) {
        return new MRZInfo(DocumentType.TD1, str, str2, str3, str4, str5, gender, str6, str7, str8, str9, str10);
    }

    public static MRZInfo createTD2MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        return new MRZInfo(DocumentType.TD2, str, str2, str5, str9, str7, gender, str8, str6, null, str3, str4);
    }

    public static MRZInfo createTD3MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9) {
        return new MRZInfo(DocumentType.TD3, str, str2, str5, personalNumberToOptionalData(str9), str7, gender, str8, str6, null, str3, str4);
    }

    private static int decodeMRZDigit(byte b9) {
        if (b9 == 60) {
            return 0;
        }
        switch (b9) {
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 5;
            case 54:
                return 6;
            case 55:
                return 7;
            case 56:
                return 8;
            case 57:
                return 9;
            default:
                switch (b9) {
                    case 65:
                        return 10;
                    case 66:
                        return 11;
                    case 67:
                        return 12;
                    case 68:
                        return 13;
                    case 69:
                        return 14;
                    case 70:
                        return 15;
                    case 71:
                        return 16;
                    case 72:
                        return 17;
                    case 73:
                        return 18;
                    case 74:
                        return 19;
                    case 75:
                        return 20;
                    case 76:
                        return 21;
                    case 77:
                        return 22;
                    case 78:
                        return 23;
                    case 79:
                        return 24;
                    case 80:
                        return 25;
                    case 81:
                        return 26;
                    case 82:
                        return 27;
                    case 83:
                        return 28;
                    case 84:
                        return 29;
                    case 85:
                        return 30;
                    case 86:
                        return 31;
                    case 87:
                        return 32;
                    case 88:
                        return 33;
                    case 89:
                        return 34;
                    case 90:
                        return 35;
                    default:
                        switch (b9) {
                            case 97:
                                return 10;
                            case 98:
                                return 11;
                            case 99:
                                return 12;
                            case 100:
                                return 13;
                            case 101:
                                return 14;
                            case 102:
                                return 15;
                            case 103:
                                return 16;
                            case 104:
                                return 17;
                            case 105:
                                return 18;
                            case 106:
                                return 19;
                            case 107:
                                return 20;
                            case 108:
                                return 21;
                            case 109:
                                return 22;
                            case 110:
                                return 23;
                            case 111:
                                return 24;
                            case 112:
                                return 25;
                            case 113:
                                return 26;
                            case 114:
                                return 27;
                            case 115:
                                return 28;
                            case 116:
                                return 29;
                            case 117:
                                return 30;
                            case 118:
                                return 31;
                            case 119:
                                return 32;
                            case 120:
                                return 33;
                            case 121:
                                return 34;
                            case 122:
                                return 35;
                            default:
                                StringBuilder l10 = a.l("Could not decode MRZ character ", b9, " ('");
                                l10.append(Character.toString((char) b9));
                                l10.append("')");
                                throw new NumberFormatException(l10.toString());
                        }
                }
        }
    }

    public static boolean equalsModuloFillerChars(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int max = Math.max(str.length(), str2.length());
        return mrzFormat(str, max).equals(mrzFormat(str2, max));
    }

    private static String genderToString(Gender gender) {
        int i = AnonymousClass1.$SwitchMap$net$sf$scuba$data$Gender[gender.ordinal()];
        return i != 1 ? i != 2 ? "<" : "F" : "M";
    }

    private String getComposite(DocumentType documentType) {
        StringBuilder sb2 = new StringBuilder();
        int length = this.documentNumber.length();
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1) {
            if (length <= 9) {
                sb2.append(mrzFormat(this.documentNumber, 9));
                sb2.append(this.documentNumberCheckDigit);
                sb2.append(mrzFormat(this.optionalData1, 15));
            } else {
                sb2.append(this.documentNumber.substring(0, 9));
                sb2.append("<");
                String substring = this.documentNumber.substring(9);
                sb2.append(substring);
                sb2.append(this.documentNumberCheckDigit);
                String substring2 = mrzFormat(this.optionalData1, 15).substring(substring.length() + 1);
                sb2.append(mrzFormat(substring2, substring2.length()));
            }
            sb2.append(this.dateOfBirth);
            sb2.append(this.dateOfBirthCheckDigit);
            sb2.append(this.dateOfExpiry);
            sb2.append(this.dateOfExpiryCheckDigit);
            sb2.append(mrzFormat(this.optionalData2, 11));
            return sb2.toString();
        }
        if (i == 2 || i == 3) {
            sb2.append(this.documentNumber);
            sb2.append(this.documentNumberCheckDigit);
            sb2.append(this.dateOfBirth);
            sb2.append(this.dateOfBirthCheckDigit);
            sb2.append(this.dateOfExpiry);
            sb2.append(this.dateOfExpiryCheckDigit);
            sb2.append(mrzFormat(this.optionalData1, 7));
            return sb2.toString();
        }
        if (i != 4 && i != 5) {
            throw new IllegalStateException("Unsupported document type");
        }
        sb2.append(this.documentNumber);
        sb2.append(this.documentNumberCheckDigit);
        sb2.append(this.dateOfBirth);
        sb2.append(this.dateOfBirthCheckDigit);
        sb2.append(this.dateOfExpiry);
        sb2.append(this.dateOfExpiryCheckDigit);
        sb2.append(mrzFormat(this.optionalData1, 15));
        return sb2.toString();
    }

    private static DocumentType getDocumentTypeFromDocumentCode(String str) {
        return (str.startsWith("A") || str.startsWith("C") || str.startsWith("I")) ? DocumentType.TD1 : str.startsWith("V") ? DocumentType.MRVB : str.startsWith("P") ? DocumentType.TD3 : DocumentType.UNKNOWN;
    }

    private static boolean isDocumentCodeConsistentWithDocumentType(DocumentType documentType, String str) {
        if (str == null) {
            return false;
        }
        if (str.length() != 1 && str.length() != 2) {
            return false;
        }
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1 || i == 2) {
            return str.startsWith("C") || str.startsWith("I") || str.startsWith("A");
        }
        if (i == 3 || i == 4) {
            return str.startsWith("V");
        }
        if (i != 5) {
            return false;
        }
        return str.startsWith("P");
    }

    private static boolean isOptionalDataConsistentWithDocumentType(DocumentType documentType, String str, String str2) {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i == 1) {
            if (str == null || str.length() <= 15) {
                return str2 == null || str2.length() <= 11;
            }
            return false;
        }
        if (i == 2) {
            return (str == null || str.length() <= 7) && str2 == null;
        }
        if (i == 3) {
            return (str == null || str.length() <= 8) && str2 == null;
        }
        if (i == 4) {
            return (str == null || str.length() <= 16) && str2 == null;
        }
        if (i != 5) {
            return false;
        }
        return (str == null || str.length() <= 15) && str2 == null;
    }

    private static String mrzFormat(String str, int i) {
        if (str == null) {
            return "";
        }
        if (str.length() > i) {
            throw new IllegalArgumentException("Argument too wide (" + str.length() + " > " + i + ")");
        }
        String trim = str.toUpperCase().trim();
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < trim.length(); i9++) {
            char charAt = trim.charAt(i9);
            if (MRZ_CHARS.indexOf(charAt) == -1) {
                sb2.append('<');
            } else {
                sb2.append(charAt);
            }
        }
        while (sb2.length() < i) {
            sb2.append("<");
        }
        return sb2.toString();
    }

    private static String nameToString(String str, String str2, int i) {
        String[] split = str.split(" |<");
        String[] split2 = (str2 == null || str2.trim().isEmpty()) ? new String[0] : str2.split(" |<");
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        boolean z11 = true;
        for (String str3 : split) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append('<');
            }
            sb2.append(str3);
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            sb2.append("<<");
            for (String str4 : split2) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append('<');
                }
                sb2.append(str4);
            }
        }
        return mrzFormat(sb2.toString(), i);
    }

    private static String personalNumberToOptionalData(String str) {
        if (str == null || equalsModuloFillerChars(str, "")) {
            return "";
        }
        if (str.length() == 15) {
            return str;
        }
        if (str.length() > 14) {
            throw new IllegalArgumentException("Wrong personal number: ".concat(str));
        }
        return mrzFormat(str, 14) + checkDigit(str, true);
    }

    private String readCountry(DataInputStream dataInputStream) {
        return readString(dataInputStream, 3);
    }

    private String readDateOfBirth(DataInputStream dataInputStream) {
        return readString(dataInputStream, 6);
    }

    private String readDateOfExpiry(DataInputStream dataInputStream) {
        return readString(dataInputStream, 6);
    }

    private Gender readGender(DataInputStream dataInputStream) {
        String readString = readString(dataInputStream, 1);
        return "M".equalsIgnoreCase(readString) ? Gender.MALE : "F".equalsIgnoreCase(readString) ? Gender.FEMALE : Gender.UNKNOWN;
    }

    private void readNameIdentifiers(String str) {
        int indexOf = str.indexOf("<<");
        if (indexOf < 0) {
            this.primaryIdentifier = trimTrailingFillerChars(str).replace("<", " ");
            this.secondaryIdentifier = "";
        } else {
            this.primaryIdentifier = trimTrailingFillerChars(str.substring(0, indexOf)).replace("<", " ");
            readSecondaryIdentifiers(str.substring(indexOf + 2));
        }
    }

    private void readObject(InputStream inputStream, int i) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        String trimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 2));
        this.documentCode = trimTrailingFillerChars;
        DocumentType documentType = getDocumentType(trimTrailingFillerChars, i);
        this.documentType = documentType;
        int i9 = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[documentType.ordinal()];
        if (i9 == 1) {
            readObjectTD1(dataInputStream);
        } else if (i9 == 2 || i9 == 3) {
            readObjectTD2orMRVB(dataInputStream);
        } else {
            readObjectTD3OrMRVA(dataInputStream);
        }
    }

    private void readObjectTD1(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountry(dataInputStream);
        this.documentNumber = readString(dataInputStream, 9);
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        String trimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 15));
        this.optionalData1 = trimTrailingFillerChars;
        if (this.documentNumberCheckDigit == '<' && !trimTrailingFillerChars.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.documentNumber);
            sb2.append(this.optionalData1.substring(0, r1.length() - 1));
            this.documentNumber = sb2.toString();
            this.documentNumberCheckDigit = this.optionalData1.charAt(r0.length() - 1);
            this.optionalData1 = "";
        }
        this.documentNumber = trimTrailingFillerChars(this.documentNumber);
        this.dateOfBirth = readDateOfBirth(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readGender(dataInputStream);
        this.dateOfExpiry = readDateOfExpiry(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountry(dataInputStream);
        this.optionalData2 = readString(dataInputStream, 11);
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
        readNameIdentifiers(readString(dataInputStream, 30));
    }

    private void readObjectTD2orMRVB(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountry(dataInputStream);
        readNameIdentifiers(readString(dataInputStream, 31));
        this.documentNumber = trimTrailingFillerChars(readString(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountry(dataInputStream);
        this.dateOfBirth = readDateOfBirth(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readGender(dataInputStream);
        this.dateOfExpiry = readDateOfExpiry(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        String trimTrailingFillerChars = trimTrailingFillerChars(readString(dataInputStream, 7));
        this.optionalData1 = trimTrailingFillerChars;
        if (this.documentType == DocumentType.TD2 && this.documentNumberCheckDigit == '<' && !trimTrailingFillerChars.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.documentNumber);
            sb2.append(this.optionalData1.substring(0, r1.length() - 1));
            this.documentNumber = sb2.toString();
            this.documentNumberCheckDigit = this.optionalData1.charAt(r0.length() - 1);
            this.optionalData1 = "";
        }
        this.documentNumber = trimTrailingFillerChars(this.documentNumber);
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
    }

    private void readObjectTD3OrMRVA(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.issuingState = readCountry(dataInputStream);
        readNameIdentifiers(readString(dataInputStream, 39));
        this.documentNumber = trimTrailingFillerChars(readString(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountry(dataInputStream);
        this.dateOfBirth = readDateOfBirth(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readGender(dataInputStream);
        this.dateOfExpiry = readDateOfExpiry(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.optionalData1 = trimTrailingFillerChars(readString(dataInputStream, 15));
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
    }

    private void readSecondaryIdentifiers(String str) {
        this.secondaryIdentifier = trimTrailingFillerChars(str).replace("<", " ");
    }

    private String readString(DataInputStream dataInputStream, int i) {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr).trim();
    }

    private static String trimTrailingFillerChars(String str) {
        byte[] bytes = str.trim().getBytes();
        for (int length = bytes.length - 1; length >= 0 && bytes[length] == 60; length--) {
            bytes[length] = ISO7816.INS_VERIFY;
        }
        return new String(bytes).trim();
    }

    private void writeDateOfBirth(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.dateOfBirth.getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeDateOfExpiry(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.dateOfExpiry.getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeDocumentType(DataOutputStream dataOutputStream) {
        writeString(this.documentCode, dataOutputStream, 2);
    }

    private void writeGender(DataOutputStream dataOutputStream) {
        dataOutputStream.write(genderToString(this.gender).getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeIssuingState(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.issuingState.getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeName(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.write(nameToString(this.primaryIdentifier, this.secondaryIdentifier, i).getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeNationality(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.nationality.getBytes(Key.STRING_CHARSET_NAME));
    }

    private void writeObjectTD1(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeIssuingState(dataOutputStream);
        if (this.documentNumber.length() <= 9 || !equalsModuloFillerChars(this.optionalData1, "")) {
            writeString(this.documentNumber, dataOutputStream, 9);
            dataOutputStream.write(this.documentNumberCheckDigit);
            writeString(this.optionalData1, dataOutputStream, 15);
        } else {
            writeString(this.documentNumber.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
            StringBuilder sb2 = new StringBuilder();
            String str = this.documentNumber;
            sb2.append(str.substring(9, str.length()));
            sb2.append(this.documentNumberCheckDigit);
            sb2.append("<");
            writeString(sb2.toString(), dataOutputStream, 15);
        }
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        writeNationality(dataOutputStream);
        writeString(this.optionalData2, dataOutputStream, 11);
        dataOutputStream.write(this.compositeCheckDigit);
        writeName(dataOutputStream, 30);
    }

    private void writeObjectTD2OrMRVB(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeIssuingState(dataOutputStream);
        writeName(dataOutputStream, 31);
        boolean z10 = this.documentType == DocumentType.TD2 && this.documentNumber.length() > 9 && equalsModuloFillerChars(this.optionalData1, "");
        if (z10) {
            writeString(this.documentNumber.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
        } else {
            writeString(this.documentNumber, dataOutputStream, 9);
            dataOutputStream.write(this.documentNumberCheckDigit);
        }
        writeNationality(dataOutputStream);
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        if (this.documentType == DocumentType.MRVB) {
            writeString(this.optionalData1, dataOutputStream, 8);
            return;
        }
        if (!z10) {
            writeString(this.optionalData1, dataOutputStream, 7);
            dataOutputStream.write(this.compositeCheckDigit);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = this.documentNumber;
        sb2.append(str.substring(9, str.length()));
        sb2.append(this.documentNumberCheckDigit);
        sb2.append("<");
        writeString(sb2.toString(), dataOutputStream, 7);
        dataOutputStream.write(this.compositeCheckDigit);
    }

    private void writeObjectTD3OrMRVA(OutputStream outputStream) {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        writeIssuingState(dataOutputStream);
        writeName(dataOutputStream, 39);
        writeString(this.documentNumber, dataOutputStream, 9);
        dataOutputStream.write(this.documentNumberCheckDigit);
        writeNationality(dataOutputStream);
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        if (this.documentType == DocumentType.MRVA) {
            writeString(this.optionalData1, dataOutputStream, 16);
        } else {
            writeString(this.optionalData1, dataOutputStream, 15);
            dataOutputStream.write(this.compositeCheckDigit);
        }
    }

    private void writeString(String str, DataOutputStream dataOutputStream, int i) {
        dataOutputStream.write(mrzFormat(str, i).getBytes(Key.STRING_CHARSET_NAME));
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        MRZInfo mRZInfo = (MRZInfo) obj;
        String str = this.documentCode;
        if (!(str == null && mRZInfo.documentCode == null) && (str == null || !str.equals(mRZInfo.documentCode))) {
            return false;
        }
        String str2 = this.issuingState;
        if (!(str2 == null && mRZInfo.issuingState == null) && (str2 == null || !str2.equals(mRZInfo.issuingState))) {
            return false;
        }
        String str3 = this.primaryIdentifier;
        if (!(str3 == null && mRZInfo.primaryIdentifier == null) && (str3 == null || !str3.equals(mRZInfo.primaryIdentifier))) {
            return false;
        }
        String str4 = this.secondaryIdentifier;
        if ((str4 != null || mRZInfo.secondaryIdentifier != null) && !equalsModuloFillerChars(str4, mRZInfo.secondaryIdentifier)) {
            return false;
        }
        String str5 = this.nationality;
        if (!(str5 == null && mRZInfo.nationality == null) && (str5 == null || !str5.equals(mRZInfo.nationality))) {
            return false;
        }
        String str6 = this.documentNumber;
        if (!(str6 == null && mRZInfo.documentNumber == null) && (str6 == null || !str6.equals(mRZInfo.documentNumber))) {
            return false;
        }
        String str7 = this.optionalData1;
        if (!(str7 == null && mRZInfo.optionalData1 == null) && ((str7 == null || !str7.equals(mRZInfo.optionalData1)) && !getPersonalNumber().equals(mRZInfo.getPersonalNumber()))) {
            return false;
        }
        String str8 = this.dateOfBirth;
        if (!(str8 == null && mRZInfo.dateOfBirth == null) && (str8 == null || !str8.equals(mRZInfo.dateOfBirth))) {
            return false;
        }
        Gender gender = this.gender;
        if (!(gender == null && mRZInfo.gender == null) && (gender == null || !gender.equals(mRZInfo.gender))) {
            return false;
        }
        String str9 = this.dateOfExpiry;
        if (!(str9 == null && mRZInfo.dateOfExpiry == null) && (str9 == null || !str9.equals(mRZInfo.dateOfExpiry))) {
            return false;
        }
        String str10 = this.optionalData2;
        return (str10 == null && mRZInfo.optionalData2 == null) || (str10 != null && equalsModuloFillerChars(str10, mRZInfo.optionalData2));
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public String getDocumentCode() {
        return this.documentCode;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    @Deprecated
    public int getDocumentType() {
        return this.documentType.getCode();
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getIssuingState() {
        return this.issuingState;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getOptionalData1() {
        return this.optionalData1;
    }

    public String getOptionalData2() {
        return this.optionalData2;
    }

    public String getPersonalNumber() {
        String str = this.optionalData1;
        if (str == null) {
            return null;
        }
        return str.length() > 14 ? trimTrailingFillerChars(this.optionalData1.substring(0, 14)) : trimTrailingFillerChars(this.optionalData1);
    }

    public String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    public String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    public String[] getSecondaryIdentifierComponents() {
        return this.secondaryIdentifier.split(" |<");
    }

    public int hashCode() {
        return (toString().hashCode() * 2) + 53;
    }

    @Deprecated
    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
        checkDigit();
    }

    @Deprecated
    public void setDateOfExpiry(String str) {
        this.dateOfExpiry = str;
        checkDigit();
    }

    @Deprecated
    public void setDocumentCode(String str) {
        this.documentCode = str;
        DocumentType documentTypeFromDocumentCode = getDocumentTypeFromDocumentCode(str);
        this.documentType = documentTypeFromDocumentCode;
        if (documentTypeFromDocumentCode == DocumentType.TD1 && this.optionalData2 == null) {
            this.optionalData2 = "";
        }
    }

    @Deprecated
    public void setDocumentNumber(String str) {
        this.documentNumber = str.trim();
        checkDigit();
    }

    @Deprecated
    public void setGender(Gender gender) {
        this.gender = gender;
        checkDigit();
    }

    @Deprecated
    public void setIssuingState(String str) {
        this.issuingState = str;
        checkDigit();
    }

    @Deprecated
    public void setNationality(String str) {
        this.nationality = str;
        checkDigit();
    }

    @Deprecated
    public void setOptionalData2(String str) {
        this.optionalData2 = trimTrailingFillerChars(str);
        checkDigit();
    }

    @Deprecated
    public void setPersonalNumber(String str) {
        if (str == null || str.length() > 14) {
            throw new IllegalArgumentException("Wrong personal number");
        }
        this.optionalData1 = mrzFormat(str, 14) + checkDigit(str, true);
    }

    @Deprecated
    public void setPrimaryIdentifier(String str) {
        this.primaryIdentifier = str.trim();
        checkDigit();
    }

    @Deprecated
    public void setSecondaryIdentifierComponents(String[] strArr) {
        if (strArr == null) {
            this.secondaryIdentifier = null;
        } else {
            for (String str : strArr) {
            }
        }
        checkDigit();
    }

    @Deprecated
    public void setSecondaryIdentifiers(String str) {
        readSecondaryIdentifiers(str.trim());
        checkDigit();
    }

    public String toString() {
        try {
            String str = new String(getEncoded(), Key.STRING_CHARSET_NAME);
            int length = str.length();
            if (length == 72) {
                return str.substring(0, 36) + "\n" + str.substring(36, 72) + "\n";
            }
            if (length == 88) {
                return str.substring(0, 44) + "\n" + str.substring(44, 88) + "\n";
            }
            if (length != 90) {
                return str;
            }
            return str.substring(0, 30) + "\n" + str.substring(30, 60) + "\n" + str.substring(60, 90) + "\n";
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // org.jmrtd.lds.AbstractLDSInfo
    public void writeObject(OutputStream outputStream) {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$icao$MRZInfo$DocumentType[this.documentType.ordinal()];
        if (i == 1) {
            writeObjectTD1(outputStream);
            return;
        }
        if (i == 2 || i == 3) {
            writeObjectTD2OrMRVB(outputStream);
        } else {
            if (i != 4 && i != 5) {
                throw new IllegalStateException("Unsupported document type ");
            }
            writeObjectTD3OrMRVA(outputStream);
        }
    }

    private void checkDigit() {
        this.documentNumberCheckDigit = checkDigit(this.documentNumber);
        this.dateOfBirthCheckDigit = checkDigit(this.dateOfBirth);
        this.dateOfExpiryCheckDigit = checkDigit(this.dateOfExpiry);
        if (this.documentType == DocumentType.TD3 && this.optionalData1.length() < 15) {
            this.optionalData1 = mrzFormat(this.optionalData1, 14) + checkDigit(mrzFormat(this.optionalData1, 14), true);
        }
        this.compositeCheckDigit = checkDigit(getComposite(this.documentType));
    }

    private static DocumentType getDocumentType(String str, int i) {
        if (str == null || str.length() < 1 || str.length() > 2) {
            throw new IllegalArgumentException(b.j("Was expecting 1 or 2 digit document code, got ", str));
        }
        return i != 72 ? i != 88 ? i != 90 ? DocumentType.UNKNOWN : DocumentType.TD1 : str.startsWith("V") ? DocumentType.MRVA : DocumentType.TD3 : str.startsWith("V") ? DocumentType.MRVB : DocumentType.TD2;
    }

    @Deprecated
    public MRZInfo(String str, String str2, String str3, String str4, String str5, Gender gender, String str6, String str7, String str8, String str9, String str10) {
        this(getDocumentTypeFromDocumentCode(str), str, str2, str3, str4, str5, gender, str6, str7, str8, str9, str10);
    }

    public MRZInfo(InputStream inputStream, int i) {
        try {
            readObject(inputStream, i);
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public MRZInfo(String str) {
        if (str != null) {
            String replace = str.trim().replace("\n", "");
            try {
                readObject(new ByteArrayInputStream(replace.getBytes(Key.STRING_CHARSET_NAME)), replace.length());
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException("Exception", e10);
            } catch (IOException e11) {
                throw new IllegalArgumentException("Exception", e11);
            }
        }
        throw new IllegalArgumentException("Null string");
    }

    private static char checkDigit(String str, boolean z10) {
        try {
            byte[] bytes = str == null ? new byte[0] : str.getBytes(Key.STRING_CHARSET_NAME);
            int[] iArr = {7, 3, 1};
            int i = 0;
            for (int i9 = 0; i9 < bytes.length; i9++) {
                i = ((iArr[i9 % 3] * decodeMRZDigit(bytes[i9])) + i) % 10;
            }
            String num = Integer.toString(i);
            if (num.length() == 1) {
                char c2 = (char) num.getBytes(Key.STRING_CHARSET_NAME)[0];
                if (z10 && c2 == '0') {
                    return '<';
                }
                return c2;
            }
            throw new IllegalStateException("Error in computing check digit.");
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Error in computing check digit", e10);
        } catch (NumberFormatException e11) {
            throw new IllegalStateException("Error in computing check digit", e11);
        } catch (Exception e12) {
            throw new IllegalArgumentException("Error in computing check digit", e12);
        }
    }

    private MRZInfo(DocumentType documentType, String str, String str2, String str3, String str4, String str5, Gender gender, String str6, String str7, String str8, String str9, String str10) {
        this.documentType = documentType;
        if (isDocumentCodeConsistentWithDocumentType(documentType, str)) {
            if (!isOptionalDataConsistentWithDocumentType(documentType, str4, str8)) {
                throw new IllegalArgumentException("Wrong optional data length");
            }
            if (gender != null) {
                this.documentCode = trimTrailingFillerChars(str);
                this.issuingState = str2;
                this.primaryIdentifier = str9;
                this.secondaryIdentifier = str10;
                this.documentNumber = trimTrailingFillerChars(str3);
                this.nationality = str7;
                this.dateOfBirth = str5;
                this.gender = gender;
                this.dateOfExpiry = str6;
                this.optionalData1 = str4 == null ? "" : str4;
                this.optionalData2 = str8;
                checkDigit();
                return;
            }
            throw new IllegalArgumentException("Gender must not be null");
        }
        throw new IllegalArgumentException("Wrong document code");
    }
}
