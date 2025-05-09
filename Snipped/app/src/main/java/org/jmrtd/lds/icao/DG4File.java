package org.jmrtd.lds.icao;

import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.BiometricDataBlockDecoder;
import org.jmrtd.cbeff.BiometricDataBlockEncoder;
import org.jmrtd.cbeff.CBEFFInfo;
import org.jmrtd.cbeff.ComplexCBEFFInfo;
import org.jmrtd.cbeff.ISO781611Decoder;
import org.jmrtd.cbeff.ISO781611Encoder;
import org.jmrtd.cbeff.SimpleCBEFFInfo;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.CBEFFDataGroup;
import org.jmrtd.lds.iso19794.IrisInfo;

/* loaded from: classes3.dex */
public class DG4File extends CBEFFDataGroup<IrisInfo> {
    private static final ISO781611Decoder DECODER = new ISO781611Decoder(new BiometricDataBlockDecoder<IrisInfo>() { // from class: org.jmrtd.lds.icao.DG4File.1
        @Override // org.jmrtd.cbeff.BiometricDataBlockDecoder
        public IrisInfo decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i9) {
            return new IrisInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final ISO781611Encoder<IrisInfo> ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<IrisInfo>() { // from class: org.jmrtd.lds.icao.DG4File.2
        @Override // org.jmrtd.cbeff.BiometricDataBlockEncoder
        public void encode(IrisInfo irisInfo, OutputStream outputStream) {
            irisInfo.writeObject(outputStream);
        }
    });
    private static final long serialVersionUID = -1290365855823447586L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG4File(List<IrisInfo> list) {
        this(list, true);
    }

    public void addIrisInfo(IrisInfo irisInfo) {
        add(irisInfo);
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.shouldAddRandomDataIfEmpty == ((DG4File) obj).shouldAddRandomDataIfEmpty;
    }

    public List<IrisInfo> getIrisInfos() {
        return getSubRecords();
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup
    public int hashCode() {
        return (super.hashCode() * 31) + (this.shouldAddRandomDataIfEmpty ? 1231 : 1237);
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        for (CBEFFInfo cBEFFInfo : DECODER.decode(inputStream).getSubRecords()) {
            if (!(cBEFFInfo instanceof SimpleCBEFFInfo)) {
                throw new IOException("Was expecting a SimpleCBEFFInfo, found ".concat(cBEFFInfo.getClass().getSimpleName()));
            }
            BiometricDataBlock biometricDataBlock = ((SimpleCBEFFInfo) cBEFFInfo).getBiometricDataBlock();
            if (!(biometricDataBlock instanceof IrisInfo)) {
                throw new IOException("Was expecting an IrisInfo, found ".concat(biometricDataBlock.getClass().getSimpleName()));
            }
            add((IrisInfo) biometricDataBlock);
        }
    }

    public void removeIrisInfo(int i) {
        remove(i);
    }

    @Override // org.jmrtd.lds.CBEFFDataGroup, org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        return a.n(new StringBuilder("DG4File ["), super.toString(), "]");
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        Iterator<IrisInfo> it = getSubRecords().iterator();
        while (it.hasNext()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo(it.next()));
        }
        ENCODER.encode(complexCBEFFInfo, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            writeOptionalRandomData(outputStream);
        }
    }

    public DG4File(List<IrisInfo> list, boolean z10) {
        super(118, list);
        this.shouldAddRandomDataIfEmpty = z10;
    }

    public DG4File(InputStream inputStream) {
        super(118, inputStream);
    }
}
