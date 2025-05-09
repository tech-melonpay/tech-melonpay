package net.sf.scuba.smartcards;

/* loaded from: classes2.dex */
public abstract class AbstractFileSystemStructured implements FileSystemStructured {
    public static final short MF_ID = 16128;
    private ISOFileInfo fileInfo;
    private int length;

    /* renamed from: p2, reason: collision with root package name */
    private int f24315p2;
    private int selectLe;
    private short selectedFID;
    private CardService service;

    public AbstractFileSystemStructured(CardService cardService) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.f24315p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
    }

    private CommandAPDU createSelectFileAPDU(int i, int i9, byte[] bArr, int i10) {
        return i10 == 0 ? new CommandAPDU(0, -92, i, i9, bArr) : new CommandAPDU(0, -92, i, i9, bArr, i10);
    }

    private void selectFile(byte[] bArr, int i) {
        ResponseAPDU transmit = this.service.transmit(createSelectFileAPDU(i, this.f24315p2, bArr, this.selectLe));
        int sw = transmit.getSW();
        byte[] data = transmit.getData();
        if (sw != -28672) {
            throw new CardServiceException("File could not be selected.", sw);
        }
        ISOFileInfo iSOFileInfo = new ISOFileInfo(data);
        this.fileInfo = iSOFileInfo;
        short s10 = iSOFileInfo.fid;
        if (s10 != -1) {
            this.selectedFID = s10;
        }
        int i9 = iSOFileInfo.fileLength;
        if (i9 != -1) {
            this.length = i9;
        }
    }

    public int getFileLength() {
        return this.length;
    }

    public short getSelectedFID() {
        return this.selectedFID;
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public abstract byte[] readBinary(int i, int i9);

    public void selectAID(byte[] bArr) {
        selectFile(bArr, 4);
    }

    public void selectDFRelative(short s10) {
        selectFile(s10, 1);
    }

    public void selectEFRelative(short s10) {
        selectFile(s10, 2);
    }

    public void selectMF() {
        selectFile((short) 0, 0);
    }

    public void selectParent() {
        selectFile((short) 0, 3);
    }

    public void selectPath(byte[] bArr) {
        selectFile(bArr, 8);
    }

    public void selectPathRelative(byte[] bArr) {
        selectFile(bArr, 9);
    }

    public AbstractFileSystemStructured(CardService cardService, boolean z10) {
        this.selectedFID = (short) 0;
        this.length = -1;
        this.f24315p2 = 0;
        this.selectLe = 256;
        this.fileInfo = null;
        this.service = cardService;
        this.f24315p2 = z10 ? 0 : 12;
        this.selectLe = z10 ? 256 : 0;
    }

    private void selectFile(short s10, int i) {
        selectFile(s10 == 0 ? new byte[0] : new byte[]{(byte) ((s10 >> 8) & 255), (byte) (s10 & 255)}, i);
    }

    @Override // net.sf.scuba.smartcards.FileSystemStructured
    public void selectFile(short s10) {
        selectFile(s10, 0);
    }
}
