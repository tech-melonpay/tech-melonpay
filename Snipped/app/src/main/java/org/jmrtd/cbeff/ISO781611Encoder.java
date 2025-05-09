package org.jmrtd.cbeff;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;

/* loaded from: classes3.dex */
public class ISO781611Encoder<B extends BiometricDataBlock> implements ISO781611 {
    private BiometricDataBlockEncoder<B> bdbEncoder;

    public ISO781611Encoder(BiometricDataBlockEncoder<B> biometricDataBlockEncoder) {
        this.bdbEncoder = biometricDataBlockEncoder;
    }

    private void writeBHT(TLVOutputStream tLVOutputStream, int i, SimpleCBEFFInfo<B> simpleCBEFFInfo) {
        tLVOutputStream.writeTag(161);
        for (Map.Entry<Integer, byte[]> entry : simpleCBEFFInfo.getBiometricDataBlock().getStandardBiometricHeader().getElements().entrySet()) {
            tLVOutputStream.writeTag(entry.getKey().intValue());
            tLVOutputStream.writeValue(entry.getValue());
        }
        tLVOutputStream.writeValueEnd();
    }

    private void writeBIT(TLVOutputStream tLVOutputStream, int i, SimpleCBEFFInfo<B> simpleCBEFFInfo) {
        tLVOutputStream.writeTag(ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG);
        writeBHT(tLVOutputStream, i, simpleCBEFFInfo);
        writeBiometricDataBlock(tLVOutputStream, simpleCBEFFInfo.getBiometricDataBlock());
        tLVOutputStream.writeValueEnd();
    }

    private void writeBITGroup(List<CBEFFInfo> list, OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(ISO781611.BIOMETRIC_INFORMATION_GROUP_TEMPLATE_TAG);
        tLVOutputStream.writeTag(2);
        int size = list.size();
        tLVOutputStream.writeValue(new byte[]{(byte) size});
        for (int i = 0; i < size; i++) {
            writeBIT(tLVOutputStream, i, (SimpleCBEFFInfo) list.get(i));
        }
        tLVOutputStream.writeValueEnd();
    }

    private void writeBiometricDataBlock(TLVOutputStream tLVOutputStream, B b9) {
        tLVOutputStream.writeTag(ISO781611.BIOMETRIC_DATA_BLOCK_TAG);
        this.bdbEncoder.encode(b9, tLVOutputStream);
        tLVOutputStream.writeValueEnd();
    }

    public void encode(CBEFFInfo cBEFFInfo, OutputStream outputStream) {
        if (cBEFFInfo instanceof SimpleCBEFFInfo) {
            writeBITGroup(Arrays.asList(cBEFFInfo), outputStream);
        } else if (cBEFFInfo instanceof ComplexCBEFFInfo) {
            writeBITGroup(((ComplexCBEFFInfo) cBEFFInfo).getSubRecords(), outputStream);
        }
    }
}
