package org.bouncycastle.cms;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;

/* loaded from: classes2.dex */
public class CMSProcessableFile implements CMSTypedData, CMSReadable {
    private static final int DEFAULT_BUF_SIZE = 32768;
    private final byte[] buf;
    private final File file;
    private final ASN1ObjectIdentifier type;

    public CMSProcessableFile(File file) {
        this(file, 32768);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.file;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        return new BufferedInputStream(new FileInputStream(this.file), 32768);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            byte[] bArr = this.buf;
            int read = fileInputStream.read(bArr, 0, bArr.length);
            if (read <= 0) {
                fileInputStream.close();
                return;
            }
            outputStream.write(this.buf, 0, read);
        }
    }

    public CMSProcessableFile(File file, int i) {
        this(CMSObjectIdentifiers.data, file, i);
    }

    public CMSProcessableFile(ASN1ObjectIdentifier aSN1ObjectIdentifier, File file, int i) {
        this.type = aSN1ObjectIdentifier;
        this.file = file;
        this.buf = new byte[i];
    }
}
