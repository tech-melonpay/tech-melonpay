package org.jmrtd.lds.icao;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.lds.AbstractTaggedLDSFile;
import org.jmrtd.lds.LDSFileUtil;

/* loaded from: classes3.dex */
public class COMFile extends AbstractTaggedLDSFile {
    private static final int TAG_LIST_TAG = 92;
    private static final int VERSION_LDS_TAG = 24321;
    private static final int VERSION_UNICODE_TAG = 24374;
    private static final long serialVersionUID = 2002455279067170063L;
    private String majorVersionUnicode;
    private String minorVersionUnicode;
    private String releaseLevelUnicode;
    private List<Integer> tagList;
    private String updateLevelLDS;
    private String versionLDS;

    public COMFile(String str, String str2, String str3, String str4, String str5, int[] iArr) {
        super(96);
        initialize(str, str2, str3, str4, str5, iArr);
    }

    private void initialize(String str, String str2, String str3, String str4, String str5, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Null tag list");
        }
        if (str == null || str.length() != 2 || str2 == null || str2.length() != 2 || str3 == null || str3.length() != 2 || str4 == null || str4.length() != 2 || str5 == null || str5.length() != 2) {
            throw new IllegalArgumentException();
        }
        this.versionLDS = str;
        this.updateLevelLDS = str2;
        this.majorVersionUnicode = str3;
        this.minorVersionUnicode = str4;
        this.releaseLevelUnicode = str5;
        this.tagList = new ArrayList(iArr.length);
        for (int i : iArr) {
            this.tagList.add(Integer.valueOf(i));
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        COMFile cOMFile = (COMFile) obj;
        return this.versionLDS.equals(cOMFile.versionLDS) && this.updateLevelLDS.equals(cOMFile.updateLevelLDS) && this.majorVersionUnicode.equals(cOMFile.majorVersionUnicode) && this.minorVersionUnicode.equals(cOMFile.minorVersionUnicode) && this.releaseLevelUnicode.equals(cOMFile.releaseLevelUnicode) && this.tagList.equals(cOMFile.tagList);
    }

    public String getLDSVersion() {
        String str = this.versionLDS + "." + this.updateLevelLDS;
        try {
            return Integer.parseInt(this.versionLDS) + "." + Integer.parseInt(this.updateLevelLDS);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public int[] getTagList() {
        int[] iArr = new int[this.tagList.size()];
        Iterator<Integer> it = this.tagList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public String getUnicodeVersion() {
        String str = this.majorVersionUnicode + "." + this.minorVersionUnicode + "." + this.releaseLevelUnicode;
        try {
            return Integer.parseInt(this.majorVersionUnicode) + "." + Integer.parseInt(this.minorVersionUnicode) + "." + Integer.parseInt(this.releaseLevelUnicode);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public int hashCode() {
        return (this.tagList.hashCode() * 17) + (this.releaseLevelUnicode.hashCode() * 13) + (this.minorVersionUnicode.hashCode() * 11) + (this.majorVersionUnicode.hashCode() * 7) + (this.updateLevelLDS.hashCode() * 5) + (this.versionLDS.hashCode() * 3);
    }

    public void insertTag(Integer num) {
        if (this.tagList.contains(num)) {
            return;
        }
        this.tagList.add(num);
        Collections.sort(this.tagList);
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag != VERSION_LDS_TAG) {
            throw new IllegalArgumentException("Excepected VERSION_LDS_TAG (" + Integer.toHexString(VERSION_LDS_TAG) + "), found " + Integer.toHexString(readTag));
        }
        if (tLVInputStream.readLength() != 4) {
            throw new IllegalArgumentException("Wrong length of LDS version object");
        }
        byte[] readValue = tLVInputStream.readValue();
        this.versionLDS = new String(readValue, 0, 2);
        this.updateLevelLDS = new String(readValue, 2, 2);
        int readTag2 = tLVInputStream.readTag();
        if (readTag2 != VERSION_UNICODE_TAG) {
            throw new IllegalArgumentException("Expected VERSION_UNICODE_TAG (" + Integer.toHexString(VERSION_UNICODE_TAG) + "), found " + Integer.toHexString(readTag2));
        }
        if (tLVInputStream.readLength() != 6) {
            throw new IllegalArgumentException("Wrong length of LDS version object");
        }
        byte[] readValue2 = tLVInputStream.readValue();
        this.majorVersionUnicode = new String(readValue2, 0, 2);
        this.minorVersionUnicode = new String(readValue2, 2, 2);
        this.releaseLevelUnicode = new String(readValue2, 4, 2);
        int readTag3 = tLVInputStream.readTag();
        if (readTag3 != 92) {
            throw new IllegalArgumentException("Expected TAG_LIST_TAG (" + Integer.toHexString(92) + "), found " + Integer.toHexString(readTag3));
        }
        tLVInputStream.readLength();
        byte[] readValue3 = tLVInputStream.readValue();
        this.tagList = new ArrayList();
        for (byte b9 : readValue3) {
            this.tagList.add(Integer.valueOf(b9 & 255));
        }
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        StringBuilder sb2 = new StringBuilder("COMFile ");
        sb2.append("LDS " + this.versionLDS + "." + this.updateLevelLDS);
        sb2.append(", ");
        sb2.append("Unicode " + this.majorVersionUnicode + "." + this.minorVersionUnicode + "." + this.releaseLevelUnicode);
        sb2.append(", [");
        int size = this.tagList.size();
        Iterator<Integer> it = this.tagList.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb2.append("DG" + LDSFileUtil.lookupDataGroupNumberByTag(it.next().intValue()));
            if (i < size - 1) {
                sb2.append(", ");
            }
            i++;
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(VERSION_LDS_TAG);
        tLVOutputStream.writeValue((this.versionLDS + this.updateLevelLDS).getBytes());
        tLVOutputStream.writeTag(VERSION_UNICODE_TAG);
        tLVOutputStream.writeValue((this.majorVersionUnicode + this.minorVersionUnicode + this.releaseLevelUnicode).getBytes());
        tLVOutputStream.writeTag(92);
        tLVOutputStream.writeLength(this.tagList.size());
        Iterator<Integer> it = this.tagList.iterator();
        while (it.hasNext()) {
            tLVOutputStream.write((byte) it.next().intValue());
        }
    }

    public COMFile(String str, String str2, int[] iArr) {
        super(96);
        try {
            if (str == null) {
                throw new IllegalArgumentException("Null versionLDS");
            }
            if (str2 != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
                if (stringTokenizer.countTokens() == 2) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken().trim()));
                    Integer valueOf2 = Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken().trim()));
                    StringTokenizer stringTokenizer2 = new StringTokenizer(str2, ".");
                    if (stringTokenizer2.countTokens() == 3) {
                        initialize(String.format("%02d", valueOf), String.format("%02d", valueOf2), String.format("%02d", Integer.valueOf(Integer.parseInt(stringTokenizer2.nextToken().trim()))), String.format("%02d", Integer.valueOf(Integer.parseInt(stringTokenizer2.nextToken().trim()))), String.format("%02d", Integer.valueOf(Integer.parseInt(stringTokenizer2.nextToken().trim()))), iArr);
                        return;
                    }
                    throw new IllegalArgumentException("Could not parse unicode version. Expecting 3 level version number x.y.z.");
                }
                throw new IllegalArgumentException("Could not parse LDS version. Expecting 2 level version number x.y.");
            }
            throw new IllegalArgumentException("Null versionUnicode");
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Could not parse version number", e10);
        } catch (IllegalFormatConversionException e11) {
            throw new IllegalArgumentException("Could not parse version number", e11);
        }
    }

    public COMFile(InputStream inputStream) {
        super(96, inputStream);
    }
}
